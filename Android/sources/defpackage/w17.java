package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: w17  reason: default package */
public final class w17 implements lcd {
    public final int a;
    public final e27 b;
    public int c = -1;

    public w17(e27 e27, int i) {
        this.b = e27;
        this.a = i;
    }

    public final void a() {
        n79.g(this.c == -1);
        e27 e27 = this.b;
        e27.c();
        e27.T0.getClass();
        int[] iArr = e27.T0;
        int i = this.a;
        int i2 = iArr[i];
        if (i2 != -1) {
            boolean[] zArr = e27.W0;
            if (!zArr[i2]) {
                zArr[i2] = true;
                this.c = i2;
            }
        } else if (e27.S0.contains(e27.R0.a(i))) {
            i2 = -3;
            this.c = i2;
        }
        i2 = -2;
        this.c = i2;
    }

    public final void b() {
        int i = this.c;
        e27 e27 = this.b;
        if (i == -2) {
            e27.c();
            throw new IOException(wj6.k("Unable to bind a sample queue to TrackGroup with MIME type ", e27.R0.a(this.a).d[0].n, "."));
        } else if (i == -1) {
            e27.t();
        } else if (i != -3) {
            e27.t();
            e27.E0[i].u();
        }
    }

    public final boolean c() {
        if (this.c != -3) {
            if (d()) {
                int i = this.c;
                e27 e27 = this.b;
                if (e27.p() || !e27.E0[i].s(e27.c1)) {
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
        e27 e27 = this.b;
        if (e27.p()) {
            return 0;
        }
        c27 c27 = e27.E0[i2];
        int p = c27.p(j, e27.c1);
        p07 p07 = (p07) b0h.x(e27.w0);
        if (p07 == null || p07.U0) {
            i = p;
        } else {
            i = Math.min(p, p07.f(i2) - c27.n());
        }
        c27.B(i);
        return i;
    }

    public final int f(ox0 ox0, ba4 ba4, int i) {
        ea6 ea6;
        ox0 ox02 = ox0;
        ba4 ba42 = ba4;
        int i2 = -3;
        if (this.c == -3) {
            ba42.a(4);
            return -4;
        }
        if (d()) {
            int i3 = this.c;
            e27 e27 = this.b;
            if (!e27.p()) {
                ArrayList arrayList = e27.w0;
                int i4 = 0;
                if (!arrayList.isEmpty()) {
                    int i5 = 0;
                    loop0:
                    while (i5 < arrayList.size() - 1) {
                        int i6 = ((p07) arrayList.get(i5)).Y;
                        int length = e27.E0.length;
                        for (int i7 = 0; i7 < length; i7++) {
                            if (e27.W0[i7] && e27.E0[i7].w() == ((long) i6)) {
                                break loop0;
                            }
                        }
                        i5++;
                    }
                    v0g.X(arrayList, 0, i5);
                    p07 p07 = (p07) arrayList.get(0);
                    ea6 ea62 = p07.o;
                    if (!ea62.equals(e27.P0)) {
                        e27.Y.l(e27.b, ea62, p07.v, p07.w, p07.x);
                    }
                    e27.P0 = ea62;
                }
                if ((arrayList.isEmpty() || ((p07) arrayList.get(0)).U0) && (i2 = e27.E0[i3].x(ox02, ba42, i, e27.c1)) == -5) {
                    ea6 ea63 = (ea6) ox02.b;
                    ea63.getClass();
                    if (i3 == e27.K0) {
                        int r = cvg.r(e27.E0[i3].w());
                        while (i4 < arrayList.size() && ((p07) arrayList.get(i4)).Y != r) {
                            i4++;
                        }
                        if (i4 < arrayList.size()) {
                            ea6 = ((p07) arrayList.get(i4)).o;
                        } else {
                            ea6 = e27.O0;
                            ea6.getClass();
                        }
                        ea63 = ea63.f(ea6);
                    }
                    ox02.b = ea63;
                }
            }
        }
        return i2;
    }
}
