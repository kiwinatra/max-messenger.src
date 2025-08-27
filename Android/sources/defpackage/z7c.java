package defpackage;

import java.io.IOException;

/* renamed from: z7c  reason: default package */
public final class z7c implements lcd {
    public final int a;
    public final /* synthetic */ d8c b;

    public z7c(d8c d8c, int i) {
        this.b = d8c;
        this.a = i;
    }

    public final void b() {
        d8c d8c = this.b;
        d8c.C0[this.a].u();
        int p = d8c.o.p(d8c.M0);
        l15 l15 = d8c.Z;
        IOException iOException = (IOException) l15.c;
        if (iOException == null) {
            r28 r28 = (r28) l15.b;
            if (r28 != null) {
                if (p == Integer.MIN_VALUE) {
                    p = r28.b;
                }
                IOException iOException2 = r28.o;
                if (iOException2 != null && r28.v > p) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public final boolean c() {
        d8c d8c = this.b;
        return !d8c.t() && d8c.C0[this.a].s(d8c.V0);
    }

    public final int e(long j) {
        d8c d8c = this.b;
        if (d8c.t()) {
            return 0;
        }
        int i = this.a;
        d8c.n(i);
        jcd jcd = d8c.C0[i];
        int p = jcd.p(j, d8c.V0);
        jcd.B(p);
        if (p == 0) {
            d8c.o(i);
        }
        return p;
    }

    public final int f(ox0 ox0, ba4 ba4, int i) {
        d8c d8c = this.b;
        if (d8c.t()) {
            return -3;
        }
        int i2 = this.a;
        d8c.n(i2);
        int x = d8c.C0[i2].x(ox0, ba4, i, d8c.V0);
        if (x == -3) {
            d8c.o(i2);
        }
        return x;
    }
}
