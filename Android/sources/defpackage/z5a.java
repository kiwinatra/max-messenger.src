package defpackage;

import android.os.SystemClock;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: z5a  reason: default package */
public final class z5a {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final jx3 e;
    public final String f = z5a.class.getName();
    public final a0a g = cvg.a();
    public final AtomicInteger h = new AtomicInteger(1);
    public volatile long i;
    public final AtomicReference j = new AtomicReference();
    public final AtomicReference k = new AtomicReference();
    public final AtomicReference l = new AtomicReference(une.a);

    public z5a(gaf gaf, xq xqVar, vne vne, Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4) {
        this.a = lazy2;
        this.b = lazy3;
        this.c = lazy;
        this.d = lazy4;
        jx3 a2 = e14.a(((osa) gaf).b());
        this.e = a2;
        ((udg) xqVar).i.add(new g78(1, this));
        bs0.K(new ps5(vne.b, new zw(29, (Object) this), 5), a2);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.z5a r7, kotlin.coroutines.Continuation r8) {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof defpackage.y5a
            if (r0 == 0) goto L_0x0016
            r0 = r8
            y5a r0 = (defpackage.y5a) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x001b
        L_0x0016:
            y5a r0 = new y5a
            r0.<init>(r7, r8)
        L_0x001b:
            java.lang.Object r8 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            a0a r7 = r0.b
            z5a r0 = r0.a
            kotlin.ResultKt.throwOnFailure(r8)
            r8 = r7
            r7 = r0
            goto L_0x0060
        L_0x0033:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003b:
            kotlin.ResultKt.throwOnFailure(r8)
            java.util.concurrent.atomic.AtomicReference r8 = r7.k
            r8.set(r4)
            java.util.concurrent.atomic.AtomicReference r8 = r7.j
            r8.set(r4)
            java.util.concurrent.atomic.AtomicInteger r8 = r7.h
            r8.set(r3)
            r5 = 0
            r7.i = r5
            a0a r8 = r7.g
            r0.a = r7
            r0.b = r8
            r0.v = r3
            java.lang.Object r0 = r8.d(r0)
            if (r0 != r1) goto L_0x0060
            goto L_0x008b
        L_0x0060:
            kotlin.Lazy r0 = r7.a     // Catch:{ all -> 0x008c }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x008c }
            x23 r0 = (defpackage.x23) r0     // Catch:{ all -> 0x008c }
            a33 r0 = (defpackage.a33) r0     // Catch:{ all -> 0x008c }
            long r0 = r0.B()     // Catch:{ all -> 0x008c }
            r2 = 1
            long r0 = r0 + r2
            kotlin.Lazy r7 = r7.a     // Catch:{ all -> 0x008c }
            java.lang.Object r7 = r7.getValue()     // Catch:{ all -> 0x008c }
            x23 r7 = (defpackage.x23) r7     // Catch:{ all -> 0x008c }
            a33 r7 = (defpackage.a33) r7     // Catch:{ all -> 0x008c }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x008c }
            java.lang.String r1 = "app.stats.session.id"
            r7.k(r1, r0)     // Catch:{ all -> 0x008c }
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x008c }
            r8.e(r4)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x008b:
            return r1
        L_0x008c:
            r7 = move-exception
            r8.e(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z5a.a(z5a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static void g(z5a z5a, jgd jgd) {
        z5a.f(jgd, h8b.e);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001e, code lost:
        r5 = r6.e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map b(int r5, defpackage.n78 r6, defpackage.h8b r7) {
        /*
            r4 = this;
            java.util.Map r0 = kotlin.collections.MapsKt.createMapBuilder()
            java.util.concurrent.atomic.AtomicInteger r1 = r4.h
            int r1 = r1.getAndIncrement()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "action_id"
            r0.put(r2, r1)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r1 = "screen_to"
            r0.put(r1, r5)
            if (r6 == 0) goto L_0x0027
            java.util.Map r5 = r6.e
            if (r5 == 0) goto L_0x0027
            java.lang.Object r5 = r5.get(r1)
            goto L_0x0028
        L_0x0027:
            r5 = 0
        L_0x0028:
            if (r5 == 0) goto L_0x003a
            long r1 = r6.a
            java.lang.Long r6 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "prev_time"
            r0.put(r1, r6)
            java.lang.String r6 = "screen_from"
            r0.put(r6, r5)
        L_0x003a:
            java.util.concurrent.atomic.AtomicReference r4 = r4.l
            java.lang.Object r4 = r4.get()
            une r4 = (defpackage.une) r4
            h8b r5 = defpackage.h8b.e
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r5)
            r6 = 2
            r1 = 1
            java.lang.String r2 = "pip"
            if (r5 == 0) goto L_0x0069
            r4.getClass()
            une r5 = defpackage.une.b
            if (r4 == r5) goto L_0x0059
            une r7 = defpackage.une.c
            if (r4 != r7) goto L_0x00b8
        L_0x0059:
            if (r4 != r5) goto L_0x005f
            pf6 r4 = defpackage.hnb.b
            r6 = r1
            goto L_0x0061
        L_0x005f:
            pf6 r4 = defpackage.hnb.b
        L_0x0061:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r0.put(r2, r4)
            goto L_0x00b8
        L_0x0069:
            hnb r5 = r7.a
            if (r5 == 0) goto L_0x0077
            int r4 = r5.a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.put(r2, r4)
            goto L_0x0091
        L_0x0077:
            r4.getClass()
            une r5 = defpackage.une.b
            if (r4 == r5) goto L_0x0082
            une r3 = defpackage.une.c
            if (r4 != r3) goto L_0x0091
        L_0x0082:
            if (r4 != r5) goto L_0x0088
            pf6 r4 = defpackage.hnb.b
            r6 = r1
            goto L_0x008a
        L_0x0088:
            pf6 r4 = defpackage.hnb.b
        L_0x008a:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r0.put(r2, r4)
        L_0x0091:
            s5a r4 = r7.b
            if (r4 == 0) goto L_0x00a0
            int r4 = r4.a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "reason"
            r0.put(r5, r4)
        L_0x00a0:
            java.lang.Long r4 = r7.d
            if (r4 == 0) goto L_0x00b8
            zfe r5 = r7.c
            if (r5 == 0) goto L_0x00b8
            java.lang.String r6 = "source_id"
            r0.put(r6, r4)
            int r4 = r5.a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "source_type"
            r0.put(r5, r4)
        L_0x00b8:
            java.util.Map r4 = kotlin.collections.MapsKt.build(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z5a.b(int, n78, h8b):java.util.Map");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [hj7, java.lang.Object] */
    public final n78 c(md mdVar, Map map) {
        ? obj = new Object();
        obj.v = "NAV";
        Lazy lazy = this.a;
        obj.b = ((qjd) ((x23) lazy.getValue())).s();
        obj.w = mdVar.a;
        obj.c = ((a33) ((x23) lazy.getValue())).B();
        obj.a = System.currentTimeMillis();
        obj.c(map);
        return obj.d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r2 = r2.e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer d() {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r2 = r2.k
            java.lang.Object r2 = r2.get()
            n78 r2 = (defpackage.n78) r2
            r0 = 0
            if (r2 == 0) goto L_0x0016
            java.util.Map r2 = r2.e
            if (r2 == 0) goto L_0x0016
            java.lang.String r1 = "screen_to"
            java.lang.Object r2 = r2.get(r1)
            goto L_0x0017
        L_0x0016:
            r2 = r0
        L_0x0017:
            boolean r1 = r2 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x001e
            r0 = r2
            java.lang.Integer r0 = (java.lang.Integer) r0
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z5a.d():java.lang.Integer");
    }

    public final boolean e() {
        akd akd = (akd) ((bud) this.b.getValue());
        akd.getClass();
        return SystemClock.elapsedRealtime() - this.i < akd.r(PmsKey.f106statsessionbackgroundthreshold, 60000);
    }

    public final void f(jgd jgd, h8b h8b) {
        Map map;
        n78 n78 = (n78) this.k.get();
        md mdVar = n78 == null ? md.COLD_START : md.GO;
        Object obj = (n78 == null || (map = n78.e) == null) ? null : map.get("screen_to");
        jgd jgd2 = jgd.APPLICATION_BACKGROUND;
        if (Intrinsics.areEqual(obj, (Object) 1) && !e()) {
            une une = (une) this.l.get();
            une.getClass();
            if (!(une == une.b || une == une.c)) {
                return;
            }
        }
        ev0.v(this.e, (CoroutineContext) null, (f14) null, new x5a(mdVar, this, jgd, h8b, n78, (Continuation) null), 3);
        if (obj != null) {
            boolean areEqual = Intrinsics.areEqual((Object) Integer.valueOf(jgd.a), (Object) 1);
            boolean areEqual2 = Intrinsics.areEqual(obj, (Object) 150);
            Lazy lazy = this.d;
            if (areEqual2) {
                ((ecb) lazy.getValue()).e(vbb.FAILED, areEqual ? ubb.LEAVE_APP : ubb.LEAVE_SCREEN);
            } else if (Intrinsics.areEqual(obj, (Object) 350)) {
                ((ecb) lazy.getValue()).d(vbb.FAILED, areEqual ? ubb.LEAVE_APP : ubb.LEAVE_SCREEN);
            }
        }
    }

    public final Object h(int i2, n78 n78, md mdVar, h8b h8b, boolean z, Continuation continuation) {
        boolean z2 = false;
        if (n78 != null) {
            Map map = n78.e;
            Object obj = map.get("screen_to");
            if ((obj instanceof Integer) && i2 == ((Number) obj).intValue()) {
                Object obj2 = map.get("pip");
                hnb hnb = h8b.a;
                Integer num = null;
                if (Intrinsics.areEqual((Object) hnb != null ? Integer.valueOf(hnb.a) : null, obj2)) {
                    Object obj3 = map.get("reason");
                    s5a s5a = h8b.b;
                    if (Intrinsics.areEqual((Object) s5a != null ? Integer.valueOf(s5a.a) : null, obj3)) {
                        Object obj4 = map.get("source_type");
                        zfe zfe = h8b.c;
                        if (zfe != null) {
                            num = Integer.valueOf(zfe.a);
                        }
                        if (Intrinsics.areEqual((Object) num, obj4)) {
                            z2 = Intrinsics.areEqual((Object) h8b.d, map.get("source_id"));
                        }
                    }
                }
            }
        }
        if (z2) {
            return Unit.INSTANCE;
        }
        n78 c2 = c(mdVar, b(i2, n78, h8b));
        this.k.updateAndGet(new n01(5, c2));
        jgd jgd = jgd.APPLICATION_BACKGROUND;
        if (i2 != 1) {
            this.j.updateAndGet(new n01(6, h8b));
        }
        Lazy lazy = this.c;
        if (z) {
            nd ndVar = (nd) lazy.getValue();
            ndVar.j(c2);
            Object g2 = ((k78) ndVar.b.getValue()).g(true, continuation);
            if (g2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                g2 = Unit.INSTANCE;
            }
            return g2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? g2 : Unit.INSTANCE;
        }
        ((nd) lazy.getValue()).j(c2);
        return Unit.INSTANCE;
    }
}
