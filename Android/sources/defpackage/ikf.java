package defpackage;

import android.util.Pair;

/* renamed from: ikf  reason: default package */
public abstract class ikf implements jv0 {
    public static final bkf a = new Object();

    public int a(boolean z) {
        return q() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z) {
        if (q()) {
            return -1;
        }
        return p() - 1;
    }

    public final int d(int i, dkf dkf, gkf gkf, int i2, boolean z) {
        int i3 = g(i, dkf, false).c;
        if (n(i3, gkf, 0).y0 != i) {
            return i + 1;
        }
        int e = e(i3, i2, z);
        if (e == -1) {
            return -1;
        }
        return n(e, gkf, 0).x0;
    }

    public int e(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 == 2) {
                return i == c(z) ? a(z) : i + 1;
            }
            throw new IllegalStateException();
        } else if (i == c(z)) {
            return -1;
        } else {
            return i + 1;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ikf)) {
            return false;
        }
        ikf ikf = (ikf) obj;
        if (ikf.p() != p() || ikf.i() != i()) {
            return false;
        }
        gkf gkf = new gkf();
        dkf dkf = new dkf();
        gkf gkf2 = new gkf();
        dkf dkf2 = new dkf();
        for (int i = 0; i < p(); i++) {
            if (!n(i, gkf, 0).equals(ikf.n(i, gkf2, 0))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < i(); i2++) {
            if (!g(i2, dkf, true).equals(ikf.g(i2, dkf2, true))) {
                return false;
            }
        }
        return true;
    }

    public final dkf f(int i, dkf dkf) {
        return g(i, dkf, false);
    }

    public abstract dkf g(int i, dkf dkf, boolean z);

    public dkf h(Object obj, dkf dkf) {
        return g(b(obj), dkf, true);
    }

    public final int hashCode() {
        gkf gkf = new gkf();
        dkf dkf = new dkf();
        int p = p() + 217;
        for (int i = 0; i < p(); i++) {
            p = (p * 31) + n(i, gkf, 0).hashCode();
        }
        int i2 = i() + (p * 31);
        for (int i3 = 0; i3 < i(); i3++) {
            i2 = (i2 * 31) + g(i3, dkf, true).hashCode();
        }
        return i2;
    }

    public abstract int i();

    public final Pair j(gkf gkf, dkf dkf, int i, long j) {
        Pair k = k(gkf, dkf, i, j, 0);
        k.getClass();
        return k;
    }

    public final Pair k(gkf gkf, dkf dkf, int i, long j, long j2) {
        y64.i(i, p());
        n(i, gkf, j2);
        if (j == -9223372036854775807L) {
            j = gkf.v0;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = gkf.x0;
        g(i2, dkf, false);
        while (i2 < gkf.y0 && dkf.v != j) {
            int i3 = i2 + 1;
            if (g(i3, dkf, false).v > j) {
                break;
            }
            i2 = i3;
        }
        g(i2, dkf, true);
        long j3 = j - dkf.v;
        long j4 = dkf.o;
        if (j4 != -9223372036854775807L) {
            j3 = Math.min(j3, j4 - 1);
        }
        long max = Math.max(0, j3);
        Object obj = dkf.b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public int l(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 == 2) {
                return i == a(z) ? c(z) : i - 1;
            }
            throw new IllegalStateException();
        } else if (i == a(z)) {
            return -1;
        } else {
            return i - 1;
        }
    }

    public abstract Object m(int i);

    public abstract gkf n(int i, gkf gkf, long j);

    public final void o(int i, gkf gkf) {
        n(i, gkf, 0);
    }

    public abstract int p();

    public final boolean q() {
        return p() == 0;
    }
}
