package defpackage;

import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;

/* renamed from: gvc  reason: default package */
public final class gvc {
    public static final List h = CollectionsKt.listOf(cvc.STICKER, cvc.GIF);
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final ifg g = new ifg();

    public gvc(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = lazy4;
        this.e = lazy5;
        this.f = lazy6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(kotlin.coroutines.Continuation r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.evc
            if (r0 == 0) goto L_0x0013
            r0 = r10
            evc r0 = (defpackage.evc) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            evc r0 = new evc
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.util.ArrayList r9 = r0.b
            gvc r0 = r0.a
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x00af
        L_0x0031:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0039:
            gvc r9 = r0.a
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x005b
        L_0x003f:
            kotlin.ResultKt.throwOnFailure(r10)
            wuc r10 = r9.b()
            cvc r2 = defpackage.cvc.STICKER
            java.util.List r2 = kotlin.collections.CollectionsKt.listOf(r2)
            jha r10 = r10.a(r2)
            r0.a = r9
            r0.v = r4
            java.lang.Object r10 = defpackage.bs0.g(r10, r0)
            if (r10 != r1) goto L_0x005b
            return r1
        L_0x005b:
            java.util.List r10 = (java.util.List) r10
            r2 = r10
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0069:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x008c
            java.lang.Object r6 = r2.next()
            ouc r6 = (defpackage.ouc) r6
            boolean r7 = r6 instanceof defpackage.vpe
            r8 = 0
            if (r7 == 0) goto L_0x007d
            vpe r6 = (defpackage.vpe) r6
            goto L_0x007e
        L_0x007d:
            r6 = r8
        L_0x007e:
            if (r6 == 0) goto L_0x0086
            long r6 = r6.c
            java.lang.Long r8 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r6)
        L_0x0086:
            if (r8 == 0) goto L_0x0069
            r5.add(r8)
            goto L_0x0069
        L_0x008c:
            boolean r2 = r5.isEmpty()
            if (r2 == 0) goto L_0x0098
            r9 = 0
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r9)
            return r9
        L_0x0098:
            wuc r2 = r9.b()
            na3 r10 = r2.c(r10)
            r0.a = r9
            r0.b = r5
            r0.v = r3
            java.lang.Object r10 = defpackage.bs0.e(r10, r0)
            if (r10 != r1) goto L_0x00ad
            return r1
        L_0x00ad:
            r0 = r9
            r9 = r5
        L_0x00af:
            kotlin.Lazy r10 = r0.d
            java.lang.Object r10 = r10.getValue()
            rl r10 = (defpackage.rl) r10
            long[] r9 = defpackage.cjf.i(r9)
            jna r10 = (defpackage.jna) r10
            r0 = 6
            r10.g(r9, r0)
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gvc.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final wuc b() {
        return (wuc) this.a.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(java.util.List r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.fvc
            if (r0 == 0) goto L_0x0013
            r0 = r9
            fvc r0 = (defpackage.fvc) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            fvc r0 = new fvc
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.util.List r7 = r0.b
            r8 = r7
            java.util.List r8 = (java.util.List) r8
            gvc r7 = r0.a
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x007c
        L_0x0030:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r9)
            r9 = r8
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r2 = new java.util.ArrayList
            int r4 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r9, 10)
            r2.<init>(r4)
            java.util.Iterator r9 = r9.iterator()
        L_0x004b:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L_0x0064
            java.lang.Object r4 = r9.next()
            java.lang.Number r4 = (java.lang.Number) r4
            long r4 = r4.longValue()
            vpe r6 = new vpe
            r6.<init>(r4, r4)
            r2.add(r6)
            goto L_0x004b
        L_0x0064:
            wuc r9 = r7.b()
            na3 r9 = r9.c(r2)
            r0.a = r7
            r2 = r8
            java.util.List r2 = (java.util.List) r2
            r0.b = r2
            r0.v = r3
            java.lang.Object r9 = defpackage.bs0.e(r9, r0)
            if (r9 != r1) goto L_0x007c
            return r1
        L_0x007c:
            kotlin.Lazy r7 = r7.d
            java.lang.Object r7 = r7.getValue()
            rl r7 = (defpackage.rl) r7
            long[] r8 = defpackage.cjf.i(r8)
            jna r7 = (defpackage.jna) r7
            r9 = 6
            r7.g(r8, r9)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gvc.c(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
