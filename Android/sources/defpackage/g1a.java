package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import ru.ok.messages.location.FrgLocationMap;

/* renamed from: g1a  reason: default package */
public final class g1a extends w1 implements c68, c18 {
    public w58 A0;
    public s58 B0;
    public pf8 C0;
    public boolean D0;
    public final dac E0;
    public final dac F0;
    public or7 G0;
    public final ao1 H0;
    public oh8 I0;
    public final String X;
    public final pf8 Y;
    public final km3 Z;
    public final ConcurrentHashMap b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final kc3 o;
    public final g68 v;
    public final eud v0;
    public final taf w;
    public final fn4 w0;
    public final d18 x;
    public final jbf x0;
    public final long y;
    public final jtb y0;
    public final long z;
    public final FrgLocationMap z0;

    /* JADX WARNING: type inference failed for: r11v1, types: [java.lang.Object, kc3] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g1a(defpackage.w58 r17, defpackage.qd8 r18, defpackage.s58 r19, boolean r20, defpackage.f3a r21, defpackage.g68 r22, defpackage.taf r23, defpackage.d18 r24, long r25, long r27, java.lang.String r29, defpackage.pf8 r30, ru.ok.messages.location.FrgLocationMap r31, defpackage.km3 r32, defpackage.eud r33, defpackage.fn4 r34, defpackage.jbf r35, defpackage.jtb r36) {
        /*
            r16 = this;
            r0 = r16
            r1 = r21
            r2 = r24
            r3 = r25
            r5 = r27
            r7 = r29
            r8 = r30
            r9 = r35
            r0.<init>(r1)
            java.util.concurrent.ConcurrentHashMap r10 = new java.util.concurrent.ConcurrentHashMap
            r10.<init>()
            r0.b = r10
            java.util.concurrent.ConcurrentHashMap r11 = new java.util.concurrent.ConcurrentHashMap
            r11.<init>()
            r0.c = r11
            kc3 r11 = new kc3
            r11.<init>()
            r0.o = r11
            r12 = r17
            r0.A0 = r12
            r12 = r19
            r0.B0 = r12
            r12 = r20
            r0.D0 = r12
            r12 = r22
            r0.v = r12
            r12 = r23
            r0.w = r12
            r0.x = r2
            r0.y = r3
            r0.z = r5
            r0.X = r7
            r0.Y = r8
            r0.x0 = r9
            of8 r12 = new of8
            s58 r13 = defpackage.s58.x
            r12.<init>(r13)
            r13 = 1
            r12.i = r13
            pf8 r14 = new pf8
            r14.<init>(r12)
            r0.C0 = r14
            r12 = r31
            r0.z0 = r12
            r12 = r32
            r0.Z = r12
            r12 = r33
            r0.v0 = r12
            r12 = r34
            r0.w0 = r12
            r12 = r36
            r0.y0 = r12
            w58 r12 = r0.A0
            boolean r12 = r12.a
            zj0 r14 = new zj0
            r15 = 17
            r14.<init>(r15)
            r0.Y(r14)
            if (r8 == 0) goto L_0x0086
            long r14 = r8.c
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            r10.put(r14, r8)
        L_0x0086:
            w58 r8 = r0.A0
            int r8 = r8.d
            r14 = 3
            if (r8 != r14) goto L_0x00ad
            r14 = 0
            java.lang.Long r8 = java.lang.Long.valueOf(r14)
            s58 r14 = r0.B0
            of8 r15 = new of8
            r15.<init>(r14)
            r15.b = r3
            r15.h = r13
            r15.e = r7
            tf8 r7 = defpackage.tf8.c
            r15.d = r7
            r15.k = r13
            pf8 r7 = r15.a()
            r10.put(r8, r7)
        L_0x00ad:
            r1.R(r0)
            r7 = r18
            r1.L0 = r7
            ru.ok.messages.location.TamSupportMapFragment r7 = r1.z0
            r8 = 1117782016(0x42a00000, float:80.0)
            defpackage.ro4.a(r8)
            r7.getClass()
            ee8 r8 = new ee8
            ae8 r10 = r1.x
            lfd r14 = r1.v0
            r15 = 1
            r8.<init>(r10, r14, r1, r15)
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Looper r10 = android.os.Looper.myLooper()
            if (r1 != r10) goto L_0x01c9
            myg r1 = r7.l1
            java.lang.Object r7 = r1.a
            wu7 r7 = (defpackage.wu7) r7
            if (r7 == 0) goto L_0x00e0
            lyg r7 = (defpackage.lyg) r7
            r7.a(r8)
            goto L_0x00e5
        L_0x00e0:
            java.util.ArrayList r1 = r1.y
            r1.add(r8)
        L_0x00e5:
            r1 = 0
            r0.e0(r1)
            r16.Z()
            r16.c0()
            dac r1 = new dac
            r1.<init>()
            r0.F0 = r1
            r7 = r9
            kbf r7 = (defpackage.kbf) r7
            lfd r8 = r7.a()
            lja r1 = r1.s(r8)
            q0a r8 = new q0a
            r9 = 11
            r8.<init>((int) r9)
            mha r9 = new mha
            r10 = 1
            r9.<init>(r1, r8, r10)
            c1a r1 = new c1a
            r8 = 0
            r1.<init>(r0, r8)
            yia r8 = new yia
            r10 = 3
            r8.<init>(r9, r1, r10)
            lfd r1 = defpackage.qe.a()
            lja r1 = r8.s(r1)
            c1a r8 = new c1a
            r9 = 1
            r8.<init>(r0, r9)
            q0a r9 = new q0a
            r10 = 5
            r9.<init>((int) r10)
            dj6 r10 = defpackage.m58.e
            or7 r14 = new or7
            r14.<init>(r8, r9, r10)
            r1.a(r14)
            r11.a(r14)
            w58 r1 = r0.A0
            int r1 = r1.c
            if (r1 != r13) goto L_0x0172
            dac r1 = new dac
            r1.<init>()
            r0.E0 = r1
            c1a r8 = new c1a
            r9 = 2
            r8.<init>(r0, r9)
            q0a r9 = new q0a
            r13 = 6
            r9.<init>((int) r13)
            or7 r13 = new or7
            r13.<init>(r8, r9, r10)
            r1.a(r13)
            r11.a(r13)
            dac r1 = r0.E0
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r1.d(r8)
            r1 = r2
            j18 r1 = (defpackage.j18) r1
            r1.i(r0, r5)
            r1.k(r5)
            r16.G0()
        L_0x0172:
            if (r12 == 0) goto L_0x01c8
            r1 = r2
            j18 r1 = (defpackage.j18) r1
            jtb r2 = r1.X
            ltb r2 = (defpackage.ltb) r2
            a33 r2 = r2.a
            long r8 = r2.m()
            cc2 r1 = r1.z
            r17 = r1
            r18 = r27
            r20 = r25
            r22 = r8
            wh8 r1 = r17.c(r18, r20, r22)
            hi8 r2 = new hi8
            r2.<init>(r1)
            n77 r1 = new n77
            r3 = 8
            r1.<init>(r3)
            wbe r1 = r2.i(r1)
            lfd r2 = r7.a()
            fce r1 = r1.n(r2)
            lfd r2 = defpackage.qe.a()
            fce r1 = r1.j(r2)
            c1a r2 = new c1a
            r3 = 8
            r2.<init>(r0, r3)
            q0a r3 = new q0a
            r4 = 10
            r3.<init>((int) r4)
            ao1 r4 = new ao1
            r5 = 3
            r4.<init>(r5, r2, r3)
            r1.l(r4)
            r0.H0 = r4
        L_0x01c8:
            return
        L_0x01c9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "getMapAsync must be called on the main thread."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g1a.<init>(w58, qd8, s58, boolean, f3a, g68, taf, d18, long, long, java.lang.String, pf8, ru.ok.messages.location.FrgLocationMap, km3, eud, fn4, jbf, jtb):void");
    }

    public final void G0() {
        z68.a("g1a", "onLiveLocationUpdate");
        this.E0.d(Boolean.TRUE);
    }

    public final void L(s58 s58) {
        vd8 vd8;
        boolean a = this.B0.a();
        f2a f2a = this.a;
        if (!a) {
            f3a f3a = (f3a) f2a;
            vd8 vd82 = f3a.K0;
            if (vd82 != null) {
                vd82.j((Context) f3a.b, true);
            }
            if (!(this.A0.d == 1 || (vd8 = f3a.K0) == null)) {
                Float valueOf = Float.valueOf(14.0f);
                Float valueOf2 = Float.valueOf(c44.DEFAULT_ASPECT_RATIO);
                Float valueOf3 = Float.valueOf(c44.DEFAULT_ASPECT_RATIO);
                vd8.f(s58.a, s58.b, valueOf, valueOf2, valueOf3);
            }
        }
        if (this.A0.d != 1 && this.D0 && this.B0.a()) {
            ((f3a) f2a).a0(s58.a, s58.b, false);
        }
        if (this.A0.d == 3) {
            ConcurrentHashMap concurrentHashMap = this.b;
            pf8 pf8 = (pf8) concurrentHashMap.get(0L);
            if (pf8 != null) {
                of8 a2 = pf8.a();
                a2.a = s58;
                concurrentHashMap.put(Long.valueOf(pf8.c), new pf8(a2));
            } else {
                of8 of8 = new of8(s58);
                of8.b = this.y;
                of8.h = true;
                of8.e = this.X;
                of8.d = tf8.c;
                of8.k = true;
                concurrentHashMap.put(0L, of8.a());
            }
            b0();
        }
        if (this.A0.d == 2 && this.D0) {
            of8 a3 = this.C0.a();
            a3.a = s58;
            this.C0 = new pf8(a3);
        }
        s58 s582 = this.B0;
        double d = s582.a;
        if (!((be) this.w).f(s58.a, s58.b, d, s582.b)) {
            a0();
        }
        this.B0 = s58;
        if (!this.C0.a.a()) {
            double[] d0 = ((f3a) f2a).d0();
            of8 a4 = this.C0.a();
            a4.a = new s58(d0[0], d0[1]);
            this.C0 = new pf8(a4);
            if (this.A0.d == 2) {
                a0();
            }
        }
    }

    public final void W() {
        Y(new a0(3, this));
        ConcurrentHashMap concurrentHashMap = this.b;
        e0((concurrentHashMap.size() < 1 || !concurrentHashMap.containsKey(0L)) ? null : new c1a(this, 4));
        c0();
    }

    public final void X(int i) {
        ((ltb) this.y0).c.j(i, "app.location.map.type");
        f3a f3a = (f3a) this.a;
        vd8 vd8 = f3a.K0;
        if (vd8 != null && vd8.d.K() != i) {
            f3a.K0.i(i);
        }
    }

    public final void Y(tk3 tk3) {
        w58 w58 = this.A0;
        w58.getClass();
        u58 u58 = new u58();
        u58.a = w58.a;
        u58.b = w58.b;
        u58.c = w58.c;
        u58.d = w58.d;
        u58.e = w58.e;
        u58.f = w58.f;
        u58.g = w58.g;
        u58.h = w58.h;
        u58.i = w58.i;
        u58.j = w58.j;
        u58.k = w58.k;
        u58.l = w58.l;
        u58.m = w58.m;
        u58.n = w58.n;
        u58.o = w58.o;
        u58.p = w58.p;
        u58.q = w58.q;
        u58.r = w58.r;
        tk3.accept(u58);
        this.A0 = new w58(u58);
    }

    public final void Z() {
        c1a c1a = new c1a(this, 7);
        g68 g68 = this.v;
        g68.getClass();
        String[] strArr = n54.k;
        Context context = g68.o;
        if (!n54.e(context, strArr)) {
            try {
                c1a.accept(Boolean.FALSE);
            } catch (Throwable th) {
                z68.f("g68", "isServiceAvailable", th);
            }
        } else {
            xv1 xv1 = new xv1(26, (Object) c1a);
            ((nt6) g68.z.get()).getClass();
            nt6.a(context, xv1);
        }
    }

    public final void a0() {
        for (pf8 d : this.b.values()) {
            this.F0.d(d);
        }
        if (this.A0.d == 2) {
            of8 a = this.C0.a();
            a.i = true;
            pf8 pf8 = new pf8(a);
            this.C0 = pf8;
            this.F0.d(pf8);
            c0();
        }
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r11v4, types: [bvg] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0073, code lost:
        if (r9.isEmpty() != false) goto L_0x0075;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0369  */
    /* JADX WARNING: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x024c  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b0() {
        /*
            r26 = this;
            r0 = r26
            f2a r3 = r0.a
            f3a r3 = (defpackage.f3a) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.concurrent.ConcurrentHashMap r0 = r0.b
            java.util.Collection r0 = r0.values()
            r4.<init>(r0)
            r3.getClass()
            int r0 = r4.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r5 = "f3a"
            java.lang.String r6 = "Bind %d markers"
            defpackage.z68.c(r5, r6, r0)
            long r6 = java.lang.System.nanoTime()
            l0a r0 = r3.F0
            w58 r8 = r3.O0
            java.util.Comparator r9 = r0.b
            java.util.Collections.sort(r4, r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r4)
            java.util.Iterator r10 = r9.iterator()
        L_0x003d:
            boolean r11 = r10.hasNext()
            r12 = 0
            if (r11 == 0) goto L_0x0055
            java.lang.Object r11 = r10.next()
            pf8 r11 = (defpackage.pf8) r11
            long r14 = r11.c
            int r11 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r11 != 0) goto L_0x003d
            r10.remove()
            goto L_0x003d
        L_0x0055:
            int r10 = r9.size()
            r14 = 1
            if (r10 > r14) goto L_0x005d
            r9 = 0
        L_0x005d:
            pf8 r10 = r8.a(r4)
            f2a r0 = r0.a
            o2a r0 = (defpackage.o2a) r0
            q2a r0 = (defpackage.q2a) r0
            r15 = 0
            r11 = 8
            if (r9 == 0) goto L_0x0075
            r0.getClass()
            boolean r16 = r9.isEmpty()
            if (r16 == 0) goto L_0x0077
        L_0x0075:
            if (r10 == 0) goto L_0x0095
        L_0x0077:
            java.lang.Object r1 = r0.c
            android.view.View r1 = (android.view.View) r1
            if (r1 != 0) goto L_0x008d
            int r1 = defpackage.q2a.B0
            android.view.ViewStub r2 = r0.x
            r2.setLayoutResource(r1)
            android.view.View r1 = r2.inflate()
            r0.c = r1
            r0.M()
        L_0x008d:
            java.lang.Object r1 = r0.c
            android.view.View r1 = (android.view.View) r1
            r1.setVisibility(r15)
            goto L_0x009e
        L_0x0095:
            java.lang.Object r1 = r0.c
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x009e
            r1.setVisibility(r11)
        L_0x009e:
            if (r9 == 0) goto L_0x00a8
            boolean r1 = r9.isEmpty()
            if (r1 != 0) goto L_0x00a8
            r1 = r14
            goto L_0x00a9
        L_0x00a8:
            r1 = r15
        L_0x00a9:
            r17 = -1
            if (r10 != 0) goto L_0x00b0
            r12 = r17
            goto L_0x00b2
        L_0x00b0:
            long r12 = r10.c
        L_0x00b2:
            if (r1 == 0) goto L_0x00c8
            androidx.recyclerview.widget.RecyclerView r1 = r0.y0
            r1.setVisibility(r15)
            android.view.View r1 = r0.z0
            r1.setVisibility(r15)
            wq3 r1 = r0.A0
            r1.v = r9
            r1.w = r12
            r1.m()
            goto L_0x00d4
        L_0x00c8:
            androidx.recyclerview.widget.RecyclerView r1 = r0.y0
            if (r1 == 0) goto L_0x00d4
            r1.setVisibility(r11)
            android.view.View r1 = r0.z0
            r1.setVisibility(r11)
        L_0x00d4:
            if (r10 != 0) goto L_0x00ee
            androidx.constraintlayout.widget.Group r1 = r0.z
            if (r1 == 0) goto L_0x00e7
            r1.setVisibility(r11)
            android.widget.ImageView r1 = r0.Y
            r1.setVisibility(r11)
            android.widget.TextView r0 = r0.x0
            r0.setVisibility(r11)
        L_0x00e7:
            r19 = r5
            r21 = r6
            r7 = r4
            goto L_0x0363
        L_0x00ee:
            jtb r1 = r0.w
            ltb r1 = (defpackage.ltb) r1
            a33 r2 = r1.a
            long r12 = r2.m()
            long r14 = r10.j
            long r12 = r12 - r14
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            cud r9 = r1.b
            int r9 = r9.q()
            r20 = r12
            long r11 = (long) r9
            long r11 = r2.toMillis(r11)
            long r8 = r8.o
            boolean r2 = r10.k
            boolean r13 = r10.h
            if (r13 == 0) goto L_0x0132
            if (r2 == 0) goto L_0x0132
            r22 = 2
            long r11 = r11 * r22
            int r11 = (r20 > r11 ? 1 : (r20 == r11 ? 0 : -1))
            if (r11 < 0) goto L_0x0132
            r11 = 0
            int r20 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r20 > 0) goto L_0x0132
            fn4 r11 = r0.y
            java.lang.String r11 = r11.a()
            java.lang.String r12 = r10.l
            boolean r11 = defpackage.cvg.c(r12, r11)
            if (r11 != 0) goto L_0x0132
            r11 = 1
            goto L_0x0133
        L_0x0132:
            r11 = 0
        L_0x0133:
            if (r11 == 0) goto L_0x0145
            android.widget.ImageView r12 = r0.Y
            r20 = r8
            r8 = 8
            r12.setVisibility(r8)
            android.widget.ProgressBar r8 = r0.Z
            r9 = 0
            r8.setVisibility(r9)
            goto L_0x0160
        L_0x0145:
            r20 = r8
            r9 = 0
            if (r13 == 0) goto L_0x0154
            if (r2 == 0) goto L_0x0154
            android.widget.ImageView r8 = r0.Y
            r8.setVisibility(r9)
            r12 = 8
            goto L_0x015b
        L_0x0154:
            android.widget.ImageView r8 = r0.Y
            r12 = 8
            r8.setVisibility(r12)
        L_0x015b:
            android.widget.ProgressBar r8 = r0.Z
            r8.setVisibility(r12)
        L_0x0160:
            androidx.constraintlayout.widget.Group r8 = r0.z
            r8.setVisibility(r9)
            r24 = r20
            a33 r1 = r1.a
            long r20 = r1.s()
            long r8 = r10.b
            int r1 = (r8 > r20 ? 1 : (r8 == r20 ? 0 : -1))
            if (r1 != 0) goto L_0x017f
            if (r13 == 0) goto L_0x017f
            if (r2 == 0) goto L_0x017f
            android.widget.TextView r1 = r0.x0
            r8 = 8
            r1.setVisibility(r8)
            goto L_0x0185
        L_0x017f:
            android.widget.TextView r1 = r0.x0
            r8 = 0
            r1.setVisibility(r8)
        L_0x0185:
            android.widget.TextView r1 = r0.X
            yva r8 = r0.o
            u25 r12 = r8.k
            java.lang.String r9 = r10.e
            java.lang.CharSequence r9 = r12.c(r9)
            r1.setText(r9)
            boolean r1 = r10.i
            java.lang.Object r9 = r0.b
            android.content.Context r9 = (android.content.Context) r9
            java.lang.String r12 = ""
            if (r1 == 0) goto L_0x01b7
            android.widget.TextView r1 = r0.x0
            r1.setText(r12)
            android.widget.TextView r1 = r0.w0
            int r10 = defpackage.qad.Q3
            java.lang.String r10 = r9.getString(r10)
            r1.setText(r10)
            r19 = r5
        L_0x01b0:
            r21 = r6
            r20 = r12
            r7 = r4
            goto L_0x0231
        L_0x01b7:
            java.lang.String r1 = r10.f
            boolean r19 = defpackage.cvg.A(r1)
            if (r19 == 0) goto L_0x01cd
            android.widget.TextView r1 = r0.w0
            r19 = r5
            int r5 = defpackage.qad.fa
            java.lang.String r5 = r9.getString(r5)
            r1.setText(r5)
            goto L_0x01d4
        L_0x01cd:
            r19 = r5
            android.widget.TextView r5 = r0.w0
            r5.setText(r1)
        L_0x01d4:
            float r1 = r10.g
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x01e2
            android.widget.TextView r1 = r0.x0
            r1.setText(r12)
            goto L_0x01b0
        L_0x01e2:
            int r5 = defpackage.fhf.a
            java.text.DecimalFormatSymbols r5 = new java.text.DecimalFormatSymbols
            java.util.Locale r10 = java.util.Locale.ENGLISH
            r5.<init>(r10)
            r10 = 46
            r5.setDecimalSeparator(r10)
            r10 = 1148846080(0x447a0000, float:1000.0)
            int r20 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r20 >= 0) goto L_0x020e
            java.text.DecimalFormat r10 = new java.text.DecimalFormat
            r20 = r12
            java.lang.String r12 = "0"
            r10.<init>(r12, r5)
            r21 = r6
            double r5 = (double) r1
            java.lang.String r1 = r10.format(r5)
            int r5 = defpackage.qad.x5
            java.lang.String r5 = r9.getString(r5)
            r7 = r4
            goto L_0x0226
        L_0x020e:
            r21 = r6
            r20 = r12
            java.text.DecimalFormat r6 = new java.text.DecimalFormat
            java.lang.String r7 = "0.#"
            r6.<init>(r7, r5)
            float r1 = r1 / r10
            r7 = r4
            double r4 = (double) r1
            java.lang.String r1 = r6.format(r4)
            int r4 = defpackage.qad.F3
            java.lang.String r5 = r9.getString(r4)
        L_0x0226:
            java.lang.String r4 = " "
            java.lang.String r1 = defpackage.g63.i(r1, r4, r5)
            android.widget.TextView r4 = r0.x0
            r4.setText(r1)
        L_0x0231:
            if (r11 == 0) goto L_0x024c
            android.widget.TextView r0 = r0.v0
            int r1 = defpackage.jad.x
            java.lang.String r2 = r8.d(r14)
            java.lang.String r2 = defpackage.ghf.e(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r1 = r9.getString(r1, r2)
            r0.setText(r1)
            goto L_0x0363
        L_0x024c:
            r9 = r24
            r4 = 0
            int r1 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x0263
            android.widget.TextView r0 = r0.v0
            java.lang.String r1 = r8.d(r9)
            java.lang.String r1 = defpackage.ghf.e(r1)
            r0.setText(r1)
            goto L_0x0363
        L_0x0263:
            if (r13 == 0) goto L_0x0356
            if (r2 == 0) goto L_0x02df
            android.widget.TextView r0 = r0.v0
            a33 r1 = r8.c
            long r4 = r1.m()
            p01 r2 = defpackage.j4b.z(r14, r4)
            java.util.Locale r1 = r1.u()
            java.lang.String[] r4 = defpackage.ghf.c
            int r4 = r2.b
            int r4 = defpackage.tr1.y(r4)
            android.content.Context r5 = r8.a
            long r8 = r2.c
            switch(r4) {
                case 0: goto L_0x02d4;
                case 1: goto L_0x02cc;
                case 2: goto L_0x02c4;
                case 3: goto L_0x02b1;
                case 4: goto L_0x02a9;
                case 5: goto L_0x02a1;
                case 6: goto L_0x0299;
                case 7: goto L_0x0289;
                default: goto L_0x0286;
            }
        L_0x0286:
            r12 = r20
            goto L_0x02da
        L_0x0289:
            int r4 = defpackage.tmc.tt_dates_full_last_update
            r2 = 1
            java.lang.String r1 = defpackage.j4b.A(r1, r8, r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r12 = r5.getString(r4, r1)
            goto L_0x02da
        L_0x0299:
            int r1 = defpackage.zjc.tt_dates_months_last_update
            int r4 = (int) r8
            java.lang.String r12 = defpackage.ghf.s(r1, r4, r5)
            goto L_0x02da
        L_0x02a1:
            int r1 = defpackage.zjc.tt_dates_weeks_last_update
            int r4 = (int) r8
            java.lang.String r12 = defpackage.ghf.s(r1, r4, r5)
            goto L_0x02da
        L_0x02a9:
            int r1 = defpackage.zjc.tt_dates_days_last_update
            int r4 = (int) r8
            java.lang.String r12 = defpackage.ghf.s(r1, r4, r5)
            goto L_0x02da
        L_0x02b1:
            int r4 = defpackage.tmc.tt_dates_yesterday_last_update
            java.lang.String r4 = r5.getString(r4)
            java.lang.String r1 = defpackage.j4b.s(r5, r8, r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r12 = java.lang.String.format(r4, r1)
            goto L_0x02da
        L_0x02c4:
            int r1 = defpackage.zjc.tt_dates_hours_last_update
            int r4 = (int) r8
            java.lang.String r12 = defpackage.ghf.s(r1, r4, r5)
            goto L_0x02da
        L_0x02cc:
            int r1 = defpackage.zjc.tt_dates_minutes_last_update
            int r4 = (int) r8
            java.lang.String r12 = defpackage.ghf.s(r1, r4, r5)
            goto L_0x02da
        L_0x02d4:
            int r1 = defpackage.tmc.tt_dates_right_now_last_update
            java.lang.String r12 = r5.getString(r1)
        L_0x02da:
            r0.setText(r12)
            goto L_0x0363
        L_0x02df:
            android.widget.TextView r0 = r0.v0
            a33 r1 = r8.c
            long r4 = r1.m()
            p01 r4 = defpackage.j4b.z(r14, r4)
            java.util.Locale r1 = r1.u()
            java.lang.String[] r5 = defpackage.ghf.c
            int r5 = r4.b
            int r5 = defpackage.tr1.y(r5)
            android.content.Context r6 = r8.a
            long r8 = r4.c
            switch(r5) {
                case 0: goto L_0x034c;
                case 1: goto L_0x0344;
                case 2: goto L_0x033c;
                case 3: goto L_0x0329;
                case 4: goto L_0x0321;
                case 5: goto L_0x0319;
                case 6: goto L_0x0311;
                case 7: goto L_0x0301;
                default: goto L_0x02fe;
            }
        L_0x02fe:
            r12 = r20
            goto L_0x0352
        L_0x0301:
            int r4 = defpackage.tmc.tt_dates_full_live_location_end
            r2 = 1
            java.lang.String r1 = defpackage.j4b.A(r1, r8, r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r12 = r6.getString(r4, r1)
            goto L_0x0352
        L_0x0311:
            int r1 = defpackage.zjc.tt_dates_months_live_location_end
            int r4 = (int) r8
            java.lang.String r12 = defpackage.ghf.s(r1, r4, r6)
            goto L_0x0352
        L_0x0319:
            int r1 = defpackage.zjc.tt_dates_weeks_live_location_end
            int r4 = (int) r8
            java.lang.String r12 = defpackage.ghf.s(r1, r4, r6)
            goto L_0x0352
        L_0x0321:
            int r1 = defpackage.zjc.tt_dates_days_live_location_end
            int r4 = (int) r8
            java.lang.String r12 = defpackage.ghf.s(r1, r4, r6)
            goto L_0x0352
        L_0x0329:
            int r4 = defpackage.tmc.tt_dates_yesterday_live_location_end
            java.lang.String r4 = r6.getString(r4)
            java.lang.String r1 = defpackage.j4b.s(r6, r8, r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r12 = java.lang.String.format(r4, r1)
            goto L_0x0352
        L_0x033c:
            int r1 = defpackage.zjc.tt_dates_hours_live_location_end
            int r4 = (int) r8
            java.lang.String r12 = defpackage.ghf.s(r1, r4, r6)
            goto L_0x0352
        L_0x0344:
            int r1 = defpackage.zjc.tt_dates_minutes_live_location_end
            int r4 = (int) r8
            java.lang.String r12 = defpackage.ghf.s(r1, r4, r6)
            goto L_0x0352
        L_0x034c:
            int r1 = defpackage.tmc.tt_dates_right_now_live_location_end
            java.lang.String r12 = r6.getString(r1)
        L_0x0352:
            r0.setText(r12)
            goto L_0x0363
        L_0x0356:
            android.widget.TextView r0 = r0.v0
            java.lang.String r1 = r8.d(r14)
            java.lang.String r1 = defpackage.ghf.e(r1)
            r0.setText(r1)
        L_0x0363:
            vd8 r0 = r3.K0
            if (r0 != 0) goto L_0x0369
            goto L_0x0565
        L_0x0369:
            java.lang.Object r1 = r3.b
            android.content.Context r1 = (android.content.Context) r1
            r0.a(r1, r7)
            w58 r0 = r3.O0
            long r4 = r0.h
            int r1 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r1 != 0) goto L_0x037f
            vd8 r0 = r3.K0
            r0.c()
            goto L_0x0546
        L_0x037f:
            pf8 r0 = r0.a(r7)
            if (r0 == 0) goto L_0x0541
            boolean r1 = r0.h
            if (r1 == 0) goto L_0x0541
            boolean r1 = r0.k
            if (r1 == 0) goto L_0x0541
            s58 r0 = r0.a
            boolean r1 = r0.a()
            if (r1 != 0) goto L_0x0397
            goto L_0x0541
        L_0x0397:
            java.lang.Object r1 = r3.c
            android.view.View r1 = (android.view.View) r1
            android.content.Context r1 = r1.getContext()
            kotlin.Lazy r4 = defpackage.scf.b0
            scf r1 = defpackage.j4b.k0(r1)
            vd8 r3 = r3.K0
            float r4 = r0.o
            double r4 = (double) r4
            int r6 = r1.l
            r7 = 1036831949(0x3dcccccd, float:0.1)
            int r6 = defpackage.j4b.l0(r7, r6)
            r7 = 1056964608(0x3f000000, float:0.5)
            int r7 = defpackage.ro4.a(r7)
            float r7 = (float) r7
            wie r8 = r3.s
            double r10 = r0.a
            double r12 = r0.b
            int r0 = r1.l
            r1 = 0
            if (r8 != 0) goto L_0x043e
            zc8 r8 = r3.m
            java.lang.Object r8 = r8.b()
            a13 r8 = (defpackage.a13) r8
            com.google.android.gms.maps.model.LatLng r9 = new com.google.android.gms.maps.model.LatLng
            r9.<init>(r10, r12)
            z03 r8 = r8.a
            r8.getClass()
            r8.a = r9
            r9 = 0
            r8.y = r9
            r8.v = r6
            r8.b = r4
            r8.o = r0
            r8.c = r7
            r0 = 1
            r8.x = r0
            r8.w = r1
            er7 r0 = r3.d
            r0.getClass()
            java.lang.Object r0 = r0.b
            wsb r0 = (defpackage.wsb) r0
            r0.getClass()
            y03 r1 = new y03     // Catch:{ RemoteException -> 0x0437 }
            java.lang.Object r0 = r0.a     // Catch:{ RemoteException -> 0x0437 }
            o3h r0 = (defpackage.o3h) r0     // Catch:{ RemoteException -> 0x0437 }
            android.os.Parcel r2 = r0.H0()     // Catch:{ RemoteException -> 0x0437 }
            defpackage.hzg.b(r2, r8)     // Catch:{ RemoteException -> 0x0437 }
            r4 = 35
            android.os.Parcel r0 = r0.R(r2, r4)     // Catch:{ RemoteException -> 0x0437 }
            android.os.IBinder r2 = r0.readStrongBinder()     // Catch:{ RemoteException -> 0x0437 }
            int r4 = defpackage.x5h.d     // Catch:{ RemoteException -> 0x0437 }
            if (r2 != 0) goto L_0x0412
            r11 = 0
            goto L_0x0426
        L_0x0412:
            java.lang.String r4 = "com.google.android.gms.maps.model.internal.ICircleDelegate"
            android.os.IInterface r5 = r2.queryLocalInterface(r4)     // Catch:{ RemoteException -> 0x0437 }
            boolean r6 = r5 instanceof defpackage.e6h     // Catch:{ RemoteException -> 0x0437 }
            if (r6 == 0) goto L_0x0420
            r11 = r5
            e6h r11 = (defpackage.e6h) r11     // Catch:{ RemoteException -> 0x0437 }
            goto L_0x0426
        L_0x0420:
            r5h r11 = new r5h     // Catch:{ RemoteException -> 0x0437 }
            r5 = 3
            r11.<init>(r2, r4, r5)     // Catch:{ RemoteException -> 0x0437 }
        L_0x0426:
            r0.recycle()     // Catch:{ RemoteException -> 0x0437 }
            r1.<init>(r11)     // Catch:{ RemoteException -> 0x0437 }
            wie r0 = new wie
            r2 = 11
            r0.<init>((int) r2, (java.lang.Object) r1)
            r3.s = r0
            goto L_0x0546
        L_0x0437:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x043e:
            com.google.android.gms.maps.model.LatLng r14 = new com.google.android.gms.maps.model.LatLng
            r14.<init>(r10, r12)
            java.lang.Object r8 = r8.b
            y03 r8 = (defpackage.y03) r8
            r8.getClass()
            e6h r8 = r8.a     // Catch:{ RemoteException -> 0x053a }
            r5h r8 = (defpackage.r5h) r8     // Catch:{ RemoteException -> 0x053a }
            android.os.Parcel r10 = r8.H0()     // Catch:{ RemoteException -> 0x053a }
            defpackage.hzg.b(r10, r14)     // Catch:{ RemoteException -> 0x053a }
            r11 = 3
            r8.I0(r10, r11)     // Catch:{ RemoteException -> 0x053a }
            wie r8 = r3.s
            java.lang.Object r8 = r8.b
            y03 r8 = (defpackage.y03) r8
            r8.getClass()
            e6h r8 = r8.a     // Catch:{ RemoteException -> 0x0533 }
            r5h r8 = (defpackage.r5h) r8     // Catch:{ RemoteException -> 0x0533 }
            android.os.Parcel r10 = r8.H0()     // Catch:{ RemoteException -> 0x0533 }
            r9 = 0
            r10.writeInt(r9)     // Catch:{ RemoteException -> 0x0533 }
            r9 = 19
            r8.I0(r10, r9)     // Catch:{ RemoteException -> 0x0533 }
            wie r8 = r3.s
            java.lang.Object r8 = r8.b
            y03 r8 = (defpackage.y03) r8
            r8.getClass()
            e6h r8 = r8.a     // Catch:{ RemoteException -> 0x052c }
            r5h r8 = (defpackage.r5h) r8     // Catch:{ RemoteException -> 0x052c }
            android.os.Parcel r9 = r8.H0()     // Catch:{ RemoteException -> 0x052c }
            r9.writeInt(r6)     // Catch:{ RemoteException -> 0x052c }
            r6 = 11
            r8.I0(r9, r6)     // Catch:{ RemoteException -> 0x052c }
            wie r6 = r3.s
            java.lang.Object r6 = r6.b
            y03 r6 = (defpackage.y03) r6
            r6.getClass()
            e6h r6 = r6.a     // Catch:{ RemoteException -> 0x0525 }
            r5h r6 = (defpackage.r5h) r6     // Catch:{ RemoteException -> 0x0525 }
            android.os.Parcel r8 = r6.H0()     // Catch:{ RemoteException -> 0x0525 }
            r8.writeDouble(r4)     // Catch:{ RemoteException -> 0x0525 }
            r4 = 5
            r6.I0(r8, r4)     // Catch:{ RemoteException -> 0x0525 }
            wie r4 = r3.s
            java.lang.Object r4 = r4.b
            y03 r4 = (defpackage.y03) r4
            r4.getClass()
            e6h r4 = r4.a     // Catch:{ RemoteException -> 0x051e }
            r5h r4 = (defpackage.r5h) r4     // Catch:{ RemoteException -> 0x051e }
            android.os.Parcel r5 = r4.H0()     // Catch:{ RemoteException -> 0x051e }
            r5.writeInt(r0)     // Catch:{ RemoteException -> 0x051e }
            r0 = 9
            r4.I0(r5, r0)     // Catch:{ RemoteException -> 0x051e }
            wie r0 = r3.s
            java.lang.Object r0 = r0.b
            y03 r0 = (defpackage.y03) r0
            r0.getClass()
            e6h r0 = r0.a     // Catch:{ RemoteException -> 0x0517 }
            r5h r0 = (defpackage.r5h) r0     // Catch:{ RemoteException -> 0x0517 }
            android.os.Parcel r4 = r0.H0()     // Catch:{ RemoteException -> 0x0517 }
            r4.writeFloat(r7)     // Catch:{ RemoteException -> 0x0517 }
            r5 = 7
            r0.I0(r4, r5)     // Catch:{ RemoteException -> 0x0517 }
            wie r0 = r3.s
            java.lang.Object r0 = r0.b
            y03 r0 = (defpackage.y03) r0
            r0.getClass()
            e6h r0 = r0.a     // Catch:{ RemoteException -> 0x0510 }
            r5h r0 = (defpackage.r5h) r0     // Catch:{ RemoteException -> 0x0510 }
            android.os.Parcel r4 = r0.H0()     // Catch:{ RemoteException -> 0x0510 }
            r2 = 1
            r4.writeInt(r2)     // Catch:{ RemoteException -> 0x0510 }
            r2 = 15
            r0.I0(r4, r2)     // Catch:{ RemoteException -> 0x0510 }
            wie r0 = r3.s
            java.lang.Object r0 = r0.b
            y03 r0 = (defpackage.y03) r0
            r0.getClass()
            e6h r0 = r0.a     // Catch:{ RemoteException -> 0x0509 }
            r5h r0 = (defpackage.r5h) r0     // Catch:{ RemoteException -> 0x0509 }
            android.os.Parcel r2 = r0.H0()     // Catch:{ RemoteException -> 0x0509 }
            r2.writeFloat(r1)     // Catch:{ RemoteException -> 0x0509 }
            r1 = 13
            r0.I0(r2, r1)     // Catch:{ RemoteException -> 0x0509 }
            goto L_0x0546
        L_0x0509:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x0510:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x0517:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x051e:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x0525:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x052c:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x0533:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x053a:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x0541:
            vd8 r0 = r3.K0
            r0.c()
        L_0x0546:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r1 = java.lang.System.nanoTime()
            long r1 = r1 - r21
            long r1 = java.lang.Math.abs(r1)
            long r0 = r0.toMillis(r1)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "bindMarkers takes %dms"
            r2 = r19
            defpackage.z68.c(r2, r1, r0)
        L_0x0565:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g1a.b0():void");
    }

    public final void c0() {
        w58 w58;
        pf8 pf8 = this.C0;
        e4a e4a = ((f3a) this.a).H0;
        if (e4a != null && (w58 = e4a.Z) != null && w58.d == 2) {
            boolean z2 = pf8.i;
            Context context = (Context) e4a.b;
            if (z2) {
                e4a.z.setSubtitle(context.getString(qad.Q3));
                return;
            }
            String str = pf8.f;
            if (cvg.A(str)) {
                e4a.z.setSubtitle(context.getString(qad.fa));
            } else {
                e4a.z.setSubtitle(str);
            }
        }
    }

    public final void d0(long j) {
        pf8 pf8;
        jbd.c(this.I0);
        z68.c("g1a", "Update track for message %d", Long.valueOf(j));
        if (this.A0.d == 1) {
            Long valueOf = Long.valueOf(j);
            ConcurrentHashMap concurrentHashMap = this.b;
            pf8 pf82 = (pf8) concurrentHashMap.get(valueOf);
            if (pf82 != null && pf82.h) {
                List list = (List) this.c.get(Long.valueOf(j));
                if (list == null) {
                    list = Collections.emptyList();
                }
                ((f3a) this.a).c0(list, pf82.k);
                w58 w58 = this.A0;
                if (!(w58.o == -1 || (pf8 = (pf8) concurrentHashMap.get(Long.valueOf(w58.h))) == null)) {
                    this.F0.d(pf8);
                }
                z68.c("g1a", "Update track for message %d: load track", Long.valueOf(j));
                j18 j18 = (j18) this.x;
                j18.getClass();
                sh8 sh8 = new sh8(0, new i18(j18, j, 1));
                jbf jbf = this.x0;
                jbf.getClass();
                oi8 f = sh8.h(((kbf) jbf).a()).f(qe.a());
                oh8 oh8 = new oh8(new u52((Object) this, j, (Object) pf82, 12), new f1a(j, 0), new wh5(j, 6));
                f.a(oh8);
                this.I0 = oh8;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r8v26, types: [odg, ude, yrf] */
    /* JADX WARNING: type inference failed for: r1v19, types: [java.lang.Object, c9e] */
    public final void e0(c1a c1a) {
        int i;
        f3a f3a = (f3a) this.a;
        w58 w58 = this.A0;
        w58 w582 = f3a.O0;
        f3a.O0 = w58;
        ch chVar = f3a.Y;
        if (chVar.q()) {
            gsf gsf = new gsf();
            gsf.S(new yrf());
            gsf.I(200);
            int i2 = lic.layout_contact_location__rv_markers;
            ArrayList arrayList = gsf.y;
            if (i2 > 0) {
                Integer valueOf = Integer.valueOf(i2);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                if (!arrayList.contains(valueOf)) {
                    arrayList.add(valueOf);
                }
            }
            gsf.y = arrayList;
            gsf.p(lic.frg_location_map__no_permission_panel);
            gsf.p(lic.frg_location_map__top_no_permission_panel_anchor);
            if (w582 == null || (((i = w582.d) == 1 && w58.d == 3) || (i == 3 && w58.d == 1))) {
                ? odg = new odg();
                odg.S0 = ude.V0;
                ? obj = new Object();
                obj.a = 3.0f;
                obj.b = 80;
                odg.H0 = obj;
                gsf.S(odg);
            } else {
                gsf.S(new odg());
            }
            if (c1a != null) {
                gsf.Q(new dk0(0, c1a));
            }
            esf.b((ViewGroup) ((View) f3a.c));
            esf.a((ViewGroup) ((View) f3a.c), gsf);
        }
        w58 w583 = f3a.O0;
        int y2 = tr1.y(w583.d);
        if (y2 == 0) {
            View view = (View) f3a.H0.c;
            if (view != null) {
                view.setVisibility(8);
            }
            f3a.B0.setVisibility(8);
        } else if (y2 == 1) {
            e4a e4a = f3a.H0;
            if (((View) e4a.c) == null) {
                int i3 = e4a.w0;
                ViewStub viewStub = f3a.G0;
                viewStub.setLayoutResource(i3);
                e4a.c = viewStub.inflate();
                e4a.M();
                f3a.H0.R(f3a);
            }
            ((View) f3a.H0.c).setVisibility(0);
            f3a.H0.Z(w583);
            f3a.B0.setVisibility(0);
        } else if (y2 == 2) {
            e4a e4a2 = f3a.H0;
            if (((View) e4a2.c) == null) {
                int i4 = e4a.w0;
                ViewStub viewStub2 = f3a.G0;
                viewStub2.setLayoutResource(i4);
                e4a2.c = viewStub2.inflate();
                e4a2.M();
                f3a.H0.R(f3a);
            }
            ((View) f3a.H0.c).setVisibility(0);
            f3a.H0.Z(w583);
            f3a.B0.setVisibility(8);
        }
        boolean z2 = f3a.O0.j;
        f3a.w0.e();
        w58 w584 = f3a.O0;
        boolean z3 = w584.m;
        if (w584.f) {
            boolean z4 = w584.g;
        }
        f3a.I0.b();
        b18 b18 = f3a.J0;
        b18.c = null;
        gnf gnf = b18.a;
        if (gnf != null) {
            gnf.j();
        }
        if (chVar.p() && c1a != null) {
            g1a g1a = c1a.b;
            g1a.b.remove(0L);
            g1a.b0();
        }
    }

    public final void w() {
    }
}
