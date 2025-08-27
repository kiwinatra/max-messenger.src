package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: umf  reason: default package */
public final /* synthetic */ class umf implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ymf b;

    public /* synthetic */ umf(ymf ymf, int i) {
        this.a = i;
        this.b = ymf;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                return Unit.INSTANCE;
            default:
                ymf ymf = this.b;
                return new qmf(ymf.c, ymf.v, ymf.w);
        }
    }
}
