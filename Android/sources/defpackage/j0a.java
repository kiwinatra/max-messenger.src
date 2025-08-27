package defpackage;

import android.net.Uri;
import android.view.KeyEvent;
import android.view.Surface;
import android.view.View;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.video.fetcher.FetcherException;
import ru.ok.tamtam.util.HandledException;

/* renamed from: j0a  reason: default package */
public final class j0a extends w1 implements n4a, e2a, e9g, iu8, hu8 {
    public or7 A0;
    public or7 B0;
    public or7 C0;
    public long D0;
    public long E0;
    public boolean F0;
    public final m95 X;
    public final hn4 Y;
    public ha9 Z;
    public final ju8 b;
    public final p8g c;
    public final jbf o;
    public final ys7 v;
    public l20 v0;
    public final o20 w;
    public r7g w0;
    public final fa9 x;
    public k20 x0;
    public final jtb y;
    public ntc y0;
    public final i0a z;
    public ao1 z0;

    /* JADX WARNING: type inference failed for: r3v1, types: [r7g, java.lang.Object] */
    public j0a(o4a o4a, ju8 ju8, p8g p8g, jbf jbf, ys7 ys7, o20 o20, fa9 fa9, jtb jtb, i0a i0a, m95 m95, hn4 hn4, boolean z2, boolean z3) {
        super(o4a);
        this.b = ju8;
        this.c = p8g;
        this.o = jbf;
        this.v = ys7;
        this.w = o20;
        this.x = fa9;
        this.y = jtb;
        this.z = i0a;
        this.X = m95;
        this.Y = hn4;
        ? obj = new Object();
        m48 m48 = (m48) ju8;
        obj.e = m48.l();
        obj.a = z2;
        obj.d = z3;
        this.w0 = new r7g(obj);
        ((q2) o4a).R(this);
        m48.e = this;
    }

    public final void A() {
        z68.c("j0a", "onPlayClick", new Object[0]);
        ntc ntc = this.y0;
        if (ntc != null) {
            z68.c("ntc", "sendVideoPlayToggleStat", new Object[0]);
            ntc.e((Object) null, "play_toggle");
        }
        ju8 ju8 = this.b;
        ((m48) ju8).o();
        ju8.getClass();
        i0a i0a = this.z;
        if (i0a != null) {
            i0a.i0(true);
        }
        d0(false);
    }

    public final int B() {
        if (!Y()) {
            return 0;
        }
        return ((m48) this.b).h();
    }

    public final void C() {
        z68.c("j0a", "onMediaPlayerControllerOwnerChanged", new Object[0]);
        if (this.v0 != null) {
            e0();
            this.b.getClass();
            f0();
            s();
        }
    }

    public final void D() {
        if (Y()) {
            ju8 ju8 = this.b;
            if (((m48) ju8).k()) {
                ju8.getClass();
                f0();
            }
        }
    }

    public final int E() {
        if (!Y()) {
            return 0;
        }
        return ((m48) this.b).i();
    }

    public final void F() {
        z68.a("j0a", "onPlaybackPrepared");
        ju8 ju8 = this.b;
        boolean k = ((m48) ju8).k();
        r7g a = this.w0.a();
        a.b = k;
        a.t = true;
        a.c = false;
        r7g r7g = new r7g(a);
        this.w0 = r7g;
        ((o4a) this.a).m(r7g);
        if (k) {
            i0();
            ju8.getClass();
            h0();
        }
    }

    public final void G(boolean z2) {
        r7g r7g = this.w0;
        if (z2 != r7g.a) {
            r7g a = r7g.a();
            a.a = z2;
            r7g r7g2 = new r7g(a);
            this.w0 = r7g2;
            ((o4a) this.a).m(r7g2);
            i0a i0a = this.z;
            if (i0a != null) {
                i0a.i0(z2);
            }
        }
        if (!z2) {
            j0();
        } else if (this.w0.b) {
            this.b.getClass();
            h0();
        }
    }

    public final void H() {
        z68.c("j0a", "onSoundClick", new Object[0]);
        if (Z()) {
            ((uta) this.X).c(new HandledException(new IllegalStateException("Receive onSoundClick but video is muted")), true);
            return;
        }
        m48 m48 = (m48) this.b;
        if (m48.l()) {
            m48.u(c44.DEFAULT_ASPECT_RATIO);
        } else {
            m48.u(1.0f);
        }
        boolean l = m48.l();
        ys7 ys7 = this.v;
        if (ys7.get() != null) {
            ((nd) ys7.get()).c(l ? 1 : 0, "VIDEO_AUTO_PLAY_SOUND_CLICK");
        }
    }

    public final void I(boolean z2) {
        z68.c("j0a", "Release", new Object[0]);
        ntc ntc = this.y0;
        if (ntc != null) {
            z68.c("ntc", "sendVideoStopStat userAction: %s", Boolean.valueOf(z2));
            ntc.e(z2 ? "user" : "scroll", "stop");
        }
        jbd.c(this.z0);
        k0();
        j0();
        jbd.c(this.C0);
        c0();
        this.v0 = null;
        this.Z = null;
        this.y0 = null;
        this.D0 = 0;
        this.F0 = false;
        if (Y()) {
            ju8 ju8 = this.b;
            ju8.getClass();
            m48 m48 = (m48) ju8;
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
        this.F0 = false;
        long j = (long) i;
        ju8 ju8 = this.b;
        m48 m48 = (m48) ju8;
        m48.r(j);
        r7g a = this.w0.a();
        m48 m482 = (m48) ju8;
        a.k = m482.f();
        a.l = m482.d();
        a.q = null;
        a.p = null;
        r7g r7g = new r7g(a);
        this.w0 = r7g;
        ((o4a) this.a).m(r7g);
        if (m48.k()) {
            i0();
            ju8.getClass();
            h0();
        }
    }

    public final void M() {
        z68.a("j0a", "onPlaybackBuffering");
        r7g a = this.w0.a();
        a.c = true;
        r7g r7g = new r7g(a);
        this.w0 = r7g;
        ((o4a) this.a).m(r7g);
    }

    public final void O(Throwable th) {
        z68.a("j0a", "onPlaybackError");
        ntc ntc = this.y0;
        if (ntc != null) {
            ntc.d(th);
        }
        r7g a = this.w0.a();
        a.b = false;
        a.c = false;
        r7g r7g = new r7g(a);
        this.w0 = r7g;
        ((o4a) this.a).m(r7g);
        i0a i0a = this.z;
        if (i0a != null) {
            k20 k20 = this.x0;
            if (k20 != null) {
                String str = k20.g;
                if (!cvg.A(str)) {
                    i0a.Q(str);
                    return;
                }
            }
            i0a.W0(th);
        }
    }

    public final void Q() {
        ntc ntc = this.y0;
        if (ntc != null) {
            String str = ntc.b == 2 ? "message" : "viewer";
            ys7 ys7 = (ys7) ntc.e;
            if (ys7.get() != null) {
                ((nd) ys7.get()).f("ACTION_PIP_OPEN", str);
            }
            c0();
        }
    }

    public final void R() {
        z68.c("j0a", "onPauseClick", new Object[0]);
        b0();
        i0a i0a = this.z;
        if (i0a != null) {
            i0a.i0(true);
        }
        d0(true);
    }

    public final void S() {
        z68.c("j0a", "onPipClick", new Object[0]);
        i0a i0a = this.z;
        if (i0a != null) {
            i0a.d0();
        }
        d0(true);
    }

    public final void T() {
        z68.c("j0a", "onFullScreenClick", new Object[0]);
        i0a i0a = this.z;
        if (i0a != null) {
            i0a.j0();
        }
        d0(false);
    }

    public final void W(l20 l20, long j, ha9 ha9, int i, boolean z2) {
        ju8 ju8 = this.b;
        ((m48) ju8).j = z2;
        z68.c("j0a", "Bind attach %s", l20.q);
        this.F0 = false;
        this.E0 = System.currentTimeMillis();
        jbd.c(this.z0);
        k0();
        j0();
        jbd.c(this.C0);
        this.v0 = l20;
        this.D0 = j;
        k20 k20 = ld8.Y(l20) ? l20.j.d.d : l20.d;
        this.x0 = k20;
        this.Z = ha9;
        f2a f2a = this.a;
        if (k20 == null) {
            a0(new FetcherException(11, "Video is null"));
            r7g a = this.w0.a();
            a.b = false;
            a.c = false;
            a.h = false;
            r7g r7g = new r7g(a);
            this.w0 = r7g;
            ((o4a) f2a).m(r7g);
            return;
        }
        jtb jtb = this.y;
        boolean a0 = ld8.a0(jtb, k20);
        if (a0) {
            jbd.c(this.C0);
            lja s = jha.p(1, TimeUnit.SECONDS).s(qe.a());
            or7 or7 = new or7(new h0a(this, 3), new p79(27), m58.e);
            s.a(or7);
            this.C0 = or7;
        }
        Uri a2 = this.w.a(l20);
        r7g a3 = this.w0.a();
        a3.e = ((m48) ju8).l();
        a3.f = false;
        k20 k202 = this.x0;
        a3.g = k202.f;
        a3.h = ld8.x0(jtb, k202);
        a3.i = a0;
        k20 k203 = this.x0;
        a3.j = k203.b;
        a3.k = k203.j;
        a3.n = null;
        a3.o = k203;
        a3.p = null;
        a3.q = a2;
        Z();
        a3.s = true;
        a3.t = false;
        a3.r = true;
        r7g r7g2 = new r7g(a3);
        this.w0 = r7g2;
        ((o4a) f2a).m(r7g2);
        r7g a4 = this.w0.a();
        a4.p = null;
        a4.q = null;
        r7g r7g3 = new r7g(a4);
        this.w0 = r7g3;
        ((o4a) f2a).m(r7g3);
        ju8.getClass();
        k20 k204 = this.x0;
        this.y0 = new ntc(k204.a, i, k204.h, this.v);
        if (!a0) {
            g0();
        }
    }

    public final List X() {
        ca6 ca6;
        m48 m48 = (m48) this.b;
        if (m48.f == null) {
            return Collections.emptyList();
        }
        ic3 ic3 = m48.b.b;
        zae zae = (zae) ic3.b;
        zae.n1();
        sc5 sc5 = zae.b;
        sc5.G1();
        ld5[] ld5Arr = (ld5[]) sc5.i1.i.v;
        int length = ld5Arr.length;
        npf npf = null;
        ca6 ca62 = null;
        for (int i = 0; i < length; i++) {
            if (i < length) {
                ld5 ld5 = ld5Arr[i];
                if (ld5 instanceof ld5) {
                    ca6 = ld5.j();
                    if (ca6 != null && uq9.g(ca6.Z) == 2) {
                        ca62 = ca6;
                    }
                }
            }
            ca6 = null;
            ca62 = ca6;
        }
        if (ca62 == null) {
            return Collections.emptyList();
        }
        Iterator it = ((List) ic3.o).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            npf npf2 = (npf) it.next();
            if (ic3.d(npf2.a, ca62)) {
                npf = npf2;
                break;
            }
        }
        return npf == null ? Collections.emptyList() : npf.b;
    }

    public final boolean Y() {
        return ((m48) this.b).g == this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.k;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Z() {
        /*
            r1 = this;
            k20 r0 = r1.x0
            if (r0 == 0) goto L_0x000c
            j20 r0 = r0.k
            if (r0 == 0) goto L_0x000c
            boolean r0 = r0.d
            if (r0 != 0) goto L_0x0018
        L_0x000c:
            ju8 r1 = r1.b
            m48 r1 = (defpackage.m48) r1
            mpf r1 = r1.e()
            mpf r0 = defpackage.mpf.X
            if (r1 != r0) goto L_0x001a
        L_0x0018:
            r1 = 1
            goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j0a.Z():boolean");
    }

    public final boolean a() {
        if (!Y()) {
            return false;
        }
        return ((m48) this.b).k();
    }

    public final void a0(Throwable th) {
        k20 k20;
        ntc ntc = this.y0;
        if (ntc != null) {
            ntc.d(th);
        }
        r7g a = this.w0.a();
        a.b = false;
        a.c = false;
        r7g r7g = new r7g(a);
        this.w0 = r7g;
        ((o4a) this.a).m(r7g);
        i0a i0a = this.z;
        if (i0a != null && (k20 = this.x0) != null) {
            String str = k20.g;
            if (this.c.a(th) || this.x0 == null || cvg.A(str)) {
                i0a.W0(th);
            } else {
                i0a.Q(str);
            }
        }
    }

    public final void b() {
        z68.c("j0a", "onVideoPlay", new Object[0]);
        ju8 ju8 = this.b;
        boolean k = ((m48) ju8).k();
        r7g a = this.w0.a();
        a.b = k;
        r7g r7g = new r7g(a);
        this.w0 = r7g;
        ((o4a) this.a).m(r7g);
        if (k) {
            i0();
            ju8.getClass();
            h0();
        }
        i0a i0a = this.z;
        if (i0a != null) {
            i0a.b();
        }
    }

    public final void b0() {
        z68.a("j0a", "Pause");
        if (Y()) {
            ntc ntc = this.y0;
            ju8 ju8 = this.b;
            if (ntc != null) {
                long f = ((m48) ju8).f();
                ntc.getClass();
                long j = 0;
                if (f > 0) {
                    j = f / 1000;
                }
                z68.c("ntc", "sendVideoPauseStat: %d", Long.valueOf(j));
                ntc.e(Long.valueOf(j), "pause");
            }
            ((m48) ju8).n();
            ju8.getClass();
        }
    }

    public final boolean c() {
        if (!Y()) {
            return false;
        }
        m48 m48 = (m48) this.b;
        if (m48.f == null) {
            return false;
        }
        sb5 sb5 = m48.b;
        zae zae = sb5.a;
        ikf V0 = zae.V0();
        return (!V0.q() && V0.n(zae.d0(), (gkf) zae.a, 0).z) || sb5.v() == -9223372036854775807L;
    }

    public final void c0() {
        if (Y()) {
            this.b.getClass();
            f0();
            e0();
        }
    }

    public final void d() {
        this.F0 = true;
        k0();
        j0();
    }

    public final void d0(boolean z2) {
        ha9 ha9;
        l20 l20;
        if (((m48) this.b).c.v() && (ha9 = this.Z) != null && (l20 = this.v0) != null) {
            fa9 fa9 = this.x;
            fa9.getClass();
            fa9.u(ha9, l20.q, new vz0(z2, 11));
        }
    }

    public final long e() {
        if (!Y()) {
            return 0;
        }
        return ((m48) this.b).g();
    }

    public final void e0() {
        l20 l20;
        ha9 ha9;
        z68.c("j0a", "saveVideoPosition", new Object[0]);
        if (!c()) {
            long h = h();
            long e = e();
            if ((h > 0 || e > 0) && (l20 = this.v0) != null && (ha9 = this.Z) != null) {
                boolean c2 = c();
                fa9 fa9 = this.x;
                fa9.getClass();
                fa9.u(ha9, l20.q, new ea9(h, e, c2));
            }
        }
    }

    public final int f() {
        f4g f4g;
        if (Y() && (f4g = ((m48) this.b).f) != null) {
            return f4g.f();
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005e, code lost:
        r5 = (defpackage.o4a) r11.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f0() {
        /*
            r11 = this;
            r0 = 1
            r1 = 0
            r2 = 3
            java.lang.String r3 = "j0a"
            java.lang.String r4 = "saveVideoScreenShot"
            defpackage.z68.c(r3, r4, new java.lang.Object[0])
            l20 r3 = r11.v0
            if (r3 == 0) goto L_0x0109
            boolean r3 = r11.c()
            if (r3 == 0) goto L_0x0016
            goto L_0x0109
        L_0x0016:
            long r3 = r11.h()
            long r5 = r11.e()
            r7 = 0
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 > 0) goto L_0x0029
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 > 0) goto L_0x0029
            return
        L_0x0029:
            l20 r5 = r11.v0
            o20 r6 = r11.w
            java.util.HashMap r7 = r6.d
            java.lang.String r8 = r5.q
            boolean r8 = r7.containsKey(r8)
            if (r8 != 0) goto L_0x0038
            goto L_0x0050
        L_0x0038:
            java.lang.String r5 = r5.q
            java.lang.Object r5 = r7.get(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            long r7 = r5.longValue()
            long r7 = r7 - r3
            long r7 = java.lang.Math.abs(r7)
            r9 = 50
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 > 0) goto L_0x0050
            return
        L_0x0050:
            hn4 r5 = r11.Y
            kn4 r5 = r5.b()
            r5.getClass()
            kn4 r7 = defpackage.kn4.o
            if (r5 != r7) goto L_0x005e
            return
        L_0x005e:
            f2a r5 = r11.a
            o4a r5 = (defpackage.o4a) r5
            android.graphics.drawable.BitmapDrawable r7 = r5.B()
            if (r7 != 0) goto L_0x0069
            return
        L_0x0069:
            l20 r8 = r11.v0
            android.graphics.Bitmap r9 = r7.getBitmap()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.util.HashMap r4 = r6.d
            java.lang.String r10 = r8.q
            r4.put(r10, r3)
            y00 r3 = r6.b
            r3.getClass()
            u00 r4 = new u00
            r4.<init>((java.lang.Object) r3, (java.lang.Object) r8, (java.lang.Object) r9, (int) r1)
            mka r9 = new mka
            r9.<init>(r0, r4)
            rx0 r4 = new rx0
            r10 = 24
            r4.<init>(r10)
            wbe r4 = r9.i(r4)
            ea5 r9 = r3.e
            fce r4 = r4.n(r9)
            jbf r9 = r3.a
            kbf r9 = (defpackage.kbf) r9
            lfd r9 = r9.c()
            fce r4 = r4.j(r9)
            w00 r9 = new w00
            r9.<init>(r3, r8, r1)
            tbe r1 = new tbe
            r1.<init>(r4, r9, r2)
            x00 r4 = new x00
            r4.<init>(r3)
            tbe r9 = new tbe
            r9.<init>(r1, r4, r0)
            kc3 r0 = r3.f
            java.util.Objects.requireNonNull(r0)
            d9d r1 = new d9d
            r3 = 7
            r1.<init>(r3, r0)
            ata r0 = new ata
            r0.<init>(r2, r6, r8)
            ekd r3 = defpackage.m58.g
            ao1 r4 = new ao1
            r4.<init>(r2, r0, r3)
            java.lang.String r0 = "observer is null"
            java.util.Objects.requireNonNull(r4, r0)
            he r0 = new he     // Catch:{ NullPointerException -> 0x0107, all -> 0x00f8 }
            r2 = 16
            r0.<init>((int) r2, (java.lang.Object) r4, (java.lang.Object) r1)     // Catch:{ NullPointerException -> 0x0107, all -> 0x00f8 }
            r9.l(r0)     // Catch:{ NullPointerException -> 0x0107, all -> 0x00f8 }
            kc3 r0 = r6.h
            r0.a(r4)
            r7g r0 = r11.w0
            r7g r0 = r0.a()
            r0.p = r7
            r7g r1 = new r7g
            r1.<init>(r0)
            r11.w0 = r1
            r5.m(r1)
            return
        L_0x00f8:
            r11 = move-exception
            defpackage.hd8.Z(r11)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "subscribeActual failed"
            r0.<init>(r1)
            r0.initCause(r11)
            throw r0
        L_0x0107:
            r11 = move-exception
            throw r11
        L_0x0109:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j0a.f0():void");
    }

    public final void g() {
        z68.a("j0a", "onVolumeChange");
        r7g a = this.w0.a();
        a.e = ((m48) this.b).l();
        r7g r7g = new r7g(a);
        this.w0 = r7g;
        ((o4a) this.a).m(r7g);
    }

    public final void g0() {
        jbd.c(this.z0);
        if (this.v0 != null && this.Z != null) {
            r7g a = this.w0.a();
            a.c = true;
            a.b = ((m48) this.b).j;
            r7g r7g = new r7g(a);
            this.w0 = r7g;
            ((o4a) this.a).m(r7g);
            wbe c2 = this.c.c(this.v0, this.D0, this.Z.c);
            kbf kbf = (kbf) this.o;
            fce j = c2.n(kbf.a()).j(kbf.c());
            ao1 ao1 = new ao1(3, new h0a(this, 1), new h0a(this, 2));
            j.l(ao1);
            this.z0 = ao1;
        }
    }

    public final long h() {
        if (!Y()) {
            return 0;
        }
        return ((m48) this.b).f();
    }

    public final void h0() {
        j0();
        if (this.w0.a) {
            lja s = jha.p(2, TimeUnit.SECONDS).s(qe.a());
            or7 or7 = new or7(new h0a(this, 0), new p79(26), m58.e);
            s.a(or7);
            this.B0 = or7;
        }
    }

    public final void i() {
        z68.c("j0a", "onTrackChanged", new Object[0]);
        l0();
        r7g a = this.w0.a();
        a.r = Z();
        a.j = ((m48) this.b).g();
        r7g r7g = new r7g(a);
        this.w0 = r7g;
        ((o4a) this.a).m(r7g);
        i0a i0a = this.z;
        if (i0a != null) {
            i0a.i();
        }
    }

    public final void i0() {
        k0();
        if (!this.F0) {
            lja s = jha.p(100, TimeUnit.MILLISECONDS).s(qe.a());
            or7 or7 = new or7(new h0a(this, 4), new p79(28), m58.e);
            s.a(or7);
            this.A0 = or7;
        }
    }

    public final void j(Surface surface) {
        ((m48) this.b).s(surface);
    }

    public final void j0() {
        jbd.c(this.B0);
    }

    public final void k(int i, int i2, int i3) {
        ((o4a) this.a).g(i, i2);
        i0a i0a = this.z;
        if (i0a != null) {
            i0a.k(i, i2, i3);
        }
    }

    public final void k0() {
        jbd.c(this.A0);
    }

    public final void l() {
        z68.a("j0a", "onSettingsClick");
        i0a i0a = this.z;
        if (i0a != null) {
            i0a.x1();
        }
    }

    public final void l0() {
        qac qac;
        ju8 ju8 = this.b;
        m48 m48 = (m48) ju8;
        if ((m48.f == null ? Collections.emptyList() : (List) m48.b.b.o).size() > 1) {
            ju8.getClass();
            m48 m482 = (m48) ju8;
            npf p = m482.f == null ? npf.c : m482.b.b.p();
            if (p != npf.c) {
                mpf mpf = p.a;
                qac = sac.b(mpf.o, mpf.v);
                r7g a = this.w0.a();
                a.f = false;
                a.m = qac;
                r7g r7g = new r7g(a);
                this.w0 = r7g;
                ((o4a) this.a).m(r7g);
            }
        }
        qac = null;
        r7g a2 = this.w0.a();
        a2.f = false;
        a2.m = qac;
        r7g r7g2 = new r7g(a2);
        this.w0 = r7g2;
        ((o4a) this.a).m(r7g2);
    }

    public final void m() {
        z68.a("j0a", "onVideoViewClick");
        i0a i0a = this.z;
        if (i0a != null) {
            i0a.m();
        }
    }

    public final void n() {
        z68.a("j0a", "onVideoViewLongClick");
        i0a i0a = this.z;
        if (i0a != null) {
            i0a.n();
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
        if (!Y()) {
            return 0;
        }
        return ((m48) this.b).j();
    }

    public final void q() {
        z68.c("j0a", "onVideoPaused", new Object[0]);
        k0();
        j0();
        jbd.c(this.C0);
        r7g a = this.w0.a();
        a.b = false;
        a.c = false;
        a.a = true;
        r7g r7g = new r7g(a);
        this.w0 = r7g;
        ((o4a) this.a).m(r7g);
        i0a i0a = this.z;
        if (i0a != null) {
            i0a.q();
            i0a.i0(true);
        }
    }

    public final void r() {
        z68.a("j0a", "onRenderedFirstFrame");
        ntc ntc = this.y0;
        if (ntc != null) {
            long j = this.E0;
            ntc.getClass();
            long currentTimeMillis = System.currentTimeMillis() - j;
            ntc.e(Long.valueOf(currentTimeMillis), "first_frame");
            z68.c("ntc", "sendVideoFirstFrameStat: %d", Long.valueOf(currentTimeMillis));
            ntc.e((Object) null, "play");
        }
        F();
    }

    public final void s() {
        z68.a("j0a", "onPlaybackEnded");
        k0();
        j0();
        r7g a = this.w0.a();
        a.b = false;
        a.c = false;
        a.a = true;
        r7g r7g = new r7g(a);
        this.w0 = r7g;
        ((o4a) this.a).m(r7g);
        i0a i0a = this.z;
        if (i0a != null) {
            i0a.D0();
        }
    }

    public final boolean t(int i, KeyEvent keyEvent) {
        boolean Z2 = Z();
        ju8 ju8 = this.b;
        if (Z2 || !((m48) ju8).l()) {
            m48 m48 = (m48) ju8;
            if (m48.c()) {
                if (i != 24 && i != 25) {
                    return false;
                }
                ys7 ys7 = this.v;
                if (ys7.get() != null) {
                    ((nd) ys7.get()).e("ENABLE_VIDEO_AUTO_PLAY_SOUND_BY_VOLUME_BUTTON");
                }
                m48.u(1.0f);
                r7g a = this.w0.a();
                a.e = true;
                r7g r7g = new r7g(a);
                this.w0 = r7g;
                ((o4a) this.a).m(r7g);
                ntc ntc = this.y0;
                if (ntc != null) {
                    ys7 ys72 = (ys7) ntc.e;
                    if (ys72.get() != null) {
                        ((nd) ys72.get()).c(1, "SWITCH_AUDIO_MODE");
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void u() {
        if (this.y0 != null) {
            m48 m48 = (m48) this.b;
            m48.n();
            ntc ntc = this.y0;
            String str = ntc.b == 2 ? "message" : "pip";
            ys7 ys7 = (ys7) ntc.e;
            if (ys7.get() != null) {
                ((nd) ys7.get()).f("ACTION_FULLSCREEN_OPEN", str);
            }
            c0();
            if (Y()) {
                m48.s((Surface) null);
            }
        }
    }

    public final void x() {
        z68.c("j0a", "onCloseClick", new Object[0]);
        i0a i0a = this.z;
        if (i0a != null) {
            i0a.m1();
        }
    }

    public final void y() {
        z68.c("j0a", "onMediaPlayerControllerDetach", new Object[0]);
        c0();
    }

    public final void z(long j) {
        ju8 ju8 = this.b;
        ((m48) ju8).r(j);
        r7g a = this.w0.a();
        m48 m48 = (m48) ju8;
        a.k = m48.f();
        a.l = m48.d();
        a.q = null;
        a.p = null;
        r7g r7g = new r7g(a);
        this.w0 = r7g;
        ((o4a) this.a).m(r7g);
    }
}
