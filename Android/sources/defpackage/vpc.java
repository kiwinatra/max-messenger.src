package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.io.IOException;

/* renamed from: vpc  reason: default package */
public final class vpc implements sf5 {
    public final ca6 a;
    public final g1g b = new g1g(9);
    public ypf c;
    public int d = 0;
    public int e;
    public long f;
    public int g;
    public int h;

    public vpc(ca6 ca6) {
        this.a = ca6;
    }

    public final void d(long j, long j2) {
        this.d = 0;
    }

    public final void g(wf5 wf5) {
        wf5.K(new tq5(-9223372036854775807L));
        ypf B = wf5.B(0, 3);
        this.c = B;
        B.d(this.a);
        wf5.v();
    }

    public final boolean h(uf5 uf5) {
        g1g g1g = this.b;
        g1g.E(8);
        ((gf4) uf5).q(g1g.a, 0, 8, false);
        return g1g.h() == 1380139777;
    }

    public final int i(uf5 uf5, yl4 yl4) {
        y64.k(this.c);
        while (true) {
            int i = this.d;
            g1g g1g = this.b;
            if (i == 0) {
                g1g.E(8);
                if (!((gf4) uf5).j(g1g.a, 0, 8, true)) {
                    return -1;
                }
                if (g1g.h() == 1380139777) {
                    this.e = g1g.v();
                    this.d = 1;
                } else {
                    throw new IOException("Input not RawCC");
                }
            } else if (i == 1) {
                int i2 = this.e;
                if (i2 == 0) {
                    g1g.E(5);
                    if (!((gf4) uf5).j(g1g.a, 0, 5, true)) {
                        break;
                    }
                    this.f = (g1g.w() * 1000) / 45;
                    this.g = g1g.v();
                    this.h = 0;
                    this.d = 2;
                } else if (i2 == 1) {
                    g1g.E(9);
                    if (!((gf4) uf5).j(g1g.a, 0, 9, true)) {
                        break;
                    }
                    this.f = g1g.p();
                    this.g = g1g.v();
                    this.h = 0;
                    this.d = 2;
                } else {
                    StringBuilder sb = new StringBuilder(39);
                    sb.append("Unsupported version number: ");
                    sb.append(i2);
                    throw ParserException.a(sb.toString(), (RuntimeException) null);
                }
            } else if (i == 2) {
                while (this.g > 0) {
                    g1g.E(3);
                    ((gf4) uf5).j(g1g.a, 0, 3, false);
                    this.c.c(3, g1g);
                    this.h += 3;
                    this.g--;
                }
                int i3 = this.h;
                if (i3 > 0) {
                    this.c.b(this.f, 1, i3, 0, (wpf) null);
                }
                this.d = 1;
                return 0;
            } else {
                throw new IllegalStateException();
            }
        }
        this.d = 0;
        return -1;
    }

    public final void release() {
    }
}
