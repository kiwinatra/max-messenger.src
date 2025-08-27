package defpackage;

import java.util.Iterator;

/* renamed from: by6  reason: default package */
public final class by6 extends gng {
    public final void a(cm4 cm4) {
        ii0 ii0 = (ii0) this.b;
        int i = ii0.s0;
        fm4 fm4 = this.h;
        Iterator it = fm4.l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((fm4) it.next()).g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            fm4.d(i3 + ii0.u0);
        } else {
            fm4.d(i2 + ii0.u0);
        }
    }

    public final void d() {
        tj3 tj3 = this.b;
        if (tj3 instanceof ii0) {
            fm4 fm4 = this.h;
            fm4.b = true;
            ii0 ii0 = (ii0) tj3;
            int i = ii0.s0;
            boolean z = ii0.t0;
            int i2 = 0;
            if (i == 0) {
                fm4.e = 4;
                while (i2 < ii0.r0) {
                    tj3 tj32 = ii0.q0[i2];
                    if (z || tj32.g0 != 8) {
                        fm4 fm42 = tj32.d.h;
                        fm42.k.add(fm4);
                        fm4.l.add(fm42);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
            } else if (i == 1) {
                fm4.e = 5;
                while (i2 < ii0.r0) {
                    tj3 tj33 = ii0.q0[i2];
                    if (z || tj33.g0 != 8) {
                        fm4 fm43 = tj33.d.i;
                        fm43.k.add(fm4);
                        fm4.l.add(fm43);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
            } else if (i == 2) {
                fm4.e = 6;
                while (i2 < ii0.r0) {
                    tj3 tj34 = ii0.q0[i2];
                    if (z || tj34.g0 != 8) {
                        fm4 fm44 = tj34.e.h;
                        fm44.k.add(fm4);
                        fm4.l.add(fm44);
                    }
                    i2++;
                }
                m(this.b.e.h);
                m(this.b.e.i);
            } else if (i == 3) {
                fm4.e = 7;
                while (i2 < ii0.r0) {
                    tj3 tj35 = ii0.q0[i2];
                    if (z || tj35.g0 != 8) {
                        fm4 fm45 = tj35.e.i;
                        fm45.k.add(fm4);
                        fm4.l.add(fm45);
                    }
                    i2++;
                }
                m(this.b.e.h);
                m(this.b.e.i);
            }
        }
    }

    public final void e() {
        tj3 tj3 = this.b;
        if (tj3 instanceof ii0) {
            int i = ((ii0) tj3).s0;
            fm4 fm4 = this.h;
            if (i == 0 || i == 1) {
                tj3.Y = fm4.g;
            } else {
                tj3.Z = fm4.g;
            }
        }
    }

    public final void f() {
        this.c = null;
        this.h.c();
    }

    public final boolean k() {
        return false;
    }

    public final void m(fm4 fm4) {
        fm4 fm42 = this.h;
        fm42.k.add(fm4);
        fm4.l.add(fm42);
    }
}
