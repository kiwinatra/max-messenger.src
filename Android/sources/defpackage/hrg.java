package defpackage;

/* renamed from: hrg  reason: default package */
public final class hrg implements znd {
    public final long a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final long[] f;

    public hrg(long j, int i, long j2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.f = jArr;
        this.d = j3;
        this.e = j3 != -1 ? j + j3 : -1;
    }

    public final long a() {
        return this.e;
    }

    public final long b(long j) {
        long j2 = j - this.a;
        if (!c() || j2 <= ((long) this.b)) {
            return 0;
        }
        long[] jArr = this.f;
        y64.k(jArr);
        double d2 = (((double) j2) * 256.0d) / ((double) this.d);
        int f2 = t0g.f(jArr, (long) d2, true);
        long j3 = this.c;
        long j4 = (((long) f2) * j3) / 100;
        long j5 = jArr[f2];
        int i = f2 + 1;
        long j6 = (j3 * ((long) i)) / 100;
        long j7 = f2 == 99 ? 256 : jArr[i];
        return Math.round((j5 == j7 ? 0.0d : (d2 - ((double) j5)) / ((double) (j7 - j5))) * ((double) (j6 - j4))) + j4;
    }

    public final boolean c() {
        return this.f != null;
    }

    public final pnd e(long j) {
        double d2;
        boolean c2 = c();
        int i = this.b;
        long j2 = this.a;
        if (!c2) {
            vnd vnd = new vnd(0, j2 + ((long) i));
            return new pnd(vnd, vnd);
        }
        long k = t0g.k(j, 0, this.c);
        double d3 = (((double) k) * 100.0d) / ((double) this.c);
        double d4 = 0.0d;
        if (d3 > 0.0d) {
            if (d3 >= 100.0d) {
                d2 = 256.0d;
                d4 = 256.0d;
                long j3 = this.d;
                vnd vnd2 = new vnd(k, j2 + t0g.k(Math.round((d4 / d2) * ((double) j3)), (long) i, j3 - 1));
                return new pnd(vnd2, vnd2);
            }
            int i2 = (int) d3;
            long[] jArr = this.f;
            y64.k(jArr);
            double d5 = (double) jArr[i2];
            d4 = (((i2 == 99 ? 256.0d : (double) jArr[i2 + 1]) - d5) * (d3 - ((double) i2))) + d5;
        }
        d2 = 256.0d;
        long j32 = this.d;
        vnd vnd22 = new vnd(k, j2 + t0g.k(Math.round((d4 / d2) * ((double) j32)), (long) i, j32 - 1));
        return new pnd(vnd22, vnd22);
    }

    public final long f() {
        return this.c;
    }
}
