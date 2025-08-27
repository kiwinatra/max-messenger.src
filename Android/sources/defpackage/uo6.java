package defpackage;

import ru.ok.messages.gallery.GalleryViewModel;

/* renamed from: uo6  reason: default package */
public final class uo6 implements ds5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ds5 b;
    public final /* synthetic */ GalleryViewModel c;

    public /* synthetic */ uo6(ds5 ds5, GalleryViewModel galleryViewModel, int i) {
        this.a = i;
        this.b = ds5;
        this.c = galleryViewModel;
    }

    /* JADX WARNING: type inference failed for: r8v3, types: [pm6] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x018b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            int r0 = r9.a
            switch(r0) {
                case 0: goto L_0x015a;
                case 1: goto L_0x00bf;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = r11 instanceof defpackage.yo6
            if (r0 == 0) goto L_0x0018
            r0 = r11
            yo6 r0 = (defpackage.yo6) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0018
            int r1 = r1 - r2
            r0.b = r1
            goto L_0x001d
        L_0x0018:
            yo6 r0 = new yo6
            r0.<init>(r9, r11)
        L_0x001d:
            java.lang.Object r11 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x00bc
        L_0x002f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r11)
            java.util.List r10 = (java.util.List) r10
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x0047:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x00b1
            java.lang.Object r2 = r10.next()
            wk6 r2 = (defpackage.wk6) r2
            boolean r4 = r2.d
            vk6 r5 = r2.a
            if (r4 == 0) goto L_0x006c
            sk6 r4 = defpackage.sk6.a
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r4)
            if (r4 != 0) goto L_0x006c
            tk6 r4 = defpackage.tk6.a
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x006a
            goto L_0x006c
        L_0x006a:
            r4 = 0
            goto L_0x006d
        L_0x006c:
            r4 = r3
        L_0x006d:
            ru.ok.messages.gallery.GalleryViewModel r6 = r9.c
            pl6 r7 = r6.m
            boolean r7 = r7.Y
            r8 = 0
            if (r7 == 0) goto L_0x0079
            if (r4 == 0) goto L_0x0079
            goto L_0x00ab
        L_0x0079:
            s48 r4 = r6.f
            yd7 r4 = (defpackage.yd7) r4
            java.util.concurrent.ConcurrentHashMap r4 = r4.z0
            java.lang.Object r4 = r4.get(r5)
            k48 r4 = (defpackage.k48) r4
            etc r7 = r6.z
            ome r7 = r7.a
            java.lang.Object r7 = r7.getValue()
            pm6 r7 = (defpackage.pm6) r7
            if (r7 == 0) goto L_0x0098
            wk6 r7 = r7.a
            if (r7 == 0) goto L_0x0098
            vk6 r7 = r7.a
            goto L_0x0099
        L_0x0098:
            r7 = r8
        L_0x0099:
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r7)
            if (r4 == 0) goto L_0x00a2
            android.net.Uri r7 = r4.Y
            goto L_0x00a3
        L_0x00a2:
            r7 = r8
        L_0x00a3:
            if (r4 == 0) goto L_0x00a7
            java.lang.Integer r8 = r4.w
        L_0x00a7:
            pm6 r8 = ru.ok.messages.gallery.GalleryViewModel.j(r6, r2, r5, r7, r8)
        L_0x00ab:
            if (r8 == 0) goto L_0x0047
            r11.add(r8)
            goto L_0x0047
        L_0x00b1:
            r0.b = r3
            ds5 r9 = r9.b
            java.lang.Object r9 = r9.a(r11, r0)
            if (r9 != r1) goto L_0x00bc
            goto L_0x00be
        L_0x00bc:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x00be:
            return r1
        L_0x00bf:
            boolean r0 = r11 instanceof defpackage.xo6
            if (r0 == 0) goto L_0x00d2
            r0 = r11
            xo6 r0 = (defpackage.xo6) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x00d2
            int r1 = r1 - r2
            r0.b = r1
            goto L_0x00d7
        L_0x00d2:
            xo6 r0 = new xo6
            r0.<init>(r9, r11)
        L_0x00d7:
            java.lang.Object r11 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x00fd
            if (r2 == r4) goto L_0x00f5
            if (r2 != r3) goto L_0x00ed
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0157
        L_0x00ed:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x00f5:
            pm6 r9 = r0.v
            ds5 r10 = r0.c
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0144
        L_0x00fd:
            kotlin.ResultKt.throwOnFailure(r11)
            wk6 r10 = (defpackage.wk6) r10
            java.lang.String r11 = ru.ok.messages.gallery.GalleryViewModel.T
            java.lang.String r2 = "album changed"
            defpackage.z68.c(r11, r2, new java.lang.Object[0])
            ru.ok.messages.gallery.GalleryViewModel r11 = r9.c
            s48 r2 = r11.f
            vk6 r6 = r10.a
            yd7 r2 = (defpackage.yd7) r2
            java.util.concurrent.ConcurrentHashMap r2 = r2.z0
            java.lang.Object r2 = r2.get(r6)
            k48 r2 = (defpackage.k48) r2
            if (r2 == 0) goto L_0x011e
            android.net.Uri r6 = r2.Y
            goto L_0x011f
        L_0x011e:
            r6 = r5
        L_0x011f:
            if (r2 == 0) goto L_0x0124
            java.lang.Integer r2 = r2.w
            goto L_0x0125
        L_0x0124:
            r2 = r5
        L_0x0125:
            pm6 r2 = ru.ok.messages.gallery.GalleryViewModel.j(r11, r10, r4, r6, r2)
            s48 r6 = r11.f
            yd7 r6 = (defpackage.yd7) r6
            vk6 r10 = r10.a
            java.util.List r10 = r6.d(r10)
            ds5 r9 = r9.b
            r0.c = r9
            r0.v = r2
            r0.b = r4
            java.lang.Object r11 = ru.ok.messages.gallery.GalleryViewModel.k(r11, r10, r0)
            if (r11 != r1) goto L_0x0142
            goto L_0x0159
        L_0x0142:
            r10 = r9
            r9 = r2
        L_0x0144:
            java.util.List r11 = (java.util.List) r11
            kotlin.Pair r9 = kotlin.TuplesKt.to(r9, r11)
            r0.c = r5
            r0.v = r5
            r0.b = r3
            java.lang.Object r9 = r10.a(r9, r0)
            if (r9 != r1) goto L_0x0157
            goto L_0x0159
        L_0x0157:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x0159:
            return r1
        L_0x015a:
            boolean r0 = r11 instanceof defpackage.so6
            if (r0 == 0) goto L_0x016d
            r0 = r11
            so6 r0 = (defpackage.so6) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x016d
            int r1 = r1 - r2
            r0.b = r1
            goto L_0x0172
        L_0x016d:
            so6 r0 = new so6
            r0.<init>(r9, r11)
        L_0x0172:
            java.lang.Object r11 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L_0x018b
            if (r2 != r3) goto L_0x0183
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x01d2
        L_0x0183:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x018b:
            kotlin.ResultKt.throwOnFailure(r11)
            o85 r10 = (defpackage.o85) r10
            java.lang.Object r10 = r10.a
            java.util.List r10 = (java.util.List) r10
            ru.ok.messages.gallery.GalleryViewModel r11 = r9.c
            cdb r2 = r11.r
            xme r2 = r2.c
            java.lang.Object r2 = r2.getValue()
            ycb r2 = (defpackage.ycb) r2
            ycb r4 = defpackage.ycb.a
            if (r2 != r4) goto L_0x01c2
            pl6 r11 = r11.m
            boolean r11 = r11.b
            if (r11 == 0) goto L_0x01c2
            java.lang.Object r11 = kotlin.collections.CollectionsKt.firstOrNull(r10)
            qm6 r2 = defpackage.qm6.b
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r2)
            if (r11 != 0) goto L_0x01c2
            java.util.List r11 = kotlin.collections.CollectionsKt.listOf(r2)
            java.util.Collection r11 = (java.util.Collection) r11
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.List r10 = kotlin.collections.CollectionsKt.plus(r11, r10)
        L_0x01c2:
            o85 r11 = new o85
            r11.<init>(r10)
            r0.b = r3
            ds5 r9 = r9.b
            java.lang.Object r9 = r9.a(r11, r0)
            if (r9 != r1) goto L_0x01d2
            goto L_0x01d4
        L_0x01d2:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x01d4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uo6.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
