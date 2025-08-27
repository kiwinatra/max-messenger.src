package defpackage;

import android.view.Surface;
import android.view.View;
import java.util.Set;

/* renamed from: o0a  reason: default package */
public final class o0a extends w1 implements n4a, e2a, e9g, iu8, hu8 {
    public final ju8 b;
    public final ln5 c;
    public final d2a o;
    public sr6 v;

    public o0a(u3a u3a, ju8 ju8, ln5 ln5, d2a d2a) {
        super(u3a);
        this.b = ju8;
        this.c = ln5;
        this.o = d2a;
        u3a.R(this);
        ((m48) ju8).e = this;
    }

    public final int B() {
        return ((m48) this.b).h();
    }

    public final void C() {
        d2a d2a;
        if (this.v != null && (d2a = this.o) != null) {
            d2a.D0();
        }
    }

    public final void D() {
    }

    public final int E() {
        return ((m48) this.b).i();
    }

    public final void I(boolean z) {
        m48 m48 = (m48) this.b;
        if (m48.g == this) {
            m48.v();
            m48.e = null;
            m48.s((Surface) null);
            m48.g = null;
            this.v = null;
            o4a o4a = (o4a) this.a;
            ((Set) ((q2) o4a).a).remove(this);
            o4a.release();
        }
    }

    public final void O(Throwable th) {
        d2a d2a = this.o;
        if (d2a != null) {
            d2a.W0(th);
        }
    }

    public final boolean a() {
        return ((m48) this.b).k();
    }

    public final boolean c() {
        return false;
    }

    public final long e() {
        return ((m48) this.b).g();
    }

    public final int f() {
        f4g f4g = ((m48) this.b).f;
        if (f4g == null) {
            return 0;
        }
        return f4g.f();
    }

    public final long h() {
        return ((m48) this.b).f();
    }

    public final void j(Surface surface) {
        ((m48) this.b).s(surface);
    }

    public final void k(int i, int i2, int i3) {
        ((o4a) this.a).g(i, i2);
    }

    public final void m() {
        d2a d2a = this.o;
        if (d2a != null) {
            d2a.m();
        }
    }

    public final void n() {
        d2a d2a = this.o;
        if (d2a != null) {
            d2a.n();
        }
    }

    public final View o() {
        View view = (View) ((q2) ((o4a) this.a)).c;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Mvc view root is null");
    }

    public final int p() {
        return ((m48) this.b).j();
    }

    public final void y() {
        z68.a("o0a", "onMediaPlayerControllerDetach");
    }
}
