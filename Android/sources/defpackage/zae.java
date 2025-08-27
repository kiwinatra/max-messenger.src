package defpackage;

/* renamed from: zae  reason: default package */
public final class zae extends j3h {
    public final sc5 b;
    public final bv1 c;

    public zae(ub5 ub5) {
        super(2);
        bv1 bv1 = new bv1(1, false);
        this.c = bv1;
        try {
            this.b = new sc5(ub5, this);
            bv1.g();
        } catch (Throwable th) {
            this.c.g();
            throw th;
        }
    }

    public final int I() {
        n1();
        return this.b.I();
    }

    public final void O(boolean z) {
        n1();
        sc5 sc5 = this.b;
        sc5.G1();
        sc5.G1();
        int d = sc5.F0.d(sc5.i1.e, z);
        int i = 1;
        if (z && d != 1) {
            i = 2;
        }
        sc5.D1(d, i, z);
    }

    public final long R() {
        n1();
        return this.b.R();
    }

    public final ikf V0() {
        n1();
        return this.b.V0();
    }

    public final void X0() {
        n1();
        this.b.G1();
    }

    public final float b() {
        n1();
        sc5 sc5 = this.b;
        sc5.G1();
        return sc5.b1;
    }

    public final int c0() {
        n1();
        return this.b.c0();
    }

    public final int d0() {
        n1();
        return this.b.d0();
    }

    public final int getRepeatMode() {
        n1();
        sc5 sc5 = this.b;
        sc5.G1();
        return sc5.K0;
    }

    public final long h() {
        n1();
        return this.b.h();
    }

    public final boolean k() {
        n1();
        return this.b.k();
    }

    public final long m() {
        n1();
        return this.b.m();
    }

    public final void n(int i, long j) {
        n1();
        this.b.n(i, j);
    }

    public final void n1() {
        this.c.b();
    }

    public final int x() {
        n1();
        return this.b.x();
    }
}
