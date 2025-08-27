package org.webrtc;

import android.content.Context;
import android.os.Process;
import java.util.List;
import java.util.Set;
import org.webrtc.Logging;
import org.webrtc.MediaStreamTrack;
import org.webrtc.NativeDoubleArrayConsumer;
import org.webrtc.NativeLibrary;
import org.webrtc.PeerConnection;
import org.webrtc.audio.AudioDeviceModule;
import org.webrtc.audio.JavaAudioDeviceModule;

public class PeerConnectionFactory {
    private static final String TAG = "PeerConnectionFactory";
    public static final String TRIAL_ENABLED = "Enabled";
    private static final String VIDEO_CAPTURER_THREAD_NAME = "VideoCapturerThread";
    @Deprecated
    public static final String VIDEO_FRAME_EMIT_TRIAL = "VideoFrameEmit";
    private static volatile boolean internalTracerInitialized;
    private static ThreadInfo staticNetworkThread;
    private static ThreadInfo staticSignalingThread;
    private static ThreadInfo staticWorkerThread;
    private long nativeFactory;
    private volatile ThreadInfo networkThread;
    private volatile ThreadInfo signalingThread;
    private volatile ThreadInfo workerThread;

    public static class Builder {
        private AudioDecoderFactoryFactory audioDecoderFactoryFactory;
        private AudioDeviceModule audioDeviceModule;
        private AudioEncoderFactoryFactory audioEncoderFactoryFactory;
        private AudioProcessingFactory audioProcessingFactory;
        private FecControllerFactoryFactoryInterface fecControllerFactoryFactory;
        private NetEqFactoryFactory neteqFactoryFactory;
        private NetworkControllerFactoryFactory networkControllerFactoryFactory;
        private NetworkStatePredictorFactoryFactory networkStatePredictorFactoryFactory;
        private Options options;
        private VideoDecoderFactory videoDecoderFactory;
        private VideoEncoderFactory videoEncoderFactory;

        public /* synthetic */ Builder(int i) {
            this();
        }

        public PeerConnectionFactory createPeerConnectionFactory() {
            PeerConnectionFactory.checkInitializeHasBeenCalled();
            if (this.audioDeviceModule == null) {
                this.audioDeviceModule = JavaAudioDeviceModule.builder(ContextUtils.getApplicationContext()).createAudioDeviceModule();
            }
            Context applicationContext = ContextUtils.getApplicationContext();
            Options options2 = this.options;
            long nativeAudioDeviceModulePointer = this.audioDeviceModule.getNativeAudioDeviceModulePointer();
            long createNativeAudioEncoderFactory = this.audioEncoderFactoryFactory.createNativeAudioEncoderFactory();
            long createNativeAudioDecoderFactory = this.audioDecoderFactoryFactory.createNativeAudioDecoderFactory();
            VideoEncoderFactory videoEncoderFactory2 = this.videoEncoderFactory;
            VideoDecoderFactory videoDecoderFactory2 = this.videoDecoderFactory;
            AudioProcessingFactory audioProcessingFactory2 = this.audioProcessingFactory;
            long createNative = audioProcessingFactory2 == null ? 0 : audioProcessingFactory2.createNative();
            FecControllerFactoryFactoryInterface fecControllerFactoryFactoryInterface = this.fecControllerFactoryFactory;
            long createNative2 = fecControllerFactoryFactoryInterface == null ? 0 : fecControllerFactoryFactoryInterface.createNative();
            NetworkControllerFactoryFactory networkControllerFactoryFactory2 = this.networkControllerFactoryFactory;
            long createNativeNetworkControllerFactory = networkControllerFactoryFactory2 == null ? 0 : networkControllerFactoryFactory2.createNativeNetworkControllerFactory();
            NetworkStatePredictorFactoryFactory networkStatePredictorFactoryFactory2 = this.networkStatePredictorFactoryFactory;
            long createNativeNetworkStatePredictorFactory = networkStatePredictorFactoryFactory2 == null ? 0 : networkStatePredictorFactoryFactory2.createNativeNetworkStatePredictorFactory();
            NetEqFactoryFactory netEqFactoryFactory = this.neteqFactoryFactory;
            return PeerConnectionFactory.nativeCreatePeerConnectionFactory(applicationContext, options2, nativeAudioDeviceModulePointer, createNativeAudioEncoderFactory, createNativeAudioDecoderFactory, videoEncoderFactory2, videoDecoderFactory2, createNative, createNative2, createNativeNetworkControllerFactory, createNativeNetworkStatePredictorFactory, netEqFactoryFactory == null ? 0 : netEqFactoryFactory.createNativeNetEqFactory());
        }

        public AudioDeviceModule getAudioDeviceModule() {
            return this.audioDeviceModule;
        }

        public Builder setAudioDecoderFactoryFactory(AudioDecoderFactoryFactory audioDecoderFactoryFactory2) {
            if (audioDecoderFactoryFactory2 != null) {
                this.audioDecoderFactoryFactory = audioDecoderFactoryFactory2;
                return this;
            }
            throw new IllegalArgumentException("PeerConnectionFactory.Builder does not accept a null AudioDecoderFactoryFactory.");
        }

        public Builder setAudioDeviceModule(AudioDeviceModule audioDeviceModule2) {
            this.audioDeviceModule = audioDeviceModule2;
            return this;
        }

        public Builder setAudioEncoderFactoryFactory(AudioEncoderFactoryFactory audioEncoderFactoryFactory2) {
            if (audioEncoderFactoryFactory2 != null) {
                this.audioEncoderFactoryFactory = audioEncoderFactoryFactory2;
                return this;
            }
            throw new IllegalArgumentException("PeerConnectionFactory.Builder does not accept a null AudioEncoderFactoryFactory.");
        }

        public Builder setAudioProcessingFactory(AudioProcessingFactory audioProcessingFactory2) {
            if (audioProcessingFactory2 != null) {
                this.audioProcessingFactory = audioProcessingFactory2;
                return this;
            }
            throw new NullPointerException("PeerConnectionFactory builder does not accept a null AudioProcessingFactory.");
        }

        public Builder setFecControllerFactoryFactoryInterface(FecControllerFactoryFactoryInterface fecControllerFactoryFactoryInterface) {
            this.fecControllerFactoryFactory = fecControllerFactoryFactoryInterface;
            return this;
        }

        public Builder setNetEqFactoryFactory(NetEqFactoryFactory netEqFactoryFactory) {
            this.neteqFactoryFactory = netEqFactoryFactory;
            return this;
        }

        public Builder setNetworkControllerFactoryFactory(NetworkControllerFactoryFactory networkControllerFactoryFactory2) {
            this.networkControllerFactoryFactory = networkControllerFactoryFactory2;
            return this;
        }

        public Builder setNetworkStatePredictorFactoryFactory(NetworkStatePredictorFactoryFactory networkStatePredictorFactoryFactory2) {
            this.networkStatePredictorFactoryFactory = networkStatePredictorFactoryFactory2;
            return this;
        }

        public Builder setOptions(Options options2) {
            this.options = options2;
            return this;
        }

        public Builder setVideoDecoderFactory(VideoDecoderFactory videoDecoderFactory2) {
            this.videoDecoderFactory = videoDecoderFactory2;
            return this;
        }

        public Builder setVideoEncoderFactory(VideoEncoderFactory videoEncoderFactory2) {
            this.videoEncoderFactory = videoEncoderFactory2;
            return this;
        }

        private Builder() {
            this.audioEncoderFactoryFactory = new BuiltinAudioEncoderFactoryFactory();
            this.audioDecoderFactoryFactory = new BuiltinAudioDecoderFactoryFactory();
        }
    }

    public enum EnhancerKind {
        NONE(0),
        BASELINE(1),
        PIPELINE(2);
        
        /* access modifiers changed from: private */
        public final int value;

        private EnhancerKind(int i) {
            this.value = i;
        }
    }

    public static class InitializationOptions {
        final Context applicationContext;
        final boolean enableInternalTracer;
        final String fieldTrials;
        Loggable loggable;
        Logging.Severity loggableSeverity;
        final NativeLibraryLoader nativeLibraryLoader;
        final String nativeLibraryName;

        public static class Builder {
            private final Context applicationContext;
            private boolean enableInternalTracer;
            private String fieldTrials = "";
            private Loggable loggable;
            private Logging.Severity loggableSeverity;
            private NativeLibraryLoader nativeLibraryLoader = new NativeLibrary.DefaultLoader();
            private String nativeLibraryName = "jingle_peerconnection_so";

            public Builder(Context context) {
                this.applicationContext = context;
            }

            public InitializationOptions createInitializationOptions() {
                return new InitializationOptions(this.applicationContext, this.fieldTrials, this.enableInternalTracer, this.nativeLibraryLoader, this.nativeLibraryName, this.loggable, this.loggableSeverity, 0);
            }

            public Builder setEnableInternalTracer(boolean z) {
                this.enableInternalTracer = z;
                return this;
            }

            public Builder setFieldTrials(String str) {
                this.fieldTrials = str;
                return this;
            }

            public Builder setInjectableLogger(Loggable loggable2, Logging.Severity severity) {
                this.loggable = loggable2;
                this.loggableSeverity = severity;
                return this;
            }

            public Builder setNativeLibraryLoader(NativeLibraryLoader nativeLibraryLoader2) {
                this.nativeLibraryLoader = nativeLibraryLoader2;
                return this;
            }

            public Builder setNativeLibraryName(String str) {
                this.nativeLibraryName = str;
                return this;
            }
        }

        public /* synthetic */ InitializationOptions(Context context, String str, boolean z, NativeLibraryLoader nativeLibraryLoader2, String str2, Loggable loggable2, Logging.Severity severity, int i) {
            this(context, str, z, nativeLibraryLoader2, str2, loggable2, severity);
        }

        public static Builder builder(Context context) {
            return new Builder(context);
        }

        private InitializationOptions(Context context, String str, boolean z, NativeLibraryLoader nativeLibraryLoader2, String str2, Loggable loggable2, Logging.Severity severity) {
            this.applicationContext = context;
            this.fieldTrials = str;
            this.enableInternalTracer = z;
            this.nativeLibraryLoader = nativeLibraryLoader2;
            this.nativeLibraryName = str2;
            this.loggable = loggable2;
            this.loggableSeverity = severity;
        }
    }

    public static class Options {
        public static final int ADAPTER_TYPE_ANY = 32;
        public static final int ADAPTER_TYPE_CELLULAR = 4;
        public static final int ADAPTER_TYPE_ETHERNET = 1;
        public static final int ADAPTER_TYPE_LOOPBACK = 16;
        public static final int ADAPTER_TYPE_UNKNOWN = 0;
        public static final int ADAPTER_TYPE_VPN = 8;
        public static final int ADAPTER_TYPE_WIFI = 2;
        public boolean disableEncryption;
        public boolean disableNetworkMonitor;
        public int networkIgnoreMask;

        @CalledByNative("Options")
        public boolean getDisableEncryption() {
            return this.disableEncryption;
        }

        @CalledByNative("Options")
        public boolean getDisableNetworkMonitor() {
            return this.disableNetworkMonitor;
        }

        @CalledByNative("Options")
        public int getNetworkIgnoreMask() {
            return this.networkIgnoreMask;
        }
    }

    public static class ThreadInfo {
        final Thread thread;
        final int tid;

        private ThreadInfo(Thread thread2, int i) {
            this.thread = thread2;
            this.tid = i;
        }

        public static ThreadInfo getCurrent() {
            return new ThreadInfo(Thread.currentThread(), Process.myTid());
        }
    }

    @CalledByNative
    public PeerConnectionFactory(long j) {
        checkInitializeHasBeenCalled();
        if (j != 0) {
            this.nativeFactory = j;
            return;
        }
        throw new RuntimeException("Failed to initialize PeerConnectionFactory!");
    }

    public static Builder builder() {
        return new Builder(0);
    }

    /* access modifiers changed from: private */
    public static void checkInitializeHasBeenCalled() {
        if (!NativeLibrary.isLoaded() || ContextUtils.getApplicationContext() == null) {
            throw new IllegalStateException("PeerConnectionFactory.initialize was not called before creating a PeerConnectionFactory.");
        }
    }

    private void checkPeerConnectionFactoryExists() {
        if (this.nativeFactory == 0) {
            throw new IllegalStateException("PeerConnectionFactory has been disposed.");
        }
    }

    public static String fieldTrialsFindFullName(String str) {
        return NativeLibrary.isLoaded() ? nativeFindFieldTrialsFullName(str) : "";
    }

    public static void initialize(InitializationOptions initializationOptions) {
        ContextUtils.initialize(initializationOptions.applicationContext);
        NativeLibrary.initialize(initializationOptions.nativeLibraryLoader, initializationOptions.nativeLibraryName);
        nativeInitializeAndroidGlobals();
        nativeInitializeFieldTrials(initializationOptions.fieldTrials);
        if (initializationOptions.enableInternalTracer && !internalTracerInitialized) {
            initializeInternalTracer();
        }
        Loggable loggable = initializationOptions.loggable;
        if (loggable != null) {
            Logging.injectLoggable(loggable, initializationOptions.loggableSeverity);
            nativeInjectLoggable(new JNILogging(initializationOptions.loggable), initializationOptions.loggableSeverity.ordinal());
            return;
        }
        Logging.d(TAG, "PeerConnectionFactory was initialized without an injected Loggable. Any existing Loggable will be deleted.");
        Logging.deleteInjectedLoggable();
        nativeDeleteLoggable();
    }

    @Deprecated
    public static void initializeFieldTrials(String str) {
        nativeInitializeFieldTrials(str);
    }

    private static void initializeInternalTracer() {
        internalTracerInitialized = true;
        nativeInitializeInternalTracer();
    }

    private static native void nativeClearDumpRequests(long j);

    private static native long nativeCreateAudioSource(long j, MediaConstraints mediaConstraints);

    private static native long nativeCreateAudioTrack(long j, String str, long j2);

    private static native long nativeCreateLocalMediaStream(long j, String str);

    private static native long nativeCreatePeerConnection(long j, PeerConnection.RTCConfiguration rTCConfiguration, MediaConstraints mediaConstraints, long j2, SSLCertificateVerifier sSLCertificateVerifier);

    /* access modifiers changed from: private */
    public static native PeerConnectionFactory nativeCreatePeerConnectionFactory(Context context, Options options, long j, long j2, long j3, VideoEncoderFactory videoEncoderFactory, VideoDecoderFactory videoDecoderFactory, long j4, long j5, long j6, long j7, long j8);

    private static native long nativeCreateVideoSource(long j, boolean z, boolean z2);

    private static native long nativeCreateVideoTrack(long j, String str, long j2);

    private static native void nativeDeleteLoggable();

    private static native String nativeFindFieldTrialsFullName(String str);

    private static native void nativeFreeFactory(long j);

    private static native long nativeGetNativePeerConnectionFactory(long j);

    private static native RtpCapabilities nativeGetRtpReceiverCapabilities(long j, MediaStreamTrack.MediaType mediaType);

    private static native RtpCapabilities nativeGetRtpSenderCapabilities(long j, MediaStreamTrack.MediaType mediaType);

    private static native void nativeInitializeAndroidGlobals();

    private static native void nativeInitializeFieldTrials(String str);

    private static native void nativeInitializeInternalTracer();

    private static native void nativeInjectLoggable(JNILogging jNILogging, int i);

    private static native void nativePrintStackTrace(int i);

    private static native void nativeSetAnimojiParams(long j, boolean z, String str, NativeDoubleArrayConsumer nativeDoubleArrayConsumer);

    private static native void nativeSetPreprocessorParams(long j, boolean z, int i, String str, int i2, int i3, int i4, int i5, int i6, boolean z2, NativeRunnable nativeRunnable);

    private static native void nativeShutdownInternalTracer();

    private static native boolean nativeStartAecDump(long j, int i, int i2);

    private static native boolean nativeStartInternalTracingCapture(String str);

    private static native void nativeStopAecDump(long j);

    private static native void nativeStopInternalTracingCapture();

    private static native void nativeSubmitDumpRequest(long j, String str, int i, int[] iArr, DumpCallback dumpCallback);

    @CalledByNative
    private void onNetworkThreadReady() {
        this.networkThread = ThreadInfo.getCurrent();
        staticNetworkThread = this.networkThread;
        Logging.d(TAG, "onNetworkThreadReady");
    }

    @CalledByNative
    private void onSignalingThreadReady() {
        this.signalingThread = ThreadInfo.getCurrent();
        staticSignalingThread = this.signalingThread;
        Logging.d(TAG, "onSignalingThreadReady");
    }

    @CalledByNative
    private void onWorkerThreadReady() {
        this.workerThread = ThreadInfo.getCurrent();
        staticWorkerThread = this.workerThread;
        Logging.d(TAG, "onWorkerThreadReady");
    }

    private static void printStackTrace(ThreadInfo threadInfo, boolean z) {
        if (threadInfo != null) {
            String name = threadInfo.thread.getName();
            StackTraceElement[] stackTrace = threadInfo.thread.getStackTrace();
            if (stackTrace.length > 0) {
                Logging.w(TAG, name + " stacktrace:");
                for (StackTraceElement stackTraceElement : stackTrace) {
                    Logging.w(TAG, stackTraceElement.toString());
                }
            }
            if (z) {
                Logging.w(TAG, "*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***");
                StringBuilder n = a81.n("pid: ", Process.myPid(), ", tid: ", threadInfo.tid, ", name: ");
                n.append(name);
                n.append("  >>> WebRTC <<<");
                Logging.w(TAG, n.toString());
                nativePrintStackTrace(threadInfo.tid);
            }
        }
    }

    @Deprecated
    public static void printStackTraces() {
        printStackTrace(staticNetworkThread, false);
        printStackTrace(staticWorkerThread, false);
        printStackTrace(staticSignalingThread, false);
    }

    public static void shutdownInternalTracer() {
        internalTracerInitialized = false;
        nativeShutdownInternalTracer();
    }

    public static boolean startInternalTracingCapture(String str) {
        return nativeStartInternalTracingCapture(str);
    }

    public static void stopInternalTracingCapture() {
        nativeStopInternalTracingCapture();
    }

    public void clearDumpRequests() {
        nativeClearDumpRequests(this.nativeFactory);
    }

    public AudioSource createAudioSource(MediaConstraints mediaConstraints) {
        checkPeerConnectionFactoryExists();
        return new AudioSource(nativeCreateAudioSource(this.nativeFactory, mediaConstraints));
    }

    public AudioTrack createAudioTrack(String str, AudioSource audioSource) {
        checkPeerConnectionFactoryExists();
        return new AudioTrack(nativeCreateAudioTrack(this.nativeFactory, str, audioSource.getNativeAudioSource()));
    }

    public MediaStream createLocalMediaStream(String str) {
        checkPeerConnectionFactoryExists();
        return new MediaStream(nativeCreateLocalMediaStream(this.nativeFactory, str));
    }

    @Deprecated
    public PeerConnection createPeerConnection(PeerConnection.RTCConfiguration rTCConfiguration, MediaConstraints mediaConstraints, PeerConnection.Observer observer) {
        return createPeerConnectionInternal(rTCConfiguration, mediaConstraints, observer, (SSLCertificateVerifier) null);
    }

    public PeerConnection createPeerConnectionInternal(PeerConnection.RTCConfiguration rTCConfiguration, MediaConstraints mediaConstraints, PeerConnection.Observer observer, SSLCertificateVerifier sSLCertificateVerifier) {
        checkPeerConnectionFactoryExists();
        long createNativePeerConnectionObserver = PeerConnection.createNativePeerConnectionObserver(observer);
        if (createNativePeerConnectionObserver == 0) {
            return null;
        }
        long nativeCreatePeerConnection = nativeCreatePeerConnection(this.nativeFactory, rTCConfiguration, mediaConstraints, createNativePeerConnectionObserver, sSLCertificateVerifier);
        if (nativeCreatePeerConnection == 0) {
            return null;
        }
        return new PeerConnection(nativeCreatePeerConnection);
    }

    public VideoSource createVideoSource(boolean z, boolean z2) {
        checkPeerConnectionFactoryExists();
        return new VideoSource(nativeCreateVideoSource(this.nativeFactory, z, z2));
    }

    public VideoTrack createVideoTrack(String str, VideoSource videoSource) {
        checkPeerConnectionFactoryExists();
        return new VideoTrack(nativeCreateVideoTrack(this.nativeFactory, str, videoSource.getNativeVideoTrackSource()));
    }

    public void dispose() {
        checkPeerConnectionFactoryExists();
        nativeFreeFactory(this.nativeFactory);
        this.networkThread = null;
        this.workerThread = null;
        this.signalingThread = null;
        this.nativeFactory = 0;
    }

    public long getNativeOwnedFactoryAndThreads() {
        checkPeerConnectionFactoryExists();
        return this.nativeFactory;
    }

    public long getNativePeerConnectionFactory() {
        checkPeerConnectionFactoryExists();
        return nativeGetNativePeerConnectionFactory(this.nativeFactory);
    }

    public RtpCapabilities getRtpReceiverCapabilities(MediaStreamTrack.MediaType mediaType) {
        checkPeerConnectionFactoryExists();
        return nativeGetRtpReceiverCapabilities(this.nativeFactory, mediaType);
    }

    public RtpCapabilities getRtpSenderCapabilities(MediaStreamTrack.MediaType mediaType) {
        checkPeerConnectionFactoryExists();
        return nativeGetRtpSenderCapabilities(this.nativeFactory, mediaType);
    }

    public void printInternalStackTraces(boolean z) {
        printStackTrace(this.signalingThread, z);
        printStackTrace(this.workerThread, z);
        printStackTrace(this.networkThread, z);
    }

    public void setAnimojiParams(boolean z, String str, NativeDoubleArrayConsumer.Consumer consumer) {
        nativeSetAnimojiParams(this.nativeFactory, z, str, new NativeDoubleArrayConsumer(consumer));
    }

    public void setPreprocessorParams(boolean z, EnhancerKind enhancerKind, String str, int i, int i2, int i3, int i4, int i5, boolean z2, Runnable runnable) {
        nativeSetPreprocessorParams(this.nativeFactory, z, (enhancerKind == null ? EnhancerKind.NONE : enhancerKind).value, str, i, i2, i3, i4, i5, z2, new NativeRunnable(runnable));
    }

    public boolean startAecDump(int i, int i2) {
        checkPeerConnectionFactoryExists();
        return nativeStartAecDump(this.nativeFactory, i, i2);
    }

    public void stopAecDump() {
        checkPeerConnectionFactoryExists();
        nativeStopAecDump(this.nativeFactory);
    }

    public void submitDumpRequest(String str, int i, DumpCallback dumpCallback) {
        submitDumpRequest(str, i, (Set<DumpSource>) null, dumpCallback);
    }

    @Deprecated
    public PeerConnection createPeerConnection(List<PeerConnection.IceServer> list, MediaConstraints mediaConstraints, PeerConnection.Observer observer) {
        PeerConnection.RTCConfiguration rTCConfiguration = new PeerConnection.RTCConfiguration(list);
        rTCConfiguration.sdpSemantics = PeerConnection.SdpSemantics.UNIFIED_PLAN;
        return createPeerConnection(rTCConfiguration, mediaConstraints, observer);
    }

    public void submitDumpRequest(String str, int i, Set<DumpSource> set, DumpCallback dumpCallback) {
        int[] iArr;
        if (set != null) {
            iArr = new int[set.size()];
            int i2 = 0;
            for (DumpSource dumpSource : set) {
                iArr[i2] = dumpSource.key;
                i2++;
            }
        } else {
            iArr = null;
        }
        nativeSubmitDumpRequest(this.nativeFactory, str, i, iArr, dumpCallback);
    }

    public VideoSource createVideoSource(boolean z) {
        return createVideoSource(z, true);
    }

    public PeerConnection createPeerConnection(List<PeerConnection.IceServer> list, PeerConnection.Observer observer) {
        PeerConnection.RTCConfiguration rTCConfiguration = new PeerConnection.RTCConfiguration(list);
        rTCConfiguration.sdpSemantics = PeerConnection.SdpSemantics.UNIFIED_PLAN;
        return createPeerConnection(rTCConfiguration, observer);
    }

    public PeerConnection createPeerConnection(PeerConnection.RTCConfiguration rTCConfiguration, PeerConnection.Observer observer) {
        return createPeerConnection(rTCConfiguration, (MediaConstraints) null, observer);
    }

    public PeerConnection createPeerConnection(PeerConnection.RTCConfiguration rTCConfiguration, PeerConnectionDependencies peerConnectionDependencies) {
        return createPeerConnectionInternal(rTCConfiguration, (MediaConstraints) null, peerConnectionDependencies.getObserver(), peerConnectionDependencies.getSSLCertificateVerifier());
    }
}
