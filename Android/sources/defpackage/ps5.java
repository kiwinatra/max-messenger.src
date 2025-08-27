package defpackage;

import kotlin.jvm.functions.Function2;

/* renamed from: ps5  reason: default package */
public final class ps5 implements bs5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bs5 b;
    public final /* synthetic */ Function2 c;

    public /* synthetic */ ps5(bs5 bs5, Function2 function2, int i) {
        this.a = i;
        this.b = bs5;
        this.c = function2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(defpackage.ds5 r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            int r0 = r5.a
            switch(r0) {
                case 0: goto L_0x0128;
                case 1: goto L_0x0110;
                case 2: goto L_0x008b;
                case 3: goto L_0x0035;
                case 4: goto L_0x001d;
                default: goto L_0x0005;
            }
        L_0x0005:
            os5 r0 = new os5
            kotlin.jvm.functions.Function2 r1 = r5.c
            r2 = 4
            r0.<init>(r6, r1, r2)
            bs5 r5 = r5.b
            java.lang.Object r5 = r5.e(r0, r7)
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r5 != r6) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
        L_0x001c:
            return r5
        L_0x001d:
            os5 r0 = new os5
            kotlin.jvm.functions.Function2 r1 = r5.c
            r2 = 3
            r0.<init>(r6, r1, r2)
            bs5 r5 = r5.b
            java.lang.Object r5 = r5.e(r0, r7)
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r5 != r6) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
        L_0x0034:
            return r5
        L_0x0035:
            boolean r0 = r7 instanceof defpackage.lu5
            if (r0 == 0) goto L_0x0048
            r0 = r7
            lu5 r0 = (defpackage.lu5) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0048
            int r1 = r1 - r2
            r0.b = r1
            goto L_0x004d
        L_0x0048:
            lu5 r0 = new lu5
            r0.<init>(r5, r7)
        L_0x004d:
            java.lang.Object r7 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L_0x006a
            if (r2 != r3) goto L_0x0062
            os5 r5 = r0.o
            kotlin.ResultKt.throwOnFailure(r7)     // Catch:{ AbortFlowException -> 0x0060 }
            goto L_0x0087
        L_0x0060:
            r6 = move-exception
            goto L_0x0083
        L_0x0062:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x006a:
            kotlin.ResultKt.throwOnFailure(r7)
            bs5 r7 = r5.b
            os5 r2 = new os5
            kotlin.jvm.functions.Function2 r5 = r5.c
            r2.<init>(r5, r6)
            r0.o = r2     // Catch:{ AbortFlowException -> 0x0081 }
            r0.b = r3     // Catch:{ AbortFlowException -> 0x0081 }
            java.lang.Object r5 = r7.e(r2, r0)     // Catch:{ AbortFlowException -> 0x0081 }
            if (r5 != r1) goto L_0x0087
            goto L_0x0089
        L_0x0081:
            r6 = move-exception
            r5 = r2
        L_0x0083:
            java.lang.Object r7 = r6.a
            if (r7 != r5) goto L_0x008a
        L_0x0087:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x0089:
            return r1
        L_0x008a:
            throw r6
        L_0x008b:
            boolean r0 = r7 instanceof defpackage.wt5
            if (r0 == 0) goto L_0x009e
            r0 = r7
            wt5 r0 = (defpackage.wt5) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x009e
            int r1 = r1 - r2
            r0.b = r1
            goto L_0x00a3
        L_0x009e:
            wt5 r0 = new wt5
            r0.<init>(r5, r7)
        L_0x00a3:
            java.lang.Object r7 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x00cb
            if (r2 == r4) goto L_0x00bf
            if (r2 != r3) goto L_0x00b7
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0107
        L_0x00b7:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x00bf:
            pbd r5 = r0.w
            ds5 r6 = r0.v
            ps5 r2 = r0.o
            kotlin.ResultKt.throwOnFailure(r7)     // Catch:{ all -> 0x00c9 }
            goto L_0x00f2
        L_0x00c9:
            r6 = move-exception
            goto L_0x010c
        L_0x00cb:
            kotlin.ResultKt.throwOnFailure(r7)
            pbd r7 = new pbd
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            r7.<init>(r6, r2)
            kotlin.jvm.functions.Function2 r2 = r5.c     // Catch:{ all -> 0x010a }
            r0.o = r5     // Catch:{ all -> 0x010a }
            r0.v = r6     // Catch:{ all -> 0x010a }
            r0.w = r7     // Catch:{ all -> 0x010a }
            r0.b = r4     // Catch:{ all -> 0x010a }
            r4 = 6
            kotlin.jvm.internal.InlineMarker.mark((int) r4)     // Catch:{ all -> 0x010a }
            java.lang.Object r2 = r2.invoke(r7, r0)     // Catch:{ all -> 0x010a }
            r4 = 7
            kotlin.jvm.internal.InlineMarker.mark((int) r4)     // Catch:{ all -> 0x010a }
            if (r2 != r1) goto L_0x00f0
            goto L_0x0109
        L_0x00f0:
            r2 = r5
            r5 = r7
        L_0x00f2:
            r5.releaseIntercepted()
            bs5 r5 = r2.b
            r7 = 0
            r0.o = r7
            r0.v = r7
            r0.w = r7
            r0.b = r3
            java.lang.Object r5 = r5.e(r6, r0)
            if (r5 != r1) goto L_0x0107
            goto L_0x0109
        L_0x0107:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x0109:
            return r1
        L_0x010a:
            r6 = move-exception
            r5 = r7
        L_0x010c:
            r5.releaseIntercepted()
            throw r6
        L_0x0110:
            os5 r0 = new os5
            kotlin.jvm.functions.Function2 r1 = r5.c
            r2 = 1
            r0.<init>(r6, r1, r2)
            bs5 r5 = r5.b
            java.lang.Object r5 = r5.e(r0, r7)
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r5 != r6) goto L_0x0125
            goto L_0x0127
        L_0x0125:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
        L_0x0127:
            return r5
        L_0x0128:
            os5 r0 = new os5
            kotlin.jvm.functions.Function2 r1 = r5.c
            r2 = 0
            r0.<init>(r6, r1, r2)
            bs5 r5 = r5.b
            java.lang.Object r5 = r5.e(r0, r7)
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r5 != r6) goto L_0x013d
            goto L_0x013f
        L_0x013d:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
        L_0x013f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ps5.e(ds5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public ps5(bs5 bs5, Function2 function2) {
        this.a = 2;
        this.c = function2;
        this.b = bs5;
    }
}
