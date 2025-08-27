package defpackage;

/* renamed from: zv2  reason: default package */
public final class zv2 implements ds5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ds5 b;
    public final /* synthetic */ tw2 c;

    public /* synthetic */ zv2(ds5 ds5, tw2 tw2, int i) {
        this.a = i;
        this.b = ds5;
        this.c = tw2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            r0 = 0
            ds5 r1 = r9.b
            tw2 r2 = r9.c
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 1
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            int r6 = r9.a
            switch(r6) {
                case 0: goto L_0x0199;
                case 1: goto L_0x0148;
                case 2: goto L_0x0101;
                case 3: goto L_0x008d;
                default: goto L_0x000f;
            }
        L_0x000f:
            boolean r6 = r11 instanceof defpackage.pw2
            if (r6 == 0) goto L_0x0020
            r6 = r11
            pw2 r6 = (defpackage.pw2) r6
            int r7 = r6.b
            r8 = r7 & r5
            if (r8 == 0) goto L_0x0020
            int r7 = r7 - r5
            r6.b = r7
            goto L_0x0025
        L_0x0020:
            pw2 r6 = new pw2
            r6.<init>(r9, r11)
        L_0x0025:
            java.lang.Object r9 = r6.a
            java.lang.Object r11 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r6.b
            if (r5 == 0) goto L_0x003b
            if (r5 != r4) goto L_0x0035
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x008a
        L_0x0035:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
            throw r9
        L_0x003b:
            kotlin.ResultKt.throwOnFailure(r9)
            java.util.List r10 = (java.util.List) r10
            jz9 r9 = new jz9
            r9.<init>((java.lang.Object) r0)
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L_0x004b:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0081
            java.lang.Object r0 = r10.next()
            java.lang.Number r0 = (java.lang.Number) r0
            long r7 = r0.longValue()
            qx2 r0 = defpackage.tw2.k(r2)
            my2 r0 = (defpackage.my2) r0
            etc r0 = r0.o(r7)
            ome r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            a32 r0 = (defpackage.a32) r0
            if (r0 == 0) goto L_0x004b
            vk3 r0 = r0.m()
            if (r0 == 0) goto L_0x004b
            long r7 = r0.r()
            boolean r0 = r9.e(r7)
            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            goto L_0x004b
        L_0x0081:
            r6.b = r4
            java.lang.Object r9 = r1.a(r9, r6)
            if (r9 != r11) goto L_0x008a
            goto L_0x008c
        L_0x008a:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
        L_0x008c:
            return r11
        L_0x008d:
            boolean r6 = r11 instanceof defpackage.mw2
            if (r6 == 0) goto L_0x009e
            r6 = r11
            mw2 r6 = (defpackage.mw2) r6
            int r7 = r6.b
            r8 = r7 & r5
            if (r8 == 0) goto L_0x009e
            int r7 = r7 - r5
            r6.b = r7
            goto L_0x00a3
        L_0x009e:
            mw2 r6 = new mw2
            r6.<init>(r9, r11)
        L_0x00a3:
            java.lang.Object r9 = r6.a
            java.lang.Object r11 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r6.b
            if (r5 == 0) goto L_0x00b9
            if (r5 != r4) goto L_0x00b3
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x00fe
        L_0x00b3:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
            throw r9
        L_0x00b9:
            kotlin.ResultKt.throwOnFailure(r9)
            kotlin.Pair r10 = (kotlin.Pair) r10
            java.lang.Object r9 = r10.component1()
            ss2 r9 = (defpackage.ss2) r9
            java.lang.Object r10 = r10.component2()
            java.util.List r10 = (java.util.List) r10
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L_0x00d0:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x00e8
            java.lang.Object r3 = r10.next()
            r5 = r3
            zx5 r5 = (defpackage.zx5) r5
            java.lang.String r5 = r5.a
            java.lang.String r7 = r2.c
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r7)
            if (r5 == 0) goto L_0x00d0
            goto L_0x00e9
        L_0x00e8:
            r3 = r0
        L_0x00e9:
            zx5 r3 = (defpackage.zx5) r3
            if (r3 == 0) goto L_0x00ef
            java.util.List r0 = r3.z0
        L_0x00ef:
            kotlin.Pair r9 = kotlin.TuplesKt.to(r9, r0)
            if (r9 == 0) goto L_0x00fe
            r6.b = r4
            java.lang.Object r9 = r1.a(r9, r6)
            if (r9 != r11) goto L_0x00fe
            goto L_0x0100
        L_0x00fe:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
        L_0x0100:
            return r11
        L_0x0101:
            boolean r0 = r11 instanceof defpackage.cw2
            if (r0 == 0) goto L_0x0112
            r0 = r11
            cw2 r0 = (defpackage.cw2) r0
            int r6 = r0.b
            r7 = r6 & r5
            if (r7 == 0) goto L_0x0112
            int r6 = r6 - r5
            r0.b = r6
            goto L_0x0117
        L_0x0112:
            cw2 r0 = new cw2
            r0.<init>(r9, r11)
        L_0x0117:
            java.lang.Object r9 = r0.a
            java.lang.Object r11 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r0.b
            if (r5 == 0) goto L_0x012d
            if (r5 != r4) goto L_0x0127
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0145
        L_0x0127:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
            throw r9
        L_0x012d:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.Number r10 = (java.lang.Number) r10
            r10.longValue()
            cp3 r9 = r2.b
            r9.d()
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            r0.b = r4
            java.lang.Object r9 = r1.a(r9, r0)
            if (r9 != r11) goto L_0x0145
            goto L_0x0147
        L_0x0145:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
        L_0x0147:
            return r11
        L_0x0148:
            boolean r0 = r11 instanceof defpackage.bw2
            if (r0 == 0) goto L_0x0159
            r0 = r11
            bw2 r0 = (defpackage.bw2) r0
            int r6 = r0.b
            r7 = r6 & r5
            if (r7 == 0) goto L_0x0159
            int r6 = r6 - r5
            r0.b = r6
            goto L_0x015e
        L_0x0159:
            bw2 r0 = new bw2
            r0.<init>(r9, r11)
        L_0x015e:
            java.lang.Object r9 = r0.a
            java.lang.Object r11 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r0.b
            if (r5 == 0) goto L_0x0174
            if (r5 != r4) goto L_0x016e
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0196
        L_0x016e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
            throw r9
        L_0x0174:
            kotlin.ResultKt.throwOnFailure(r9)
            r9 = r10
            java.lang.Number r9 = (java.lang.Number) r9
            r9.longValue()
            etc r9 = r2.E0
            ome r9 = r9.a
            java.lang.Object r9 = r9.getValue()
            ss2 r9 = (defpackage.ss2) r9
            boolean r9 = defpackage.tw2.j(r2, r9)
            if (r9 == 0) goto L_0x0196
            r0.b = r4
            java.lang.Object r9 = r1.a(r10, r0)
            if (r9 != r11) goto L_0x0196
            goto L_0x0198
        L_0x0196:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
        L_0x0198:
            return r11
        L_0x0199:
            boolean r0 = r11 instanceof defpackage.yv2
            if (r0 == 0) goto L_0x01aa
            r0 = r11
            yv2 r0 = (defpackage.yv2) r0
            int r6 = r0.b
            r7 = r6 & r5
            if (r7 == 0) goto L_0x01aa
            int r6 = r6 - r5
            r0.b = r6
            goto L_0x01af
        L_0x01aa:
            yv2 r0 = new yv2
            r0.<init>(r9, r11)
        L_0x01af:
            java.lang.Object r9 = r0.a
            java.lang.Object r11 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r0.b
            if (r5 == 0) goto L_0x01c5
            if (r5 != r4) goto L_0x01bf
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x01f0
        L_0x01bf:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
            throw r9
        L_0x01c5:
            kotlin.ResultKt.throwOnFailure(r9)
            r9 = r10
            ss2 r9 = (defpackage.ss2) r9
            kotlin.reflect.KProperty[] r3 = defpackage.tw2.T0
            r2.getClass()
            ss2 r3 = defpackage.ss2.c
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r3)
            if (r9 != 0) goto L_0x01da
            r9 = 0
            goto L_0x01e5
        L_0x01da:
            xme r9 = r2.D0
            java.lang.Object r9 = r9.getValue()
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r3)
            r9 = r9 ^ r4
        L_0x01e5:
            if (r9 != 0) goto L_0x01f0
            r0.b = r4
            java.lang.Object r9 = r1.a(r10, r0)
            if (r9 != r11) goto L_0x01f0
            goto L_0x01f2
        L_0x01f0:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
        L_0x01f2:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zv2.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
