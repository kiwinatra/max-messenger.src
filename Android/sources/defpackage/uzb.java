package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* renamed from: uzb  reason: default package */
public final /* synthetic */ class uzb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ uzb(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.invoke(vzb.b);
                return Unit.INSTANCE;
            case 1:
                this.b.invoke(rhd.a);
                return Unit.INSTANCE;
            case 2:
                this.b.invoke(rhd.b);
                return Unit.INSTANCE;
            case 3:
                this.b.invoke(rhd.c);
                return Unit.INSTANCE;
            default:
                this.b.invoke(ble.b);
                return Unit.INSTANCE;
        }
    }
}
