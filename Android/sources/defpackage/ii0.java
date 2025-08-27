package defpackage;

/* renamed from: ii0  reason: default package */
public final class ii0 extends cy6 {
    public int s0;
    public boolean t0;
    public int u0;
    public boolean v0;

    public final boolean A() {
        return this.v0;
    }

    public final boolean B() {
        return this.v0;
    }

    public final boolean T() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.r0;
            if (i4 >= i) {
                break;
            }
            tj3 tj3 = this.q0[i4];
            if ((this.t0 || tj3.c()) && ((((i2 = this.s0) == 0 || i2 == 1) && !tj3.A()) || (((i3 = this.s0) == 2 || i3 == 3) && !tj3.B()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.r0; i6++) {
            tj3 tj32 = this.q0[i6];
            if (this.t0 || tj32.c()) {
                if (!z2) {
                    int i7 = this.s0;
                    if (i7 == 0) {
                        i5 = tj32.i(2).d();
                    } else if (i7 == 1) {
                        i5 = tj32.i(4).d();
                    } else if (i7 == 2) {
                        i5 = tj32.i(3).d();
                    } else if (i7 == 3) {
                        i5 = tj32.i(5).d();
                    }
                    z2 = true;
                }
                int i8 = this.s0;
                if (i8 == 0) {
                    i5 = Math.min(i5, tj32.i(2).d());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, tj32.i(4).d());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, tj32.i(3).d());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, tj32.i(5).d());
                }
            }
        }
        int i9 = i5 + this.u0;
        int i10 = this.s0;
        if (i10 == 0 || i10 == 1) {
            J(i9, i9);
        } else {
            K(i9, i9);
        }
        this.v0 = true;
        return true;
    }

    public final int U() {
        int i = this.s0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    public final void b(gw7 gw7, boolean z) {
        boolean z2;
        int i;
        int i2;
        gw7 gw72 = gw7;
        aj3[] aj3Arr = this.Q;
        aj3 aj3 = this.I;
        aj3Arr[0] = aj3;
        aj3 aj32 = this.J;
        int i3 = 2;
        aj3Arr[2] = aj32;
        aj3 aj33 = this.K;
        aj3Arr[1] = aj33;
        aj3 aj34 = this.L;
        aj3Arr[3] = aj34;
        for (aj3 aj35 : aj3Arr) {
            aj35.i = gw72.k(aj35);
        }
        int i4 = this.s0;
        if (i4 >= 0 && i4 < 4) {
            aj3 aj36 = aj3Arr[i4];
            if (!this.v0) {
                T();
            }
            if (this.v0) {
                this.v0 = false;
                int i5 = this.s0;
                if (i5 == 0 || i5 == 1) {
                    gw72.d(aj3.i, this.Y);
                    gw72.d(aj33.i, this.Y);
                } else if (i5 == 2 || i5 == 3) {
                    gw72.d(aj32.i, this.Z);
                    gw72.d(aj34.i, this.Z);
                }
            } else {
                int i6 = 0;
                while (true) {
                    if (i6 >= this.r0) {
                        z2 = false;
                        break;
                    }
                    tj3 tj3 = this.q0[i6];
                    if ((this.t0 || tj3.c()) && ((((i2 = this.s0) == 0 || i2 == 1) && tj3.p0[0] == 3 && tj3.I.f != null && tj3.K.f != null) || ((i2 == 2 || i2 == 3) && tj3.p0[1] == 3 && tj3.J.f != null && tj3.L.f != null))) {
                        z2 = true;
                    } else {
                        i6++;
                    }
                }
                boolean z3 = aj3.g() || aj33.g();
                boolean z4 = aj32.g() || aj34.g();
                int i7 = (z2 || (((i = this.s0) != 0 || !z3) && ((i != 2 || !z4) && ((i != 1 || !z3) && (i != 3 || !z4))))) ? 4 : 5;
                int i8 = 0;
                while (i8 < this.r0) {
                    tj3 tj32 = this.q0[i8];
                    if (this.t0 || tj32.c()) {
                        sfe k = gw72.k(tj32.Q[this.s0]);
                        int i9 = this.s0;
                        aj3 aj37 = tj32.Q[i9];
                        aj37.i = k;
                        aj3 aj38 = aj37.f;
                        int i10 = (aj38 == null || aj38.d != this) ? 0 : aj37.g;
                        if (i9 == 0 || i9 == i3) {
                            vs l = gw7.l();
                            sfe m = gw7.m();
                            m.o = 0;
                            l.c(aj36.i, k, m, this.u0 - i10);
                            gw72.c(l);
                        } else {
                            vs l2 = gw7.l();
                            sfe m2 = gw7.m();
                            m2.o = 0;
                            l2.b(aj36.i, k, m2, this.u0 + i10);
                            gw72.c(l2);
                        }
                        gw72.e(aj36.i, k, this.u0 + i10, i7);
                    }
                    i8++;
                    i3 = 2;
                }
                int i11 = this.s0;
                if (i11 == 0) {
                    gw72.e(aj33.i, aj3.i, 0, 8);
                    gw72.e(aj3.i, this.T.K.i, 0, 4);
                    gw72.e(aj3.i, this.T.I.i, 0, 0);
                } else if (i11 == 1) {
                    gw72.e(aj3.i, aj33.i, 0, 8);
                    gw72.e(aj3.i, this.T.I.i, 0, 4);
                    gw72.e(aj3.i, this.T.K.i, 0, 0);
                } else if (i11 == 2) {
                    gw72.e(aj34.i, aj32.i, 0, 8);
                    gw72.e(aj32.i, this.T.L.i, 0, 4);
                    gw72.e(aj32.i, this.T.J.i, 0, 0);
                } else if (i11 == 3) {
                    gw72.e(aj32.i, aj34.i, 0, 8);
                    gw72.e(aj32.i, this.T.J.i, 0, 4);
                    gw72.e(aj32.i, this.T.L.i, 0, 0);
                }
            }
        }
    }

    public final boolean c() {
        return true;
    }

    public final String toString() {
        String n = wj6.n(new StringBuilder("[Barrier] "), this.h0, " {");
        for (int i = 0; i < this.r0; i++) {
            tj3 tj3 = this.q0[i];
            if (i > 0) {
                n = tr1.j(n, ", ");
            }
            StringBuilder o = tr1.o(n);
            o.append(tj3.h0);
            n = o.toString();
        }
        return tr1.j(n, "}");
    }
}
