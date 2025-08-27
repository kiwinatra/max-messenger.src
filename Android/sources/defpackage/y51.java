package defpackage;

import kotlin.jvm.functions.Function0;

/* renamed from: y51  reason: default package */
public final /* synthetic */ class y51 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a61 b;

    public /* synthetic */ y51(a61 a61, int i) {
        this.a = i;
        this.b = a61;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                a61 a61 = this.b;
                return new av6(a61.H0, a61.I0);
            case 1:
                return this.b.N0;
            default:
                return this.b.L0;
        }
    }
}
