package defpackage;

import android.view.ViewGroup;

/* renamed from: fz1  reason: default package */
public final class fz1 extends bsf {
    public boolean a = false;
    public final ViewGroup b;

    public fz1(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    public final void b() {
        nag.b(this.b, false);
    }

    public final void c(yrf yrf) {
        if (!this.a) {
            nag.b(this.b, false);
        }
        yrf.D(this);
    }

    public final void f() {
        nag.b(this.b, true);
    }

    public final void g(yrf yrf) {
        nag.b(this.b, false);
        this.a = true;
    }
}
