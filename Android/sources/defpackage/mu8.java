package defpackage;

import android.content.Context;
import android.view.Surface;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: mu8  reason: default package */
public final class mu8 implements gy9, q60 {
    public final smb X;
    public final kb5 Y;
    public s60 Z;
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashSet c = new HashSet();
    public final Context o;
    public final m95 v;
    public final ltb w;
    public final f40 x;
    public final rh3 y;
    public final ys7 z;

    public mu8(Context context, m95 m95, ltb ltb, xy9 xy9, f40 f40, rh3 rh3, ys7 ys7, hn4 hn4, ch chVar, fa9 fa9, p8g p8g, jbf jbf, o20 o20, cq cqVar, sv0 sv0, r62 r62, kb5 kb5) {
        xy9 xy92 = xy9;
        this.o = context;
        this.v = m95;
        this.w = ltb;
        this.x = f40;
        this.y = rh3;
        this.z = ys7;
        this.Y = kb5;
        smb smb = r3;
        smb smb2 = new smb(context, ys7, hn4, ltb, chVar, fa9, p8g, jbf, new dm4(16, (Object) new td8(6, this)), o20, (bnb) cqVar.q.getValue(), sv0, r62, m95);
        this.X = smb;
        synchronized (xy92.q) {
            xy92.q.add(this);
        }
    }

    public final void C(k50 k50) {
    }

    public final void a(long j, jr8 jr8) {
    }

    public final void c(long j, jr8 jr8) {
    }

    public final void d(long j, jr8 jr8, long j2, jr8 jr82) {
    }

    public final void e() {
        t();
    }

    public final void f(long j, jr8 jr8) {
    }

    public final void g(long j, jr8 jr8, long j2) {
    }

    public final void h() {
    }

    public final void i(long j, jr8 jr8) {
    }

    public final void k(long j, jr8 jr8) {
    }

    public final void l(long j, jr8 jr8) {
        t();
    }

    public final void m(long j, jr8 jr8) {
    }

    public final void n(long j, jr8 jr8) {
    }

    public final void o(ju8 ju8) {
        if (!this.c.contains(ju8)) {
            p((m48) ju8);
            return;
        }
        throw new IllegalStateException("mediaPlayerController binded to lifecycleOwner -> you can't change lifecycle manually.");
    }

    public final void p(m48 m48) {
        iu8 iu8;
        z68.c("mu8", "attachInternal %s", m48.a);
        HashMap hashMap = this.b;
        nu8 nu8 = m48.a;
        m48 m482 = (m48) hashMap.get(nu8);
        if (!(m482 == null || m482 == m48 || (iu8 = m482.e) == null)) {
            iu8.y();
        }
        hashMap.put(nu8, m48);
    }

    public final m48 q(nu8 nu8, z50 z50, jv7 jv7) {
        nu8 nu82 = nu8;
        z50 z502 = z50;
        HashMap hashMap = this.b;
        m48 m48 = (m48) hashMap.get(nu82);
        if (m48 != null) {
            iu8 iu8 = m48.e;
            if (iu8 != null) {
                iu8.y();
            }
            m48.g = null;
        }
        HashMap hashMap2 = this.a;
        sb5 sb5 = (sb5) hashMap2.get(nu82);
        if (sb5 == null) {
            sb5 = new sb5(this.o, this.v, this.Y, this.z, this.w.a);
            hashMap2.put(nu82, sb5);
        }
        m48 m482 = new m48(nu8, sb5, this, this.o, z502.a ? 1.0f : c44.DEFAULT_ASPECT_RATIO, z502.b, z502.c);
        hashMap.put(nu82, m482);
        if (jv7 != null) {
            this.c.add(m482);
            jv7.getLifecycle().a(new pg4(this, m482, false, 4));
        }
        return m482;
    }

    public final ju8 r(nu8 nu8) {
        return q(nu8, new z50(false, false, true), (jv7) null);
    }

    public final void s(ju8 ju8) {
        if (!this.c.contains(ju8)) {
            m48 m48 = (m48) ju8;
            z68.c("mu8", "detachInternal %s", m48.a);
            iu8 iu8 = m48.e;
            if (iu8 != null) {
                iu8.y();
                return;
            }
            return;
        }
        throw new IllegalStateException("mediaPlayerController binded to lifecycleOwner -> you can't change lifecycle manually.");
    }

    public final void t() {
        HashMap hashMap = this.b;
        ju8 ju8 = (ju8) hashMap.get(nu8.c);
        if (ju8 != null) {
            if (v()) {
                m48 m48 = (m48) ju8;
                if (m48.i) {
                    m48.w();
                }
            }
            ((m48) ju8).n();
        }
        ju8 ju82 = (ju8) hashMap.get(nu8.o);
        if (ju82 != null) {
            ((m48) ju82).n();
        }
    }

    public final void u(ju8 ju8) {
        ju8 ju82;
        j0a j0a;
        m48 m48 = (m48) ju8;
        nu8 nu8 = m48.a;
        nu8 nu82 = nu8.c;
        if (nu8 == nu82) {
            boolean l = m48.l();
            smb smb = this.X;
            if (l) {
                j0a j0a2 = smb.z0;
                if (j0a2 != null) {
                    j0a2.b0();
                }
            } else {
                f4g f4g = smb.z0 == null ? null : ((m48) ((ju8) smb.X.get())).f;
                f4g f4g2 = m48.f;
                if (!(f4g == null || f4g2 == null || !cvg.c(f4g.h().toString(), f4g2.h().toString()) || (j0a = smb.z0) == null)) {
                    j0a.b0();
                }
            }
        } else if (nu8 == nu8.o && (ju82 = (ju8) this.b.get(nu82)) != null) {
            f4g f4g3 = m48.f;
            m48 m482 = (m48) ju82;
            f4g f4g4 = m482.f;
            if (f4g3 != null && f4g4 != null && cvg.c(f4g3.h().toString(), f4g4.h().toString())) {
                m482.n();
            } else if (!v() || !m482.i) {
                m482.n();
            } else {
                m482.w();
            }
        }
        if (m48.l()) {
            this.x.s();
            s60 s60 = this.Z;
            if (s60 != null) {
                r60 r60 = s60.m;
                if (r60 == r60.b || r60 == r60.a) {
                    s60.u(false, true);
                } else if (r60 == r60.o) {
                    s60.d();
                    if (s60.m()) {
                        s60.c.s();
                        s60.r(false);
                    }
                }
            }
        }
    }

    public final boolean v() {
        rh3 rh3 = this.y;
        boolean f = rh3.f();
        mi3 b2 = rh3.b();
        ltb ltb = this.w;
        int i = ltb.c.g.getInt("app.video.auto.play", 1);
        if (i != -1) {
            return i != 0 ? b2 == mi3.b : b2 == mi3.b || ltb.c.m() || !f;
        }
        return false;
    }

    public final void w(ju8 ju8) {
        if (!this.c.contains(ju8)) {
            x((m48) ju8);
            return;
        }
        throw new IllegalStateException("mediaPlayerController binded to lifecycleOwner -> you can't change lifecycle manually.");
    }

    public final void x(m48 m48) {
        z68.c("mu8", "releaseInternal %s", m48.a);
        this.c.remove(m48);
        f4g f4g = m48.f;
        nu8 nu8 = m48.a;
        if (!(f4g == null || m48.g == null)) {
            z68.c("m48", "Release %s", nu8);
            m48.g = null;
            iu8 iu8 = m48.e;
            if (iu8 != null) {
                iu8.y();
            }
            sb5 sb5 = m48.b;
            sb5.C();
            sb5.u();
            z68.c("sb5", "Clear", new Object[0]);
            zae zae = sb5.a;
            zae.n1();
            sc5 sc5 = zae.b;
            sc5.G1();
            sc5.A1((Surface) null);
            sc5.w1(0, 0);
            sb5.w = null;
            sb5.x = null;
            sb5.y = c44.DEFAULT_ASPECT_RATIO;
            sb5.z = null;
            sb5.X = 0;
            sb5.Y = 0;
            sb5.Z = 0;
            sb5.v0 = false;
            m48.p();
        }
        HashMap hashMap = this.b;
        ju8 ju8 = (ju8) hashMap.get(nu8);
        if (ju8 == m48) {
            hashMap.remove(((m48) ju8).a);
        }
    }

    public final void y(boolean z2) {
    }

    public final void z(s60 s60) {
        s60 s602 = this.Z;
        if (s602 != null) {
            s602.k.remove(this);
        }
        this.Z = s60;
        if (s60 != null) {
            s60.k.add(this);
        }
    }
}
