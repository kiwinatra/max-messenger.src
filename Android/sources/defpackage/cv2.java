package defpackage;

/* renamed from: cv2  reason: default package */
public final class cv2 implements ds5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ds5 b;
    public final /* synthetic */ ov2 c;

    public /* synthetic */ cv2(ds5 ds5, ov2 ov2, int i) {
        this.a = i;
        this.b = ds5;
        this.c = ov2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00db A[LOOP:0: B:24:0x00d5->B:26:0x00db, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r12, kotlin.coroutines.Continuation r13) {
        /*
            r11 = this;
            int r0 = r11.a
            switch(r0) {
                case 0: goto L_0x010d;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = r13 instanceof defpackage.ev2
            if (r0 == 0) goto L_0x0018
            r0 = r13
            ev2 r0 = (defpackage.ev2) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0018
            int r1 = r1 - r2
            r0.b = r1
            goto L_0x001d
        L_0x0018:
            ev2 r0 = new ev2
            r0.<init>(r11, r13)
        L_0x001d:
            java.lang.Object r13 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x005a
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x010a
        L_0x0032:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003a:
            java.util.Collection r11 = r0.X
            java.util.Collection r11 = (java.util.Collection) r11
            java.util.Iterator r12 = r0.z
            java.util.Collection r2 = r0.y
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.List r5 = r0.x
            java.util.List r5 = (java.util.List) r5
            java.util.List r6 = r0.w
            java.util.List r6 = (java.util.List) r6
            ds5 r7 = r0.v
            cv2 r8 = r0.c
            kotlin.ResultKt.throwOnFailure(r13)
            r10 = r5
            r5 = r12
            r12 = r8
            r8 = r7
            r7 = r6
            r6 = r10
            goto L_0x00b9
        L_0x005a:
            kotlin.ResultKt.throwOnFailure(r13)
            java.util.List r12 = (java.util.List) r12
            ov2 r13 = r11.c
            ruc r2 = r13.b
            java.util.List r2 = r2.b()
            st3 r13 = r13.c
            java.util.List r13 = r13.a()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r2, 10)
            r5.<init>(r6)
            java.util.Iterator r2 = r2.iterator()
            ds5 r6 = r11.b
            r7 = r6
            r6 = r13
            r10 = r12
            r12 = r11
            r11 = r5
            r5 = r10
        L_0x0084:
            boolean r13 = r2.hasNext()
            if (r13 == 0) goto L_0x00c4
            java.lang.Object r13 = r2.next()
            ald r13 = (defpackage.ald) r13
            ov2 r8 = r12.c
            dld r8 = r8.w
            r0.c = r12
            r0.v = r7
            r9 = r6
            java.util.List r9 = (java.util.List) r9
            r0.w = r9
            r9 = r5
            java.util.List r9 = (java.util.List) r9
            r0.x = r9
            r9 = r11
            java.util.Collection r9 = (java.util.Collection) r9
            r0.y = r9
            r0.z = r2
            r0.X = r9
            r0.b = r4
            java.lang.Object r13 = r8.b(r13, r0)
            if (r13 != r1) goto L_0x00b4
            goto L_0x010c
        L_0x00b4:
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r2
            r2 = r11
        L_0x00b9:
            ykd r13 = (defpackage.ykd) r13
            r11.add(r13)
            r11 = r2
            r2 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            goto L_0x0084
        L_0x00c4:
            java.util.List r11 = (java.util.List) r11
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r13 = new java.util.ArrayList
            int r2 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r6, 10)
            r13.<init>(r2)
            java.util.Iterator r2 = r6.iterator()
        L_0x00d5:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x00ed
            java.lang.Object r4 = r2.next()
            vk3 r4 = (defpackage.vk3) r4
            ov2 r6 = r12.c
            ny2 r6 = r6.v
            zo3 r4 = r6.a(r4)
            r13.add(r4)
            goto L_0x00d5
        L_0x00ed:
            z77 r12 = new z77
            r12.<init>(r5, r11, r13)
            r11 = 0
            r0.c = r11
            r0.v = r11
            r0.w = r11
            r0.x = r11
            r0.y = r11
            r0.z = r11
            r0.X = r11
            r0.b = r3
            java.lang.Object r11 = r7.a(r12, r0)
            if (r11 != r1) goto L_0x010a
            goto L_0x010c
        L_0x010a:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x010c:
            return r1
        L_0x010d:
            boolean r12 = r13 instanceof defpackage.bv2
            if (r12 == 0) goto L_0x0120
            r12 = r13
            bv2 r12 = (defpackage.bv2) r12
            int r0 = r12.b
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L_0x0120
            int r0 = r0 - r1
            r12.b = r0
            goto L_0x0125
        L_0x0120:
            bv2 r12 = new bv2
            r12.<init>(r11, r13)
        L_0x0125:
            java.lang.Object r13 = r12.a
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r12.b
            r2 = 1
            if (r1 == 0) goto L_0x013e
            if (r1 != r2) goto L_0x0136
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x0179
        L_0x0136:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x013e:
            kotlin.ResultKt.throwOnFailure(r13)
            ov2 r13 = r11.c
            ruc r1 = r13.b
            java.util.List r1 = r1.a()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r1, 10)
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L_0x0158:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x016e
            java.lang.Object r4 = r1.next()
            vk3 r4 = (defpackage.vk3) r4
            ny2 r5 = r13.v
            cuc r4 = r5.b(r4)
            r3.add(r4)
            goto L_0x0158
        L_0x016e:
            r12.b = r2
            ds5 r11 = r11.b
            java.lang.Object r11 = r11.a(r3, r12)
            if (r11 != r0) goto L_0x0179
            goto L_0x017b
        L_0x0179:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x017b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cv2.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
