package defpackage;

/* renamed from: fkf  reason: default package */
public final class fkf extends jkf {
    public final tb7 e;
    public final tb7 f;
    public final int[] g;
    public final int[] h;

    public fkf(k0d k0d, k0d k0d2, int[] iArr) {
        n79.g(k0d.o == iArr.length);
        this.e = k0d;
        this.f = k0d2;
        this.g = iArr;
        this.h = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.h[iArr[i]] = i;
        }
    }

    public final int a(boolean z) {
        if (q()) {
            return -1;
        }
        if (z) {
            return this.g[0];
        }
        return 0;
    }

    public final int b(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final int c(boolean z) {
        if (q()) {
            return -1;
        }
        tb7 tb7 = this.e;
        if (!z) {
            return tb7.size() - 1;
        }
        return this.g[tb7.size() - 1];
    }

    public final int e(int i, int i2, boolean z) {
        if (i2 == 1) {
            return i;
        }
        if (i == c(z)) {
            if (i2 == 2) {
                return a(z);
            }
            return -1;
        } else if (!z) {
            return i + 1;
        } else {
            return this.g[this.h[i] + 1];
        }
    }

    public final ekf g(int i, ekf ekf, boolean z) {
        ekf ekf2 = (ekf) this.f.get(i);
        ekf.j(ekf2.a, ekf2.b, ekf2.c, ekf2.d, ekf2.e, ekf2.g, ekf2.f);
        return ekf;
    }

    public final int i() {
        return this.f.size();
    }

    public final int l(int i, int i2, boolean z) {
        if (i2 == 1) {
            return i;
        }
        if (i == a(z)) {
            if (i2 == 2) {
                return c(z);
            }
            return -1;
        } else if (!z) {
            return i - 1;
        } else {
            return this.g[this.h[i] - 1];
        }
    }

    public final Object m(int i) {
        throw new UnsupportedOperationException();
    }

    public final hkf n(int i, hkf hkf, long j) {
        hkf hkf2 = hkf;
        hkf hkf3 = (hkf) this.e.get(i);
        Object obj = hkf3.a;
        ir8 ir8 = hkf3.c;
        hkf hkf4 = hkf3;
        long j2 = hkf4.m;
        int i2 = hkf4.n;
        int i3 = hkf4.o;
        long j3 = hkf4.p;
        hkf hkf5 = hkf4;
        hkf hkf6 = hkf;
        hkf6.b(obj, ir8, hkf3.d, hkf3.e, hkf3.f, hkf3.g, hkf3.h, hkf3.i, hkf3.j, hkf3.l, j2, i2, i3, j3);
        hkf hkf7 = hkf;
        hkf7.k = hkf5.k;
        return hkf7;
    }

    public final int p() {
        return this.e.size();
    }
}
