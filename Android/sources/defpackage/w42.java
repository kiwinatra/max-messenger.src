package defpackage;

/* renamed from: w42  reason: default package */
public final class w42 implements ds5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ds5 b;
    public final /* synthetic */ h52 c;

    public /* synthetic */ w42(ds5 ds5, h52 h52, int i) {
        this.a = i;
        this.b = ds5;
        this.c = h52;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r16, kotlin.coroutines.Continuation r17) {
        /*
            r15 = this;
            r0 = r15
            r1 = r17
            ds5 r2 = r0.b
            h52 r3 = r0.c
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r5 = 1
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = r0.a
            switch(r7) {
                case 0: goto L_0x00f9;
                default: goto L_0x0011;
            }
        L_0x0011:
            boolean r7 = r1 instanceof defpackage.y42
            if (r7 == 0) goto L_0x0022
            r7 = r1
            y42 r7 = (defpackage.y42) r7
            int r8 = r7.b
            r9 = r8 & r6
            if (r9 == 0) goto L_0x0022
            int r8 = r8 - r6
            r7.b = r8
            goto L_0x0027
        L_0x0022:
            y42 r7 = new y42
            r7.<init>(r15, r1)
        L_0x0027:
            java.lang.Object r0 = r7.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r6 = r7.b
            if (r6 == 0) goto L_0x003e
            if (r6 != r5) goto L_0x0038
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x00f6
        L_0x0038:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x003e:
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r16
            ki0 r0 = (defpackage.ki0) r0
            boolean r4 = r0 instanceof defpackage.ki0
            r6 = 0
            if (r4 != 0) goto L_0x004c
            goto L_0x00eb
        L_0x004c:
            long r8 = r0.a
            java.util.concurrent.atomic.AtomicLong r4 = r3.u
            long r10 = r4.get()
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            uz1 r10 = defpackage.uz1.a
            tz1 r11 = defpackage.tz1.a
            qaf r0 = r0.b
            java.lang.String r12 = "io.exception"
            java.lang.String r13 = "service.timeout"
            java.lang.String r14 = "service.unavailable"
            if (r4 != 0) goto L_0x00a8
            java.util.concurrent.atomic.AtomicBoolean r3 = r3.x
            r4 = 0
            r3.set(r4)
            java.lang.String r3 = r0.o
            if (r3 == 0) goto L_0x0082
            int r4 = r3.length()
            if (r4 != 0) goto L_0x0075
            goto L_0x0082
        L_0x0075:
            sz1 r0 = new sz1
            mgf r4 = new mgf
            r4.<init>(r3)
            r0.<init>(r4)
        L_0x007f:
            r6 = r0
            goto L_0x00eb
        L_0x0082:
            java.lang.String r0 = r0.b
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r14)
            if (r3 != 0) goto L_0x00a6
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r13)
            if (r3 == 0) goto L_0x0091
            goto L_0x00a6
        L_0x0091:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r12)
            if (r0 == 0) goto L_0x0099
        L_0x0097:
            r6 = r11
            goto L_0x00eb
        L_0x0099:
            vz1 r0 = new vz1
            int r3 = defpackage.qad.u1
            igf r4 = new igf
            r4.<init>(r3)
            r0.<init>(r4)
            goto L_0x007f
        L_0x00a6:
            r6 = r10
            goto L_0x00eb
        L_0x00a8:
            java.util.concurrent.atomic.AtomicLong r3 = r3.v
            long r3 = r3.get()
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x00eb
            java.lang.String r3 = r0.o
            if (r3 == 0) goto L_0x00c8
            int r4 = r3.length()
            if (r4 != 0) goto L_0x00bd
            goto L_0x00c8
        L_0x00bd:
            sz1 r0 = new sz1
            mgf r4 = new mgf
            r4.<init>(r3)
            r0.<init>(r4)
            goto L_0x007f
        L_0x00c8:
            java.lang.String r0 = r0.b
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r14)
            if (r3 != 0) goto L_0x00a6
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r13)
            if (r3 == 0) goto L_0x00d7
            goto L_0x00a6
        L_0x00d7:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r12)
            if (r0 == 0) goto L_0x00de
            goto L_0x0097
        L_0x00de:
            vz1 r0 = new vz1
            int r3 = defpackage.qad.u1
            igf r4 = new igf
            r4.<init>(r3)
            r0.<init>(r4)
            goto L_0x007f
        L_0x00eb:
            if (r6 == 0) goto L_0x00f6
            r7.b = r5
            java.lang.Object r0 = r2.a(r6, r7)
            if (r0 != r1) goto L_0x00f6
            goto L_0x00f8
        L_0x00f6:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x00f8:
            return r1
        L_0x00f9:
            boolean r7 = r1 instanceof defpackage.v42
            if (r7 == 0) goto L_0x010a
            r7 = r1
            v42 r7 = (defpackage.v42) r7
            int r8 = r7.b
            r9 = r8 & r6
            if (r9 == 0) goto L_0x010a
            int r8 = r8 - r6
            r7.b = r8
            goto L_0x010f
        L_0x010a:
            v42 r7 = new v42
            r7.<init>(r15, r1)
        L_0x010f:
            java.lang.Object r0 = r7.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r6 = r7.b
            if (r6 == 0) goto L_0x0125
            if (r6 != r5) goto L_0x011f
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x013e
        L_0x011f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x0125:
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r16
            a32 r0 = (defpackage.a32) r0
            kotlin.reflect.KProperty[] r4 = defpackage.h52.y
            r3.getClass()
            g02 r0 = defpackage.h52.t(r0)
            r7.b = r5
            java.lang.Object r0 = r2.a(r0, r7)
            if (r0 != r1) goto L_0x013e
            goto L_0x0140
        L_0x013e:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x0140:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w42.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
