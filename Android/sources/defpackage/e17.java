package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* renamed from: e17  reason: default package */
public final class e17 extends yj0 implements u17 {
    public final m07 h;
    public final rt6 i;
    public final p9a j;
    public final pw4 k;
    public final nfd l;
    public final boolean m;
    public final int n;
    public final boolean o = false;
    public final vf4 p;
    public final long q;
    public final long r = 0;
    public wq8 s;
    public brf t;
    public ir8 u;

    static {
        cs8.a("media3.exoplayer.hls");
    }

    public e17(ir8 ir8, rt6 rt6, m07 m07, p9a p9a, pw4 pw4, nfd nfd, vf4 vf4, long j2, boolean z, int i2) {
        this.u = ir8;
        this.s = ir8.c;
        this.i = rt6;
        this.h = m07;
        this.j = p9a;
        this.k = pw4;
        this.l = nfd;
        this.p = vf4;
        this.q = j2;
        this.m = z;
        this.n = i2;
    }

    public static t07 u(long j2, List list) {
        t07 t07 = null;
        for (int i2 = 0; i2 < list.size(); i2++) {
            t07 t072 = (t07) list.get(i2);
            long j3 = t072.v;
            if (j3 <= j2 && t072.Z) {
                t07 = t072;
            } else if (j3 > j2) {
                break;
            }
        }
        return t07;
    }

    public final boolean a(ir8 ir8) {
        ir8 i2 = i();
        xq8 xq8 = i2.b;
        xq8.getClass();
        xq8 xq82 = ir8.b;
        return xq82 != null && xq82.a.equals(xq8.a) && xq82.e.equals(xq8.e) && v0g.a(xq82.c, xq8.c) && i2.c.equals(ir8.c);
    }

    public final mt8 c(nz8 nz8, cb4 cb4, long j2) {
        cs b = b(nz8);
        gw4 gw4 = new gw4(this.d.c, 0, nz8);
        brf brf = this.t;
        mpb mpb = this.g;
        n79.o(mpb);
        return new r07(this.h, this.p, this.i, brf, this.k, gw4, this.l, b, cb4, this.j, this.m, this.n, this.o, mpb, this.r);
    }

    public final synchronized ir8 i() {
        return this.u;
    }

    public final void k() {
        vf4 vf4 = this.p;
        l15 l15 = (l15) vf4.Z;
        if (l15 != null) {
            l15.b();
        }
        Uri uri = vf4.v;
        if (uri != null) {
            uf4 uf4 = (uf4) vf4.b.get(uri);
            uf4.b.b();
            IOException iOException = uf4.X;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    public final void m(brf brf) {
        this.t = brf;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        mpb mpb = this.g;
        n79.o(mpb);
        pw4 pw4 = this.k;
        pw4.c(myLooper, mpb);
        pw4.prepare();
        cs b = b((nz8) null);
        xq8 xq8 = i().b;
        xq8.getClass();
        vf4 vf4 = this.p;
        vf4.getClass();
        vf4.o = v0g.o((Handler.Callback) null);
        vf4.Y = b;
        vf4.v0 = this;
        q8b q8b = new q8b(((g74) ((rt6) vf4.y).b).a(), xq8.a, 4, ((q17) vf4.z).f());
        n79.n(((l15) vf4.Z) == null);
        l15 l15 = new l15("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        vf4.Z = l15;
        int i2 = q8b.c;
        b.C(new l28(q8b.a, q8b.b, l15.F(q8b, vf4, ((nfd) vf4.X).p(i2))), i2, -1, (ea6) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void o(mt8 mt8) {
        r07 r07 = (r07) mt8;
        r07.b.c.remove(r07);
        for (e27 e27 : r07.E0) {
            if (e27.M0) {
                for (c27 c27 : e27.E0) {
                    c27.h();
                    aw4 aw4 = c27.h;
                    if (aw4 != null) {
                        aw4.f(c27.e);
                        c27.h = null;
                        c27.g = null;
                    }
                }
            }
            j07 j07 = e27.o;
            uf4 uf4 = (uf4) j07.g.b.get(j07.e[j07.r.i()]);
            if (uf4 != null) {
                uf4.Y = false;
            }
            j07.o = null;
            e27.X.D(e27);
            e27.A0.removeCallbacksAndMessages((Object) null);
            e27.Q0 = true;
            e27.B0.clear();
        }
        r07.B0 = null;
    }

    public final void q() {
        vf4 vf4 = this.p;
        vf4.v = null;
        vf4.x0 = null;
        vf4.w0 = null;
        vf4.x = -9223372036854775807L;
        ((l15) vf4.Z).D((v28) null);
        vf4.Z = null;
        HashMap hashMap = vf4.b;
        for (uf4 uf4 : hashMap.values()) {
            uf4.b.D((v28) null);
        }
        vf4.o.removeCallbacksAndMessages((Object) null);
        vf4.o = null;
        hashMap.clear();
        this.k.release();
    }

    public final synchronized void t(ir8 ir8) {
        this.u = ir8;
    }

    /* JADX WARNING: type inference failed for: r25v0, types: [v02, java.lang.Object] */
    public final void v(c17 c17) {
        kce kce;
        long j2;
        long j3;
        int i2;
        long j4;
        c17 c172 = c17;
        boolean z = c172.p;
        long j5 = c172.h;
        long h0 = z ? v0g.h0(j5) : -9223372036854775807L;
        int i3 = c172.d;
        long j6 = (i3 == 2 || i3 == 1) ? h0 : -9223372036854775807L;
        vf4 vf4 = this.p;
        ((k17) vf4.w0).getClass();
        ? obj = new Object();
        boolean z2 = vf4.w;
        int i4 = i3;
        long j7 = c172.u;
        tb7 tb7 = c172.r;
        boolean z3 = c172.g;
        long j8 = c172.e;
        if (z2) {
            long j9 = h0;
            long j10 = j5 - vf4.x;
            boolean z4 = c172.o;
            long j11 = z4 ? j10 + j7 : -9223372036854775807L;
            long S = c172.p ? v0g.S(v0g.B(this.q)) - (j5 + j7) : 0;
            long j12 = this.s.a;
            int i5 = (j12 > -9223372036854775807L ? 1 : (j12 == -9223372036854775807L ? 0 : -1));
            a17 a17 = c172.v;
            if (i5 != 0) {
                j2 = v0g.S(j12);
            } else {
                if (j8 != -9223372036854775807L) {
                    j4 = j7 - j8;
                } else {
                    long j13 = a17.d;
                    if (j13 != -9223372036854775807L) {
                        long j14 = j13;
                        if (c172.n != -9223372036854775807L) {
                            j4 = j14;
                        }
                    }
                    j4 = a17.c;
                    if (j4 == -9223372036854775807L) {
                        j4 = c172.m * 3;
                    }
                }
                j2 = j4 + S;
            }
            long j15 = j7 + S;
            long k2 = v0g.k(j2, S, j15);
            wq8 wq8 = i().c;
            boolean z5 = false;
            boolean z6 = wq8.d == -3.4028235E38f && wq8.e == -3.4028235E38f && a17.c == -9223372036854775807L && a17.d == -9223372036854775807L;
            uq8 uq8 = new uq8();
            uq8.a = v0g.h0(k2);
            float f = 1.0f;
            uq8.d = z6 ? 1.0f : this.s.d;
            if (!z6) {
                f = this.s.e;
            }
            uq8.e = f;
            wq8 wq82 = new wq8(uq8);
            this.s = wq82;
            if (j8 == -9223372036854775807L) {
                j8 = j15 - v0g.S(wq82.a);
            }
            if (z3) {
                j3 = j8;
            } else {
                t07 u2 = u(j8, c172.s);
                if (u2 != null) {
                    j3 = u2.v;
                } else if (tb7.isEmpty()) {
                    i2 = i4;
                    j3 = 0;
                    if (i2 == 2 && c172.f) {
                        z5 = true;
                    }
                    kce = new kce(j6, j9, j11, c172.u, j10, j3, true, !z4, z5, obj, i(), this.s);
                } else {
                    x07 x07 = (x07) tb7.get(v0g.d(Long.valueOf(j8), tb7, true));
                    t07 u3 = u(j8, x07.v0);
                    j3 = u3 != null ? u3.v : x07.v;
                }
            }
            i2 = i4;
            z5 = true;
            kce = new kce(j6, j9, j11, c172.u, j10, j3, true, !z4, z5, obj, i(), this.s);
        } else {
            long j16 = h0;
            long j17 = (j8 == -9223372036854775807L || tb7.isEmpty()) ? 0 : (z3 || j8 == j7) ? j8 : ((x07) tb7.get(v0g.d(Long.valueOf(j8), tb7, true))).v;
            ir8 i6 = i();
            long j18 = c172.u;
            kce = new kce(j6, j16, j18, j18, 0, j17, true, false, true, obj, i6, (wq8) null);
        }
        n(kce);
    }
}
