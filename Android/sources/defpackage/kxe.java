package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.util.Size;
import androidx.camera.core.ProcessingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: kxe  reason: default package */
public final class kxe extends vzf {
    public cwd A;
    public final lxe o;
    public final idg p;
    public final es7 q;
    public final es7 r;
    public g6d s;
    public pk4 t;
    public q3f u;
    public q3f v;
    public q3f w;
    public q3f x;
    public bwd y;
    public bwd z;

    public kxe(su1 su1, su1 su12, es7 es7, es7 es72, HashSet hashSet, c0g c0g) {
        super(I(hashSet));
        this.o = I(hashSet);
        this.q = es7;
        this.r = es72;
        this.p = new idg(su1, su12, hashSet, c0g, new nqd(16, this));
    }

    public static ArrayList H(vzf vzf) {
        ArrayList arrayList = new ArrayList();
        if (vzf instanceof kxe) {
            for (vzf vzf2 : ((kxe) vzf).p.a) {
                arrayList.add(vzf2.f.O());
            }
        } else {
            arrayList.add(vzf.f.O());
        }
        return arrayList;
    }

    public static lxe I(HashSet hashSet) {
        pz9 c = pz9.c();
        new bpa(c);
        c.f(m97.D, 34);
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            vzf vzf = (vzf) it.next();
            if (vzf.f.u(zzf.r0)) {
                arrayList.add(vzf.f.O());
            }
        }
        c.f(lxe.b, arrayList);
        c.f(x97.I, 2);
        return new lxe(c5b.a(c));
    }

    public final void D() {
        cwd cwd = this.A;
        if (cwd != null) {
            cwd.b();
            this.A = null;
        }
        q3f q3f = this.u;
        if (q3f != null) {
            q3f.c();
            this.u = null;
        }
        q3f q3f2 = this.v;
        if (q3f2 != null) {
            q3f2.c();
            this.v = null;
        }
        q3f q3f3 = this.w;
        if (q3f3 != null) {
            q3f3.c();
            this.w = null;
        }
        q3f q3f4 = this.x;
        if (q3f4 != null) {
            q3f4.c();
            this.x = null;
        }
        g6d g6d = this.s;
        if (g6d != null) {
            g6d.release();
            this.s = null;
        }
        pk4 pk4 = this.t;
        if (pk4 != null) {
            ((t3f) pk4.a).release();
            ev0.E(new ne4(11, pk4));
            this.t = null;
        }
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [pk4, java.lang.Object] */
    public final List E(String str, String str2, zzf zzf, hc0 hc0, hc0 hc02) {
        boolean z2;
        hc0 hc03 = hc0;
        hc0 hc04 = hc02;
        ev0.g();
        idg idg = this.p;
        if (hc04 == null) {
            F(str, str2, zzf, hc0, (hc0) null);
            su1 c = c();
            Objects.requireNonNull(c);
            this.s = new g6d(c, new ti4(hc03.b));
            boolean z3 = this.i != null;
            q3f q3f = this.w;
            int Y = ((x97) this.f).Y(0);
            idg.getClass();
            HashMap hashMap = new HashMap();
            for (vzf vzf : idg.a) {
                hashMap.put(vzf, idg.p(vzf, idg.Y, idg.w, q3f, Y, z3));
            }
            rx4 z4 = this.s.z(new mc0(this.w, new ArrayList(hashMap.values())));
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry : hashMap.entrySet()) {
                hashMap2.put((vzf) entry.getKey(), (q3f) z4.get(entry.getValue()));
            }
            idg.t(hashMap2);
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{this.y.c()}[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            return Collections.unmodifiableList(arrayList);
        }
        F(str, str2, zzf, hc0, hc02);
        Matrix matrix = this.j;
        su1 i = i();
        Objects.requireNonNull(i);
        boolean l = i.l();
        Rect rect = this.i;
        if (rect != null) {
            z2 = false;
        } else {
            Size size = hc04.a;
            z2 = false;
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        su1 i2 = i();
        Objects.requireNonNull(i2);
        int h = h(i2, z2);
        su1 i3 = i();
        Objects.requireNonNull(i3);
        boolean l2 = l(i3);
        idg idg2 = idg;
        q3f q3f2 = new q3f(3, 34, hc02, matrix, l, rect, h, -1, l2);
        this.v = q3f2;
        Objects.requireNonNull(i());
        this.x = q3f2;
        bwd G = G(this.v, zzf, hc04);
        this.z = G;
        cwd cwd = this.A;
        if (cwd != null) {
            cwd.b();
        }
        idg idg3 = idg2;
        boolean z5 = z2;
        cwd cwd2 = new cwd(new jxe(this, str, str2, zzf, hc0, hc02));
        this.A = cwd2;
        G.f = cwd2;
        su1 c2 = c();
        su1 i4 = i();
        px4 px4 = new px4(hc03.b, this.q, this.r);
        ? obj2 = new Object();
        obj2.b = c2;
        obj2.c = i4;
        obj2.a = px4;
        this.t = obj2;
        boolean z6 = this.i != null ? true : z5;
        q3f q3f3 = this.w;
        q3f q3f4 = this.x;
        int Y2 = ((x97) this.f).Y(z5 ? 1 : 0);
        idg3.getClass();
        HashMap hashMap3 = new HashMap();
        for (vzf vzf2 : idg3.a) {
            idg idg4 = idg3;
            int i5 = Y2;
            vzf vzf3 = vzf2;
            nb0 p2 = idg4.p(vzf2, idg3.Y, idg3.w, q3f3, i5, z6);
            su1 su1 = idg3.x;
            Objects.requireNonNull(su1);
            hashMap3.put(vzf3, new oa0(p2, idg4.p(vzf3, idg3.Z, su1, q3f4, i5, z6)));
        }
        pk4 pk4 = this.t;
        pa0 pa0 = new pa0(this.w, this.x, new ArrayList(hashMap3.values()));
        pk4.getClass();
        t3f t3f = (t3f) pk4.a;
        ev0.g();
        pk4.e = pa0;
        pk4.d = new HashMap();
        pa0 pa02 = (pa0) pk4.e;
        q3f q3f5 = pa02.a;
        Iterator it = pa02.c.iterator();
        while (it.hasNext()) {
            oa0 oa0 = (oa0) it.next();
            rx4 rx4 = (rx4) pk4.d;
            nb0 nb0 = oa0.a;
            Rect rect2 = nb0.d;
            Matrix matrix2 = new Matrix();
            Size e = grf.e(rect2);
            int i6 = nb0.f;
            Size g = grf.g(e, i6);
            Size size2 = nb0.e;
            bs0.n(grf.d(g, z5, size2));
            Iterator it2 = it;
            Rect rect3 = new Rect(z5, z5, size2.getWidth(), size2.getHeight());
            q13 a = q3f5.g.a();
            a.b = size2;
            rx4.put(oa0, new q3f(nb0.b, nb0.c, a.h(), matrix2, false, rect3, q3f5.i - i6, -1, q3f5.e != nb0.g ? true : z5));
            it = it2;
        }
        try {
            t3f.a(q3f5.d((su1) pk4.b, true));
        } catch (ProcessingException unused) {
        }
        q3f q3f6 = pa02.b;
        try {
            t3f.a(q3f6.d((su1) pk4.c, z5));
        } catch (ProcessingException unused2) {
        }
        for (Map.Entry entry2 : ((rx4) pk4.d).entrySet()) {
            su1 su12 = (su1) pk4.b;
            su1 su13 = (su1) pk4.c;
            pk4.u(su12, su13, q3f5, q3f6, entry2);
            ((q3f) entry2.getValue()).a(new qx4(pk4, su12, su13, q3f5, q3f6, entry2, 0));
        }
        rx4 rx42 = (rx4) pk4.d;
        HashMap hashMap4 = new HashMap();
        for (Map.Entry entry3 : hashMap3.entrySet()) {
            hashMap4.put((vzf) entry3.getKey(), (q3f) rx42.get(entry3.getValue()));
        }
        idg3.t(hashMap4);
        Object[] objArr = {this.y.c(), this.z.c()};
        ArrayList arrayList2 = new ArrayList(2);
        for (int i7 = z5; i7 < 2; i7++) {
            Object obj3 = objArr[i7];
            Objects.requireNonNull(obj3);
            arrayList2.add(obj3);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public final void F(String str, String str2, zzf zzf, hc0 hc0, hc0 hc02) {
        hc0 hc03 = hc0;
        Matrix matrix = this.j;
        su1 c = c();
        Objects.requireNonNull(c);
        boolean l = c.l();
        Size size = hc03.a;
        Rect rect = this.i;
        if (rect == null) {
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        Rect rect2 = rect;
        su1 c2 = c();
        Objects.requireNonNull(c2);
        int h = h(c2, false);
        su1 c3 = c();
        Objects.requireNonNull(c3);
        q3f q3f = new q3f(3, 34, hc0, matrix, l, rect2, h, -1, l(c3));
        this.u = q3f;
        Objects.requireNonNull(c());
        this.w = q3f;
        bwd G = G(this.u, zzf, hc03);
        this.y = G;
        cwd cwd = this.A;
        if (cwd != null) {
            cwd.b();
        }
        cwd cwd2 = new cwd(new jxe(this, str, str2, zzf, hc0, hc02));
        this.A = cwd2;
        G.f = cwd2;
    }

    public final bwd G(q3f q3f, zzf zzf, hc0 hc0) {
        bwd d = bwd.d(zzf, hc0.a);
        idg idg = this.p;
        int i = -1;
        for (vzf vzf : idg.a) {
            int i2 = ((fwd) vzf.f.n(zzf.j0)).g.c;
            Integer valueOf = Integer.valueOf(i);
            List list = fwd.j;
            if (list.indexOf(valueOf) < list.indexOf(Integer.valueOf(i2))) {
                i = i2;
            }
        }
        u40 u40 = d.b;
        if (i != -1) {
            u40.c = i;
        }
        for (vzf vzf2 : idg.a) {
            fwd c = bwd.d(vzf2.f, hc0.a).c();
            bx1 bx1 = c.g;
            u40.a(bx1.e);
            for (bt1 bt1 : c.e) {
                u40.b(bt1);
                ArrayList arrayList = d.e;
                if (!arrayList.contains(bt1)) {
                    arrayList.add(bt1);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback : c.d) {
                ArrayList arrayList2 = d.d;
                if (!arrayList2.contains(stateCallback)) {
                    arrayList2.add(stateCallback);
                }
            }
            for (CameraDevice.StateCallback stateCallback2 : c.c) {
                ArrayList arrayList3 = d.c;
                if (!arrayList3.contains(stateCallback2)) {
                    arrayList3.add(stateCallback2);
                }
            }
            d.a(bx1.b);
        }
        q3f.getClass();
        ev0.g();
        q3f.b();
        bs0.r("Consumer can only be linked once.", !q3f.j);
        q3f.j = true;
        d.b(q3f.l, hc0.b, -1);
        u40.b(idg.y);
        je3 je3 = hc0.d;
        if (je3 != null) {
            u40.c(je3);
        }
        return d;
    }

    public final zzf f(boolean z2, c0g c0g) {
        lxe lxe = this.o;
        je3 a = c0g.a(lxe.O(), 1);
        if (z2) {
            a = je3.L(a, lxe.a);
        }
        if (a == null) {
            return null;
        }
        return ((bpa) k(a)).s();
    }

    public final Set j() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    public final yzf k(je3 je3) {
        return new bpa(pz9.d(je3));
    }

    public final void q() {
        idg idg = this.p;
        for (vzf vzf : idg.a) {
            hdg hdg = (hdg) idg.c.get(vzf);
            Objects.requireNonNull(hdg);
            vzf.a(hdg, (su1) null, (zzf) null, vzf.f(true, idg.v));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.zzf s(defpackage.qu1 r12, defpackage.yzf r13) {
        /*
            r11 = this;
            r12 = 1
            yy9 r0 = r13.q()
            idg r11 = r11.p
            y3d r1 = r11.Y
            qu1 r2 = r1.f
            r3 = 34
            java.util.List r4 = r2.r(r3)
            java.util.Set r5 = r1.d
            java.util.Iterator r6 = r5.iterator()
        L_0x0017:
            boolean r7 = r6.hasNext()
            r8 = 0
            if (r7 == 0) goto L_0x0056
            java.lang.Object r7 = r6.next()
            zzf r7 = (defpackage.zzf) r7
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            la0 r10 = defpackage.zzf.q0
            java.lang.Object r9 = r7.k(r10, r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0035
            goto L_0x0017
        L_0x0035:
            boolean r9 = r7 instanceof defpackage.x97
            if (r9 == 0) goto L_0x0017
            x97 r7 = (defpackage.x97) r7
            la0 r9 = defpackage.x97.N
            java.lang.Object r7 = r7.k(r9, r8)
            w3d r7 = (defpackage.w3d) r7
            if (r7 == 0) goto L_0x0017
            int r7 = r7.c
            if (r7 != r12) goto L_0x0017
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r4)
            java.util.List r2 = r2.l(r3)
            r6.addAll(r2)
            r4 = r6
        L_0x0056:
            la0 r2 = defpackage.x97.M
            r6 = r0
            c5b r6 = (defpackage.c5b) r6
            r6.getClass()
            java.lang.Object r2 = r6.n(r2)     // Catch:{ IllegalArgumentException -> 0x0063 }
            goto L_0x0064
        L_0x0063:
            r2 = r8
        L_0x0064:
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x0096
            java.util.Iterator r2 = r2.iterator()
        L_0x006c:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0090
            java.lang.Object r4 = r2.next()
            android.util.Pair r4 = (android.util.Pair) r4
            java.lang.Object r6 = r4.first
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x006c
            java.lang.Object r2 = r4.second
            android.util.Size[] r2 = (android.util.Size[]) r2
            java.util.List r2 = java.util.Arrays.asList(r2)
        L_0x008e:
            r4 = r2
            goto L_0x0096
        L_0x0090:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            goto L_0x008e
        L_0x0096:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x00a4:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00b8
            java.lang.Object r6 = r5.next()
            zzf r6 = (defpackage.zzf) r6
            java.util.List r6 = r1.b(r6)
            r3.addAll(r6)
            goto L_0x00a4
        L_0x00b8:
            java.util.Iterator r3 = r3.iterator()
        L_0x00bc:
            boolean r5 = r3.hasNext()
            r6 = 0
            android.util.Rational r7 = r1.c
            if (r5 == 0) goto L_0x00de
            java.lang.Object r5 = r3.next()
            android.util.Size r5 = (android.util.Size) r5
            android.util.Rational r9 = defpackage.ht.a
            android.util.Size r9 = defpackage.pde.c
            boolean r5 = defpackage.ht.a(r5, r7, r9)
            if (r5 != 0) goto L_0x00bc
            android.util.Rational r3 = r1.b
            java.util.ArrayList r3 = r1.f(r3, r4, r6)
            r2.addAll(r3)
        L_0x00de:
            java.util.ArrayList r3 = r1.f(r7, r4, r6)
            r2.addAll(r3)
            java.util.ArrayList r3 = r1.e(r4, r6)
            r2.addAll(r3)
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x00f9
            java.util.ArrayList r1 = r1.e(r4, r12)
            r2.addAll(r1)
        L_0x00f9:
            r2.toString()
            la0 r1 = defpackage.x97.O
            pz9 r0 = (defpackage.pz9) r0
            r0.f(r1, r2)
            la0 r1 = defpackage.zzf.n0
            java.util.HashSet r2 = r11.z
            java.util.Iterator r3 = r2.iterator()
            r4 = r6
        L_0x010c:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x012d
            java.lang.Object r5 = r3.next()
            zzf r5 = (defpackage.zzf) r5
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            la0 r9 = defpackage.zzf.n0
            java.lang.Object r5 = r5.k(r9, r7)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            int r4 = java.lang.Math.max(r4, r5)
            goto L_0x010c
        L_0x012d:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r0.f(r1, r3)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x013d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0151
            java.lang.Object r3 = r2.next()
            zzf r3 = (defpackage.zzf) r3
            vy4 r3 = r3.D()
            r1.add(r3)
            goto L_0x013d
        L_0x0151:
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0159
            goto L_0x01f9
        L_0x0159:
            java.lang.Object r2 = r1.get(r6)
            vy4 r2 = (defpackage.vy4) r2
            int r3 = r2.a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r2 = r2.b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = r12
        L_0x016c:
            int r5 = r1.size()
            if (r4 >= r5) goto L_0x01ec
            java.lang.Object r5 = r1.get(r4)
            vy4 r5 = (defpackage.vy4) r5
            int r7 = r5.a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            boolean r10 = r3.equals(r9)
            if (r10 == 0) goto L_0x018a
        L_0x0188:
            r3 = r7
            goto L_0x01c4
        L_0x018a:
            boolean r9 = r7.equals(r9)
            if (r9 == 0) goto L_0x0191
            goto L_0x01c4
        L_0x0191:
            r9 = 2
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            boolean r10 = r3.equals(r10)
            if (r10 == 0) goto L_0x01a7
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            boolean r10 = r7.equals(r10)
            if (r10 != 0) goto L_0x01a7
            goto L_0x0188
        L_0x01a7:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            boolean r9 = r7.equals(r9)
            if (r9 == 0) goto L_0x01bc
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)
            boolean r9 = r3.equals(r9)
            if (r9 != 0) goto L_0x01bc
            goto L_0x01c4
        L_0x01bc:
            boolean r7 = r3.equals(r7)
            if (r7 == 0) goto L_0x01c3
            goto L_0x01c4
        L_0x01c3:
            r3 = r8
        L_0x01c4:
            int r5 = r5.b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            boolean r9 = r2.equals(r7)
            if (r9 == 0) goto L_0x01d6
            r2 = r5
            goto L_0x01e5
        L_0x01d6:
            boolean r7 = r5.equals(r7)
            if (r7 == 0) goto L_0x01dd
            goto L_0x01e5
        L_0x01dd:
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L_0x01e4
            goto L_0x01e5
        L_0x01e4:
            r2 = r8
        L_0x01e5:
            if (r3 == 0) goto L_0x01f9
            if (r2 != 0) goto L_0x01ea
            goto L_0x01f9
        L_0x01ea:
            int r4 = r4 + r12
            goto L_0x016c
        L_0x01ec:
            vy4 r8 = new vy4
            int r12 = r3.intValue()
            int r1 = r2.intValue()
            r8.<init>(r12, r1)
        L_0x01f9:
            if (r8 == 0) goto L_0x0246
            la0 r12 = defpackage.m97.E
            r0.f(r12, r8)
            java.util.Set r11 = r11.a
            java.util.Iterator r11 = r11.iterator()
        L_0x0206:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0241
            java.lang.Object r12 = r11.next()
            vzf r12 = (defpackage.vzf) r12
            zzf r1 = r12.f
            int r1 = r1.P()
            if (r1 == 0) goto L_0x0229
            la0 r1 = defpackage.zzf.t0
            zzf r2 = r12.f
            int r2 = r2.P()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.f(r1, r2)
        L_0x0229:
            zzf r1 = r12.f
            int r1 = r1.V()
            if (r1 == 0) goto L_0x0206
            la0 r1 = defpackage.zzf.s0
            zzf r12 = r12.f
            int r12 = r12.V()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r0.f(r1, r12)
            goto L_0x0206
        L_0x0241:
            zzf r11 = r13.s()
            return r11
        L_0x0246:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Failed to merge child dynamic ranges, can not find a dynamic range that satisfies all children."
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kxe.s(qu1, yzf):zzf");
    }

    public final void t() {
        for (vzf vzf : this.p.a) {
            vzf.t();
            vzf.r();
        }
    }

    public final void u() {
        for (vzf u2 : this.p.a) {
            u2.u();
        }
    }

    public final hc0 v(je3 je3) {
        this.y.a(je3);
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{this.y.c()}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        C(Collections.unmodifiableList(arrayList));
        q13 a = this.g.a();
        a.v = je3;
        return a.h();
    }

    public final hc0 w(hc0 hc0, hc0 hc02) {
        C(E(e(), i() == null ? null : i().n().e(), this.f, hc0, hc02));
        n();
        return hc0;
    }

    public final void x() {
        D();
        idg idg = this.p;
        for (vzf vzf : idg.a) {
            hdg hdg = (hdg) idg.c.get(vzf);
            Objects.requireNonNull(hdg);
            vzf.B(hdg);
        }
    }
}
