package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: h06  reason: default package */
public final class h06 extends SuspendLambda implements Function2 {
    public m06 a;
    public int b;
    public final /* synthetic */ qz5 c;
    public final /* synthetic */ m06 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h06(qz5 qz5, m06 m06, Continuation continuation) {
        super(2, continuation);
        this.c = qz5;
        this.o = m06;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new h06(this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h06) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        r15 = kotlin.text.StringsKt.trim(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0073, code lost:
        r15 = (java.lang.String) r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0084, code lost:
        if ((!((java.util.Collection) r14.o.y0.get()).isEmpty()) == false) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0086, code lost:
        r0 = r14.o;
        r1 = r0.v;
        r0 = (java.lang.Iterable) r0.y0.get();
        r3 = new java.util.ArrayList(kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r0, 10));
        r0 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a3, code lost:
        if (r0.hasNext() == false) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a5, code lost:
        r3.add(kotlin.coroutines.jvm.internal.Boxing.boxLong(((defpackage.a32) r0.next()).b.a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b7, code lost:
        r14.b = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bd, code lost:
        if (defpackage.u82.f(r1, r15, r3, r14) != r2) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bf, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c0, code lost:
        defpackage.xag.h(r14.o.x0, new defpackage.qy5(true));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0122, code lost:
        if ((!((java.util.Collection) r14.o.y0.get()).isEmpty()) == false) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0124, code lost:
        r15 = r14.o;
        r3 = r15.v;
        r5 = ((defpackage.pz5) r14.c).b;
        r15 = (java.lang.Iterable) r15.y0.get();
        r6 = new java.util.ArrayList(kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r15, 10));
        r15 = r15.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0147, code lost:
        if (r15.hasNext() == false) goto L_0x015b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0149, code lost:
        r6.add(kotlin.coroutines.jvm.internal.Boxing.boxLong(((defpackage.a32) r15.next()).b.a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x015b, code lost:
        r14.b = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0162, code lost:
        if (defpackage.u82.f(r3, r5, r6, r14) != r2) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0164, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0165, code lost:
        r15 = (defpackage.jz9) r14.o.z0.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0173, code lost:
        if (r15.c() == false) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0175, code lost:
        r3 = r14.o.v;
        r5 = ((defpackage.pz5) r14.c).b;
        r15 = java.util.Collections.unmodifiableList(defpackage.wa8.c(r15));
        r14.b = 5;
        r3 = (defpackage.ia2) r3;
        r3.getClass();
        r15 = defpackage.ev0.I(r3.x, new defpackage.e92(r3, r5, r15, (kotlin.coroutines.Continuation) null), r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x019d, code lost:
        if (r15 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L_0x01a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01a0, code lost:
        r15 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01a2, code lost:
        if (r15 != r2) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01a4, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01a5, code lost:
        r14.o.y0.updateAndGet(new defpackage.md2(5));
        r14.o.z0.updateAndGet(new defpackage.md2(6));
        r15 = r14.o;
        r1 = r15.v;
        r3 = ((defpackage.pz5) r14.c).b;
        r14.a = r15;
        r14.b = 6;
        r0 = ((defpackage.ia2) r1).d(r3, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01d1, code lost:
        if (r0 != r2) goto L_0x01d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01d3, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01d4, code lost:
        r13 = r0;
        r0 = r15;
        r15 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01d7, code lost:
        r0.A0 = (defpackage.zx5) r15;
        r15 = r14.o.A0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01df, code lost:
        if (r15 == null) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01e1, code lost:
        r1 = r15.b;
        r15 = r15.w0;
        r2 = defpackage.wa9.a;
        r15 = ((defpackage.xva) r14.o.z.getValue()).a(r1, r15, defpackage.wa9.b, false, 0, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01f6, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01f7, code lost:
        r0 = r14.o.Y;
        r14 = defpackage.pz5.b((defpackage.pz5) r14.c, r15, false, 2);
        r0.getClass();
        r0.m((java.lang.Object) null, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x020c, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            r0 = 6
            r1 = 5
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r14.b
            r4 = 2
            r5 = 1
            r12 = 0
            switch(r3) {
                case 0: goto L_0x0035;
                case 1: goto L_0x0031;
                case 2: goto L_0x002c;
                case 3: goto L_0x0027;
                case 4: goto L_0x0022;
                case 5: goto L_0x001d;
                case 6: goto L_0x0016;
                default: goto L_0x000e;
            }
        L_0x000e:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0016:
            m06 r0 = r14.a
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x01d7
        L_0x001d:
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x01a5
        L_0x0022:
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x0165
        L_0x0027:
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x0113
        L_0x002c:
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x00c0
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x0073
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r15)
            qz5 r15 = r14.c
            boolean r3 = r15 instanceof defpackage.oz5
            if (r3 == 0) goto L_0x00d1
            oz5 r15 = (defpackage.oz5) r15
            java.lang.CharSequence r15 = r15.a
            if (r15 == 0) goto L_0x004f
            java.lang.CharSequence r15 = kotlin.text.StringsKt.trim((java.lang.CharSequence) r15)
            if (r15 == 0) goto L_0x004f
            java.lang.String r15 = r15.toString()
            goto L_0x0050
        L_0x004f:
            r15 = r12
        L_0x0050:
            if (r15 == 0) goto L_0x00ce
            boolean r0 = kotlin.text.StringsKt.isBlank(r15)
            if (r0 == 0) goto L_0x0059
            goto L_0x00ce
        L_0x0059:
            m06 r0 = r14.o
            u82 r0 = r0.v
            r14.b = r5
            ia2 r0 = (defpackage.ia2) r0
            r0.getClass()
            b92 r1 = new b92
            r3 = 0
            r1.<init>(r0, r15, r12, r3)
            kotlin.coroutines.CoroutineContext r15 = r0.x
            java.lang.Object r15 = defpackage.ev0.I(r15, r1, r14)
            if (r15 != r2) goto L_0x0073
            return r2
        L_0x0073:
            java.lang.String r15 = (java.lang.String) r15
            m06 r0 = r14.o
            java.util.concurrent.atomic.AtomicReference r0 = r0.y0
            java.lang.Object r0 = r0.get()
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r5
            if (r0 == 0) goto L_0x00c0
            m06 r0 = r14.o
            u82 r1 = r0.v
            java.util.concurrent.atomic.AtomicReference r0 = r0.y0
            java.lang.Object r0 = r0.get()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r3 = new java.util.ArrayList
            int r6 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r0, 10)
            r3.<init>(r6)
            java.util.Iterator r0 = r0.iterator()
        L_0x009f:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x00b7
            java.lang.Object r6 = r0.next()
            a32 r6 = (defpackage.a32) r6
            m72 r6 = r6.b
            long r6 = r6.a
            java.lang.Long r6 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r6)
            r3.add(r6)
            goto L_0x009f
        L_0x00b7:
            r14.b = r4
            java.lang.Object r15 = defpackage.u82.f(r1, r15, r3, r14)
            if (r15 != r2) goto L_0x00c0
            return r2
        L_0x00c0:
            m06 r14 = r14.o
            s85 r14 = r14.x0
            qy5 r15 = new qy5
            r15.<init>(r5)
            defpackage.xag.h(r14, r15)
            goto L_0x020a
        L_0x00ce:
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            return r14
        L_0x00d1:
            boolean r3 = r15 instanceof defpackage.pz5
            if (r3 == 0) goto L_0x020d
            m06 r3 = r14.o
            u82 r6 = r3.v
            pz5 r15 = (defpackage.pz5) r15
            java.lang.String r8 = r15.b
            etc r15 = r3.Z
            ome r15 = r15.a
            java.lang.Object r15 = r15.getValue()
            qz5 r15 = (defpackage.qz5) r15
            java.lang.CharSequence r15 = r15.a()
            java.lang.String r9 = java.lang.String.valueOf(r15)
            r15 = 3
            r14.b = r15
            r15 = r6
            ia2 r15 = (defpackage.ia2) r15
            r15.getClass()
            ga2 r3 = new ga2
            r11 = 0
            r6 = r3
            r7 = r15
            r10 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            kotlin.coroutines.CoroutineContext r15 = r15.x
            java.lang.Object r15 = defpackage.ev0.I(r15, r3, r14)
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r15 != r3) goto L_0x010e
            goto L_0x0110
        L_0x010e:
            kotlin.Unit r15 = kotlin.Unit.INSTANCE
        L_0x0110:
            if (r15 != r2) goto L_0x0113
            return r2
        L_0x0113:
            m06 r15 = r14.o
            java.util.concurrent.atomic.AtomicReference r15 = r15.y0
            java.lang.Object r15 = r15.get()
            java.util.Collection r15 = (java.util.Collection) r15
            boolean r15 = r15.isEmpty()
            r15 = r15 ^ r5
            if (r15 == 0) goto L_0x0165
            m06 r15 = r14.o
            u82 r3 = r15.v
            qz5 r5 = r14.c
            pz5 r5 = (defpackage.pz5) r5
            java.lang.String r5 = r5.b
            java.util.concurrent.atomic.AtomicReference r15 = r15.y0
            java.lang.Object r15 = r15.get()
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r15, 10)
            r6.<init>(r7)
            java.util.Iterator r15 = r15.iterator()
        L_0x0143:
            boolean r7 = r15.hasNext()
            if (r7 == 0) goto L_0x015b
            java.lang.Object r7 = r15.next()
            a32 r7 = (defpackage.a32) r7
            m72 r7 = r7.b
            long r7 = r7.a
            java.lang.Long r7 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r7)
            r6.add(r7)
            goto L_0x0143
        L_0x015b:
            r15 = 4
            r14.b = r15
            java.lang.Object r15 = defpackage.u82.f(r3, r5, r6, r14)
            if (r15 != r2) goto L_0x0165
            return r2
        L_0x0165:
            m06 r15 = r14.o
            java.util.concurrent.atomic.AtomicReference r15 = r15.z0
            java.lang.Object r15 = r15.get()
            jz9 r15 = (defpackage.jz9) r15
            boolean r3 = r15.c()
            if (r3 == 0) goto L_0x01a5
            m06 r3 = r14.o
            u82 r3 = r3.v
            qz5 r5 = r14.c
            pz5 r5 = (defpackage.pz5) r5
            java.lang.String r5 = r5.b
            java.util.ArrayList r15 = defpackage.wa8.c(r15)
            java.util.List r15 = java.util.Collections.unmodifiableList(r15)
            r14.b = r1
            ia2 r3 = (defpackage.ia2) r3
            r3.getClass()
            e92 r6 = new e92
            r6.<init>(r3, r5, r15, r12)
            kotlin.coroutines.CoroutineContext r15 = r3.x
            java.lang.Object r15 = defpackage.ev0.I(r15, r6, r14)
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r15 != r3) goto L_0x01a0
            goto L_0x01a2
        L_0x01a0:
            kotlin.Unit r15 = kotlin.Unit.INSTANCE
        L_0x01a2:
            if (r15 != r2) goto L_0x01a5
            return r2
        L_0x01a5:
            m06 r15 = r14.o
            java.util.concurrent.atomic.AtomicReference r15 = r15.y0
            md2 r3 = new md2
            r3.<init>(r1)
            r15.updateAndGet(r3)
            m06 r15 = r14.o
            java.util.concurrent.atomic.AtomicReference r15 = r15.z0
            md2 r1 = new md2
            r1.<init>(r0)
            r15.updateAndGet(r1)
            m06 r15 = r14.o
            u82 r1 = r15.v
            qz5 r3 = r14.c
            pz5 r3 = (defpackage.pz5) r3
            java.lang.String r3 = r3.b
            r14.a = r15
            r14.b = r0
            ia2 r1 = (defpackage.ia2) r1
            java.lang.Object r0 = r1.d(r3, r14)
            if (r0 != r2) goto L_0x01d4
            return r2
        L_0x01d4:
            r13 = r0
            r0 = r15
            r15 = r13
        L_0x01d7:
            zx5 r15 = (defpackage.zx5) r15
            r0.A0 = r15
            m06 r15 = r14.o
            zx5 r15 = r15.A0
            if (r15 == 0) goto L_0x01f6
            m06 r0 = r14.o
            kotlin.Lazy r0 = r0.z
            java.lang.Object r0 = r0.getValue()
            xva r0 = (defpackage.xva) r0
            java.lang.CharSequence r1 = r15.b
            java.util.List r15 = r15.w0
            wa9 r2 = defpackage.wa9.a
            java.lang.CharSequence r15 = r0.a(r1, r15, defpackage.wa9.b, false, 0, true)
            goto L_0x01f7
        L_0x01f6:
            r15 = r12
        L_0x01f7:
            m06 r0 = r14.o
            xme r0 = r0.Y
            qz5 r14 = r14.c
            pz5 r14 = (defpackage.pz5) r14
            r1 = 0
            pz5 r14 = defpackage.pz5.b(r14, r15, r1, r4)
            r0.getClass()
            r0.m(r12, r14)
        L_0x020a:
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            return r14
        L_0x020d:
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h06.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
