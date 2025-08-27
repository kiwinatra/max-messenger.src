package ru.ok.android.externcalls.sdk.audio.internal.impl;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.view.KeyEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.webrtc.MediaStreamTrack;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.externcalls.sdk.audio.Logger;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 )2\u00020\u0001:\u0002)*B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ'\u0010\u0016\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\f2\u000e\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001a0\u0019H\u0003¢\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u0015H\u0002J\u0012\u0010\u001d\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\fH\u0003J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0003J\u0018\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!H\u0003J\b\u0010$\u001a\u00020\u001fH\u0007J\b\u0010%\u001a\u00020\u001fH\u0007J\u0018\u0010&\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020!H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager;", "", "context", "Landroid/content/Context;", "callsAudioManager", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsAudioManagerV2Impl;", "logger", "Lru/ok/android/externcalls/sdk/audio/Logger;", "(Landroid/content/Context;Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsAudioManagerV2Impl;Lru/ok/android/externcalls/sdk/audio/Logger;)V", "audioManager", "Landroid/media/AudioManager;", "connectedDeviceName", "", "getConnectedDeviceName", "()Ljava/lang/String;", "headsetReceiver", "Landroid/content/BroadcastReceiver;", "isWiredHeadsetPlugged", "", "()Z", "wiredHeadsetState", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager$WiredHeadsetState;", "getDeviceNameByPortName", "pluggedDevicePort", "devices", "", "Landroid/media/AudioDeviceInfo;", "(Ljava/lang/String;[Landroid/media/AudioDeviceInfo;)Ljava/lang/String;", "getWiredHeadsetStateSdk27", "getWiredHeadsetStateSdk28", "handleHeadsetPlugAction", "", "intent", "Landroid/content/Intent;", "onReceiveBroadcast", "broadcastReceiver", "start", "stop", "updateWiredHeadsetState", "plugged", "action", "Companion", "WiredHeadsetState", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CallsWiredHeadsetManager {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String LOG_TAG = "CallsWiredHeadsetManager";
    private final AudioManager audioManager;
    private final CallsAudioManagerV2Impl callsAudioManager;
    private final Context context;
    private final BroadcastReceiver headsetReceiver;
    private final Logger logger;
    private volatile WiredHeadsetState wiredHeadsetState = WiredHeadsetState.None.INSTANCE;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager$Companion;", "", "()V", "LOG_TAG", "", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager$WiredHeadsetState;", "", "None", "Plugged", "Unplugged", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager$WiredHeadsetState$None;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager$WiredHeadsetState$Plugged;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager$WiredHeadsetState$Unplugged;", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface WiredHeadsetState {

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager$WiredHeadsetState$None;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager$WiredHeadsetState;", "()V", "toString", "", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class None implements WiredHeadsetState {
            public static final None INSTANCE = new None();

            private None() {
            }

            public String toString() {
                return "Uninitialized";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\b\u0010\u000f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager$WiredHeadsetState$Plugged;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager$WiredHeadsetState;", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Plugged implements WiredHeadsetState {
            private final String name;

            public Plugged() {
                this((String) null, 1, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ Plugged copy$default(Plugged plugged, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = plugged.name;
                }
                return plugged.copy(str);
            }

            public final String component1() {
                return this.name;
            }

            public final Plugged copy(String str) {
                return new Plugged(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Plugged) && Intrinsics.areEqual((Object) this.name, (Object) ((Plugged) obj).name);
            }

            public final String getName() {
                return this.name;
            }

            public int hashCode() {
                return this.name.hashCode();
            }

            public String toString() {
                return wj6.k("Plugged(name=", this.name, ")");
            }

            public Plugged(String str) {
                this.name = str;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Plugged(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager$WiredHeadsetState$Unplugged;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager$WiredHeadsetState;", "()V", "toString", "", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Unplugged implements WiredHeadsetState {
            public static final Unplugged INSTANCE = new Unplugged();

            private Unplugged() {
            }

            public String toString() {
                return "Unplugged";
            }
        }
    }

    public CallsWiredHeadsetManager(Context context2, CallsAudioManagerV2Impl callsAudioManagerV2Impl, Logger logger2) {
        this.context = context2;
        this.callsAudioManager = callsAudioManagerV2Impl;
        this.logger = logger2;
        this.audioManager = (AudioManager) context2.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        this.headsetReceiver = new CallsWiredHeadsetManager$headsetReceiver$1(this);
    }

    @TargetApi(23)
    private final String getDeviceNameByPortName(String str, AudioDeviceInfo[] audioDeviceInfoArr) {
        String str2 = CallsAudioDeviceInfo.WIRED_HEADPHONES;
        if (str == null) {
            return str2;
        }
        this.logger.v(LOG_TAG, "Looking for a used wired device using port name ".concat(str));
        int length = audioDeviceInfoArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            AudioDeviceInfo audioDeviceInfo = audioDeviceInfoArr[i];
            if (Intrinsics.areEqual((Object) audioDeviceInfo.getProductName(), (Object) str)) {
                int type = audioDeviceInfo.getType();
                if (type == 3) {
                    str2 = CallsAudioDeviceInfo.WIRED_HEADSET;
                } else if (type == 11 || type == 22) {
                    str2 = CallsAudioDeviceInfo.USB_HEADSET;
                }
                Logger logger2 = this.logger;
                logger2.v(LOG_TAG, "Matching device found " + audioDeviceInfo);
            } else {
                i++;
            }
        }
        return str2;
    }

    private final WiredHeadsetState getWiredHeadsetStateSdk27() {
        return this.audioManager.isWiredHeadsetOn() ? new WiredHeadsetState.Plugged("") : WiredHeadsetState.Unplugged.INSTANCE;
    }

    @TargetApi(28)
    private final WiredHeadsetState getWiredHeadsetStateSdk28(String str) {
        try {
            AudioDeviceInfo[] devices = this.audioManager.getDevices(2);
            int length = devices.length;
            int i = 0;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            while (true) {
                if (i < length) {
                    int type = devices[i].getType();
                    if (type == 3) {
                        z2 = true;
                    } else if (type == 4) {
                        z3 = true;
                    } else if (type == 11 || type == 22) {
                        z = true;
                    }
                    if (z && z2 && z3) {
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
            this.logger.v(LOG_TAG, "Wired device connectivity check: usb=" + z + " headset=" + z2 + " phones=" + z3);
            if (!z && !z3) {
                if (!z2) {
                    return WiredHeadsetState.Unplugged.INSTANCE;
                }
            }
            return new WiredHeadsetState.Plugged(((z2 || z3) && z) ? getDeviceNameByPortName(str, devices) : z ? CallsAudioDeviceInfo.USB_HEADSET : z2 ? CallsAudioDeviceInfo.WIRED_HEADSET : CallsAudioDeviceInfo.WIRED_HEADPHONES);
        } catch (Throwable th) {
            this.logger.reportError(LOG_TAG, "Can't detect audio device name", th);
            return WiredHeadsetState.Unplugged.INSTANCE;
        }
    }

    private final void handleHeadsetPlugAction(Intent intent) {
        int intExtra = intent.getIntExtra("state", -1);
        boolean z = true;
        if (intExtra == 0 || intExtra == 1) {
            if (intExtra != 1) {
                z = false;
            }
            updateWiredHeadsetState(z, intent);
            return;
        }
        this.logger.e(LOG_TAG, "unknown headset state received");
    }

    /* access modifiers changed from: private */
    public final void onReceiveBroadcast(BroadcastReceiver broadcastReceiver, Intent intent) {
        KeyEvent keyEvent;
        Logger logger2 = this.logger;
        logger2.v(LOG_TAG, "CAM got " + intent);
        String action = intent.getAction();
        if (Intrinsics.areEqual((Object) "android.intent.action.HEADSET_PLUG", (Object) action)) {
            handleHeadsetPlugAction(intent);
        } else if (Intrinsics.areEqual((Object) "android.intent.action.MEDIA_BUTTON", (Object) action) && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 5 || keyCode == 6 || keyCode == 79 || keyCode == 126 || keyCode == 127) {
                try {
                    broadcastReceiver.abortBroadcast();
                } catch (Exception e) {
                    Logger logger3 = this.logger;
                    logger3.e(LOG_TAG, "onReceiveBroadcast: failed to abort broadcast, e: " + e);
                }
            }
        }
    }

    private final void updateWiredHeadsetState(boolean z, Intent intent) {
        String stringExtra = intent.getStringExtra("name");
        String stringExtra2 = intent.getStringExtra("portName");
        boolean z2 = intent.getIntExtra("microphone", 0) == 1;
        if (z) {
            Logger logger2 = this.logger;
            StringBuilder r = rae.r("Wired device plugged: name=", stringExtra, " port=", stringExtra2, " hasMic=");
            r.append(z2);
            logger2.v(LOG_TAG, r.toString());
        } else {
            Logger logger3 = this.logger;
            StringBuilder r2 = rae.r("Wired device unplugged: name=", stringExtra, " port=", stringExtra2, " hasMic=");
            r2.append(z2);
            logger3.v(LOG_TAG, r2.toString());
        }
        if (!z) {
            stringExtra2 = null;
        }
        this.wiredHeadsetState = getWiredHeadsetStateSdk28(stringExtra2);
        if (this.wiredHeadsetState instanceof WiredHeadsetState.Plugged) {
            this.callsAudioManager.setSpeakerEnabled$calls_audiomanager_release(false, false);
        } else {
            CallsAudioManagerV2Impl.selectPreferredAudioDevice$calls_audiomanager_release$default(this.callsAudioManager, false, 1, (Object) null);
        }
    }

    public final String getConnectedDeviceName() {
        WiredHeadsetState wiredHeadsetState2 = this.wiredHeadsetState;
        return wiredHeadsetState2 instanceof WiredHeadsetState.Plugged ? ((WiredHeadsetState.Plugged) wiredHeadsetState2).getName() : "";
    }

    public final boolean isWiredHeadsetPlugged() {
        return this.wiredHeadsetState instanceof WiredHeadsetState.Plugged;
    }

    public final void start() {
        this.logger.v(LOG_TAG, "start tracking headset");
        if (!(this.wiredHeadsetState instanceof WiredHeadsetState.None)) {
            this.logger.e(LOG_TAG, "already started, ignore");
            return;
        }
        this.wiredHeadsetState = WiredHeadsetState.Unplugged.INSTANCE;
        this.context.registerReceiver(this.headsetReceiver, new IntentFilter("android.intent.action.HEADSET_PLUG"), (String) null, this.callsAudioManager.getWorkerThreadHandler$calls_audiomanager_release());
    }

    public final void stop() {
        this.logger.v(LOG_TAG, "stop tracking headset");
        if (this.wiredHeadsetState instanceof WiredHeadsetState.None) {
            this.logger.e(LOG_TAG, "already stopped, ignore");
            return;
        }
        this.wiredHeadsetState = WiredHeadsetState.None.INSTANCE;
        this.context.unregisterReceiver(this.headsetReceiver);
    }
}
