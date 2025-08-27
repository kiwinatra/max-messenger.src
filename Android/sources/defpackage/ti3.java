package defpackage;

/* renamed from: ti3  reason: default package */
public class ti3 implements rnd {
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;
    public final boolean g;

    public ti3(long j, long j2, int i, int i2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        this.g = z;
        if (j == -1) {
            this.d = -1;
            this.f = -9223372036854775807L;
            return;
        }
        long j3 = j - j2;
        this.d = j3;
        this.f = (Math.max(0, j3) * 8000000) / ((long) i);
    }

    public final boolean c() {
        return this.d != -1 || this.g;
    }

    public final pnd e(long j) {
        long j2 = this.d;
        int i = (j2 > -1 ? 1 : (j2 == -1 ? 0 : -1));
        long j3 = this.b;
        if (i != 0 || this.g) {
            int i2 = this.e;
            long j4 = (long) this.c;
            long j5 = (((((long) i2) * j) / 8000000) / j4) * j4;
            if (i != 0) {
                j5 = Math.min(j5, j2 - j4);
            }
            long max = Math.max(j5, 0) + j3;
            long max2 = (Math.max(0, max - j3) * 8000000) / ((long) i2);
            vnd vnd = new vnd(max2, max);
            if (i != 0 && max2 < j) {
                long j6 = max + j4;
                if (j6 < this.a) {
                    return new pnd(vnd, new vnd((Math.max(0, j6 - j3) * 8000000) / ((long) i2), j6));
                }
            }
            return new pnd(vnd, vnd);
        }
        vnd vnd2 = new vnd(0, j3);
        return new pnd(vnd2, vnd2);
    }

    public final long f() {
        return this.f;
    }
}
