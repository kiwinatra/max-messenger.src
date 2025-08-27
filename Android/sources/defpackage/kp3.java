package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* renamed from: kp3  reason: default package */
public final class kp3 implements cp3 {
    public final ocb b;
    public final Context c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public final Lazy h;
    public final xme i;
    public final etc j;
    public final Lazy k;
    public final Lazy l;
    public final AtomicBoolean m = new AtomicBoolean(false);

    public kp3(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6, ocb ocb, Context context, bo3 bo3) {
        this.b = ocb;
        this.c = context;
        this.d = lazy2;
        this.e = lazy4;
        this.f = lazy5;
        this.g = lazy3;
        this.h = lazy6;
        xme a = f6e.a(po3.d);
        this.i = a;
        this.j = new etc(a);
        ur urVar = new ur(12, lazy);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.k = LazyKt.lazy(lazyThreadSafetyMode, urVar);
        Lazy lazy7 = LazyKt.lazy(lazyThreadSafetyMode, new nm1(16, this));
        this.l = lazy7;
        bs0.K(new ps5(bo3.a(), new dp3(this, (Continuation) null), 5), (d14) lazy7.getValue());
        bs0.K(new ps5(new vt5(new ps5(bs0.E(new fs5(3, new ql8(ocb.b, 19))), new ncb(ocb, (Continuation) null)), new mh0((Object) ocb, (Continuation) null, 11)), new ep3(this, (Continuation) null), 5), (d14) lazy7.getValue());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        if (r6 == r1) goto L_0x0095;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0082 A[LOOP:0: B:15:0x007c->B:17:0x0082, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.kp3 r5, kotlin.coroutines.Continuation r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof defpackage.gp3
            if (r0 == 0) goto L_0x0016
            r0 = r6
            gp3 r0 = (defpackage.gp3) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x001b
        L_0x0016:
            gp3 r0 = new gp3
            r0.<init>(r5, r6)
        L_0x001b:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            kp3 r5 = r0.a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x004e
        L_0x002e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0036:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.Lazy r6 = r5.d
            java.lang.Object r6 = r6.getValue()
            eu3 r6 = (defpackage.eu3) r6
            r0.a = r5
            r0.o = r3
            km3 r6 = r6.a
            java.util.List r6 = r6.s()
            if (r6 != r1) goto L_0x004e
            goto L_0x0095
        L_0x004e:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            kotlin.Lazy r1 = r5.h
            java.lang.Object r1 = r1.getValue()
            ns3 r1 = (defpackage.ns3) r1
            r1.getClass()
            ls3 r2 = new ls3
            r3 = 0
            r2.<init>(r1, r3)
            java.util.List r6 = kotlin.collections.CollectionsKt.sortedWith(r6, r2)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            jx3 r0 = defpackage.e14.a(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r6, 10)
            r1.<init>(r2)
            java.util.Iterator r6 = r6.iterator()
        L_0x007c:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0095
            java.lang.Object r2 = r6.next()
            fp3 r3 = new fp3
            r4 = 0
            r3.<init>(r2, r4, r5)
            r2 = 3
            nk4 r2 = defpackage.ev0.d(r0, r4, r3, r2)
            r1.add(r2)
            goto L_0x007c
        L_0x0095:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kp3.a(kp3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01d4 A[LOOP:4: B:53:0x01ce->B:55:0x01d4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0235 A[LOOP:6: B:63:0x022f->B:65:0x0235, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0262 A[LOOP:7: B:67:0x025c->B:69:0x0262, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(defpackage.kp3 r21, kotlin.coroutines.Continuation r22) {
        /*
            r0 = r21
            r1 = r22
            r21.getClass()
            boolean r2 = r1 instanceof defpackage.ip3
            if (r2 == 0) goto L_0x001a
            r2 = r1
            ip3 r2 = (defpackage.ip3) r2
            int r3 = r2.v
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001a
            int r3 = r3 - r4
            r2.v = r3
            goto L_0x001f
        L_0x001a:
            ip3 r2 = new ip3
            r2.<init>(r0, r1)
        L_0x001f:
            java.lang.Object r1 = r2.c
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.v
            r5 = 1
            r6 = 2
            if (r4 == 0) goto L_0x0047
            if (r4 == r5) goto L_0x0041
            if (r4 != r6) goto L_0x0039
            java.util.List r0 = r2.b
            java.util.List r0 = (java.util.List) r0
            kp3 r3 = r2.a
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x008e
        L_0x0039:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0041:
            kp3 r0 = r2.a
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0070
        L_0x0047:
            kotlin.ResultKt.throwOnFailure(r1)
            ocb r1 = r0.b
            ddb r1 = r1.b
            boolean r1 = r1.i()
            if (r1 != 0) goto L_0x005a
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x0275
        L_0x005a:
            kotlin.Lazy r1 = r0.d
            java.lang.Object r1 = r1.getValue()
            eu3 r1 = (defpackage.eu3) r1
            r2.a = r0
            r2.v = r5
            km3 r1 = r1.a
            java.util.List r1 = r1.s()
            if (r1 != r3) goto L_0x0070
            goto L_0x0275
        L_0x0070:
            java.util.List r1 = (java.util.List) r1
            kotlin.Lazy r4 = r0.d
            java.lang.Object r4 = r4.getValue()
            eu3 r4 = (defpackage.eu3) r4
            r2.a = r0
            r5 = r1
            java.util.List r5 = (java.util.List) r5
            r2.b = r5
            r2.v = r6
            vk3 r4 = r4.d()
            if (r4 != r3) goto L_0x008b
            goto L_0x0275
        L_0x008b:
            r3 = r0
            r0 = r1
            r1 = r4
        L_0x008e:
            vk3 r1 = (defpackage.vk3) r1
            kotlin.Lazy r4 = r3.g
            java.lang.Object r4 = r4.getValue()
            ph4 r4 = (defpackage.ph4) r4
            r4.getClass()
            dz9 r5 = new dz9
            r7 = 6
            r5.<init>(r7)
            kotlin.Lazy r4 = r4.a
            java.lang.Object r4 = r4.getValue()
            c7d r4 = (defpackage.c7d) r4
            java.util.ArrayList r4 = r4.e()
            java.util.Iterator r4 = r4.iterator()
        L_0x00b1:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x014f
            java.lang.Object r7 = r4.next()
            xdb r7 = (defpackage.xdb) r7
            int r8 = r7.o
            java.lang.Object r8 = r5.a(r8)
            qdb r8 = (defpackage.qdb) r8
            long r9 = r7.w
            java.lang.String r11 = r7.v
            if (r8 != 0) goto L_0x0103
            qdb r8 = new qdb
            java.lang.String r14 = r7.a()
            java.util.List r17 = java.util.Collections.singletonList(r11)
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            java.util.List r18 = java.util.Collections.singletonList(r9)
            java.lang.String r15 = r7.y
            java.lang.String r9 = r7.z
            int r10 = r7.o
            java.lang.String r11 = r7.X
            java.lang.String r7 = r7.x
            r12 = r8
            r13 = r10
            r16 = r9
            r19 = r11
            r20 = r7
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            int r7 = r5.b(r10)
            java.lang.Object[] r9 = r5.c
            r11 = r9[r7]
            int[] r12 = r5.b
            r12[r7] = r10
            r9[r7] = r8
            qdb r11 = (defpackage.qdb) r11
            goto L_0x00b1
        L_0x0103:
            java.util.ArrayList r7 = new java.util.ArrayList
            java.util.List r12 = r8.e
            r7.<init>(r12)
            java.util.ArrayList r15 = new java.util.ArrayList
            java.util.List r12 = r8.f
            r15.<init>(r12)
            r7.add(r11)
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r15.add(r9)
            java.lang.String r9 = r8.h
            if (r9 == 0) goto L_0x0123
            boolean r10 = kotlin.text.StringsKt.isBlank(r9)
        L_0x0123:
            qdb r10 = new qdb
            java.lang.String r11 = r8.b
            java.lang.String r14 = r8.g
            int r13 = r8.a
            r16 = 0
            r12 = r10
            r19 = r14
            r14 = r11
            r18 = r15
            r15 = r11
            r17 = r7
            r20 = r9
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            int r7 = r8.a
            int r8 = r5.b(r7)
            java.lang.Object[] r9 = r5.c
            r11 = r9[r8]
            int[] r12 = r5.b
            r12[r8] = r7
            r9[r8] = r10
            qdb r11 = (defpackage.qdb) r11
            goto L_0x00b1
        L_0x014f:
            int r4 = r5.e
            java.util.List r4 = kotlin.collections.CollectionsKt.createListBuilder(r4)
            java.lang.Object[] r7 = r5.c
            long[] r5 = r5.a
            int r8 = r5.length
            int r8 = r8 - r6
            if (r8 < 0) goto L_0x0199
            r6 = 0
            r9 = r6
        L_0x015f:
            r10 = r5[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L_0x0194
            int r12 = r9 - r8
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = r6
        L_0x0179:
            if (r14 >= r12) goto L_0x0192
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.32E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L_0x018e
            int r15 = r9 << 3
            int r15 = r15 + r14
            r15 = r7[r15]
            qdb r15 = (defpackage.qdb) r15
            r4.add(r15)
        L_0x018e:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L_0x0179
        L_0x0192:
            if (r12 != r13) goto L_0x0199
        L_0x0194:
            if (r9 == r8) goto L_0x0199
            int r9 = r9 + 1
            goto L_0x015f
        L_0x0199:
            java.util.List r4 = kotlin.collections.CollectionsKt.build(r4)
            java.util.Collection r4 = (java.util.Collection) r4
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x01aa:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x01c5
            java.lang.Object r6 = r0.next()
            r7 = r6
            vk3 r7 = (defpackage.vk3) r7
            long r7 = r7.s()
            r9 = 0
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x01aa
            r5.add(r6)
            goto L_0x01aa
        L_0x01c5:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x01ce:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x01e6
            java.lang.Object r6 = r5.next()
            vk3 r6 = (defpackage.vk3) r6
            long r6 = r6.s()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r0.add(r6)
            goto L_0x01ce
        L_0x01e6:
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            java.util.Iterator r6 = r4.iterator()
        L_0x01f1:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x020c
            java.lang.Object r7 = r6.next()
            r8 = r7
            qdb r8 = (defpackage.qdb) r8
            java.util.List r8 = r8.f
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r0.containsAll(r8)
            if (r8 == 0) goto L_0x01f1
            r5.add(r7)
            goto L_0x01f1
        L_0x020c:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            kotlin.sequences.Sequence r4 = kotlin.collections.CollectionsKt.asSequence(r4)
            wk r6 = new wk
            r7 = 10
            r6.<init>(r7, r5, r1)
            kotlin.sequences.Sequence r1 = kotlin.sequences.SequencesKt.filter(r4, r6)
            cx4 r4 = new cx4
            r5 = 17
            r4.<init>(r5)
            kotlin.sequences.Sequence r1 = kotlin.sequences.SequencesKt.sortedWith(r1, r4)
            java.util.Iterator r1 = r1.iterator()
        L_0x022f:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x023f
            java.lang.Object r4 = r1.next()
            qdb r4 = (defpackage.qdb) r4
            r0.add(r4)
            goto L_0x022f
        L_0x023f:
            android.content.Context r1 = r3.c
            int r3 = defpackage.qad.O1
            java.lang.String r1 = r1.getString(r3)
            kotlin.coroutines.CoroutineContext r2 = r2.getContext()
            jx3 r2 = defpackage.e14.a(r2)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r0, 10)
            r3.<init>(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x025c:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0275
            java.lang.Object r4 = r0.next()
            hp3 r5 = new hp3
            r6 = 0
            r5.<init>(r4, r6, r1)
            r4 = 3
            nk4 r4 = defpackage.ev0.d(r2, r6, r5, r4)
            r3.add(r4)
            goto L_0x025c
        L_0x0275:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kp3.b(kp3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final ome c() {
        return this.j;
    }

    public final void d() {
        if (this.m.compareAndSet(false, true)) {
            ev0.v((d14) this.l.getValue(), (CoroutineContext) null, (f14) null, new jp3(this, (Continuation) null), 3);
        }
    }
}
