package defpackage;

import android.view.KeyEvent;
import android.view.Surface;
import android.view.View;
import java.util.Set;

/* renamed from: x1a  reason: default package */
public final class x1a extends w1 implements n4a, e2a, e9g, iu8, hu8 {
    public final ju8 b;
    public final ln5 c;
    public final nd o;
    public final d2a v;
    public xre w;
    public boe x;
    public r7g y;
    public d6a z;

    /* JADX WARNING: type inference failed for: r1v2, types: [r7g, java.lang.Object] */
    public x1a(o4a o4a, ju8 ju8, ln5 ln5, nd ndVar, d2a d2a) {
        super(o4a);
        this.b = ju8;
        this.c = ln5;
        this.o = ndVar;
        this.v = d2a;
        ((q2) o4a).R(this);
        ((m48) ju8).e = this;
        ? obj = new Object();
        obj.e = false;
        obj.r = true;
        this.y = new r7g(obj);
    }

    public final int B() {
        return ((m48) this.b).h();
    }

    public final void C() {
        if (this.w != null) {
            s();
        }
    }

    public final void D() {
    }

    public final int E() {
        return ((m48) this.b).i();
    }

    public final void G(boolean z2) {
    }

    public final void H() {
        z68.c("x1a", "onSoundClick", new Object[0]);
        d6a W = W();
        m48 m48 = (m48) this.b;
        ((nd) W.b).c(m48.l() ^ true ? 1 : 0, "change_volume_audio_sticker");
        if (m48.l()) {
            m48.u(c44.DEFAULT_ASPECT_RATIO);
        } else {
            m48.u(1.0f);
        }
    }

    public final void I(boolean z2) {
        ju8 ju8 = this.b;
        if (((m48) ju8).g == this) {
            m48 m48 = (m48) ju8;
            m48.v();
            m48.e = null;
            m48.s((Surface) null);
            m48.g = null;
        }
        this.w = null;
        o4a o4a = (o4a) this.a;
        ((Set) ((q2) o4a).a).remove(this);
        o4a.release();
    }

    public final void O(Throwable th) {
        d2a d2a = this.v;
        if (d2a != null) {
            d2a.W0(th);
        }
    }

    public final void P() {
        d2a d2a = this.v;
        if (d2a != null) {
            d2a.D0();
        }
    }

    public final void Q() {
    }

    public final d6a W() {
        if (this.z == null) {
            this.z = new d6a(9, (Object) this.o);
        }
        return this.z;
    }

    public final boolean a() {
        ju8 ju8 = this.b;
        if (((m48) ju8).g == this) {
            return ((m48) ju8).k();
        }
        return false;
    }

    public final void b() {
        d2a d2a = this.v;
        if (d2a != null) {
            d2a.b();
        }
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

    public final void g() {
        z68.c("x1a", "onVolumeChange", new Object[0]);
        r7g a = this.y.a();
        boe boe = this.x;
        a.e = (boe == null || boe.w0) && ((m48) this.b).l();
        r7g r7g = new r7g(a);
        this.y = r7g;
        ((o4a) this.a).m(r7g);
        d2a d2a = this.v;
        if (d2a != null) {
            d2a.g();
        }
    }

    public final long h() {
        return ((m48) this.b).f();
    }

    public final void i() {
        z68.c("x1a", "onTrackChanged", new Object[0]);
        boe boe = this.x;
        boolean z2 = false;
        boolean z3 = boe != null && !boe.w0;
        r7g a = this.y.a();
        a.r = z3;
        if (!z3 && ((m48) this.b).l()) {
            z2 = true;
        }
        a.e = z2;
        r7g r7g = new r7g(a);
        this.y = r7g;
        ((o4a) this.a).m(r7g);
    }

    public final void j(Surface surface) {
        ((m48) this.b).s(surface);
    }

    public final void k(int i, int i2, int i3) {
        ((o4a) this.a).g(i, i2);
    }

    public final void m() {
        d2a d2a = this.v;
        if (d2a != null) {
            d2a.m();
        }
    }

    public final void n() {
        d2a d2a = this.v;
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

    public final void r() {
        d2a d2a = this.v;
        if (d2a != null) {
            d2a.getClass();
        }
    }

    public final void s() {
        d2a d2a = this.v;
        if (d2a != null) {
            d2a.D0();
        }
    }

    public final boolean t(int i, KeyEvent keyEvent) {
        boe boe = this.x;
        if (boe != null && !boe.w0) {
            return false;
        }
        m48 m48 = (m48) this.b;
        if (m48.l() || !m48.c()) {
            return false;
        }
        if (i != 24 && i != 25) {
            return false;
        }
        ((nd) W().b).c(1, "change_volume_audio_sticker");
        m48.u(1.0f);
        r7g a = this.y.a();
        a.e = true;
        r7g r7g = new r7g(a);
        this.y = r7g;
        ((o4a) this.a).m(r7g);
        return true;
    }

    public final void u() {
    }

    public final void y() {
        z68.a("x1a", "onMediaPlayerControllerDetach");
    }
}
