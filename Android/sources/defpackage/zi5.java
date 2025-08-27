package defpackage;

import kotlin.Lazy;

/* renamed from: zi5  reason: default package */
public final class zi5 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;

    public zi5(Lazy lazy, Lazy lazy2, Lazy lazy3) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
    }

    /* JADX WARNING: type inference failed for: r11v7, types: [yt2] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0093 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00af A[LOOP:0: B:27:0x00a9->B:29:0x00af, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(kotlin.coroutines.Continuation r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.yi5
            if (r0 == 0) goto L_0x0013
            r0 = r12
            yi5 r0 = (defpackage.yi5) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            yi5 r0 = new yi5
            r0.<init>(r11, r12)
        L_0x0018:
            java.lang.Object r12 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            zi5 r11 = r0.a
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x0095
        L_0x002e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0036:
            ekd r11 = r0.b
            zi5 r2 = r0.a
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x005e
        L_0x003e:
            kotlin.ResultKt.throwOnFailure(r12)
            ekd r12 = defpackage.ekd.b
            kotlin.Lazy r2 = r11.a
            java.lang.Object r2 = r2.getValue()
            ct2 r2 = (defpackage.ct2) r2
            on2 r2 = r2.d
            r0.a = r11
            r0.b = r12
            r0.v = r4
            java.lang.Object r2 = defpackage.bs0.z(r2, r0)
            if (r2 != r1) goto L_0x005a
            return r1
        L_0x005a:
            r10 = r2
            r2 = r11
            r11 = r12
            r12 = r10
        L_0x005e:
            zx5 r12 = (defpackage.zx5) r12
            r11.getClass()
            boolean r11 = r12.b()
            if (r11 == 0) goto L_0x006c
            yt2 r11 = defpackage.yt2.a
            goto L_0x007c
        L_0x006c:
            zt2 r11 = new zt2
            java.util.Set r6 = r12.w
            java.util.Set r7 = r12.Z
            java.util.Set r5 = r12.Y
            java.util.Set r8 = r12.v0
            java.util.Map r9 = r12.y0
            r4 = r11
            r4.<init>(r5, r6, r7, r8, r9)
        L_0x007c:
            kotlin.Lazy r12 = r2.b
            java.lang.Object r12 = r12.getValue()
            fu2 r12 = (defpackage.fu2) r12
            r0.a = r2
            r4 = 0
            r0.b = r4
            r0.v = r3
            my2 r12 = (defpackage.my2) r12
            java.util.List r12 = r12.r(r11)
            if (r12 != r1) goto L_0x0094
            return r1
        L_0x0094:
            r11 = r2
        L_0x0095:
            java.util.List r12 = (java.util.List) r12
            r11.getClass()
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r12, 10)
            r0.<init>(r1)
            java.util.Iterator r12 = r12.iterator()
        L_0x00a9:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x00c5
            java.lang.Object r1 = r12.next()
            a32 r1 = (defpackage.a32) r1
            kotlin.Lazy r2 = r11.c
            java.lang.Object r2 = r2.getValue()
            cu2 r2 = (defpackage.cu2) r2
            xk2 r1 = r2.a(r1)
            r0.add(r1)
            goto L_0x00a9
        L_0x00c5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zi5.a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
