package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.google.android.exoplayer2.source.dash.DashManifestStaleException;
import java.util.HashMap;
import java.util.List;

/* renamed from: n64  reason: default package */
public final class n64 extends xj0 {
    public w28 A;
    public arf B;
    public DashManifestStaleException C;
    public Handler D;
    public vq8 E;
    public Uri F;
    public final Uri G;
    public x54 H = null;
    public boolean I;
    public long J;
    public long K;
    public long L;
    public int M;
    public long N;
    public int O;
    public final gr8 h;
    public final boolean i;
    public final f74 j;
    public final grg k;
    public final o9a l;
    public final ow4 m;
    public final gga n;
    public final tgg o;
    public final long p;
    public final uz8 q;
    public final n8b r;
    public final er7 s;
    public final Object t;
    public final SparseArray u;
    public final h64 v;
    public final h64 w;
    public final vs6 x;
    public final x28 y;
    public h74 z;

    static {
        gd5.a("goog.exo.dash");
    }

    public n64(gr8 gr8, f74 f74, n8b n8b, grg grg, o9a o9a, ow4 ow4, gga gga, long j2) {
        this.h = gr8;
        this.E = gr8.c;
        zq8 zq8 = gr8.b;
        zq8.getClass();
        Uri uri = zq8.a;
        this.F = uri;
        this.G = uri;
        this.j = f74;
        this.r = n8b;
        this.k = grg;
        this.m = ow4;
        this.n = gga;
        this.p = j2;
        this.l = o9a;
        this.o = new tgg(2);
        this.i = false;
        this.q = new uz8(this.c.c, 0, (mz8) null, 0);
        this.t = new Object();
        this.u = new SparseArray();
        this.x = new vs6(15, (Object) this);
        this.N = -9223372036854775807L;
        this.L = -9223372036854775807L;
        this.s = new er7(15, (Object) this);
        this.y = new e4(13, (Object) this);
        this.v = new h64(this, 0);
        this.w = new h64(this, 1);
    }

    public static boolean p(fcb fcb) {
        int i2 = 0;
        while (true) {
            List list = fcb.c;
            if (i2 >= list.size()) {
                return false;
            }
            int i3 = ((r9) list.get(i2)).b;
            if (i3 == 1 || i3 == 2) {
                return true;
            }
            i2++;
        }
        return true;
    }

    public final lt8 a(mz8 mz8, cb4 cb4, long j2) {
        mz8 mz82 = mz8;
        int intValue = ((Integer) mz82.a).intValue() - this.O;
        uz8 uz8 = new uz8(this.c.c, 0, mz8, this.H.b(intValue).b);
        fw4 fw4 = new fw4(this.d.c, 0, mz82);
        int i2 = this.O + intValue;
        x54 x54 = this.H;
        arf arf = this.B;
        long j3 = this.L;
        lpb lpb = this.g;
        y64.k(lpb);
        o9a o9a = this.l;
        vs6 vs6 = this.x;
        f64 f64 = new f64(i2, x54, this.o, intValue, this.k, arf, this.m, fw4, this.n, uz8, j3, this.y, cb4, o9a, vs6, lpb);
        this.u.put(i2, f64);
        return f64;
    }

    public final gr8 f() {
        return this.h;
    }

    public final void g() {
        this.y.b();
    }

    public final void i(arf arf) {
        this.B = arf;
        ow4 ow4 = this.m;
        ow4.prepare();
        Looper myLooper = Looper.myLooper();
        lpb lpb = this.g;
        y64.k(lpb);
        ow4.c(myLooper, lpb);
        if (this.i) {
            s(false);
            return;
        }
        this.z = this.j.a();
        this.A = new w28("DashMediaSource", 0);
        this.D = t0g.m((Handler.Callback) null);
        t();
    }

    public final void k(lt8 lt8) {
        f64 f64 = (f64) lt8;
        hpb hpb = f64.v0;
        hpb.w = true;
        hpb.b.removeCallbacksAndMessages((Object) null);
        for (v03 o2 : f64.A0) {
            o2.o(f64);
        }
        f64.z0 = null;
        this.u.remove(f64.a);
    }

    public final void m() {
        this.I = false;
        this.z = null;
        w28 w28 = this.A;
        if (w28 != null) {
            w28.O((u28) null);
            this.A = null;
        }
        this.J = 0;
        this.K = 0;
        this.H = this.i ? this.H : null;
        this.F = this.G;
        this.C = null;
        Handler handler = this.D;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.D = null;
        }
        this.L = -9223372036854775807L;
        this.M = 0;
        this.N = -9223372036854775807L;
        this.O = 0;
        this.u.clear();
        tgg tgg = this.o;
        ((HashMap) tgg.a).clear();
        ((HashMap) tgg.b).clear();
        ((HashMap) tgg.c).clear();
        this.m.release();
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [s28, java.lang.Object] */
    public final void q() {
        boolean z2;
        w28 w28 = this.A;
        xv1 xv1 = new xv1(14, (Object) this);
        synchronized (h88.f) {
            z2 = h88.g;
        }
        if (z2) {
            xv1.u();
            return;
        }
        if (w28 == null) {
            w28 = new w28("SntpClient", 0);
        }
        w28.P(new Object(), new p1e((Object) xv1), 1);
    }

    public final void r(p8b p8b, long j2, long j3) {
        p8b p8b2 = p8b;
        long j4 = p8b2.a;
        sne sne = p8b2.o;
        k28 k28 = new k28(j4, p8b2.b, sne.c, sne.o, j2, j3, sne.b);
        this.n.getClass();
        this.q.d(k28, p8b2.c, -1, (ca6) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x019a, code lost:
        if (r14.b != 3) goto L_0x01a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s(boolean r43) {
        /*
            r42 = this;
            r1 = r42
            r2 = 0
            r3 = r2
        L_0x0004:
            android.util.SparseArray r0 = r1.u
            int r4 = r0.size()
            if (r3 >= r4) goto L_0x00e7
            int r4 = r0.keyAt(r3)
            int r6 = r1.O
            if (r4 < r6) goto L_0x00e2
            java.lang.Object r0 = r0.valueAt(r3)
            r6 = r0
            f64 r6 = (defpackage.f64) r6
            x54 r7 = r1.H
            int r0 = r1.O
            int r4 = r4 - r0
            r6.D0 = r7
            r6.E0 = r4
            hpb r0 = r6.v0
            r0.v = r2
            r0.X = r7
            java.util.TreeMap r8 = r0.c
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x0034:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0058
            java.lang.Object r9 = r8.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r9 = r9.getKey()
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            java.lang.Object r11 = r0.X
            x54 r11 = (defpackage.x54) r11
            long r11 = r11.h
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L_0x0034
            r8.remove()
            goto L_0x0034
        L_0x0058:
            v03[] r8 = r6.A0
            if (r8 == 0) goto L_0x0099
            int r9 = r8.length
            r10 = r2
        L_0x005e:
            if (r10 >= r9) goto L_0x0094
            r0 = r8[r10]
            sd4 r11 = r0.v
            pd4[] r0 = r11.h
            r11.j = r7     // Catch:{ BehindLiveWindowException -> 0x008d }
            r11.k = r4     // Catch:{ BehindLiveWindowException -> 0x008d }
            long r12 = r7.d(r4)     // Catch:{ BehindLiveWindowException -> 0x008d }
            java.util.ArrayList r14 = r11.a()     // Catch:{ BehindLiveWindowException -> 0x008d }
            r15 = r2
        L_0x0073:
            int r2 = r0.length     // Catch:{ BehindLiveWindowException -> 0x008d }
            if (r15 >= r2) goto L_0x0090
            ld5 r2 = r11.i     // Catch:{ BehindLiveWindowException -> 0x008d }
            int r2 = r2.f(r15)     // Catch:{ BehindLiveWindowException -> 0x008d }
            java.lang.Object r2 = r14.get(r2)     // Catch:{ BehindLiveWindowException -> 0x008d }
            w2d r2 = (defpackage.w2d) r2     // Catch:{ BehindLiveWindowException -> 0x008d }
            r5 = r0[r15]     // Catch:{ BehindLiveWindowException -> 0x008d }
            pd4 r2 = r5.a(r12, r2)     // Catch:{ BehindLiveWindowException -> 0x008d }
            r0[r15] = r2     // Catch:{ BehindLiveWindowException -> 0x008d }
            int r15 = r15 + 1
            goto L_0x0073
        L_0x008d:
            r0 = move-exception
            r11.l = r0
        L_0x0090:
            int r10 = r10 + 1
            r2 = 0
            goto L_0x005e
        L_0x0094:
            jt8 r0 = r6.z0
            r0.b(r6)
        L_0x0099:
            fcb r0 = r7.b(r4)
            java.util.List r0 = r0.d
            r6.F0 = r0
            e95[] r0 = r6.B0
            int r2 = r0.length
            r5 = 0
        L_0x00a5:
            if (r5 >= r2) goto L_0x00e2
            r8 = r0[r5]
            java.util.List r9 = r6.F0
            java.util.Iterator r9 = r9.iterator()
        L_0x00af:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00df
            java.lang.Object r10 = r9.next()
            h95 r10 = (defpackage.h95) r10
            java.lang.String r11 = r10.a()
            h95 r12 = r8.v
            java.lang.String r12 = r12.a()
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x00af
            java.util.List r9 = r7.m
            int r9 = r9.size()
            r11 = 1
            int r9 = r9 - r11
            boolean r11 = r7.d
            if (r11 == 0) goto L_0x00db
            if (r4 != r9) goto L_0x00db
            r9 = 1
            goto L_0x00dc
        L_0x00db:
            r9 = 0
        L_0x00dc:
            r8.a(r10, r9)
        L_0x00df:
            int r5 = r5 + 1
            goto L_0x00a5
        L_0x00e2:
            int r3 = r3 + 1
            r2 = 0
            goto L_0x0004
        L_0x00e7:
            x54 r0 = r1.H
            r2 = 0
            fcb r0 = r0.b(r2)
            x54 r2 = r1.H
            java.util.List r2 = r2.m
            int r2 = r2.size()
            r3 = 1
            int r2 = r2 - r3
            x54 r3 = r1.H
            fcb r3 = r3.b(r2)
            x54 r4 = r1.H
            long r4 = r4.d(r2)
            long r6 = r1.L
            long r6 = defpackage.t0g.t(r6)
            long r6 = defpackage.t0g.D(r6)
            x54 r2 = r1.H
            r8 = 0
            long r9 = r2.d(r8)
            long r11 = r0.b
            long r11 = defpackage.t0g.D(r11)
            boolean r2 = p(r0)
            r13 = r11
            r8 = 0
        L_0x0121:
            java.util.List r15 = r0.c
            r16 = r0
            int r0 = r15.size()
            r17 = r2
            if (r8 >= r0) goto L_0x0172
            java.lang.Object r0 = r15.get(r8)
            r9 r0 = (defpackage.r9) r0
            java.util.List r15 = r0.c
            if (r17 == 0) goto L_0x013c
            int r0 = r0.b
            r1 = 3
            if (r0 == r1) goto L_0x0169
        L_0x013c:
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L_0x0143
            goto L_0x0169
        L_0x0143:
            r1 = 0
            java.lang.Object r0 = r15.get(r1)
            w2d r0 = (defpackage.w2d) r0
            p64 r0 = r0.c()
            if (r0 != 0) goto L_0x0151
            goto L_0x0173
        L_0x0151:
            long r1 = r0.E(r9, r6)
            r19 = 0
            int r1 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r1 != 0) goto L_0x015c
            goto L_0x0173
        L_0x015c:
            long r1 = r0.l(r9, r6)
            long r0 = r0.b(r1)
            long r0 = r0 + r11
            long r13 = java.lang.Math.max(r13, r0)
        L_0x0169:
            int r8 = r8 + 1
            r1 = r42
            r0 = r16
            r2 = r17
            goto L_0x0121
        L_0x0172:
            r11 = r13
        L_0x0173:
            long r0 = r3.b
            long r0 = defpackage.t0g.D(r0)
            boolean r2 = p(r3)
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 0
        L_0x0183:
            java.util.List r13 = r3.c
            int r14 = r13.size()
            if (r10 >= r14) goto L_0x01e6
            java.lang.Object r14 = r13.get(r10)
            r9 r14 = (defpackage.r9) r14
            java.util.List r15 = r14.c
            if (r2 == 0) goto L_0x019d
            int r14 = r14.b
            r17 = r2
            r2 = 3
            if (r14 == r2) goto L_0x01a6
            goto L_0x01a0
        L_0x019d:
            r17 = r2
            r2 = 3
        L_0x01a0:
            boolean r14 = r15.isEmpty()
            if (r14 == 0) goto L_0x01a8
        L_0x01a6:
            r15 = r3
            goto L_0x01e0
        L_0x01a8:
            r14 = 0
            java.lang.Object r15 = r15.get(r14)
            w2d r15 = (defpackage.w2d) r15
            p64 r14 = r15.c()
            if (r14 != 0) goto L_0x01b9
            long r0 = r0 + r4
        L_0x01b6:
            r2 = r42
            goto L_0x01e9
        L_0x01b9:
            long r21 = r14.E(r4, r6)
            r18 = 0
            int r15 = (r21 > r18 ? 1 : (r21 == r18 ? 0 : -1))
            if (r15 != 0) goto L_0x01c4
            goto L_0x01b6
        L_0x01c4:
            long r23 = r14.l(r4, r6)
            long r23 = r23 + r21
            r21 = 1
            r15 = r3
            long r2 = r23 - r21
            long r21 = r14.b(r2)
            long r21 = r21 + r0
            long r2 = r14.i(r2, r4)
            long r2 = r2 + r21
            long r2 = java.lang.Math.min(r8, r2)
            r8 = r2
        L_0x01e0:
            int r10 = r10 + 1
            r3 = r15
            r2 = r17
            goto L_0x0183
        L_0x01e6:
            r2 = r42
            r0 = r8
        L_0x01e9:
            x54 r3 = r2.H
            boolean r3 = r3.d
            if (r3 == 0) goto L_0x0217
            r3 = 0
        L_0x01f0:
            int r4 = r13.size()
            if (r3 >= r4) goto L_0x0215
            java.lang.Object r4 = r13.get(r3)
            r9 r4 = (defpackage.r9) r4
            java.util.List r4 = r4.c
            r5 = 0
            java.lang.Object r4 = r4.get(r5)
            w2d r4 = (defpackage.w2d) r4
            p64 r4 = r4.c()
            if (r4 == 0) goto L_0x0217
            boolean r4 = r4.A()
            if (r4 == 0) goto L_0x0212
            goto L_0x0217
        L_0x0212:
            int r3 = r3 + 1
            goto L_0x01f0
        L_0x0215:
            r3 = 1
            goto L_0x0218
        L_0x0217:
            r3 = 0
        L_0x0218:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == 0) goto L_0x0231
            x54 r8 = r2.H
            long r8 = r8.f
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 == 0) goto L_0x0231
            long r8 = defpackage.t0g.D(r8)
            long r8 = r0 - r8
            long r11 = java.lang.Math.max(r11, r8)
        L_0x0231:
            long r31 = r0 - r11
            x54 r0 = r2.H
            boolean r1 = r0.d
            if (r1 == 0) goto L_0x0384
            long r0 = r0.a
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0241
            r0 = 1
            goto L_0x0242
        L_0x0241:
            r0 = 0
        L_0x0242:
            defpackage.y64.j(r0)
            x54 r0 = r2.H
            long r0 = r0.a
            long r0 = defpackage.t0g.D(r0)
            long r6 = r6 - r0
            long r6 = r6 - r11
            long r0 = defpackage.t0g.M(r6)
            gr8 r8 = r2.h
            vq8 r9 = r8.c
            long r9 = r9.c
            int r13 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r13 == 0) goto L_0x0262
            long r9 = java.lang.Math.min(r0, r9)
            goto L_0x0274
        L_0x0262:
            x54 r9 = r2.H
            uq8 r9 = r9.j
            if (r9 == 0) goto L_0x0273
            long r9 = r9.c
            int r13 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r13 == 0) goto L_0x0273
            long r9 = java.lang.Math.min(r0, r9)
            goto L_0x0274
        L_0x0273:
            r9 = r0
        L_0x0274:
            long r13 = r6 - r31
            long r13 = defpackage.t0g.M(r13)
            r17 = 0
            int r15 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r15 >= 0) goto L_0x0286
            int r15 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r15 <= 0) goto L_0x0286
            r13 = 0
        L_0x0286:
            x54 r15 = r2.H
            r17 = r11
            long r11 = r15.c
            int r15 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r15 == 0) goto L_0x0298
            long r13 = r13 + r11
            long r11 = java.lang.Math.min(r13, r0)
            r23 = r11
            goto L_0x029a
        L_0x0298:
            r23 = r13
        L_0x029a:
            vq8 r8 = r8.c
            long r11 = r8.b
            int r13 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r13 == 0) goto L_0x02ad
            r21 = r11
            r25 = r0
            long r23 = defpackage.t0g.k(r21, r23, r25)
        L_0x02aa:
            r36 = r23
            goto L_0x02c2
        L_0x02ad:
            x54 r11 = r2.H
            uq8 r11 = r11.j
            if (r11 == 0) goto L_0x02aa
            long r11 = r11.b
            int r13 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r13 == 0) goto L_0x02aa
            r21 = r11
            r25 = r0
            long r23 = defpackage.t0g.k(r21, r23, r25)
            goto L_0x02aa
        L_0x02c2:
            int r0 = (r36 > r9 ? 1 : (r36 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x02c9
            r38 = r36
            goto L_0x02cb
        L_0x02c9:
            r38 = r9
        L_0x02cb:
            vq8 r0 = r2.E
            long r0 = r0.a
            int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r9 == 0) goto L_0x02d4
            goto L_0x02eb
        L_0x02d4:
            x54 r0 = r2.H
            uq8 r1 = r0.j
            if (r1 == 0) goto L_0x02e2
            long r9 = r1.a
            int r1 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x02e2
            r0 = r9
            goto L_0x02eb
        L_0x02e2:
            long r0 = r0.g
            int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r9 == 0) goto L_0x02e9
            goto L_0x02eb
        L_0x02e9:
            long r0 = r2.p
        L_0x02eb:
            int r9 = (r0 > r36 ? 1 : (r0 == r36 ? 0 : -1))
            if (r9 >= 0) goto L_0x02f1
            r0 = r36
        L_0x02f1:
            int r9 = (r0 > r38 ? 1 : (r0 == r38 ? 0 : -1))
            r10 = 5000000(0x4c4b40, double:2.470328E-317)
            r12 = 2
            if (r9 <= 0) goto L_0x030e
            long r0 = r31 / r12
            long r0 = java.lang.Math.min(r10, r0)
            long r0 = r6 - r0
            long r25 = defpackage.t0g.M(r0)
            r27 = r36
            r29 = r38
            long r0 = defpackage.t0g.k(r25, r27, r29)
        L_0x030e:
            r34 = r0
            float r0 = r8.o
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r9 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r9 == 0) goto L_0x031a
            goto L_0x0324
        L_0x031a:
            x54 r0 = r2.H
            uq8 r0 = r0.j
            if (r0 == 0) goto L_0x0323
            float r0 = r0.d
            goto L_0x0324
        L_0x0323:
            r0 = r1
        L_0x0324:
            float r8 = r8.v
            int r9 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r9 == 0) goto L_0x032b
            goto L_0x0335
        L_0x032b:
            x54 r8 = r2.H
            uq8 r8 = r8.j
            if (r8 == 0) goto L_0x0334
            float r8 = r8.e
            goto L_0x0335
        L_0x0334:
            r8 = r1
        L_0x0335:
            int r9 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r9 != 0) goto L_0x0350
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0350
            x54 r1 = r2.H
            uq8 r1 = r1.j
            if (r1 == 0) goto L_0x0349
            long r14 = r1.a
            int r1 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0350
        L_0x0349:
            r0 = 1065353216(0x3f800000, float:1.0)
            r40 = r0
            r41 = r40
            goto L_0x0354
        L_0x0350:
            r40 = r0
            r41 = r8
        L_0x0354:
            vq8 r0 = new vq8
            r33 = r0
            r33.<init>(r34, r36, r38, r40, r41)
            r2.E = r0
            x54 r0 = r2.H
            long r0 = r0.a
            long r8 = defpackage.t0g.M(r17)
            long r8 = r8 + r0
            vq8 r0 = r2.E
            long r0 = r0.a
            long r0 = defpackage.t0g.D(r0)
            long r0 = r6 - r0
            long r6 = r31 / r12
            long r6 = java.lang.Math.min(r10, r6)
            int r10 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r10 >= 0) goto L_0x0381
            r33 = r6
        L_0x037c:
            r24 = r8
            r0 = r16
            goto L_0x038c
        L_0x0381:
            r33 = r0
            goto L_0x037c
        L_0x0384:
            r17 = r11
            r24 = r4
            r0 = r16
            r33 = 0
        L_0x038c:
            long r0 = r0.b
            long r0 = defpackage.t0g.D(r0)
            long r29 = r17 - r0
            j64 r0 = new j64
            x54 r1 = r2.H
            long r6 = r1.a
            long r8 = r2.L
            int r10 = r2.O
            boolean r11 = r1.d
            if (r11 == 0) goto L_0x03a7
            vq8 r11 = r2.E
        L_0x03a4:
            r37 = r11
            goto L_0x03a9
        L_0x03a7:
            r11 = 0
            goto L_0x03a4
        L_0x03a9:
            gr8 r11 = r2.h
            r36 = r11
            r21 = r0
            r22 = r6
            r26 = r8
            r28 = r10
            r35 = r1
            r21.<init>(r22, r24, r26, r28, r29, r31, r33, r35, r36, r37)
            r2.j(r0)
            boolean r0 = r2.i
            if (r0 != 0) goto L_0x048b
            android.os.Handler r0 = r2.D
            h64 r1 = r2.w
            r0.removeCallbacks(r1)
            r6 = 5000(0x1388, double:2.4703E-320)
            if (r3 == 0) goto L_0x0453
            android.os.Handler r0 = r2.D
            x54 r3 = r2.H
            long r8 = r2.L
            long r8 = defpackage.t0g.t(r8)
            java.util.List r10 = r3.m
            int r10 = r10.size()
            r11 = 1
            int r10 = r10 - r11
            fcb r11 = r3.b(r10)
            long r12 = r11.b
            long r12 = defpackage.t0g.D(r12)
            long r14 = r3.d(r10)
            long r8 = defpackage.t0g.D(r8)
            long r4 = r3.a
            long r3 = defpackage.t0g.D(r4)
            long r17 = defpackage.t0g.D(r6)
            r6 = r17
            r5 = 0
        L_0x03fd:
            java.util.List r10 = r11.c
            r21 = r11
            int r11 = r10.size()
            if (r5 >= r11) goto L_0x0448
            java.lang.Object r10 = r10.get(r5)
            r9 r10 = (defpackage.r9) r10
            java.util.List r10 = r10.c
            boolean r11 = r10.isEmpty()
            if (r11 == 0) goto L_0x0417
            r11 = 0
            goto L_0x0443
        L_0x0417:
            r11 = 0
            java.lang.Object r10 = r10.get(r11)
            w2d r10 = (defpackage.w2d) r10
            p64 r10 = r10.c()
            if (r10 == 0) goto L_0x0443
            long r22 = r3 + r12
            long r24 = r10.n(r14, r8)
            long r24 = r24 + r22
            long r24 = r24 - r8
            r22 = 100000(0x186a0, double:4.94066E-319)
            long r26 = r6 - r22
            int r10 = (r24 > r26 ? 1 : (r24 == r26 ? 0 : -1))
            if (r10 < 0) goto L_0x0441
            int r10 = (r24 > r6 ? 1 : (r24 == r6 ? 0 : -1))
            if (r10 <= 0) goto L_0x0443
            long r22 = r6 + r22
            int r10 = (r24 > r22 ? 1 : (r24 == r22 ? 0 : -1))
            if (r10 >= 0) goto L_0x0443
        L_0x0441:
            r6 = r24
        L_0x0443:
            int r5 = r5 + 1
            r11 = r21
            goto L_0x03fd
        L_0x0448:
            r3 = 1000(0x3e8, double:4.94E-321)
            java.math.RoundingMode r5 = java.math.RoundingMode.CEILING
            long r3 = defpackage.hi7.k(r6, r3, r5)
            r0.postDelayed(r1, r3)
        L_0x0453:
            boolean r0 = r2.I
            if (r0 == 0) goto L_0x045b
            r42.t()
            goto L_0x048b
        L_0x045b:
            if (r43 == 0) goto L_0x048b
            x54 r0 = r2.H
            boolean r1 = r0.d
            if (r1 == 0) goto L_0x048b
            long r0 = r0.e
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x048b
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0477
            r6 = 5000(0x1388, double:2.4703E-320)
            goto L_0x0478
        L_0x0477:
            r6 = r0
        L_0x0478:
            long r0 = r2.J
            long r0 = r0 + r6
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r5
            long r0 = java.lang.Math.max(r3, r0)
            android.os.Handler r3 = r2.D
            h64 r2 = r2.v
            r3.postDelayed(r2, r0)
        L_0x048b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n64.s(boolean):void");
    }

    public final void t() {
        Uri uri;
        this.D.removeCallbacks(this.v);
        if (!this.A.L()) {
            if (this.A.M()) {
                this.I = true;
                return;
            }
            synchronized (this.t) {
                uri = this.F;
            }
            this.I = false;
            p8b p8b = new p8b(this.z, uri, 4, this.r);
            er7 er7 = this.s;
            this.n.getClass();
            this.q.k(new k28(p8b.a, p8b.b, this.A.P(p8b, er7, 3)), p8b.c, -1, (ca6) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
        }
    }
}
