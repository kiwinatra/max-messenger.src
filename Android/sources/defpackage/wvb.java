package defpackage;

/* renamed from: wvb  reason: default package */
public abstract class wvb {
    /* JADX WARNING: type inference failed for: r0v2, types: [kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.cwb r4, kotlin.jvm.functions.Function0 r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof defpackage.vvb
            if (r0 == 0) goto L_0x0013
            r0 = r6
            vvb r0 = (defpackage.vvb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.c = r1
            goto L_0x0018
        L_0x0013:
            vvb r0 = new vvb
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            kotlin.jvm.functions.Function0 r5 = r0.a
            kotlin.ResultKt.throwOnFailure(r6)     // Catch:{ all -> 0x002b }
            goto L_0x0072
        L_0x002b:
            r4 = move-exception
            goto L_0x0078
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            om7 r2 = defpackage.om7.a
            kotlin.coroutines.CoroutineContext$Element r6 = r6.get(r2)
            if (r6 != r4) goto L_0x007c
            r0.getClass()     // Catch:{ all -> 0x002b }
            r0.a = r5     // Catch:{ all -> 0x002b }
            r0.c = r3     // Catch:{ all -> 0x002b }
            lw1 r6 = new lw1     // Catch:{ all -> 0x002b }
            kotlin.coroutines.Continuation r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)     // Catch:{ all -> 0x002b }
            r6.<init>(r3, r2)     // Catch:{ all -> 0x002b }
            r6.u()     // Catch:{ all -> 0x002b }
            hw2 r2 = new hw2     // Catch:{ all -> 0x002b }
            r3 = 7
            r2.<init>(r3, r6)     // Catch:{ all -> 0x002b }
            zvb r4 = (defpackage.zvb) r4     // Catch:{ all -> 0x002b }
            r4.r(r2)     // Catch:{ all -> 0x002b }
            java.lang.Object r4 = r6.t()     // Catch:{ all -> 0x002b }
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch:{ all -> 0x002b }
            if (r4 != r6) goto L_0x006f
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)     // Catch:{ all -> 0x002b }
        L_0x006f:
            if (r4 != r1) goto L_0x0072
            return r1
        L_0x0072:
            r5.invoke()
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L_0x0078:
            r5.invoke()
            throw r4
        L_0x007c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wvb.a(cwb, kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
