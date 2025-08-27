package defpackage;

/* renamed from: wf8  reason: default package */
public final class wf8 extends bc6 {
    public static final Object v = new Object();
    public final Object c;
    public final Object o;

    public wf8(ikf ikf, Object obj, Object obj2) {
        super(ikf);
        this.c = obj;
        this.o = obj2;
    }

    public final int b(Object obj) {
        Object obj2;
        if (v.equals(obj) && (obj2 = this.o) != null) {
            obj = obj2;
        }
        return this.b.b(obj);
    }

    public final dkf g(int i, dkf dkf, boolean z) {
        this.b.g(i, dkf, z);
        if (t0g.a(dkf.b, this.o) && z) {
            dkf.b = v;
        }
        return dkf;
    }

    public final Object m(int i) {
        Object m = this.b.m(i);
        return t0g.a(m, this.o) ? v : m;
    }

    public final gkf n(int i, gkf gkf, long j) {
        this.b.n(i, gkf, j);
        if (t0g.a(gkf.a, this.c)) {
            gkf.a = gkf.A0;
        }
        return gkf;
    }
}
