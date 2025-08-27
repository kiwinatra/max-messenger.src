package defpackage;

import java.math.RoundingMode;

/* renamed from: ye7  reason: default package */
public final class ye7 implements aod {
    public final long a;
    public final pa8 b;
    public final pa8 c;
    public final int o;
    public long v;

    public ye7(long j, long j2, long j3) {
        long j4 = j;
        long j5 = j2;
        long j6 = j3;
        this.v = j4;
        this.a = j6;
        pa8 pa8 = new pa8(1);
        this.b = pa8;
        pa8 pa82 = new pa8(1);
        this.c = pa82;
        pa8.a(0);
        pa82.a(j2);
        int i = -2147483647;
        if (j4 != -9223372036854775807L) {
            long a0 = v0g.a0(j5 - j6, 8, j, RoundingMode.HALF_UP);
            if (a0 > 0 && a0 <= 2147483647L) {
                i = (int) a0;
            }
            this.o = i;
            return;
        }
        this.o = -2147483647;
    }

    public final long a() {
        return this.a;
    }

    public final long b(long j) {
        return this.b.b(v0g.c(this.c, j));
    }

    public final boolean c() {
        return true;
    }

    public final boolean d(long j) {
        pa8 pa8 = this.b;
        return j - pa8.b(pa8.b - 1) < 100000;
    }

    public final qnd e(long j) {
        pa8 pa8 = this.b;
        int c2 = v0g.c(pa8, j);
        long b2 = pa8.b(c2);
        pa8 pa82 = this.c;
        wnd wnd = new wnd(b2, pa82.b(c2));
        if (b2 == j || c2 == pa8.b - 1) {
            return new qnd(wnd, wnd);
        }
        int i = c2 + 1;
        return new qnd(wnd, new wnd(pa8.b(i), pa82.b(i)));
    }

    public final long f() {
        return this.v;
    }

    public final int h() {
        return this.o;
    }
}
