package defpackage;

import java.math.RoundingMode;

/* renamed from: hfg  reason: default package */
public final class hfg implements snd {
    public final ffg a;
    public final int b;
    public final long c;
    public final long o;
    public final long v;

    public hfg(ffg ffg, int i, long j, long j2) {
        this.a = ffg;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / ((long) ffg.c);
        this.o = j3;
        this.v = d(j3);
    }

    public final boolean c() {
        return true;
    }

    public final long d(long j) {
        long j2 = (long) this.a.b;
        int i = v0g.a;
        return v0g.a0(j * ((long) this.b), 1000000, j2, RoundingMode.FLOOR);
    }

    public final qnd e(long j) {
        ffg ffg = this.a;
        long j2 = (((long) ffg.b) * j) / (((long) this.b) * 1000000);
        long j3 = this.o;
        long k = v0g.k(j2, 0, j3 - 1);
        long j4 = this.c;
        long d = d(k);
        wnd wnd = new wnd(d, (((long) ffg.c) * k) + j4);
        if (d >= j || k == j3 - 1) {
            return new qnd(wnd, wnd);
        }
        long j5 = k + 1;
        return new qnd(wnd, new wnd(d(j5), (((long) ffg.c) * j5) + j4));
    }

    public final long f() {
        return this.v;
    }
}
