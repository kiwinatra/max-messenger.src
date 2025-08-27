package defpackage;

import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.Surface;
import androidx.media3.common.PlaybackException;
import java.util.List;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ypb  reason: default package */
public final class ypb implements vob {
    public final vob a;
    public final Bundle b;
    public tb7 c;
    public zvd o;
    public pob v;

    public ypb(tc5 tc5, k0d k0d, zvd zvd, pob pob, Bundle bundle) {
        this.a = tc5;
        this.c = k0d;
        this.o = zvd;
        this.v = pob;
        this.b = bundle;
    }

    public final void A() {
        A1();
        i1();
    }

    public final long A0() {
        A1();
        return this.a.A0();
    }

    public final void A1() {
        n79.n(Looper.myLooper() == this.a.O0());
    }

    public final i30 B() {
        A1();
        return this.a.B();
    }

    public final void B0(List list) {
        this.a.k0(list);
    }

    public final void C(int i, boolean z) {
        A1();
        o1(i, z);
    }

    public final ir8 C0() {
        A1();
        return this.a.C0();
    }

    public final in4 D() {
        A1();
        return this.a.D();
    }

    public final void D0() {
        this.a.r();
    }

    public final void E() {
        A1();
        K0();
    }

    public final mob E0() {
        int i;
        PlaybackException N = N();
        int o2 = ft7.o(this);
        pob A = kne.A(this.v, o());
        long j = 128;
        int i2 = 0;
        while (true) {
            long j2 = 0;
            if (i2 < A.e()) {
                int d = A.d(i2);
                if (d == 1) {
                    j2 = 518;
                } else if (d == 2) {
                    j2 = PlaybackStateCompat.ACTION_PREPARE;
                } else if (d == 3) {
                    j2 = 1;
                } else if (d != 31) {
                    switch (d) {
                        case 5:
                            j2 = 256;
                            break;
                        case 6:
                        case 7:
                            j2 = 16;
                            break;
                        case 8:
                        case 9:
                            j2 = 32;
                            break;
                        case 10:
                            j2 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
                            break;
                        case 11:
                            j2 = 8;
                            break;
                        case 12:
                            j2 = 64;
                            break;
                        case 13:
                            j2 = PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED;
                            break;
                        case Protos.Attaches.Attach.LOCATION /*14*/:
                            j2 = 2621440;
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                            j2 = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                            break;
                    }
                } else {
                    j2 = 240640;
                }
                j |= j2;
                i2++;
            } else {
                long j3 = -1;
                long p = J0(17) ? ft7.p(d0()) : -1;
                float f = c().a;
                float f2 = a() ? f : c44.DEFAULT_ASPECT_RATIO;
                Bundle bundle = new Bundle();
                Bundle bundle2 = this.b;
                if (bundle2 != null && !bundle2.isEmpty()) {
                    bundle.putAll(bundle2);
                }
                bundle.putFloat("EXO_SPEED", f);
                ir8 P0 = P0();
                if (P0 != null) {
                    String str = P0.a;
                    if (!"".equals(str)) {
                        bundle.putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", str);
                    }
                }
                boolean J0 = J0(16);
                if (J0) {
                    j3 = h();
                }
                if (J0) {
                    j2 = T();
                }
                kob kob = new kob();
                kob.h(o2, j3, f2, SystemClock.elapsedRealtime());
                kob.c(j);
                kob.d(p);
                kob.e(j2);
                kob.g(bundle);
                for (int i3 = 0; i3 < this.c.size(); i3++) {
                    e63 e63 = (e63) this.c.get(i3);
                    yvd yvd = e63.a;
                    if (yvd != null && e63.h && yvd.a == 0 && e63.c(e63, this.o, this.v)) {
                        int i4 = e63.c;
                        Bundle bundle3 = yvd.c;
                        if (i4 != 0) {
                            Bundle bundle4 = new Bundle(bundle3);
                            bundle4.putInt("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT", i4);
                            bundle3 = bundle4;
                        }
                        m7h m7h = new m7h(yvd.b, e63.f, e63.d);
                        m7h.f(bundle3);
                        kob.a(m7h.a());
                    }
                }
                if (N != null) {
                    int i5 = N.a;
                    if (i5 == -110) {
                        i = 8;
                    } else if (i5 == -109) {
                        i = 11;
                    } else if (i5 != -6) {
                        i = 1;
                        if (i5 != -2) {
                            if (i5 != 1) {
                                switch (i5) {
                                    case -107:
                                        i = 9;
                                        break;
                                    case -106:
                                        i = 7;
                                        break;
                                    case -105:
                                        i = 6;
                                        break;
                                    case -104:
                                        i = 5;
                                        break;
                                    case -103:
                                        i = 4;
                                        break;
                                    case -102:
                                        i = 3;
                                        break;
                                    default:
                                        i = 0;
                                        break;
                                }
                            } else {
                                i = 10;
                            }
                        }
                    } else {
                        i = 2;
                    }
                    kob.f(i, N.getMessage());
                }
                return kob.b();
            }
        }
    }

    public final void F(int i, int i2) {
        A1();
        r1(i, i2);
    }

    public final ppb F0() {
        return new ppb(N(), 0, I0(), H0(), H0(), 0, c(), getRepeatMode(), q0(), y(), Q0(), 0, J0(18) ? Y() : us8.J, J0(22) ? b() : c44.DEFAULT_ASPECT_RATIO, J0(21) ? B() : i30.g, J0(28) ? Z() : o44.c, D(), J0(23) ? i() : 0, Y0(), q(), 1, j0(), getPlaybackState(), a(), d(), R0(), A0(), Q(), u(), J0(30) ? W() : qqf.b, r0());
    }

    public final boolean G() {
        A1();
        return this.a.G();
    }

    public final boolean G0() {
        A1();
        return this.a.G0();
    }

    public final void H(int i) {
        A1();
        W0(i);
    }

    public final uob H0() {
        boolean J0 = J0(16);
        boolean J02 = J0(17);
        int d0 = J02 ? d0() : 0;
        ir8 C0 = J0 ? C0() : null;
        int x = J02 ? x() : 0;
        long j = 0;
        long h = J0 ? h() : 0;
        if (J0) {
            j = R();
        }
        return new uob((Object) null, d0, C0, (Object) null, x, h, j, J0 ? c0() : -1, J0 ? I() : -1);
    }

    public final int I() {
        A1();
        return this.a.I();
    }

    public final qwd I0() {
        boolean J0 = J0(16);
        uob H0 = H0();
        int i = 0;
        boolean z = J0 && k();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = -9223372036854775807L;
        long e = J0 ? e() : -9223372036854775807L;
        long T = J0 ? T() : 0;
        if (J0) {
            i = t();
        }
        int i2 = i;
        long m = J0 ? m() : 0;
        long l = J0 ? l() : -9223372036854775807L;
        if (J0) {
            j = w();
        }
        return new qwd(H0, z, elapsedRealtime, e, T, i2, m, l, j, J0 ? s0() : 0);
    }

    public final void J(kqf kqf) {
        A1();
        y1(kqf);
    }

    public final boolean J0(int i) {
        A1();
        return this.a.J0(i);
    }

    public final void K(int i) {
        A1();
        d1(i);
    }

    public final void K0() {
        this.a.E();
    }

    public final void L(int i, int i2) {
        A1();
        this.a.L(i, i2);
    }

    public final void L0(int i) {
        this.a.V(i);
    }

    public final void M() {
        A1();
        m1();
    }

    public final o44 M0() {
        return this.a.Z();
    }

    public final PlaybackException N() {
        A1();
        return this.a.N();
    }

    public final boolean N0() {
        A1();
        return this.a.N0();
    }

    public final void O(boolean z) {
        A1();
        this.a.O(z);
    }

    public final Looper O0() {
        return this.a.O0();
    }

    public final void P(int i) {
        A1();
        j1(i);
    }

    public final ir8 P0() {
        if (J0(16)) {
            return C0();
        }
        return null;
    }

    public final long Q() {
        A1();
        return this.a.Q();
    }

    public final jkf Q0() {
        return J0(17) ? l0() : J0(16) ? new xpb(this) : jkf.a;
    }

    public final long R() {
        A1();
        return this.a.R();
    }

    public final us8 R0() {
        return J0(18) ? y0() : us8.J;
    }

    public final void S(int i, List list) {
        A1();
        this.a.S(i, list);
    }

    public final kqf S0() {
        return this.a.r0();
    }

    public final long T() {
        A1();
        return this.a.T();
    }

    public final boolean T0() {
        A1();
        return this.a.T0();
    }

    public final void U() {
        A1();
        l1();
    }

    public final v8g U0() {
        return this.a.y();
    }

    public final void V(int i) {
        A1();
        L0(i);
    }

    public final void V0() {
        this.a.p0();
    }

    public final qqf W() {
        A1();
        return this.a.W();
    }

    public final void W0(int i) {
        this.a.H(i);
    }

    public final boolean X() {
        A1();
        return this.a.X();
    }

    public final boolean X0() {
        return this.a.m0();
    }

    public final us8 Y() {
        A1();
        return this.a.Y();
    }

    public final boolean Y0() {
        return J0(23) && m0();
    }

    public final o44 Z() {
        A1();
        return M0();
    }

    public final void Z0(int i, int i2) {
        this.a.h0(i, i2);
    }

    public final boolean a() {
        A1();
        return this.a.a();
    }

    public final void a0(i30 i30, boolean z) {
        this.a.a0(i30, z);
    }

    public final void a1() {
        this.a.pause();
    }

    public final float b() {
        A1();
        return this.a.b();
    }

    public final void b0(us8 us8) {
        A1();
        v1(us8);
    }

    public final void b1() {
        this.a.release();
    }

    public final gob c() {
        A1();
        return this.a.c();
    }

    public final int c0() {
        A1();
        return this.a.c0();
    }

    public final void c1(sob sob) {
        this.a.f0(new xb6(this, sob));
    }

    public final boolean d() {
        A1();
        return this.a.d();
    }

    public final int d0() {
        A1();
        return this.a.d0();
    }

    public final void d1(int i) {
        this.a.K(i);
    }

    public final long e() {
        A1();
        return this.a.e();
    }

    public final void e0(boolean z) {
        A1();
        p1(z);
    }

    public final void e1(int i, ir8 ir8) {
        this.a.n0(i, ir8);
    }

    public final void f(gob gob) {
        A1();
        this.a.f(gob);
    }

    public final void f0(sob sob) {
        A1();
        c1(sob);
    }

    public final void f1() {
        this.a.x0();
    }

    public final void g(float f) {
        A1();
        z1(f);
    }

    public final void g0(List list, int i, int i2) {
        A1();
        this.a.g0(list, i, i2);
    }

    public final void g1() {
        this.a.w0();
    }

    public final int getPlaybackState() {
        A1();
        return this.a.getPlaybackState();
    }

    public final int getRepeatMode() {
        A1();
        return this.a.getRepeatMode();
    }

    public final long h() {
        A1();
        return this.a.h();
    }

    public final void h0(int i, int i2) {
        A1();
        Z0(i, i2);
    }

    public final void h1(int i, long j) {
        this.a.n(i, j);
    }

    public final int i() {
        A1();
        return this.a.i();
    }

    public final void i0(int i, int i2, int i3) {
        A1();
        this.a.i0(i, i2, i3);
    }

    public final void i1() {
        this.a.A();
    }

    public final void j(Surface surface) {
        A1();
        this.a.j(surface);
    }

    public final int j0() {
        A1();
        return this.a.j0();
    }

    public final void j1(int i) {
        this.a.P(i);
    }

    public final boolean k() {
        A1();
        return this.a.k();
    }

    public final void k0(List list) {
        A1();
        B0(list);
    }

    public final void k1() {
        this.a.v0();
    }

    public final long l() {
        A1();
        return this.a.l();
    }

    public final jkf l0() {
        A1();
        return this.a.l0();
    }

    public final void l1() {
        this.a.U();
    }

    public final long m() {
        A1();
        return this.a.m();
    }

    public final boolean m0() {
        A1();
        return X0();
    }

    public final void m1() {
        this.a.M();
    }

    public final void n(int i, long j) {
        A1();
        h1(i, j);
    }

    public final void n0(int i, ir8 ir8) {
        A1();
        e1(i, ir8);
    }

    public final void n1() {
        this.a.z();
    }

    public final pob o() {
        A1();
        return this.a.o();
    }

    public final void o0(ir8 ir8) {
        A1();
        s1(ir8);
    }

    public final void o1(int i, boolean z) {
        this.a.C(i, z);
    }

    public final void p(ir8 ir8, long j) {
        A1();
        t1(ir8, j);
    }

    public final void p0() {
        A1();
        V0();
    }

    public final void p1(boolean z) {
        this.a.e0(z);
    }

    public final void pause() {
        A1();
        a1();
    }

    public final void play() {
        A1();
        this.a.play();
    }

    public final void prepare() {
        A1();
        this.a.prepare();
    }

    public final boolean q() {
        A1();
        return this.a.q();
    }

    public final boolean q0() {
        A1();
        return this.a.q0();
    }

    public final void q1(int i) {
        this.a.u0(i);
    }

    public final void r() {
        A1();
        D0();
    }

    public final kqf r0() {
        A1();
        return S0();
    }

    public final void r1(int i, int i2) {
        this.a.F(i, i2);
    }

    public final void release() {
        A1();
        b1();
    }

    public final void s(boolean z) {
        A1();
        x1(z);
    }

    public final long s0() {
        A1();
        return this.a.s0();
    }

    public final void s1(ir8 ir8) {
        this.a.o0(ir8);
    }

    public final void seekTo(long j) {
        A1();
        this.a.seekTo(j);
    }

    public final void setPlaybackSpeed(float f) {
        A1();
        u1(f);
    }

    public final void setRepeatMode(int i) {
        A1();
        w1(i);
    }

    public final void stop() {
        A1();
        this.a.stop();
    }

    public final int t() {
        A1();
        return this.a.t();
    }

    public final void t0(int i, long j, List list) {
        A1();
        this.a.t0(i, j, list);
    }

    public final void t1(ir8 ir8, long j) {
        this.a.p(ir8, j);
    }

    public final long u() {
        A1();
        return this.a.u();
    }

    public final void u0(int i) {
        A1();
        q1(i);
    }

    public final void u1(float f) {
        this.a.setPlaybackSpeed(f);
    }

    public final void v(sob sob) {
        A1();
        this.a.v(new xb6(this, sob));
    }

    public final void v0() {
        A1();
        k1();
    }

    public final void v1(us8 us8) {
        this.a.b0(us8);
    }

    public final long w() {
        A1();
        return this.a.w();
    }

    public final void w0() {
        A1();
        g1();
    }

    public final void w1(int i) {
        this.a.setRepeatMode(i);
    }

    public final int x() {
        A1();
        return this.a.x();
    }

    public final void x0() {
        A1();
        f1();
    }

    public final void x1(boolean z) {
        this.a.s(z);
    }

    public final v8g y() {
        A1();
        return U0();
    }

    public final us8 y0() {
        A1();
        return this.a.y0();
    }

    public final void y1(kqf kqf) {
        this.a.J(kqf);
    }

    public final void z() {
        A1();
        n1();
    }

    public final void z0(List list) {
        A1();
        this.a.z0(list);
    }

    public final void z1(float f) {
        this.a.g(f);
    }
}
