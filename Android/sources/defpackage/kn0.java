package defpackage;

/* renamed from: kn0  reason: default package */
public final class kn0 {
    public final long a;
    public final long b;
    public final long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;

    public kn0(long j, long j2, long j3, long j4, long j5, long j6, int i) {
        long j7 = j;
        long j8 = j2;
        long j9 = j3;
        long j10 = j4;
        long j11 = j5;
        long j12 = j6;
        switch (i) {
            case 1:
                this.a = j7;
                this.b = j8;
                this.d = 0;
                this.e = j9;
                this.f = j10;
                this.g = j11;
                this.c = j12;
                this.h = b(j2, 0, j3, j4, j5, j6);
                return;
            default:
                this.a = j7;
                this.b = j8;
                this.d = 0;
                this.e = j9;
                this.f = j10;
                this.g = j11;
                this.c = j12;
                this.h = a(j2, 0, j3, j4, j5, j6);
                return;
        }
    }

    public static long a(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 >= j5 || j2 + 1 >= j3) {
            return j4;
        }
        long j7 = (long) (((float) (j - j2)) * (((float) (j5 - j4)) / ((float) (j3 - j2))));
        return t0g.k(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
    }

    public static long b(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 >= j5 || j2 + 1 >= j3) {
            return j4;
        }
        long j7 = (long) (((float) (j - j2)) * (((float) (j5 - j4)) / ((float) (j3 - j2))));
        return v0g.k(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
    }
}
