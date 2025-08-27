package defpackage;

import android.util.Pair;

/* renamed from: jkf  reason: default package */
public abstract class jkf {
    public static final ckf a = new Object();
    public static final String b = Integer.toString(0, 36);
    public static final String c = Integer.toString(1, 36);
    public static final String d = Integer.toString(2, 36);

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, ckf] */
    static {
        int i = v0g.a;
    }

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

    public final int d(int i, ekf ekf, hkf hkf, int i2, boolean z) {
        int i3 = g(i, ekf, false).c;
        if (n(i3, hkf, 0).o != i) {
            return i + 1;
        }
        int e = e(i3, i2, z);
        if (e == -1) {
            return -1;
        }
        return n(e, hkf, 0).n;
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

    public boolean equals(Object obj) {
        int c2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jkf)) {
            return false;
        }
        jkf jkf = (jkf) obj;
        if (jkf.p() != p() || jkf.i() != i()) {
            return false;
        }
        hkf hkf = new hkf();
        ekf ekf = new ekf();
        hkf hkf2 = new hkf();
        ekf ekf2 = new ekf();
        for (int i = 0; i < p(); i++) {
            if (!n(i, hkf, 0).equals(jkf.n(i, hkf2, 0))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < i(); i2++) {
            if (!g(i2, ekf, true).equals(jkf.g(i2, ekf2, true))) {
                return false;
            }
        }
        int a2 = a(true);
        if (a2 != jkf.a(true) || (c2 = c(true)) != jkf.c(true)) {
            return false;
        }
        while (a2 != c2) {
            int e = e(a2, 0, true);
            if (e != jkf.e(a2, 0, true)) {
                return false;
            }
            a2 = e;
        }
        return true;
    }

    public final ekf f(int i, ekf ekf) {
        return g(i, ekf, false);
    }

    public abstract ekf g(int i, ekf ekf, boolean z);

    public ekf h(Object obj, ekf ekf) {
        return g(b(obj), ekf, true);
    }

    public int hashCode() {
        hkf hkf = new hkf();
        ekf ekf = new ekf();
        int p = p() + 217;
        for (int i = 0; i < p(); i++) {
            p = (p * 31) + n(i, hkf, 0).hashCode();
        }
        int i2 = i() + (p * 31);
        for (int i3 = 0; i3 < i(); i3++) {
            i2 = (i2 * 31) + g(i3, ekf, true).hashCode();
        }
        int a2 = a(true);
        while (a2 != -1) {
            i2 = (i2 * 31) + a2;
            a2 = e(a2, 0, true);
        }
        return i2;
    }

    public abstract int i();

    public final Pair j(hkf hkf, ekf ekf, int i, long j) {
        Pair k = k(hkf, ekf, i, j, 0);
        k.getClass();
        return k;
    }

    public final Pair k(hkf hkf, ekf ekf, int i, long j, long j2) {
        n79.i(i, p());
        n(i, hkf, j2);
        if (j == -9223372036854775807L) {
            j = hkf.l;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = hkf.n;
        g(i2, ekf, false);
        while (i2 < hkf.o && ekf.e != j) {
            int i3 = i2 + 1;
            if (g(i3, ekf, false).e > j) {
                break;
            }
            i2 = i3;
        }
        g(i2, ekf, true);
        long j3 = j - ekf.e;
        long j4 = ekf.d;
        if (j4 != -9223372036854775807L) {
            j3 = Math.min(j3, j4 - 1);
        }
        long max = Math.max(0, j3);
        Object obj = ekf.b;
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

    public abstract hkf n(int i, hkf hkf, long j);

    public final void o(int i, hkf hkf) {
        n(i, hkf, 0);
    }

    public abstract int p();

    public final boolean q() {
        return p() == 0;
    }
}
