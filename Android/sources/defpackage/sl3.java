package defpackage;

/* renamed from: sl3  reason: default package */
public final class sl3 implements ds5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ds5 b;
    public final /* synthetic */ cm3 c;

    public /* synthetic */ sl3(ds5 ds5, cm3 cm3, int i) {
        this.a = i;
        this.b = ds5;
        this.c = cm3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            int r0 = r8.a
            switch(r0) {
                case 0: goto L_0x00a7;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = r10 instanceof defpackage.ul3
            if (r0 == 0) goto L_0x0018
            r0 = r10
            ul3 r0 = (defpackage.ul3) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0018
            int r1 = r1 - r2
            r0.b = r1
            goto L_0x001d
        L_0x0018:
            ul3 r0 = new ul3
            r0.<init>(r8, r10)
        L_0x001d:
            java.lang.Object r10 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x00a4
        L_0x002f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r10)
            ki0 r9 = (defpackage.ki0) r9
            boolean r10 = r9 instanceof defpackage.ki0
            r2 = 0
            if (r10 != 0) goto L_0x0042
            goto L_0x0097
        L_0x0042:
            long r4 = r9.a
            cm3 r10 = r8.c
            java.util.concurrent.atomic.AtomicLong r10 = r10.r
            long r6 = r10.get()
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x0097
            qaf r9 = r9.b
            java.lang.String r10 = r9.o
            if (r10 == 0) goto L_0x0069
            int r2 = r10.length()
            if (r2 != 0) goto L_0x005d
            goto L_0x0069
        L_0x005d:
            sz1 r9 = new sz1
            mgf r2 = new mgf
            r2.<init>(r10)
            r9.<init>(r2)
        L_0x0067:
            r2 = r9
            goto L_0x0097
        L_0x0069:
            java.lang.String r9 = r9.b
            java.lang.String r10 = "service.unavailable"
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r10 != 0) goto L_0x0094
            java.lang.String r10 = "service.timeout"
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x007c
            goto L_0x0094
        L_0x007c:
            java.lang.String r10 = "io.exception"
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r9 == 0) goto L_0x0087
            tz1 r9 = defpackage.tz1.a
            goto L_0x0067
        L_0x0087:
            vz1 r9 = new vz1
            int r10 = defpackage.qad.u1
            igf r2 = new igf
            r2.<init>(r10)
            r9.<init>(r2)
            goto L_0x0067
        L_0x0094:
            uz1 r9 = defpackage.uz1.a
            goto L_0x0067
        L_0x0097:
            if (r2 == 0) goto L_0x00a4
            r0.b = r3
            ds5 r8 = r8.b
            java.lang.Object r8 = r8.a(r2, r0)
            if (r8 != r1) goto L_0x00a4
            goto L_0x00a6
        L_0x00a4:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x00a6:
            return r1
        L_0x00a7:
            boolean r0 = r10 instanceof defpackage.rl3
            if (r0 == 0) goto L_0x00ba
            r0 = r10
            rl3 r0 = (defpackage.rl3) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x00ba
            int r1 = r1 - r2
            r0.b = r1
            goto L_0x00bf
        L_0x00ba:
            rl3 r0 = new rl3
            r0.<init>(r8, r10)
        L_0x00bf:
            java.lang.Object r10 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L_0x00d8
            if (r2 != r3) goto L_0x00d0
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0106
        L_0x00d0:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x00d8:
            kotlin.ResultKt.throwOnFailure(r10)
            vk3 r9 = (defpackage.vk3) r9
            cm3 r10 = r8.c
            defpackage.cm3.m(r10, r9)
            qz1 r9 = new qz1
            e02 r2 = new e02
            int r4 = defpackage.ixa.c2
            r5 = 0
            r2.<init>(r4, r5, r5, r5)
            kotlin.Lazy r4 = r10.g
            java.lang.Object r4 = r4.getValue()
            xz1 r4 = (defpackage.xz1) r4
            java.util.List r10 = r4.a(r10)
            r9.<init>(r2, r10)
            r0.b = r3
            ds5 r8 = r8.b
            java.lang.Object r8 = r8.a(r9, r0)
            if (r8 != r1) goto L_0x0106
            goto L_0x0108
        L_0x0106:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x0108:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sl3.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
