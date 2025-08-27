package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: vb4  reason: default package */
public final class vb4 implements rob, vz8, hw4 {
    public final b7f a;
    public final dkf b;
    public final gkf c;
    public final kwd o;
    public final SparseArray v;
    public d23 w;
    public j3h x;
    public boolean y;

    /* JADX WARNING: type inference failed for: r0v2, types: [kwd, java.lang.Object] */
    public vb4(b7f b7f) {
        b7f.getClass();
        this.a = b7f;
        int i = t0g.a;
        Looper myLooper = Looper.myLooper();
        this.w = new d23(myLooper == null ? Looper.getMainLooper() : myLooper, b7f, (j08) new db4(24));
        dkf dkf = new dkf();
        this.b = dkf;
        this.c = new gkf();
        ? obj = new Object();
        obj.a = dkf;
        lx5 lx5 = tb7.b;
        obj.b = k0d.v;
        obj.c = p0d.y;
        this.o = obj;
        this.v = new SparseArray();
    }

    public final void A(int i, mz8 mz8) {
        Q(O(i, mz8), 1027, new nb4(2));
    }

    public final void B(gr8 gr8, int i) {
        Q(b(), 1, new db4(17));
    }

    public final void C(int i, mz8 mz8, es8 es8) {
        Q(O(i, mz8), 1004, new db4(11));
    }

    public final void D(int i, mz8 mz8, es8 es8) {
        Q(O(i, mz8), 1005, new nb4(11));
    }

    public final void E(tob tob, tob tob2, int i) {
        if (i == 1) {
            this.y = false;
        }
        j3h j3h = this.x;
        j3h.getClass();
        kwd kwd = this.o;
        kwd.d = kwd.e(j3h, (tb7) kwd.b, (mz8) kwd.e, (dkf) kwd.a);
        Q(b(), 11, new nb4(15));
    }

    public final void F(int i, mz8 mz8) {
        Q(O(i, mz8), 1025, new tb4(6));
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [pt8, mz8] */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = ((com.google.android.exoplayer2.ExoPlaybackException) r3).y;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void G(com.google.android.exoplayer2.PlaybackException r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof com.google.android.exoplayer2.ExoPlaybackException
            if (r0 == 0) goto L_0x0014
            com.google.android.exoplayer2.ExoPlaybackException r3 = (com.google.android.exoplayer2.ExoPlaybackException) r3
            pt8 r3 = r3.y
            if (r3 == 0) goto L_0x0014
            mz8 r0 = new mz8
            r0.<init>(r3)
            sd r3 = r2.M(r0)
            goto L_0x0018
        L_0x0014:
            sd r3 = r2.b()
        L_0x0018:
            nb4 r0 = new nb4
            r1 = 3
            r0.<init>((int) r1)
            r1 = 10
            r2.Q(r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vb4.G(com.google.android.exoplayer2.PlaybackException):void");
    }

    public final void H(int i, mz8 mz8) {
        Q(O(i, mz8), 1026, new nb4(29));
    }

    public final void I(tpf tpf, cqf cqf) {
        Q(b(), 2, new nb4(17));
    }

    public final void J(oob oob) {
        Q(b(), 13, new db4(18));
    }

    public final void K(int i, mz8 mz8, k28 k28, es8 es8) {
        Q(O(i, mz8), MultiFileUploader.MSG_TRY_UPLOAD_NEXT, new db4(6));
    }

    public final void L(int i, mz8 mz8, k28 k28, es8 es8) {
        Q(O(i, mz8), 1000, new nb4(9));
    }

    public final sd M(mz8 mz8) {
        this.x.getClass();
        ikf ikf = mz8 == null ? null : (ikf) ((wb7) this.o.c).get(mz8);
        if (mz8 != null && ikf != null) {
            return N(ikf, ikf.h(mz8.a, this.b).c, mz8);
        }
        int d0 = this.x.d0();
        ikf V0 = this.x.V0();
        if (d0 >= V0.p()) {
            V0 = ikf.a;
        }
        return N(V0, d0, (mz8) null);
    }

    public final sd N(ikf ikf, int i, mz8 mz8) {
        long j;
        ikf ikf2 = ikf;
        int i2 = i;
        mz8 mz82 = ikf.q() ? null : mz8;
        this.a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = ikf2.equals(this.x.V0()) && i2 == this.x.d0();
        long j2 = 0;
        if (mz82 == null || !mz82.a()) {
            if (z) {
                j = this.x.R();
                return new sd(elapsedRealtime, ikf, i, mz82, j, this.x.V0(), this.x.d0(), (mz8) this.o.d, this.x.h(), this.x.m());
            } else if (!ikf.q()) {
                j2 = t0g.M(ikf2.n(i2, this.c, 0).v0);
            }
        } else if (z && this.x.c0() == mz82.b && this.x.I() == mz82.c) {
            j2 = this.x.h();
        }
        j = j2;
        return new sd(elapsedRealtime, ikf, i, mz82, j, this.x.V0(), this.x.d0(), (mz8) this.o.d, this.x.h(), this.x.m());
    }

    public final sd O(int i, mz8 mz8) {
        this.x.getClass();
        ikf ikf = ikf.a;
        if (mz8 != null) {
            return ((ikf) ((wb7) this.o.c).get(mz8)) != null ? M(mz8) : N(ikf, i, mz8);
        }
        ikf V0 = this.x.V0();
        if (i < V0.p()) {
            ikf = V0;
        }
        return N(ikf, i, (mz8) null);
    }

    public final sd P() {
        return M((mz8) this.o.f);
    }

    public final void Q(sd sdVar, int i, h08 h08) {
        this.v.put(i, sdVar);
        this.w.r(i, h08);
    }

    public final void R(j3h j3h, Looper looper) {
        y64.j(this.x == null || ((tb7) this.o.b).isEmpty());
        j3h.getClass();
        this.x = j3h;
        this.a.a(looper, (Handler.Callback) null);
        d23 d23 = this.w;
        this.w = new d23((CopyOnWriteArraySet) d23.o, looper, (b7f) d23.a, (j08) new rt3(this, j3h));
    }

    public final void a(int i, mz8 mz8, k28 k28, es8 es8) {
        Q(O(i, mz8), 1002, new tb4(8));
    }

    public final sd b() {
        return M((mz8) this.o.d);
    }

    public final void c(int i) {
        Q(b(), 6, new nb4(5));
    }

    public final void d(boolean z) {
        sd b2 = b();
        Q(b2, 3, new nb4(b2, z));
    }

    public final void e(int i, boolean z) {
        Q(b(), 5, new db4(1));
    }

    public final void f(float f) {
        Q(P(), 22, new nb4(22));
    }

    public final void g(int i, mz8 mz8, Exception exc) {
        Q(O(i, mz8), 1024, new nb4(13));
    }

    public final void h(int i) {
        Q(b(), 4, new db4(23));
    }

    public final void i(int i, boolean z) {
        Q(b(), 30, new nb4(26));
    }

    public final void j(boolean z) {
        Q(P(), 23, new tb4(2));
    }

    public final void k(List list) {
        sd b2 = b();
        Q(b2, 27, new x52(b2, list, 7));
    }

    public final void l(int i, boolean z) {
        Q(b(), -1, new db4(7));
    }

    public final void m(int i, int i2) {
        Q(P(), 24, new db4(12));
    }

    public final void n(boolean z) {
        Q(b(), 7, new tb4(10));
    }

    public final void o(gn4 gn4) {
        Q(b(), 29, new nb4(24));
    }

    public final void onRepeatModeChanged(int i) {
        Q(b(), 8, new db4(29));
    }

    public final void p() {
        Q(b(), -1, new db4(10));
    }

    public final void q(ts8 ts8) {
        Q(b(), 14, new db4(3));
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [pt8, mz8] */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = ((com.google.android.exoplayer2.ExoPlaybackException) r3).y;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r(com.google.android.exoplayer2.PlaybackException r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof com.google.android.exoplayer2.ExoPlaybackException
            if (r0 == 0) goto L_0x0015
            r0 = r3
            com.google.android.exoplayer2.ExoPlaybackException r0 = (com.google.android.exoplayer2.ExoPlaybackException) r0
            pt8 r0 = r0.y
            if (r0 == 0) goto L_0x0015
            mz8 r1 = new mz8
            r1.<init>(r0)
            sd r0 = r2.M(r1)
            goto L_0x0019
        L_0x0015:
            sd r0 = r2.b()
        L_0x0019:
            rt3 r1 = new rt3
            r1.<init>((defpackage.sd) r0, (com.google.android.exoplayer2.PlaybackException) r3)
            r3 = 10
            r2.Q(r0, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vb4.r(com.google.android.exoplayer2.PlaybackException):void");
    }

    public final void s(rp9 rp9) {
        Q(b(), 28, new nb4(27));
    }

    public final void t(sqf sqf) {
        Q(b(), 2, new db4(14));
    }

    public final void u(int i, mz8 mz8, k28 k28, es8 es8, IOException iOException, boolean z) {
        sd O = O(i, mz8);
        Q(O, 1003, new p5(O, k28, es8, iOException, z));
    }

    public final void v(int i, mz8 mz8) {
        Q(O(i, mz8), 1023, new tb4(4));
    }

    public final void w(int i, mz8 mz8, int i2) {
        sd O = O(i, mz8);
        Q(O, 1022, new nb4(O, i2));
    }

    public final void x(fob fob) {
        Q(b(), 12, new db4(4));
    }

    public final void y(int i) {
        j3h j3h = this.x;
        j3h.getClass();
        kwd kwd = this.o;
        kwd.d = kwd.e(j3h, (tb7) kwd.b, (mz8) kwd.e, (dkf) kwd.a);
        kwd.i(j3h.V0());
        Q(b(), 0, new nb4(19));
    }

    public final void z(u8g u8g) {
        sd P = P();
        Q(P, 25, new sb4(P, u8g));
    }
}
