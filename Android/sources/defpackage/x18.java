package defpackage;

/* renamed from: x18  reason: default package */
public final /* synthetic */ class x18 implements x6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y18 b;

    public /* synthetic */ x18(y18 y18, int i) {
        this.a = i;
        this.b = y18;
    }

    public final void run() {
        z2a z2a;
        z2a z2a2;
        switch (this.a) {
            case 0:
                y18 y18 = this.b;
                mc2 mc2 = y18.H0;
                if (mc2 != null && (z2a = (z2a) y18.I0.x) != null) {
                    z2a.N(new y2a(mc2, 1));
                    return;
                }
                return;
            default:
                y18 y182 = this.b;
                mc2 mc22 = y182.H0;
                if (mc22 != null && (z2a2 = (z2a) y182.I0.x) != null) {
                    z2a2.N(new y2a(mc22, 0));
                    return;
                }
                return;
        }
    }
}
