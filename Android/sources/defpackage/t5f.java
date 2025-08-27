package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: t5f  reason: default package */
public final class t5f extends ey3 {
    public final ey3 o;
    public final String v;

    public t5f() {
        this(0);
    }

    public final void g(ViewGroup viewGroup, View view, View view2, boolean z, cy3 cy3) {
        if (view == null && !z) {
            String str = this.v;
            a67 a67 = z68.b;
            if (a67 != null && a67.c()) {
                a67.d(w78.o, str, "Already swiped controller manually, skip performChange", (Throwable) null);
            }
            cy3.n();
        } else if (view != null || !z) {
            this.o.g(viewGroup, view, view2, z, cy3);
        } else {
            String str2 = this.v;
            a67 a672 = z68.b;
            if (a672 != null && a672.c()) {
                a672.d(w78.o, str2, "Showing controller without animation", (Throwable) null);
            }
            new jbe(true).g(viewGroup, view, view2, z, cy3);
        }
    }

    public final void h(Bundle bundle) {
        this.o.h(bundle);
    }

    public final void i(Bundle bundle) {
        this.o.i(bundle);
    }

    public t5f(int i) {
        this.o = new s5f();
        this.v = t5f.class.getName();
    }
}
