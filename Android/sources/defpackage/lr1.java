package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.ImageWriter;
import android.os.Build;
import android.util.ArrayMap;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: lr1  reason: default package */
public final class lr1 implements au1 {
    public final jr1 b;
    public final Executor c;
    public final Object d = new Object();
    public final qt1 e;
    public final xv1 f;
    public final bwd g;
    public final wx5 h;
    public final ce i;
    public final bof j;
    public final he k;
    public final esg l;
    public final gy0 m;
    public final u40 n;
    public final fj o;
    public int p;
    public x87 q;
    public volatile boolean r;
    public volatile int s;
    public final rt6 t;
    public final zq0 u;
    public final AtomicLong v;
    public volatile zz7 w;
    public int x;
    public long y;
    public final hr1 z;

    /* JADX WARNING: type inference failed for: r0v1, types: [bwd, awd] */
    /* JADX WARNING: type inference failed for: r10v7, types: [ce, java.lang.Object] */
    public lr1(qt1 qt1, ew6 ew6, tsd tsd, xv1 xv1, ykb ykb) {
        ? awd = new awd();
        this.g = awd;
        this.p = 0;
        this.r = false;
        this.s = 2;
        this.v = new AtomicLong(0);
        this.w = xa7.c;
        this.x = 1;
        this.y = 0;
        hr1 hr1 = new hr1();
        hr1.b = new HashSet();
        hr1.c = new ArrayMap();
        this.z = hr1;
        this.e = qt1;
        this.f = xv1;
        this.c = tsd;
        this.o = new fj(tsd);
        jr1 jr1 = new jr1(tsd);
        this.b = jr1;
        awd.b.c = this.x;
        awd.b.b(new ax1(jr1));
        awd.b.b(hr1);
        this.k = new he(this, tsd);
        this.h = new wx5(this, ew6, tsd, ykb);
        ? obj = new Object();
        obj.a = false;
        trg trg = new trg(obj);
        obj.b = this;
        obj.c = tsd;
        urg g2 = ce.g(qt1);
        obj.w = g2;
        zrg zrg = new zrg(g2.e(), g2.f());
        obj.o = zrg;
        zrg.f(1.0f);
        obj.v = new u08(db0.e(zrg));
        p(trg);
        this.i = obj;
        this.j = new bof(this, qt1, tsd);
        this.l = new esg(qt1);
        this.t = new rt6(ykb);
        this.u = new zq0(ykb, 2);
        this.m = new gy0(this, tsd);
        this.n = new u40(this, qt1, ykb, tsd, ew6);
    }

    public static int t(qt1 qt1, int i2) {
        int[] iArr = (int[]) qt1.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return w(i2, iArr) ? i2 : w(1, iArr) ? 1 : 0;
    }

    public static boolean w(int i2, int[] iArr) {
        for (int i3 : iArr) {
            if (i2 == i3) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        r4 = (java.lang.Long) ((defpackage.a9f) r4).a.get("CameraControlSessionUpdateId");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean x(android.hardware.camera2.TotalCaptureResult r4, long r5) {
        /*
            android.hardware.camera2.CaptureRequest r0 = r4.getRequest()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            android.hardware.camera2.CaptureRequest r4 = r4.getRequest()
            java.lang.Object r4 = r4.getTag()
            boolean r0 = r4 instanceof defpackage.a9f
            if (r0 == 0) goto L_0x002d
            a9f r4 = (defpackage.a9f) r4
            java.util.Map r4 = r4.a
            java.lang.String r0 = "CameraControlSessionUpdateId"
            java.lang.Object r4 = r4.get(r0)
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 != 0) goto L_0x0023
            return r1
        L_0x0023:
            long r2 = r4.longValue()
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 < 0) goto L_0x002d
            r4 = 1
            return r4
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lr1.x(android.hardware.camera2.TotalCaptureResult, long):boolean");
    }

    public final long A() {
        this.y = this.v.getAndIncrement();
        ((xr1) this.f.b).J();
        return this.y;
    }

    public final void a() {
        fj fjVar = this.o;
        fjVar.getClass();
        ((Executor) fjVar.b).execute(new d9g(fjVar, 0));
    }

    public final zz7 b(float f2) {
        zz7 zz7;
        db0 e2;
        if (!v()) {
            return new xa7(1, new Exception("Camera is not active."));
        }
        ce ceVar = this.i;
        synchronized (((zrg) ceVar.o)) {
            try {
                ((zrg) ceVar.o).e(f2);
                e2 = db0.e((zrg) ceVar.o);
            } catch (IllegalArgumentException e3) {
                zz7 = new xa7(1, e3);
            }
        }
        ceVar.s(e2);
        zz7 = m5a.F(new rrg(ceVar, e2, 1));
        return hd8.J(zz7);
    }

    public final void c(je3 je3) {
        gy0 gy0 = this.m;
        wie E = er7.F(je3).E();
        synchronized (gy0.v) {
            vs6 vs6 = (vs6) gy0.x;
            vs6.getClass();
            ie3 ie3 = ie3.o;
            for (la0 la0 : E.l()) {
                ((pz9) vs6.b).e(la0, ie3, E.n(la0));
            }
        }
        hd8.J(m5a.F(new cr1(gy0, 0))).d(new gc(5), ryg.j());
    }

    public final zz7 d(float f2) {
        zz7 zz7;
        db0 e2;
        if (!v()) {
            return new xa7(1, new Exception("Camera is not active."));
        }
        ce ceVar = this.i;
        synchronized (((zrg) ceVar.o)) {
            try {
                ((zrg) ceVar.o).f(f2);
                e2 = db0.e((zrg) ceVar.o);
            } catch (IllegalArgumentException e3) {
                zz7 = new xa7(1, e3);
            }
        }
        ceVar.s(e2);
        zz7 = m5a.F(new rrg(ceVar, e2, 0));
        return hd8.J(zz7);
    }

    public final Rect e() {
        Rect rect = (Rect) this.e.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if ("robolectric".equals(Build.FINGERPRINT) && rect == null) {
            return new Rect(0, 0, 4000, 3000);
        }
        rect.getClass();
        return rect;
    }

    public final void f(int i2) {
        if (v()) {
            this.s = i2;
            esg esg = this.l;
            boolean z2 = true;
            if (!(this.s == 1 || this.s == 0)) {
                z2 = false;
            }
            esg.d = z2;
            this.w = hd8.J(m5a.F(new d9d(25, this)));
        }
    }

    public final void g(x87 x87) {
        this.q = x87;
    }

    public final zz7 h(u05 u05) {
        if (!v()) {
            return new xa7(1, new Exception("Camera is not active."));
        }
        wx5 wx5 = this.h;
        wx5.getClass();
        return hd8.J(m5a.F(new u52(wx5, u05)));
    }

    public final zz7 i(ArrayList arrayList, int i2, int i3) {
        if (!v()) {
            return new xa7(1, new Exception("Camera is not active."));
        }
        int i4 = this.s;
        oj6 a = oj6.a(hd8.J(this.w));
        fr1 fr1 = new fr1(this, arrayList, i2, i4, i3);
        Executor executor = this.c;
        a.getClass();
        return hd8.b0(a, fr1, executor);
    }

    public final void j(bwd bwd) {
        HashMap hashMap;
        StreamConfigurationMap streamConfigurationMap;
        int[] validOutputFormatsForInput;
        esg esg = this.l;
        qt1 qt1 = esg.a;
        while (true) {
            fsg fsg = esg.b;
            if (fsg.f()) {
                break;
            }
            ((ha7) fsg.c()).close();
        }
        za7 za7 = esg.i;
        StreamConfigurationMap streamConfigurationMap2 = null;
        if (za7 != null) {
            obd obd = esg.g;
            if (obd != null) {
                hd8.J(za7.e).d(new ex1(obd, 2), ryg.G());
                esg.g = null;
            }
            za7.a();
            esg.i = null;
        }
        ImageWriter imageWriter = esg.j;
        if (imageWriter != null) {
            imageWriter.close();
            esg.j = null;
        }
        boolean z2 = esg.c;
        u40 u40 = bwd.b;
        if (z2) {
            u40.c = 1;
        } else if (esg.f) {
            u40.c = 1;
        } else {
            try {
                streamConfigurationMap2 = (StreamConfigurationMap) qt1.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            } catch (AssertionError e2) {
                e2.getMessage();
            }
            if (streamConfigurationMap2 == null || streamConfigurationMap2.getInputFormats() == null) {
                hashMap = new HashMap();
            } else {
                hashMap = new HashMap();
                for (int i2 : streamConfigurationMap2.getInputFormats()) {
                    Size[] inputSizes = streamConfigurationMap2.getInputSizes(i2);
                    if (inputSizes != null) {
                        Arrays.sort(inputSizes, new v93(true));
                        hashMap.put(Integer.valueOf(i2), inputSizes[0]);
                    }
                }
            }
            if (esg.e && !hashMap.isEmpty() && hashMap.containsKey(34) && (streamConfigurationMap = (StreamConfigurationMap) qt1.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (validOutputFormatsForInput = streamConfigurationMap.getValidOutputFormatsForInput(34)) != null) {
                for (int i3 : validOutputFormatsForInput) {
                    if (i3 == 256) {
                        Size size = (Size) hashMap.get(34);
                        vp9 vp9 = new vp9(size.getWidth(), size.getHeight(), 34, 9);
                        esg.h = vp9.b;
                        esg.g = new obd(vp9);
                        vp9.k(new jrf(18, (Object) esg), ryg.F());
                        za7 za72 = new za7(esg.g.getSurface(), new Size(esg.g.getWidth(), esg.g.getHeight()), 34);
                        esg.i = za72;
                        obd obd2 = esg.g;
                        zz7 J = hd8.J(za72.e);
                        Objects.requireNonNull(obd2);
                        J.d(new ex1(obd2, 2), ryg.G());
                        bwd.b(esg.i, vy4.d, -1);
                        fx1 fx1 = esg.h;
                        u40.b(fx1);
                        ArrayList arrayList = bwd.e;
                        if (!arrayList.contains(fx1)) {
                            arrayList.add(fx1);
                        }
                        kt1 kt1 = new kt1(2, esg);
                        ArrayList arrayList2 = bwd.d;
                        if (!arrayList2.contains(kt1)) {
                            arrayList2.add(kt1);
                        }
                        bwd.g = new InputConfiguration(esg.g.getWidth(), esg.g.getHeight(), esg.g.f());
                        return;
                    }
                }
            }
            u40.c = 1;
        }
    }

    public final zz7 k(boolean z2) {
        zz7 zz7;
        if (!v()) {
            return new xa7(1, new Exception("Camera is not active."));
        }
        bof bof = this.j;
        if (!bof.c) {
            zz7 = new xa7(1, new IllegalStateException("No flash unit"));
        } else {
            bof.b(bof.b, Integer.valueOf(z2 ? 1 : 0));
            zz7 = m5a.F(new h62(bof, z2, 8));
        }
        return hd8.J(zz7);
    }

    public final zz7 l(int i2, int i3) {
        if (!v()) {
            return new xa7(1, new Exception("Camera is not active."));
        }
        int i4 = this.s;
        oj6 a = oj6.a(hd8.J(this.w));
        gr1 gr1 = new gr1(this, i2, i4, i3);
        Executor executor = this.c;
        a.getClass();
        return hd8.b0(a, gr1, executor);
    }

    public final je3 m() {
        wie wie;
        gy0 gy0 = this.m;
        synchronized (gy0.v) {
            vs6 vs6 = (vs6) gy0.x;
            vs6.getClass();
            wie = new wie(9, (Object) c5b.a((pz9) vs6.b));
        }
        return wie;
    }

    public final void n() {
        gy0 gy0 = this.m;
        synchronized (gy0.v) {
            gy0.x = new vs6(8);
        }
        hd8.J(m5a.F(new cr1(gy0, 1))).d(new gc(5), ryg.j());
    }

    public final void o() {
        fj fjVar = this.o;
        fjVar.getClass();
        ((Executor) fjVar.b).execute(new d9g(fjVar, 1));
    }

    public final void p(kr1 kr1) {
        ((HashSet) this.b.b).add(kr1);
    }

    public final void q() {
        synchronized (this.d) {
            try {
                int i2 = this.p;
                if (i2 != 0) {
                    this.p = i2 - 1;
                } else {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r(boolean z2) {
        this.r = z2;
        if (!z2) {
            u40 u40 = new u40();
            u40.c = this.x;
            u40.b = true;
            pz9 c2 = pz9.c();
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
            c2.f(vs1.o0(key), Integer.valueOf(t(this.e, 1)));
            c2.f(vs1.o0(CaptureRequest.FLASH_MODE), 0);
            u40.c(new wie(9, (Object) c5b.a(c2)));
            z(Collections.singletonList(u40.d()));
        }
        A();
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final defpackage.fwd s() {
        /*
            r9 = this;
            bwd r0 = r9.g
            int r1 = r9.x
            u40 r2 = r0.b
            r2.c = r1
            vs6 r1 = new vs6
            r2 = 8
            r1.<init>((int) r2)
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            r3 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r1.w(r2, r4)
            wx5 r2 = r9.h
            boolean r4 = r2.g
            r5 = 3
            if (r4 == 0) goto L_0x0022
            r4 = r3
            goto L_0x0029
        L_0x0022:
            int r4 = r2.n
            if (r4 == r5) goto L_0x0028
            r4 = 4
            goto L_0x0029
        L_0x0028:
            r4 = r5
        L_0x0029:
            android.hardware.camera2.CaptureRequest$Key r6 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            lr1 r7 = r2.a
            int r4 = r7.u(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.w(r6, r4)
            android.hardware.camera2.params.MeteringRectangle[] r4 = r2.q
            int r6 = r4.length
            if (r6 == 0) goto L_0x0042
            android.hardware.camera2.CaptureRequest$Key r6 = android.hardware.camera2.CaptureRequest.CONTROL_AF_REGIONS
            r1.w(r6, r4)
        L_0x0042:
            android.hardware.camera2.params.MeteringRectangle[] r4 = r2.r
            int r6 = r4.length
            if (r6 == 0) goto L_0x004c
            android.hardware.camera2.CaptureRequest$Key r6 = android.hardware.camera2.CaptureRequest.CONTROL_AE_REGIONS
            r1.w(r6, r4)
        L_0x004c:
            android.hardware.camera2.params.MeteringRectangle[] r2 = r2.s
            int r4 = r2.length
            if (r4 == 0) goto L_0x0056
            android.hardware.camera2.CaptureRequest$Key r4 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_REGIONS
            r1.w(r4, r2)
        L_0x0056:
            rt6 r2 = r9.t
            java.lang.Object r2 = r2.b
            android.util.Range r2 = (android.util.Range) r2
            if (r2 == 0) goto L_0x0063
            android.hardware.camera2.CaptureRequest$Key r4 = android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE
            r1.w(r4, r2)
        L_0x0063:
            ce r2 = r9.i
            java.lang.Object r2 = r2.w
            urg r2 = (defpackage.urg) r2
            r2.d(r1)
            wx5 r2 = r9.h
            boolean r2 = r2.v
            if (r2 == 0) goto L_0x0074
            r2 = 5
            goto L_0x0075
        L_0x0074:
            r2 = r3
        L_0x0075:
            boolean r4 = r9.r
            r6 = 2
            if (r4 == 0) goto L_0x0084
            android.hardware.camera2.CaptureRequest$Key r4 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r1.w(r4, r5)
            goto L_0x008c
        L_0x0084:
            int r4 = r9.s
            if (r4 == 0) goto L_0x0090
            if (r4 == r3) goto L_0x009c
            if (r4 == r6) goto L_0x008e
        L_0x008c:
            r5 = r2
            goto L_0x009c
        L_0x008e:
            r5 = r3
            goto L_0x009c
        L_0x0090:
            zq0 r2 = r9.u
            boolean r4 = r2.a
            if (r4 != 0) goto L_0x008e
            boolean r2 = r2.b
            if (r2 == 0) goto L_0x009b
            goto L_0x008e
        L_0x009b:
            r5 = r6
        L_0x009c:
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
            qt1 r4 = r9.e
            int r4 = t(r4, r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.w(r2, r4)
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_MODE
            qt1 r4 = r9.e
            android.hardware.camera2.CameraCharacteristics$Key r5 = android.hardware.camera2.CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES
            java.lang.Object r4 = r4.a(r5)
            int[] r4 = (int[]) r4
            r5 = 0
            if (r4 != 0) goto L_0x00bc
        L_0x00ba:
            r3 = r5
            goto L_0x00c9
        L_0x00bc:
            boolean r6 = w(r3, r4)
            if (r6 == 0) goto L_0x00c3
            goto L_0x00c9
        L_0x00c3:
            boolean r4 = w(r3, r4)
            if (r4 == 0) goto L_0x00ba
        L_0x00c9:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.w(r2, r3)
            he r2 = r9.k
            r2.getClass()
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION
            java.lang.Object r2 = r2.c
            ni0 r2 = (defpackage.ni0) r2
            java.lang.Object r4 = r2.c
            monitor-enter(r4)
            int r2 = r2.b     // Catch:{ all -> 0x0151 }
            monitor-exit(r4)     // Catch:{ all -> 0x0151 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.w(r3, r2)
            gy0 r2 = r9.m
            java.lang.Object r3 = r2.v
            monitor-enter(r3)
            java.lang.Object r2 = r2.x     // Catch:{ all -> 0x014e }
            vs6 r2 = (defpackage.vs6) r2     // Catch:{ all -> 0x014e }
            java.lang.Object r2 = r2.b     // Catch:{ all -> 0x014e }
            pz9 r2 = (defpackage.pz9) r2     // Catch:{ all -> 0x014e }
            ie3 r4 = defpackage.ie3.a     // Catch:{ all -> 0x014e }
            java.util.Set r5 = r2.l()     // Catch:{ all -> 0x014e }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x014e }
        L_0x00ff:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x014e }
            if (r6 == 0) goto L_0x0117
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x014e }
            la0 r6 = (defpackage.la0) r6     // Catch:{ all -> 0x014e }
            java.lang.Object r7 = r1.b     // Catch:{ all -> 0x014e }
            pz9 r7 = (defpackage.pz9) r7     // Catch:{ all -> 0x014e }
            java.lang.Object r8 = r2.n(r6)     // Catch:{ all -> 0x014e }
            r7.e(r6, r4, r8)     // Catch:{ all -> 0x014e }
            goto L_0x00ff
        L_0x0117:
            monitor-exit(r3)     // Catch:{ all -> 0x014e }
            vs1 r2 = new vs1
            java.lang.Object r1 = r1.b
            pz9 r1 = (defpackage.pz9) r1
            c5b r1 = defpackage.c5b.a(r1)
            r3 = 9
            r2.<init>((int) r3, (java.lang.Object) r1)
            u40 r0 = r0.b
            r0.getClass()
            pz9 r1 = defpackage.pz9.d(r2)
            r0.f = r1
            bwd r0 = r9.g
            java.lang.String r1 = "CameraControlSessionUpdateId"
            long r2 = r9.y
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            u40 r0 = r0.b
            java.lang.Object r0 = r0.g
            uz9 r0 = (defpackage.uz9) r0
            java.util.Map r0 = r0.a
            r0.put(r1, r2)
            bwd r9 = r9.g
            fwd r9 = r9.c()
            return r9
        L_0x014e:
            r9 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x014e }
            throw r9
        L_0x0151:
            r9 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0151 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lr1.s():fwd");
    }

    public final int u(int i2) {
        int[] iArr = (int[]) this.e.a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (w(i2, iArr)) {
            return i2;
        }
        if (w(4, iArr)) {
            return 4;
        }
        return w(1, iArr) ? 1 : 0;
    }

    public final boolean v() {
        int i2;
        synchronized (this.d) {
            i2 = this.p;
        }
        return i2 > 0;
    }

    public final void y(boolean z2) {
        db0 e2;
        wx5 wx5 = this.h;
        if (z2 != wx5.d) {
            wx5.d = z2;
            if (!wx5.d) {
                wx5.b();
            }
        }
        ce ceVar = this.i;
        if (ceVar.a != z2) {
            ceVar.a = z2;
            if (!z2) {
                synchronized (((zrg) ceVar.o)) {
                    ((zrg) ceVar.o).f(1.0f);
                    e2 = db0.e((zrg) ceVar.o);
                }
                ceVar.s(e2);
                ((urg) ceVar.w).l();
                ((lr1) ceVar.b).A();
            }
        }
        bof bof = this.j;
        if (bof.e != z2) {
            bof.e = z2;
            if (!z2) {
                if (bof.g) {
                    bof.g = false;
                    bof.a.r(false);
                    bof.b(bof.b, 0);
                }
                do1 do1 = bof.f;
                if (do1 != null) {
                    do1.d(new Exception("Camera is not active."));
                    bof.f = null;
                }
            }
        }
        he heVar = this.k;
        if (z2 != heVar.b) {
            heVar.b = z2;
            if (!z2) {
                ni0 ni0 = (ni0) heVar.c;
                synchronized (ni0.c) {
                    ni0.b = 0;
                }
            }
        }
        gy0 gy0 = this.m;
        gy0.getClass();
        ((Executor) gy0.o).execute(new c70((Object) gy0, z2, 6));
        if (!z2) {
            this.q = null;
            ((AtomicInteger) this.o.c).set(0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x007c, code lost:
        r7 = r3.h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void z(java.util.List r21) {
        /*
            r20 = this;
            r0 = r20
            xv1 r0 = r0.f
            r0.getClass()
            r21.getClass()
            r1 = r21
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.b
            xr1 r0 = (defpackage.xr1) r0
            r0.getClass()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x001e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x018f
            java.lang.Object r3 = r1.next()
            bx1 r3 = (defpackage.bx1) r3
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            defpackage.pz9.c()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            defpackage.uz9.a()
            java.util.List r6 = r3.a
            r4.addAll(r6)
            je3 r6 = r3.b
            pz9 r6 = defpackage.pz9.d(r6)
            java.util.List r7 = r3.e
            r5.addAll(r7)
            android.util.ArrayMap r7 = new android.util.ArrayMap
            r7.<init>()
            a9f r8 = r3.g
            java.util.Map r9 = r8.a
            java.util.Set r9 = r9.keySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x005b:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0071
            java.lang.Object r10 = r9.next()
            java.lang.String r10 = (java.lang.String) r10
            java.util.Map r11 = r8.a
            java.lang.Object r11 = r11.get(r10)
            r7.put(r10, r11)
            goto L_0x005b
        L_0x0071:
            uz9 r8 = new uz9
            r8.<init>(r7)
            r7 = 5
            int r9 = r3.c
            r10 = 0
            if (r9 != r7) goto L_0x0083
            it1 r7 = r3.h
            if (r7 == 0) goto L_0x0083
            r19 = r7
            goto L_0x0085
        L_0x0083:
            r19 = r10
        L_0x0085:
            java.util.List r7 = r3.a
            java.util.List r7 = java.util.Collections.unmodifiableList(r7)
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x0140
            boolean r7 = r3.f
            if (r7 == 0) goto L_0x0140
            boolean r7 = r4.isEmpty()
            if (r7 != 0) goto L_0x009c
            goto L_0x001e
        L_0x009c:
            bpa r7 = r0.a
            r7.getClass()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.lang.Object r7 = r7.b
            java.util.LinkedHashMap r7 = (java.util.LinkedHashMap) r7
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x00b2:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x00d8
            java.lang.Object r10 = r7.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r11 = r10.getValue()
            xzf r11 = (defpackage.xzf) r11
            boolean r12 = r11.f
            if (r12 == 0) goto L_0x00b2
            boolean r11 = r11.e
            if (r11 == 0) goto L_0x00b2
            java.lang.Object r10 = r10.getValue()
            xzf r10 = (defpackage.xzf) r10
            fwd r10 = r10.a
            r9.add(r10)
            goto L_0x00b2
        L_0x00d8:
            java.util.Collection r7 = java.util.Collections.unmodifiableCollection(r9)
            java.util.Iterator r7 = r7.iterator()
        L_0x00e0:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x0138
            java.lang.Object r9 = r7.next()
            fwd r9 = (defpackage.fwd) r9
            bx1 r9 = r9.g
            java.util.List r10 = r9.a
            java.util.List r10 = java.util.Collections.unmodifiableList(r10)
            boolean r11 = r10.isEmpty()
            if (r11 != 0) goto L_0x00e0
            int r11 = r9.b()
            if (r11 == 0) goto L_0x010f
            int r11 = r9.b()
            if (r11 == 0) goto L_0x010f
            la0 r12 = defpackage.zzf.s0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r6.f(r12, r11)
        L_0x010f:
            int r11 = r9.c()
            if (r11 == 0) goto L_0x0124
            int r9 = r9.c()
            if (r9 == 0) goto L_0x0124
            la0 r11 = defpackage.zzf.t0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r6.f(r11, r9)
        L_0x0124:
            java.util.Iterator r9 = r10.iterator()
        L_0x0128:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00e0
            java.lang.Object r10 = r9.next()
            lk4 r10 = (defpackage.lk4) r10
            r4.add(r10)
            goto L_0x0128
        L_0x0138:
            boolean r7 = r4.isEmpty()
            if (r7 == 0) goto L_0x0140
            goto L_0x001e
        L_0x0140:
            bx1 r7 = new bx1
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r4)
            c5b r13 = defpackage.c5b.a(r6)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r5)
            a9f r5 = defpackage.a9f.b
            android.util.ArrayMap r5 = new android.util.ArrayMap
            r5.<init>()
            java.util.Map r6 = r8.a
            java.util.Set r8 = r6.keySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x0161:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0175
            java.lang.Object r9 = r8.next()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r6.get(r9)
            r5.put(r9, r10)
            goto L_0x0161
        L_0x0175:
            a9f r6 = new a9f
            r6.<init>(r5)
            int r14 = r3.c
            boolean r15 = r3.d
            boolean r3 = r3.f
            r11 = r7
            r16 = r4
            r17 = r3
            r18 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            r2.add(r7)
            goto L_0x001e
        L_0x018f:
            r0.toString()
            jx1 r0 = r0.Z
            r0.j(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lr1.z(java.util.List):void");
    }
}
