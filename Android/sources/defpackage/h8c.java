package defpackage;

import android.net.Uri;
import android.os.Looper;

/* renamed from: h8c  reason: default package */
public final class h8c extends xj0 {
    public final gr8 h;
    public final zq8 i;
    public final f74 j;
    public final y3a k;
    public final ow4 l;
    public final gga m;
    public final int n = 1048576;
    public boolean o = true;
    public long p = -9223372036854775807L;
    public boolean q;
    public boolean r;
    public arf s;

    public h8c(gr8 gr8, f74 f74, y3a y3a, ow4 ow4, gga gga) {
        zq8 zq8 = gr8.b;
        zq8.getClass();
        this.i = zq8;
        this.h = gr8;
        this.j = f74;
        this.k = y3a;
        this.l = ow4;
        this.m = gga;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [l15, java.lang.Object] */
    public final lt8 a(mz8 mz8, cb4 cb4, long j2) {
        h74 a = this.j.a();
        arf arf = this.s;
        if (arf != null) {
            a.O(arf);
        }
        Uri uri = this.i.a;
        y64.k(this.g);
        ? obj = new Object();
        obj.a = (if4) ((yf5) this.k.b);
        fw4 fw4 = new fw4(this.d.c, 0, mz8);
        uz8 uz8 = new uz8(this.c.c, 0, mz8, 0);
        return new c8c(uri, a, obj, this.l, fw4, this.m, uz8, this, cb4, this.n);
    }

    public final gr8 f() {
        return this.h;
    }

    public final void g() {
    }

    public final void i(arf arf) {
        this.s = arf;
        ow4 ow4 = this.l;
        ow4.prepare();
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        lpb lpb = this.g;
        y64.k(lpb);
        ow4.c(myLooper, lpb);
        p();
    }

    public final void k(lt8 lt8) {
        c8c c8c = (c8c) lt8;
        if (c8c.E0) {
            for (icd icd : c8c.B0) {
                icd.i();
                zv4 zv4 = icd.h;
                if (zv4 != null) {
                    zv4.f(icd.e);
                    icd.h = null;
                    icd.g = null;
                }
            }
        }
        c8c.Y.O(c8c);
        c8c.y0.removeCallbacksAndMessages((Object) null);
        c8c.z0 = null;
        c8c.U0 = true;
    }

    public final void m() {
        this.l.release();
    }

    public final void p() {
        long j2 = this.p;
        boolean z = this.q;
        boolean z2 = this.r;
        gr8 gr8 = this.h;
        jce jce = r1;
        jce jce2 = new jce(-9223372036854775807L, -9223372036854775807L, j2, j2, 0, 0, z, false, false, (ejd) null, gr8, z2 ? gr8.c : null);
        j(this.o ? new bc6(jce) : jce);
    }

    public final void q(long j2, boolean z, boolean z2) {
        if (j2 == -9223372036854775807L) {
            j2 = this.p;
        }
        if (this.o || this.p != j2 || this.q != z || this.r != z2) {
            this.p = j2;
            this.q = z;
            this.r = z2;
            this.o = false;
            p();
        }
    }
}
