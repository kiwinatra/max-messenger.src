package ru.ok.android.externcalls.sdk.audio.internal.impl;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Build;
import android.os.Process;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.webrtc.MediaStreamTrack;
import ru.ok.android.externcalls.sdk.audio.Logger;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u0000 M2\u00020\u0001:\u0006KLMNOPB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u001f\u001a\u00020 H\u0003J\b\u0010!\u001a\u00020 H\u0003J\u0010\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020'H\u0003J$\u0010(\u001a\u00020\u001a2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010)\u001a\u0004\u0018\u00010\u00122\u0006\u0010*\u001a\u00020+H\u0002J\u0012\u0010,\u001a\u0004\u0018\u00010'2\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010-\u001a\u00020\u001aH\u0003J\b\u0010.\u001a\u00020 H\u0003J\b\u0010/\u001a\u00020 H\u0003J\u0010\u00100\u001a\u00020 2\u0006\u00101\u001a\u00020\u001aH\u0003J\u0018\u00102\u001a\u00020 2\u0006\u00103\u001a\u0002042\u0006\u00101\u001a\u00020\u001aH\u0003J\b\u00105\u001a\u00020 H\u0003J\b\u00106\u001a\u00020 H\u0003J\u0018\u00107\u001a\u00020 2\u0006\u0010*\u001a\u00020+2\u0006\u00108\u001a\u000209H\u0003J\u0010\u0010:\u001a\u00020 2\u0006\u0010*\u001a\u00020+H\u0003J\u0018\u0010;\u001a\u00020 2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020>H\u0002J\b\u0010?\u001a\u00020 H\u0007J\b\u0010@\u001a\u00020\u001aH\u0007J\u0012\u0010@\u001a\u00020\u001a2\b\b\u0002\u0010A\u001a\u00020+H\u0003J\b\u0010B\u001a\u00020 H\u0003J\b\u0010C\u001a\u00020 H\u0007J\b\u0010D\u001a\u00020 H\u0007J\u0010\u0010E\u001a\u00020 2\u0006\u0010<\u001a\u00020\u000eH\u0002J\b\u0010F\u001a\u00020 H\u0003J\u001a\u0010G\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010H\u001a\u00020\u001aH\u0003J\u001a\u0010I\u001a\u00020 2\u0006\u0010J\u001a\u00020\u00102\b\b\u0002\u0010H\u001a\u00020\u001aH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001cR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000¨\u0006Q"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager;", "", "context", "Landroid/content/Context;", "callsAudioManager", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsAudioManagerV2Impl;", "logger", "Lru/ok/android/externcalls/sdk/audio/Logger;", "(Landroid/content/Context;Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsAudioManagerV2Impl;Lru/ok/android/externcalls/sdk/audio/Logger;)V", "audioManager", "Landroid/media/AudioManager;", "bluetoothAdapter", "Landroid/bluetooth/BluetoothAdapter;", "bluetoothHeadsetReceiver", "Landroid/content/BroadcastReceiver;", "bluetoothHeadsetState", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$HeadsetState;", "bluetoothServiceListener", "Landroid/bluetooth/BluetoothProfile$ServiceListener;", "bluetoothTimeoutRunnable", "Ljava/lang/Runnable;", "connectedDeviceName", "", "getConnectedDeviceName", "()Ljava/lang/String;", "hasBluetoothHeadset", "", "getHasBluetoothHeadset", "()Z", "isBluetoothOn", "updateAudioManagerRunnable", "bluetoothTimeout", "", "cancelTimer", "closeProfileProxy", "headset", "Landroid/bluetooth/BluetoothHeadset;", "getBluetoothDeviceName", "device", "Landroid/bluetooth/BluetoothDevice;", "getBluetoothProfileProxy", "listener", "profile", "", "getConnectedBluetoothDevice", "hasPermission", "onAudioConnected", "onAudioConnecting", "onAudioDisconnected", "isInitialStickyBroadcast", "onBroadcastReceiveImpl", "intent", "Landroid/content/Intent;", "onHeadsetConnected", "onHeadsetDisconnected", "onServiceConnectedImpl", "proxy", "Landroid/bluetooth/BluetoothProfile;", "onServiceDisconnectedImpl", "registerReceiver", "receiver", "filter", "Landroid/content/IntentFilter;", "start", "startScoAudio", "attempt", "startTimer", "stop", "stopScoAudio", "unregisterReceiver", "updateAudioDeviceState", "updateCurrentConnectionState", "triggerDeviceUpdate", "updateHeadsetState", "state", "BluetoothHeadsetBroadcastReceiver", "BluetoothServiceListener", "Companion", "ConnectionState", "HeadsetState", "SCOAudioState", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CallsBluetoothManager {
    private static final int BLUETOOTH_SCO_TIMEOUT_MS = 2500;
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final String LOG_TAG = "CallsBluetoothManager";
    private static final int MAX_SCO_CONNECTION_ATTEMPTS = 3;
    private final AudioManager audioManager;
    private BluetoothAdapter bluetoothAdapter;
    private final BroadcastReceiver bluetoothHeadsetReceiver = new BluetoothHeadsetBroadcastReceiver();
    private volatile HeadsetState bluetoothHeadsetState = HeadsetState.None.INSTANCE;
    private final BluetoothProfile.ServiceListener bluetoothServiceListener = new BluetoothServiceListener();
    private final Runnable bluetoothTimeoutRunnable = new so1(this, 0);
    /* access modifiers changed from: private */
    public final CallsAudioManagerV2Impl callsAudioManager;
    private final Context context;
    /* access modifiers changed from: private */
    public final Logger logger;
    private final Runnable updateAudioManagerRunnable = new so1(this, 1);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0017¨\u0006\t"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$BluetoothHeadsetBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "(Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class BluetoothHeadsetBroadcastReceiver extends BroadcastReceiver {
        public BluetoothHeadsetBroadcastReceiver() {
        }

        public void onReceive(Context context, Intent intent) {
            CallsAudioManagerV2Impl.doOnOwnThread$calls_audiomanager_release$default(CallsBluetoothManager.this.callsAudioManager, "bluetoothBroadcastRecieved", (Function0) null, (Function1) null, new CallsBluetoothManager$BluetoothHeadsetBroadcastReceiver$onReceive$1(CallsBluetoothManager.this, intent, this), 6, (Object) null);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0017J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0017¨\u0006\n"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$BluetoothServiceListener;", "Landroid/bluetooth/BluetoothProfile$ServiceListener;", "(Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager;)V", "onServiceConnected", "", "profile", "", "proxy", "Landroid/bluetooth/BluetoothProfile;", "onServiceDisconnected", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class BluetoothServiceListener implements BluetoothProfile.ServiceListener {
        public BluetoothServiceListener() {
        }

        public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
            CallsAudioManagerV2Impl.doOnOwnThread$calls_audiomanager_release$default(CallsBluetoothManager.this.callsAudioManager, "bluetoothServiceConnected", (Function0) null, new CallsBluetoothManager$BluetoothServiceListener$onServiceConnected$1(CallsBluetoothManager.this, i), new CallsBluetoothManager$BluetoothServiceListener$onServiceConnected$2(CallsBluetoothManager.this, i, bluetoothProfile), 2, (Object) null);
        }

        public void onServiceDisconnected(int i) {
            CallsAudioManagerV2Impl.doOnOwnThread$calls_audiomanager_release$default(CallsBluetoothManager.this.callsAudioManager, "bluetoothServiceDisconnected", (Function0) null, new CallsBluetoothManager$BluetoothServiceListener$onServiceDisconnected$1(CallsBluetoothManager.this, i), new CallsBluetoothManager$BluetoothServiceListener$onServiceDisconnected$2(CallsBluetoothManager.this, i), 2, (Object) null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$Companion;", "", "()V", "BLUETOOTH_SCO_TIMEOUT_MS", "", "LOG_TAG", "", "MAX_SCO_CONNECTION_ATTEMPTS", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$ConnectionState;", "", "Connected", "Disconnected", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$ConnectionState$Connected;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$ConnectionState$Disconnected;", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface ConnectionState {

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\b\u0010\u0014\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$ConnectionState$Connected;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$ConnectionState;", "deviceName", "", "audioState", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$SCOAudioState;", "(Ljava/lang/String;Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$SCOAudioState;)V", "getAudioState", "()Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$SCOAudioState;", "getDeviceName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Connected implements ConnectionState {
            private final SCOAudioState audioState;
            private final String deviceName;

            public Connected(String str, SCOAudioState sCOAudioState) {
                this.deviceName = str;
                this.audioState = sCOAudioState;
            }

            public static /* synthetic */ Connected copy$default(Connected connected, String str, SCOAudioState sCOAudioState, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = connected.deviceName;
                }
                if ((i & 2) != 0) {
                    sCOAudioState = connected.audioState;
                }
                return connected.copy(str, sCOAudioState);
            }

            public final String component1() {
                return this.deviceName;
            }

            public final SCOAudioState component2() {
                return this.audioState;
            }

            public final Connected copy(String str, SCOAudioState sCOAudioState) {
                return new Connected(str, sCOAudioState);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Connected)) {
                    return false;
                }
                Connected connected = (Connected) obj;
                return Intrinsics.areEqual((Object) this.deviceName, (Object) connected.deviceName) && Intrinsics.areEqual((Object) this.audioState, (Object) connected.audioState);
            }

            public final SCOAudioState getAudioState() {
                return this.audioState;
            }

            public final String getDeviceName() {
                return this.deviceName;
            }

            public int hashCode() {
                return this.audioState.hashCode() + (this.deviceName.hashCode() * 31);
            }

            public String toString() {
                String str = this.deviceName;
                SCOAudioState sCOAudioState = this.audioState;
                return "Connected(device=" + str + ", audio=" + sCOAudioState + ")";
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Connected(String str, SCOAudioState sCOAudioState, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? SCOAudioState.Disconnected.INSTANCE : sCOAudioState);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$ConnectionState$Disconnected;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$ConnectionState;", "()V", "toString", "", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Disconnected implements ConnectionState {
            public static final Disconnected INSTANCE = new Disconnected();

            private Disconnected() {
            }

            public String toString() {
                return "Disconnected";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$HeadsetState;", "", "Available", "None", "Unavailable", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$HeadsetState$Available;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$HeadsetState$None;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$HeadsetState$Unavailable;", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface HeadsetState {

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$HeadsetState$Available;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$HeadsetState;", "headset", "Landroid/bluetooth/BluetoothHeadset;", "connectionState", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$ConnectionState;", "(Landroid/bluetooth/BluetoothHeadset;Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$ConnectionState;)V", "getConnectionState", "()Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$ConnectionState;", "getHeadset", "()Landroid/bluetooth/BluetoothHeadset;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Available implements HeadsetState {
            private final ConnectionState connectionState;
            private final BluetoothHeadset headset;

            public Available(BluetoothHeadset bluetoothHeadset, ConnectionState connectionState2) {
                this.headset = bluetoothHeadset;
                this.connectionState = connectionState2;
            }

            public static /* synthetic */ Available copy$default(Available available, BluetoothHeadset bluetoothHeadset, ConnectionState connectionState2, int i, Object obj) {
                if ((i & 1) != 0) {
                    bluetoothHeadset = available.headset;
                }
                if ((i & 2) != 0) {
                    connectionState2 = available.connectionState;
                }
                return available.copy(bluetoothHeadset, connectionState2);
            }

            public final BluetoothHeadset component1() {
                return this.headset;
            }

            public final ConnectionState component2() {
                return this.connectionState;
            }

            public final Available copy(BluetoothHeadset bluetoothHeadset, ConnectionState connectionState2) {
                return new Available(bluetoothHeadset, connectionState2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Available)) {
                    return false;
                }
                Available available = (Available) obj;
                return Intrinsics.areEqual((Object) this.headset, (Object) available.headset) && Intrinsics.areEqual((Object) this.connectionState, (Object) available.connectionState);
            }

            public final ConnectionState getConnectionState() {
                return this.connectionState;
            }

            public final BluetoothHeadset getHeadset() {
                return this.headset;
            }

            public int hashCode() {
                return this.connectionState.hashCode() + (this.headset.hashCode() * 31);
            }

            public String toString() {
                ConnectionState connectionState2 = this.connectionState;
                return "Available(connection=" + connectionState2 + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$HeadsetState$None;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$HeadsetState;", "()V", "toString", "", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class None implements HeadsetState {
            public static final None INSTANCE = new None();

            private None() {
            }

            public String toString() {
                return "Uninitialized";
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$HeadsetState$Unavailable;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$HeadsetState;", "()V", "toString", "", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Unavailable implements HeadsetState {
            public static final Unavailable INSTANCE = new Unavailable();

            private Unavailable() {
            }

            public String toString() {
                return "Unavailable";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0001\u0004\u0006\u0007\b\tø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$SCOAudioState;", "", "Connected", "Connecting", "Disconnected", "Disconnecting", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$SCOAudioState$Connected;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$SCOAudioState$Connecting;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$SCOAudioState$Disconnected;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$SCOAudioState$Disconnecting;", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface SCOAudioState {

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$SCOAudioState$Connected;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$SCOAudioState;", "()V", "toString", "", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Connected implements SCOAudioState {
            public static final Connected INSTANCE = new Connected();

            private Connected() {
            }

            public String toString() {
                return "Connected";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$SCOAudioState$Connecting;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$SCOAudioState;", "connectionAttempt", "", "(I)V", "getConnectionAttempt", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Connecting implements SCOAudioState {
            private final int connectionAttempt;

            public Connecting(int i) {
                this.connectionAttempt = i;
            }

            public static /* synthetic */ Connecting copy$default(Connecting connecting, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = connecting.connectionAttempt;
                }
                return connecting.copy(i);
            }

            public final int component1() {
                return this.connectionAttempt;
            }

            public final Connecting copy(int i) {
                return new Connecting(i);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Connecting) && this.connectionAttempt == ((Connecting) obj).connectionAttempt;
            }

            public final int getConnectionAttempt() {
                return this.connectionAttempt;
            }

            public int hashCode() {
                return Integer.hashCode(this.connectionAttempt);
            }

            public String toString() {
                return a81.j(this.connectionAttempt, "Connecting(attempt=", ")");
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$SCOAudioState$Disconnected;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$SCOAudioState;", "()V", "toString", "", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Disconnected implements SCOAudioState {
            public static final Disconnected INSTANCE = new Disconnected();

            private Disconnected() {
            }

            public String toString() {
                return "Disconnected";
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$SCOAudioState$Disconnecting;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$SCOAudioState;", "()V", "toString", "", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Disconnecting implements SCOAudioState {
            public static final Disconnecting INSTANCE = new Disconnecting();

            private Disconnecting() {
            }

            public String toString() {
                return "Disconnecting";
            }
        }
    }

    public CallsBluetoothManager(Context context2, CallsAudioManagerV2Impl callsAudioManagerV2Impl, Logger logger2) {
        this.callsAudioManager = callsAudioManagerV2Impl;
        this.logger = logger2;
        this.audioManager = (AudioManager) context2.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        this.context = context2;
        logger2.v(LOG_TAG, "CAM BT is created");
    }

    private final void bluetoothTimeout() {
        Logger logger2 = this.logger;
        String str = LOG_TAG;
        HeadsetState headsetState = this.bluetoothHeadsetState;
        logger2.v(str, "BT SCO timed out, state " + headsetState);
        HeadsetState headsetState2 = this.bluetoothHeadsetState;
        if (!(headsetState2 instanceof HeadsetState.Available)) {
            this.logger.v(str, "Ignore timeout event because headset not available");
            return;
        }
        HeadsetState.Available available = (HeadsetState.Available) headsetState2;
        ConnectionState connectionState = available.getConnectionState();
        if (!(connectionState instanceof ConnectionState.Connected)) {
            this.logger.v(str, "Ignore timeout event because headset is not connected");
            return;
        }
        SCOAudioState audioState = ((ConnectionState.Connected) connectionState).getAudioState();
        if (!(audioState instanceof SCOAudioState.Connecting)) {
            this.logger.v(str, "Ignore timeout event because we are not connecting now");
        } else if (!updateCurrentConnectionState$default(this, available.getHeadset(), false, 2, (Object) null)) {
            Logger logger3 = this.logger;
            SCOAudioState.Connecting connecting = (SCOAudioState.Connecting) audioState;
            int connectionAttempt = connecting.getConnectionAttempt();
            logger3.w(str, "BT failed to connect after timeout, attempt was " + connectionAttempt);
            int connectionAttempt2 = connecting.getConnectionAttempt();
            if (connectionAttempt2 < 3) {
                startScoAudio(connectionAttempt2 + 1);
            } else {
                this.callsAudioManager.selectPreferredAudioDevice$calls_audiomanager_release(false);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void bluetoothTimeoutRunnable$lambda$0(CallsBluetoothManager callsBluetoothManager) {
        callsBluetoothManager.bluetoothTimeout();
    }

    private final void cancelTimer() {
        this.logger.v(LOG_TAG, "cancel timers");
        this.callsAudioManager.getWorkerThreadHandler$calls_audiomanager_release().removeCallbacks(this.bluetoothTimeoutRunnable);
    }

    private final void closeProfileProxy(BluetoothHeadset bluetoothHeadset) {
        BluetoothAdapter bluetoothAdapter2 = this.bluetoothAdapter;
        if (bluetoothAdapter2 != null) {
            Logger logger2 = this.logger;
            String str = LOG_TAG;
            logger2.d(str, "Close bluetooth profile proxy: " + bluetoothHeadset);
            bluetoothAdapter2.closeProfileProxy(1, bluetoothHeadset);
        }
    }

    private final String getBluetoothDeviceName(BluetoothDevice bluetoothDevice) {
        if (Build.VERSION.SDK_INT < 30) {
            return bluetoothDevice.getName();
        }
        String p = bluetoothDevice.getAlias();
        return p == null ? bluetoothDevice.getName() : p;
    }

    private final boolean getBluetoothProfileProxy(Context context2, BluetoothProfile.ServiceListener serviceListener, int i) {
        try {
            BluetoothAdapter bluetoothAdapter2 = this.bluetoothAdapter;
            if (bluetoothAdapter2 == null) {
                return false;
            }
            return bluetoothAdapter2.getProfileProxy(context2, serviceListener, i);
        } catch (Throwable th) {
            this.logger.reportError(LOG_TAG, "Can't get bluetooth profile proxy", th);
            return false;
        }
    }

    private final BluetoothDevice getConnectedBluetoothDevice(BluetoothHeadset bluetoothHeadset) {
        Logger logger2 = this.logger;
        String str = LOG_TAG;
        logger2.v(str, "Looking for connected bluetooth device...");
        List<BluetoothDevice> connectedDevices = bluetoothHeadset.getConnectedDevices();
        if (connectedDevices.isEmpty()) {
            this.logger.v(str, "No connected divice found...");
            return null;
        }
        for (BluetoothDevice next : connectedDevices) {
            int connectionState = bluetoothHeadset.getConnectionState(next);
            String bluetoothDeviceName = getBluetoothDeviceName(next);
            if (connectionState == 0) {
                Logger logger3 = this.logger;
                String str2 = LOG_TAG;
                logger3.v(str2, "Disconnected device found: " + bluetoothDeviceName);
            } else if (connectionState == 1) {
                Logger logger4 = this.logger;
                String str3 = LOG_TAG;
                logger4.v(str3, "Connected device found: " + bluetoothDeviceName);
            } else if (connectionState == 2) {
                Logger logger5 = this.logger;
                String str4 = LOG_TAG;
                logger5.v(str4, "Connected device found: " + bluetoothDeviceName);
                return next;
            } else if (connectionState == 3) {
                Logger logger6 = this.logger;
                String str5 = LOG_TAG;
                logger6.v(str5, "Disconnecting device found: " + bluetoothDeviceName);
            }
        }
        return null;
    }

    private final boolean hasPermission() {
        if (Build.VERSION.SDK_INT < 31) {
            if (q8.d(this.context, "android.permission.BLUETOOTH") != 0) {
                return false;
            }
        } else if (q8.d(this.context, "android.permission.BLUETOOTH_CONNECT") != 0) {
            return false;
        }
        return true;
    }

    private final void onAudioConnected() {
        Logger logger2 = this.logger;
        String str = LOG_TAG;
        HeadsetState headsetState = this.bluetoothHeadsetState;
        logger2.v(str, "audio connected, state " + headsetState);
        cancelTimer();
        HeadsetState headsetState2 = this.bluetoothHeadsetState;
        if (!(headsetState2 instanceof HeadsetState.Available)) {
            this.logger.v(str, "Weird! audio connected notification while headset not available, ignore");
            return;
        }
        HeadsetState.Available available = (HeadsetState.Available) headsetState2;
        ConnectionState connectionState = available.getConnectionState();
        if (!(connectionState instanceof ConnectionState.Connected)) {
            this.logger.w(str, "Weird! audio connected notification while we are not even connected, ignore");
            return;
        }
        ConnectionState.Connected connected = (ConnectionState.Connected) connectionState;
        if (!(connected.getAudioState() instanceof SCOAudioState.Connecting)) {
            this.logger.w(str, "Unexpected state for BluetoothHeadset.STATE_AUDIO_CONNECTED");
        }
        updateHeadsetState$default(this, HeadsetState.Available.copy$default(available, (BluetoothHeadset) null, ConnectionState.Connected.copy$default(connected, (String) null, SCOAudioState.Connected.INSTANCE, 1, (Object) null), 1, (Object) null), false, 2, (Object) null);
    }

    private final void onAudioConnecting() {
        Logger logger2 = this.logger;
        String str = LOG_TAG;
        HeadsetState headsetState = this.bluetoothHeadsetState;
        logger2.v(str, "audio has started connecting, state " + headsetState);
        HeadsetState headsetState2 = this.bluetoothHeadsetState;
        if (!(headsetState2 instanceof HeadsetState.Available)) {
            this.logger.w(str, "Weird! audio connecting notification while headset not available, ignore");
            return;
        }
        HeadsetState.Available available = (HeadsetState.Available) headsetState2;
        ConnectionState connectionState = available.getConnectionState();
        if (!(connectionState instanceof ConnectionState.Connected)) {
            this.logger.w(str, "Weird! audio connecting notification while we are not even connected, ignore");
            return;
        }
        ConnectionState.Connected connected = (ConnectionState.Connected) connectionState;
        if (!(connected.getAudioState() instanceof SCOAudioState.Connecting)) {
            this.logger.v(str, "Weird! our state is wrong? Reset to connecting");
            updateHeadsetState$default(this, HeadsetState.Available.copy$default(available, (BluetoothHeadset) null, ConnectionState.Connected.copy$default(connected, (String) null, new SCOAudioState.Connecting(0), 1, (Object) null), 1, (Object) null), false, 2, (Object) null);
            return;
        }
        this.logger.v(str, "Since we are in connecting state, ignore event");
    }

    private final void onAudioDisconnected(boolean z) {
        Logger logger2 = this.logger;
        String str = LOG_TAG;
        HeadsetState headsetState = this.bluetoothHeadsetState;
        logger2.v(str, "audio disconnected, state " + headsetState);
        if (!z) {
            HeadsetState headsetState2 = this.bluetoothHeadsetState;
            if (headsetState2 instanceof HeadsetState.Available) {
                updateCurrentConnectionState$default(this, ((HeadsetState.Available) headsetState2).getHeadset(), false, 2, (Object) null);
            } else {
                this.logger.w(str, "Weird! Headset is not available when sco goes down");
            }
            Logger logger3 = this.logger;
            HeadsetState headsetState3 = this.bluetoothHeadsetState;
            logger3.v(str, "audio disconnected, state after update: " + headsetState3);
        }
    }

    /* access modifiers changed from: private */
    public final void onBroadcastReceiveImpl(Intent intent, boolean z) {
        Logger logger2 = this.logger;
        String str = LOG_TAG;
        HeadsetState headsetState = this.bluetoothHeadsetState;
        logger2.v(str, "received " + intent + ", state is " + headsetState);
        if (this.bluetoothHeadsetState instanceof HeadsetState.None) {
            this.logger.v(str, "Our headset was not initialized yet, ignore broadcast event");
            return;
        }
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != -1435586571) {
                if (hashCode == 545516589 && action.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
                    int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
                    Logger logger3 = this.logger;
                    logger3.v(str, "intent action is ACTION_CONNECTION_STATE_CHANGED, connection state is " + intExtra);
                    if (intExtra == 0) {
                        onHeadsetDisconnected();
                    } else if (intExtra == 2) {
                        onHeadsetConnected();
                    }
                }
            } else if (action.equals("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED")) {
                int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 10);
                Logger logger4 = this.logger;
                logger4.v(str, "intent action is ACTION_AUDIO_STATE_CHANGED, audio state is " + intExtra2);
                switch (intExtra2) {
                    case 10:
                        onAudioDisconnected(z);
                        return;
                    case 11:
                        onAudioConnecting();
                        return;
                    case 12:
                        onAudioConnected();
                        return;
                    default:
                        return;
                }
            }
        }
    }

    private final void onHeadsetConnected() {
        Logger logger2 = this.logger;
        String str = LOG_TAG;
        HeadsetState headsetState = this.bluetoothHeadsetState;
        logger2.v(str, "BT headset connected: " + headsetState);
        HeadsetState headsetState2 = this.bluetoothHeadsetState;
        if (!(headsetState2 instanceof HeadsetState.Available)) {
            this.logger.e(str, "Unexpected state when headset connected");
        } else {
            updateCurrentConnectionState$default(this, ((HeadsetState.Available) headsetState2).getHeadset(), false, 2, (Object) null);
        }
    }

    private final void onHeadsetDisconnected() {
        Logger logger2 = this.logger;
        String str = LOG_TAG;
        logger2.v(str, "BT headset disconnected");
        stopScoAudio();
        HeadsetState headsetState = this.bluetoothHeadsetState;
        if (headsetState instanceof HeadsetState.Available) {
            updateHeadsetState$default(this, HeadsetState.Available.copy$default((HeadsetState.Available) headsetState, (BluetoothHeadset) null, ConnectionState.Disconnected.INSTANCE, 1, (Object) null), false, 2, (Object) null);
            return;
        }
        Logger logger3 = this.logger;
        logger3.e(str, "BT headset disconnected came for unexpected state " + headsetState + ", ignore");
    }

    /* access modifiers changed from: private */
    public final void onServiceConnectedImpl(int i, BluetoothProfile bluetoothProfile) {
        Logger logger2 = this.logger;
        String str = LOG_TAG;
        HeadsetState headsetState = this.bluetoothHeadsetState;
        logger2.v(str, "connected " + i + ", our state is " + headsetState);
        if (i != 1 || Intrinsics.areEqual((Object) this.bluetoothHeadsetState, (Object) HeadsetState.None.INSTANCE)) {
            this.logger.v(str, "Own state or connected profile don't match to expected one, ignore event");
        } else {
            updateCurrentConnectionState$default(this, (BluetoothHeadset) bluetoothProfile, false, 2, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public final void onServiceDisconnectedImpl(int i) {
        Logger logger2 = this.logger;
        String str = LOG_TAG;
        HeadsetState headsetState = this.bluetoothHeadsetState;
        logger2.v(str, "disconnected " + i + ", our state is " + headsetState);
        if (i != 1 || Intrinsics.areEqual((Object) this.bluetoothHeadsetState, (Object) HeadsetState.None.INSTANCE)) {
            this.logger.v(str, "Own state or connected profile don't match to expected one, ignore event");
            return;
        }
        stopScoAudio();
        updateHeadsetState$default(this, HeadsetState.Unavailable.INSTANCE, false, 2, (Object) null);
    }

    private final void registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.logger.v(LOG_TAG, "registering receiver");
        this.context.registerReceiver(broadcastReceiver, intentFilter);
    }

    public static /* synthetic */ boolean startScoAudio$default(CallsBluetoothManager callsBluetoothManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        return callsBluetoothManager.startScoAudio(i);
    }

    private final void startTimer() {
        this.logger.v(LOG_TAG, "start connection timers");
        this.callsAudioManager.getWorkerThreadHandler$calls_audiomanager_release().postDelayed(this.bluetoothTimeoutRunnable, 2500);
    }

    private final void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        this.logger.v(LOG_TAG, "unregistering receiver");
        this.context.unregisterReceiver(broadcastReceiver);
    }

    private final void updateAudioDeviceState() {
        this.logger.v(LOG_TAG, "Calling update CAM state because of BT state change");
        this.callsAudioManager.updateAudioDeviceState$calls_audiomanager_release();
    }

    /* access modifiers changed from: private */
    public static final void updateAudioManagerRunnable$lambda$1(CallsBluetoothManager callsBluetoothManager) {
        callsBluetoothManager.updateAudioDeviceState();
    }

    private final boolean updateCurrentConnectionState(BluetoothHeadset bluetoothHeadset, boolean z) {
        Logger logger2 = this.logger;
        String str = LOG_TAG;
        HeadsetState headsetState = this.bluetoothHeadsetState;
        logger2.v(str, "BT headset check begin: " + headsetState);
        try {
            BluetoothDevice connectedBluetoothDevice = getConnectedBluetoothDevice(bluetoothHeadset);
            ConnectionState connected = (connectedBluetoothDevice == null || !bluetoothHeadset.isAudioConnected(connectedBluetoothDevice)) ? connectedBluetoothDevice != null ? new ConnectionState.Connected(getBluetoothDeviceName(connectedBluetoothDevice), SCOAudioState.Disconnected.INSTANCE) : ConnectionState.Disconnected.INSTANCE : new ConnectionState.Connected(getBluetoothDeviceName(connectedBluetoothDevice), SCOAudioState.Connected.INSTANCE);
            updateHeadsetState(new HeadsetState.Available(bluetoothHeadset, connected), z);
            Logger logger3 = this.logger;
            HeadsetState headsetState2 = this.bluetoothHeadsetState;
            logger3.v(str, "BT headset check completed: " + headsetState2);
            return (connected instanceof ConnectionState.Connected) && (((ConnectionState.Connected) connected).getAudioState() instanceof SCOAudioState.Connected);
        } catch (SecurityException e) {
            this.logger.d(LOG_TAG, "SecurityException: did you permit android.permission.BLUETOOTH_CONNECT?", e);
            closeProfileProxy(bluetoothHeadset);
            stop();
            return false;
        } catch (Throwable th) {
            this.logger.reportError(LOG_TAG, "Error detecting remote audio device", th);
            return false;
        }
    }

    public static /* synthetic */ boolean updateCurrentConnectionState$default(CallsBluetoothManager callsBluetoothManager, BluetoothHeadset bluetoothHeadset, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return callsBluetoothManager.updateCurrentConnectionState(bluetoothHeadset, z);
    }

    private final void updateHeadsetState(HeadsetState headsetState, boolean z) {
        HeadsetState headsetState2 = this.bluetoothHeadsetState;
        if ((headsetState2 instanceof HeadsetState.Available) && !(headsetState instanceof HeadsetState.Available)) {
            closeProfileProxy(((HeadsetState.Available) headsetState2).getHeadset());
        }
        this.bluetoothHeadsetState = headsetState;
        Logger logger2 = this.logger;
        String str = LOG_TAG;
        logger2.v(str, "BT state did change to: " + headsetState);
        if (z) {
            this.callsAudioManager.getWorkerThreadHandler$calls_audiomanager_release().removeCallbacks(this.updateAudioManagerRunnable);
            this.logger.v(str, "Scheduling update CAM state because of BT state change");
            this.callsAudioManager.getWorkerThreadHandler$calls_audiomanager_release().post(this.updateAudioManagerRunnable);
        }
    }

    public static /* synthetic */ void updateHeadsetState$default(CallsBluetoothManager callsBluetoothManager, HeadsetState headsetState, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        callsBluetoothManager.updateHeadsetState(headsetState, z);
    }

    public final String getConnectedDeviceName() {
        HeadsetState headsetState = this.bluetoothHeadsetState;
        if (!(headsetState instanceof HeadsetState.Available)) {
            return "";
        }
        HeadsetState.Available available = (HeadsetState.Available) headsetState;
        return available.getConnectionState() instanceof ConnectionState.Connected ? ((ConnectionState.Connected) available.getConnectionState()).getDeviceName() : "";
    }

    public final boolean getHasBluetoothHeadset() {
        HeadsetState headsetState = this.bluetoothHeadsetState;
        if (headsetState instanceof HeadsetState.Available) {
            return ((HeadsetState.Available) headsetState).getConnectionState() instanceof ConnectionState.Connected;
        }
        return false;
    }

    public final boolean isBluetoothOn() {
        HeadsetState headsetState = this.bluetoothHeadsetState;
        if (!(headsetState instanceof HeadsetState.Available)) {
            return false;
        }
        HeadsetState.Available available = (HeadsetState.Available) headsetState;
        return (available.getConnectionState() instanceof ConnectionState.Connected) && (((ConnectionState.Connected) available.getConnectionState()).getAudioState() instanceof SCOAudioState.Connected);
    }

    public final void start() {
        Logger logger2 = this.logger;
        String str = LOG_TAG;
        logger2.v(str, "start requested");
        if (!(this.bluetoothHeadsetState instanceof HeadsetState.None)) {
            Logger logger3 = this.logger;
            HeadsetState headsetState = this.bluetoothHeadsetState;
            logger3.w(str, "Unexpected start request when state is " + headsetState);
        } else if (!hasPermission()) {
            Logger logger4 = this.logger;
            int myPid = Process.myPid();
            logger4.e(str, "Process (pid=" + myPid + ") lacks BLUETOOTH permission");
        } else if (!this.audioManager.isBluetoothScoAvailableOffCall()) {
            this.logger.e(str, "Bluetooth SCO audio is not available off call");
        } else {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter == null) {
                this.logger.w(str, "Device does not support Bluetooth");
                return;
            }
            this.bluetoothAdapter = defaultAdapter;
            updateHeadsetState(HeadsetState.Unavailable.INSTANCE, false);
            if (!getBluetoothProfileProxy(this.context, this.bluetoothServiceListener, 1)) {
                this.logger.e(str, "BluetoothAdapter.getProfileProxy(HEADSET) failed");
                return;
            }
            BroadcastReceiver broadcastReceiver = this.bluetoothHeadsetReceiver;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
            intentFilter.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
            Unit unit = Unit.INSTANCE;
            registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    public final boolean startScoAudio() {
        return startScoAudio(1);
    }

    public final void stop() {
        this.logger.v(LOG_TAG, "stop requested");
        stopScoAudio();
        if (!(this.bluetoothHeadsetState instanceof HeadsetState.None)) {
            unregisterReceiver(this.bluetoothHeadsetReceiver);
            cancelTimer();
            updateHeadsetState(HeadsetState.None.INSTANCE, false);
            this.bluetoothAdapter = null;
        }
    }

    public final void stopScoAudio() {
        Logger logger2 = this.logger;
        String str = LOG_TAG;
        HeadsetState headsetState = this.bluetoothHeadsetState;
        logger2.v(str, "stop sco requested; state: " + headsetState);
        HeadsetState headsetState2 = this.bluetoothHeadsetState;
        if (!(headsetState2 instanceof HeadsetState.Available)) {
            this.logger.v(str, "BT SCO disconnection ignored - no headset available");
            return;
        }
        HeadsetState.Available available = (HeadsetState.Available) headsetState2;
        ConnectionState connectionState = available.getConnectionState();
        if (!(connectionState instanceof ConnectionState.Connected)) {
            this.logger.v(str, "BT SCO disconnection ignored - no headset connected");
            return;
        }
        SCOAudioState audioState = ((ConnectionState.Connected) connectionState).getAudioState();
        if (audioState instanceof SCOAudioState.Disconnected) {
            this.logger.v(str, "BT SCO is already disconnected. Ignore stop SCO request");
        } else if (audioState instanceof SCOAudioState.Disconnecting) {
            this.logger.v(str, "Disconnecting is in progress. Ignore stop SCO request");
        } else {
            cancelTimer();
            try {
                updateHeadsetState$default(this, HeadsetState.Available.copy$default((HeadsetState.Available) headsetState2, (BluetoothHeadset) null, ConnectionState.Connected.copy$default((ConnectionState.Connected) connectionState, (String) null, SCOAudioState.Disconnecting.INSTANCE, 1, (Object) null), 1, (Object) null), false, 2, (Object) null);
                this.audioManager.stopBluetoothSco();
                this.audioManager.setBluetoothScoOn(false);
            } catch (Throwable th) {
                this.logger.reportError(LOG_TAG, "Can't stop bluetooth sco", th);
                updateCurrentConnectionState$default(this, available.getHeadset(), false, 2, (Object) null);
            }
        }
    }

    private final boolean startScoAudio(int i) {
        Logger logger2 = this.logger;
        String str = LOG_TAG;
        HeadsetState headsetState = this.bluetoothHeadsetState;
        logger2.v(str, "start sco requested, state: " + headsetState);
        HeadsetState headsetState2 = this.bluetoothHeadsetState;
        if (!(headsetState2 instanceof HeadsetState.Available)) {
            this.logger.e(str, "BT SCO connection fails - no headset available");
            return false;
        }
        HeadsetState.Available available = (HeadsetState.Available) headsetState2;
        ConnectionState connectionState = available.getConnectionState();
        if (!(connectionState instanceof ConnectionState.Connected)) {
            this.logger.e(str, "BT SCO connection fails - headset is not connected yet");
            return false;
        }
        ConnectionState.Connected connected = (ConnectionState.Connected) connectionState;
        SCOAudioState audioState = connected.getAudioState();
        if (audioState instanceof SCOAudioState.Connected) {
            this.logger.v(str, "BT SCO is already connected");
            return true;
        } else if (audioState instanceof SCOAudioState.Connecting) {
            this.logger.v(str, "BT SCO is about to connect, ignore this attempt");
            return true;
        } else if (audioState instanceof SCOAudioState.Disconnecting) {
            this.logger.v(str, "BT SCO is about to disconnect, ignore this attempt");
            return false;
        } else {
            this.logger.v(str, "BT SCO connection condition satisfied, update state and request for connection");
            updateHeadsetState$default(this, HeadsetState.Available.copy$default(available, (BluetoothHeadset) null, ConnectionState.Connected.copy$default(connected, (String) null, new SCOAudioState.Connecting(i), 1, (Object) null), 1, (Object) null), false, 2, (Object) null);
            try {
                this.audioManager.startBluetoothSco();
                this.audioManager.setBluetoothScoOn(true);
                startTimer();
                return true;
            } catch (Throwable th) {
                this.logger.reportError(LOG_TAG, "Error on startBluetoothSco()", th);
                updateCurrentConnectionState$default(this, available.getHeadset(), false, 2, (Object) null);
                return false;
            }
        }
    }
}
