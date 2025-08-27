package org.webrtc.audio;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import java.nio.ByteBuffer;
import org.webrtc.CalledByNative;
import org.webrtc.Logging;
import org.webrtc.ThreadUtils;
import org.webrtc.audio.JavaAudioDeviceModule;

public class WebRtcAudioTrack {
    private static final int AUDIO_TRACK_START = 0;
    private static final int AUDIO_TRACK_STOP = 1;
    private static final long AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS = 2000;
    public static boolean BATCH_TRACK_WRITE_CALLS = false;
    public static int BATCH_TRACK_WRITE_FACTOR = 5;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final int DEFAULT_USAGE = 2;
    private static final String TAG = "WebRtcAudioTrackExternal";
    public static boolean TRACK_LATEINIT = Build.MANUFACTURER.equalsIgnoreCase("samsung");
    private final AudioAttributes audioAttributes;
    private final AudioManager audioManager;
    private AudioTrackThread audioThread;
    /* access modifiers changed from: private */
    public AudioTrack audioTrack;
    /* access modifiers changed from: private */
    public ByteBuffer byteBuffer;
    private final Context context;
    /* access modifiers changed from: private */
    public byte[] emptyBytes;
    private final JavaAudioDeviceModule.AudioTrackErrorCallback errorCallback;
    private int initialBufferSizeInFrames;
    /* access modifiers changed from: private */
    public long nativeAudioTrack;
    /* access modifiers changed from: private */
    public volatile boolean speakerMute;
    private final JavaAudioDeviceModule.AudioTrackStateCallback stateCallback;
    private final ThreadUtils.ThreadChecker threadChecker;
    /* access modifiers changed from: private */
    public boolean useLowLatency;
    private final VolumeLogger volumeLogger;

    public class AudioTrackThread extends Thread {
        private final ByteBuffer aggregatedByteBuffer;
        private LowLatencyAudioBufferManager bufferManager = new LowLatencyAudioBufferManager();
        private volatile boolean keepAlive = true;
        private boolean stopped = true;

        public AudioTrackThread(String str) {
            super(str);
            this.aggregatedByteBuffer = ByteBuffer.allocateDirect(WebRtcAudioTrack.this.byteBuffer.capacity() * WebRtcAudioTrack.BATCH_TRACK_WRITE_FACTOR);
        }

        public void run() {
            Process.setThreadPriority(-19);
            String threadInfo = WebRtcAudioUtils.getThreadInfo();
            Logging.d(WebRtcAudioTrack.TAG, "AudioTrackThread" + threadInfo);
            WebRtcAudioTrack.assertTrue(WebRtcAudioTrack.TRACK_LATEINIT || WebRtcAudioTrack.this.audioTrack.getPlayState() == 3);
            WebRtcAudioTrack.this.doAudioTrackStateCallback(0);
            int capacity = WebRtcAudioTrack.this.byteBuffer.capacity();
            while (this.keepAlive) {
                WebRtcAudioTrack.nativeGetPlayoutData(WebRtcAudioTrack.this.nativeAudioTrack, capacity);
                WebRtcAudioTrack.assertTrue(capacity <= WebRtcAudioTrack.this.byteBuffer.remaining());
                if (WebRtcAudioTrack.this.speakerMute) {
                    WebRtcAudioTrack.this.byteBuffer.clear();
                    WebRtcAudioTrack.this.byteBuffer.put(WebRtcAudioTrack.this.emptyBytes);
                    WebRtcAudioTrack.this.byteBuffer.position(0);
                }
                if (WebRtcAudioTrack.TRACK_LATEINIT && this.stopped) {
                    try {
                        WebRtcAudioTrack.this.audioTrack.play();
                    } catch (IllegalStateException e) {
                        WebRtcAudioTrack webRtcAudioTrack = WebRtcAudioTrack.this;
                        JavaAudioDeviceModule.AudioTrackStartErrorCode audioTrackStartErrorCode = JavaAudioDeviceModule.AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION;
                        String message = e.getMessage();
                        webRtcAudioTrack.reportWebRtcAudioTrackStartError(audioTrackStartErrorCode, "AudioTrack.play failed: " + message);
                    }
                    if (WebRtcAudioTrack.this.audioTrack.getPlayState() != 3) {
                        WebRtcAudioTrack webRtcAudioTrack2 = WebRtcAudioTrack.this;
                        JavaAudioDeviceModule.AudioTrackStartErrorCode audioTrackStartErrorCode2 = JavaAudioDeviceModule.AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH;
                        int playState = webRtcAudioTrack2.audioTrack.getPlayState();
                        webRtcAudioTrack2.reportWebRtcAudioTrackStartError(audioTrackStartErrorCode2, "AudioTrack.play failed - incorrect state :" + playState);
                    } else {
                        this.stopped = false;
                    }
                }
                if (!WebRtcAudioTrack.BATCH_TRACK_WRITE_CALLS) {
                    int write = WebRtcAudioTrack.this.audioTrack.write(WebRtcAudioTrack.this.byteBuffer, capacity, 0);
                    if (write != capacity) {
                        Logging.e(WebRtcAudioTrack.TAG, "AudioTrack.write played invalid number of bytes: " + write);
                        if (write < 0) {
                            this.keepAlive = false;
                            WebRtcAudioTrack webRtcAudioTrack3 = WebRtcAudioTrack.this;
                            webRtcAudioTrack3.reportWebRtcAudioTrackError("AudioTrack.write failed: " + write);
                        }
                    }
                    if (WebRtcAudioTrack.this.useLowLatency) {
                        this.bufferManager.maybeAdjustBufferSize(WebRtcAudioTrack.this.audioTrack);
                    }
                } else {
                    this.aggregatedByteBuffer.put(WebRtcAudioTrack.this.byteBuffer);
                    if (this.aggregatedByteBuffer.position() == WebRtcAudioTrack.this.byteBuffer.capacity() * WebRtcAudioTrack.BATCH_TRACK_WRITE_FACTOR) {
                        this.aggregatedByteBuffer.rewind();
                        AudioTrack a = WebRtcAudioTrack.this.audioTrack;
                        ByteBuffer byteBuffer = this.aggregatedByteBuffer;
                        a.write(byteBuffer, byteBuffer.capacity(), 0);
                        this.aggregatedByteBuffer.rewind();
                    }
                }
                WebRtcAudioTrack.this.byteBuffer.rewind();
            }
        }

        public void stopThread() {
            Logging.d(WebRtcAudioTrack.TAG, "stopThread");
            this.keepAlive = false;
        }
    }

    @CalledByNative
    public WebRtcAudioTrack(Context context2, AudioManager audioManager2) {
        this(context2, audioManager2, (AudioAttributes) null, (JavaAudioDeviceModule.AudioTrackErrorCallback) null, (JavaAudioDeviceModule.AudioTrackStateCallback) null, false, true);
    }

    @CalledByNative
    private int GetPlayoutUnderrunCount() {
        AudioTrack audioTrack2 = this.audioTrack;
        if (audioTrack2 != null) {
            return audioTrack2.getUnderrunCount();
        }
        return -1;
    }

    @TargetApi(29)
    private static AudioAttributes.Builder applyAttributesOnQOrHigher(AudioAttributes.Builder builder, AudioAttributes audioAttributes2) {
        return builder.setAllowedCapturePolicy(audioAttributes2.getAllowedCapturePolicy());
    }

    /* access modifiers changed from: private */
    public static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private int channelCountToConfiguration(int i) {
        return i == 1 ? 4 : 12;
    }

    private static AudioTrack createAudioTrackBeforeOreo(int i, int i2, int i3, AudioAttributes audioAttributes2) {
        Logging.d(TAG, "createAudioTrackBeforeOreo");
        logNativeOutputSampleRate(i);
        return new AudioTrack(getAudioAttributes(audioAttributes2), new AudioFormat.Builder().setEncoding(2).setSampleRate(i).setChannelMask(i2).build(), i3, 1, 0);
    }

    @TargetApi(26)
    private static AudioTrack createAudioTrackOnOreoOrHigher(int i, int i2, int i3, AudioAttributes audioAttributes2) {
        Logging.d(TAG, "createAudioTrackOnOreoOrHigher");
        logNativeOutputSampleRate(i);
        return new AudioTrack.Builder().setAudioAttributes(getAudioAttributes(audioAttributes2)).setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(i).setChannelMask(i2).build()).setBufferSizeInBytes(i3).setPerformanceMode(1).setTransferMode(1).setSessionId(0).build();
    }

    /* access modifiers changed from: private */
    public void doAudioTrackStateCallback(int i) {
        Logging.d(TAG, "doAudioTrackStateCallback: " + i);
        JavaAudioDeviceModule.AudioTrackStateCallback audioTrackStateCallback = this.stateCallback;
        if (audioTrackStateCallback == null) {
            return;
        }
        if (i == 0) {
            audioTrackStateCallback.onWebRtcAudioTrackStart();
        } else if (i == 1) {
            audioTrackStateCallback.onWebRtcAudioTrackStop();
        } else {
            Logging.e(TAG, "Invalid audio state");
        }
    }

    private static AudioAttributes getAudioAttributes(AudioAttributes audioAttributes2) {
        AudioAttributes.Builder contentType = new AudioAttributes.Builder().setUsage(2).setContentType(1);
        if (audioAttributes2 != null) {
            if (audioAttributes2.getUsage() != 0) {
                contentType.setUsage(audioAttributes2.getUsage());
            }
            if (audioAttributes2.getContentType() != 0) {
                contentType.setContentType(audioAttributes2.getContentType());
            }
            contentType.setFlags(audioAttributes2.getFlags());
            contentType = applyAttributesOnQOrHigher(contentType, audioAttributes2);
        }
        return contentType.build();
    }

    @CalledByNative
    private int getBufferSizeInFrames() {
        return this.audioTrack.getBufferSizeInFrames();
    }

    @CalledByNative
    private int getInitialBufferSizeInFrames() {
        return this.initialBufferSizeInFrames;
    }

    @CalledByNative
    private int getStreamMaxVolume() {
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "getStreamMaxVolume");
        return this.audioManager.getStreamMaxVolume(0);
    }

    @CalledByNative
    private int getStreamVolume() {
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "getStreamVolume");
        return this.audioManager.getStreamVolume(0);
    }

    @CalledByNative
    private int initPlayout(int i, int i2, double d) {
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "initPlayout(sampleRate=" + i + ", channels=" + i2 + ", bufferSizeFactor=" + d + ")");
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((i / 100) * i2 * 2);
        this.byteBuffer = allocateDirect;
        int capacity = allocateDirect.capacity();
        StringBuilder sb = new StringBuilder("byteBuffer.capacity: ");
        sb.append(capacity);
        Logging.d(TAG, sb.toString());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.nativeAudioTrack, this.byteBuffer);
        int channelCountToConfiguration = channelCountToConfiguration(i2);
        int minBufferSize = (int) (((double) AudioTrack.getMinBufferSize(i, channelCountToConfiguration, 2)) * d);
        Logging.d(TAG, "minBufferSizeInBytes: " + minBufferSize);
        if (minBufferSize < this.byteBuffer.capacity()) {
            reportWebRtcAudioTrackInitError("AudioTrack.getMinBufferSize returns an invalid value.");
            return -1;
        }
        if (d > 1.0d) {
            this.useLowLatency = false;
        }
        if (this.audioTrack != null) {
            reportWebRtcAudioTrackInitError("Conflict with existing AudioTrack.");
            return -1;
        }
        try {
            if (this.useLowLatency) {
                this.audioTrack = createAudioTrackOnOreoOrHigher(i, channelCountToConfiguration, minBufferSize, this.audioAttributes);
            } else {
                this.audioTrack = createAudioTrackBeforeOreo(i, channelCountToConfiguration, minBufferSize, this.audioAttributes);
            }
            AudioTrack audioTrack2 = this.audioTrack;
            if (audioTrack2 == null || audioTrack2.getState() != 1) {
                reportWebRtcAudioTrackInitError("Initialization of audio track failed.");
                releaseAudioResources();
                return -1;
            }
            this.initialBufferSizeInFrames = this.audioTrack.getBufferSizeInFrames();
            logMainParameters();
            logMainParametersExtended();
            return minBufferSize;
        } catch (IllegalArgumentException e) {
            reportWebRtcAudioTrackInitError(e.getMessage());
            releaseAudioResources();
            return -1;
        }
    }

    private void logBufferCapacityInFrames() {
        int bufferCapacityInFrames = this.audioTrack.getBufferCapacityInFrames();
        Logging.d(TAG, "AudioTrack: buffer capacity in frames: " + bufferCapacityInFrames);
    }

    private void logBufferSizeInFrames() {
        int bufferSizeInFrames = this.audioTrack.getBufferSizeInFrames();
        Logging.d(TAG, "AudioTrack: buffer size in frames: " + bufferSizeInFrames);
    }

    private void logMainParameters() {
        int audioSessionId = this.audioTrack.getAudioSessionId();
        int channelCount = this.audioTrack.getChannelCount();
        int sampleRate = this.audioTrack.getSampleRate();
        float maxVolume = AudioTrack.getMaxVolume();
        StringBuilder n = a81.n("AudioTrack: session ID: ", audioSessionId, ", channels: ", channelCount, ", sample rate: ");
        n.append(sampleRate);
        n.append(", max gain: ");
        n.append(maxVolume);
        Logging.d(TAG, n.toString());
    }

    private void logMainParametersExtended() {
        logBufferSizeInFrames();
        logBufferCapacityInFrames();
    }

    private static void logNativeOutputSampleRate(int i) {
        int nativeOutputSampleRate = AudioTrack.getNativeOutputSampleRate(0);
        Logging.d(TAG, "nativeOutputSampleRate: " + nativeOutputSampleRate);
        if (i != nativeOutputSampleRate) {
            Logging.w(TAG, "Unable to use fast mode since requested sample rate is not native");
        }
    }

    private void logUnderrunCount() {
        int underrunCount = this.audioTrack.getUnderrunCount();
        Logging.d(TAG, "underrun count: " + underrunCount);
    }

    private static native void nativeCacheDirectBufferAddress(long j, ByteBuffer byteBuffer2);

    /* access modifiers changed from: private */
    public static native void nativeGetPlayoutData(long j, int i);

    private void releaseAudioResources() {
        Logging.d(TAG, "releaseAudioResources");
        AudioTrack audioTrack2 = this.audioTrack;
        if (audioTrack2 != null) {
            audioTrack2.release();
            this.audioTrack = null;
        }
    }

    /* access modifiers changed from: private */
    public void reportWebRtcAudioTrackError(String str) {
        Logging.e(TAG, "Run-time playback error: " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback = this.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackError(str);
        }
    }

    private void reportWebRtcAudioTrackInitError(String str) {
        Logging.e(TAG, "Init playout error: " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback = this.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackInitError(str);
        }
    }

    /* access modifiers changed from: private */
    public void reportWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        Logging.e(TAG, "Start playout error: " + audioTrackStartErrorCode + ". " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback = this.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackStartError(audioTrackStartErrorCode, str);
        }
    }

    @CalledByNative
    private boolean setStreamVolume(int i) {
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "setStreamVolume(" + i + ")");
        if (this.audioManager.isVolumeFixed()) {
            Logging.e(TAG, "The device implements a fixed volume policy.");
            return false;
        }
        this.audioManager.setStreamVolume(0, i, 0);
        return true;
    }

    @CalledByNative
    private boolean startPlayout() {
        this.threadChecker.checkIsOnValidThread();
        VolumeLogger volumeLogger2 = this.volumeLogger;
        if (volumeLogger2 != null) {
            volumeLogger2.start();
        }
        Logging.d(TAG, "startPlayout");
        assertTrue(this.audioTrack != null);
        assertTrue(this.audioThread == null);
        if (!TRACK_LATEINIT) {
            try {
                this.audioTrack.play();
                if (this.audioTrack.getPlayState() != 3) {
                    reportWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH, wj6.h(this.audioTrack.getPlayState(), "AudioTrack.play failed - incorrect state :"));
                    releaseAudioResources();
                    return false;
                }
            } catch (IllegalStateException e) {
                reportWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION, a81.m("AudioTrack.play failed: ", e.getMessage()));
                releaseAudioResources();
                return false;
            }
        }
        AudioTrackThread audioTrackThread = new AudioTrackThread("AudioTrackJavaThread");
        this.audioThread = audioTrackThread;
        audioTrackThread.start();
        return true;
    }

    @CalledByNative
    private boolean stopPlayout() {
        this.threadChecker.checkIsOnValidThread();
        VolumeLogger volumeLogger2 = this.volumeLogger;
        if (volumeLogger2 != null) {
            volumeLogger2.stop();
        }
        Logging.d(TAG, "stopPlayout");
        assertTrue(this.audioThread != null);
        logUnderrunCount();
        this.audioThread.stopThread();
        Logging.d(TAG, "Stopping the AudioTrackThread...");
        this.audioThread.interrupt();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, 2000)) {
            Logging.e(TAG, "Join of AudioTrackThread timed out.");
            WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        }
        Logging.d(TAG, "AudioTrackThread has now been stopped.");
        this.audioThread = null;
        AudioTrack audioTrack2 = this.audioTrack;
        if (audioTrack2 != null) {
            Logging.d(TAG, "Calling AudioTrack.stop...");
            try {
                audioTrack2.stop();
                Logging.d(TAG, "AudioTrack.stop is done.");
                doAudioTrackStateCallback(1);
            } catch (IllegalStateException e) {
                String message = e.getMessage();
                Logging.e(TAG, "AudioTrack.stop failed: " + message);
            }
        }
        releaseAudioResources();
        return true;
    }

    @CalledByNative
    public void setNativeAudioTrack(long j) {
        this.nativeAudioTrack = j;
    }

    public void setSpeakerMute(boolean z) {
        Logging.w(TAG, "setSpeakerMute(" + z + ")");
        this.speakerMute = z;
    }

    public WebRtcAudioTrack(Context context2, AudioManager audioManager2, AudioAttributes audioAttributes2, JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback, JavaAudioDeviceModule.AudioTrackStateCallback audioTrackStateCallback, boolean z, boolean z2) {
        ThreadUtils.ThreadChecker threadChecker2 = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker2;
        threadChecker2.detachThread();
        this.context = context2;
        this.audioManager = audioManager2;
        this.audioAttributes = audioAttributes2;
        this.errorCallback = audioTrackErrorCallback;
        this.stateCallback = audioTrackStateCallback;
        this.volumeLogger = z2 ? new VolumeLogger(audioManager2) : null;
        this.useLowLatency = z;
        String threadInfo = WebRtcAudioUtils.getThreadInfo();
        Logging.d(TAG, "ctor" + threadInfo);
    }
}
