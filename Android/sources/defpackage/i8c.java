package defpackage;

import android.os.Looper;

/* renamed from: i8c  reason: default package */
public final class i8c extends yj0 {
    public final g74 h;
    public final y3a i;
    public final pw4 j;
    public final nfd k;
    public final int l;
    public boolean m = true;
    public long n = -9223372036854775807L;
    public boolean o;
    public boolean p;
    public brf q;
    public ir8 r;

    public i8c(ir8 ir8, g74 g74, y3a y3a, pw4 pw4, nfd nfd, int i2) {
        this.r = ir8;
        this.h = g74;
        this.i = y3a;
        this.j = pw4;
        this.k = nfd;
        this.l = i2;
    }

    public final boolean a(ir8 ir8) {
        xq8 xq8 = i().b;
        xq8.getClass();
        xq8 xq82 = ir8.b;
        return xq82 != null && xq82.a.equals(xq8.a) && xq82.i == xq8.i && v0g.a(xq82.f, xq8.f);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, d19] */
    public final mt8 c(nz8 nz8, cb4 cb4, long j2) {
        j74 a = this.h.a();
        brf brf = this.q;
        if (brf != null) {
            a.H(brf);
        }
        xq8 xq8 = i().b;
        xq8.getClass();
        n79.o(this.g);
        ? obj = new Object();
        obj.b = (zf5) this.i.b;
        gw4 gw4 = new gw4(this.d.c, 0, nz8);
        cs b = b(nz8);
        long S = v0g.S(xq8.i);
        return new d8c(xq8.a, a, obj, this.j, gw4, this.k, b, this, cb4, xq8.f, this.l, S);
    }

    public final synchronized ir8 i() {
        return this.r;
    }

    public final void k() {
    }

    public final void m(brf brf) {
        this.q = brf;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        mpb mpb = this.g;
        n79.o(mpb);
        pw4 pw4 = this.j;
        pw4.c(myLooper, mpb);
        pw4.prepare();
        u();
    }

    public final void o(mt8 mt8) {
        d8c d8c = (d8c) mt8;
        if (d8c.F0) {
            for (jcd jcd : d8c.C0) {
                jcd.h();
                aw4 aw4 = jcd.h;
                if (aw4 != null) {
                    aw4.f(jcd.e);
                    jcd.h = null;
                    jcd.g = null;
                }
            }
        }
        d8c.Z.D(d8c);
        d8c.z0.removeCallbacksAndMessages((Object) null);
        d8c.A0 = null;
        d8c.W0 = true;
    }

    public final void q() {
        this.j.release();
    }

    public final synchronized void t(ir8 ir8) {
        this.r = ir8;
    }

    public final void u() {
        long j2 = this.n;
        boolean z = this.o;
        boolean z2 = this.p;
        ir8 i2 = i();
        kce kce = r1;
        kce kce2 = new kce(-9223372036854775807L, -9223372036854775807L, j2, j2, 0, 0, z, false, false, (v02) null, i2, z2 ? i2.c : null);
        n(this.m ? new cc6(kce) : kce);
    }

    public final void v(long j2, boolean z, boolean z2) {
        if (j2 == -9223372036854775807L) {
            j2 = this.n;
        }
        if (this.m || this.n != j2 || this.o != z || this.p != z2) {
            this.n = j2;
            this.o = z;
            this.p = z2;
            this.m = false;
            u();
        }
    }
}
