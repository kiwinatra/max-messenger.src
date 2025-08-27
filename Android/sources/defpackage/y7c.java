package defpackage;

import java.io.IOException;

/* renamed from: y7c  reason: default package */
public final class y7c implements kcd {
    public final int a;
    public final /* synthetic */ c8c b;

    public y7c(c8c c8c, int i) {
        this.b = c8c;
        this.a = i;
    }

    public final void b() {
        c8c c8c = this.b;
        c8c.B0[this.a].v();
        int o = c8c.o.o(c8c.K0);
        w28 w28 = c8c.Y;
        IOException iOException = (IOException) w28.o;
        if (iOException == null) {
            r28 r28 = (r28) w28.c;
            if (r28 != null) {
                if (o == Integer.MIN_VALUE) {
                    o = r28.b;
                }
                IOException iOException2 = r28.o;
                if (iOException2 != null && r28.v > o) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public final boolean c() {
        c8c c8c = this.b;
        return !c8c.o() && c8c.B0[this.a].t(c8c.T0);
    }

    public final int e(long j) {
        c8c c8c = this.b;
        if (c8c.o()) {
            return 0;
        }
        int i = this.a;
        c8c.j(i);
        icd icd = c8c.B0[i];
        int q = icd.q(j, c8c.T0);
        icd.B(q);
        if (q == 0) {
            c8c.k(i);
        }
        return q;
    }

    public final int f(xe8 xe8, aa4 aa4, int i) {
        c8c c8c = this.b;
        if (c8c.o()) {
            return -3;
        }
        int i2 = this.a;
        c8c.j(i2);
        int y = c8c.B0[i2].y(xe8, aa4, i, c8c.T0);
        if (y == -3) {
            c8c.k(i2);
        }
        return y;
    }
}
