package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* renamed from: bn0  reason: default package */
public final class bn0 implements z49 {
    public final long a;
    public final ij2 b;
    public final gaf c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final jx3 g;
    public final xme h;
    public final etc i;
    public final xme j;
    public final etc k;
    public final AtomicLong l = new AtomicLong(0);
    public final AtomicBoolean m = new AtomicBoolean(false);

    public bn0(long j2, ij2 ij2, gaf gaf, Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4) {
        this.a = j2;
        this.b = ij2;
        this.c = gaf;
        this.d = lazy3;
        this.e = lazy2;
        this.f = lazy;
        osa osa = (osa) gaf;
        jx3 a2 = e14.a(osa.b());
        this.g = a2;
        xme a3 = f6e.a(CollectionsKt.emptyList());
        this.h = a3;
        this.i = new etc(a3);
        xme a4 = f6e.a((Object) null);
        this.j = a4;
        xme a5 = f6e.a((Object) null);
        this.k = new etc(a5);
        ev0.v(a2, (CoroutineContext) null, (f14) null, new vm0(lazy, this, lazy4, (Continuation) null), 3);
        bs0.K(bs0.F(new ps5(new wb(3, bs0.w(bs0.v(a4, 200)), this), new zw(a5, 1), 5), osa.b()), a2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a4 A[LOOP:0: B:24:0x009e->B:26:0x00a4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object e(defpackage.bn0 r15, java.lang.String r16, long r17, kotlin.coroutines.Continuation r19) {
        /*
            r0 = r15
            r1 = r19
            r15.getClass()
            boolean r2 = r1 instanceof defpackage.ym0
            if (r2 == 0) goto L_0x0019
            r2 = r1
            ym0 r2 = (defpackage.ym0) r2
            int r3 = r2.o
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0019
            int r3 = r3 - r4
            r2.o = r3
            goto L_0x001e
        L_0x0019:
            ym0 r2 = new ym0
            r2.<init>(r15, r1)
        L_0x001e:
            java.lang.Object r1 = r2.b
            java.lang.Object r11 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r2.o
            r12 = 2
            r4 = 1
            r13 = 0
            if (r3 == 0) goto L_0x0048
            if (r3 == r4) goto L_0x0040
            if (r3 != r12) goto L_0x0038
            java.lang.Object r0 = r2.a
            jj2 r0 = (defpackage.jj2) r0
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x00c4
        L_0x0038:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0040:
            java.lang.Object r0 = r2.a
            bn0 r0 = (defpackage.bn0) r0
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0087
        L_0x0048:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlin.Lazy r1 = r0.f
            java.lang.Object r1 = r1.getValue()
            qx2 r1 = (defpackage.qx2) r1
            long r5 = r0.a
            my2 r1 = (defpackage.my2) r1
            etc r1 = r1.o(r5)
            ome r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            a32 r1 = (defpackage.a32) r1
            if (r1 == 0) goto L_0x008b
            m72 r1 = r1.b
            long r5 = r1.a
            kotlin.Lazy r1 = r0.d
            java.lang.Object r1 = r1.getValue()
            r3 = r1
            lr6 r3 = (defpackage.lr6) r3
            r2.a = r0
            r2.o = r4
            ij2 r1 = r0.b
            r4 = r5
            r6 = r1
            r7 = r17
            r9 = r16
            r10 = r2
            java.lang.Object r1 = r3.a(r4, r6, r7, r9, r10)
            if (r1 != r11) goto L_0x0087
            goto L_0x00f0
        L_0x0087:
            jj2 r1 = (defpackage.jj2) r1
            if (r1 != 0) goto L_0x008d
        L_0x008b:
            r11 = r13
            goto L_0x00f0
        L_0x008d:
            java.util.ArrayList r3 = r1.c
            if (r3 == 0) goto L_0x008b
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r3, 10)
            r4.<init>(r5)
            java.util.Iterator r3 = r3.iterator()
        L_0x009e:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00b6
            java.lang.Object r5 = r3.next()
            bj2 r5 = (defpackage.bj2) r5
            fo3 r5 = r5.a
            long r5 = r5.a
            java.lang.Long r5 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r5)
            r4.add(r5)
            goto L_0x009e
        L_0x00b6:
            r2.a = r1
            r2.o = r12
            java.lang.Object r0 = r0.f(r4, r2)
            if (r0 != r11) goto L_0x00c1
            goto L_0x00f0
        L_0x00c1:
            r14 = r1
            r1 = r0
            r0 = r14
        L_0x00c4:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x00cf:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00e6
            java.lang.Object r3 = r1.next()
            r4 = r3
            vk3 r4 = (defpackage.vk3) r4
            boolean r4 = r4.B()
            if (r4 != 0) goto L_0x00cf
            r2.add(r3)
            goto L_0x00cf
        L_0x00e6:
            long r0 = r0.o
            java.lang.Long r0 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r0)
            kotlin.Pair r11 = kotlin.TuplesKt.to(r0, r2)
        L_0x00f0:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bn0.e(bn0, java.lang.String, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void a(String str) {
        this.j.setValue(str);
    }

    public final bs5 b() {
        return this.k;
    }

    public final boolean c() {
        return this.l.get() != -1 || !this.m.get();
    }

    public final void d() {
        if (this.m.compareAndSet(false, true)) {
            ev0.v(this.g, (CoroutineContext) null, (f14) null, new zm0(this, (Continuation) null), 3).V(new l(15, this));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(java.util.ArrayList r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.xm0
            if (r0 == 0) goto L_0x0013
            r0 = r9
            xm0 r0 = (defpackage.xm0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.c = r1
            goto L_0x0018
        L_0x0013:
            xm0 r0 = new xm0
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0075
        L_0x0029:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r9)
            gaf r9 = r7.c
            osa r9 = (defpackage.osa) r9
            q04 r9 = r9.a()
            if (r9 != 0) goto L_0x0042
            kotlin.coroutines.CoroutineContext r9 = r0.getContext()
        L_0x0042:
            jx3 r9 = defpackage.e14.a(r9)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r4 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r8, 10)
            r2.<init>(r4)
            java.util.Iterator r8 = r8.iterator()
        L_0x0053:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x006c
            java.lang.Object r4 = r8.next()
            wm0 r5 = new wm0
            r6 = 0
            r5.<init>(r4, r6, r7)
            r4 = 3
            nk4 r4 = defpackage.ev0.d(r9, r6, r5, r4)
            r2.add(r4)
            goto L_0x0053
        L_0x006c:
            r0.c = r3
            java.lang.Object r9 = defpackage.j4b.g(r2, r0)
            if (r9 != r1) goto L_0x0075
            return r1
        L_0x0075:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.List r7 = kotlin.collections.CollectionsKt.filterNotNull(r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bn0.f(java.util.ArrayList, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final etc getMembers() {
        return this.i;
    }
}
