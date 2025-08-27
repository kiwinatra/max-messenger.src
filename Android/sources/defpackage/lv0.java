package defpackage;

/* renamed from: lv0  reason: default package */
public final class lv0 implements ypf {
    public final int a;
    public final ca6 b;
    public final xx4 c = new xx4();
    public ca6 d;
    public ypf e;
    public long f;

    public lv0(int i, int i2, ca6 ca6) {
        this.a = i2;
        this.b = ca6;
    }

    public final int a(b74 b74, int i, boolean z) {
        ypf ypf = this.e;
        int i2 = t0g.a;
        return ypf.e(b74, i, z);
    }

    public final void b(long j, int i, int i2, int i3, wpf wpf) {
        long j2 = this.f;
        if (j2 != -9223372036854775807L && j >= j2) {
            this.e = this.c;
        }
        ypf ypf = this.e;
        int i4 = t0g.a;
        ypf.b(j, i, i2, i3, wpf);
    }

    public final void c(int i, g1g g1g) {
        ypf ypf = this.e;
        int i2 = t0g.a;
        ypf.c(i, g1g);
    }

    public final void d(ca6 ca6) {
        ca6 ca62 = this.b;
        if (ca62 != null) {
            ca6 = ca6.d(ca62);
        }
        this.d = ca6;
        ypf ypf = this.e;
        int i = t0g.a;
        ypf.d(ca6);
    }
}
