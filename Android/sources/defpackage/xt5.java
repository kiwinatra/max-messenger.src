package defpackage;

/* renamed from: xt5  reason: default package */
public abstract /* synthetic */ class xt5 {
    /* JADX WARNING: type inference failed for: r0v2, types: [kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.xif r4, kotlin.jvm.functions.Function3 r5, java.lang.Throwable r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof defpackage.tt5
            if (r0 == 0) goto L_0x0013
            r0 = r7
            tt5 r0 = (defpackage.tt5) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.c = r1
            goto L_0x0018
        L_0x0013:
            tt5 r0 = new tt5
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Throwable r6 = r0.a
            kotlin.ResultKt.throwOnFailure(r7)     // Catch:{ all -> 0x002b }
            goto L_0x0043
        L_0x002b:
            r4 = move-exception
            goto L_0x0046
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r7)
            r0.a = r6     // Catch:{ all -> 0x002b }
            r0.c = r3     // Catch:{ all -> 0x002b }
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch:{ all -> 0x002b }
            if (r4 != r1) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x0045:
            return r1
        L_0x0046:
            if (r6 == 0) goto L_0x004d
            if (r6 == r4) goto L_0x004d
            kotlin.ExceptionsKt.addSuppressed(r4, r6)
        L_0x004d:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xt5.a(xif, kotlin.jvm.functions.Function3, java.lang.Throwable, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
