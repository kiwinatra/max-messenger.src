package defpackage;

import kotlin.jvm.functions.Function2;

/* renamed from: sbd  reason: default package */
public final class sbd implements bs5, nw1 {
    public final Function2 a;

    public sbd(Function2 function2) {
        this.a = function2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(defpackage.ds5 r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.r0
            if (r0 == 0) goto L_0x0013
            r0 = r6
            r0 r0 = (defpackage.r0) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            r0 r0 = new r0
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            pbd r4 = r0.a
            kotlin.ResultKt.throwOnFailure(r6)     // Catch:{ all -> 0x002b }
            goto L_0x0058
        L_0x002b:
            r5 = move-exception
            goto L_0x0066
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r6)
            pbd r6 = new pbd
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            r6.<init>(r5, r2)
            r0.a = r6     // Catch:{ all -> 0x0064 }
            r0.o = r3     // Catch:{ all -> 0x0064 }
            kotlin.jvm.functions.Function2 r4 = r4.a     // Catch:{ all -> 0x0060 }
            java.lang.Object r4 = r4.invoke(r6, r0)     // Catch:{ all -> 0x0060 }
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch:{ all -> 0x0060 }
            if (r4 != r5) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0060 }
        L_0x0054:
            if (r4 != r1) goto L_0x0057
            return r1
        L_0x0057:
            r4 = r6
        L_0x0058:
            r4.releaseIntercepted()
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L_0x005e:
            r5 = r4
            goto L_0x0062
        L_0x0060:
            r4 = move-exception
            goto L_0x005e
        L_0x0062:
            r4 = r6
            goto L_0x0066
        L_0x0064:
            r5 = move-exception
            goto L_0x0062
        L_0x0066:
            r4.releaseIntercepted()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sbd.e(ds5, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
