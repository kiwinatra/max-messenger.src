package defpackage;

/* renamed from: dj2  reason: default package */
public final /* synthetic */ class dj2 implements x6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fj2 b;

    public /* synthetic */ dj2(fj2 fj2, int i) {
        this.a = i;
        this.b = fj2;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                fj2 fj2 = this.b;
                ej2 ej2 = fj2.H0;
                if (ej2 != null) {
                    if (fj2.N0) {
                        fo3 fo3 = fj2.M0.a;
                        if (fo3.a != fj2.L0.b.d && !fo3.c()) {
                            return;
                        }
                    }
                    ej2.B0(fj2.M0);
                    return;
                }
                return;
            default:
                fj2 fj22 = this.b;
                ej2 ej22 = fj22.H0;
                if (ej22 != null && !fj22.N0) {
                    ej22.g0(fj22.M0, fj22.G0);
                    return;
                }
                return;
        }
    }
}
