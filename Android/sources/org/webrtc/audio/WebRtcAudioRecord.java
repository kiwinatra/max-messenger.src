package org.webrtc.audio;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioPlaybackCaptureConfiguration;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;
import android.media.projection.MediaProjection;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.webrtc.CalledByNative;
import org.webrtc.Logging;
import org.webrtc.ThreadUtils;
import org.webrtc.audio.JavaAudioDeviceModule;

public class WebRtcAudioRecord {
    private static final int AUDIO_RECORD_START = 0;
    private static final int AUDIO_RECORD_STOP = 1;
    private static final long AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int BUFFER_SIZE_FACTOR = 2;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final int CHECK_REC_STATUS_DELAY_MS = 100;
    public static final int DEFAULT_AUDIO_FORMAT = 2;
    public static final int DEFAULT_AUDIO_SOURCE = 7;
    private static final String TAG = "WebRtcAudioRecordExternal";
    /* access modifiers changed from: private */
    public static final AtomicInteger nextSchedulerId = new AtomicInteger(0);
    private final int audioFormat;
    private final AudioManager audioManager;
    /* access modifiers changed from: private */
    public final JavaAudioDeviceModule.AudioRecordSampleHook audioRecordSampleHook;
    /* access modifiers changed from: private */
    public final JavaAudioDeviceModule.SamplesReadyCallback audioSamplesReadyCallback;
    private final int audioSource;
    private final AtomicReference<Boolean> audioSourceMatchesRecordingSessionRef;
    private AudioRecordThread audioThread;
    /* access modifiers changed from: private */
    public ByteBuffer byteBuffer;
    private final Context context;
    /* access modifiers changed from: private */
    public volatile AudioRecord deviceAudioRecord;
    /* access modifiers changed from: private */
    public ByteBuffer deviceByteBuffer;
    private final WebRtcAudioEffects effects;
    /* access modifiers changed from: private */
    public byte[] emptyBytes;
    private final JavaAudioDeviceModule.AudioRecordErrorCallback errorCallback;
    private final ScheduledExecutorService executor;
    private ScheduledFuture<String> future;
    private volatile int initChannels;
    private volatile int initSampleRate;
    private final boolean isAcousticEchoCancelerSupported;
    private final boolean isNoiseSuppressorSupported;
    private final boolean isSilenceProviderSupported;
    private MediaProjection mediaProjection;
    /* access modifiers changed from: private */
    public volatile boolean microphoneMute;
    /* access modifiers changed from: private */
    public long nativeAudioRecord;
    private AudioDeviceInfo preferredDevice;
    private volatile RecordState recordState;
    /* access modifiers changed from: private */
    public final Object recordSwapLock;
    /* access modifiers changed from: private */
    public volatile WebRtcSilenceProvider silenceProvider;
    private final JavaAudioDeviceModule.AudioRecordStateCallback stateCallback;
    /* access modifiers changed from: private */
    public volatile AudioRecord voiceAudioRecord;

    /* renamed from: org.webrtc.audio.WebRtcAudioRecord$2  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$audio$WebRtcAudioRecord$RecordState;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                org.webrtc.audio.WebRtcAudioRecord$RecordState[] r0 = org.webrtc.audio.WebRtcAudioRecord.RecordState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$org$webrtc$audio$WebRtcAudioRecord$RecordState = r0
                org.webrtc.audio.WebRtcAudioRecord$RecordState r1 = org.webrtc.audio.WebRtcAudioRecord.RecordState.STARTED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$org$webrtc$audio$WebRtcAudioRecord$RecordState     // Catch:{ NoSuchFieldError -> 0x001d }
                org.webrtc.audio.WebRtcAudioRecord$RecordState r1 = org.webrtc.audio.WebRtcAudioRecord.RecordState.INITED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$org$webrtc$audio$WebRtcAudioRecord$RecordState     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.webrtc.audio.WebRtcAudioRecord$RecordState r1 = org.webrtc.audio.WebRtcAudioRecord.RecordState.STOPPED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$org$webrtc$audio$WebRtcAudioRecord$RecordState     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.webrtc.audio.WebRtcAudioRecord$RecordState r1 = org.webrtc.audio.WebRtcAudioRecord.RecordState.RELEASED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$org$webrtc$audio$WebRtcAudioRecord$RecordState     // Catch:{ NoSuchFieldError -> 0x003e }
                org.webrtc.audio.WebRtcAudioRecord$RecordState r1 = org.webrtc.audio.WebRtcAudioRecord.RecordState.NONE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.audio.WebRtcAudioRecord.AnonymousClass2.<clinit>():void");
        }
    }

    public class AudioRecordThread extends Thread {
        private volatile boolean keepAlive = true;
        private volatile boolean startReported = true;

        public AudioRecordThread(String str) {
            super(str);
        }

        private void trySendAudioSamples(AudioTimestamp audioTimestamp) {
            int i;
            int i2;
            int i3;
            int i4;
            long j;
            AudioTimestamp audioTimestamp2 = audioTimestamp;
            synchronized (WebRtcAudioRecord.this.recordSwapLock) {
                try {
                    if (WebRtcAudioRecord.this.voiceAudioRecord != null) {
                        i4 = WebRtcAudioRecord.this.voiceAudioRecord.getAudioFormat();
                        i3 = WebRtcAudioRecord.this.voiceAudioRecord.getChannelCount();
                        i2 = WebRtcAudioRecord.this.voiceAudioRecord.getSampleRate();
                        i = WebRtcAudioRecord.this.voiceAudioRecord.read(WebRtcAudioRecord.this.byteBuffer, WebRtcAudioRecord.this.byteBuffer.capacity());
                    } else if (WebRtcAudioRecord.this.silenceProvider != null) {
                        i4 = WebRtcAudioRecord.this.silenceProvider.getAudioFormat();
                        i3 = WebRtcAudioRecord.this.silenceProvider.getChannelCount();
                        i2 = WebRtcAudioRecord.this.silenceProvider.getSampleRate();
                        i = WebRtcAudioRecord.this.silenceProvider.read(WebRtcAudioRecord.this.byteBuffer, WebRtcAudioRecord.this.byteBuffer.capacity());
                    } else {
                        i = -3;
                        i4 = 0;
                        i3 = 0;
                        i2 = 0;
                    }
                    long j2 = 0;
                    try {
                        if (WebRtcAudioRecord.this.voiceAudioRecord != null && WebRtcAudioRecord.this.voiceAudioRecord.getTimestamp(audioTimestamp2, 0) == 0) {
                            j2 = audioTimestamp2.nanoTime;
                        }
                    } catch (IllegalStateException unused) {
                    }
                    j = j2;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            if (i == WebRtcAudioRecord.this.byteBuffer.capacity()) {
                if (WebRtcAudioRecord.this.audioRecordSampleHook != null) {
                    WebRtcAudioRecord.this.audioRecordSampleHook.onWebRtcAudioRecordSamplesReady(i4, i3, i2, WebRtcAudioRecord.this.byteBuffer.array(), WebRtcAudioRecord.this.byteBuffer.arrayOffset(), i);
                }
                if (WebRtcAudioRecord.this.audioSamplesReadyCallback != null) {
                    WebRtcAudioRecord.this.audioSamplesReadyCallback.onWebRtcAudioRecordSamplesReady(new JavaAudioDeviceModule.AudioSamples(i4, i3, i2, Arrays.copyOfRange(WebRtcAudioRecord.this.byteBuffer.array(), WebRtcAudioRecord.this.byteBuffer.arrayOffset(), WebRtcAudioRecord.this.byteBuffer.arrayOffset() + WebRtcAudioRecord.this.byteBuffer.capacity())));
                }
                if (WebRtcAudioRecord.this.microphoneMute) {
                    WebRtcAudioRecord.this.byteBuffer.clear();
                    WebRtcAudioRecord.this.byteBuffer.put(WebRtcAudioRecord.this.emptyBytes);
                }
                if (this.keepAlive) {
                    WebRtcAudioRecord webRtcAudioRecord = WebRtcAudioRecord.this;
                    webRtcAudioRecord.nativeDataIsRecorded(webRtcAudioRecord.nativeAudioRecord, i, j);
                    return;
                }
                return;
            }
            int i5 = i;
            String str = "AudioRecord.read failed: " + i5;
            Logging.e(WebRtcAudioRecord.TAG, str);
            if (i5 == -3) {
                this.keepAlive = false;
                WebRtcAudioRecord.this.reportWebRtcAudioRecordError(str);
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(9:8|9|(2:11|12)(1:14)|15|16|17|(1:21)|22|23) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x007a */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0087  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0095  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void trySendDeviceAudioSamples(android.media.AudioTimestamp r8) {
            /*
                r7 = this;
                org.webrtc.audio.WebRtcAudioRecord r0 = org.webrtc.audio.WebRtcAudioRecord.this
                android.media.AudioRecord r0 = r0.deviceAudioRecord
                if (r0 != 0) goto L_0x0009
                return
            L_0x0009:
                org.webrtc.audio.WebRtcAudioRecord r0 = org.webrtc.audio.WebRtcAudioRecord.this
                android.media.AudioRecord r0 = r0.deviceAudioRecord
                int r0 = r0.getRecordingState()
                r1 = 3
                if (r0 == r1) goto L_0x0017
                return
            L_0x0017:
                org.webrtc.audio.WebRtcAudioRecord r0 = org.webrtc.audio.WebRtcAudioRecord.this
                java.lang.Object r0 = r0.recordSwapLock
                monitor-enter(r0)
                org.webrtc.audio.WebRtcAudioRecord r1 = org.webrtc.audio.WebRtcAudioRecord.this     // Catch:{ all -> 0x005e }
                android.media.AudioRecord r1 = r1.deviceAudioRecord     // Catch:{ all -> 0x005e }
                r2 = -3
                if (r1 == 0) goto L_0x0060
                org.webrtc.audio.WebRtcAudioRecord r1 = org.webrtc.audio.WebRtcAudioRecord.this     // Catch:{ all -> 0x005e }
                android.media.AudioRecord r1 = r1.deviceAudioRecord     // Catch:{ all -> 0x005e }
                r1.getAudioFormat()     // Catch:{ all -> 0x005e }
                org.webrtc.audio.WebRtcAudioRecord r1 = org.webrtc.audio.WebRtcAudioRecord.this     // Catch:{ all -> 0x005e }
                android.media.AudioRecord r1 = r1.deviceAudioRecord     // Catch:{ all -> 0x005e }
                r1.getChannelCount()     // Catch:{ all -> 0x005e }
                org.webrtc.audio.WebRtcAudioRecord r1 = org.webrtc.audio.WebRtcAudioRecord.this     // Catch:{ all -> 0x005e }
                android.media.AudioRecord r1 = r1.deviceAudioRecord     // Catch:{ all -> 0x005e }
                r1.getSampleRate()     // Catch:{ all -> 0x005e }
                org.webrtc.audio.WebRtcAudioRecord r1 = org.webrtc.audio.WebRtcAudioRecord.this     // Catch:{ all -> 0x005e }
                android.media.AudioRecord r1 = r1.deviceAudioRecord     // Catch:{ all -> 0x005e }
                org.webrtc.audio.WebRtcAudioRecord r3 = org.webrtc.audio.WebRtcAudioRecord.this     // Catch:{ all -> 0x005e }
                java.nio.ByteBuffer r3 = r3.deviceByteBuffer     // Catch:{ all -> 0x005e }
                org.webrtc.audio.WebRtcAudioRecord r4 = org.webrtc.audio.WebRtcAudioRecord.this     // Catch:{ all -> 0x005e }
                java.nio.ByteBuffer r4 = r4.deviceByteBuffer     // Catch:{ all -> 0x005e }
                int r4 = r4.capacity()     // Catch:{ all -> 0x005e }
                int r1 = r1.read(r3, r4)     // Catch:{ all -> 0x005e }
                r4 = r1
                goto L_0x0061
            L_0x005e:
                r7 = move-exception
                goto L_0x00b0
            L_0x0060:
                r4 = r2
            L_0x0061:
                r5 = 0
                org.webrtc.audio.WebRtcAudioRecord r1 = org.webrtc.audio.WebRtcAudioRecord.this     // Catch:{ IllegalStateException -> 0x007a }
                android.media.AudioRecord r1 = r1.deviceAudioRecord     // Catch:{ IllegalStateException -> 0x007a }
                if (r1 == 0) goto L_0x007a
                org.webrtc.audio.WebRtcAudioRecord r1 = org.webrtc.audio.WebRtcAudioRecord.this     // Catch:{ IllegalStateException -> 0x007a }
                android.media.AudioRecord r1 = r1.deviceAudioRecord     // Catch:{ IllegalStateException -> 0x007a }
                r3 = 0
                int r1 = r1.getTimestamp(r8, r3)     // Catch:{ IllegalStateException -> 0x007a }
                if (r1 != 0) goto L_0x007a
                long r5 = r8.nanoTime     // Catch:{ IllegalStateException -> 0x007a }
            L_0x007a:
                monitor-exit(r0)     // Catch:{ all -> 0x005e }
                org.webrtc.audio.WebRtcAudioRecord r8 = org.webrtc.audio.WebRtcAudioRecord.this
                java.nio.ByteBuffer r8 = r8.deviceByteBuffer
                int r8 = r8.capacity()
                if (r4 != r8) goto L_0x0095
                boolean r8 = r7.keepAlive
                if (r8 == 0) goto L_0x00af
                org.webrtc.audio.WebRtcAudioRecord r1 = org.webrtc.audio.WebRtcAudioRecord.this
                long r2 = r1.nativeAudioRecord
                r1.nativeDeviceDataIsRecorded(r2, r4, r5)
                goto L_0x00af
            L_0x0095:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                java.lang.String r0 = "device AudioRecord.read failed: "
                r8.<init>(r0)
                r8.append(r4)
                java.lang.String r8 = r8.toString()
                java.lang.String r0 = "WebRtcAudioRecordExternal"
                org.webrtc.Logging.e(r0, r8)
                if (r4 != r2) goto L_0x00af
                org.webrtc.audio.WebRtcAudioRecord r7 = org.webrtc.audio.WebRtcAudioRecord.this
                r7.reportWebRtcAudioRecordError(r8)
            L_0x00af:
                return
            L_0x00b0:
                monitor-exit(r0)     // Catch:{ all -> 0x005e }
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.audio.WebRtcAudioRecord.AudioRecordThread.trySendDeviceAudioSamples(android.media.AudioTimestamp):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0063, code lost:
            java.lang.System.nanoTime();
            r0 = new android.media.AudioTimestamp();
            r1 = new android.media.AudioTimestamp();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0072, code lost:
            if (r6.keepAlive == false) goto L_0x0093;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x007a, code lost:
            if (org.webrtc.audio.WebRtcAudioRecord.l(r6.this$0) != null) goto L_0x008c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0082, code lost:
            if (org.webrtc.audio.WebRtcAudioRecord.k(r6.this$0) != null) goto L_0x008c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0084, code lost:
            org.webrtc.Logging.e(org.webrtc.audio.WebRtcAudioRecord.TAG, "AudioRecordThread: null record and silence provider");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x008c, code lost:
            trySendDeviceAudioSamples(r1);
            trySendAudioSamples(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0093, code lost:
            org.webrtc.audio.WebRtcAudioRecord.n(r6.this$0, false);
            org.webrtc.audio.WebRtcAudioRecord.n(r6.this$0, true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x009d, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                r0 = -19
                android.os.Process.setThreadPriority(r0)
                java.lang.String r0 = "WebRtcAudioRecordExternal"
                java.lang.String r1 = org.webrtc.audio.WebRtcAudioUtils.getThreadInfo()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "AudioRecordThread"
                r2.<init>(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                org.webrtc.Logging.d(r0, r1)
                org.webrtc.audio.WebRtcAudioRecord r0 = org.webrtc.audio.WebRtcAudioRecord.this
                java.lang.Object r0 = r0.recordSwapLock
                monitor-enter(r0)
                org.webrtc.audio.WebRtcAudioRecord r1 = org.webrtc.audio.WebRtcAudioRecord.this     // Catch:{ all -> 0x0035 }
                android.media.AudioRecord r1 = r1.voiceAudioRecord     // Catch:{ all -> 0x0035 }
                if (r1 != 0) goto L_0x0037
                org.webrtc.audio.WebRtcAudioRecord r1 = org.webrtc.audio.WebRtcAudioRecord.this     // Catch:{ all -> 0x0035 }
                org.webrtc.audio.WebRtcSilenceProvider r1 = r1.silenceProvider     // Catch:{ all -> 0x0035 }
                if (r1 != 0) goto L_0x0037
                monitor-exit(r0)     // Catch:{ all -> 0x0035 }
                return
            L_0x0035:
                r6 = move-exception
                goto L_0x009e
            L_0x0037:
                org.webrtc.audio.WebRtcAudioRecord r1 = org.webrtc.audio.WebRtcAudioRecord.this     // Catch:{ all -> 0x0035 }
                org.webrtc.audio.WebRtcSilenceProvider r1 = r1.silenceProvider     // Catch:{ all -> 0x0035 }
                r2 = 1
                r3 = 0
                if (r1 != 0) goto L_0x0059
                org.webrtc.audio.WebRtcAudioRecord r1 = org.webrtc.audio.WebRtcAudioRecord.this     // Catch:{ all -> 0x0035 }
                android.media.AudioRecord r1 = r1.voiceAudioRecord     // Catch:{ all -> 0x0035 }
                if (r1 == 0) goto L_0x0057
                org.webrtc.audio.WebRtcAudioRecord r1 = org.webrtc.audio.WebRtcAudioRecord.this     // Catch:{ all -> 0x0035 }
                android.media.AudioRecord r1 = r1.voiceAudioRecord     // Catch:{ all -> 0x0035 }
                int r1 = r1.getRecordingState()     // Catch:{ all -> 0x0035 }
                r4 = 3
                if (r1 != r4) goto L_0x0057
                goto L_0x0059
            L_0x0057:
                r1 = r3
                goto L_0x005a
            L_0x0059:
                r1 = r2
            L_0x005a:
                org.webrtc.audio.WebRtcAudioRecord.assertTrue(r1)     // Catch:{ all -> 0x0035 }
                org.webrtc.audio.WebRtcAudioRecord r1 = org.webrtc.audio.WebRtcAudioRecord.this     // Catch:{ all -> 0x0035 }
                r1.doAudioRecordStateCallback(0)     // Catch:{ all -> 0x0035 }
                monitor-exit(r0)     // Catch:{ all -> 0x0035 }
                java.lang.System.nanoTime()
                android.media.AudioTimestamp r0 = new android.media.AudioTimestamp
                r0.<init>()
                android.media.AudioTimestamp r1 = new android.media.AudioTimestamp
                r1.<init>()
            L_0x0070:
                boolean r4 = r6.keepAlive
                if (r4 == 0) goto L_0x0093
                org.webrtc.audio.WebRtcAudioRecord r4 = org.webrtc.audio.WebRtcAudioRecord.this
                android.media.AudioRecord r4 = r4.voiceAudioRecord
                if (r4 != 0) goto L_0x008c
                org.webrtc.audio.WebRtcAudioRecord r4 = org.webrtc.audio.WebRtcAudioRecord.this
                org.webrtc.audio.WebRtcSilenceProvider r4 = r4.silenceProvider
                if (r4 != 0) goto L_0x008c
                java.lang.String r4 = "WebRtcAudioRecordExternal"
                java.lang.String r5 = "AudioRecordThread: null record and silence provider"
                org.webrtc.Logging.e(r4, r5)
                goto L_0x0070
            L_0x008c:
                r6.trySendDeviceAudioSamples(r1)
                r6.trySendAudioSamples(r0)
                goto L_0x0070
            L_0x0093:
                org.webrtc.audio.WebRtcAudioRecord r0 = org.webrtc.audio.WebRtcAudioRecord.this
                r0.doAudioRecordStop(r3)
                org.webrtc.audio.WebRtcAudioRecord r6 = org.webrtc.audio.WebRtcAudioRecord.this
                r6.doAudioRecordStop(r2)
                return
            L_0x009e:
                monitor-exit(r0)     // Catch:{ all -> 0x0035 }
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.audio.WebRtcAudioRecord.AudioRecordThread.run():void");
        }

        public void stopThread() {
            Logging.d(WebRtcAudioRecord.TAG, "stopThread");
            this.keepAlive = false;
        }
    }

    public enum RecordState {
        NONE,
        INITED,
        STARTED,
        STOPPED,
        RELEASED
    }

    @CalledByNative
    public WebRtcAudioRecord(Context context2, AudioManager audioManager2) {
        this(context2, newDefaultScheduler(), audioManager2, 7, 2, (JavaAudioDeviceModule.AudioRecordErrorCallback) null, (JavaAudioDeviceModule.AudioRecordStateCallback) null, (JavaAudioDeviceModule.SamplesReadyCallback) null, (JavaAudioDeviceModule.AudioRecordSampleHook) null, WebRtcAudioEffects.isAcousticEchoCancelerSupported(), WebRtcAudioEffects.isNoiseSuppressorSupported(), false);
    }

    /* access modifiers changed from: private */
    public static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private static String audioStateToString(int i) {
        return i != 0 ? i != 1 ? "INVALID" : "STOP" : "START";
    }

    private int channelCountToConfiguration(int i) {
        return i == 1 ? 16 : 12;
    }

    @TargetApi(24)
    private static boolean checkDeviceMatch(AudioDeviceInfo audioDeviceInfo, AudioDeviceInfo audioDeviceInfo2) {
        return audioDeviceInfo.getId() == audioDeviceInfo2.getId() && audioDeviceInfo.getType() == audioDeviceInfo2.getType();
    }

    private static AudioRecord createAudioRecordOnLowerThanM(int i, int i2, int i3, int i4, int i5) {
        Logging.d(TAG, "createAudioRecordOnLowerThanM");
        return new AudioRecord(i, i2, i3, i4, i5);
    }

    @TargetApi(23)
    private static AudioRecord createAudioRecordOnMOrHigher(int i, int i2, int i3, int i4, int i5) {
        Logging.d(TAG, "createAudioRecordOnMOrHigher");
        return new AudioRecord.Builder().setAudioSource(i).setAudioFormat(new AudioFormat.Builder().setEncoding(i4).setSampleRate(i2).setChannelMask(i3).build()).setBufferSizeInBytes(i5).build();
    }

    private boolean doAudioRecordInit(int i, int i2) {
        synchronized (this.recordSwapLock) {
            int channelCountToConfiguration = channelCountToConfiguration(i2);
            int minBufferSize = AudioRecord.getMinBufferSize(i, channelCountToConfiguration, this.audioFormat);
            if (minBufferSize != -1) {
                if (minBufferSize != -2) {
                    Logging.d(TAG, "AudioRecord.getMinBufferSize: " + minBufferSize);
                    int max = Math.max(minBufferSize * 2, this.byteBuffer.capacity());
                    Logging.d(TAG, "bufferSizeInBytes: " + max);
                    try {
                        this.voiceAudioRecord = createAudioRecordOnMOrHigher(this.audioSource, i, channelCountToConfiguration, this.audioFormat, max);
                        this.audioSourceMatchesRecordingSessionRef.set((Object) null);
                        AudioDeviceInfo audioDeviceInfo = this.preferredDevice;
                        if (audioDeviceInfo != null) {
                            setPreferredDevice(audioDeviceInfo);
                        }
                    } catch (IllegalArgumentException | UnsupportedOperationException e) {
                        if (this.silenceProvider == null) {
                            Logging.d(TAG, "Silence provider is null");
                            reportWebRtcAudioRecordInitError(e.getMessage());
                            releaseAudioResources(false);
                            return true;
                        }
                        releaseAudioResources(false);
                    }
                    if (this.voiceAudioRecord != null) {
                        if (this.voiceAudioRecord.getState() == 1) {
                            this.effects.enable(this.voiceAudioRecord.getAudioSessionId());
                            this.recordState = RecordState.INITED;
                            return false;
                        }
                    }
                    if (this.silenceProvider == null) {
                        Logging.d(TAG, "Silence provider is null");
                        reportWebRtcAudioRecordInitError("Creation or initialization of audio recorder failed.");
                        releaseAudioResources(false);
                        return true;
                    }
                    releaseAudioResources(false);
                    this.recordState = RecordState.INITED;
                    return false;
                }
            }
            reportWebRtcAudioRecordInitError("AudioRecord.getMinBufferSize failed: " + minBufferSize);
            return true;
        }
    }

    private void doAudioRecordRelease() {
        synchronized (this.recordSwapLock) {
            this.effects.release();
            releaseAudioResources(false);
            releaseAudioResources(true);
            this.recordState = RecordState.RELEASED;
        }
    }

    private boolean doAudioRecordStart() {
        synchronized (this.recordSwapLock) {
            try {
                if (doAudioRecordStartImpl(this.voiceAudioRecord) && this.silenceProvider == null) {
                    return true;
                }
                this.recordState = RecordState.STARTED;
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean doAudioRecordStartImpl(AudioRecord audioRecord) {
        if (audioRecord == null) {
            return true;
        }
        try {
            audioRecord.startRecording();
            if (audioRecord.getRecordingState() == 3) {
                return false;
            }
            reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH, wj6.h(audioRecord.getRecordingState(), "AudioRecord.startRecording failed - incorrect state: "));
            return true;
        } catch (IllegalStateException e) {
            reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION, a81.m("AudioRecord.startRecording failed: ", e.getMessage()));
            return true;
        }
    }

    /* access modifiers changed from: private */
    public void doAudioRecordStateCallback(int i) {
        String audioStateToString = audioStateToString(i);
        Logging.d(TAG, "doAudioRecordStateCallback: " + audioStateToString);
        JavaAudioDeviceModule.AudioRecordStateCallback audioRecordStateCallback = this.stateCallback;
        if (audioRecordStateCallback == null) {
            return;
        }
        if (i == 0) {
            audioRecordStateCallback.onWebRtcAudioRecordStart();
        } else if (i == 1) {
            audioRecordStateCallback.onWebRtcAudioRecordStop();
        } else {
            Logging.e(TAG, "Invalid audio state");
        }
    }

    /* access modifiers changed from: private */
    public void doAudioRecordStop(boolean z) {
        synchronized (this.recordSwapLock) {
            try {
                if (this.voiceAudioRecord != null) {
                    this.voiceAudioRecord.stop();
                    if (!z) {
                        doAudioRecordStateCallback(1);
                    }
                }
            } catch (IllegalStateException e) {
                String message = e.getMessage();
                Logging.e(TAG, "AudioRecord.stop failed: " + message);
            }
            this.recordState = RecordState.STOPPED;
        }
    }

    @CalledByNative
    private boolean enableBuiltInAEC(boolean z) {
        Logging.d(TAG, "enableBuiltInAEC(" + z + ")");
        return this.effects.setAEC(z);
    }

    @CalledByNative
    private boolean enableBuiltInNS(boolean z) {
        Logging.d(TAG, "enableBuiltInNS(" + z + ")");
        return this.effects.setNS(z);
    }

    private static int getBytesPerSample(int i) {
        int i2 = 1;
        if (!(i == 1 || i == 2)) {
            if (i != 3) {
                i2 = 4;
                if (i != 4) {
                    if (i != 13) {
                        throw new IllegalArgumentException(wj6.h(i, "Bad audio format "));
                    }
                }
            }
            return i2;
        }
        return 2;
    }

    @CalledByNative
    private int initRecording(int i, int i2) {
        this.initSampleRate = i;
        this.initChannels = i2;
        Logging.d(TAG, a81.l("initRecording(sampleRate=", i, ", channels=", i2, ")"));
        if (this.voiceAudioRecord != null) {
            reportWebRtcAudioRecordInitError("InitRecording called twice without StopRecording.");
            return -1;
        }
        int i3 = i / 100;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(getBytesPerSample(this.audioFormat) * i2 * i3);
        this.byteBuffer = allocateDirect;
        if (!allocateDirect.hasArray()) {
            reportWebRtcAudioRecordInitError("ByteBuffer does not have backing array.");
            return -1;
        }
        int capacity = this.byteBuffer.capacity();
        Logging.d(TAG, "byteBuffer.capacity: " + capacity);
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.nativeAudioRecord, this.byteBuffer);
        if (this.isSilenceProviderSupported) {
            this.silenceProvider = new WebRtcSilenceProvider(this.audioFormat, i, i2, i3, this.byteBuffer.capacity(), this.emptyBytes);
        }
        if (doAudioRecordInit(i, i2)) {
            return -1;
        }
        logMainParameters(this.voiceAudioRecord);
        logMainParametersExtended(this.voiceAudioRecord);
        int logRecordingConfigurations = logRecordingConfigurations(this.voiceAudioRecord, false);
        if (logRecordingConfigurations != 0) {
            Logging.w(TAG, "Potential microphone conflict. Active sessions: " + logRecordingConfigurations);
        }
        if (this.mediaProjection != null && this.deviceAudioRecord == null) {
            initDeviceAudioRecord(this.mediaProjection);
        }
        return i3;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ String lambda$scheduleLogRecordingConfigurationsTask$0(AudioRecord audioRecord) throws Exception {
        if (this.voiceAudioRecord == audioRecord) {
            logRecordingConfigurations(audioRecord, true);
            return "Scheduled task is done";
        }
        Logging.d(TAG, "audio record has changed");
        return "Scheduled task is done";
    }

    @TargetApi(24)
    private static boolean logActiveRecordingConfigs(int i, List<AudioRecordingConfiguration> list) {
        assertTrue(!list.isEmpty());
        Logging.d(TAG, "AudioRecordingConfigurations: ");
        for (AudioRecordingConfiguration next : list) {
            StringBuilder sb = new StringBuilder("  client audio source=");
            sb.append(WebRtcAudioUtils.audioSourceToString(next.getClientAudioSource()));
            sb.append(", client session id=");
            sb.append(next.getClientAudioSessionId());
            sb.append(" (");
            sb.append(i);
            sb.append(")\n  Device AudioFormat: channel count=");
            AudioFormat format = next.getFormat();
            sb.append(format.getChannelCount());
            sb.append(", channel index mask=");
            sb.append(format.getChannelIndexMask());
            sb.append(", channel mask=");
            sb.append(WebRtcAudioUtils.channelMaskToString(format.getChannelMask()));
            sb.append(", encoding=");
            sb.append(WebRtcAudioUtils.audioEncodingToString(format.getEncoding()));
            sb.append(", sample rate=");
            sb.append(format.getSampleRate());
            sb.append("\n  Client AudioFormat: channel count=");
            AudioFormat clientFormat = next.getClientFormat();
            sb.append(clientFormat.getChannelCount());
            sb.append(", channel index mask=");
            sb.append(clientFormat.getChannelIndexMask());
            sb.append(", channel mask=");
            sb.append(WebRtcAudioUtils.channelMaskToString(clientFormat.getChannelMask()));
            sb.append(", encoding=");
            sb.append(WebRtcAudioUtils.audioEncodingToString(clientFormat.getEncoding()));
            sb.append(", sample rate=");
            sb.append(clientFormat.getSampleRate());
            sb.append("\n");
            AudioDeviceInfo audioDevice = next.getAudioDevice();
            if (audioDevice != null) {
                assertTrue(audioDevice.isSource());
                sb.append("  AudioDevice: type=");
                sb.append(WebRtcAudioUtils.deviceTypeToString(audioDevice.getType()));
                sb.append(", id=");
                sb.append(audioDevice.getId());
            }
            Logging.d(TAG, sb.toString());
        }
        return true;
    }

    private void logMainParameters(AudioRecord audioRecord) {
        if (audioRecord != null) {
            int audioSessionId = audioRecord.getAudioSessionId();
            int channelCount = audioRecord.getChannelCount();
            int sampleRate = audioRecord.getSampleRate();
            StringBuilder n = a81.n("AudioRecord: session ID: ", audioSessionId, ", channels: ", channelCount, ", sample rate: ");
            n.append(sampleRate);
            Logging.d(TAG, n.toString());
        }
    }

    @TargetApi(23)
    private void logMainParametersExtended(AudioRecord audioRecord) {
        if (audioRecord != null) {
            int bufferSizeInFrames = audioRecord.getBufferSizeInFrames();
            Logging.d(TAG, "AudioRecord: buffer size in frames: " + bufferSizeInFrames);
        }
    }

    @TargetApi(24)
    private int logRecordingConfigurations(AudioRecord audioRecord, boolean z) {
        if (audioRecord == null) {
            return 0;
        }
        List<AudioRecordingConfiguration> activeRecordingConfigurations = this.audioManager.getActiveRecordingConfigurations();
        int size = activeRecordingConfigurations.size();
        Logging.d(TAG, "Number of active recording sessions: " + size);
        if (size > 0) {
            logActiveRecordingConfigs(audioRecord.getAudioSessionId(), activeRecordingConfigurations);
            if (z) {
                this.audioSourceMatchesRecordingSessionRef.set(Boolean.valueOf(verifyAudioConfig(audioRecord.getAudioSource(), audioRecord.getAudioSessionId(), audioRecord.getFormat(), audioRecord.getRoutedDevice(), activeRecordingConfigurations)));
            }
        }
        return size;
    }

    private native void nativeCacheDirectBufferAddress(long j, ByteBuffer byteBuffer2);

    /* access modifiers changed from: private */
    public native void nativeDataIsRecorded(long j, int i, long j2);

    private native void nativeDeviceCacheDirectBufferAddress(long j, ByteBuffer byteBuffer2);

    /* access modifiers changed from: private */
    public native void nativeDeviceDataIsRecorded(long j, int i, long j2);

    public static ScheduledExecutorService newDefaultScheduler() {
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        return Executors.newScheduledThreadPool(0, new ThreadFactory() {
            public Thread newThread(Runnable runnable) {
                Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                int andIncrement = WebRtcAudioRecord.nextSchedulerId.getAndIncrement();
                int andIncrement2 = atomicInteger.getAndIncrement();
                newThread.setName("WebRtcAudioRecordScheduler-" + andIncrement + "-" + andIncrement2);
                return newThread;
            }
        });
    }

    private void releaseAudioResources(boolean z) {
        Logging.d(TAG, "releaseAudioResources");
        if (z) {
            if (this.deviceAudioRecord != null) {
                this.deviceAudioRecord.release();
                this.deviceAudioRecord = null;
            }
        } else if (this.voiceAudioRecord != null) {
            this.voiceAudioRecord.release();
            this.voiceAudioRecord = null;
        }
        this.audioSourceMatchesRecordingSessionRef.set((Object) null);
    }

    /* access modifiers changed from: private */
    public void reportWebRtcAudioRecordError(String str) {
        Logging.e(TAG, "Run-time recording error: " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback = this.errorCallback;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.onWebRtcAudioRecordError(str);
        }
    }

    private void reportWebRtcAudioRecordInitError(String str) {
        Logging.e(TAG, "Init recording error: " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        logRecordingConfigurations(this.voiceAudioRecord, false);
        JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback = this.errorCallback;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.onWebRtcAudioRecordInitError(str);
        }
    }

    private void reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        Logging.e(TAG, "Start recording error: " + audioRecordStartErrorCode + ". " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        logRecordingConfigurations(this.voiceAudioRecord, false);
        JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback = this.errorCallback;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.onWebRtcAudioRecordStartError(audioRecordStartErrorCode, str);
        }
    }

    private void scheduleLogRecordingConfigurationsTask(AudioRecord audioRecord) {
        if (audioRecord == null) {
            Logging.d(TAG, "scheduleLogRecordingConfigurationsTask: null audio record, ignore");
            return;
        }
        Logging.d(TAG, "scheduleLogRecordingConfigurationsTask");
        z52 z52 = new z52(13, this, audioRecord);
        ScheduledFuture<String> scheduledFuture = this.future;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.future.cancel(true);
        }
        this.future = this.executor.schedule(z52, 100, TimeUnit.MILLISECONDS);
    }

    private void startAudioStuff(RecordState recordState2) {
        int i = AnonymousClass2.$SwitchMap$org$webrtc$audio$WebRtcAudioRecord$RecordState[recordState2.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (doAudioRecordInit(this.initSampleRate, this.initChannels)) {
                        Logging.e(TAG, "init failed");
                    } else if (doAudioRecordStart()) {
                        Logging.e(TAG, "start failed");
                    } else {
                        doAudioRecordStop(false);
                    }
                }
            } else if (doAudioRecordInit(this.initSampleRate, this.initChannels)) {
                Logging.e(TAG, "init failed");
            }
        } else if (doAudioRecordInit(this.initSampleRate, this.initChannels)) {
            Logging.e(TAG, "init failed");
        } else if (doAudioRecordStart()) {
            Logging.e(TAG, "start failed");
        }
    }

    @CalledByNative
    private boolean startRecording() {
        Logging.d(TAG, "startRecording");
        assertTrue((this.voiceAudioRecord == null && this.silenceProvider == null) ? false : true);
        assertTrue(this.audioThread == null);
        if (doAudioRecordStart()) {
            return false;
        }
        AudioRecordThread audioRecordThread = new AudioRecordThread("AudioRecordJavaThread");
        this.audioThread = audioRecordThread;
        audioRecordThread.start();
        scheduleLogRecordingConfigurationsTask(this.voiceAudioRecord);
        return true;
    }

    private void stopAudioStuff() {
        int i = AnonymousClass2.$SwitchMap$org$webrtc$audio$WebRtcAudioRecord$RecordState[this.recordState.ordinal()];
        if (i == 1) {
            doAudioRecordStop(true);
        } else if (!(i == 2 || i == 3)) {
            return;
        }
        doAudioRecordRelease();
    }

    @CalledByNative
    private boolean stopRecording() {
        Logging.d(TAG, "stopRecording");
        assertTrue(this.audioThread != null);
        ScheduledFuture<String> scheduledFuture = this.future;
        if (scheduledFuture != null) {
            if (!scheduledFuture.isDone()) {
                this.future.cancel(true);
            }
            this.future = null;
        }
        this.audioThread.stopThread();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, 2000)) {
            Logging.e(TAG, "Join of AudioRecordJavaThread timed out");
            WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        }
        this.audioThread = null;
        doAudioRecordRelease();
        return true;
    }

    @TargetApi(24)
    private static boolean verifyAudioConfig(int i, int i2, AudioFormat audioFormat2, AudioDeviceInfo audioDeviceInfo, List<AudioRecordingConfiguration> list) {
        assertTrue(!list.isEmpty());
        for (AudioRecordingConfiguration next : list) {
            AudioDeviceInfo audioDevice = next.getAudioDevice();
            if (audioDevice != null && next.getClientAudioSource() == i && next.getClientAudioSessionId() == i2 && next.getClientFormat().getEncoding() == audioFormat2.getEncoding() && next.getClientFormat().getSampleRate() == audioFormat2.getSampleRate() && next.getClientFormat().getChannelMask() == audioFormat2.getChannelMask() && next.getClientFormat().getChannelIndexMask() == audioFormat2.getChannelIndexMask() && next.getFormat().getEncoding() != 0 && next.getFormat().getSampleRate() > 0) {
                if (!(next.getFormat().getChannelMask() == 0 && next.getFormat().getChannelIndexMask() == 0) && checkDeviceMatch(audioDevice, audioDeviceInfo)) {
                    Logging.d(TAG, "verifyAudioConfig: PASS");
                    return true;
                }
            }
        }
        Logging.e(TAG, "verifyAudioConfig: FAILED");
        return false;
    }

    @TargetApi(29)
    public void initDeviceAudioRecord(MediaProjection mediaProjection2) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((this.initSampleRate / 100) * this.initChannels * getBytesPerSample(this.audioFormat));
        this.deviceByteBuffer = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        nativeDeviceCacheDirectBufferAddress(this.nativeAudioRecord, this.deviceByteBuffer);
        int channelCountToConfiguration = channelCountToConfiguration(this.initChannels);
        int minBufferSize = AudioRecord.getMinBufferSize(this.initSampleRate, channelCountToConfiguration, this.audioFormat);
        if (minBufferSize == -1 || minBufferSize == -2) {
            reportWebRtcAudioRecordInitError(wj6.h(minBufferSize, "AudioRecord.getMinBufferSize failed: "));
            return;
        }
        int max = Math.max(minBufferSize * 2, this.deviceByteBuffer.capacity());
        try {
            AudioPlaybackCaptureConfiguration.Builder builder = new AudioPlaybackCaptureConfiguration.Builder(mediaProjection2);
            builder.addMatchingUsage(1);
            builder.addMatchingUsage(14);
            AudioRecord.Builder builder2 = new AudioRecord.Builder();
            builder2.setAudioPlaybackCaptureConfig(builder.build());
            builder2.setAudioFormat(new AudioFormat.Builder().setChannelMask(channelCountToConfiguration).setSampleRate(this.initSampleRate).setEncoding(2).build());
            builder2.setBufferSizeInBytes(max);
            this.deviceAudioRecord = builder2.build();
            this.mediaProjection = mediaProjection2;
            if (this.deviceAudioRecord == null || this.deviceAudioRecord.getState() != 1) {
                reportWebRtcAudioRecordInitError("Failed to create a new device AudioRecord instance");
                releaseAudioResources(true);
                return;
            }
            try {
                this.deviceAudioRecord.startRecording();
                if (this.deviceAudioRecord.getRecordingState() != 3) {
                    reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH, wj6.h(this.deviceAudioRecord.getRecordingState(), "device AudioRecord.startRecording failed - incorrect state :"));
                }
            } catch (IllegalStateException e) {
                reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION, a81.m("device AudioRecord.startRecording failed: ", e.getMessage()));
            }
        } catch (Throwable th) {
            reportWebRtcAudioRecordInitError(a81.m("device AudioRecord ctor error: ", th.getMessage()));
            releaseAudioResources(true);
        }
    }

    @CalledByNative
    public boolean isAcousticEchoCancelerSupported() {
        return this.isAcousticEchoCancelerSupported;
    }

    @CalledByNative
    public boolean isAudioConfigVerified() {
        return this.audioSourceMatchesRecordingSessionRef.get() != null;
    }

    @CalledByNative
    public boolean isAudioSourceMatchingRecordingSession() {
        Boolean bool = this.audioSourceMatchesRecordingSessionRef.get();
        if (bool != null) {
            return bool.booleanValue();
        }
        Logging.w(TAG, "Audio configuration has not yet been verified");
        return false;
    }

    @CalledByNative
    public boolean isNoiseSuppressorSupported() {
        return this.isNoiseSuppressorSupported;
    }

    public void restartAudioRecording() {
        synchronized (this.recordSwapLock) {
            if (this.voiceAudioRecord == null) {
                if (this.silenceProvider != null) {
                    Logging.d(TAG, "Try to restart audio recording. Target state is " + this.recordState);
                    synchronized (this.recordSwapLock) {
                        RecordState recordState2 = this.recordState;
                        stopAudioStuff();
                        startAudioStuff(recordState2);
                    }
                    return;
                }
            }
            boolean z = false;
            boolean z2 = this.voiceAudioRecord != null;
            if (this.silenceProvider == null) {
                z = true;
            }
            Logging.d(TAG, "Audio record is initialized already (" + z2 + ") or silence provider was not created (" + z + ")");
        }
    }

    public void setMicrophoneMute(boolean z) {
        Logging.w(TAG, "setMicrophoneMute(" + z + ")");
        this.microphoneMute = z;
    }

    @CalledByNative
    public void setNativeAudioRecord(long j) {
        this.nativeAudioRecord = j;
    }

    public boolean setNoiseSuppressorEnabled(boolean z) {
        if (!WebRtcAudioEffects.isNoiseSuppressorSupported()) {
            Logging.e(TAG, "Noise suppressor is not supported.");
            return false;
        }
        Logging.w(TAG, "SetNoiseSuppressorEnabled(" + z + ")");
        return this.effects.toggleNS(z);
    }

    public void setOneAnnNoiseSuppressorEnabled(boolean z) {
        if (this.effects.nsEnabled() != z) {
            synchronized (this.recordSwapLock) {
                RecordState recordState2 = this.recordState;
                stopAudioStuff();
                enableBuiltInNS(z);
                startAudioStuff(recordState2);
            }
        }
    }

    @TargetApi(23)
    public void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        Integer valueOf = audioDeviceInfo != null ? Integer.valueOf(audioDeviceInfo.getId()) : null;
        Logging.d(TAG, "setPreferredDevice " + valueOf);
        this.preferredDevice = audioDeviceInfo;
        if (this.voiceAudioRecord != null && !this.voiceAudioRecord.setPreferredDevice(audioDeviceInfo)) {
            Logging.e(TAG, "setPreferredDevice failed");
        }
    }

    @TargetApi(29)
    public void stopDeviceAudioRecord() {
        this.mediaProjection = null;
        if (this.deviceAudioRecord != null) {
            try {
                this.deviceAudioRecord.stop();
            } catch (Throwable unused) {
                Logging.d(TAG, "error stopDeviceAudioRecord");
            }
            releaseAudioResources(true);
        }
    }

    public WebRtcAudioRecord(Context context2, ScheduledExecutorService scheduledExecutorService, AudioManager audioManager2, int i, int i2, JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback, JavaAudioDeviceModule.AudioRecordStateCallback audioRecordStateCallback, JavaAudioDeviceModule.SamplesReadyCallback samplesReadyCallback, JavaAudioDeviceModule.AudioRecordSampleHook audioRecordSampleHook2, boolean z, boolean z2, boolean z3) {
        this.effects = new WebRtcAudioEffects();
        this.audioSourceMatchesRecordingSessionRef = new AtomicReference<>();
        this.recordState = RecordState.NONE;
        this.recordSwapLock = new Object();
        if (z && !WebRtcAudioEffects.isAcousticEchoCancelerSupported()) {
            throw new IllegalArgumentException("HW AEC not supported");
        } else if (!z2 || WebRtcAudioEffects.isNoiseSuppressorSupported()) {
            this.context = context2;
            this.executor = scheduledExecutorService;
            this.audioManager = audioManager2;
            this.audioSource = i;
            this.audioFormat = i2;
            this.errorCallback = audioRecordErrorCallback;
            this.stateCallback = audioRecordStateCallback;
            this.audioSamplesReadyCallback = samplesReadyCallback;
            this.audioRecordSampleHook = audioRecordSampleHook2;
            this.isAcousticEchoCancelerSupported = z;
            this.isNoiseSuppressorSupported = z2;
            this.isSilenceProviderSupported = z3;
            String threadInfo = WebRtcAudioUtils.getThreadInfo();
            Logging.d(TAG, "ctor" + threadInfo);
        } else {
            throw new IllegalArgumentException("HW NS not supported");
        }
    }
}
