package defpackage;

import android.content.Context;
import android.view.Surface;
import android.view.View;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.media.mediabar.FrgLocalVideo;

/* renamed from: b1a  reason: default package */
public final class b1a extends w1 implements n4a, e2a, e9g, iu8, hu8 {
    public or7 X;
    public or7 Y;
    public final kj8 Z;
    public final ju8 b;
    public final Context c;
    public final sqd o;
    public final jbf v;
    public final FrgLocalVideo w;
    public final p8g x;
    public r7g y;
    public ao1 z;

    /* JADX WARNING: type inference failed for: r3v1, types: [r7g, java.lang.Object] */
    public b1a(o4a o4a, ju8 ju8, Context context, sqd sqd, jbf jbf, FrgLocalVideo frgLocalVideo, p8g p8g, kj8 kj8) {
        super(o4a);
        this.b = ju8;
        this.c = context;
        this.o = sqd;
        this.v = jbf;
        this.w = frgLocalVideo;
        this.x = p8g;
        this.Z = kj8;
        ? obj = new Object();
        obj.a = true;
        this.y = new r7g(obj);
        ((q2) o4a).R(this);
        ((m48) ju8).e = this;
    }

    public final void A() {
        hi6 h3;
        z68.c("b1a", "onPlayClick", new Object[0]);
        ((m48) this.b).o();
        FrgLocalVideo frgLocalVideo = this.w;
        if (!(frgLocalVideo == null || (h3 = frgLocalVideo.h3()) == null)) {
            h3.b(true, true, false);
        }
        if (a()) {
            X();
            W();
        }
    }

    public final int B() {
        return ((m48) this.b).h();
    }

    public final void C() {
    }

    public final void D() {
    }

    public final int E() {
        return ((m48) this.b).i();
    }

    public final void F() {
        z68.a("b1a", "onPlaybackPrepared");
        boolean k = ((m48) this.b).k();
        r7g a = this.y.a();
        a.b = k;
        a.c = false;
        r7g r7g = new r7g(a);
        this.y = r7g;
        ((o4a) this.a).m(r7g);
        if (k) {
            X();
            W();
        }
    }

    public final void G(boolean z2) {
        r7g a = this.y.a();
        a.a = z2;
        r7g r7g = new r7g(a);
        this.y = r7g;
        ((o4a) this.a).m(r7g);
        if (!z2) {
            Y();
        } else if (this.y.b) {
            W();
        }
    }

    public final void I(boolean z2) {
        z68.c("b1a", "Release", new Object[0]);
        jbd.c(this.z);
        Z();
        Y();
        m48 m48 = (m48) this.b;
        if (m48.g == this) {
            m48.v();
            m48.e = null;
            m48.s((Surface) null);
            m48.g = null;
        }
        o4a o4a = (o4a) this.a;
        ((Set) ((q2) o4a).a).remove(this);
        o4a.release();
    }

    public final void J(int i) {
        long j = (long) i;
        ju8 ju8 = this.b;
        m48 m48 = (m48) ju8;
        m48.r(j);
        r7g a = this.y.a();
        m48 m482 = (m48) ju8;
        a.k = m482.f();
        a.l = m482.d();
        r7g r7g = new r7g(a);
        this.y = r7g;
        ((o4a) this.a).m(r7g);
        if (m48.k()) {
            X();
            W();
        }
    }

    public final void M() {
        z68.a("b1a", "onPlaybackBuffering");
        r7g a = this.y.a();
        a.c = true;
        r7g r7g = new r7g(a);
        this.y = r7g;
        ((o4a) this.a).m(r7g);
    }

    public final void O(Throwable th) {
        z68.a("b1a", "onPlaybackError");
        r7g a = this.y.a();
        a.b = false;
        a.c = false;
        r7g r7g = new r7g(a);
        this.y = r7g;
        ((o4a) this.a).m(r7g);
        FrgLocalVideo frgLocalVideo = this.w;
        if (frgLocalVideo != null) {
            frgLocalVideo.W0(th);
        }
    }

    public final void R() {
        hi6 h3;
        ((m48) this.b).n();
        FrgLocalVideo frgLocalVideo = this.w;
        if (frgLocalVideo != null && (h3 = frgLocalVideo.h3()) != null) {
            h3.b(true, true, false);
        }
    }

    public final void W() {
        Y();
        if (this.y.a) {
            lja s = jha.p(2, TimeUnit.SECONDS).s(qe.a());
            or7 or7 = new or7(new a1a(this, 2), new q0a(3), m58.e);
            s.a(or7);
            this.Y = or7;
        }
    }

    public final void X() {
        Z();
        lja s = jha.p(100, TimeUnit.MILLISECONDS).s(qe.a());
        or7 or7 = new or7(new a1a(this, 3), new q0a(4), m58.e);
        s.a(or7);
        this.X = or7;
    }

    public final void Y() {
        jbd.c(this.Y);
    }

    public final void Z() {
        jbd.c(this.X);
    }

    public final boolean a() {
        return ((m48) this.b).k();
    }

    public final void b() {
        r7g a = this.y.a();
        a.b = ((m48) this.b).k();
        r7g r7g = new r7g(a);
        this.y = r7g;
        ((o4a) this.a).m(r7g);
    }

    public final boolean c() {
        m48 m48 = (m48) this.b;
        if (m48.f == null) {
            return false;
        }
        sb5 sb5 = m48.b;
        zae zae = sb5.a;
        ikf V0 = zae.V0();
        return (!V0.q() && V0.n(zae.d0(), (gkf) zae.a, 0).z) || sb5.v() == -9223372036854775807L;
    }

    public final void d() {
        Z();
        Y();
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

    public final void i() {
        z68.a("b1a", "onTrackChanged");
    }

    public final void j(Surface surface) {
        ((m48) this.b).s(surface);
    }

    public final void k(int i, int i2, int i3) {
        ((o4a) this.a).g(i, i2);
    }

    public final void m() {
        FrgLocalVideo frgLocalVideo = this.w;
        if (frgLocalVideo != null) {
            frgLocalVideo.m();
        }
    }

    public final void n() {
        FrgLocalVideo frgLocalVideo = this.w;
        if (frgLocalVideo != null) {
            frgLocalVideo.getClass();
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

    public final void q() {
        hi6 h3;
        Z();
        Y();
        r7g a = this.y.a();
        a.b = false;
        a.c = false;
        a.a = true;
        r7g r7g = new r7g(a);
        this.y = r7g;
        ((o4a) this.a).m(r7g);
        FrgLocalVideo frgLocalVideo = this.w;
        if (frgLocalVideo != null && (h3 = frgLocalVideo.h3()) != null) {
            h3.b(true, true, false);
        }
    }

    public final void r() {
        z68.a("b1a", "onRenderedFirstFrame");
        F();
    }

    public final void s() {
        z68.a("b1a", "onPlaybackEnded");
        Z();
        Y();
        r7g a = this.y.a();
        a.b = false;
        a.c = false;
        a.a = true;
        r7g r7g = new r7g(a);
        this.y = r7g;
        ((o4a) this.a).m(r7g);
        FrgLocalVideo frgLocalVideo = this.w;
        if (frgLocalVideo != null) {
            frgLocalVideo.D0();
        }
    }

    public final void y() {
        z68.a("b1a", "onMediaPlayerControllerDetach");
    }

    public final void z(long j) {
        ((m48) this.b).r(j);
    }
}
