package defpackage;

/* renamed from: aqb  reason: default package */
public final class aqb extends cc6 {
    public final /* synthetic */ int f = 0;
    public final Object g;

    public aqb(jkf jkf, ir8 ir8) {
        super(jkf);
        this.g = ir8;
    }

    public ekf g(int i, ekf ekf, boolean z) {
        switch (this.f) {
            case 0:
                jkf jkf = this.e;
                ekf g2 = jkf.g(i, ekf, z);
                if (jkf.n(g2.c, (hkf) this.g, 0).a()) {
                    g2.j(ekf.a, ekf.b, ekf.c, ekf.d, ekf.e, q9.g, true);
                } else {
                    g2.f = true;
                }
                return g2;
            default:
                return super.g(i, ekf, z);
        }
    }

    public hkf n(int i, hkf hkf, long j) {
        switch (this.f) {
            case 1:
                super.n(i, hkf, j);
                ir8 ir8 = (ir8) this.g;
                hkf.c = ir8;
                xq8 xq8 = ir8.b;
                hkf.b = xq8 != null ? xq8.h : null;
                return hkf;
            default:
                return super.n(i, hkf, j);
        }
    }

    public aqb(jkf jkf) {
        super(jkf);
        this.g = new hkf();
    }
}
