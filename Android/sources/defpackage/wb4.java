package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: wb4  reason: default package */
public final class wb4 implements sob, wz8, iw4 {
    public final c7f a;
    public final ekf b;
    public final hkf c = new hkf();
    public final q40 o;
    public final SparseArray v;
    public m56 w;
    public vob x;
    public k7f y;
    public boolean z;

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, q40] */
    public wb4(c7f c7f) {
        c7f.getClass();
        this.a = c7f;
        this.w = new m56(v0g.w(), c7f, (k08) new db4(19));
        ekf ekf = new ekf();
        this.b = ekf;
        ? obj = new Object();
        obj.a = ekf;
        lx5 lx5 = tb7.b;
        obj.b = k0d.v;
        obj.c = p0d.y;
        this.o = obj;
        this.v = new SparseArray();
    }

    public final void A(int i, nz8 nz8, l28 l28, es8 es8) {
        td I = I(i, nz8);
        K(I, 1000, new tb4(I, l28, es8, 5));
    }

    public final void B(int i, nz8 nz8) {
        td I = I(i, nz8);
        K(I, 1025, new kb4(I, 5));
    }

    public final void C(int i, nz8 nz8, es8 es8) {
        td I = I(i, nz8);
        K(I, 1005, new ub4(I, es8, 0));
    }

    public final void D(int i, nz8 nz8) {
        td I = I(i, nz8);
        K(I, 1026, new kb4(I, 4));
    }

    public final void E(int i, nz8 nz8) {
        td I = I(i, nz8);
        K(I, 1023, new kb4(I, 6));
    }

    public final void F(int i, nz8 nz8) {
        td I = I(i, nz8);
        K(I, 1027, new kb4(I, 3));
    }

    public final void G(int i, nz8 nz8, es8 es8) {
        td I = I(i, nz8);
        K(I, 1004, new ub4(I, es8, 1));
    }

    public final void H(int i, ir8 ir8) {
        td a2 = a();
        K(a2, 1, new hb4(a2, ir8, i));
    }

    public final td I(int i, nz8 nz8) {
        this.x.getClass();
        if (nz8 != null) {
            return ((jkf) ((wb7) this.o.c).get(nz8)) != null ? g(nz8) : t(jkf.a, i, nz8);
        }
        jkf l0 = this.x.l0();
        if (i >= l0.p()) {
            l0 = jkf.a;
        }
        return t(l0, i, (nz8) null);
    }

    public final td J() {
        return g((nz8) this.o.w);
    }

    public final void K(td tdVar, int i, i08 i08) {
        this.v.put(i, tdVar);
        this.w.m(i, i08);
    }

    public final void L(vob vob, Looper looper) {
        n79.n(this.x == null || ((tb7) this.o.b).isEmpty());
        this.x = vob;
        this.y = this.a.a(looper, (Handler.Callback) null);
        m56 m56 = this.w;
        this.w = new m56((CopyOnWriteArraySet) m56.f, looper, (c7f) m56.c, new ba(28, this, vob), m56.b);
    }

    public final void O(boolean z2) {
        td a2 = a();
        K(a2, 9, new fb4(a2, z2, 2));
    }

    public final void S(o44 o44) {
        K(a(), 27, new nb4(6));
    }

    public final void X(qqf qqf) {
        td a2 = a();
        K(a2, 2, new ib4(0, a2, qqf));
    }

    public final void Y(vob vob, qob qob) {
    }

    public final td a() {
        return g((nz8) this.o.o);
    }

    public final void a0(long j) {
        K(a(), 16, new tb4(0));
    }

    public final void b(int i, nz8 nz8, l28 l28, es8 es8, IOException iOException, boolean z2) {
        td I = I(i, nz8);
        K(I, 1003, new p5(I, l28, es8, iOException, z2));
    }

    public final void b0(us8 us8) {
        K(a(), 14, new nb4(23));
    }

    public final void c(int i) {
        td a2 = a();
        K(a2, 6, new hb4(a2, i, 0));
    }

    public final void c0(us8 us8) {
        K(a(), 15, new nb4(21));
    }

    public final void d(boolean z2) {
        td a2 = a();
        K(a2, 3, new fb4(a2, z2, 3));
    }

    public final void d0(long j) {
        K(a(), 17, new tb4(3));
    }

    public final void e(int i, boolean z2) {
        td a2 = a();
        K(a2, 5, new jb4(a2, z2, i));
    }

    public final void f(float f) {
        td J = J();
        K(J, 22, new qb4(J, f));
    }

    public final void f0(jkf jkf, int i) {
        vob vob = this.x;
        vob.getClass();
        q40 q40 = this.o;
        q40.o = q40.l(vob, (tb7) q40.b, (nz8) q40.v, (ekf) q40.a);
        q40.z(vob.l0());
        td a2 = a();
        K(a2, 0, new hb4(a2, i, 5));
    }

    public final td g(nz8 nz8) {
        this.x.getClass();
        jkf jkf = nz8 == null ? null : (jkf) ((wb7) this.o.c).get(nz8);
        if (nz8 != null && jkf != null) {
            return t(jkf, jkf.h(nz8.a, this.b).c, nz8);
        }
        int d0 = this.x.d0();
        jkf l0 = this.x.l0();
        if (d0 >= l0.p()) {
            l0 = jkf.a;
        }
        return t(l0, d0, (nz8) null);
    }

    public final void h(int i) {
        td a2 = a();
        K(a2, 4, new hb4(a2, i, 2));
    }

    public final void i(int i, boolean z2) {
        K(a(), 30, new db4(16));
    }

    public final void j(boolean z2) {
        td J = J();
        K(J, 23, new fb4(J, z2, 1));
    }

    public final void k(List list) {
        td a2 = a();
        K(a2, 27, new x52(a2, list, 6));
    }

    public final void l(int i, boolean z2) {
        K(a(), -1, new db4(5));
    }

    public final void m(int i, int i2) {
        td J = J();
        K(J, 24, new pb4(J, i, i2));
    }

    public final void n(boolean z2) {
        td a2 = a();
        K(a2, 7, new fb4(a2, z2, 0));
    }

    public final void o(boolean z2) {
    }

    public final void o0(gob gob) {
        td a2 = a();
        K(a2, 12, new ba(27, a2, gob));
    }

    public final void onRepeatModeChanged(int i) {
        td a2 = a();
        K(a2, 8, new hb4(a2, i, 3));
    }

    public final void p(int i) {
    }

    public final void p0(pob pob) {
        K(a(), 13, new nb4(16));
    }

    public final void q(uob uob, uob uob2, int i) {
        if (i == 1) {
            this.z = false;
        }
        vob vob = this.x;
        vob.getClass();
        q40 q40 = this.o;
        q40.o = q40.l(vob, (tb7) q40.b, (nz8) q40.v, (ekf) q40.a);
        td a2 = a();
        K(a2, 11, new vd0((Object) a2, i, (Object) uob, (Object) uob2, 4));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = ((androidx.media3.exoplayer.ExoPlaybackException) r3).x0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q0(androidx.media3.common.PlaybackException r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof androidx.media3.exoplayer.ExoPlaybackException
            if (r0 == 0) goto L_0x000f
            androidx.media3.exoplayer.ExoPlaybackException r3 = (androidx.media3.exoplayer.ExoPlaybackException) r3
            nz8 r3 = r3.x0
            if (r3 == 0) goto L_0x000f
            td r3 = r2.g(r3)
            goto L_0x0013
        L_0x000f:
            td r3 = r2.a()
        L_0x0013:
            db4 r0 = new db4
            r1 = 15
            r0.<init>(r1)
            r1 = 10
            r2.K(r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb4.q0(androidx.media3.common.PlaybackException):void");
    }

    public final void r() {
    }

    public final void r0(sp9 sp9) {
        td a2 = a();
        K(a2, 28, new ba(29, a2, sp9));
    }

    public final void s(int i, nz8 nz8, l28 l28, es8 es8) {
        td I = I(i, nz8);
        K(I, 1002, new tb4(I, l28, es8, 7));
    }

    public final void s0(in4 in4) {
        K(a(), 29, new db4(25));
    }

    public final td t(jkf jkf, int i, nz8 nz8) {
        long j;
        jkf jkf2 = jkf;
        int i2 = i;
        nz8 nz82 = jkf.q() ? null : nz8;
        this.a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z2 = jkf2.equals(this.x.l0()) && i2 == this.x.d0();
        long j2 = 0;
        if (nz82 == null || !nz82.b()) {
            if (z2) {
                j = this.x.R();
                return new td(elapsedRealtime, jkf, i, nz82, j, this.x.l0(), this.x.d0(), (nz8) this.o.o, this.x.h(), this.x.m());
            } else if (!jkf.q()) {
                j2 = v0g.h0(jkf2.n(i2, this.c, 0).l);
            }
        } else if (z2 && this.x.c0() == nz82.b && this.x.I() == nz82.c) {
            j2 = this.x.h();
        }
        j = j2;
        return new td(elapsedRealtime, jkf, i, nz82, j, this.x.l0(), this.x.d0(), (nz8) this.o.o, this.x.h(), this.x.m());
    }

    public final void t0(long j) {
        K(a(), 18, new tb4(1));
    }

    public final void u(int i, nz8 nz8, Exception exc) {
        td I = I(i, nz8);
        K(I, 1024, new ib4(5, I, exc));
    }

    public final void v(int i, nz8 nz8, l28 l28, es8 es8) {
        td I = I(i, nz8);
        K(I, MultiFileUploader.MSG_TRY_UPLOAD_NEXT, new tb4(I, l28, es8, 9));
    }

    public final void w(i30 i30) {
        td J = J();
        K(J, 20, new ib4(3, J, i30));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = ((androidx.media3.exoplayer.ExoPlaybackException) r4).x0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void w0(androidx.media3.common.PlaybackException r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof androidx.media3.exoplayer.ExoPlaybackException
            if (r0 == 0) goto L_0x0010
            r0 = r4
            androidx.media3.exoplayer.ExoPlaybackException r0 = (androidx.media3.exoplayer.ExoPlaybackException) r0
            nz8 r0 = r0.x0
            if (r0 == 0) goto L_0x0010
            td r0 = r3.g(r0)
            goto L_0x0014
        L_0x0010:
            td r0 = r3.a()
        L_0x0014:
            ib4 r1 = new ib4
            r2 = 1
            r1.<init>(r2, r0, r4)
            r4 = 10
            r3.K(r0, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb4.w0(androidx.media3.common.PlaybackException):void");
    }

    public final void x(v8g v8g) {
        td J = J();
        K(J, 25, new ib4(4, J, v8g));
    }

    public final void y(int i, nz8 nz8, int i2) {
        td I = I(i, nz8);
        K(I, 1022, new hb4(I, i2, 4));
    }

    public final void z(kqf kqf) {
        K(a(), 19, new nb4(12));
    }
}
