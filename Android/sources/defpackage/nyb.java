package defpackage;

/* renamed from: nyb  reason: default package */
public final class nyb implements ds5 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ ds5 c;
    public final /* synthetic */ syb o;

    public /* synthetic */ nyb(ds5 ds5, syb syb, int i) {
        this.a = i;
        this.o = syb;
        this.c = ds5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            int r0 = r10.a
            switch(r0) {
                case 0: goto L_0x0063;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = r12 instanceof defpackage.pyb
            if (r0 == 0) goto L_0x0018
            r0 = r12
            pyb r0 = (defpackage.pyb) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0018
            int r1 = r1 - r2
            r0.b = r1
            goto L_0x001d
        L_0x0018:
            pyb r0 = new pyb
            r0.<init>(r10, r12)
        L_0x001d:
            java.lang.Object r12 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x0058
        L_0x002e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0036:
            kotlin.ResultKt.throwOnFailure(r12)
            int r12 = r10.b
            int r2 = r12 + 1
            r10.b = r2
            if (r12 < 0) goto L_0x005b
            if (r12 != 0) goto L_0x004d
            r12 = r11
            cyb r12 = (defpackage.cyb) r12
            syb r2 = r10.o
            xme r2 = r2.v0
            r2.setValue(r12)
        L_0x004d:
            r0.b = r3
            ds5 r10 = r10.c
            java.lang.Object r10 = r10.a(r11, r0)
            if (r10 != r1) goto L_0x0058
            goto L_0x005a
        L_0x0058:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x005a:
            return r1
        L_0x005b:
            java.lang.ArithmeticException r10 = new java.lang.ArithmeticException
            java.lang.String r11 = "Index overflow has happened"
            r10.<init>(r11)
            throw r10
        L_0x0063:
            boolean r0 = r12 instanceof defpackage.myb
            if (r0 == 0) goto L_0x0076
            r0 = r12
            myb r0 = (defpackage.myb) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0076
            int r1 = r1 - r2
            r0.b = r1
            goto L_0x007b
        L_0x0076:
            myb r0 = new myb
            r0.<init>(r10, r12)
        L_0x007b:
            java.lang.Object r12 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 1
            r4 = 3
            r5 = 2
            r6 = 0
            if (r2 == 0) goto L_0x00b9
            if (r2 == r3) goto L_0x00a9
            if (r2 == r5) goto L_0x009c
            if (r2 != r4) goto L_0x0094
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x012a
        L_0x0094:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x009c:
            java.lang.Object r10 = r0.w
            tz9 r10 = (defpackage.tz9) r10
            java.lang.Object r11 = r0.o
            nyb r2 = r0.c
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x0115
        L_0x00a9:
            xme r10 = r0.y
            vk3 r11 = r0.x
            java.lang.Object r2 = r0.w
            a32 r2 = (defpackage.a32) r2
            java.lang.Object r3 = r0.o
            nyb r7 = r0.c
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x00f4
        L_0x00b9:
            kotlin.ResultKt.throwOnFailure(r12)
            int r12 = r10.b
            int r2 = r12 + 1
            r10.b = r2
            if (r12 < 0) goto L_0x012d
            if (r12 != 0) goto L_0x0119
            r12 = r11
            kotlin.Pair r12 = (kotlin.Pair) r12
            java.lang.Object r2 = r12.component1()
            a32 r2 = (defpackage.a32) r2
            java.lang.Object r12 = r12.component2()
            vk3 r12 = (defpackage.vk3) r12
            syb r7 = r10.o
            xme r8 = r7.v0
            r0.c = r10
            r0.o = r11
            r0.w = r2
            r0.x = r12
            r0.y = r8
            r0.b = r3
            boolean r3 = r7.w0
            java.lang.Object r3 = defpackage.syb.j(r7, r2, r12, r3, r0)
            if (r3 != r1) goto L_0x00ee
            goto L_0x012c
        L_0x00ee:
            r7 = r10
            r10 = r8
            r9 = r3
            r3 = r11
            r11 = r12
            r12 = r9
        L_0x00f4:
            r10.setValue(r12)
            syb r10 = r7.o
            xme r12 = r10.Z
            r0.c = r7
            r0.o = r3
            r0.w = r12
            r0.x = r6
            r0.y = r6
            r0.b = r5
            boolean r5 = r10.w0
            java.lang.Object r10 = defpackage.syb.j(r10, r2, r11, r5, r0)
            if (r10 != r1) goto L_0x0110
            goto L_0x012c
        L_0x0110:
            r11 = r3
            r2 = r7
            r9 = r12
            r12 = r10
            r10 = r9
        L_0x0115:
            r10.setValue(r12)
            r10 = r2
        L_0x0119:
            ds5 r10 = r10.c
            r0.c = r6
            r0.o = r6
            r0.w = r6
            r0.b = r4
            java.lang.Object r10 = r10.a(r11, r0)
            if (r10 != r1) goto L_0x012a
            goto L_0x012c
        L_0x012a:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x012c:
            return r1
        L_0x012d:
            java.lang.ArithmeticException r10 = new java.lang.ArithmeticException
            java.lang.String r11 = "Index overflow has happened"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nyb.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
