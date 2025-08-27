package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: xy9  reason: default package */
public final class xy9 implements dy9, wq {
    public static final long L;
    public static final long M;
    public static final /* synthetic */ int N = 0;
    public boolean A;
    public final float B;
    public boolean C;
    public ir8 D;
    public ir8 E;
    public us8 F;
    public long G;
    public float H;
    public final Lazy I;
    public final xme J;
    public final etc K;
    public final Context a;
    public final bud b;
    public final gaf c;
    public final po5 d;
    public final fa9 e;
    public final x23 f;
    public final sv0 g;
    public final lta h;
    public final xq6 i;
    public final jx3 j;
    public final Lazy k;
    public final Lazy l;
    public volatile aje m;
    public int n;
    public qo8 o;
    public hy9 p;
    public final CopyOnWriteArraySet q = new CopyOnWriteArraySet();
    public final LinkedHashMap r = new LinkedHashMap();
    public Handler s;
    public final o99 t = new o99(5, this);
    public final xme u;
    public final etc v;
    public final xme w;
    public int x;
    public boolean y;
    public boolean z;

    static {
        Duration.Companion companion = Duration.Companion;
        DurationUnit durationUnit = DurationUnit.SECONDS;
        L = DurationKt.toDuration(1, durationUnit);
        M = DurationKt.toDuration(3, durationUnit);
    }

    public xy9(Context context, bud bud, gaf gaf, po5 po5, fa9 fa9, x23 x23, sv0 sv0, xq xqVar, lta lta, s04 s04, xq6 xq6, Lazy lazy, Lazy lazy2) {
        this.a = context;
        this.b = bud;
        this.c = gaf;
        this.d = po5;
        this.e = fa9;
        this.f = x23;
        this.g = sv0;
        this.h = lta;
        this.i = xq6;
        this.k = lazy;
        this.l = lazy2;
        this.j = e14.a(((osa) gaf).c().t0().plus(kr7.b()).plus(s04));
        xme a2 = f6e.a(-1L);
        this.u = a2;
        this.v = new etc(a2);
        this.w = f6e.a(-1L);
        this.x = 1;
        this.B = 1.0f;
        this.C = true;
        this.G = -1;
        this.H = 1.0f;
        this.I = LazyKt.lazy(new c28(15, this));
        udg udg = (udg) xqVar;
        udg.i.add(this);
        if (udg.c()) {
            h();
        }
        xme a3 = f6e.a(Float.valueOf(c44.DEFAULT_ASPECT_RATIO));
        this.J = a3;
        this.K = new etc(a3);
    }

    public static final ir8 d(xy9 xy9, int i2) {
        if (i2 == -1) {
            xy9.getClass();
            return null;
        }
        qo8 qo8 = xy9.o;
        if (qo8 != null) {
            return qo8.l0().n(i2, qo8.a, 0).c;
        }
        return null;
    }

    public static final void i(xy9 xy9) {
        xy9.n = 0;
        ev0.v(xy9.j, (CoroutineContext) null, (f14) null, new wy9(xy9, (Continuation) null), 3);
        if (xy9.p == null) {
            hy9 hy9 = new hy9(xy9);
            qo8 qo8 = xy9.o;
            if (qo8 != null) {
                qo8.v(hy9);
            }
            xy9.p = hy9;
        }
        z68.c("xy9", "notifyListeners", new Object[0]);
        synchronized (xy9.q) {
            try {
                Iterator it = xy9.q.iterator();
                while (it.hasNext()) {
                    ((gy9) it.next()).a(xy9.l(), xy9.m());
                    Unit unit = Unit.INSTANCE;
                }
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: qq8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: sq8} */
    /* JADX WARNING: type inference failed for: r4v0, types: [ss8, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.ir8 j(java.lang.String r21, java.lang.String r22, defpackage.jr8 r23, java.lang.String r24, java.lang.String r25, android.os.Bundle r26) {
        /*
            oq8 r0 = new oq8
            r0.<init>()
            gc4 r1 = new gc4
            r1.<init>()
            java.util.List r7 = java.util.Collections.emptyList()
            k0d r9 = defpackage.k0d.v
            uq8 r13 = new uq8
            r13.<init>()
            ar8 r20 = defpackage.ar8.d
            r2 = 0
            if (r21 != 0) goto L_0x001c
            r3 = r2
            goto L_0x0020
        L_0x001c:
            android.net.Uri r3 = android.net.Uri.parse(r21)
        L_0x0020:
            r22.getClass()
            ss8 r4 = new ss8
            r4.<init>()
            r5 = r24
            r4.b = r5
            r5 = r25
            r4.a = r5
            r5 = r26
            r4.H = r5
            int r5 = r23.ordinal()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.G = r5
            us8 r15 = new us8
            r15.<init>(r4)
            java.lang.Object r4 = r1.e
            android.net.Uri r4 = (android.net.Uri) r4
            if (r4 == 0) goto L_0x0052
            java.lang.Object r4 = r1.d
            java.util.UUID r4 = (java.util.UUID) r4
            if (r4 == 0) goto L_0x0050
            goto L_0x0052
        L_0x0050:
            r4 = 0
            goto L_0x0053
        L_0x0052:
            r4 = 1
        L_0x0053:
            defpackage.n79.n(r4)
            if (r3 == 0) goto L_0x0076
            xq8 r14 = new xq8
            java.lang.Object r4 = r1.d
            java.util.UUID r4 = (java.util.UUID) r4
            if (r4 == 0) goto L_0x0065
            tq8 r2 = new tq8
            r2.<init>(r1)
        L_0x0065:
            r5 = r2
            r10 = 0
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = 0
            r6 = 0
            r8 = 0
            r2 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r17 = r14
            goto L_0x0078
        L_0x0076:
            r17 = r2
        L_0x0078:
            ir8 r1 = new ir8
            sq8 r2 = new sq8
            r2.<init>(r0)
            wq8 r0 = new wq8
            r0.<init>(r13)
            r14 = r1
            r3 = r15
            r15 = r22
            r16 = r2
            r18 = r0
            r19 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xy9.j(java.lang.String, java.lang.String, jr8, java.lang.String, java.lang.String, android.os.Bundle):ir8");
    }

    public final void a() {
        z68.c("xy9", "disconnect: ", new Object[0]);
        g();
        this.m = ev0.v(this.j, (CoroutineContext) null, (f14) null, new ly9(this, (Continuation) null), 3);
    }

    public final void c() {
        h();
    }

    public final void e(by9 by9) {
        synchronized (this.q) {
            try {
                iy9 iy9 = new iy9(by9);
                gy9 gy9 = (gy9) this.r.put(by9, iy9);
                if (gy9 != null) {
                    this.q.remove(gy9);
                }
                this.q.add(iy9);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        z68.c("xy9", "cancelPositionObserving", new Object[0]);
        Handler handler = this.s;
        if (handler != null) {
            handler.removeCallbacks(this.t);
        }
    }

    public final void g() {
        z68.c("xy9", "cancelScheduledConnectionAction", new Object[0]);
        aje aje = this.m;
        if (aje != null) {
            aje.b((CancellationException) null);
        }
        this.m = null;
    }

    public final void h() {
        g();
        this.m = ev0.v(this.j, (CoroutineContext) null, (f14) null, new jy9(this, (Continuation) null), 3);
    }

    public final void k(boolean z2) {
        z68.c("xy9", "disconnectNow started", new Object[0]);
        Handler handler = this.s;
        if (handler != null) {
            handler.removeCallbacks(this.t);
        }
        this.s = null;
        ev0.v(this.j, (CoroutineContext) null, (f14) null, new wy9(this, (Continuation) null), 3);
        if (z2) {
            g();
        }
    }

    public final long l() {
        String str;
        Long longOrNull;
        ir8 ir8 = this.D;
        if (ir8 == null || (str = ir8.a) == null || (longOrNull = StringsKt.toLongOrNull(str)) == null) {
            return -1;
        }
        return longOrNull.longValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r1 = (r1 = r1.d).H;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.jr8 m() {
        /*
            r1 = this;
            pf6 r0 = defpackage.jr8.a
            ir8 r1 = r1.D
            if (r1 == 0) goto L_0x0013
            us8 r1 = r1.d
            if (r1 == 0) goto L_0x0013
            java.lang.Integer r1 = r1.H
            if (r1 == 0) goto L_0x0013
            int r1 = r1.intValue()
            goto L_0x0014
        L_0x0013:
            r1 = -1
        L_0x0014:
            r0.getClass()
            jr8 r1 = defpackage.pf6.h(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xy9.m():jr8");
    }

    public final cy9 n() {
        us8 us8 = this.F;
        Map map = null;
        if (us8 == null) {
            return null;
        }
        CharSequence charSequence = us8.a;
        if (charSequence == null) {
            charSequence = "";
        }
        Bundle bundle = us8.I;
        if (bundle != null) {
            Set<String> keySet = bundle.keySet();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(keySet, 10)), 16));
            for (String str : keySet) {
                Pair pair = TuplesKt.to(str, bundle.get(str));
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            map = linkedHashMap;
        }
        if (map == null) {
            map = MapsKt.emptyMap();
        }
        return new cy9(us8.b, charSequence, map);
    }

    public final long o() {
        return ((Number) this.u.getValue()).longValue();
    }

    public final boolean p(long j2) {
        return l() == j2;
    }

    public final void q() {
        ev0.v(this.j, (CoroutineContext) null, (f14) null, new ny9(this, (Continuation) null), 3);
    }

    public final void r() {
        ev0.v(this.j, (CoroutineContext) null, (f14) null, new oy9(this, (Continuation) null), 3);
    }

    public final void s(o5a o5a) {
        ev0.v(this.j, ((osa) this.c).b(), (f14) null, new py9(o5a, this, (Continuation) null), 2);
    }

    public final void t(String str, String str2, jr8 jr8, String str3, String str4, Bundle bundle) {
        ev0.v(this.j, ((osa) this.c).c(), (f14) null, new ry9(this, str, str2, jr8, str4, str3, bundle, (Continuation) null), 2);
    }

    public final void u(by9 by9) {
        synchronized (this.q) {
            gy9 gy9 = (gy9) this.r.remove(by9);
            if (gy9 != null) {
                this.q.remove(gy9);
            }
        }
    }

    public final void v(long j2) {
        ev0.v(this.j, (CoroutineContext) null, (f14) null, new ty9(j2, this, (Continuation) null), 3);
    }

    public final void w() {
        ev0.v(this.j, (CoroutineContext) null, (f14) null, new vy9(this, (Continuation) null), 3);
    }

    public final void x() {
        z68.c("xy9", "tryToStartPositionObserving", new Object[0]);
        f();
        if (this.s == null) {
            this.s = new Handler(Looper.getMainLooper());
        }
        Handler handler = this.s;
        if (handler != null) {
            handler.post(this.t);
        }
    }
}
