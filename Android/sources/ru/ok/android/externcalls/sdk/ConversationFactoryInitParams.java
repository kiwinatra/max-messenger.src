package ru.ok.android.externcalls.sdk;

import android.content.Context;
import kotlin.Deprecated;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.uuid.Uuid;
import org.webrtc.NativeLibraryLoader;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams;", "", "context", "Landroid/content/Context;", "peerConnection", "Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection;", "(Landroid/content/Context;Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection;)V", "getContext", "()Landroid/content/Context;", "getPeerConnection", "()Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection;", "Builder", "PeerConnection", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ConversationFactoryInitParams {
    private final Context context;
    private final PeerConnection peerConnection;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$Builder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "peerConnection", "Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection;", "build", "Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams;", "setPeerConnection", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {
        private final Context context;
        private PeerConnection peerConnection;

        public Builder(Context context2) {
            this.context = context2;
        }

        public final ConversationFactoryInitParams build() {
            Context context2 = this.context;
            PeerConnection peerConnection2 = this.peerConnection;
            if (peerConnection2 == null) {
                peerConnection2 = new PeerConnection.Builder().build();
            }
            return new ConversationFactoryInitParams(context2, peerConnection2);
        }

        public final Builder setPeerConnection(PeerConnection peerConnection2) {
            this.peerConnection = peerConnection2;
            return this;
        }
    }

    public ConversationFactoryInitParams(Context context2, PeerConnection peerConnection2) {
        this.context = context2;
        this.peerConnection = peerConnection2;
    }

    public final Context getContext() {
        return this.context;
    }

    public final PeerConnection getPeerConnection() {
        return this.peerConnection;
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u00002\u00020\u0001:\u0003+,-B\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u0007\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\b\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b \u0010\u001aR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b!\u0010\u001aR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\r\u0010\u001fR\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u000e\u0010\u001fR\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b\u000f\u0010\u001fR\u0017\u0010\u0010\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b\u0010\u0010\u001fR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0013\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u0013\u0010\u001fR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010(\u001a\u0004\b)\u0010*¨\u0006."}, d2 = {"Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection;", "", "", "bonusFieldTrials", "", "rttMultCapMs", "", "isREDEnabledP2P", "isREDEnabledServer", "udpMarker", "tcpMarker", "Lorg/webrtc/NativeLibraryLoader;", "libraryLoader", "isEarlyAudioPlayoutEnabled", "isEarlyAudioRecordingEnabled", "isSkipRelayToNotRelayConnectionEnabled", "isOpusDREDEnabled", "Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$DynamicRedundancyParameters;", "dynamicRedundancyParams", "isOpusDREDLowBitrateEnabled", "Lvoc;", "logger", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/String;Ljava/lang/String;Lorg/webrtc/NativeLibraryLoader;ZZZZLru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$DynamicRedundancyParameters;ZLvoc;)V", "Ljava/lang/String;", "getBonusFieldTrials", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getRttMultCapMs", "()Ljava/lang/Integer;", "Z", "()Z", "getUdpMarker", "getTcpMarker", "Lorg/webrtc/NativeLibraryLoader;", "getLibraryLoader", "()Lorg/webrtc/NativeLibraryLoader;", "Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$DynamicRedundancyParameters;", "getDynamicRedundancyParams", "()Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$DynamicRedundancyParameters;", "Lvoc;", "getLogger", "()Lvoc;", "AudioAdaptationParameters", "Builder", "DynamicRedundancyParameters", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class PeerConnection {
        private final String bonusFieldTrials;
        private final DynamicRedundancyParameters dynamicRedundancyParams;
        private final boolean isEarlyAudioPlayoutEnabled;
        private final boolean isEarlyAudioRecordingEnabled;
        private final boolean isOpusDREDEnabled;
        private final boolean isOpusDREDLowBitrateEnabled;
        private final boolean isREDEnabledP2P;
        private final boolean isREDEnabledServer;
        private final boolean isSkipRelayToNotRelayConnectionEnabled;
        private final NativeLibraryLoader libraryLoader;
        private final voc logger;
        private final Integer rttMultCapMs;
        private final String tcpMarker;
        private final String udpMarker;

        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u001b\u0010\u0013J\u0017\u0010\u001c\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u001c\u0010\u0013J\u0015\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001d\u0010\u0017J\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001e\u0010\u0017J\u0015\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001f\u0010\u0017J\u0017\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010$¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b'\u0010\u0017J\r\u0010)\u001a\u00020(¢\u0006\u0004\b)\u0010*R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010+R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010,R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010-R\u0016\u0010.\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b0\u0010/R\u0018\u00101\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u0010+R\u0018\u00102\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b2\u0010+R\u0018\u00103\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b5\u0010/R\u0016\u00106\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b6\u0010/R\u0016\u00107\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b7\u0010/R\u0016\u00108\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b8\u0010/R\u0018\u00109\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b;\u0010/¨\u0006<"}, d2 = {"Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$Builder;", "", "<init>", "()V", "Lvoc;", "log", "setLogger", "(Lvoc;)Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$Builder;", "Lorg/webrtc/NativeLibraryLoader;", "libraryLoader", "setNativeLibraryLoader", "(Lorg/webrtc/NativeLibraryLoader;)Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$Builder;", "", "rttMultCapMs", "setRttMultCapMs", "(Ljava/lang/Integer;)Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$Builder;", "", "bonusFieldTrials", "setBonusFieldTrials", "(Ljava/lang/String;)Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$Builder;", "", "isEnabled", "setP2PREDEnabled", "(Z)Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$Builder;", "setServerREDEnabled", "setOpusDREDEnabled", "marker", "setUdpMarker", "setTcpMarker", "setEarlyAudioPlayoutEnabled", "setEarlyAudioRecordingEnabled", "setSkipRelayToNotRelayConnectionEnabled", "Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$AudioAdaptationParameters;", "params", "setAudioAdaptationParameters", "(Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$AudioAdaptationParameters;)Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$Builder;", "Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$DynamicRedundancyParameters;", "setDynamicRedundancyParameters", "(Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$DynamicRedundancyParameters;)Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$Builder;", "setEnableOpusDREDLowBitrateMode", "Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection;", "build", "()Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection;", "Ljava/lang/String;", "Ljava/lang/Integer;", "Lorg/webrtc/NativeLibraryLoader;", "isREDEnabledP2P", "Z", "isREDEnabledServer", "udpMarker", "tcpMarker", "logger", "Lvoc;", "isEarlyAudioPlayoutEnabled", "isEarlyAudioRecordingEnabled", "isSkipRelayToNotRelayConnectionEnabled", "isOpusDREDEnabled", "dynamicRedundancyParams", "Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$DynamicRedundancyParameters;", "isOpusDREDLowBitrateEnabled", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
        public static final class Builder {
            private String bonusFieldTrials;
            private DynamicRedundancyParameters dynamicRedundancyParams;
            private boolean isEarlyAudioPlayoutEnabled;
            private boolean isEarlyAudioRecordingEnabled;
            private boolean isOpusDREDEnabled;
            private boolean isOpusDREDLowBitrateEnabled;
            private boolean isREDEnabledP2P = true;
            private boolean isREDEnabledServer = true;
            private boolean isSkipRelayToNotRelayConnectionEnabled;
            private NativeLibraryLoader libraryLoader;
            private voc logger;
            private Integer rttMultCapMs;
            private String tcpMarker;
            private String udpMarker;

            public final PeerConnection build() {
                return new PeerConnection(this.bonusFieldTrials, this.rttMultCapMs, this.isREDEnabledP2P, this.isREDEnabledServer, this.udpMarker, this.tcpMarker, this.libraryLoader, this.isEarlyAudioPlayoutEnabled, this.isEarlyAudioRecordingEnabled, this.isSkipRelayToNotRelayConnectionEnabled, this.isOpusDREDEnabled, this.dynamicRedundancyParams, this.isOpusDREDLowBitrateEnabled, this.logger);
            }

            @Deprecated(message = "Experimental feature, don't use it anymore, will remove soon")
            public final Builder setAudioAdaptationParameters(AudioAdaptationParameters audioAdaptationParameters) {
                return this;
            }

            public final Builder setBonusFieldTrials(String str) {
                this.bonusFieldTrials = str;
                return this;
            }

            public final Builder setDynamicRedundancyParameters(DynamicRedundancyParameters dynamicRedundancyParameters) {
                this.dynamicRedundancyParams = dynamicRedundancyParameters;
                return this;
            }

            public final Builder setEarlyAudioPlayoutEnabled(boolean z) {
                this.isEarlyAudioPlayoutEnabled = z;
                return this;
            }

            public final Builder setEarlyAudioRecordingEnabled(boolean z) {
                this.isEarlyAudioRecordingEnabled = z;
                return this;
            }

            public final Builder setEnableOpusDREDLowBitrateMode(boolean z) {
                this.isOpusDREDLowBitrateEnabled = z;
                return this;
            }

            public final Builder setLogger(voc voc) {
                this.logger = voc;
                return this;
            }

            public final Builder setNativeLibraryLoader(NativeLibraryLoader nativeLibraryLoader) {
                this.libraryLoader = nativeLibraryLoader;
                return this;
            }

            public final Builder setOpusDREDEnabled(boolean z) {
                this.isOpusDREDEnabled = z;
                return this;
            }

            public final Builder setP2PREDEnabled(boolean z) {
                this.isREDEnabledP2P = z;
                return this;
            }

            public final Builder setRttMultCapMs(Integer num) {
                this.rttMultCapMs = num;
                return this;
            }

            public final Builder setServerREDEnabled(boolean z) {
                this.isREDEnabledServer = z;
                return this;
            }

            public final Builder setSkipRelayToNotRelayConnectionEnabled(boolean z) {
                this.isSkipRelayToNotRelayConnectionEnabled = z;
                return this;
            }

            public final Builder setTcpMarker(String str) {
                this.udpMarker = str;
                return this;
            }

            public final Builder setUdpMarker(String str) {
                this.udpMarker = str;
                return this;
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJl\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\t\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\b\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0012R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0007\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0013\u0010\u000eR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0014\u0010\u000eR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0015\u0010\u000e¨\u0006%"}, d2 = {"Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$DynamicRedundancyParameters;", "", "isEnabled", "", "minAudioBitrateBps", "", "dREDSwitchBitrateBps", "isNoLACEEnabled", "isDREDWithFecEnabled", "isDREDLowBitrateEnabled", "pTimeMinMs", "pTimeMaxMs", "(ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getDREDSwitchBitrateBps", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "()Z", "getMinAudioBitrateBps", "getPTimeMaxMs", "getPTimeMinMs", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;)Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$DynamicRedundancyParameters;", "equals", "other", "hashCode", "toString", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class DynamicRedundancyParameters {
            private final Integer dREDSwitchBitrateBps;
            private final Boolean isDREDLowBitrateEnabled;
            private final Boolean isDREDWithFecEnabled;
            private final boolean isEnabled;
            private final Boolean isNoLACEEnabled;
            private final Integer minAudioBitrateBps;
            private final Integer pTimeMaxMs;
            private final Integer pTimeMinMs;

            public DynamicRedundancyParameters() {
                this(false, (Integer) null, (Integer) null, (Boolean) null, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, KotlinVersion.MAX_COMPONENT_VALUE, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ DynamicRedundancyParameters copy$default(DynamicRedundancyParameters dynamicRedundancyParameters, boolean z, Integer num, Integer num2, Boolean bool, Boolean bool2, Boolean bool3, Integer num3, Integer num4, int i, Object obj) {
                DynamicRedundancyParameters dynamicRedundancyParameters2 = dynamicRedundancyParameters;
                int i2 = i;
                return dynamicRedundancyParameters.copy((i2 & 1) != 0 ? dynamicRedundancyParameters2.isEnabled : z, (i2 & 2) != 0 ? dynamicRedundancyParameters2.minAudioBitrateBps : num, (i2 & 4) != 0 ? dynamicRedundancyParameters2.dREDSwitchBitrateBps : num2, (i2 & 8) != 0 ? dynamicRedundancyParameters2.isNoLACEEnabled : bool, (i2 & 16) != 0 ? dynamicRedundancyParameters2.isDREDWithFecEnabled : bool2, (i2 & 32) != 0 ? dynamicRedundancyParameters2.isDREDLowBitrateEnabled : bool3, (i2 & 64) != 0 ? dynamicRedundancyParameters2.pTimeMinMs : num3, (i2 & Uuid.SIZE_BITS) != 0 ? dynamicRedundancyParameters2.pTimeMaxMs : num4);
            }

            public final boolean component1() {
                return this.isEnabled;
            }

            public final Integer component2() {
                return this.minAudioBitrateBps;
            }

            public final Integer component3() {
                return this.dREDSwitchBitrateBps;
            }

            public final Boolean component4() {
                return this.isNoLACEEnabled;
            }

            public final Boolean component5() {
                return this.isDREDWithFecEnabled;
            }

            public final Boolean component6() {
                return this.isDREDLowBitrateEnabled;
            }

            public final Integer component7() {
                return this.pTimeMinMs;
            }

            public final Integer component8() {
                return this.pTimeMaxMs;
            }

            public final DynamicRedundancyParameters copy(boolean z, Integer num, Integer num2, Boolean bool, Boolean bool2, Boolean bool3, Integer num3, Integer num4) {
                return new DynamicRedundancyParameters(z, num, num2, bool, bool2, bool3, num3, num4);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DynamicRedundancyParameters)) {
                    return false;
                }
                DynamicRedundancyParameters dynamicRedundancyParameters = (DynamicRedundancyParameters) obj;
                return this.isEnabled == dynamicRedundancyParameters.isEnabled && Intrinsics.areEqual((Object) this.minAudioBitrateBps, (Object) dynamicRedundancyParameters.minAudioBitrateBps) && Intrinsics.areEqual((Object) this.dREDSwitchBitrateBps, (Object) dynamicRedundancyParameters.dREDSwitchBitrateBps) && Intrinsics.areEqual((Object) this.isNoLACEEnabled, (Object) dynamicRedundancyParameters.isNoLACEEnabled) && Intrinsics.areEqual((Object) this.isDREDWithFecEnabled, (Object) dynamicRedundancyParameters.isDREDWithFecEnabled) && Intrinsics.areEqual((Object) this.isDREDLowBitrateEnabled, (Object) dynamicRedundancyParameters.isDREDLowBitrateEnabled) && Intrinsics.areEqual((Object) this.pTimeMinMs, (Object) dynamicRedundancyParameters.pTimeMinMs) && Intrinsics.areEqual((Object) this.pTimeMaxMs, (Object) dynamicRedundancyParameters.pTimeMaxMs);
            }

            public final Integer getDREDSwitchBitrateBps() {
                return this.dREDSwitchBitrateBps;
            }

            public final Integer getMinAudioBitrateBps() {
                return this.minAudioBitrateBps;
            }

            public final Integer getPTimeMaxMs() {
                return this.pTimeMaxMs;
            }

            public final Integer getPTimeMinMs() {
                return this.pTimeMinMs;
            }

            public int hashCode() {
                int hashCode = Boolean.hashCode(this.isEnabled) * 31;
                Integer num = this.minAudioBitrateBps;
                int i = 0;
                int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.dREDSwitchBitrateBps;
                int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Boolean bool = this.isNoLACEEnabled;
                int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
                Boolean bool2 = this.isDREDWithFecEnabled;
                int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                Boolean bool3 = this.isDREDLowBitrateEnabled;
                int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                Integer num3 = this.pTimeMinMs;
                int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Integer num4 = this.pTimeMaxMs;
                if (num4 != null) {
                    i = num4.hashCode();
                }
                return hashCode7 + i;
            }

            public final Boolean isDREDLowBitrateEnabled() {
                return this.isDREDLowBitrateEnabled;
            }

            public final Boolean isDREDWithFecEnabled() {
                return this.isDREDWithFecEnabled;
            }

            public final boolean isEnabled() {
                return this.isEnabled;
            }

            public final Boolean isNoLACEEnabled() {
                return this.isNoLACEEnabled;
            }

            public String toString() {
                boolean z = this.isEnabled;
                Integer num = this.minAudioBitrateBps;
                Integer num2 = this.dREDSwitchBitrateBps;
                Boolean bool = this.isNoLACEEnabled;
                Boolean bool2 = this.isDREDWithFecEnabled;
                Boolean bool3 = this.isDREDLowBitrateEnabled;
                Integer num3 = this.pTimeMinMs;
                Integer num4 = this.pTimeMaxMs;
                return "DynamicRedundancyParameters(isEnabled=" + z + ", minAudioBitrateBps=" + num + ", dREDSwitchBitrateBps=" + num2 + ", isNoLACEEnabled=" + bool + ", isDREDWithFecEnabled=" + bool2 + ", isDREDLowBitrateEnabled=" + bool3 + ", pTimeMinMs=" + num3 + ", pTimeMaxMs=" + num4 + ")";
            }

            public DynamicRedundancyParameters(boolean z, Integer num, Integer num2, Boolean bool, Boolean bool2, Boolean bool3, Integer num3, Integer num4) {
                this.isEnabled = z;
                this.minAudioBitrateBps = num;
                this.dREDSwitchBitrateBps = num2;
                this.isNoLACEEnabled = bool;
                this.isDREDWithFecEnabled = bool2;
                this.isDREDLowBitrateEnabled = bool3;
                this.pTimeMinMs = num3;
                this.pTimeMaxMs = num4;
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public /* synthetic */ DynamicRedundancyParameters(boolean r10, java.lang.Integer r11, java.lang.Integer r12, java.lang.Boolean r13, java.lang.Boolean r14, java.lang.Boolean r15, java.lang.Integer r16, java.lang.Integer r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
                /*
                    r9 = this;
                    r0 = r18
                    r1 = r0 & 1
                    if (r1 == 0) goto L_0x0008
                    r1 = 0
                    goto L_0x0009
                L_0x0008:
                    r1 = r10
                L_0x0009:
                    r2 = r0 & 2
                    r3 = 0
                    if (r2 == 0) goto L_0x0010
                    r2 = r3
                    goto L_0x0011
                L_0x0010:
                    r2 = r11
                L_0x0011:
                    r4 = r0 & 4
                    if (r4 == 0) goto L_0x0017
                    r4 = r3
                    goto L_0x0018
                L_0x0017:
                    r4 = r12
                L_0x0018:
                    r5 = r0 & 8
                    if (r5 == 0) goto L_0x001e
                    r5 = r3
                    goto L_0x001f
                L_0x001e:
                    r5 = r13
                L_0x001f:
                    r6 = r0 & 16
                    if (r6 == 0) goto L_0x0025
                    r6 = r3
                    goto L_0x0026
                L_0x0025:
                    r6 = r14
                L_0x0026:
                    r7 = r0 & 32
                    if (r7 == 0) goto L_0x002c
                    r7 = r3
                    goto L_0x002d
                L_0x002c:
                    r7 = r15
                L_0x002d:
                    r8 = r0 & 64
                    if (r8 == 0) goto L_0x0033
                    r8 = r3
                    goto L_0x0035
                L_0x0033:
                    r8 = r16
                L_0x0035:
                    r0 = r0 & 128(0x80, float:1.794E-43)
                    if (r0 == 0) goto L_0x003a
                    goto L_0x003c
                L_0x003a:
                    r3 = r17
                L_0x003c:
                    r10 = r1
                    r11 = r2
                    r12 = r4
                    r13 = r5
                    r14 = r6
                    r15 = r7
                    r16 = r8
                    r17 = r3
                    r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.ConversationFactoryInitParams.PeerConnection.DynamicRedundancyParameters.<init>(boolean, java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }
        }

        public PeerConnection(String str, Integer num, boolean z, boolean z2, String str2, String str3, NativeLibraryLoader nativeLibraryLoader, boolean z3, boolean z4, boolean z5, boolean z6, DynamicRedundancyParameters dynamicRedundancyParameters, boolean z7, voc voc) {
            this.bonusFieldTrials = str;
            this.rttMultCapMs = num;
            this.isREDEnabledP2P = z;
            this.isREDEnabledServer = z2;
            this.udpMarker = str2;
            this.tcpMarker = str3;
            this.libraryLoader = nativeLibraryLoader;
            this.isEarlyAudioPlayoutEnabled = z3;
            this.isEarlyAudioRecordingEnabled = z4;
            this.isSkipRelayToNotRelayConnectionEnabled = z5;
            this.isOpusDREDEnabled = z6;
            this.dynamicRedundancyParams = dynamicRedundancyParameters;
            this.isOpusDREDLowBitrateEnabled = z7;
            this.logger = voc;
        }

        public final String getBonusFieldTrials() {
            return this.bonusFieldTrials;
        }

        public final DynamicRedundancyParameters getDynamicRedundancyParams() {
            return this.dynamicRedundancyParams;
        }

        public final NativeLibraryLoader getLibraryLoader() {
            return this.libraryLoader;
        }

        public final voc getLogger() {
            return this.logger;
        }

        public final Integer getRttMultCapMs() {
            return this.rttMultCapMs;
        }

        public final String getTcpMarker() {
            return this.tcpMarker;
        }

        public final String getUdpMarker() {
            return this.udpMarker;
        }

        public final boolean isEarlyAudioPlayoutEnabled() {
            return this.isEarlyAudioPlayoutEnabled;
        }

        public final boolean isEarlyAudioRecordingEnabled() {
            return this.isEarlyAudioRecordingEnabled;
        }

        public final boolean isOpusDREDEnabled() {
            return this.isOpusDREDEnabled;
        }

        public final boolean isOpusDREDLowBitrateEnabled() {
            return this.isOpusDREDLowBitrateEnabled;
        }

        public final boolean isREDEnabledP2P() {
            return this.isREDEnabledP2P;
        }

        public final boolean isREDEnabledServer() {
            return this.isREDEnabledServer;
        }

        public final boolean isSkipRelayToNotRelayConnectionEnabled() {
            return this.isSkipRelayToNotRelayConnectionEnabled;
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u000eJ`\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\u00032\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0015\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0016\u0010\u0012R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018¨\u0006("}, d2 = {"Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$AudioAdaptationParameters;", "", "isEnabled", "", "minEncoderBitrateKBps", "", "minPayloadBitrateKBps", "useSlowAdaptation", "maxBitrateConstraintBps", "minBitrateConstraintBps", "bitratePriority", "", "(ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;)V", "getBitratePriority", "()Ljava/lang/Double;", "Ljava/lang/Double;", "()Z", "getMaxBitrateConstraintBps", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMinBitrateConstraintBps", "getMinEncoderBitrateKBps", "getMinPayloadBitrateKBps", "getUseSlowAdaptation", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;)Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$AudioAdaptationParameters;", "equals", "other", "hashCode", "toString", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @Deprecated(message = "Experimental feature, don't use it anymore, will remove soon")
        public static final class AudioAdaptationParameters {
            private final Double bitratePriority;
            private final boolean isEnabled;
            private final Integer maxBitrateConstraintBps;
            private final Integer minBitrateConstraintBps;
            private final Integer minEncoderBitrateKBps;
            private final Integer minPayloadBitrateKBps;
            private final Boolean useSlowAdaptation;

            public AudioAdaptationParameters(boolean z, Integer num, Integer num2, Boolean bool, Integer num3, Integer num4, Double d) {
                this.isEnabled = z;
                this.minEncoderBitrateKBps = num;
                this.minPayloadBitrateKBps = num2;
                this.useSlowAdaptation = bool;
                this.maxBitrateConstraintBps = num3;
                this.minBitrateConstraintBps = num4;
                this.bitratePriority = d;
            }

            public static /* synthetic */ AudioAdaptationParameters copy$default(AudioAdaptationParameters audioAdaptationParameters, boolean z, Integer num, Integer num2, Boolean bool, Integer num3, Integer num4, Double d, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = audioAdaptationParameters.isEnabled;
                }
                if ((i & 2) != 0) {
                    num = audioAdaptationParameters.minEncoderBitrateKBps;
                }
                Integer num5 = num;
                if ((i & 4) != 0) {
                    num2 = audioAdaptationParameters.minPayloadBitrateKBps;
                }
                Integer num6 = num2;
                if ((i & 8) != 0) {
                    bool = audioAdaptationParameters.useSlowAdaptation;
                }
                Boolean bool2 = bool;
                if ((i & 16) != 0) {
                    num3 = audioAdaptationParameters.maxBitrateConstraintBps;
                }
                Integer num7 = num3;
                if ((i & 32) != 0) {
                    num4 = audioAdaptationParameters.minBitrateConstraintBps;
                }
                Integer num8 = num4;
                if ((i & 64) != 0) {
                    d = audioAdaptationParameters.bitratePriority;
                }
                return audioAdaptationParameters.copy(z, num5, num6, bool2, num7, num8, d);
            }

            public final boolean component1() {
                return this.isEnabled;
            }

            public final Integer component2() {
                return this.minEncoderBitrateKBps;
            }

            public final Integer component3() {
                return this.minPayloadBitrateKBps;
            }

            public final Boolean component4() {
                return this.useSlowAdaptation;
            }

            public final Integer component5() {
                return this.maxBitrateConstraintBps;
            }

            public final Integer component6() {
                return this.minBitrateConstraintBps;
            }

            public final Double component7() {
                return this.bitratePriority;
            }

            public final AudioAdaptationParameters copy(boolean z, Integer num, Integer num2, Boolean bool, Integer num3, Integer num4, Double d) {
                return new AudioAdaptationParameters(z, num, num2, bool, num3, num4, d);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AudioAdaptationParameters)) {
                    return false;
                }
                AudioAdaptationParameters audioAdaptationParameters = (AudioAdaptationParameters) obj;
                return this.isEnabled == audioAdaptationParameters.isEnabled && Intrinsics.areEqual((Object) this.minEncoderBitrateKBps, (Object) audioAdaptationParameters.minEncoderBitrateKBps) && Intrinsics.areEqual((Object) this.minPayloadBitrateKBps, (Object) audioAdaptationParameters.minPayloadBitrateKBps) && Intrinsics.areEqual((Object) this.useSlowAdaptation, (Object) audioAdaptationParameters.useSlowAdaptation) && Intrinsics.areEqual((Object) this.maxBitrateConstraintBps, (Object) audioAdaptationParameters.maxBitrateConstraintBps) && Intrinsics.areEqual((Object) this.minBitrateConstraintBps, (Object) audioAdaptationParameters.minBitrateConstraintBps) && Intrinsics.areEqual((Object) this.bitratePriority, (Object) audioAdaptationParameters.bitratePriority);
            }

            public final Double getBitratePriority() {
                return this.bitratePriority;
            }

            public final Integer getMaxBitrateConstraintBps() {
                return this.maxBitrateConstraintBps;
            }

            public final Integer getMinBitrateConstraintBps() {
                return this.minBitrateConstraintBps;
            }

            public final Integer getMinEncoderBitrateKBps() {
                return this.minEncoderBitrateKBps;
            }

            public final Integer getMinPayloadBitrateKBps() {
                return this.minPayloadBitrateKBps;
            }

            public final Boolean getUseSlowAdaptation() {
                return this.useSlowAdaptation;
            }

            public int hashCode() {
                int hashCode = Boolean.hashCode(this.isEnabled) * 31;
                Integer num = this.minEncoderBitrateKBps;
                int i = 0;
                int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.minPayloadBitrateKBps;
                int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Boolean bool = this.useSlowAdaptation;
                int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
                Integer num3 = this.maxBitrateConstraintBps;
                int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Integer num4 = this.minBitrateConstraintBps;
                int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
                Double d = this.bitratePriority;
                if (d != null) {
                    i = d.hashCode();
                }
                return hashCode6 + i;
            }

            public final boolean isEnabled() {
                return this.isEnabled;
            }

            public String toString() {
                boolean z = this.isEnabled;
                Integer num = this.minEncoderBitrateKBps;
                Integer num2 = this.minPayloadBitrateKBps;
                Boolean bool = this.useSlowAdaptation;
                Integer num3 = this.maxBitrateConstraintBps;
                Integer num4 = this.minBitrateConstraintBps;
                Double d = this.bitratePriority;
                return "AudioAdaptationParameters(isEnabled=" + z + ", minEncoderBitrateKBps=" + num + ", minPayloadBitrateKBps=" + num2 + ", useSlowAdaptation=" + bool + ", maxBitrateConstraintBps=" + num3 + ", minBitrateConstraintBps=" + num4 + ", bitratePriority=" + d + ")";
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public /* synthetic */ AudioAdaptationParameters(boolean r8, java.lang.Integer r9, java.lang.Integer r10, java.lang.Boolean r11, java.lang.Integer r12, java.lang.Integer r13, java.lang.Double r14, int r15, kotlin.jvm.internal.DefaultConstructorMarker r16) {
                /*
                    r7 = this;
                    r0 = r15 & 2
                    r1 = 0
                    if (r0 == 0) goto L_0x0007
                    r0 = r1
                    goto L_0x0008
                L_0x0007:
                    r0 = r9
                L_0x0008:
                    r2 = r15 & 4
                    if (r2 == 0) goto L_0x000e
                    r2 = r1
                    goto L_0x000f
                L_0x000e:
                    r2 = r10
                L_0x000f:
                    r3 = r15 & 8
                    if (r3 == 0) goto L_0x0015
                    r3 = r1
                    goto L_0x0016
                L_0x0015:
                    r3 = r11
                L_0x0016:
                    r4 = r15 & 16
                    if (r4 == 0) goto L_0x001c
                    r4 = r1
                    goto L_0x001d
                L_0x001c:
                    r4 = r12
                L_0x001d:
                    r5 = r15 & 32
                    if (r5 == 0) goto L_0x0023
                    r5 = r1
                    goto L_0x0024
                L_0x0023:
                    r5 = r13
                L_0x0024:
                    r6 = r15 & 64
                    if (r6 == 0) goto L_0x0029
                    goto L_0x002a
                L_0x0029:
                    r1 = r14
                L_0x002a:
                    r9 = r7
                    r10 = r8
                    r11 = r0
                    r12 = r2
                    r13 = r3
                    r14 = r4
                    r15 = r5
                    r16 = r1
                    r9.<init>(r10, r11, r12, r13, r14, r15, r16)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.ConversationFactoryInitParams.PeerConnection.AudioAdaptationParameters.<init>(boolean, java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.Double, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }
        }
    }
}
