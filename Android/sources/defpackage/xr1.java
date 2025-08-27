package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: xr1  reason: default package */
public final class xr1 implements su1 {
    public final boolean A0;
    public final boolean B0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public kq9 F0;
    public final kq9 G0;
    public final kwd H0;
    public final HashSet I0;
    public rt1 J0;
    public final Object K0;
    public boolean L0;
    public final hq4 M0;
    public final b8d N0;
    public final j3f O0;
    public final xe8 P0;
    public volatile int Q0 = 3;
    public CameraDevice X;
    public int Y;
    public jx1 Z;
    public final bpa a;
    public final vu1 b;
    public final tsd c;
    public final ew6 o;
    public final fj v;
    public final LinkedHashMap v0;
    public final npg w;
    public int w0;
    public final lr1 x;
    public final rr1 x0;
    public final wr1 y;
    public final mqf y0;
    public final as1 z;
    public final ov1 z0;

    /* JADX WARNING: type inference failed for: r13v2, types: [kq9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v22, types: [kwd, java.lang.Object] */
    public xr1(Context context, vu1 vu1, String str, as1 as1, mqf mqf, ov1 ov1, Executor executor, Handler handler, hq4 hq4, long j) {
        String str2 = str;
        as1 as12 = as1;
        ov1 ov12 = ov1;
        Handler handler2 = handler;
        fj fjVar = new fj(13, (byte) 0);
        this.v = fjVar;
        this.Y = 0;
        new AtomicInteger(0);
        this.v0 = new LinkedHashMap();
        this.w0 = 0;
        this.C0 = false;
        this.D0 = false;
        this.E0 = true;
        this.I0 = new HashSet();
        this.J0 = ut1.a;
        this.K0 = new Object();
        this.L0 = false;
        this.P0 = new xe8(this);
        this.b = vu1;
        this.y0 = mqf;
        this.z0 = ov12;
        ew6 ew6 = new ew6(handler2);
        this.o = ew6;
        tsd tsd = new tsd(executor);
        this.c = tsd;
        wr1 wr1 = r1;
        wr1 wr12 = new wr1(this, tsd, ew6, j);
        this.y = wr1;
        this.a = new bpa(str2);
        ((fz9) fjVar.b).i(new x08(ru1.CLOSED));
        npg npg = new npg(ov12);
        this.w = npg;
        ? obj = new Object();
        obj.b = new Object();
        obj.c = new LinkedHashSet();
        obj.o = new LinkedHashSet();
        obj.v = new LinkedHashSet();
        obj.w = new gu1((kq9) obj);
        obj.a = tsd;
        this.G0 = obj;
        this.M0 = hq4;
        try {
            qt1 a2 = vu1.a(str);
            lr1 lr1 = r1;
            lr1 lr12 = new lr1(a2, ew6, tsd, new xv1(9, (Object) this), as12.j);
            this.x = lr1;
            this.z = as12;
            as12.u(lr1);
            as12.h.m((fz9) npg.c);
            this.N0 = b8d.i(a2);
            this.Z = y();
            ykb ykb = as12.j;
            ykb ykb2 = qn4.a;
            ? obj2 = new Object();
            obj2.a = tsd;
            obj2.b = ew6;
            obj2.c = handler2;
            obj2.d = obj;
            obj2.e = ykb;
            obj2.f = ykb2;
            this.H0 = obj2;
            this.A0 = as12.j.e(LegacyCameraOutputConfigNullPointerQuirk.class);
            this.B0 = as12.j.e(LegacyCameraSurfaceCleanupQuirk.class);
            rr1 rr1 = new rr1(this, str2);
            this.x0 = rr1;
            b8d b8d = new b8d((Object) this);
            synchronized (ov12.b) {
                bs0.r("Camera is already registered: " + this, !ov12.e.containsKey(this));
                ov12.e.put(this, new mv1(tsd, b8d, rr1));
            }
            vu1 vu12 = vu1;
            vu12.a.a0(tsd, rr1);
            this.O0 = new j3f(context, str2, vu12, new nfd(8));
        } catch (CameraAccessExceptionCompat e) {
            throw new Exception(e);
        }
    }

    public static String u(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    public static String v(kq9 kq9) {
        StringBuilder sb = new StringBuilder("MeteringRepeating");
        kq9.getClass();
        sb.append(kq9.hashCode());
        return sb.toString();
    }

    public static String w(vzf vzf) {
        return vzf.g() + vzf.hashCode();
    }

    public final void A() {
        bs0.r((String) null, this.Q0 == 9);
        ewd B = this.a.B();
        if (!B.l || !B.k) {
            toString();
        } else if (!this.z0.e(this.X.getId(), this.y0.G(this.X.getId()))) {
            int i = this.y0.b;
            toString();
        } else {
            HashMap hashMap = new HashMap();
            Collection<fwd> F = this.a.F();
            Collection G = this.a.G();
            la0 la0 = mxe.a;
            ArrayList arrayList = new ArrayList(G);
            Iterator it = F.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                fwd fwd = (fwd) it.next();
                je3 je3 = fwd.g.b;
                la0 la02 = mxe.a;
                if (je3.u(la02) && fwd.b().size() != 1) {
                    String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", new Object[]{Integer.valueOf(fwd.b().size())});
                    break;
                } else if (fwd.g.b.u(la02)) {
                    int i2 = 0;
                    for (fwd fwd2 : F) {
                        if (((zzf) arrayList.get(i2)).O() == b0g.w) {
                            bs0.r("MeteringRepeating should contain a surface", !fwd2.b().isEmpty());
                            hashMap.put((lk4) fwd2.b().get(0), 1L);
                        } else if (fwd2.g.b.u(la02) && !fwd2.b().isEmpty()) {
                            hashMap.put((lk4) fwd2.b().get(0), (Long) fwd2.g.b.n(la02));
                        }
                        i2++;
                    }
                }
            }
            jx1 jx1 = this.Z;
            synchronized (jx1.a) {
                jx1.l = hashMap;
            }
            jx1 jx12 = this.Z;
            fwd b2 = B.b();
            CameraDevice cameraDevice = this.X;
            cameraDevice.getClass();
            kwd kwd = this.H0;
            hd8.a(jx12.l(b2, cameraDevice, new u6f((ykb) kwd.e, (ykb) kwd.f, (kq9) kwd.d, (Executor) kwd.a, (ScheduledExecutorService) kwd.b, (Handler) kwd.c)), new fj((Object) this, (Object) jx12, false, 5), this.c);
        }
    }

    public final void B() {
        if (this.F0 != null) {
            StringBuilder sb = new StringBuilder("MeteringRepeating");
            this.F0.getClass();
            sb.append(this.F0.hashCode());
            String sb2 = sb.toString();
            bpa bpa = this.a;
            LinkedHashMap linkedHashMap = (LinkedHashMap) bpa.b;
            if (linkedHashMap.containsKey(sb2)) {
                xzf xzf = (xzf) linkedHashMap.get(sb2);
                xzf.e = false;
                if (!xzf.f) {
                    linkedHashMap.remove(sb2);
                }
            }
            StringBuilder sb3 = new StringBuilder("MeteringRepeating");
            this.F0.getClass();
            sb3.append(this.F0.hashCode());
            String sb4 = sb3.toString();
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) bpa.b;
            if (linkedHashMap2.containsKey(sb4)) {
                xzf xzf2 = (xzf) linkedHashMap2.get(sb4);
                xzf2.f = false;
                if (!xzf2.e) {
                    linkedHashMap2.remove(sb4);
                }
            }
            kq9 kq9 = this.F0;
            za7 za7 = (za7) kq9.a;
            if (za7 != null) {
                za7.a();
            }
            kq9.a = null;
            this.F0 = null;
        }
    }

    public final void C() {
        fwd fwd;
        List unmodifiableList;
        bs0.r((String) null, this.Z != null);
        toString();
        jx1 jx1 = this.Z;
        synchronized (jx1.a) {
            fwd = jx1.f;
        }
        synchronized (jx1.a) {
            unmodifiableList = Collections.unmodifiableList(jx1.b);
        }
        jx1 y2 = y();
        this.Z = y2;
        y2.n(fwd);
        this.Z.j(unmodifiableList);
        if (tr1.y(this.Q0) != 8) {
            jx1.h();
            toString();
        } else if (this.A0 && jx1.h()) {
            toString();
            E(6);
        }
        if (this.B0 && jx1.h()) {
            toString();
            this.C0 = true;
        }
        jx1.a();
        zz7 m = jx1.m();
        a81.w(this.Q0);
        toString();
        this.v0.put(jx1, m);
        hd8.a(m, new dm4(this, jx1, false, 6), ryg.j());
    }

    public final void D(int i, ga0 ga0, boolean z2) {
        ru1 ru1;
        ru1 ru12;
        fa0 fa0;
        HashMap hashMap;
        String G;
        toString();
        boolean z3 = false;
        if (hof.a()) {
            Trace.setCounter(ld9.T("CX:C2State[" + this + "]"), (long) tr1.y(i));
            if (ga0 != null) {
                this.w0++;
            }
            if (this.w0 > 0) {
                Trace.setCounter(ld9.T("CX:C2StateErrorCode[" + this + "]"), (long) (ga0 != null ? ga0.a : 0));
            }
        }
        this.Q0 = i;
        switch (tr1.y(i)) {
            case 0:
                ru1 = ru1.RELEASED;
                break;
            case 1:
                ru1 = ru1.RELEASING;
                break;
            case 2:
                ru1 = ru1.CLOSED;
                break;
            case 3:
                ru1 = ru1.PENDING_OPEN;
                break;
            case 4:
            case 5:
                ru1 = ru1.CLOSING;
                break;
            case 6:
            case 7:
                ru1 = ru1.OPENING;
                break;
            case 8:
                ru1 = ru1.OPEN;
                break;
            case 9:
                ru1 = ru1.CONFIGURED;
                break;
            default:
                throw new IllegalStateException("Unknown state: ".concat(a81.z(i)));
        }
        ov1 ov1 = this.z0;
        synchronized (ov1.b) {
            try {
                int i2 = ov1.f;
                if (ru1 == ru1.RELEASED) {
                    mv1 mv1 = (mv1) ov1.e.remove(this);
                    if (mv1 != null) {
                        ov1.b();
                        ru12 = mv1.a;
                    } else {
                        ru12 = null;
                    }
                } else {
                    mv1 mv12 = (mv1) ov1.e.get(this);
                    bs0.q(mv12, "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()");
                    ru1 ru13 = mv12.a;
                    mv12.a = ru1;
                    ru1 ru14 = ru1.OPENING;
                    if (ru1 == ru14) {
                        if (ru1.a || ru13 == ru14) {
                            z3 = true;
                        }
                        bs0.r("Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()", z3);
                    }
                    if (ru13 != ru1) {
                        ov1.c(this, ru1);
                        ov1.b();
                    }
                    ru12 = ru13;
                }
                if (ru12 != ru1) {
                    mv1 a2 = (ov1.d.b == 2 && ru1 == ru1.CONFIGURED && (G = ov1.d.G(n().e())) != null) ? ov1.a(G) : null;
                    if (i2 < 1 && ov1.f > 0) {
                        hashMap = new HashMap();
                        for (Map.Entry entry : ov1.e.entrySet()) {
                            if (((mv1) entry.getValue()).a == ru1.PENDING_OPEN) {
                                hashMap.put((ys1) entry.getKey(), (mv1) entry.getValue());
                            }
                        }
                    } else if (ru1 != ru1.PENDING_OPEN || ov1.f <= 0) {
                        hashMap = null;
                    } else {
                        hashMap = new HashMap();
                        hashMap.put(this, (mv1) ov1.e.get(this));
                    }
                    if (hashMap != null && !z2) {
                        hashMap.remove(this);
                    }
                    if (hashMap != null) {
                        for (mv1 mv13 : hashMap.values()) {
                            mv13.getClass();
                            try {
                                Executor executor = mv13.b;
                                nv1 nv1 = mv13.d;
                                Objects.requireNonNull(nv1);
                                executor.execute(new pr1(5, (rr1) nv1));
                            } catch (RejectedExecutionException unused) {
                            }
                        }
                    }
                    if (a2 != null) {
                        try {
                            Executor executor2 = a2.b;
                            b8d b8d = a2.c;
                            Objects.requireNonNull(b8d);
                            executor2.execute(new pr1(6, b8d));
                        } catch (RejectedExecutionException unused2) {
                        }
                    }
                }
            } finally {
                while (true) {
                }
            }
        }
        ((fz9) this.v.b).i(new x08(ru1));
        npg npg = this.w;
        npg.getClass();
        switch (ru1.ordinal()) {
            case 0:
            case 2:
                fa0 = new fa0(5, ga0);
                break;
            case 1:
            case 4:
                fa0 = new fa0(4, ga0);
                break;
            case 3:
                ov1 ov12 = (ov1) npg.b;
                synchronized (ov12.b) {
                    Iterator it = ov12.e.entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((mv1) ((Map.Entry) it.next()).getValue()).a == ru1.CLOSING) {
                                fa0 = new fa0(2, (ga0) null);
                                break;
                            }
                        } else {
                            fa0 = new fa0(1, (ga0) null);
                            break;
                        }
                    }
                }
            case 5:
                fa0 = new fa0(2, ga0);
                break;
            case 6:
            case 7:
                fa0 = new fa0(3, ga0);
                break;
            default:
                throw new IllegalStateException("Unknown internal camera state: " + ru1);
        }
        fa0.toString();
        ru1.toString();
        Objects.toString(ga0);
        if (!Objects.equals((fa0) ((fz9) npg.c).d(), fa0)) {
            fa0.toString();
            ((fz9) npg.c).i(fa0);
        }
    }

    public final void E(int i) {
        D(i, (ga0) null, true);
    }

    public final ArrayList F(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            vzf vzf = (vzf) it.next();
            boolean z2 = this.E0;
            String w2 = w(vzf);
            Class<?> cls = vzf.getClass();
            fwd fwd = z2 ? vzf.m : vzf.n;
            zzf zzf = vzf.f;
            hc0 hc0 = vzf.g;
            arrayList2.add(new ea0(w2, cls, fwd, zzf, hc0 != null ? hc0.a : null, hc0, vzf.c() == null ? null : kxe.H(vzf)));
        }
        return arrayList2;
    }

    public final void G(ArrayList arrayList) {
        boolean z2;
        Size size;
        boolean isEmpty = this.a.F().isEmpty();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        Rational rational = null;
        while (true) {
            z2 = true;
            if (!it.hasNext()) {
                break;
            }
            ea0 ea0 = (ea0) it.next();
            if (!this.a.I(ea0.a)) {
                bpa bpa = this.a;
                String str = ea0.a;
                fwd fwd = ea0.c;
                zzf zzf = ea0.d;
                hc0 hc0 = ea0.f;
                List list = ea0.g;
                LinkedHashMap linkedHashMap = (LinkedHashMap) bpa.b;
                xzf xzf = (xzf) linkedHashMap.get(str);
                if (xzf == null) {
                    xzf = new xzf(fwd, zzf, hc0, list);
                    linkedHashMap.put(str, xzf);
                }
                xzf.e = true;
                bpa.K(str, fwd, zzf, hc0, list);
                arrayList2.add(ea0.a);
                if (ea0.b == bub.class && (size = ea0.e) != null) {
                    rational = new Rational(size.getWidth(), size.getHeight());
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            TextUtils.join(", ", arrayList2);
            toString();
            if (isEmpty) {
                this.x.y(true);
                lr1 lr1 = this.x;
                synchronized (lr1.d) {
                    lr1.p++;
                }
            }
            p();
            K();
            J();
            C();
            if (this.Q0 == 9) {
                A();
            } else {
                int y2 = tr1.y(this.Q0);
                if (y2 == 2 || y2 == 3) {
                    H(false);
                } else if (y2 != 4) {
                    toString();
                } else {
                    E(7);
                    if (!this.v0.isEmpty() && !this.D0 && this.Y == 0) {
                        if (this.X == null) {
                            z2 = false;
                        }
                        bs0.r("Camera Device should be open if session close is not complete", z2);
                        E(9);
                        A();
                    }
                }
            }
            if (rational != null) {
                this.x.h.e = rational;
            }
        }
    }

    public final void H(boolean z2) {
        toString();
        if (!this.z0.d(this)) {
            toString();
            E(4);
            return;
        }
        z(z2);
    }

    public final void I(boolean z2) {
        toString();
        if (!this.x0.b || !this.z0.d(this)) {
            toString();
            E(4);
            return;
        }
        z(z2);
    }

    public final void J() {
        bpa bpa = this.a;
        bpa.getClass();
        ewd ewd = new ewd();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) bpa.b).entrySet()) {
            xzf xzf = (xzf) entry.getValue();
            if (xzf.f && xzf.e) {
                ewd.a(xzf.a);
                arrayList.add((String) entry.getKey());
            }
        }
        arrayList.toString();
        boolean z2 = ewd.l && ewd.k;
        lr1 lr1 = this.x;
        if (z2) {
            int i = ewd.b().g.c;
            lr1.x = i;
            lr1.h.n = i;
            lr1.n.c = i;
            ewd.a(lr1.s());
            this.Z.n(ewd.b());
            return;
        }
        lr1.x = 1;
        lr1.h.n = 1;
        lr1.n.c = 1;
        this.Z.n(lr1.s());
    }

    public final void K() {
        boolean z2 = false;
        for (zzf k : this.a.G()) {
            z2 |= ((Boolean) k.k(zzf.p0, Boolean.FALSE)).booleanValue();
        }
        this.x.l.c = z2;
    }

    public final kha a() {
        return this.v;
    }

    public final void c(rt1 rt1) {
        if (rt1 == null) {
            rt1 = ut1.a;
        }
        rt1.Q();
        this.J0 = rt1;
        synchronized (this.K0) {
        }
    }

    public final void d(vzf vzf) {
        vzf.getClass();
        this.c.execute(new or1(this, w(vzf), this.E0 ? vzf.m : vzf.n, vzf.f, vzf.g, vzf.c() == null ? null : kxe.H(vzf), 0));
    }

    public final void e(vzf vzf) {
        vzf.getClass();
        this.c.execute(new or1(this, w(vzf), this.E0 ? vzf.m : vzf.n, vzf.f, vzf.g, vzf.c() == null ? null : kxe.H(vzf), 2));
    }

    public final au1 f() {
        return this.x;
    }

    public final rt1 g() {
        return this.J0;
    }

    public final void h(vzf vzf) {
        vzf.getClass();
        this.c.execute(new or1(this, w(vzf), this.E0 ? vzf.m : vzf.n, vzf.f, vzf.g, vzf.c() == null ? null : kxe.H(vzf), 1));
    }

    public final void i(boolean z2) {
        this.c.execute(new c70((Object) this, z2, 7));
    }

    public final void j(Collection collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (!arrayList.isEmpty()) {
            lr1 lr1 = this.x;
            synchronized (lr1.d) {
                lr1.p++;
            }
            Iterator it = new ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                vzf vzf = (vzf) it.next();
                String w2 = w(vzf);
                HashSet hashSet = this.I0;
                if (!hashSet.contains(w2)) {
                    hashSet.add(w2);
                    vzf.t();
                    vzf.r();
                }
            }
            try {
                this.c.execute(new nr1(this, new ArrayList(F(arrayList)), 1));
            } catch (RejectedExecutionException unused) {
                toString();
                lr1.q();
            }
        }
    }

    public final void k(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (!arrayList2.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(F(arrayList2));
            Iterator it = new ArrayList(arrayList2).iterator();
            while (it.hasNext()) {
                vzf vzf = (vzf) it.next();
                String w2 = w(vzf);
                HashSet hashSet = this.I0;
                if (hashSet.contains(w2)) {
                    vzf.u();
                    hashSet.remove(w2);
                }
            }
            this.c.execute(new nr1(this, arrayList3, 0));
        }
    }

    public final void m(boolean z2) {
        this.E0 = z2;
    }

    public final qu1 n() {
        return this.z;
    }

    public final void o(vzf vzf) {
        vzf.getClass();
        this.c.execute(new ir1(3, this, w(vzf)));
    }

    /* JADX WARNING: type inference failed for: r1v18, types: [kq9, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f9, code lost:
        r2 = (android.util.Size) r5.get(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p() {
        /*
            r17 = this;
            r0 = r17
            bpa r7 = r0.a
            ewd r1 = r7.B()
            fwd r1 = r1.b()
            bx1 r2 = r1.g
            java.util.List r3 = r2.a
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            int r3 = r3.size()
            java.util.List r4 = r1.b()
            int r4 = r4.size()
            java.util.List r1 = r1.b()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x018b
            java.util.List r1 = r2.a
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            boolean r1 = r1.isEmpty()
            r8 = 1
            if (r1 == 0) goto L_0x016f
            kq9 r1 = r0.F0
            if (r1 != 0) goto L_0x010c
            kq9 r1 = new kq9
            as1 r2 = r0.z
            qt1 r2 = r2.b
            mr1 r3 = new mr1
            r4 = 2
            r3.<init>(r0, r4)
            hq4 r4 = r0.M0
            r1.<init>()
            i3f r5 = new i3f
            r5.<init>()
            r6 = 0
            r1.w = r6
            jq9 r9 = new jq9
            r9.<init>()
            r1.c = r9
            r1.v = r3
            tgg r2 = r2.b()
            r3 = 34
            android.util.Size[] r2 = r2.v(r3)
            r3 = 0
            if (r2 != 0) goto L_0x0071
            android.util.Size r2 = new android.util.Size
            r2.<init>(r3, r3)
            goto L_0x00ff
        L_0x0071:
            androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk r5 = r5.a
            if (r5 == 0) goto L_0x00ac
            java.lang.String r5 = "Huawei"
            java.lang.String r9 = android.os.Build.BRAND
            boolean r5 = r5.equalsIgnoreCase(r9)
            if (r5 == 0) goto L_0x00ac
            java.lang.String r5 = "mha-l29"
            java.lang.String r9 = android.os.Build.MODEL
            boolean r5 = r5.equalsIgnoreCase(r9)
            if (r5 == 0) goto L_0x00ac
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r9 = r2.length
            r10 = r3
        L_0x0090:
            if (r10 >= r9) goto L_0x00a4
            r11 = r2[r10]
            v93 r12 = defpackage.i3f.c
            android.util.Size r13 = defpackage.i3f.b
            int r12 = r12.compare(r11, r13)
            if (r12 < 0) goto L_0x00a1
            r5.add(r11)
        L_0x00a1:
            int r10 = r10 + 1
            goto L_0x0090
        L_0x00a4:
            android.util.Size[] r2 = new android.util.Size[r3]
            java.lang.Object[] r2 = r5.toArray(r2)
            android.util.Size[] r2 = (android.util.Size[]) r2
        L_0x00ac:
            java.util.List r5 = java.util.Arrays.asList(r2)
            oj4 r9 = new oj4
            r10 = 15
            r9.<init>(r10)
            java.util.Collections.sort(r5, r9)
            android.util.Size r4 = r4.e()
            int r9 = r4.getWidth()
            long r9 = (long) r9
            int r4 = r4.getHeight()
            long r11 = (long) r4
            long r9 = r9 * r11
            r11 = 307200(0x4b000, double:1.51777E-318)
            long r9 = java.lang.Math.min(r9, r11)
            int r4 = r2.length
            r11 = r3
        L_0x00d2:
            if (r11 >= r4) goto L_0x00f8
            r12 = r2[r11]
            int r13 = r12.getWidth()
            long r13 = (long) r13
            int r15 = r12.getHeight()
            r16 = r4
            long r3 = (long) r15
            long r13 = r13 * r3
            int r3 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x00e9
            r2 = r12
            goto L_0x00ff
        L_0x00e9:
            if (r3 <= 0) goto L_0x00f1
            if (r6 == 0) goto L_0x00ef
            r2 = r6
            goto L_0x00ff
        L_0x00ef:
            r2 = 0
            goto L_0x00f9
        L_0x00f1:
            int r11 = r11 + 1
            r6 = r12
            r4 = r16
            r3 = 0
            goto L_0x00d2
        L_0x00f8:
            r2 = r3
        L_0x00f9:
            java.lang.Object r2 = r5.get(r2)
            android.util.Size r2 = (android.util.Size) r2
        L_0x00ff:
            r1.o = r2
            java.util.Objects.toString(r2)
            fwd r2 = r1.d()
            r1.b = r2
            r0.F0 = r1
        L_0x010c:
            boolean r1 = r17.x()
            if (r1 == 0) goto L_0x018b
            kq9 r1 = r0.F0
            if (r1 == 0) goto L_0x018b
            java.lang.String r9 = v(r1)
            kq9 r1 = r0.F0
            java.lang.Object r2 = r1.b
            r3 = r2
            fwd r3 = (defpackage.fwd) r3
            b0g r10 = defpackage.b0g.w
            java.util.List r6 = java.util.Collections.singletonList(r10)
            java.lang.Object r2 = r7.b
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2
            java.lang.Object r4 = r2.get(r9)
            xzf r4 = (defpackage.xzf) r4
            r5 = 0
            java.lang.Object r1 = r1.c
            r11 = r1
            jq9 r11 = (defpackage.jq9) r11
            if (r4 != 0) goto L_0x0141
            xzf r4 = new xzf
            r4.<init>(r3, r11, r5, r6)
            r2.put(r9, r4)
        L_0x0141:
            r4.e = r8
            r1 = r7
            r2 = r9
            r4 = r11
            r1.K(r2, r3, r4, r5, r6)
            kq9 r0 = r0.F0
            java.lang.Object r1 = r0.b
            fwd r1 = (defpackage.fwd) r1
            java.util.List r2 = java.util.Collections.singletonList(r10)
            java.lang.Object r3 = r7.b
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3
            java.lang.Object r4 = r3.get(r9)
            xzf r4 = (defpackage.xzf) r4
            if (r4 != 0) goto L_0x016c
            xzf r4 = new xzf
            java.lang.Object r0 = r0.c
            jq9 r0 = (defpackage.jq9) r0
            r5 = 0
            r4.<init>(r1, r0, r5, r2)
            r3.put(r9, r4)
        L_0x016c:
            r4.f = r8
            goto L_0x018b
        L_0x016f:
            if (r4 != r8) goto L_0x0177
            if (r3 != r8) goto L_0x0177
            r17.B()
            goto L_0x018b
        L_0x0177:
            r1 = 2
            if (r3 < r1) goto L_0x017e
            r17.B()
            goto L_0x018b
        L_0x017e:
            kq9 r1 = r0.F0
            if (r1 == 0) goto L_0x018b
            boolean r1 = r17.x()
            if (r1 != 0) goto L_0x018b
            r17.B()
        L_0x018b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xr1.p():void");
    }

    public final void q() {
        ArrayList<bx1> arrayList;
        boolean z2 = this.Q0 == 5 || this.Q0 == 2 || (this.Q0 == 7 && this.Y != 0);
        bs0.r("closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + a81.z(this.Q0) + " (error: " + u(this.Y) + ")", z2);
        C();
        jx1 jx1 = this.Z;
        synchronized (jx1.a) {
            try {
                if (!jx1.b.isEmpty()) {
                    arrayList = new ArrayList<>(jx1.b);
                    jx1.b.clear();
                } else {
                    arrayList = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (arrayList != null) {
            for (bx1 bx1 : arrayList) {
                for (bt1 a2 : bx1.e) {
                    a2.a(bx1.a());
                }
            }
        }
    }

    public final void r() {
        bs0.r((String) null, this.Q0 == 2 || this.Q0 == 5);
        bs0.r((String) null, this.v0.isEmpty());
        if (!this.C0) {
            t();
        } else if (this.D0) {
            toString();
        } else if (!this.x0.b) {
            this.C0 = false;
            t();
            toString();
        } else {
            toString();
            go1 F = m5a.F(new mr1(this, 1));
            this.D0 = true;
            F.b.d(new b(29, (Object) this), this.c);
        }
    }

    public final CameraDevice.StateCallback s() {
        ArrayList arrayList = new ArrayList(this.a.B().b().c);
        arrayList.add((gu1) this.G0.w);
        arrayList.add(this.y);
        return fqc.j(arrayList);
    }

    public final void t() {
        bs0.r((String) null, this.Q0 == 2 || this.Q0 == 5);
        bs0.r((String) null, this.v0.isEmpty());
        this.X = null;
        if (this.Q0 == 5) {
            E(3);
            return;
        }
        this.b.a.f0(this.x0);
        E(1);
    }

    public final String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", new Object[]{Integer.valueOf(hashCode()), this.z.a});
    }

    public final boolean x() {
        int i;
        ArrayList arrayList = new ArrayList();
        synchronized (this.K0) {
            try {
                i = this.y0.b == 2 ? 1 : 0;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        bpa bpa = this.a;
        bpa.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) bpa.b).entrySet()) {
            if (((xzf) entry.getValue()).e) {
                arrayList2.add((xzf) entry.getValue());
            }
        }
        for (xzf xzf : Collections.unmodifiableCollection(arrayList2)) {
            List list = xzf.d;
            if (list == null || list.get(0) != b0g.w) {
                if (xzf.c == null || xzf.d == null) {
                    xzf.toString();
                    return false;
                }
                fwd fwd = xzf.a;
                zzf zzf = xzf.b;
                for (lk4 lk4 : fwd.b()) {
                    j3f j3f = this.O0;
                    int inputFormat = zzf.getInputFormat();
                    jc0 b2 = jc0.b(i, inputFormat, lk4.h, j3f.i(inputFormat));
                    int inputFormat2 = zzf.getInputFormat();
                    Size size = lk4.h;
                    hc0 hc0 = xzf.c;
                    arrayList.add(new w90(b2, inputFormat2, size, hc0.b, xzf.d, hc0.d, (Range) zzf.k(zzf.o0, (Object) null)));
                }
            }
        }
        this.F0.getClass();
        HashMap hashMap = new HashMap();
        kq9 kq9 = this.F0;
        hashMap.put((jq9) kq9.c, Collections.singletonList((Size) kq9.o));
        try {
            this.O0.g(i, arrayList, hashMap, false, false);
            toString();
            return true;
        } catch (IllegalArgumentException unused) {
            toString();
            return false;
        }
    }

    public final jx1 y() {
        jx1 jx1;
        synchronized (this.K0) {
            jx1 = new jx1(this.N0, this.z.j, false);
        }
        return jx1;
    }

    /* JADX WARNING: type inference failed for: r6v7, types: [aqg, java.lang.Object] */
    public final void z(boolean z2) {
        if (!z2) {
            this.y.e.b = -1;
        }
        this.y.a();
        this.P0.i();
        toString();
        E(8);
        try {
            vu1 vu1 = this.b;
            vu1.a.Y(this.z.a, this.c, s());
        } catch (CameraAccessExceptionCompat e) {
            e.getMessage();
            toString();
            if (e.a != 10001) {
                xe8 xe8 = this.P0;
                if (((xr1) xe8.c).Q0 != 8) {
                    ((xr1) xe8.c).toString();
                    return;
                }
                ((xr1) xe8.c).toString();
                xe8.i();
                ? obj = new Object();
                obj.c = xe8;
                obj.b = new AtomicBoolean(false);
                obj.a = ((xr1) xe8.c).o.schedule((Runnable) new sr1(obj, 0), 2000, TimeUnit.MILLISECONDS);
                xe8.b = obj;
                return;
            }
            D(3, new ga0(e, 7), true);
        } catch (SecurityException e2) {
            e2.getMessage();
            toString();
            E(7);
            this.y.b();
        }
    }
}
