package ru.ok.android.externcalls.sdk.audio.internal.impl;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "ex", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class CallsBluetoothManager$BluetoothServiceListener$onServiceDisconnected$1 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ int $profile;
    final /* synthetic */ CallsBluetoothManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallsBluetoothManager$BluetoothServiceListener$onServiceDisconnected$1(CallsBluetoothManager callsBluetoothManager, int i) {
        super(1);
        this.this$0 = callsBluetoothManager;
        this.$profile = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Throwable th) {
        this.this$0.logger.reportError(CallsBluetoothManager.LOG_TAG, a81.j(this.$profile, "Error at onServiceDisconnected(", ")"), th);
    }
}
