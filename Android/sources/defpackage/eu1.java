package defpackage;

import android.content.Context;
import android.os.Trace;
import android.util.Range;
import androidx.camera.core.CameraInfoUnavailableException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* renamed from: eu1  reason: default package */
public abstract class eu1 {
    public static final cu1 D = new Object();
    public final HashSet A;
    public final Context B;
    public final HashMap C;
    public jv1 a = jv1.c;
    public int b = 3;
    public bub c;
    public y87 d;
    public g87 e;
    public r3g f;
    public nyc g = null;
    public final HashMap h = new HashMap();
    public zqd i = lyc.j0;
    public final vy4 j;
    public final vy4 k;
    public final Range l;
    public lu7 m;
    public dvb n;
    public dcg o;
    public aub p;
    public final l15 q;
    public final ms1 r;
    public final boolean s;
    public boolean t;
    public final vb6 u;
    public final vb6 v;
    public final fz9 w;
    public final yu9 x;
    public final yu9 y;
    public final yu9 z;

    /* JADX WARNING: type inference failed for: r6v6, types: [q29, vb6] */
    /* JADX WARNING: type inference failed for: r6v7, types: [q29, vb6] */
    /* JADX WARNING: type inference failed for: r6v8, types: [fz9, u08] */
    /* JADX WARNING: type inference failed for: r0v1, types: [l15, java.lang.Object] */
    public eu1(Context context) {
        cvb cvb = cvb.f;
        cz1 A2 = kv0.A(context);
        es1 es1 = new es1(5);
        cz1 b0 = hd8.b0(A2, new xv1(22, (Object) es1), ryg.j());
        vy4 vy4 = vy4.c;
        this.j = vy4;
        this.k = vy4;
        this.l = hc0.f;
        this.s = true;
        this.t = true;
        this.u = new q29();
        this.v = new q29();
        this.w = new u08(0);
        this.x = new yu9(2, false);
        this.y = new yu9(2, false);
        this.z = new yu9(2, false);
        this.A = new HashSet();
        this.C = new HashMap();
        Context w2 = hd8.w(context);
        this.B = w2;
        d87 d87 = new d87(2);
        c(d87);
        vy4 vy42 = this.k;
        d87.b.f(m97.E, vy42);
        this.c = d87.b();
        d87 d872 = new d87(1);
        c(d872);
        this.d = d872.a();
        this.e = d((Integer) null, (Integer) null, (Integer) null);
        this.f = e();
        mu7 mu7 = (mu7) this;
        bu1 bu1 = new bu1(0, mu7);
        hd8.b0(b0, new xv1(22, (Object) bu1), ryg.G());
        ? obj = new Object();
        obj.a = new Object();
        obj.c = new HashMap();
        obj.b = new g8d(obj, w2);
        this.q = obj;
        this.r = new ms1(1, mu7);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void a(defpackage.aub r7, defpackage.dcg r8) {
        /*
            r6 = this;
            defpackage.ev0.g()
            aub r0 = r6.p
            if (r0 == r7) goto L_0x000e
            r6.p = r7
            bub r0 = r6.c
            r0.E(r7)
        L_0x000e:
            dcg r7 = r6.o
            r0 = 0
            if (r7 == 0) goto L_0x0037
            int r7 = r6.g(r8)
            r1 = -1
            if (r7 == r1) goto L_0x0021
            jq5 r2 = new jq5
            r3 = 1
            r2.<init>(r7, r3)
            goto L_0x0022
        L_0x0021:
            r2 = r0
        L_0x0022:
            dcg r7 = r6.o
            int r7 = r6.g(r7)
            if (r7 == r1) goto L_0x0031
            jq5 r1 = new jq5
            r3 = 1
            r1.<init>(r7, r3)
            goto L_0x0032
        L_0x0031:
            r1 = r0
        L_0x0032:
            if (r2 == r1) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r7 = 0
            goto L_0x0038
        L_0x0037:
            r7 = 1
        L_0x0038:
            r6.o = r8
            l15 r8 = r6.q
            ew6 r1 = defpackage.ryg.G()
            ms1 r2 = r6.r
            java.lang.Object r3 = r8.a
            monitor-enter(r3)
            java.lang.Object r4 = r8.b     // Catch:{ all -> 0x0051 }
            g8d r4 = (defpackage.g8d) r4     // Catch:{ all -> 0x0051 }
            boolean r4 = r4.canDetectOrientation()     // Catch:{ all -> 0x0051 }
            if (r4 != 0) goto L_0x0053
            monitor-exit(r3)     // Catch:{ all -> 0x0051 }
            goto L_0x0067
        L_0x0051:
            r6 = move-exception
            goto L_0x0070
        L_0x0053:
            java.lang.Object r4 = r8.c     // Catch:{ all -> 0x0051 }
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch:{ all -> 0x0051 }
            h8d r5 = new h8d     // Catch:{ all -> 0x0051 }
            r5.<init>(r2, r1)     // Catch:{ all -> 0x0051 }
            r4.put(r2, r5)     // Catch:{ all -> 0x0051 }
            java.lang.Object r8 = r8.b     // Catch:{ all -> 0x0051 }
            g8d r8 = (defpackage.g8d) r8     // Catch:{ all -> 0x0051 }
            r8.enable()     // Catch:{ all -> 0x0051 }
            monitor-exit(r3)     // Catch:{ all -> 0x0051 }
        L_0x0067:
            if (r7 == 0) goto L_0x006c
            r6.s()
        L_0x006c:
            r6.r(r0)
            return
        L_0x0070:
            monitor-exit(r3)     // Catch:{ all -> 0x0051 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eu1.a(aub, dcg):void");
    }

    public final void b() {
        ev0.g();
        dvb dvb = this.n;
        if (dvb != null) {
            dvb.b(this.c, this.d, this.e, this.f);
        }
        this.c.E((aub) null);
        this.m = null;
        this.p = null;
        this.o = null;
        l15 l15 = this.q;
        ms1 ms1 = this.r;
        synchronized (l15.a) {
            try {
                h8d h8d = (h8d) ((HashMap) l15.c).get(ms1);
                if (h8d != null) {
                    h8d.c.set(false);
                    ((HashMap) l15.c).remove(ms1);
                }
                if (((HashMap) l15.c).isEmpty()) {
                    ((g8d) l15.b).disable();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(d87 d87) {
        dcg dcg = this.o;
        if (dcg != null) {
            int g2 = g(dcg);
            jq5 jq5 = g2 != -1 ? new jq5(g2, 1) : null;
            if (jq5 != null) {
                d87.c(new w3d(jq5, (x3d) null, 0));
            }
        }
    }

    public final g87 d(Integer num, Integer num2, Integer num3) {
        d87 d87 = new d87(0);
        pz9 pz9 = d87.b;
        if (num != null) {
            pz9.f(j87.b, num);
        }
        if (num2 != null) {
            pz9.f(j87.c, num2);
        }
        if (num3 != null) {
            pz9.f(j87.v, num3);
        }
        c(d87);
        j87 j87 = new j87(c5b.a(pz9));
        x97.X(j87);
        return new g87(j87);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [xc0, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v2, types: [xc0, java.lang.Object] */
    public final r3g e() {
        int g2;
        ts1 ts1 = lyc.n0;
        d19 a2 = lb0.a();
        zqd zqd = this.i;
        bs0.q(zqd, "The specified quality selector can't be null.");
        yc0 yc0 = (yc0) a2.b;
        if (yc0 != null) {
            ? obj = new Object();
            obj.a = yc0.a;
            obj.b = yc0.b;
            obj.c = yc0.c;
            obj.d = Integer.valueOf(yc0.d);
            obj.a = zqd;
            a2.b = obj.a();
            dcg dcg = this.o;
            if (!(dcg == null || this.i != lyc.j0 || (g2 = g(dcg)) == -1)) {
                yc0 yc02 = (yc0) a2.b;
                if (yc02 != null) {
                    ? obj2 = new Object();
                    obj2.a = yc02.a;
                    obj2.b = yc02.b;
                    obj2.c = yc02.c;
                    obj2.d = Integer.valueOf(yc02.d);
                    obj2.d = Integer.valueOf(g2);
                    a2.b = obj2.a();
                } else {
                    throw new IllegalStateException("Property \"videoSpec\" has not been set");
                }
            }
            d87 d87 = new d87((h7g) new lyc((ExecutorService) null, a2.f(), ts1, ts1));
            la0 la0 = zzf.o0;
            Range range = this.l;
            pz9 pz9 = d87.b;
            pz9.f(la0, range);
            pz9.f(x97.I, 0);
            pz9.f(m97.E, this.j);
            return new r3g(new s3g(c5b.a(pz9)));
        }
        throw new IllegalStateException("Property \"videoSpec\" has not been set");
    }

    public final rgd f() {
        qgd qgd = qgd.b;
        HashMap hashMap = this.C;
        if (hashMap.get(qgd) != null) {
            return (rgd) hashMap.get(qgd);
        }
        qgd qgd2 = qgd.a;
        if (hashMap.get(qgd2) != null) {
            return (rgd) hashMap.get(qgd2);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0061 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int g(defpackage.dcg r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L_0x0005
            r1 = r0
            goto L_0x000b
        L_0x0005:
            int r1 = r6.c
            int r1 = defpackage.kne.N(r1)
        L_0x000b:
            dvb r2 = r5.n
            if (r2 != 0) goto L_0x0011
            r2 = r0
            goto L_0x001f
        L_0x0011:
            jv1 r3 = r5.a
            cvb r2 = r2.a
            p4d r2 = r2.e(r3)
            qu1 r2 = r2.a
            int r2 = r2.c()
        L_0x001f:
            dvb r3 = r5.n
            r4 = 1
            if (r3 != 0) goto L_0x0026
        L_0x0024:
            r5 = r4
            goto L_0x0038
        L_0x0026:
            jv1 r5 = r5.a
            cvb r3 = r3.a
            p4d r5 = r3.e(r5)
            qu1 r5 = r5.a
            int r5 = r5.h()
            if (r5 != r4) goto L_0x0037
            goto L_0x0024
        L_0x0037:
            r5 = r0
        L_0x0038:
            int r5 = defpackage.kne.x(r1, r2, r5)
            android.util.Rational r6 = r6.b
            r1 = 90
            if (r5 == r1) goto L_0x0046
            r1 = 270(0x10e, float:3.78E-43)
            if (r5 != r1) goto L_0x0054
        L_0x0046:
            android.util.Rational r5 = new android.util.Rational
            int r1 = r6.getDenominator()
            int r6 = r6.getNumerator()
            r5.<init>(r1, r6)
            r6 = r5
        L_0x0054:
            android.util.Rational r5 = new android.util.Rational
            r1 = 4
            r2 = 3
            r5.<init>(r1, r2)
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0062
            return r0
        L_0x0062:
            android.util.Rational r5 = new android.util.Rational
            r0 = 16
            r1 = 9
            r5.<init>(r0, r1)
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0072
            return r4
        L_0x0072:
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eu1.g(dcg):int");
    }

    public final boolean h(jv1 jv1) {
        boolean z2;
        ev0.g();
        jv1.getClass();
        dvb dvb = this.n;
        if (dvb != null) {
            try {
                cvb cvb = dvb.a;
                cvb.getClass();
                Trace.beginSection(ld9.T("CX:hasCamera"));
                jv1.c(cvb.d.a.v());
                z2 = true;
            } catch (IllegalArgumentException unused) {
                z2 = false;
            } catch (CameraInfoUnavailableException unused2) {
                return false;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
            Trace.endSection();
            return z2;
        }
        throw new IllegalStateException("Camera not initialized. Please wait for the initialization future to finish. See #getInitializationFuture().");
    }

    public final boolean i() {
        return this.m != null;
    }

    public final boolean j() {
        return this.n != null;
    }

    public final void k(dvb dvb) {
        this.n = dvb;
        s();
        r((Runnable) null);
    }

    public final void l(jv1 jv1) {
        ev0.g();
        if (this.a != jv1) {
            Integer b2 = jv1.b();
            if (this.d.F() != 3 || b2 == null || b2.intValue() == 0) {
                jv1 jv12 = this.a;
                this.a = jv1;
                dvb dvb = this.n;
                if (dvb != null) {
                    dvb.b(this.c, this.d, this.e, this.f);
                    r(new ir1(6, (mu7) this, jv12));
                    return;
                }
                return;
            }
            throw new IllegalStateException("Not a front camera despite setting FLASH_MODE_SCREEN");
        }
    }

    public final void m(int i2) {
        ev0.g();
        int i3 = this.b;
        if (i2 != i3) {
            this.b = i2;
            ev0.g();
            if ((this.b & 4) == 0) {
                ev0.g();
                nyc nyc = this.g;
                if (nyc != null && !nyc.a.get()) {
                    ev0.g();
                    nyc nyc2 = this.g;
                    if (nyc2 != null) {
                        nyc2.close();
                        this.g = null;
                    }
                }
            }
            r(new l40((mu7) this, i3, 5));
        }
    }

    public final void n(int i2) {
        ev0.g();
        if (i2 == 3) {
            Integer b2 = this.a.b();
            if (b2 == null || b2.intValue() == 0) {
                rgd f2 = f();
                if (f2 == null) {
                    y87 y87 = this.d;
                    cu1 cu1 = D;
                    y87.getClass();
                    ugd ugd = new ugd(cu1);
                    y87.t = ugd;
                    y87.d().g(ugd);
                } else {
                    y87 y872 = this.d;
                    y872.getClass();
                    ugd ugd2 = new ugd(f2.b);
                    y872.t = ugd2;
                    y872.d().g(ugd2);
                    f2.a.name();
                }
            } else {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN");
            }
        }
        y87 y873 = this.d;
        y873.getClass();
        if (!(i2 == 0 || i2 == 1 || i2 == 2)) {
            if (i2 != 3) {
                throw new IllegalArgumentException(wj6.h(i2, "Invalid flash mode: "));
            } else if (y873.t.a == null) {
                throw new IllegalArgumentException("ScreenFlash not set for FLASH_MODE_SCREEN");
            } else if (y873.c() != null) {
                su1 c2 = y873.c();
                if ((c2 != null ? c2.n().h() : -1) != 0) {
                    throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN");
                }
            }
        }
        synchronized (y873.p) {
            y873.r = i2;
            y873.I();
        }
    }

    public final void o(zqd zqd) {
        ev0.g();
        this.i = zqd;
        if (j()) {
            this.n.b(this.f);
        }
        this.f = e();
        r((Runnable) null);
    }

    public final zz7 p(float f2) {
        ev0.g();
        if (i()) {
            return ((au1) this.m.c.z0.d).d(f2);
        }
        return this.z.l(Float.valueOf(f2));
    }

    public abstract lu7 q();

    public final void r(Runnable runnable) {
        p29 p29;
        p29 p292;
        try {
            this.m = q();
            if (i()) {
                u08 s2 = this.m.c.A0.b.s();
                vb6 vb6 = this.u;
                u08 u08 = vb6.m;
                if (!(u08 == null || (p292 = (p29) vb6.l.e(u08)) == null)) {
                    p292.a.j(p292);
                }
                vb6.m = s2;
                vb6.l(s2, new yr1(2, vb6));
                u08 f2 = this.m.c.A0.b.f();
                vb6 vb62 = this.v;
                u08 u082 = vb62.m;
                if (!(u082 == null || (p29 = (p29) vb62.l.e(u082)) == null)) {
                    p29.a.j(p29);
                }
                vb62.m = f2;
                vb62.l(f2, new yr1(2, vb62));
                yu9 yu9 = this.x;
                yu9.getClass();
                ev0.g();
                v7b v7b = (v7b) yu9.b;
                if (v7b != null) {
                    Boolean bool = (Boolean) v7b.b;
                    boolean booleanValue = bool.booleanValue();
                    ev0.g();
                    zz7 l2 = !i() ? yu9.l(bool) : ((au1) this.m.c.z0.d).k(booleanValue);
                    do1 do1 = (do1) ((v7b) yu9.b).a;
                    Objects.requireNonNull(do1);
                    hd8.N(l2, do1);
                    yu9.b = null;
                }
                yu9 yu92 = this.y;
                yu92.getClass();
                ev0.g();
                v7b v7b2 = (v7b) yu92.b;
                if (v7b2 != null) {
                    Float f3 = (Float) v7b2.b;
                    float floatValue = f3.floatValue();
                    ev0.g();
                    zz7 l3 = !i() ? yu92.l(f3) : ((au1) this.m.c.z0.d).b(floatValue);
                    do1 do12 = (do1) ((v7b) yu92.b).a;
                    Objects.requireNonNull(do12);
                    hd8.N(l3, do12);
                    yu92.b = null;
                }
                yu9 yu93 = this.z;
                yu93.getClass();
                ev0.g();
                v7b v7b3 = (v7b) yu93.b;
                if (v7b3 != null) {
                    zz7 p2 = p(((Float) v7b3.b).floatValue());
                    do1 do13 = (do1) ((v7b) yu93.b).a;
                    Objects.requireNonNull(do13);
                    hd8.N(p2, do13);
                    yu93.b = null;
                }
            }
        } catch (RuntimeException e2) {
            if (runnable != null) {
                runnable.run();
            }
            throw e2;
        }
    }

    public final void s() {
        if (j()) {
            this.n.b(this.c);
        }
        d87 d87 = new d87(2);
        c(d87);
        vy4 vy4 = this.k;
        d87.b.f(m97.E, vy4);
        bub b2 = d87.b();
        this.c = b2;
        aub aub = this.p;
        if (aub != null) {
            b2.E(aub);
        }
        ev0.g();
        Integer valueOf = Integer.valueOf(this.d.o);
        if (j()) {
            this.n.b(this.d);
        }
        int F = this.d.F();
        d87 d872 = new d87(1);
        d872.b.f(z87.b, valueOf);
        c(d872);
        this.d = d872.a();
        n(F);
        Integer num = (Integer) ((j87) this.e.f).k(j87.b, 0);
        num.intValue();
        Integer num2 = (Integer) ((j87) this.e.f).k(j87.c, 6);
        num2.intValue();
        Integer valueOf2 = Integer.valueOf(this.e.E());
        ev0.g();
        if (j()) {
            this.n.b(this.e);
        }
        this.e = d(num, num2, valueOf2);
        if (j()) {
            this.n.b(this.f);
        }
        this.f = e();
    }
}
