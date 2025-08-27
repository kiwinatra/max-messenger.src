package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* renamed from: au7  reason: default package */
public final /* synthetic */ class au7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ du7 b;

    public /* synthetic */ au7(du7 du7, int i) {
        this.a = i;
        this.b = du7;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                ((v13) this.b.d.getValue()).a();
                return Unit.INSTANCE;
            case 1:
                ((v13) this.b.d.getValue()).a();
                return Unit.INSTANCE;
            case 2:
                ev0.v(ys6.a, ((osa) ((gaf) xd3.i.getValue())).b(), (f14) null, new bu7(this.b, (Continuation) null), 2);
                return Unit.INSTANCE;
            default:
                ev0.v(ys6.a, ((osa) ((gaf) xd3.i.getValue())).b(), (f14) null, new cu7(this.b, (Continuation) null), 2);
                return Unit.INSTANCE;
        }
    }
}
