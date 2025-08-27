package defpackage;

/* renamed from: fs5  reason: default package */
public final class fs5 implements bs5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fs5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(defpackage.ds5 r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            int r0 = r6.a
            switch(r0) {
                case 0: goto L_0x00d8;
                case 1: goto L_0x007e;
                case 2: goto L_0x0015;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r6 = r6.b
            java.lang.Object r6 = r7.a(r6, r8)
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r6 != r7) goto L_0x0012
            goto L_0x0014
        L_0x0012:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
        L_0x0014:
            return r6
        L_0x0015:
            boolean r0 = r8 instanceof defpackage.it5
            if (r0 == 0) goto L_0x0028
            r0 = r8
            it5 r0 = (defpackage.it5) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0028
            int r1 = r1 - r2
            r0.b = r1
            goto L_0x002d
        L_0x0028:
            it5 r0 = new it5
            r0.<init>(r6, r8)
        L_0x002d:
            java.lang.Object r8 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L_0x004f
            if (r2 != r3) goto L_0x0047
            int r6 = r0.x
            int r7 = r0.w
            ds5 r2 = r0.v
            fs5 r4 = r0.o
            kotlin.ResultKt.throwOnFailure(r8)
            r8 = r2
            goto L_0x0077
        L_0x0047:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x004f:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.Object r8 = r6.b
            java.lang.Object[] r8 = (java.lang.Object[]) r8
            int r8 = r8.length
            r2 = 0
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L_0x005c:
            if (r2 >= r6) goto L_0x007b
            java.lang.Object r4 = r7.b
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r4 = r4[r2]
            r0.o = r7
            r0.v = r8
            r0.w = r2
            r0.x = r6
            r0.b = r3
            java.lang.Object r4 = r8.a(r4, r0)
            if (r4 != r1) goto L_0x0075
            goto L_0x007d
        L_0x0075:
            r4 = r7
            r7 = r2
        L_0x0077:
            int r2 = r7 + 1
            r7 = r4
            goto L_0x005c
        L_0x007b:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x007d:
            return r1
        L_0x007e:
            boolean r0 = r8 instanceof defpackage.ht5
            if (r0 == 0) goto L_0x0091
            r0 = r8
            ht5 r0 = (defpackage.ht5) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0091
            int r1 = r1 - r2
            r0.b = r1
            goto L_0x0096
        L_0x0091:
            ht5 r0 = new ht5
            r0.<init>(r6, r8)
        L_0x0096:
            java.lang.Object r8 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L_0x00b3
            if (r2 != r3) goto L_0x00ab
            java.util.Iterator r6 = r0.v
            ds5 r7 = r0.o
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x00be
        L_0x00ab:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x00b3:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.Object r6 = r6.b
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L_0x00be:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x00d5
            java.lang.Object r8 = r6.next()
            r0.o = r7
            r0.v = r6
            r0.b = r3
            java.lang.Object r8 = r7.a(r8, r0)
            if (r8 != r1) goto L_0x00be
            goto L_0x00d7
        L_0x00d5:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x00d7:
            return r1
        L_0x00d8:
            gs5 r0 = new gs5
            java.lang.Object r6 = r6.b
            kotlin.jvm.functions.Function3 r6 = (kotlin.jvm.functions.Function3) r6
            r1 = 0
            r0.<init>(r6, r7, r1)
            es5 r6 = new es5
            kotlin.coroutines.CoroutineContext r7 = r8.getContext()
            r6.<init>(r8, r7)
            java.lang.Object r6 = defpackage.bs0.W(r6, r6, r0)
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r6 != r7) goto L_0x00f8
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r8)
        L_0x00f8:
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r6 != r7) goto L_0x00ff
            goto L_0x0101
        L_0x00ff:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
        L_0x0101:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fs5.e(ds5, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
