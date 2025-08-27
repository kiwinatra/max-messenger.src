package defpackage;

/* renamed from: tq5  reason: default package */
public class tq5 implements rnd {
    public final /* synthetic */ int a = 1;
    public final long b;
    public final Object c;

    public tq5(uq5 uq5, long j) {
        this.c = uq5;
        this.b = j;
    }

    public final boolean c() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final pnd e(long j) {
        switch (this.a) {
            case 0:
                uq5 uq5 = (uq5) this.c;
                y64.k((dm4) uq5.l);
                dm4 dm4 = (dm4) uq5.l;
                long[] jArr = (long[]) dm4.b;
                int f = t0g.f(jArr, t0g.k((((long) uq5.f) * j) / 1000000, 0, uq5.k - 1), false);
                long j2 = 0;
                long j3 = f == -1 ? 0 : jArr[f];
                long[] jArr2 = (long[]) dm4.c;
                if (f != -1) {
                    j2 = jArr2[f];
                }
                int i = uq5.f;
                long j4 = (j3 * 1000000) / ((long) i);
                long j5 = this.b;
                vnd vnd = new vnd(j4, j2 + j5);
                if (j4 == j || f == jArr.length - 1) {
                    return new pnd(vnd, vnd);
                }
                int i2 = f + 1;
                return new pnd(vnd, new vnd((jArr[i2] * 1000000) / ((long) i), j5 + jArr2[i2]));
            default:
                return (pnd) this.c;
        }
    }

    public final long f() {
        switch (this.a) {
            case 0:
                return ((uq5) this.c).c();
            default:
                return this.b;
        }
    }

    public tq5(long j) {
        this(j, 0);
    }

    public tq5(long j, long j2) {
        this.b = j;
        vnd vnd = j2 == 0 ? vnd.c : new vnd(0, j2);
        this.c = new pnd(vnd, vnd);
    }
}
