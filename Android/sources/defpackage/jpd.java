package defpackage;

/* renamed from: jpd  reason: default package */
public final class jpd implements ds5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ds5 b;
    public final /* synthetic */ opd c;

    public /* synthetic */ jpd(ds5 ds5, opd opd, int i) {
        this.a = i;
        this.b = ds5;
        this.c = opd;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00e5 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            int r0 = r9.a
            switch(r0) {
                case 0: goto L_0x00a3;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = r11 instanceof defpackage.lpd
            if (r0 == 0) goto L_0x0018
            r0 = r11
            lpd r0 = (defpackage.lpd) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0018
            int r1 = r1 - r2
            r0.b = r1
            goto L_0x001d
        L_0x0018:
            lpd r0 = new lpd
            r0.<init>(r9, r11)
        L_0x001d:
            java.lang.Object r11 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x00a0
        L_0x002f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r11)
            kotlin.Pair r10 = (kotlin.Pair) r10
            java.lang.Object r11 = r10.component1()
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r10 = r10.component2()
            wk6 r10 = (defpackage.wk6) r10
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r2 = new java.util.ArrayList
            int r4 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r11, 10)
            r2.<init>(r4)
            java.util.Iterator r11 = r11.iterator()
        L_0x0057:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L_0x0095
            java.lang.Object r4 = r11.next()
            wk6 r4 = (defpackage.wk6) r4
            al6 r5 = new al6
            opd r6 = r9.c
            s48 r6 = r6.b
            vk6 r7 = r4.a
            yd7 r6 = (defpackage.yd7) r6
            java.util.concurrent.ConcurrentHashMap r6 = r6.z0
            java.lang.Object r6 = r6.get(r7)
            k48 r6 = (defpackage.k48) r6
            r7 = 0
            if (r6 == 0) goto L_0x007b
            android.net.Uri r6 = r6.Y
            goto L_0x007c
        L_0x007b:
            r6 = r7
        L_0x007c:
            if (r10 == 0) goto L_0x0084
            vk6 r7 = r10.a
            java.lang.String r7 = r7.b()
        L_0x0084:
            vk6 r8 = r4.a
            java.lang.String r8 = r8.b()
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            r5.<init>(r4, r6, r7)
            r2.add(r5)
            goto L_0x0057
        L_0x0095:
            r0.b = r3
            ds5 r9 = r9.b
            java.lang.Object r9 = r9.a(r2, r0)
            if (r9 != r1) goto L_0x00a0
            goto L_0x00a2
        L_0x00a0:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x00a2:
            return r1
        L_0x00a3:
            boolean r0 = r11 instanceof defpackage.ipd
            if (r0 == 0) goto L_0x00b6
            r0 = r11
            ipd r0 = (defpackage.ipd) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x00b6
            int r1 = r1 - r2
            r0.b = r1
            goto L_0x00bb
        L_0x00b6:
            ipd r0 = new ipd
            r0.<init>(r9, r11)
        L_0x00bb:
            java.lang.Object r11 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L_0x00d5
            if (r2 != r3) goto L_0x00cd
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0132
        L_0x00cd:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x00d5:
            kotlin.ResultKt.throwOnFailure(r11)
            java.util.List r10 = (java.util.List) r10
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x00e5:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x0127
            java.lang.Object r2 = r10.next()
            wk6 r2 = (defpackage.wk6) r2
            boolean r4 = r2.d
            if (r4 == 0) goto L_0x010a
            sk6 r4 = defpackage.sk6.a
            vk6 r5 = r2.a
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r4)
            if (r4 != 0) goto L_0x010a
            tk6 r4 = defpackage.tk6.a
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x0108
            goto L_0x010a
        L_0x0108:
            r4 = 0
            goto L_0x010b
        L_0x010a:
            r4 = r3
        L_0x010b:
            opd r5 = r9.c
            cpd r5 = r5.c
            boolean r6 = r5.a
            r7 = 0
            if (r6 == 0) goto L_0x0118
            if (r4 == 0) goto L_0x0118
        L_0x0116:
            r2 = r7
            goto L_0x0121
        L_0x0118:
            boolean r4 = r5.b
            if (r4 != 0) goto L_0x0121
            int r4 = r2.b
            if (r4 != 0) goto L_0x0121
            goto L_0x0116
        L_0x0121:
            if (r2 == 0) goto L_0x00e5
            r11.add(r2)
            goto L_0x00e5
        L_0x0127:
            r0.b = r3
            ds5 r9 = r9.b
            java.lang.Object r9 = r9.a(r11, r0)
            if (r9 != r1) goto L_0x0132
            goto L_0x0134
        L_0x0132:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x0134:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jpd.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
