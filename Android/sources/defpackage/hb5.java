package defpackage;

import androidx.media3.transformer.ExportException;

/* renamed from: hb5  reason: default package */
public abstract class hb5 extends pk0 {
    public long A0;
    public long B0;
    public bcd C0;
    public md4 D0;
    public boolean E0;
    public ea6 F0;
    public ea6 G0;
    public final jz2 H0;
    public final ut I0;
    public final ba4 J0 = new ba4(0);
    public boolean K0;
    public boolean L0;
    public boolean M0;

    public hb5(int i, jz2 jz2, ut utVar) {
        super(i);
        this.H0 = jz2;
        this.I0 = utVar;
    }

    public final int D(ea6 ea6) {
        return pk0.b(vq9.g(ea6.n) == this.b ? 4 : 0, 0, 0, 0);
    }

    public final boolean F() {
        if (this.C0 != null) {
            return true;
        }
        if (this.G0 == null) {
            if (this.D0 == null || y7e.y(this.F0.n) != 1) {
                this.G0 = M(this.F0);
            } else {
                md4 md4 = this.D0;
                md4.f(false);
                ea6 ea6 = md4.j;
                if (ea6 == null) {
                    return false;
                }
                this.G0 = M(ea6);
            }
        }
        bcd c = this.I0.c(this.G0);
        if (c == null) {
            return false;
        }
        this.C0 = c;
        return true;
    }

    public abstract boolean G();

    public abstract void H(ea6 ea6);

    public void I(ba4 ba4) {
    }

    public void K(ea6 ea6) {
    }

    public ea6 L(ea6 ea6) {
        return ea6;
    }

    public ea6 M(ea6 ea6) {
        return ea6;
    }

    public final boolean N(ba4 ba4) {
        ox0 ox0 = this.c;
        ox0.u();
        int y = y(ox0, ba4, 0);
        if (y == -5) {
            throw new IllegalStateException("Format changes are not supported.");
        } else if (y != -4) {
            return false;
        } else {
            ba4.C();
            if (ba4.h(4)) {
                return true;
            }
            this.H0.c0(this.b, ba4.x);
            return true;
        }
    }

    public final boolean O() {
        ea6 ea6 = this.F0;
        if (ea6 != null && !this.L0) {
            return true;
        }
        if (ea6 == null) {
            ox0 ox0 = this.c;
            ox0.u();
            if (y(ox0, this.J0, 2) != -5) {
                return false;
            }
            ea6 ea62 = (ea6) ox0.b;
            ea62.getClass();
            ea6 L = L(ea62);
            this.F0 = L;
            K(L);
            this.L0 = this.I0.g(3, this.F0);
        }
        if (this.L0) {
            if (y7e.y(this.F0.n) == 2 && !F()) {
                return false;
            }
            H(this.F0);
            this.L0 = false;
        }
        return true;
    }

    public abstract boolean P(ba4 ba4);

    public final cn8 k() {
        return this.H0;
    }

    public final boolean n() {
        return this.E0;
    }

    public final boolean p() {
        return true;
    }

    public final void r(boolean z, boolean z2) {
        this.H0.c0(this.b, 0);
    }

    public final void u() {
        md4 md4 = this.D0;
        if (md4 != null) {
            md4.h();
        }
    }

    public final void v() {
        this.K0 = true;
    }

    public final void w() {
        this.K0 = false;
    }

    public final void x(ea6[] ea6Arr, long j, long j2) {
        this.A0 = j;
        this.B0 = j2;
    }

    public final void z(long j, long j2) {
        boolean z;
        boolean G;
        boolean z2;
        try {
            if (this.K0 && !this.E0) {
                if (O()) {
                    if (this.D0 != null) {
                        do {
                            G = F() ? G() : false;
                            md4 md4 = this.D0;
                            ba4 ba4 = this.J0;
                            if (md4.e(ba4)) {
                                if (N(ba4)) {
                                    if (!P(ba4)) {
                                        I(ba4);
                                        this.D0.g(ba4);
                                    }
                                    z2 = true;
                                }
                            }
                            z2 = false;
                        } while (G | z2);
                    } else if (F()) {
                        do {
                            ba4 d = this.C0.d();
                            if (d != null) {
                                if (!this.M0) {
                                    if (N(d)) {
                                        if (P(d)) {
                                            z = true;
                                            continue;
                                        } else {
                                            this.M0 = true;
                                        }
                                    }
                                }
                                boolean h = d.h(4);
                                if (this.C0.f()) {
                                    this.M0 = false;
                                    this.E0 = h;
                                    z = !h;
                                    continue;
                                }
                            }
                            z = false;
                            continue;
                        } while (z);
                    }
                }
            }
        } catch (ExportException e) {
            this.K0 = false;
            this.I0.d(e);
        }
    }
}
