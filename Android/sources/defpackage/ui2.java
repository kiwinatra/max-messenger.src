package defpackage;

/* renamed from: ui2  reason: default package */
public final class ui2 implements ds5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ds5 b;
    public final /* synthetic */ aj2 c;

    public /* synthetic */ ui2(ds5 ds5, aj2 aj2, int i) {
        this.a = i;
        this.b = ds5;
        this.c = aj2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            int r0 = r8.a
            switch(r0) {
                case 0: goto L_0x00c4;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = r10 instanceof defpackage.xi2
            if (r0 == 0) goto L_0x0018
            r0 = r10
            xi2 r0 = (defpackage.xi2) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0018
            int r1 = r1 - r2
            r0.b = r1
            goto L_0x001d
        L_0x0018:
            xi2 r0 = new xi2
            r0.<init>(r8, r10)
        L_0x001d:
            java.lang.Object r10 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x00c1
        L_0x002f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r10)
            ds5 r10 = r8.b
            wj9 r9 = (defpackage.wj9) r9
            aj2 r2 = r8.c
            boolean r2 = r2.v
            if (r2 == 0) goto L_0x004d
            java.util.List r2 = r9.a
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r2 = kotlin.collections.CollectionsKt.reversed(r2)
            goto L_0x004f
        L_0x004d:
            java.util.List r2 = r9.a
        L_0x004f:
            aj2 r4 = r8.c
            java.util.concurrent.atomic.AtomicReference r4 = r4.H0
            yi2 r5 = new yi2
            r5.<init>(r9)
            java.lang.Object r9 = r4.updateAndGet(r5)
            zh2 r9 = (defpackage.zh2) r9
            aj2 r8 = r8.c
            java.lang.String r8 = r8.Z
            a67 r4 = defpackage.z68.b
            if (r4 != 0) goto L_0x0067
            goto L_0x0081
        L_0x0067:
            boolean r5 = r4.c()
            if (r5 == 0) goto L_0x0081
            w78 r5 = defpackage.w78.o
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Media viewer. Map result from loader, loadingState:"
            r6.<init>(r7)
            r6.append(r9)
            java.lang.String r9 = r6.toString()
            r6 = 0
            r4.d(r5, r8, r9, r6)
        L_0x0081:
            java.util.List r8 = kotlin.collections.CollectionsKt.createListBuilder()
            r9 = r2
            java.util.Collection r9 = (java.util.Collection) r9
            int r9 = r9.size()
            r4 = 0
            r5 = r4
        L_0x008e:
            if (r4 >= r9) goto L_0x00ac
            java.lang.Object r6 = r2.get(r4)
            one.me.messages.list.loader.MessageModel r6 = (one.me.messages.list.loader.MessageModel) r6
            java.util.List r6 = defpackage.le8.a(r6)
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r7 = r6.isEmpty()
            r7 = r7 ^ r3
            if (r7 == 0) goto L_0x00a7
            r8.addAll(r6)
            goto L_0x00a9
        L_0x00a7:
            int r5 = r5 + 1
        L_0x00a9:
            int r4 = r4 + 1
            goto L_0x008e
        L_0x00ac:
            java.util.List r8 = kotlin.collections.CollectionsKt.build(r8)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            kotlin.Pair r8 = kotlin.TuplesKt.to(r8, r9)
            r0.b = r3
            java.lang.Object r8 = r10.a(r8, r0)
            if (r8 != r1) goto L_0x00c1
            goto L_0x00c3
        L_0x00c1:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x00c3:
            return r1
        L_0x00c4:
            boolean r0 = r10 instanceof defpackage.ti2
            if (r0 == 0) goto L_0x00d7
            r0 = r10
            ti2 r0 = (defpackage.ti2) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x00d7
            int r1 = r1 - r2
            r0.b = r1
            goto L_0x00dc
        L_0x00d7:
            ti2 r0 = new ti2
            r0.<init>(r8, r10)
        L_0x00dc:
            java.lang.Object r10 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L_0x00f5
            if (r2 != r3) goto L_0x00ed
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x010e
        L_0x00ed:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x00f5:
            kotlin.ResultKt.throwOnFailure(r10)
            r10 = r9
            os8 r10 = (defpackage.os8) r10
            aj2 r2 = r8.c
            boolean r10 = defpackage.aj2.n(r2, r10)
            if (r10 == 0) goto L_0x010e
            r0.b = r3
            ds5 r8 = r8.b
            java.lang.Object r8 = r8.a(r9, r0)
            if (r8 != r1) goto L_0x010e
            goto L_0x0110
        L_0x010e:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x0110:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ui2.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
