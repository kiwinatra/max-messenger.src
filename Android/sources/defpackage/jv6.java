package defpackage;

/* renamed from: jv6  reason: default package */
public final class jv6 extends gng {
    public final void a(cm4 cm4) {
        fm4 fm4 = this.h;
        if (fm4.c && !fm4.j) {
            fm4.d((int) ((((float) ((fm4) fm4.l.get(0)).g) * ((iv6) this.b).q0) + 0.5f));
        }
    }

    public final void d() {
        tj3 tj3 = this.b;
        iv6 iv6 = (iv6) tj3;
        int i = iv6.r0;
        int i2 = iv6.s0;
        int i3 = iv6.u0;
        fm4 fm4 = this.h;
        if (i3 == 1) {
            if (i != -1) {
                fm4.l.add(tj3.T.d.h);
                this.b.T.d.h.k.add(fm4);
                fm4.f = i;
            } else if (i2 != -1) {
                fm4.l.add(tj3.T.d.i);
                this.b.T.d.i.k.add(fm4);
                fm4.f = -i2;
            } else {
                fm4.b = true;
                fm4.l.add(tj3.T.d.i);
                this.b.T.d.i.k.add(fm4);
            }
            m(this.b.d.h);
            m(this.b.d.i);
            return;
        }
        if (i != -1) {
            fm4.l.add(tj3.T.e.h);
            this.b.T.e.h.k.add(fm4);
            fm4.f = i;
        } else if (i2 != -1) {
            fm4.l.add(tj3.T.e.i);
            this.b.T.e.i.k.add(fm4);
            fm4.f = -i2;
        } else {
            fm4.b = true;
            fm4.l.add(tj3.T.e.i);
            this.b.T.e.i.k.add(fm4);
        }
        m(this.b.e.h);
        m(this.b.e.i);
    }

    public final void e() {
        tj3 tj3 = this.b;
        int i = ((iv6) tj3).u0;
        fm4 fm4 = this.h;
        if (i == 1) {
            tj3.Y = fm4.g;
        } else {
            tj3.Z = fm4.g;
        }
    }

    public final void f() {
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
