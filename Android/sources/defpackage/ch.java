package defpackage;

import android.view.View;
import android.view.animation.Interpolator;

/* renamed from: ch  reason: default package */
public final class ch implements ug {
    public final ug a;
    public final u2f b;

    public ch(pk4 pk4, yu9 yu9) {
        this.a = pk4;
        this.b = yu9;
    }

    public final dm4 a(View view) {
        if (q()) {
            return this.a.a(view);
        }
        view.setVisibility(0);
        return dm4.o;
    }

    public final long b() {
        return this.a.b();
    }

    public final dm4 c(View view) {
        if (q()) {
            return this.a.c(view);
        }
        view.setVisibility(8);
        return dm4.o;
    }

    public final Interpolator d() {
        return this.a.d();
    }

    public final dm4 e(View view) {
        if (q()) {
            return this.a.e(view);
        }
        view.setVisibility(0);
        return dm4.o;
    }

    public final Interpolator f() {
        return this.a.f();
    }

    public final dm4 g(View view) {
        if (q()) {
            return this.a.g(view);
        }
        view.setVisibility(8);
        return dm4.o;
    }

    public final long h() {
        return this.a.h();
    }

    public final dm4 i(View view) {
        if (q()) {
            return this.a.i(view);
        }
        view.setVisibility(0);
        return dm4.o;
    }

    public final dm4 j(View view) {
        if (q()) {
            return this.a.j(view);
        }
        view.setVisibility(0);
        return dm4.o;
    }

    public final Interpolator k() {
        return this.a.k();
    }

    public final Interpolator l() {
        return this.a.l();
    }

    public final dm4 m(View view) {
        if (q()) {
            return this.a.m(view);
        }
        view.setVisibility(8);
        return dm4.o;
    }

    public final Interpolator n() {
        return this.a.n();
    }

    public final dm4 o(View view) {
        if (q()) {
            return this.a.o(view);
        }
        view.setVisibility(8);
        return dm4.o;
    }

    public final boolean p() {
        return !q();
    }

    public final boolean q() {
        return ((Boolean) this.b.get()).booleanValue();
    }
}
