package defpackage;

import kotlin.jvm.functions.Function0;

/* renamed from: lbf  reason: default package */
public final /* synthetic */ class lbf implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mbf b;

    public /* synthetic */ lbf(cq cqVar, int i) {
        this.a = i;
        this.b = cqVar;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                mbf mbf = this.b;
                return new lm5(mbf.a, mbf.b(), mbf.a(), mbf.b);
            default:
                mbf mbf2 = this.b;
                return new c25(mbf2.a, mbf2.b(), mbf2.a(), mbf2.b, (b25) mbf2.c.getValue());
        }
    }
}
