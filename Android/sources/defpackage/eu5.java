package defpackage;

/* renamed from: eu5  reason: default package */
public final class eu5 implements bs5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bs5 b;
    public final /* synthetic */ int c;

    public /* synthetic */ eu5(bs5 bs5, int i, int i2) {
        this.a = i2;
        this.b = bs5;
        this.c = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(defpackage.ds5 r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            int r0 = r6.a
            switch(r0) {
                case 0: goto L_0x00ef;
                case 1: goto L_0x008f;
                case 2: goto L_0x001d;
                default: goto L_0x0005;
            }
        L_0x0005:
            z53 r0 = new z53
            int r1 = r6.c
            r2 = 1
            r0.<init>(r7, r1, r2)
            bs5 r6 = r6.b
            java.lang.Object r6 = r6.e(r0, r8)
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r6 != r7) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
        L_0x001c:
            return r6
        L_0x001d:
            boolean r0 = r8 instanceof defpackage.iv5
            if (r0 == 0) goto L_0x0030
            r0 = r8
            iv5 r0 = (defpackage.iv5) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0030
            int r1 = r1 - r2
            r0.b = r1
            goto L_0x0035
        L_0x0030:
            iv5 r0 = new iv5
            r0.<init>(r6, r8)
        L_0x0035:
            java.lang.Object r8 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0059
            if (r2 == r4) goto L_0x0051
            if (r2 != r3) goto L_0x0049
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x008c
        L_0x0049:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0051:
            kotlin.jvm.internal.Ref$ObjectRef r6 = r0.v
            ds5 r7 = r0.o
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0078
        L_0x0059:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
            r8.<init>()
            kv5 r2 = new kv5
            int r5 = r6.c
            r2.<init>(r8, r5, r7)
            r0.o = r7
            r0.v = r8
            r0.b = r4
            bs5 r6 = r6.b
            java.lang.Object r6 = r6.e(r2, r0)
            if (r6 != r1) goto L_0x0077
            goto L_0x008e
        L_0x0077:
            r6 = r8
        L_0x0078:
            T r6 = r6.element
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            if (r6 == 0) goto L_0x008c
            r8 = 0
            r0.o = r8
            r0.v = r8
            r0.b = r3
            java.lang.Object r6 = r7.a(r6, r0)
            if (r6 != r1) goto L_0x008c
            goto L_0x008e
        L_0x008c:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x008e:
            return r1
        L_0x008f:
            boolean r0 = r8 instanceof defpackage.iu5
            if (r0 == 0) goto L_0x00a2
            r0 = r8
            iu5 r0 = (defpackage.iu5) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x00a2
            int r1 = r1 - r2
            r0.b = r1
            goto L_0x00a7
        L_0x00a2:
            iu5 r0 = new iu5
            r0.<init>(r6, r8)
        L_0x00a7:
            java.lang.Object r8 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L_0x00c4
            if (r2 != r3) goto L_0x00bc
            java.lang.Object r6 = r0.o
            kotlin.ResultKt.throwOnFailure(r8)     // Catch:{ AbortFlowException -> 0x00ba }
            goto L_0x00eb
        L_0x00ba:
            r7 = move-exception
            goto L_0x00e7
        L_0x00bc:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x00c4:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.Object r8 = new java.lang.Object
            r8.<init>()
            kotlin.jvm.internal.Ref$IntRef r2 = new kotlin.jvm.internal.Ref$IntRef
            r2.<init>()
            bs5 r4 = r6.b     // Catch:{ AbortFlowException -> 0x00e5 }
            ku5 r5 = new ku5     // Catch:{ AbortFlowException -> 0x00e5 }
            int r6 = r6.c     // Catch:{ AbortFlowException -> 0x00e5 }
            r5.<init>(r2, r6, r7, r8)     // Catch:{ AbortFlowException -> 0x00e5 }
            r0.o = r8     // Catch:{ AbortFlowException -> 0x00e5 }
            r0.b = r3     // Catch:{ AbortFlowException -> 0x00e5 }
            java.lang.Object r6 = r4.e(r5, r0)     // Catch:{ AbortFlowException -> 0x00e5 }
            if (r6 != r1) goto L_0x00eb
            goto L_0x00ed
        L_0x00e5:
            r7 = move-exception
            r6 = r8
        L_0x00e7:
            java.lang.Object r8 = r7.a
            if (r8 != r6) goto L_0x00ee
        L_0x00eb:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x00ed:
            return r1
        L_0x00ee:
            throw r7
        L_0x00ef:
            kotlin.jvm.internal.Ref$IntRef r0 = new kotlin.jvm.internal.Ref$IntRef
            r0.<init>()
            gu5 r1 = new gu5
            int r2 = r6.c
            r1.<init>(r0, r2, r7)
            bs5 r6 = r6.b
            java.lang.Object r6 = r6.e(r1, r8)
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r6 != r7) goto L_0x0108
            goto L_0x010a
        L_0x0108:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
        L_0x010a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eu5.e(ds5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public eu5(bs5 bs5, int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = bs5;
                this.c = 20;
                return;
            default:
                this.b = bs5;
                this.c = 1;
                return;
        }
    }
}
