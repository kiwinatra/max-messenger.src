package defpackage;

import kotlin.jvm.functions.Function0;

/* renamed from: nk1  reason: default package */
public final /* synthetic */ class nk1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rk1 b;

    public /* synthetic */ nk1(rk1 rk1, int i) {
        this.a = i;
        this.b = rk1;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return rk1.P(this.b);
            case 1:
                return this.b.P0;
            case 2:
                return this.b.S0;
            case 3:
                return this.b.P0;
            case 4:
                vag vag = vag.b;
                rk1 rk1 = this.b;
                return new wd1(vag, new qk1(rk1), new nk1(rk1, 1), new nk1(rk1, 2), (c61) null, 34);
            default:
                return this.b.P0;
        }
    }
}
