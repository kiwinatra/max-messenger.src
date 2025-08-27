package ru.ok.android.externcalls.sdk.audio.internal.impl;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import ru.ok.android.externcalls.sdk.audio.internal.impl.CallsBluetoothManager;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class CallsBluetoothManager$BluetoothHeadsetBroadcastReceiver$onReceive$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Intent $intent;
    final /* synthetic */ CallsBluetoothManager this$0;
    final /* synthetic */ CallsBluetoothManager.BluetoothHeadsetBroadcastReceiver this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallsBluetoothManager$BluetoothHeadsetBroadcastReceiver$onReceive$1(CallsBluetoothManager callsBluetoothManager, Intent intent, CallsBluetoothManager.BluetoothHeadsetBroadcastReceiver bluetoothHeadsetBroadcastReceiver) {
        super(0);
        this.this$0 = callsBluetoothManager;
        this.$intent = intent;
        this.this$1 = bluetoothHeadsetBroadcastReceiver;
    }

    public final void invoke() {
        this.this$0.onBroadcastReceiveImpl(this.$intent, this.this$1.isInitialStickyBroadcast());
    }
}
