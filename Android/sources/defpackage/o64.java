package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.media3.exoplayer.dash.DashManifestStaleException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* renamed from: o64  reason: default package */
public final class o64 extends yj0 {
    public l15 A;
    public brf B;
    public DashManifestStaleException C;
    public Handler D;
    public wq8 E;
    public Uri F;
    public final Uri G;
    public y54 H = null;
    public boolean I;
    public long J;
    public long K;
    public long L;
    public int M;
    public long N;
    public int O;
    public ir8 P;
    public final boolean h;
    public final g74 i;
    public final cs j;
    public final p9a k;
    public final pw4 l;
    public final nfd m;
    public final qpg n;
    public final long o;
    public final long p;
    public final cs q;
    public final o8b r;
    public final wie s;
    public final Object t;
    public final SparseArray u;
    public final i64 v;
    public final i64 w;
    public final rt6 x;
    public final y28 y;
    public j74 z;

    static {
        cs8.a("media3.exoplayer.dash");
    }

    public o64(ir8 ir8, g74 g74, o8b o8b, cs csVar, p9a p9a, pw4 pw4, nfd nfd, long j2, long j3) {
        this.P = ir8;
        this.E = ir8.c;
        xq8 xq8 = ir8.b;
        xq8.getClass();
        Uri uri = xq8.a;
        this.F = uri;
        this.G = uri;
        this.i = g74;
        this.r = o8b;
        this.j = csVar;
        this.l = pw4;
        this.m = nfd;
        this.o = j2;
        this.p = j3;
        this.k = p9a;
        this.n = new qpg(2);
        this.h = false;
        this.q = b((nz8) null);
        this.t = new Object();
        this.u = new SparseArray();
        this.x = new rt6(15, (Object) this);
        this.N = -9223372036854775807L;
        this.L = -9223372036854775807L;
        this.s = new wie(15, (Object) this);
        this.y = new grg(14, this);
        this.v = new i64(this, 0);
        this.w = new i64(this, 1);
    }

    public static boolean u(gcb gcb) {
        int i2 = 0;
        while (true) {
            List list = gcb.c;
            if (i2 >= list.size()) {
                return false;
            }
            int i3 = ((s9) list.get(i2)).b;
            if (i3 == 1 || i3 == 2) {
                return true;
            }
            i2++;
        }
        return true;
    }

    public final boolean a(ir8 ir8) {
        ir8 i2 = i();
        xq8 xq8 = i2.b;
        xq8.getClass();
        xq8 xq82 = ir8.b;
        return xq82 != null && xq82.a.equals(xq8.a) && xq82.e.equals(xq8.e) && v0g.a(xq82.c, xq8.c) && i2.c.equals(ir8.c);
    }

    public final mt8 c(nz8 nz8, cb4 cb4, long j2) {
        nz8 nz82 = nz8;
        int intValue = ((Integer) nz82.a).intValue() - this.O;
        cs b = b(nz8);
        gw4 gw4 = new gw4(this.d.c, 0, nz82);
        int i2 = this.O + intValue;
        y54 y54 = this.H;
        brf brf = this.B;
        long j3 = this.L;
        mpb mpb = this.g;
        n79.o(mpb);
        p9a p9a = this.k;
        rt6 rt6 = this.x;
        long j4 = j3;
        g64 g64 = new g64(i2, y54, this.n, intValue, this.j, brf, this.l, gw4, this.m, b, j4, this.y, cb4, p9a, rt6, mpb);
        this.u.put(i2, g64);
        return g64;
    }

    public final synchronized ir8 i() {
        return this.P;
    }

    public final void k() {
        this.y.b();
    }

    public final void m(brf brf) {
        this.B = brf;
        Looper myLooper = Looper.myLooper();
        mpb mpb = this.g;
        n79.o(mpb);
        pw4 pw4 = this.l;
        pw4.c(myLooper, mpb);
        pw4.prepare();
        if (this.h) {
            y(false);
            return;
        }
        this.z = this.i.a();
        this.A = new l15("DashMediaSource");
        this.D = v0g.o((Handler.Callback) null);
        z();
    }

    public final void o(mt8 mt8) {
        g64 g64 = (g64) mt8;
        hpb hpb = g64.v0;
        hpb.w = true;
        hpb.b.removeCallbacksAndMessages((Object) null);
        for (w03 u2 : g64.A0) {
            u2.u(g64);
        }
        g64.z0 = null;
        this.u.remove(g64.a);
    }

    public final void q() {
        this.I = false;
        this.z = null;
        l15 l15 = this.A;
        if (l15 != null) {
            l15.D((v28) null);
            this.A = null;
        }
        this.J = 0;
        this.K = 0;
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
        this.u.clear();
        qpg qpg = this.n;
        ((HashMap) qpg.a).clear();
        ((HashMap) qpg.b).clear();
        ((HashMap) qpg.c).clear();
        this.l.release();
    }

    public final synchronized void t(ir8 ir8) {
        this.P = ir8;
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Object, t28] */
    public final void v() {
        boolean z2;
        l15 l15 = this.A;
        y35 y35 = new y35(15, (Object) this);
        synchronized (fqc.d) {
            z2 = fqc.e;
        }
        if (z2) {
            y35.q();
            return;
        }
        if (l15 == null) {
            l15 = new l15("SntpClient");
        }
        l15.F(new Object(), new syc(4, y35), 1);
    }

    public final void w(q8b q8b, long j2, long j3) {
        q8b q8b2 = q8b;
        long j4 = q8b2.a;
        tne tne = q8b2.o;
        Uri uri = tne.c;
        l28 l28 = new l28(j3, tne.o);
        this.m.getClass();
        this.q.v(l28, q8b2.c, -1, (ea6) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void x(IOException iOException) {
        i8b.p("Failed to resolve time offset.", iOException);
        this.L = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        y(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02f1, code lost:
        if (r10 != -9223372036854775807L) goto L_0x02fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x035d, code lost:
        if (r12.a == -9223372036854775807L) goto L_0x035f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01c5, code lost:
        r2 = r40;
     */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x03a3  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x01c4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void y(boolean r41) {
        /*
            r40 = this;
            r1 = r40
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
            g64 r6 = (defpackage.g64) r6
            y54 r7 = r1.H
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
            y54 r11 = (defpackage.y54) r11
            long r11 = r11.h
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L_0x0034
            r8.remove()
            goto L_0x0034
        L_0x0058:
            w03[] r8 = r6.A0
            if (r8 == 0) goto L_0x0099
            int r9 = r8.length
            r10 = r2
        L_0x005e:
            if (r10 >= r9) goto L_0x0094
            r0 = r8[r10]
            td4 r11 = r0.v
            pd4[] r0 = r11.i
            r11.k = r7     // Catch:{ BehindLiveWindowException -> 0x008d }
            r11.l = r4     // Catch:{ BehindLiveWindowException -> 0x008d }
            long r12 = r7.d(r4)     // Catch:{ BehindLiveWindowException -> 0x008d }
            java.util.ArrayList r14 = r11.a()     // Catch:{ BehindLiveWindowException -> 0x008d }
            r15 = r2
        L_0x0073:
            int r2 = r0.length     // Catch:{ BehindLiveWindowException -> 0x008d }
            if (r15 >= r2) goto L_0x0090
            md5 r2 = r11.j     // Catch:{ BehindLiveWindowException -> 0x008d }
            int r2 = r2.f(r15)     // Catch:{ BehindLiveWindowException -> 0x008d }
            java.lang.Object r2 = r14.get(r2)     // Catch:{ BehindLiveWindowException -> 0x008d }
            x2d r2 = (defpackage.x2d) r2     // Catch:{ BehindLiveWindowException -> 0x008d }
            r5 = r0[r15]     // Catch:{ BehindLiveWindowException -> 0x008d }
            pd4 r2 = r5.b(r12, r2)     // Catch:{ BehindLiveWindowException -> 0x008d }
            r0[r15] = r2     // Catch:{ BehindLiveWindowException -> 0x008d }
            int r15 = r15 + 1
            goto L_0x0073
        L_0x008d:
            r0 = move-exception
            r11.m = r0
        L_0x0090:
            int r10 = r10 + 1
            r2 = 0
            goto L_0x005e
        L_0x0094:
            kt8 r0 = r6.z0
            r0.c(r6)
        L_0x0099:
            gcb r0 = r7.b(r4)
            java.util.List r0 = r0.d
            r6.F0 = r0
            f95[] r0 = r6.B0
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
            i95 r10 = (defpackage.i95) r10
            java.lang.String r11 = r10.a()
            i95 r12 = r8.v
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
            y54 r0 = r1.H
            r2 = 0
            gcb r0 = r0.b(r2)
            y54 r2 = r1.H
            java.util.List r2 = r2.m
            int r2 = r2.size()
            r3 = 1
            int r2 = r2 - r3
            y54 r3 = r1.H
            gcb r3 = r3.b(r2)
            y54 r4 = r1.H
            long r4 = r4.d(r2)
            long r6 = r1.L
            long r6 = defpackage.v0g.B(r6)
            long r6 = defpackage.v0g.S(r6)
            y54 r2 = r1.H
            r8 = 0
            long r9 = r2.d(r8)
            long r11 = r0.b
            long r11 = defpackage.v0g.S(r11)
            boolean r2 = u(r0)
            r13 = r11
            r8 = 0
        L_0x0121:
            java.util.List r15 = r0.c
            r17 = r0
            int r0 = r15.size()
            r18 = r2
            if (r8 >= r0) goto L_0x017a
            java.lang.Object r0 = r15.get(r8)
            s9 r0 = (defpackage.s9) r0
            java.util.List r15 = r0.c
            int r0 = r0.b
            r1 = 1
            if (r0 == r1) goto L_0x013f
            r1 = 2
            if (r0 == r1) goto L_0x013f
            r0 = 1
            goto L_0x0140
        L_0x013f:
            r0 = 0
        L_0x0140:
            if (r18 == 0) goto L_0x0144
            if (r0 != 0) goto L_0x0171
        L_0x0144:
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L_0x014b
            goto L_0x0171
        L_0x014b:
            r1 = 0
            java.lang.Object r0 = r15.get(r1)
            x2d r0 = (defpackage.x2d) r0
            q64 r0 = r0.c()
            if (r0 != 0) goto L_0x0159
            goto L_0x017b
        L_0x0159:
            long r1 = r0.E(r9, r6)
            r20 = 0
            int r1 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r1 != 0) goto L_0x0164
            goto L_0x017b
        L_0x0164:
            long r1 = r0.l(r9, r6)
            long r0 = r0.b(r1)
            long r0 = r0 + r11
            long r13 = java.lang.Math.max(r13, r0)
        L_0x0171:
            int r8 = r8 + 1
            r1 = r40
            r0 = r17
            r2 = r18
            goto L_0x0121
        L_0x017a:
            r11 = r13
        L_0x017b:
            long r0 = r3.b
            long r0 = defpackage.v0g.S(r0)
            boolean r2 = u(r3)
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 0
        L_0x018b:
            java.util.List r13 = r3.c
            int r14 = r13.size()
            if (r10 >= r14) goto L_0x01fc
            java.lang.Object r14 = r13.get(r10)
            s9 r14 = (defpackage.s9) r14
            java.util.List r15 = r14.c
            int r14 = r14.b
            r18 = r3
            r3 = 1
            if (r14 == r3) goto L_0x01a7
            r3 = 2
            if (r14 == r3) goto L_0x01a8
            r14 = 1
            goto L_0x01a9
        L_0x01a7:
            r3 = 2
        L_0x01a8:
            r14 = 0
        L_0x01a9:
            if (r2 == 0) goto L_0x01ad
            if (r14 != 0) goto L_0x01b3
        L_0x01ad:
            boolean r14 = r15.isEmpty()
            if (r14 == 0) goto L_0x01b7
        L_0x01b3:
            r24 = r0
            r0 = r4
            goto L_0x01f4
        L_0x01b7:
            r14 = 0
            java.lang.Object r15 = r15.get(r14)
            x2d r15 = (defpackage.x2d) r15
            q64 r14 = r15.c()
            if (r14 != 0) goto L_0x01c8
            long r0 = r0 + r4
        L_0x01c5:
            r2 = r40
            goto L_0x01ff
        L_0x01c8:
            long r22 = r14.E(r4, r6)
            r19 = 0
            int r15 = (r22 > r19 ? 1 : (r22 == r19 ? 0 : -1))
            if (r15 != 0) goto L_0x01d3
            goto L_0x01c5
        L_0x01d3:
            long r24 = r14.l(r4, r6)
            long r24 = r24 + r22
            r22 = 1
            r26 = r4
            long r3 = r24 - r22
            long r22 = r14.b(r3)
            long r22 = r22 + r0
            r24 = r0
            r0 = r26
            long r3 = r14.i(r3, r0)
            long r3 = r3 + r22
            long r3 = java.lang.Math.min(r8, r3)
            r8 = r3
        L_0x01f4:
            int r10 = r10 + 1
            r4 = r0
            r3 = r18
            r0 = r24
            goto L_0x018b
        L_0x01fc:
            r2 = r40
            r0 = r8
        L_0x01ff:
            y54 r3 = r2.H
            boolean r3 = r3.d
            if (r3 == 0) goto L_0x022d
            r3 = 0
        L_0x0206:
            int r4 = r13.size()
            if (r3 >= r4) goto L_0x022b
            java.lang.Object r4 = r13.get(r3)
            s9 r4 = (defpackage.s9) r4
            java.util.List r4 = r4.c
            r5 = 0
            java.lang.Object r4 = r4.get(r5)
            x2d r4 = (defpackage.x2d) r4
            q64 r4 = r4.c()
            if (r4 == 0) goto L_0x022d
            boolean r4 = r4.A()
            if (r4 == 0) goto L_0x0228
            goto L_0x022d
        L_0x0228:
            int r3 = r3 + 1
            goto L_0x0206
        L_0x022b:
            r3 = 1
            goto L_0x022e
        L_0x022d:
            r3 = 0
        L_0x022e:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == 0) goto L_0x0247
            y54 r8 = r2.H
            long r8 = r8.f
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 == 0) goto L_0x0247
            long r8 = defpackage.v0g.S(r8)
            long r8 = r0 - r8
            long r11 = java.lang.Math.max(r11, r8)
        L_0x0247:
            long r32 = r0 - r11
            y54 r0 = r2.H
            boolean r1 = r0.d
            if (r1 == 0) goto L_0x03a6
            long r0 = r0.a
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0257
            r0 = 1
            goto L_0x0258
        L_0x0257:
            r0 = 0
        L_0x0258:
            defpackage.n79.n(r0)
            y54 r0 = r2.H
            long r0 = r0.a
            long r0 = defpackage.v0g.S(r0)
            long r6 = r6 - r0
            long r6 = r6 - r11
            ir8 r0 = r40.i()
            wq8 r0 = r0.c
            long r8 = defpackage.v0g.h0(r6)
            long r13 = r0.c
            int r1 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x027a
            long r13 = java.lang.Math.min(r8, r13)
            goto L_0x028c
        L_0x027a:
            y54 r1 = r2.H
            uq8 r1 = r1.j
            if (r1 == 0) goto L_0x028b
            long r13 = r1.c
            int r1 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x028b
            long r13 = java.lang.Math.min(r8, r13)
            goto L_0x028c
        L_0x028b:
            r13 = r8
        L_0x028c:
            long r18 = r6 - r32
            long r18 = defpackage.v0g.h0(r18)
            r20 = 0
            int r1 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r1 >= 0) goto L_0x029e
            int r1 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            if (r1 <= 0) goto L_0x029e
            r18 = 0
        L_0x029e:
            y54 r1 = r2.H
            r28 = r11
            long r10 = r1.c
            int r1 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x02b1
            long r10 = r18 + r10
            long r10 = java.lang.Math.min(r10, r8)
            r24 = r10
            goto L_0x02b3
        L_0x02b1:
            r24 = r18
        L_0x02b3:
            long r10 = r0.b
            int r1 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x02c4
            r22 = r10
            r26 = r8
            long r24 = defpackage.v0g.k(r22, r24, r26)
        L_0x02c1:
            r8 = r24
            goto L_0x02d9
        L_0x02c4:
            y54 r1 = r2.H
            uq8 r1 = r1.j
            if (r1 == 0) goto L_0x02c1
            long r10 = r1.b
            int r1 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x02c1
            r22 = r10
            r26 = r8
            long r24 = defpackage.v0g.k(r22, r24, r26)
            goto L_0x02c1
        L_0x02d9:
            int r1 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x02de
            r13 = r8
        L_0x02de:
            wq8 r1 = r2.E
            long r10 = r1.a
            int r1 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x02e7
            goto L_0x02fd
        L_0x02e7:
            y54 r1 = r2.H
            uq8 r10 = r1.j
            if (r10 == 0) goto L_0x02f4
            long r10 = r10.a
            int r12 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r12 == 0) goto L_0x02f4
            goto L_0x02fd
        L_0x02f4:
            long r10 = r1.g
            int r1 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x02fb
            goto L_0x02fd
        L_0x02fb:
            long r10 = r2.o
        L_0x02fd:
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x0302
            r10 = r8
        L_0x0302:
            int r1 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            long r4 = r2.p
            r22 = 2
            if (r1 <= 0) goto L_0x031e
            long r10 = r32 / r22
            long r10 = java.lang.Math.min(r4, r10)
            long r10 = r6 - r10
            long r34 = defpackage.v0g.h0(r10)
            r36 = r8
            r38 = r13
            long r10 = defpackage.v0g.k(r34, r36, r38)
        L_0x031e:
            float r1 = r0.d
            r12 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r15 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r15 == 0) goto L_0x0328
            goto L_0x0332
        L_0x0328:
            y54 r1 = r2.H
            uq8 r1 = r1.j
            if (r1 == 0) goto L_0x0331
            float r1 = r1.d
            goto L_0x0332
        L_0x0331:
            r1 = r12
        L_0x0332:
            float r0 = r0.e
            int r15 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r15 == 0) goto L_0x0339
            goto L_0x0343
        L_0x0339:
            y54 r0 = r2.H
            uq8 r0 = r0.j
            if (r0 == 0) goto L_0x0342
            float r0 = r0.e
            goto L_0x0343
        L_0x0342:
            r0 = r12
        L_0x0343:
            int r15 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r15 != 0) goto L_0x0363
            int r12 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r12 != 0) goto L_0x0363
            y54 r12 = r2.H
            uq8 r12 = r12.j
            if (r12 == 0) goto L_0x035f
            r24 = r0
            r15 = r1
            long r0 = r12.a
            r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r0 != 0) goto L_0x0366
        L_0x035f:
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = r1
            goto L_0x0369
        L_0x0363:
            r24 = r0
            r15 = r1
        L_0x0366:
            r1 = r15
            r0 = r24
        L_0x0369:
            uq8 r12 = new uq8
            r12.<init>()
            r12.a = r10
            r12.b = r8
            r12.c = r13
            r12.d = r1
            r12.e = r0
            wq8 r0 = new wq8
            r0.<init>(r12)
            r2.E = r0
            y54 r0 = r2.H
            long r0 = r0.a
            long r8 = defpackage.v0g.h0(r28)
            long r8 = r8 + r0
            wq8 r0 = r2.E
            long r0 = r0.a
            long r0 = defpackage.v0g.S(r0)
            long r0 = r6 - r0
            long r6 = r32 / r22
            long r4 = java.lang.Math.min(r4, r6)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x03a3
            r34 = r4
        L_0x039e:
            r25 = r8
            r0 = r17
            goto L_0x03b1
        L_0x03a3:
            r34 = r0
            goto L_0x039e
        L_0x03a6:
            r28 = r11
            r0 = r17
            r25 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r34 = 0
        L_0x03b1:
            long r0 = r0.b
            long r0 = defpackage.v0g.S(r0)
            long r30 = r28 - r0
            k64 r0 = new k64
            y54 r1 = r2.H
            long r4 = r1.a
            long r6 = r2.L
            int r8 = r2.O
            ir8 r37 = r40.i()
            y54 r9 = r2.H
            boolean r9 = r9.d
            if (r9 == 0) goto L_0x03d2
            wq8 r9 = r2.E
        L_0x03cf:
            r38 = r9
            goto L_0x03d4
        L_0x03d2:
            r9 = 0
            goto L_0x03cf
        L_0x03d4:
            r22 = r0
            r23 = r4
            r27 = r6
            r29 = r8
            r36 = r1
            r22.<init>(r23, r25, r27, r29, r30, r32, r34, r36, r37, r38)
            r2.n(r0)
            boolean r0 = r2.h
            if (r0 != 0) goto L_0x04b0
            android.os.Handler r0 = r2.D
            i64 r1 = r2.w
            r0.removeCallbacks(r1)
            r4 = 5000(0x1388, double:2.4703E-320)
            if (r3 == 0) goto L_0x047a
            android.os.Handler r0 = r2.D
            y54 r3 = r2.H
            long r6 = r2.L
            long r6 = defpackage.v0g.B(r6)
            java.util.List r8 = r3.m
            int r8 = r8.size()
            r9 = 1
            int r8 = r8 - r9
            gcb r9 = r3.b(r8)
            long r10 = r9.b
            long r10 = defpackage.v0g.S(r10)
            long r12 = r3.d(r8)
            long r6 = defpackage.v0g.S(r6)
            long r14 = r3.a
            long r14 = defpackage.v0g.S(r14)
            long r16 = defpackage.v0g.S(r4)
            r4 = r16
            r3 = 0
        L_0x0424:
            java.util.List r8 = r9.c
            r22 = r9
            int r9 = r8.size()
            if (r3 >= r9) goto L_0x046f
            java.lang.Object r8 = r8.get(r3)
            s9 r8 = (defpackage.s9) r8
            java.util.List r8 = r8.c
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L_0x043e
            r9 = 0
            goto L_0x046a
        L_0x043e:
            r9 = 0
            java.lang.Object r8 = r8.get(r9)
            x2d r8 = (defpackage.x2d) r8
            q64 r8 = r8.c()
            if (r8 == 0) goto L_0x046a
            long r23 = r14 + r10
            long r25 = r8.n(r12, r6)
            long r25 = r25 + r23
            long r25 = r25 - r6
            r23 = 100000(0x186a0, double:4.94066E-319)
            long r27 = r4 - r23
            int r8 = (r25 > r27 ? 1 : (r25 == r27 ? 0 : -1))
            if (r8 < 0) goto L_0x0468
            int r8 = (r25 > r4 ? 1 : (r25 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x046a
            long r23 = r4 + r23
            int r8 = (r25 > r23 ? 1 : (r25 == r23 ? 0 : -1))
            if (r8 >= 0) goto L_0x046a
        L_0x0468:
            r4 = r25
        L_0x046a:
            int r3 = r3 + 1
            r9 = r22
            goto L_0x0424
        L_0x046f:
            r6 = 1000(0x3e8, double:4.94E-321)
            java.math.RoundingMode r3 = java.math.RoundingMode.CEILING
            long r3 = defpackage.hi7.k(r4, r6, r3)
            r0.postDelayed(r1, r3)
        L_0x047a:
            boolean r0 = r2.I
            if (r0 == 0) goto L_0x0482
            r40.z()
            goto L_0x04b0
        L_0x0482:
            if (r41 == 0) goto L_0x04b0
            y54 r0 = r2.H
            boolean r1 = r0.d
            if (r1 == 0) goto L_0x04b0
            long r0 = r0.e
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x04b0
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x049d
            r0 = 5000(0x1388, double:2.4703E-320)
        L_0x049d:
            long r5 = r2.J
            long r5 = r5 + r0
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r5 = r5 - r0
            long r0 = java.lang.Math.max(r3, r5)
            android.os.Handler r3 = r2.D
            i64 r2 = r2.v
            r3.postDelayed(r2, r0)
        L_0x04b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o64.y(boolean):void");
    }

    public final void z() {
        Uri uri;
        this.D.removeCallbacks(this.v);
        if (!this.A.s()) {
            if (this.A.z()) {
                this.I = true;
                return;
            }
            synchronized (this.t) {
                uri = this.F;
            }
            this.I = false;
            q8b q8b = new q8b(this.z, uri, 4, this.r);
            wie wie = this.s;
            this.m.getClass();
            this.q.C(new l28(q8b.a, q8b.b, this.A.F(q8b, wie, 3)), q8b.c, -1, (ea6) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
        }
    }
}
