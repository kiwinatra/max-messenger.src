package defpackage;

/* renamed from: wn6  reason: default package */
public final class wn6 implements ds5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ds5 b;
    public final /* synthetic */ gp6 c;

    public /* synthetic */ wn6(ds5 ds5, gp6 gp6, int i) {
        this.a = i;
        this.b = ds5;
        this.c = gp6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x009c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            r0 = 0
            ds5 r1 = r9.b
            gp6 r2 = r9.c
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 1
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            int r6 = r9.a
            switch(r6) {
                case 0: goto L_0x00dd;
                case 1: goto L_0x0060;
                default: goto L_0x000f;
            }
        L_0x000f:
            boolean r0 = r11 instanceof defpackage.to6
            if (r0 == 0) goto L_0x0020
            r0 = r11
            to6 r0 = (defpackage.to6) r0
            int r6 = r0.b
            r7 = r6 & r5
            if (r7 == 0) goto L_0x0020
            int r6 = r6 - r5
            r0.b = r6
            goto L_0x0025
        L_0x0020:
            to6 r0 = new to6
            r0.<init>(r9, r11)
        L_0x0025:
            java.lang.Object r9 = r0.a
            java.lang.Object r11 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r0.b
            if (r5 == 0) goto L_0x003b
            if (r5 != r4) goto L_0x0035
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x005d
        L_0x0035:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
            throw r9
        L_0x003b:
            kotlin.ResultKt.throwOnFailure(r9)
            java.util.List r10 = (java.util.List) r10
            ql6 r9 = r2.b
            boolean r9 = r9.a
            if (r9 == 0) goto L_0x0054
            rm6 r9 = defpackage.rm6.b
            java.util.List r9 = kotlin.collections.CollectionsKt.listOf(r9)
            java.util.Collection r9 = (java.util.Collection) r9
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.List r10 = kotlin.collections.CollectionsKt.plus(r9, r10)
        L_0x0054:
            r0.b = r4
            java.lang.Object r9 = r1.a(r10, r0)
            if (r9 != r11) goto L_0x005d
            goto L_0x005f
        L_0x005d:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
        L_0x005f:
            return r11
        L_0x0060:
            boolean r6 = r11 instanceof defpackage.yn6
            if (r6 == 0) goto L_0x0071
            r6 = r11
            yn6 r6 = (defpackage.yn6) r6
            int r7 = r6.b
            r8 = r7 & r5
            if (r8 == 0) goto L_0x0071
            int r7 = r7 - r5
            r6.b = r7
            goto L_0x0076
        L_0x0071:
            yn6 r6 = new yn6
            r6.<init>(r9, r11)
        L_0x0076:
            java.lang.Object r9 = r6.a
            java.lang.Object r11 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r6.b
            if (r5 == 0) goto L_0x008c
            if (r5 != r4) goto L_0x0086
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x00da
        L_0x0086:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
            throw r9
        L_0x008c:
            kotlin.ResultKt.throwOnFailure(r9)
            java.util.List r10 = (java.util.List) r10
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x009c:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x00d1
            java.lang.Object r3 = r10.next()
            wk6 r3 = (defpackage.wk6) r3
            boolean r5 = r3.d
            if (r5 == 0) goto L_0x00c1
            sk6 r5 = defpackage.sk6.a
            vk6 r7 = r3.a
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r5)
            if (r5 != 0) goto L_0x00c1
            tk6 r5 = defpackage.tk6.a
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x00bf
            goto L_0x00c1
        L_0x00bf:
            r5 = 0
            goto L_0x00c2
        L_0x00c1:
            r5 = r4
        L_0x00c2:
            ql6 r7 = r2.b
            boolean r7 = r7.y
            if (r7 == 0) goto L_0x00cb
            if (r5 == 0) goto L_0x00cb
            r3 = r0
        L_0x00cb:
            if (r3 == 0) goto L_0x009c
            r9.add(r3)
            goto L_0x009c
        L_0x00d1:
            r6.b = r4
            java.lang.Object r9 = r1.a(r9, r6)
            if (r9 != r11) goto L_0x00da
            goto L_0x00dc
        L_0x00da:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
        L_0x00dc:
            return r11
        L_0x00dd:
            boolean r6 = r11 instanceof defpackage.vn6
            if (r6 == 0) goto L_0x00ee
            r6 = r11
            vn6 r6 = (defpackage.vn6) r6
            int r7 = r6.b
            r8 = r7 & r5
            if (r8 == 0) goto L_0x00ee
            int r7 = r7 - r5
            r6.b = r7
            goto L_0x00f3
        L_0x00ee:
            vn6 r6 = new vn6
            r6.<init>(r9, r11)
        L_0x00f3:
            java.lang.Object r9 = r6.a
            java.lang.Object r11 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r6.b
            r7 = 2
            if (r5 == 0) goto L_0x0114
            if (r5 == r4) goto L_0x010c
            if (r5 != r7) goto L_0x0106
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x014a
        L_0x0106:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
            throw r9
        L_0x010c:
            wk6 r10 = r6.v
            ds5 r1 = r6.c
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0137
        L_0x0114:
            kotlin.ResultKt.throwOnFailure(r9)
            wk6 r10 = (defpackage.wk6) r10
            java.lang.String r9 = "album changed"
            java.lang.String r3 = "gp6"
            defpackage.z68.c(r3, r9, new java.lang.Object[0])
            s48 r9 = r2.v
            vk6 r3 = r10.a
            yd7 r9 = (defpackage.yd7) r9
            java.util.List r9 = r9.d(r3)
            r6.c = r1
            r6.v = r10
            r6.b = r4
            java.lang.Object r9 = defpackage.gp6.j(r2, r9, r6)
            if (r9 != r11) goto L_0x0137
            goto L_0x014c
        L_0x0137:
            java.util.List r9 = (java.util.List) r9
            kotlin.Pair r9 = kotlin.TuplesKt.to(r10, r9)
            r6.c = r0
            r6.v = r0
            r6.b = r7
            java.lang.Object r9 = r1.a(r9, r6)
            if (r9 != r11) goto L_0x014a
            goto L_0x014c
        L_0x014a:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
        L_0x014c:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wn6.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
