package defpackage;

/* renamed from: kjf  reason: default package */
public final class kjf implements mt8, kt8 {
    public final mt8 a;
    public final long b;
    public kt8 c;

    public kjf(mt8 mt8, long j) {
        this.a = mt8;
        this.b = j;
    }

    public final void A(long j) {
        this.a.A(j - this.b);
    }

    public final void b(mt8 mt8) {
        kt8 kt8 = this.c;
        kt8.getClass();
        kt8.b(this);
    }

    public final void c(qsd qsd) {
        mt8 mt8 = (mt8) qsd;
        kt8 kt8 = this.c;
        kt8.getClass();
        kt8.c(this);
    }

    public final boolean d() {
        return this.a.d();
    }

    public final long g(md5[] md5Arr, boolean[] zArr, lcd[] lcdArr, boolean[] zArr2, long j) {
        lcd[] lcdArr2 = lcdArr;
        lcd[] lcdArr3 = new lcd[lcdArr2.length];
        int i = 0;
        while (true) {
            lcd lcd = null;
            if (i >= lcdArr2.length) {
                break;
            }
            jjf jjf = (jjf) lcdArr2[i];
            if (jjf != null) {
                lcd = jjf.a;
            }
            lcdArr3[i] = lcd;
            i++;
        }
        long j2 = this.b;
        long g = this.a.g(md5Arr, zArr, lcdArr3, zArr2, j - j2);
        for (int i2 = 0; i2 < lcdArr2.length; i2++) {
            lcd lcd2 = lcdArr3[i2];
            if (lcd2 == null) {
                lcdArr2[i2] = null;
            } else {
                lcd lcd3 = lcdArr2[i2];
                if (lcd3 == null || ((jjf) lcd3).a != lcd2) {
                    lcdArr2[i2] = new jjf(lcd2, j2);
                }
            }
        }
        return g + j2;
    }

    public final long h(long j, und und) {
        long j2 = this.b;
        return this.a.h(j - j2, und) + j2;
    }

    public final long i() {
        long i = this.a.i();
        if (i == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.b + i;
    }

    public final void j(kt8 kt8, long j) {
        this.c = kt8;
        this.a.j(this, j - this.b);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [c38, java.lang.Object] */
    public final boolean k(d38 d38) {
        ? obj = new Object();
        obj.b = d38.b;
        obj.c = d38.c;
        obj.a = d38.a - this.b;
        return this.a.k(new d38(obj));
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

    public final upf x() {
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
