package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.math.RoundingMode;

/* renamed from: cfg  reason: default package */
public final class cfg implements afg, bfg {
    public final /* synthetic */ int a = 0;
    public final int b;
    public long c;
    public int d;
    public long e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public cfg(wf5 wf5, ypf ypf, ffg ffg, String str, int i2) {
        this.f = wf5;
        this.g = ypf;
        this.h = ffg;
        int i3 = ffg.d;
        int i4 = ffg.a;
        int i5 = (i3 * i4) / 8;
        int i6 = ffg.c;
        if (i6 == i5) {
            int i7 = ffg.b;
            int i8 = i7 * i5;
            int i9 = i8 * 8;
            int max = Math.max(i5, i8 / 10);
            this.b = max;
            aa6 aa6 = new aa6();
            aa6.k = str;
            aa6.f = i9;
            aa6.g = i9;
            aa6.l = max;
            aa6.x = i4;
            aa6.y = i7;
            aa6.z = i2;
            this.i = new ca6(aa6);
            return;
        }
        StringBuilder sb = new StringBuilder(50);
        sb.append("Expected block size: ");
        sb.append(i5);
        sb.append("; got: ");
        sb.append(i6);
        throw ParserException.a(sb.toString(), (RuntimeException) null);
    }

    public final void a(long j) {
        switch (this.a) {
            case 0:
                this.c = j;
                this.d = 0;
                this.e = 0;
                return;
            default:
                this.c = j;
                this.d = 0;
                this.e = 0;
                return;
        }
    }

    public final void b(int i2, long j) {
        switch (this.a) {
            case 0:
                ((wf5) this.f).K(new gfg((ffg) this.h, 1, (long) i2, j));
                ((ypf) this.g).d((ca6) this.i);
                return;
            default:
                ((xf5) this.f).M(new hfg((ffg) this.h, 1, (long) i2, j));
                ((zpf) this.g).e((ea6) this.i);
                return;
        }
    }

    public boolean c(hf4 hf4, long j) {
        int i2;
        int i3;
        int i4;
        Object obj = this.g;
        long j2 = j;
        while (true) {
            i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
            if (i2 <= 0 || (i3 = this.d) >= (i4 = this.b)) {
                ffg ffg = (ffg) this.h;
                int i5 = ffg.c;
                int i6 = this.d / i5;
            } else {
                int c2 = ((zpf) obj).c(hf4, (int) Math.min((long) (i4 - i3), j2), true);
                if (c2 == -1) {
                    j2 = 0;
                } else {
                    this.d += c2;
                    j2 -= (long) c2;
                }
            }
        }
        ffg ffg2 = (ffg) this.h;
        int i52 = ffg2.c;
        int i62 = this.d / i52;
        if (i62 > 0) {
            long j3 = this.c;
            long j4 = this.e;
            long j5 = (long) ffg2.b;
            int i7 = v0g.a;
            int i8 = i62 * i52;
            int i9 = this.d - i8;
            ((zpf) obj).a(j3 + v0g.a0(j4, 1000000, j5, RoundingMode.FLOOR), 1, i8, i9, (xpf) null);
            this.e += (long) i62;
            this.d = i9;
        }
        return i2 <= 0;
    }

    public boolean d(gf4 gf4, long j) {
        int i2;
        int i3;
        int i4;
        long j2 = j;
        while (true) {
            i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
            if (i2 <= 0 || (i3 = this.d) >= (i4 = this.b)) {
                ffg ffg = (ffg) this.h;
                int i5 = ffg.c;
                int i6 = this.d / i5;
            } else {
                int a2 = ((ypf) this.g).a(gf4, (int) Math.min((long) (i4 - i3), j2), true);
                if (a2 == -1) {
                    j2 = 0;
                } else {
                    this.d += a2;
                    j2 -= (long) a2;
                }
            }
        }
        ffg ffg2 = (ffg) this.h;
        int i52 = ffg2.c;
        int i62 = this.d / i52;
        if (i62 > 0) {
            int i7 = i62 * i52;
            int i8 = this.d - i7;
            ((ypf) this.g).b(this.c + t0g.J(this.e, 1000000, (long) ffg2.b), 1, i7, i8, (wpf) null);
            this.e += (long) i62;
            this.d = i8;
        }
        return i2 <= 0;
    }

    public cfg(xf5 xf5, zpf zpf, ffg ffg, String str, int i2) {
        this.f = xf5;
        this.g = zpf;
        this.h = ffg;
        int i3 = ffg.d;
        int i4 = ffg.a;
        int i5 = (i3 * i4) / 8;
        int i6 = ffg.c;
        if (i6 == i5) {
            int i7 = ffg.b;
            int i8 = i7 * i5;
            int i9 = i8 * 8;
            int max = Math.max(i5, i8 / 10);
            this.b = max;
            ba6 ba6 = new ba6();
            ba6.m = vq9.l(str);
            ba6.g = i9;
            ba6.h = i9;
            ba6.n = max;
            ba6.A = i4;
            ba6.B = i7;
            ba6.C = i2;
            this.i = new ea6(ba6);
            return;
        }
        throw androidx.media3.common.ParserException.a("Expected block size: " + i5 + "; got: " + i6, (RuntimeException) null);
    }
}
