package defpackage;

/* renamed from: gfg  reason: default package */
public final class gfg implements rnd {
    public final ffg a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public gfg(ffg ffg, int i, long j, long j2) {
        this.a = ffg;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / ((long) ffg.c);
        this.d = j3;
        this.e = t0g.J(j3 * ((long) i), 1000000, (long) ffg.b);
    }

    public final boolean c() {
        return true;
    }

    public final pnd e(long j) {
        ffg ffg = this.a;
        int i = this.b;
        long j2 = (((long) ffg.b) * j) / (((long) i) * 1000000);
        long j3 = this.d - 1;
        long k = t0g.k(j2, 0, j3);
        int i2 = ffg.c;
        long j4 = this.c;
        long J = t0g.J(k * ((long) i), 1000000, (long) ffg.b);
        vnd vnd = new vnd(J, (((long) i2) * k) + j4);
        if (J >= j || k == j3) {
            return new pnd(vnd, vnd);
        }
        long j5 = k + 1;
        return new pnd(vnd, new vnd(t0g.J(j5 * ((long) i), 1000000, (long) ffg.b), (((long) i2) * j5) + j4));
    }

    public final long f() {
        return this.e;
    }
}
