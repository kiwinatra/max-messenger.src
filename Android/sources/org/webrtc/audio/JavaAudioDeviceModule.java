package org.webrtc.audio;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.projection.MediaProjection;
import java.util.concurrent.ScheduledExecutorService;
import org.webrtc.JniCommon;
import org.webrtc.Logging;
import org.webrtc.MediaStreamTrack;

public class JavaAudioDeviceModule implements AudioDeviceModule {
    private static final String TAG = "JavaAudioDeviceModule";
    private final WebRtcAudioRecord audioInput;
    private final AudioManager audioManager;
    private final WebRtcAudioTrack audioOutput;
    private final Context context;
    private final int inputSampleRate;
    private long nativeAudioDeviceModule;
    private final Object nativeLock = new Object();
    private final int outputSampleRate;
    private final boolean useStereoInput;
    private final boolean useStereoOutput;

    public interface AudioRecordErrorCallback {
        void onWebRtcAudioRecordError(String str);

        void onWebRtcAudioRecordInitError(String str);

        void onWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str);
    }

    public interface AudioRecordSampleHook {
        void onWebRtcAudioRecordSamplesReady(int i, int i2, int i3, byte[] bArr, int i4, int i5);
    }

    public enum AudioRecordStartErrorCode {
        AUDIO_RECORD_START_EXCEPTION,
        AUDIO_RECORD_START_STATE_MISMATCH
    }

    public interface AudioRecordStateCallback {
        void onWebRtcAudioRecordStart();

        void onWebRtcAudioRecordStop();
    }

    public static class AudioSamples {
        private final int audioFormat;
        private final int channelCount;
        private final byte[] data;
        private final int sampleRate;

        public AudioSamples(int i, int i2, int i3, byte[] bArr) {
            this.audioFormat = i;
            this.channelCount = i2;
            this.sampleRate = i3;
            this.data = bArr;
        }

        public int getAudioFormat() {
            return this.audioFormat;
        }

        public int getChannelCount() {
            return this.channelCount;
        }

        public byte[] getData() {
            return this.data;
        }

        public int getSampleRate() {
            return this.sampleRate;
        }
    }

    public interface AudioTrackErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str);
    }

    public enum AudioTrackStartErrorCode {
        AUDIO_TRACK_START_EXCEPTION,
        AUDIO_TRACK_START_STATE_MISMATCH
    }

    public interface AudioTrackStateCallback {
        void onWebRtcAudioTrackStart();

        void onWebRtcAudioTrackStop();
    }

    public static class Builder {
        private AudioAttributes audioAttributes;
        private int audioFormat;
        private final AudioManager audioManager;
        private AudioRecordErrorCallback audioRecordErrorCallback;
        private AudioRecordSampleHook audioRecordSampleHook;
        private AudioRecordStateCallback audioRecordStateCallback;
        private int audioSource;
        private AudioTrackErrorCallback audioTrackErrorCallback;
        private AudioTrackStateCallback audioTrackStateCallback;
        private final Context context;
        private boolean enableVolumeLogger;
        private int inputSampleRate;
        private int outputSampleRate;
        private SamplesReadyCallback samplesReadyCallback;
        private ScheduledExecutorService scheduler;
        private boolean useHardwareAcousticEchoCanceler;
        private boolean useHardwareNoiseSuppressor;
        private boolean useLowLatency;
        private boolean useSilenceProvider;
        private boolean useStereoInput;
        private boolean useStereoOutput;

        public /* synthetic */ Builder(Context context2, int i) {
            this(context2);
        }

        public JavaAudioDeviceModule createAudioDeviceModule() {
            Logging.d(JavaAudioDeviceModule.TAG, "createAudioDeviceModule");
            if (this.useHardwareNoiseSuppressor) {
                Logging.d(JavaAudioDeviceModule.TAG, "HW NS will be used.");
            } else {
                if (JavaAudioDeviceModule.isBuiltInNoiseSuppressorSupported()) {
                    Logging.d(JavaAudioDeviceModule.TAG, "Overriding default behavior; now using WebRTC NS!");
                }
                Logging.d(JavaAudioDeviceModule.TAG, "HW NS will not be used.");
            }
            if (this.useHardwareAcousticEchoCanceler) {
                Logging.d(JavaAudioDeviceModule.TAG, "HW AEC will be used.");
            } else {
                if (JavaAudioDeviceModule.isBuiltInAcousticEchoCancelerSupported()) {
                    Logging.d(JavaAudioDeviceModule.TAG, "Overriding default behavior; now using WebRTC AEC!");
                }
                Logging.d(JavaAudioDeviceModule.TAG, "HW AEC will not be used.");
            }
            if (this.useLowLatency) {
                Logging.d(JavaAudioDeviceModule.TAG, "Low latency mode will be used.");
            }
            ScheduledExecutorService scheduledExecutorService = this.scheduler;
            if (scheduledExecutorService == null) {
                scheduledExecutorService = WebRtcAudioRecord.newDefaultScheduler();
            }
            WebRtcAudioRecord webRtcAudioRecord = new WebRtcAudioRecord(this.context, scheduledExecutorService, this.audioManager, this.audioSource, this.audioFormat, this.audioRecordErrorCallback, this.audioRecordStateCallback, this.samplesReadyCallback, this.audioRecordSampleHook, this.useHardwareAcousticEchoCanceler, this.useHardwareNoiseSuppressor, this.useSilenceProvider);
            return new JavaAudioDeviceModule(this.context, this.audioManager, webRtcAudioRecord, new WebRtcAudioTrack(this.context, this.audioManager, this.audioAttributes, this.audioTrackErrorCallback, this.audioTrackStateCallback, this.useLowLatency, this.enableVolumeLogger), this.inputSampleRate, this.outputSampleRate, this.useStereoInput, this.useStereoOutput);
        }

        public Builder setAudioAttributes(AudioAttributes audioAttributes2) {
            this.audioAttributes = audioAttributes2;
            return this;
        }

        public Builder setAudioFormat(int i) {
            this.audioFormat = i;
            return this;
        }

        public Builder setAudioRecordErrorCallback(AudioRecordErrorCallback audioRecordErrorCallback2) {
            this.audioRecordErrorCallback = audioRecordErrorCallback2;
            return this;
        }

        public Builder setAudioRecordSampleHook(AudioRecordSampleHook audioRecordSampleHook2) {
            this.audioRecordSampleHook = audioRecordSampleHook2;
            return this;
        }

        public Builder setAudioRecordStateCallback(AudioRecordStateCallback audioRecordStateCallback2) {
            this.audioRecordStateCallback = audioRecordStateCallback2;
            return this;
        }

        public Builder setAudioSource(int i) {
            this.audioSource = i;
            return this;
        }

        public Builder setAudioTrackErrorCallback(AudioTrackErrorCallback audioTrackErrorCallback2) {
            this.audioTrackErrorCallback = audioTrackErrorCallback2;
            return this;
        }

        public Builder setAudioTrackStateCallback(AudioTrackStateCallback audioTrackStateCallback2) {
            this.audioTrackStateCallback = audioTrackStateCallback2;
            return this;
        }

        public Builder setEnableVolumeLogger(boolean z) {
            this.enableVolumeLogger = z;
            return this;
        }

        public Builder setInputSampleRate(int i) {
            Logging.d(JavaAudioDeviceModule.TAG, "Input sample rate overridden to: " + i);
            this.inputSampleRate = i;
            return this;
        }

        public Builder setOutputSampleRate(int i) {
            Logging.d(JavaAudioDeviceModule.TAG, "Output sample rate overridden to: " + i);
            this.outputSampleRate = i;
            return this;
        }

        public Builder setSampleRate(int i) {
            Logging.d(JavaAudioDeviceModule.TAG, "Input/Output sample rate overridden to: " + i);
            this.inputSampleRate = i;
            this.outputSampleRate = i;
            return this;
        }

        public Builder setSamplesReadyCallback(SamplesReadyCallback samplesReadyCallback2) {
            this.samplesReadyCallback = samplesReadyCallback2;
            return this;
        }

        public Builder setScheduler(ScheduledExecutorService scheduledExecutorService) {
            this.scheduler = scheduledExecutorService;
            return this;
        }

        public Builder setUseHardwareAcousticEchoCanceler(boolean z) {
            if (z && !JavaAudioDeviceModule.isBuiltInAcousticEchoCancelerSupported()) {
                Logging.e(JavaAudioDeviceModule.TAG, "HW AEC not supported");
                z = false;
            }
            this.useHardwareAcousticEchoCanceler = z;
            return this;
        }

        public Builder setUseHardwareNoiseSuppressor(boolean z) {
            if (z && !JavaAudioDeviceModule.isBuiltInNoiseSuppressorSupported()) {
                Logging.e(JavaAudioDeviceModule.TAG, "HW NS not supported");
                z = false;
            }
            this.useHardwareNoiseSuppressor = z;
            return this;
        }

        public Builder setUseLowLatency(boolean z) {
            this.useLowLatency = z;
            return this;
        }

        public Builder setUseSilenceProvider(boolean z) {
            this.useSilenceProvider = z;
            return this;
        }

        public Builder setUseStereoInput(boolean z) {
            this.useStereoInput = z;
            return this;
        }

        public Builder setUseStereoOutput(boolean z) {
            this.useStereoOutput = z;
            return this;
        }

        private Builder(Context context2) {
            this.audioSource = 7;
            this.audioFormat = 2;
            this.useHardwareAcousticEchoCanceler = JavaAudioDeviceModule.isBuiltInAcousticEchoCancelerSupported();
            this.useHardwareNoiseSuppressor = JavaAudioDeviceModule.isBuiltInNoiseSuppressorSupported();
            this.context = context2;
            AudioManager audioManager2 = (AudioManager) context2.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            this.audioManager = audioManager2;
            this.inputSampleRate = WebRtcAudioManager.getSampleRate(audioManager2);
            this.outputSampleRate = WebRtcAudioManager.getSampleRate(audioManager2);
            this.useLowLatency = false;
            this.enableVolumeLogger = true;
        }
    }

    public interface SamplesReadyCallback {
        void onWebRtcAudioRecordSamplesReady(AudioSamples audioSamples);
    }

    public JavaAudioDeviceModule(Context context2, AudioManager audioManager2, WebRtcAudioRecord webRtcAudioRecord, WebRtcAudioTrack webRtcAudioTrack, int i, int i2, boolean z, boolean z2) {
        this.context = context2;
        this.audioManager = audioManager2;
        this.audioInput = webRtcAudioRecord;
        this.audioOutput = webRtcAudioTrack;
        this.inputSampleRate = i;
        this.outputSampleRate = i2;
        this.useStereoInput = z;
        this.useStereoOutput = z2;
    }

    public static Builder builder(Context context2) {
        return new Builder(context2, 0);
    }

    public static boolean isBuiltInAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.isAcousticEchoCancelerSupported();
    }

    public static boolean isBuiltInNoiseSuppressorSupported() {
        return WebRtcAudioEffects.isNoiseSuppressorSupported();
    }

    private static native long nativeCreateAudioDeviceModule(Context context2, AudioManager audioManager2, WebRtcAudioRecord webRtcAudioRecord, WebRtcAudioTrack webRtcAudioTrack, int i, int i2, boolean z, boolean z2);

    public WebRtcAudioRecord getAudioInput() {
        return this.audioInput;
    }

    public long getNativeAudioDeviceModulePointer() {
        long j;
        synchronized (this.nativeLock) {
            try {
                if (this.nativeAudioDeviceModule == 0) {
                    this.nativeAudioDeviceModule = nativeCreateAudioDeviceModule(this.context, this.audioManager, this.audioInput, this.audioOutput, this.inputSampleRate, this.outputSampleRate, this.useStereoInput, this.useStereoOutput);
                }
                j = this.nativeAudioDeviceModule;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j;
    }

    public void release() {
        synchronized (this.nativeLock) {
            try {
                long j = this.nativeAudioDeviceModule;
                if (j != 0) {
                    JniCommon.nativeReleaseRef(j);
                    this.nativeAudioDeviceModule = 0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void restartAudioRecording() {
        this.audioInput.restartAudioRecording();
    }

    public void setMicrophoneMute(boolean z) {
        Logging.d(TAG, "setMicrophoneMute: " + z);
        this.audioInput.setMicrophoneMute(z);
    }

    public boolean setNoiseSuppressorEnabled(boolean z) {
        Logging.d(TAG, "setNoiseSuppressorEnabled: " + z);
        return this.audioInput.setNoiseSuppressorEnabled(z);
    }

    public void setOneAnnNoiseSuppressorEnabled(boolean z) {
        Logging.d(TAG, "setOneAnnNoiseSuppressorEnabled: " + z);
        this.audioInput.setOneAnnNoiseSuppressorEnabled(z);
    }

    public void setPreferredInputDevice(AudioDeviceInfo audioDeviceInfo) {
        Logging.d(TAG, "setPreferredInputDevice: " + audioDeviceInfo);
        this.audioInput.setPreferredDevice(audioDeviceInfo);
    }

    public void setSpeakerMute(boolean z) {
        Logging.d(TAG, "setSpeakerMute: " + z);
        this.audioOutput.setSpeakerMute(z);
    }

    public void startDeviceAudioShare(MediaProjection mediaProjection) {
        this.audioInput.initDeviceAudioRecord(mediaProjection);
    }

    public void stopDeviceAudioShare() {
        this.audioInput.stopDeviceAudioRecord();
    }
}
