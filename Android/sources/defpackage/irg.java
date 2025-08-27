package defpackage;

/* renamed from: irg  reason: default package */
public final class irg implements aod {
    public final long a;
    public final int b;
    public final long c;
    public final int o;
    public final long v;
    public final long w;
    public final long[] x;

    public irg(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.o = i2;
        this.v = j3;
        this.x = jArr;
        this.w = j3 != -1 ? j + j3 : -1;
    }

    public final long a() {
        return this.w;
    }

    public final long b(long j) {
        long j2 = j - this.a;
        if (!c() || j2 <= ((long) this.b)) {
            return 0;
        }
        long[] jArr = this.x;
        n79.o(jArr);
        double d = (((double) j2) * 256.0d) / ((double) this.v);
        int f = v0g.f(jArr, (long) d, true);
        long j3 = this.c;
        long j4 = (((long) f) * j3) / 100;
        long j5 = jArr[f];
        int i = f + 1;
        long j6 = (j3 * ((long) i)) / 100;
        long j7 = f == 99 ? 256 : jArr[i];
        return Math.round((j5 == j7 ? 0.0d : (d - ((double) j5)) / ((double) (j7 - j5))) * ((double) (j6 - j4))) + j4;
    }

    public final boolean c() {
        return this.x != null;
    }

    public final qnd e(long j) {
        double d;
        boolean c2 = c();
        int i = this.b;
        long j2 = this.a;
        if (!c2) {
            wnd wnd = new wnd(0, j2 + ((long) i));
            return new qnd(wnd, wnd);
        }
        long k = v0g.k(j, 0, this.c);
        double d2 = (((double) k) * 100.0d) / ((double) this.c);
        double d3 = 0.0d;
        if (d2 > 0.0d) {
            if (d2 >= 100.0d) {
                d = 256.0d;
                d3 = 256.0d;
                long j3 = this.v;
                wnd wnd2 = new wnd(k, j2 + v0g.k(Math.round((d3 / d) * ((double) j3)), (long) i, j3 - 1));
                return new qnd(wnd2, wnd2);
            }
            int i2 = (int) d2;
            long[] jArr = this.x;
            n79.o(jArr);
            double d4 = (double) jArr[i2];
            d3 = (((i2 == 99 ? 256.0d : (double) jArr[i2 + 1]) - d4) * (d2 - ((double) i2))) + d4;
        }
        d = 256.0d;
        long j32 = this.v;
        wnd wnd22 = new wnd(k, j2 + v0g.k(Math.round((d3 / d) * ((double) j32)), (long) i, j32 - 1));
        return new qnd(wnd22, wnd22);
    }

    public final long f() {
        return this.c;
    }

    public final int h() {
        return this.o;
    }
}
