package defpackage;

import kotlin.jvm.functions.Function3;

/* renamed from: vt5  reason: default package */
public final class vt5 implements bs5 {
    public final /* synthetic */ bs5 a;
    public final /* synthetic */ Function3 b;

    public vt5(bs5 bs5, Function3 function3) {
        this.a = bs5;
        this.b = function3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0086 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(defpackage.ds5 r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.ut5
            if (r0 == 0) goto L_0x0013
            r0 = r10
            ut5 r0 = (defpackage.ut5) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.b = r1
            goto L_0x0018
        L_0x0013:
            ut5 r0 = new ut5
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0055
            if (r2 == r5) goto L_0x0046
            if (r2 == r4) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.lang.Object r8 = r0.o
            pbd r8 = (defpackage.pbd) r8
            kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ all -> 0x0034 }
            goto L_0x0088
        L_0x0034:
            r9 = move-exception
            goto L_0x0090
        L_0x0036:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003e:
            java.lang.Object r8 = r0.o
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x00a8
        L_0x0046:
            ds5 r9 = r0.v
            java.lang.Object r8 = r0.o
            vt5 r8 = (defpackage.vt5) r8
            kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ all -> 0x0050 }
            goto L_0x0067
        L_0x0050:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto L_0x0094
        L_0x0055:
            kotlin.ResultKt.throwOnFailure(r10)
            bs5 r10 = r8.a     // Catch:{ all -> 0x0050 }
            r0.o = r8     // Catch:{ all -> 0x0050 }
            r0.v = r9     // Catch:{ all -> 0x0050 }
            r0.b = r5     // Catch:{ all -> 0x0050 }
            java.lang.Object r10 = r10.e(r9, r0)     // Catch:{ all -> 0x0050 }
            if (r10 != r1) goto L_0x0067
            return r1
        L_0x0067:
            pbd r10 = new pbd
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            r10.<init>(r9, r2)
            kotlin.jvm.functions.Function3 r8 = r8.b     // Catch:{ all -> 0x008e }
            r0.o = r10     // Catch:{ all -> 0x008e }
            r0.v = r6     // Catch:{ all -> 0x008e }
            r0.b = r3     // Catch:{ all -> 0x008e }
            r9 = 6
            kotlin.jvm.internal.InlineMarker.mark((int) r9)     // Catch:{ all -> 0x008e }
            java.lang.Object r8 = r8.invoke(r10, r6, r0)     // Catch:{ all -> 0x008e }
            r9 = 7
            kotlin.jvm.internal.InlineMarker.mark((int) r9)     // Catch:{ all -> 0x008e }
            if (r8 != r1) goto L_0x0087
            return r1
        L_0x0087:
            r8 = r10
        L_0x0088:
            r8.releaseIntercepted()
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L_0x008e:
            r9 = move-exception
            r8 = r10
        L_0x0090:
            r8.releaseIntercepted()
            throw r9
        L_0x0094:
            xif r10 = new xif
            r10.<init>(r8)
            kotlin.jvm.functions.Function3 r9 = r9.b
            r0.o = r8
            r0.v = r6
            r0.b = r4
            java.lang.Object r9 = defpackage.xt5.a(r10, r9, r8, r0)
            if (r9 != r1) goto L_0x00a8
            return r1
        L_0x00a8:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vt5.e(ds5, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
