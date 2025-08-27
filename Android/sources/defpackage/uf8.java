package defpackage;

/* renamed from: uf8  reason: default package */
public final class uf8 implements lt8, jt8 {
    public final mz8 a;
    public final long b;
    public final cb4 c;
    public xj0 o;
    public lt8 v;
    public jt8 w;
    public long x = -9223372036854775807L;

    public uf8(mz8 mz8, cb4 cb4, long j) {
        this.a = mz8;
        this.c = cb4;
        this.b = j;
    }

    public final void A(long j) {
        lt8 lt8 = this.v;
        int i = t0g.a;
        lt8.A(j);
    }

    public final long F(long j, tnd tnd) {
        lt8 lt8 = this.v;
        int i = t0g.a;
        return lt8.F(j, tnd);
    }

    public final boolean M(long j) {
        lt8 lt8 = this.v;
        return lt8 != null && lt8.M(j);
    }

    public final void S(jt8 jt8, long j) {
        this.w = jt8;
        lt8 lt8 = this.v;
        if (lt8 != null) {
            long j2 = this.x;
            if (j2 == -9223372036854775807L) {
                j2 = this.b;
            }
            lt8.S(this, j2);
        }
    }

    public final long T(ld5[] ld5Arr, boolean[] zArr, kcd[] kcdArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.x;
        if (j3 == -9223372036854775807L || j != this.b) {
            j2 = j;
        } else {
            this.x = -9223372036854775807L;
            j2 = j3;
        }
        lt8 lt8 = this.v;
        int i = t0g.a;
        return lt8.T(ld5Arr, zArr, kcdArr, zArr2, j2);
    }

    public final long a(long j) {
        long j2 = this.x;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    public final void b(psd psd) {
        lt8 lt8 = (lt8) psd;
        jt8 jt8 = this.w;
        int i = t0g.a;
        jt8.b(this);
    }

    public final void c(lt8 lt8) {
        jt8 jt8 = this.w;
        int i = t0g.a;
        jt8.c(this);
    }

    public final boolean d() {
        lt8 lt8 = this.v;
        return lt8 != null && lt8.d();
    }

    public final long i() {
        lt8 lt8 = this.v;
        int i = t0g.a;
        return lt8.i();
    }

    public final void r() {
        lt8 lt8 = this.v;
        if (lt8 != null) {
            lt8.r();
            return;
        }
        xj0 xj0 = this.o;
        if (xj0 != null) {
            xj0.g();
        }
    }

    public final long s(long j) {
        lt8 lt8 = this.v;
        int i = t0g.a;
        return lt8.s(j);
    }

    public final long w() {
        lt8 lt8 = this.v;
        int i = t0g.a;
        return lt8.w();
    }

    public final tpf x() {
        lt8 lt8 = this.v;
        int i = t0g.a;
        return lt8.x();
    }

    public final long y() {
        lt8 lt8 = this.v;
        int i = t0g.a;
        return lt8.y();
    }

    public final void z(long j, boolean z) {
        lt8 lt8 = this.v;
        int i = t0g.a;
        lt8.z(j, z);
    }
}
