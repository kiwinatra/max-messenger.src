package defpackage;

/* renamed from: vf8  reason: default package */
public final class vf8 implements mt8, kt8 {
    public final nz8 a;
    public final long b;
    public final cb4 c;
    public yj0 o;
    public mt8 v;
    public kt8 w;
    public long x = -9223372036854775807L;

    public vf8(nz8 nz8, cb4 cb4, long j) {
        this.a = nz8;
        this.c = cb4;
        this.b = j;
    }

    public final void A(long j) {
        mt8 mt8 = this.v;
        int i = v0g.a;
        mt8.A(j);
    }

    public final void a(nz8 nz8) {
        long j = this.x;
        if (j == -9223372036854775807L) {
            j = this.b;
        }
        yj0 yj0 = this.o;
        yj0.getClass();
        mt8 c2 = yj0.c(nz8, this.c, j);
        this.v = c2;
        if (this.w != null) {
            c2.j(this, j);
        }
    }

    public final void b(mt8 mt8) {
        kt8 kt8 = this.w;
        int i = v0g.a;
        kt8.b(this);
    }

    public final void c(qsd qsd) {
        mt8 mt8 = (mt8) qsd;
        kt8 kt8 = this.w;
        int i = v0g.a;
        kt8.c(this);
    }

    public final boolean d() {
        mt8 mt8 = this.v;
        return mt8 != null && mt8.d();
    }

    public final void e() {
        if (this.v != null) {
            yj0 yj0 = this.o;
            yj0.getClass();
            yj0.o(this.v);
        }
    }

    public final long g(md5[] md5Arr, boolean[] zArr, lcd[] lcdArr, boolean[] zArr2, long j) {
        long j2 = this.x;
        long j3 = (j2 == -9223372036854775807L || j != this.b) ? j : j2;
        this.x = -9223372036854775807L;
        mt8 mt8 = this.v;
        int i = v0g.a;
        return mt8.g(md5Arr, zArr, lcdArr, zArr2, j3);
    }

    public final long h(long j, und und) {
        mt8 mt8 = this.v;
        int i = v0g.a;
        return mt8.h(j, und);
    }

    public final long i() {
        mt8 mt8 = this.v;
        int i = v0g.a;
        return mt8.i();
    }

    public final void j(kt8 kt8, long j) {
        this.w = kt8;
        mt8 mt8 = this.v;
        if (mt8 != null) {
            long j2 = this.x;
            if (j2 == -9223372036854775807L) {
                j2 = this.b;
            }
            mt8.j(this, j2);
        }
    }

    public final boolean k(d38 d38) {
        mt8 mt8 = this.v;
        return mt8 != null && mt8.k(d38);
    }

    public final void r() {
        mt8 mt8 = this.v;
        if (mt8 != null) {
            mt8.r();
            return;
        }
        yj0 yj0 = this.o;
        if (yj0 != null) {
            yj0.k();
        }
    }

    public final long s(long j) {
        mt8 mt8 = this.v;
        int i = v0g.a;
        return mt8.s(j);
    }

    public final long w() {
        mt8 mt8 = this.v;
        int i = v0g.a;
        return mt8.w();
    }

    public final upf x() {
        mt8 mt8 = this.v;
        int i = v0g.a;
        return mt8.x();
    }

    public final long y() {
        mt8 mt8 = this.v;
        int i = v0g.a;
        return mt8.y();
    }

    public final void z(long j, boolean z) {
        mt8 mt8 = this.v;
        int i = v0g.a;
        mt8.z(j, z);
    }
}
