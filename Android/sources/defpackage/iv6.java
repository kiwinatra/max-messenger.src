package defpackage;

import java.util.ArrayList;

/* renamed from: iv6  reason: default package */
public final class iv6 extends tj3 {
    public float q0 = -1.0f;
    public int r0 = -1;
    public int s0 = -1;
    public aj3 t0 = this.J;
    public int u0;
    public boolean v0;

    public iv6() {
        this.u0 = 0;
        this.R.clear();
        this.R.add(this.t0);
        int length = this.Q.length;
        for (int i = 0; i < length; i++) {
            this.Q[i] = this.t0;
        }
    }

    public final boolean A() {
        return this.v0;
    }

    public final boolean B() {
        return this.v0;
    }

    public final void Q(gw7 gw7, boolean z) {
        if (this.T != null) {
            aj3 aj3 = this.t0;
            gw7.getClass();
            int n = gw7.n(aj3);
            if (this.u0 == 1) {
                this.Y = n;
                this.Z = 0;
                L(this.T.k());
                O(0);
                return;
            }
            this.Y = 0;
            this.Z = n;
            O(this.T.q());
            L(0);
        }
    }

    public final void R(int i) {
        this.t0.l(i);
        this.v0 = true;
    }

    public final void S(int i) {
        if (this.u0 != i) {
            this.u0 = i;
            ArrayList arrayList = this.R;
            arrayList.clear();
            if (this.u0 == 1) {
                this.t0 = this.I;
            } else {
                this.t0 = this.J;
            }
            arrayList.add(this.t0);
            aj3[] aj3Arr = this.Q;
            int length = aj3Arr.length;
            for (int i2 = 0; i2 < length; i2++) {
                aj3Arr[i2] = this.t0;
            }
        }
    }

    public final void b(gw7 gw7, boolean z) {
        uj3 uj3 = (uj3) this.T;
        if (uj3 != null) {
            aj3 i = uj3.i(2);
            aj3 i2 = uj3.i(4);
            tj3 tj3 = this.T;
            boolean z2 = true;
            boolean z3 = tj3 != null && tj3.p0[0] == 2;
            if (this.u0 == 0) {
                i = uj3.i(3);
                i2 = uj3.i(5);
                tj3 tj32 = this.T;
                if (tj32 == null || tj32.p0[1] != 2) {
                    z2 = false;
                }
                z3 = z2;
            }
            if (this.v0) {
                aj3 aj3 = this.t0;
                if (aj3.c) {
                    sfe k = gw7.k(aj3);
                    gw7.d(k, this.t0.d());
                    if (this.r0 != -1) {
                        if (z3) {
                            gw7.f(gw7.k(i2), k, 0, 5);
                        }
                    } else if (this.s0 != -1 && z3) {
                        sfe k2 = gw7.k(i2);
                        gw7.f(k, gw7.k(i), 0, 5);
                        gw7.f(k2, k, 0, 5);
                    }
                    this.v0 = false;
                    return;
                }
            }
            if (this.r0 != -1) {
                sfe k3 = gw7.k(this.t0);
                gw7.e(k3, gw7.k(i), this.r0, 8);
                if (z3) {
                    gw7.f(gw7.k(i2), k3, 0, 5);
                }
            } else if (this.s0 != -1) {
                sfe k4 = gw7.k(this.t0);
                sfe k5 = gw7.k(i2);
                gw7.e(k4, k5, -this.s0, 8);
                if (z3) {
                    gw7.f(k4, gw7.k(i), 0, 5);
                    gw7.f(k5, k4, 0, 5);
                }
            } else if (this.q0 != -1.0f) {
                sfe k6 = gw7.k(this.t0);
                sfe k7 = gw7.k(i2);
                float f = this.q0;
                vs l = gw7.l();
                l.d.j(k6, -1.0f);
                l.d.j(k7, f);
                gw7.c(l);
            }
        }
    }

    public final boolean c() {
        return true;
    }

    public final aj3 i(int i) {
        int y = tr1.y(i);
        if (y != 1) {
            if (y != 2) {
                if (y != 3) {
                    if (y != 4) {
                        return null;
                    }
                }
            }
            if (this.u0 == 0) {
                return this.t0;
            }
            return null;
        }
        if (this.u0 == 1) {
            return this.t0;
        }
        return null;
    }
}
