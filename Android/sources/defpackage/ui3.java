package defpackage;

/* renamed from: ui3  reason: default package */
public class ui3 implements snd {
    public final long a;
    public final long b;
    public final int c;
    public final long o;
    public final int v;
    public final long w;
    public final boolean x;

    public ui3(long j, long j2, int i, int i2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.v = i;
        this.x = z;
        if (j == -1) {
            this.o = -1;
            this.w = -9223372036854775807L;
            return;
        }
        long j3 = j - j2;
        this.o = j3;
        this.w = (Math.max(0, j3) * 8000000) / ((long) i);
    }

    public final boolean c() {
        return this.o != -1 || this.x;
    }

    public final qnd e(long j) {
        long j2 = this.o;
        int i = (j2 > -1 ? 1 : (j2 == -1 ? 0 : -1));
        long j3 = this.b;
        if (i != 0 || this.x) {
            int i2 = this.v;
            long j4 = (long) this.c;
            long j5 = (((((long) i2) * j) / 8000000) / j4) * j4;
            if (i != 0) {
                j5 = Math.min(j5, j2 - j4);
            }
            long max = Math.max(j5, 0) + j3;
            long max2 = (Math.max(0, max - j3) * 8000000) / ((long) i2);
            wnd wnd = new wnd(max2, max);
            if (i != 0 && max2 < j) {
                long j6 = max + j4;
                if (j6 < this.a) {
                    return new qnd(wnd, new wnd((Math.max(0, j6 - j3) * 8000000) / ((long) i2), j6));
                }
            }
            return new qnd(wnd, wnd);
        }
        wnd wnd2 = new wnd(0, j3);
        return new qnd(wnd2, wnd2);
    }

    public final long f() {
        return this.w;
    }
}
