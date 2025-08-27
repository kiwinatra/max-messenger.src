package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: rv1  reason: default package */
public final class rv1 implements ys1 {
    public final p4d A0;
    public final p4d B0;
    public final es7 C0;
    public final es7 D0;
    public List X = Collections.emptyList();
    public final rt1 Y;
    public final Object Z = new Object();
    public final su1 a;
    public final su1 b;
    public final ox0 c;
    public final c0g o;
    public final ia0 v;
    public boolean v0 = true;
    public final ArrayList w = new ArrayList();
    public je3 w0 = null;
    public final ArrayList x = new ArrayList();
    public vzf x0;
    public final mqf y;
    public kxe y0;
    public dcg z;
    public final o4d z0;

    public rv1(su1 su1, su1 su12, p4d p4d, p4d p4d2, mqf mqf, ox0 ox0, xs1 xs1) {
        es7 es7 = es7.f;
        this.a = su1;
        this.b = su12;
        this.C0 = es7;
        this.D0 = es7;
        this.y = mqf;
        this.c = ox0;
        this.o = xs1;
        rt1 rt1 = p4d.c;
        this.Y = rt1;
        rt1.Q();
        this.z0 = new o4d(su1.f());
        this.A0 = p4d;
        this.B0 = p4d2;
        this.v = s(p4d, p4d2);
    }

    public static Matrix o(Rect rect, Size size) {
        bs0.m("Cannot compute viewport crop rects zero sized sensor rect.", rect.width() > 0 && rect.height() > 0);
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (float) size.getWidth(), (float) size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    public static ia0 s(p4d p4d, p4d p4d2) {
        StringBuilder sb = new StringBuilder();
        sb.append(p4d.a.e());
        sb.append(p4d2 == null ? "" : p4d2.a.e());
        return new ia0(sb.toString(), ((tt1) p4d.c).a);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, qv1] */
    public static HashMap t(ArrayList arrayList, c0g c0g, c0g c0g2) {
        zzf zzf;
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            vzf vzf = (vzf) it.next();
            if (vzf instanceof kxe) {
                kxe kxe = (kxe) vzf;
                zzf f = new d87(2).b().f(false, c0g);
                if (f == null) {
                    zzf = null;
                } else {
                    pz9 d = pz9.d(f);
                    d.a.remove(cdf.h0);
                    zzf = ((bpa) kxe.k(d)).s();
                }
            } else {
                zzf = vzf.f(false, c0g);
            }
            zzf f2 = vzf.f(true, c0g2);
            ? obj = new Object();
            obj.a = zzf;
            obj.b = f2;
            hashMap.put(vzf, obj);
        }
        return hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean x(defpackage.hc0 r4, defpackage.fwd r5) {
        /*
            bx1 r0 = r5.g
            je3 r0 = r0.b
            je3 r4 = r4.d
            java.util.Set r1 = r4.l()
            int r1 = r1.size()
            bx1 r5 = r5.g
            je3 r5 = r5.b
            java.util.Set r5 = r5.l()
            int r5 = r5.size()
            r2 = 1
            if (r1 == r5) goto L_0x001e
            return r2
        L_0x001e:
            java.util.Set r5 = r4.l()
            java.util.Iterator r5 = r5.iterator()
        L_0x0026:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0047
            java.lang.Object r1 = r5.next()
            la0 r1 = (defpackage.la0) r1
            boolean r3 = r0.u(r1)
            if (r3 == 0) goto L_0x0046
            java.lang.Object r3 = r0.n(r1)
            java.lang.Object r1 = r4.n(r1)
            boolean r1 = java.util.Objects.equals(r3, r1)
            if (r1 != 0) goto L_0x0026
        L_0x0046:
            return r2
        L_0x0047:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rv1.x(hc0, fwd):boolean");
    }

    public static ArrayList z(ArrayList arrayList, List list) {
        ArrayList arrayList2 = new ArrayList(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((vzf) it.next()).getClass();
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                rae.w(it2.next());
                throw null;
            }
        }
        return arrayList2;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void A(java.util.LinkedHashSet r20, boolean r21, boolean r22) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            java.lang.Object r9 = r7.Z
            monitor-enter(r9)
            r19.w()     // Catch:{ all -> 0x0100 }
            java.lang.Object r1 = r7.Z     // Catch:{ all -> 0x0100 }
            monitor-enter(r1)     // Catch:{ all -> 0x0100 }
            java.util.List r0 = r7.X     // Catch:{ all -> 0x0052 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0052 }
            r11 = 1
            if (r0 != 0) goto L_0x0055
            java.util.Iterator r0 = r20.iterator()     // Catch:{ all -> 0x0052 }
        L_0x001a:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0052 }
            if (r2 == 0) goto L_0x0046
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0052 }
            vzf r2 = (defpackage.vzf) r2     // Catch:{ all -> 0x0052 }
            boolean r3 = r2 instanceof defpackage.y87     // Catch:{ all -> 0x0052 }
            if (r3 != 0) goto L_0x002b
            goto L_0x001a
        L_0x002b:
            zzf r2 = r2.f     // Catch:{ all -> 0x0052 }
            la0 r3 = defpackage.z87.w     // Catch:{ all -> 0x0052 }
            boolean r4 = r2.u(r3)     // Catch:{ all -> 0x0052 }
            if (r4 == 0) goto L_0x001a
            java.lang.Object r2 = r2.n(r3)     // Catch:{ all -> 0x0052 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0052 }
            r2.getClass()     // Catch:{ all -> 0x0052 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x0052 }
            if (r2 != r11) goto L_0x001a
            r0 = r11
            goto L_0x0047
        L_0x0046:
            r0 = 0
        L_0x0047:
            if (r0 != 0) goto L_0x004a
            goto L_0x0055
        L_0x004a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0052 }
            java.lang.String r2 = "Ultra HDR image capture does not support for use with CameraEffect."
            r0.<init>(r2)     // Catch:{ all -> 0x0052 }
            throw r0     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r0 = move-exception
            goto L_0x0262
        L_0x0055:
            monitor-exit(r1)     // Catch:{ all -> 0x0052 }
            if (r21 != 0) goto L_0x005b
            r19.w()     // Catch:{ all -> 0x0100 }
        L_0x005b:
            kxe r0 = r19.q(r20, r21)     // Catch:{ all -> 0x0100 }
            vzf r12 = r7.h(r8, r0)     // Catch:{ all -> 0x0100 }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x0100 }
            r13.<init>(r8)     // Catch:{ all -> 0x0100 }
            if (r12 == 0) goto L_0x006d
            r13.add(r12)     // Catch:{ all -> 0x0100 }
        L_0x006d:
            if (r0 == 0) goto L_0x0079
            r13.add(r0)     // Catch:{ all -> 0x0100 }
            idg r1 = r0.p     // Catch:{ all -> 0x0100 }
            java.util.Set r1 = r1.a     // Catch:{ all -> 0x0100 }
            r13.removeAll(r1)     // Catch:{ all -> 0x0100 }
        L_0x0079:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x0100 }
            r14.<init>(r13)     // Catch:{ all -> 0x0100 }
            java.util.ArrayList r1 = r7.x     // Catch:{ all -> 0x0100 }
            r14.removeAll(r1)     // Catch:{ all -> 0x0100 }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x0100 }
            r15.<init>(r13)     // Catch:{ all -> 0x0100 }
            java.util.ArrayList r1 = r7.x     // Catch:{ all -> 0x0100 }
            r15.retainAll(r1)     // Catch:{ all -> 0x0100 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0100 }
            java.util.ArrayList r1 = r7.x     // Catch:{ all -> 0x0100 }
            r6.<init>(r1)     // Catch:{ all -> 0x0100 }
            r6.removeAll(r13)     // Catch:{ all -> 0x0100 }
            rt1 r1 = r7.Y     // Catch:{ all -> 0x0100 }
            a0g r2 = defpackage.c0g.a     // Catch:{ all -> 0x0100 }
            la0 r3 = defpackage.rt1.g     // Catch:{ all -> 0x0100 }
            java.lang.Object r1 = r1.k(r3, r2)     // Catch:{ all -> 0x0100 }
            c0g r1 = (defpackage.c0g) r1     // Catch:{ all -> 0x0100 }
            c0g r2 = r7.o     // Catch:{ all -> 0x0100 }
            java.util.HashMap r5 = t(r14, r1, r2)     // Catch:{ all -> 0x0100 }
            java.util.Map r16 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0100 }
            r4 = 2
            java.lang.Object r1 = r7.Z     // Catch:{ IllegalArgumentException -> 0x0247 }
            monitor-enter(r1)     // Catch:{ IllegalArgumentException -> 0x0247 }
            mqf r2 = r7.y     // Catch:{ all -> 0x00ba }
            int r2 = r2.b     // Catch:{ all -> 0x00ba }
            if (r2 != r4) goto L_0x00be
            monitor-exit(r1)     // Catch:{ all -> 0x00ba }
            r2 = r11
            goto L_0x00c0
        L_0x00ba:
            r0 = move-exception
            r10 = r4
            goto L_0x024a
        L_0x00be:
            monitor-exit(r1)     // Catch:{ all -> 0x00ba }
            r2 = 0
        L_0x00c0:
            su1 r1 = r7.a     // Catch:{ IllegalArgumentException -> 0x0247 }
            qu1 r3 = r1.n()     // Catch:{ IllegalArgumentException -> 0x0247 }
            r1 = r19
            r10 = r4
            r4 = r14
            r17 = r5
            r5 = r15
            r18 = r6
            r6 = r17
            java.util.HashMap r6 = r1.p(r2, r3, r4, r5, r6)     // Catch:{ IllegalArgumentException -> 0x0103 }
            su1 r1 = r7.b     // Catch:{ IllegalArgumentException -> 0x0103 }
            if (r1 == 0) goto L_0x0108
            java.lang.Object r1 = r7.Z     // Catch:{ IllegalArgumentException -> 0x0103 }
            monitor-enter(r1)     // Catch:{ IllegalArgumentException -> 0x0103 }
            mqf r2 = r7.y     // Catch:{ all -> 0x00e5 }
            int r2 = r2.b     // Catch:{ all -> 0x00e5 }
            if (r2 != r10) goto L_0x00e7
            monitor-exit(r1)     // Catch:{ all -> 0x00e5 }
            r2 = r11
            goto L_0x00e9
        L_0x00e5:
            r0 = move-exception
            goto L_0x0106
        L_0x00e7:
            monitor-exit(r1)     // Catch:{ all -> 0x00e5 }
            r2 = 0
        L_0x00e9:
            su1 r1 = r7.b     // Catch:{ IllegalArgumentException -> 0x0103 }
            java.util.Objects.requireNonNull(r1)     // Catch:{ IllegalArgumentException -> 0x0103 }
            qu1 r3 = r1.n()     // Catch:{ IllegalArgumentException -> 0x0103 }
            r1 = r19
            r4 = r14
            r5 = r15
            r11 = r6
            r6 = r17
            java.util.HashMap r16 = r1.p(r2, r3, r4, r5, r6)     // Catch:{ IllegalArgumentException -> 0x0103 }
        L_0x00fd:
            r1 = r16
            goto L_0x010a
        L_0x0100:
            r0 = move-exception
            goto L_0x0264
        L_0x0103:
            r0 = move-exception
            goto L_0x024e
        L_0x0106:
            monitor-exit(r1)     // Catch:{ all -> 0x00e5 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0103 }
        L_0x0108:
            r11 = r6
            goto L_0x00fd
        L_0x010a:
            r7.B(r11, r13)     // Catch:{ all -> 0x0100 }
            java.util.List r2 = r7.X     // Catch:{ all -> 0x0100 }
            java.util.ArrayList r2 = z(r13, r2)     // Catch:{ all -> 0x0100 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0100 }
            r3.<init>(r8)     // Catch:{ all -> 0x0100 }
            r3.removeAll(r13)     // Catch:{ all -> 0x0100 }
            java.util.ArrayList r2 = z(r3, r2)     // Catch:{ all -> 0x0100 }
            int r3 = r2.size()     // Catch:{ all -> 0x0100 }
            if (r3 <= 0) goto L_0x0128
            r2.toString()     // Catch:{ all -> 0x0100 }
        L_0x0128:
            java.util.Iterator r2 = r18.iterator()     // Catch:{ all -> 0x0100 }
        L_0x012c:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0100 }
            if (r3 == 0) goto L_0x013e
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0100 }
            vzf r3 = (defpackage.vzf) r3     // Catch:{ all -> 0x0100 }
            su1 r4 = r7.a     // Catch:{ all -> 0x0100 }
            r3.B(r4)     // Catch:{ all -> 0x0100 }
            goto L_0x012c
        L_0x013e:
            su1 r2 = r7.a     // Catch:{ all -> 0x0100 }
            r3 = r18
            r2.k(r3)     // Catch:{ all -> 0x0100 }
            su1 r2 = r7.b     // Catch:{ all -> 0x0100 }
            if (r2 == 0) goto L_0x016a
            java.util.Iterator r2 = r3.iterator()     // Catch:{ all -> 0x0100 }
        L_0x014d:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0100 }
            if (r4 == 0) goto L_0x0162
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0100 }
            vzf r4 = (defpackage.vzf) r4     // Catch:{ all -> 0x0100 }
            su1 r5 = r7.b     // Catch:{ all -> 0x0100 }
            java.util.Objects.requireNonNull(r5)     // Catch:{ all -> 0x0100 }
            r4.B(r5)     // Catch:{ all -> 0x0100 }
            goto L_0x014d
        L_0x0162:
            su1 r2 = r7.b     // Catch:{ all -> 0x0100 }
            java.util.Objects.requireNonNull(r2)     // Catch:{ all -> 0x0100 }
            r2.k(r3)     // Catch:{ all -> 0x0100 }
        L_0x016a:
            boolean r2 = r3.isEmpty()     // Catch:{ all -> 0x0100 }
            if (r2 == 0) goto L_0x01af
            java.util.Iterator r2 = r15.iterator()     // Catch:{ all -> 0x0100 }
        L_0x0174:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0100 }
            if (r3 == 0) goto L_0x01af
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0100 }
            vzf r3 = (defpackage.vzf) r3     // Catch:{ all -> 0x0100 }
            boolean r4 = r11.containsKey(r3)     // Catch:{ all -> 0x0100 }
            if (r4 == 0) goto L_0x0174
            java.lang.Object r4 = r11.get(r3)     // Catch:{ all -> 0x0100 }
            hc0 r4 = (defpackage.hc0) r4     // Catch:{ all -> 0x0100 }
            je3 r5 = r4.d     // Catch:{ all -> 0x0100 }
            if (r5 == 0) goto L_0x0174
            fwd r6 = r3.m     // Catch:{ all -> 0x0100 }
            boolean r4 = x(r4, r6)     // Catch:{ all -> 0x0100 }
            if (r4 == 0) goto L_0x0174
            hc0 r4 = r3.v(r5)     // Catch:{ all -> 0x0100 }
            r3.g = r4     // Catch:{ all -> 0x0100 }
            boolean r4 = r7.v0     // Catch:{ all -> 0x0100 }
            if (r4 == 0) goto L_0x0174
            su1 r4 = r7.a     // Catch:{ all -> 0x0100 }
            r4.h(r3)     // Catch:{ all -> 0x0100 }
            su1 r4 = r7.b     // Catch:{ all -> 0x0100 }
            if (r4 == 0) goto L_0x0174
            r4.h(r3)     // Catch:{ all -> 0x0100 }
            goto L_0x0174
        L_0x01af:
            java.util.Iterator r2 = r14.iterator()     // Catch:{ all -> 0x0100 }
        L_0x01b3:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0100 }
            if (r3 == 0) goto L_0x0209
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0100 }
            vzf r3 = (defpackage.vzf) r3     // Catch:{ all -> 0x0100 }
            r4 = r17
            java.lang.Object r5 = r4.get(r3)     // Catch:{ all -> 0x0100 }
            qv1 r5 = (defpackage.qv1) r5     // Catch:{ all -> 0x0100 }
            java.util.Objects.requireNonNull(r5)     // Catch:{ all -> 0x0100 }
            su1 r6 = r7.b     // Catch:{ all -> 0x0100 }
            if (r6 == 0) goto L_0x01ed
            su1 r10 = r7.a     // Catch:{ all -> 0x0100 }
            zzf r15 = r5.a     // Catch:{ all -> 0x0100 }
            zzf r5 = r5.b     // Catch:{ all -> 0x0100 }
            r3.a(r10, r6, r15, r5)     // Catch:{ all -> 0x0100 }
            java.lang.Object r5 = r11.get(r3)     // Catch:{ all -> 0x0100 }
            hc0 r5 = (defpackage.hc0) r5     // Catch:{ all -> 0x0100 }
            r5.getClass()     // Catch:{ all -> 0x0100 }
            java.lang.Object r6 = r1.get(r3)     // Catch:{ all -> 0x0100 }
            hc0 r6 = (defpackage.hc0) r6     // Catch:{ all -> 0x0100 }
            hc0 r5 = r3.w(r5, r6)     // Catch:{ all -> 0x0100 }
            r3.g = r5     // Catch:{ all -> 0x0100 }
            goto L_0x0206
        L_0x01ed:
            su1 r6 = r7.a     // Catch:{ all -> 0x0100 }
            zzf r10 = r5.a     // Catch:{ all -> 0x0100 }
            zzf r5 = r5.b     // Catch:{ all -> 0x0100 }
            r15 = 0
            r3.a(r6, r15, r10, r5)     // Catch:{ all -> 0x0100 }
            java.lang.Object r5 = r11.get(r3)     // Catch:{ all -> 0x0100 }
            hc0 r5 = (defpackage.hc0) r5     // Catch:{ all -> 0x0100 }
            r5.getClass()     // Catch:{ all -> 0x0100 }
            hc0 r5 = r3.w(r5, r15)     // Catch:{ all -> 0x0100 }
            r3.g = r5     // Catch:{ all -> 0x0100 }
        L_0x0206:
            r17 = r4
            goto L_0x01b3
        L_0x0209:
            boolean r1 = r7.v0     // Catch:{ all -> 0x0100 }
            if (r1 == 0) goto L_0x0219
            su1 r1 = r7.a     // Catch:{ all -> 0x0100 }
            r1.j(r14)     // Catch:{ all -> 0x0100 }
            su1 r1 = r7.b     // Catch:{ all -> 0x0100 }
            if (r1 == 0) goto L_0x0219
            r1.j(r14)     // Catch:{ all -> 0x0100 }
        L_0x0219:
            java.util.Iterator r1 = r14.iterator()     // Catch:{ all -> 0x0100 }
        L_0x021d:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0100 }
            if (r2 == 0) goto L_0x022d
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0100 }
            vzf r2 = (defpackage.vzf) r2     // Catch:{ all -> 0x0100 }
            r2.p()     // Catch:{ all -> 0x0100 }
            goto L_0x021d
        L_0x022d:
            java.util.ArrayList r1 = r7.w     // Catch:{ all -> 0x0100 }
            r1.clear()     // Catch:{ all -> 0x0100 }
            java.util.ArrayList r1 = r7.w     // Catch:{ all -> 0x0100 }
            r1.addAll(r8)     // Catch:{ all -> 0x0100 }
            java.util.ArrayList r1 = r7.x     // Catch:{ all -> 0x0100 }
            r1.clear()     // Catch:{ all -> 0x0100 }
            java.util.ArrayList r1 = r7.x     // Catch:{ all -> 0x0100 }
            r1.addAll(r13)     // Catch:{ all -> 0x0100 }
            r7.x0 = r12     // Catch:{ all -> 0x0100 }
            r7.y0 = r0     // Catch:{ all -> 0x0100 }
            monitor-exit(r9)     // Catch:{ all -> 0x0100 }
            return
        L_0x0247:
            r0 = move-exception
            r10 = r4
            goto L_0x024e
        L_0x024a:
            monitor-exit(r1)     // Catch:{ all -> 0x024c }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0103 }
        L_0x024c:
            r0 = move-exception
            goto L_0x024a
        L_0x024e:
            if (r21 != 0) goto L_0x0261
            r19.w()     // Catch:{ all -> 0x0100 }
            mqf r1 = r7.y     // Catch:{ all -> 0x0100 }
            int r1 = r1.b     // Catch:{ all -> 0x0100 }
            if (r1 == r10) goto L_0x0261
            r1 = r22
            r2 = 1
            r7.A(r8, r2, r1)     // Catch:{ all -> 0x0100 }
            monitor-exit(r9)     // Catch:{ all -> 0x0100 }
            return
        L_0x0261:
            throw r0     // Catch:{ all -> 0x0100 }
        L_0x0262:
            monitor-exit(r1)     // Catch:{ all -> 0x0052 }
            throw r0     // Catch:{ all -> 0x0100 }
        L_0x0264:
            monitor-exit(r9)     // Catch:{ all -> 0x0100 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rv1.A(java.util.LinkedHashSet, boolean, boolean):void");
    }

    public final void B(HashMap hashMap, ArrayList arrayList) {
        synchronized (this.Z) {
            try {
                if (this.z != null && !arrayList.isEmpty()) {
                    boolean z2 = this.a.n().h() == 0;
                    Rect e = this.a.f().e();
                    Rational rational = this.z.b;
                    int m = this.a.n().m(this.z.c);
                    dcg dcg = this.z;
                    HashMap k = cvg.k(e, z2, rational, m, dcg.a, dcg.d, hashMap);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        vzf vzf = (vzf) it.next();
                        Rect rect = (Rect) k.get(vzf);
                        rect.getClass();
                        vzf.A(rect);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    vzf vzf2 = (vzf) it2.next();
                    Rect e2 = this.a.f().e();
                    hc0 hc0 = (hc0) hashMap.get(vzf2);
                    hc0.getClass();
                    vzf2.y(o(e2, hc0.a));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final qu1 b() {
        return this.A0;
    }

    public final void d(Collection collection) {
        synchronized (this.Z) {
            try {
                this.a.c(this.Y);
                su1 su1 = this.b;
                if (su1 != null) {
                    su1.c(this.Y);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.w);
                linkedHashSet.addAll(collection);
                su1 su12 = this.b;
                boolean z2 = false;
                boolean z3 = su12 != null;
                if (su12 != null) {
                    z2 = true;
                }
                A(linkedHashSet, z3, z2);
            } catch (IllegalArgumentException e) {
                throw new Exception(e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.Z) {
            try {
                if (!this.v0) {
                    if (!this.x.isEmpty()) {
                        this.a.c(this.Y);
                        su1 su1 = this.b;
                        if (su1 != null) {
                            su1.c(this.Y);
                        }
                    }
                    this.a.j(this.x);
                    su1 su12 = this.b;
                    if (su12 != null) {
                        su12.j(this.x);
                    }
                    synchronized (this.Z) {
                        if (this.w0 != null) {
                            this.a.f().c(this.w0);
                        }
                    }
                    Iterator it = this.x.iterator();
                    while (it.hasNext()) {
                        ((vzf) it.next()).p();
                    }
                    this.v0 = true;
                }
            } catch (Throwable th) {
                throw th;
            } finally {
                while (true) {
                }
            }
        }
    }

    public final vzf h(LinkedHashSet linkedHashSet, kxe kxe) {
        boolean z2;
        boolean z3;
        bub bub;
        synchronized (this.Z) {
            try {
                ArrayList arrayList = new ArrayList(linkedHashSet);
                if (kxe != null) {
                    arrayList.add(kxe);
                    arrayList.removeAll(kxe.p.a);
                }
                synchronized (this.Z) {
                    z2 = false;
                    z3 = ((Integer) this.Y.k(rt1.h, 0)).intValue() == 1;
                }
                if (z3) {
                    Iterator it = arrayList.iterator();
                    boolean z4 = false;
                    boolean z5 = false;
                    while (it.hasNext()) {
                        vzf vzf = (vzf) it.next();
                        if (!(vzf instanceof bub)) {
                            if (!(vzf instanceof kxe)) {
                                if (vzf instanceof y87) {
                                    z4 = true;
                                }
                            }
                        }
                        z5 = true;
                    }
                    if (!z4 || z5) {
                        Iterator it2 = arrayList.iterator();
                        boolean z6 = false;
                        while (it2.hasNext()) {
                            vzf vzf2 = (vzf) it2.next();
                            if (!(vzf2 instanceof bub)) {
                                if (!(vzf2 instanceof kxe)) {
                                    if (vzf2 instanceof y87) {
                                        z6 = true;
                                    }
                                }
                            }
                            z2 = true;
                        }
                        if (z2 && !z6) {
                            vzf vzf3 = this.x0;
                            if (vzf3 instanceof y87) {
                                bub = vzf3;
                            } else {
                                d87 d87 = new d87(1);
                                d87.b.f(cdf.g0, "ImageCapture-Extra");
                                bub = d87.a();
                            }
                        }
                    } else {
                        vzf vzf4 = this.x0;
                        if (vzf4 instanceof bub) {
                            bub = vzf4;
                        } else {
                            d87 d872 = new d87(2);
                            d872.b.f(cdf.g0, "Preview-Extra");
                            bub b2 = d872.b();
                            b2.E(new fm0(18));
                            bub = b2;
                        }
                    }
                }
                bub = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bub;
    }

    public final HashMap p(int i, qu1 qu1, ArrayList arrayList, ArrayList arrayList2, HashMap hashMap) {
        Size size;
        ox0 ox0;
        Rect rect;
        boolean z2;
        boolean z3;
        jc0 jc0;
        qu1 qu12 = qu1;
        ArrayList arrayList3 = new ArrayList();
        String e = qu1.e();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        Iterator it = arrayList2.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            size = null;
            ox0 = this.c;
            if (!hasNext) {
                break;
            }
            vzf vzf = (vzf) it.next();
            int inputFormat = vzf.f.getInputFormat();
            hc0 hc0 = vzf.g;
            Size size2 = hc0 != null ? hc0.a : null;
            j3f j3f = (j3f) ((HashMap) ox0.c).get(e);
            if (j3f != null) {
                jc0 = jc0.b(i, inputFormat, size2, j3f.i(inputFormat));
            } else {
                int i2 = i;
                jc0 = null;
            }
            int inputFormat2 = vzf.f.getInputFormat();
            hc0 hc02 = vzf.g;
            Size size3 = hc02 != null ? hc02.a : null;
            hc02.getClass();
            w90 w90 = new w90(jc0, inputFormat2, size3, hc02.b, kxe.H(vzf), vzf.g.d, (Range) vzf.f.k(zzf.o0, (Object) null));
            arrayList3.add(w90);
            hashMap3.put(w90, vzf);
            hashMap2.put(vzf, vzf.g);
        }
        int i3 = i;
        if (!arrayList.isEmpty()) {
            HashMap hashMap4 = new HashMap();
            HashMap hashMap5 = new HashMap();
            try {
                rect = this.a.f().e();
            } catch (NullPointerException unused) {
                rect = null;
            }
            if (rect != null) {
                size = grf.e(rect);
            }
            d19 d19 = new d19(qu12, size);
            Iterator it2 = arrayList.iterator();
            loop1:
            while (true) {
                z2 = false;
                while (true) {
                    if (!it2.hasNext()) {
                        break loop1;
                    }
                    vzf vzf2 = (vzf) it2.next();
                    qv1 qv1 = (qv1) hashMap.get(vzf2);
                    zzf m = vzf2.m(qu12, qv1.a, qv1.b);
                    hashMap4.put(m, vzf2);
                    hashMap5.put(m, d19.w(m));
                    zzf zzf = vzf2.f;
                    if (zzf instanceof cub) {
                        if (((cub) zzf).V() == 2) {
                            z2 = true;
                        }
                    }
                }
            }
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z3 = false;
                    break;
                }
                vzf vzf3 = (vzf) it3.next();
                if (vzf3 != null) {
                    if (!vzf3.f.u(zzf.r0)) {
                        vzf3.toString();
                    } else if (vzf3.f.O() == b0g.o) {
                        z3 = true;
                        break;
                    }
                }
            }
            ox0.getClass();
            bs0.m("No new use cases to be bound.", !hashMap5.isEmpty());
            j3f j3f2 = (j3f) ((HashMap) ox0.c).get(e);
            if (j3f2 != null) {
                Pair g = j3f2.g(i, arrayList3, hashMap5, z2, z3);
                for (Map.Entry entry : hashMap4.entrySet()) {
                    hashMap2.put((vzf) entry.getValue(), (hc0) ((Map) g.first).get(entry.getKey()));
                }
                for (Map.Entry entry2 : ((Map) g.second).entrySet()) {
                    if (hashMap3.containsKey(entry2.getKey())) {
                        hashMap2.put((vzf) hashMap3.get(entry2.getKey()), (hc0) entry2.getValue());
                    }
                }
            } else {
                throw new IllegalArgumentException(a81.m("No such camera id in supported combination list: ", e));
            }
        }
        return hashMap2;
    }

    public final kxe q(LinkedHashSet linkedHashSet, boolean z2) {
        boolean z3;
        synchronized (this.Z) {
            try {
                HashSet u = u(linkedHashSet, z2);
                if (u.size() < 2) {
                    w();
                    return null;
                }
                kxe kxe = this.y0;
                if (kxe == null || !kxe.p.a.equals(u)) {
                    int[] iArr = {1, 2, 4};
                    HashSet hashSet = new HashSet();
                    Iterator it = u.iterator();
                    while (it.hasNext()) {
                        vzf vzf = (vzf) it.next();
                        int i = 0;
                        while (true) {
                            if (i < 3) {
                                int i2 = iArr[i];
                                Iterator it2 = vzf.j().iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        z3 = false;
                                        break;
                                    }
                                    int intValue = ((Integer) it2.next()).intValue();
                                    if ((i2 & intValue) == intValue) {
                                        z3 = true;
                                        break;
                                    }
                                }
                                if (z3) {
                                    if (hashSet.contains(Integer.valueOf(i2))) {
                                        return null;
                                    }
                                    hashSet.add(Integer.valueOf(i2));
                                }
                                i++;
                            }
                        }
                    }
                    kxe kxe2 = new kxe(this.a, this.b, this.C0, this.D0, u, this.o);
                    return kxe2;
                }
                kxe kxe3 = this.y0;
                Objects.requireNonNull(kxe3);
                return kxe3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r() {
        synchronized (this.Z) {
            try {
                if (this.v0) {
                    this.a.k(new ArrayList(this.x));
                    su1 su1 = this.b;
                    if (su1 != null) {
                        su1.k(new ArrayList(this.x));
                    }
                    synchronized (this.Z) {
                        au1 f = this.a.f();
                        this.w0 = f.m();
                        f.n();
                    }
                    this.v0 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final HashSet u(LinkedHashSet linkedHashSet, boolean z2) {
        int i;
        HashSet hashSet = new HashSet();
        synchronized (this.Z) {
            Iterator it = this.X.iterator();
            if (!it.hasNext()) {
                i = z2 ? 3 : 0;
            } else {
                rae.w(it.next());
                throw null;
            }
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            vzf vzf = (vzf) it2.next();
            bs0.m("Only support one level of sharing for now.", !(vzf instanceof kxe));
            Iterator it3 = vzf.j().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                int intValue = ((Integer) it3.next()).intValue();
                if ((i & intValue) == intValue) {
                    hashSet.add(vzf);
                    break;
                }
            }
        }
        return hashSet;
    }

    public final List v() {
        ArrayList arrayList;
        synchronized (this.Z) {
            arrayList = new ArrayList(this.w);
        }
        return arrayList;
    }

    public final void w() {
        synchronized (this.Z) {
            this.Y.Q();
        }
    }

    public final void y(ArrayList arrayList) {
        synchronized (this.Z) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.w);
            linkedHashSet.removeAll(arrayList);
            su1 su1 = this.b;
            boolean z2 = false;
            boolean z3 = su1 != null;
            if (su1 != null) {
                z2 = true;
            }
            A(linkedHashSet, z3, z2);
        }
    }
}
