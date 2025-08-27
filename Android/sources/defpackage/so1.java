package defpackage;

import ru.ok.android.externcalls.sdk.audio.internal.impl.CallsBluetoothManager;

/* renamed from: so1  reason: default package */
public final /* synthetic */ class so1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallsBluetoothManager b;

    public /* synthetic */ so1(CallsBluetoothManager callsBluetoothManager, int i) {
        this.a = i;
        this.b = callsBluetoothManager;
    }

    public final void run() {
        int i = this.a;
        CallsBluetoothManager callsBluetoothManager = this.b;
        switch (i) {
            case 0:
                CallsBluetoothManager.bluetoothTimeoutRunnable$lambda$0(callsBluetoothManager);
                return;
            default:
                CallsBluetoothManager.updateAudioManagerRunnable$lambda$1(callsBluetoothManager);
                return;
        }
    }
}
