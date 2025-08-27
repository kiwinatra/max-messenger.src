package defpackage;

/* renamed from: xf8  reason: default package */
public final class xf8 extends cc6 {
    public static final Object h = new Object();
    public final Object f;
    public final Object g;

    public xf8(jkf jkf, Object obj, Object obj2) {
        super(jkf);
        this.f = obj;
        this.g = obj2;
    }

    public final int b(Object obj) {
        Object obj2;
        if (h.equals(obj) && (obj2 = this.g) != null) {
            obj = obj2;
        }
        return this.e.b(obj);
    }

    public final ekf g(int i, ekf ekf, boolean z) {
        this.e.g(i, ekf, z);
        if (v0g.a(ekf.b, this.g) && z) {
            ekf.b = h;
        }
        return ekf;
    }

    public final Object m(int i) {
        Object m = this.e.m(i);
        return v0g.a(m, this.g) ? h : m;
    }

    public final hkf n(int i, hkf hkf, long j) {
        this.e.n(i, hkf, j);
        if (v0g.a(hkf.a, this.f)) {
            hkf.a = hkf.q;
        }
        return hkf;
    }
}
