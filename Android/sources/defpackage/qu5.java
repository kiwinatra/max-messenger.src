package defpackage;

/* renamed from: qu5  reason: default package */
public abstract /* synthetic */ class qu5 {
    /* JADX WARNING: type inference failed for: r0v2, types: [kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.ds5 r4, java.lang.Object r5, java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof defpackage.hu5
            if (r0 == 0) goto L_0x0013
            r0 = r7
            hu5 r0 = (defpackage.hu5) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.c = r1
            goto L_0x0018
        L_0x0013:
            hu5 r0 = new hu5
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 == r3) goto L_0x002d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x002d:
            java.lang.Object r6 = r0.a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0041
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r7)
            r0.a = r6
            r0.c = r3
            java.lang.Object r4 = r4.a(r5, r0)
            if (r4 != r1) goto L_0x0041
            return r1
        L_0x0041:
            kotlinx.coroutines.flow.internal.AbortFlowException r4 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r4.<init>(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qu5.a(ds5, java.lang.Object, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
