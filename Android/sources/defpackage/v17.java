package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: v17  reason: default package */
public final class v17 implements kcd {
    public final int a;
    public final d27 b;
    public int c = -1;

    public v17(d27 d27, int i) {
        this.b = d27;
        this.a = i;
    }

    public final void a() {
        y64.g(this.c == -1);
        d27 d27 = this.b;
        d27.c();
        d27.T0.getClass();
        int[] iArr = d27.T0;
        int i = this.a;
        int i2 = iArr[i];
        if (i2 != -1) {
            boolean[] zArr = d27.W0;
            if (!zArr[i2]) {
                zArr[i2] = true;
                this.c = i2;
            }
        } else if (d27.S0.contains(d27.R0.a(i))) {
            i2 = -3;
            this.c = i2;
        }
        i2 = -2;
        this.c = i2;
    }

    public final void b() {
        int i = this.c;
        d27 d27 = this.b;
        if (i == -2) {
            d27.c();
            String str = d27.R0.a(this.a).c[0].Z;
            StringBuilder sb = new StringBuilder(g63.f(60, str));
            sb.append("Unable to bind a sample queue to TrackGroup with mime type ");
            sb.append(str);
            sb.append(".");
            throw new IOException(sb.toString());
        } else if (i == -1) {
            d27.m();
        } else if (i != -3) {
            d27.m();
            d27.E0[i].v();
        }
    }

    public final boolean c() {
        if (this.c != -3) {
            if (d()) {
                int i = this.c;
                d27 d27 = this.b;
                if (d27.k() || !d27.E0[i].t(d27.c1)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean d() {
        int i = this.c;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    public final int e(long j) {
        int i;
        if (!d()) {
            return 0;
        }
        int i2 = this.c;
        d27 d27 = this.b;
        if (d27.k()) {
            return 0;
        }
        b27 b27 = d27.E0[i2];
        int q = b27.q(j, d27.c1);
        o07 o07 = (o07) b0h.x(d27.w0);
        if (o07 == null || o07.T0) {
            i = q;
        } else {
            i = Math.min(q, o07.f(i2) - b27.o());
        }
        b27.B(i);
        return i;
    }

    public final int f(xe8 xe8, aa4 aa4, int i) {
        ca6 ca6;
        xe8 xe82 = xe8;
        aa4 aa42 = aa4;
        int i2 = -3;
        if (this.c == -3) {
            aa42.a(4);
            return -4;
        }
        if (d()) {
            int i3 = this.c;
            d27 d27 = this.b;
            if (!d27.k()) {
                ArrayList arrayList = d27.w0;
                int i4 = 0;
                if (!arrayList.isEmpty()) {
                    int i5 = 0;
                    loop0:
                    while (i5 < arrayList.size() - 1) {
                        int i6 = ((o07) arrayList.get(i5)).Y;
                        int length = d27.E0.length;
                        for (int i7 = 0; i7 < length; i7++) {
                            if (d27.W0[i7] && d27.E0[i7].x() == i6) {
                                break loop0;
                            }
                        }
                        i5++;
                    }
                    t0g.I(arrayList, 0, i5);
                    o07 o07 = (o07) arrayList.get(0);
                    ca6 ca62 = o07.o;
                    if (!ca62.equals(d27.P0)) {
                        d27.Y.b(d27.b, ca62, o07.v, o07.w, o07.x);
                    }
                    d27.P0 = ca62;
                }
                if ((arrayList.isEmpty() || ((o07) arrayList.get(0)).T0) && (i2 = d27.E0[i3].y(xe82, aa42, i, d27.c1)) == -5) {
                    ca6 ca63 = (ca6) xe82.c;
                    ca63.getClass();
                    if (i3 == d27.K0) {
                        int x = d27.E0[i3].x();
                        while (i4 < arrayList.size() && ((o07) arrayList.get(i4)).Y != x) {
                            i4++;
                        }
                        if (i4 < arrayList.size()) {
                            ca6 = ((o07) arrayList.get(i4)).o;
                        } else {
                            ca6 = d27.O0;
                            ca6.getClass();
                        }
                        ca63 = ca63.d(ca6);
                    }
                    xe82.c = ca63;
                }
            }
        }
        return i2;
    }
}
