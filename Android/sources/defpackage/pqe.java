package defpackage;

/* renamed from: pqe  reason: default package */
public final /* synthetic */ class pqe implements x6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qqe b;
    public final /* synthetic */ hre c;

    public /* synthetic */ pqe(qqe qqe, hre hre, int i) {
        this.a = i;
        this.b = qqe;
        this.c = hre;
    }

    public final void run() {
        gre gre;
        switch (this.a) {
            case 0:
                qqe qqe = this.b;
                hre hre = this.c;
                if (hre != null) {
                    oqe oqe = qqe.L0;
                    if (oqe != null) {
                        boolean z = !oqe.f;
                        gre gre2 = hre.v;
                        if (gre2 != null) {
                            b0 b0Var = ((yqe) gre2).x;
                            if (b0Var instanceof xqe) {
                                ((xqe) b0Var).j(oqe.a, z);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                qqe.getClass();
                return;
            default:
                qqe qqe2 = this.b;
                hre hre2 = this.c;
                if (hre2 != null) {
                    oqe oqe2 = qqe2.L0;
                    if (oqe2 != null && (gre = hre2.v) != null) {
                        b0 b0Var2 = ((yqe) gre).x;
                        if (b0Var2 instanceof xqe) {
                            ((xqe) b0Var2).n(oqe2.a);
                            return;
                        }
                        return;
                    }
                    return;
                }
                qqe2.getClass();
                return;
        }
    }
}
