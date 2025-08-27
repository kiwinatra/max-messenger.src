package defpackage;

/* renamed from: t79  reason: default package */
public final class t79 implements lt8, jt8 {
    public final lt8 a;
    public final long b;
    public jt8 c;

    public t79(lt8 lt8, long j) {
        this.a = lt8;
        this.b = j;
    }

    public final void A(long j) {
        this.a.A(j - this.b);
    }

    public final long F(long j, tnd tnd) {
        long j2 = this.b;
        return this.a.F(j - j2, tnd) + j2;
    }

    public final boolean M(long j) {
        return this.a.M(j - this.b);
    }

    public final void S(jt8 jt8, long j) {
        this.c = jt8;
        this.a.S(this, j - this.b);
    }

    public final long T(ld5[] ld5Arr, boolean[] zArr, kcd[] kcdArr, boolean[] zArr2, long j) {
        kcd[] kcdArr2 = kcdArr;
        kcd[] kcdArr3 = new kcd[kcdArr2.length];
        int i = 0;
        while (true) {
            kcd kcd = null;
            if (i >= kcdArr2.length) {
                break;
            }
            u79 u79 = (u79) kcdArr2[i];
            if (u79 != null) {
                kcd = u79.a;
            }
            kcdArr3[i] = kcd;
            i++;
        }
        long j2 = this.b;
        long T = this.a.T(ld5Arr, zArr, kcdArr3, zArr2, j - j2);
        for (int i2 = 0; i2 < kcdArr2.length; i2++) {
            kcd kcd2 = kcdArr3[i2];
            if (kcd2 == null) {
                kcdArr2[i2] = null;
            } else {
                kcd kcd3 = kcdArr2[i2];
                if (kcd3 == null || ((u79) kcd3).a != kcd2) {
                    kcdArr2[i2] = new u79(kcd2, j2);
                }
            }
        }
        return T + j2;
    }

    public final void b(psd psd) {
        lt8 lt8 = (lt8) psd;
        jt8 jt8 = this.c;
        jt8.getClass();
        jt8.b(this);
    }

    public final void c(lt8 lt8) {
        jt8 jt8 = this.c;
        jt8.getClass();
        jt8.c(this);
    }

    public final boolean d() {
        return this.a.d();
    }

    public final long i() {
        long i = this.a.i();
        if (i == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.b + i;
    }

    public final void r() {
        this.a.r();
    }

    public final long s(long j) {
        long j2 = this.b;
        return this.a.s(j - j2) + j2;
    }

    public final long w() {
        long w = this.a.w();
        if (w == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.b + w;
    }

    public final tpf x() {
        return this.a.x();
    }

    public final long y() {
        long y = this.a.y();
        if (y == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.b + y;
    }

    public final void z(long j, boolean z) {
        this.a.z(j - this.b, z);
    }
}
