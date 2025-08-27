package defpackage;

import kotlin.Lazy;

/* renamed from: bk5  reason: default package */
public final class bk5 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;

    public bk5(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = lazy4;
        this.e = lazy5;
        this.f = lazy6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0173 A[LOOP:0: B:27:0x016d->B:29:0x0173, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(kotlin.coroutines.Continuation r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof defpackage.ak5
            if (r0 == 0) goto L_0x0013
            r0 = r13
            ak5 r0 = (defpackage.ak5) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            ak5 r0 = new ak5
            r0.<init>(r12, r13)
        L_0x0018:
            java.lang.Object r13 = r0.v
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            long r1 = r0.o
            kotlin.jvm.internal.Ref$ObjectRef r12 = r0.c
            kotlin.jvm.internal.Ref$ObjectRef r3 = r0.b
            bk5 r0 = r0.a
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x0089
        L_0x0031:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0039:
            kotlin.ResultKt.throwOnFailure(r13)
            kotlin.jvm.internal.Ref$ObjectRef r13 = new kotlin.jvm.internal.Ref$ObjectRef
            r13.<init>()
            kotlin.Lazy r2 = r12.f
            java.lang.Object r2 = r2.getValue()
            android.content.Context r2 = (android.content.Context) r2
            int r4 = defpackage.jad.b
            java.lang.String r2 = r2.getString(r4)
            kotlin.Lazy r4 = r12.b
            java.lang.Object r4 = r4.getValue()
            doa r4 = (defpackage.doa) r4
            boolean r4 = r4.e()
            if (r4 == 0) goto L_0x00af
            kotlin.Lazy r2 = r12.d
            java.lang.Object r2 = r2.getValue()
            x23 r2 = (defpackage.x23) r2
            qjd r2 = (defpackage.qjd) r2
            long r4 = r2.s()
            kotlin.Lazy r2 = r12.c
            java.lang.Object r2 = r2.getValue()
            eu3 r2 = (defpackage.eu3) r2
            r0.a = r12
            r0.b = r13
            r0.c = r13
            r0.o = r4
            r0.x = r3
            java.lang.Object r0 = r2.b(r4, r0)
            if (r0 != r1) goto L_0x0084
            return r1
        L_0x0084:
            r3 = r13
            r1 = r4
            r13 = r0
            r0 = r12
            r12 = r3
        L_0x0089:
            r12.element = r13
            kotlin.Lazy r12 = r0.f
            java.lang.Object r12 = r12.getValue()
            android.content.Context r12 = (android.content.Context) r12
            int r13 = defpackage.jad.c
            T r4 = r3.element
            vk3 r4 = (defpackage.vk3) r4
            if (r4 == 0) goto L_0x00a0
            java.lang.String r4 = r4.f()
            goto L_0x00a1
        L_0x00a0:
            r4 = 0
        L_0x00a1:
            java.lang.Long r1 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r1}
            java.lang.String r2 = r12.getString(r13, r1)
            r12 = r0
            r13 = r3
        L_0x00af:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "\n\n--\n"
            r0.<init>(r1)
            T r1 = r13.element
            vk3 r1 = (defpackage.vk3) r1
            if (r1 == 0) goto L_0x00e5
            kotlin.Lazy r1 = r12.f
            java.lang.Object r1 = r1.getValue()
            android.content.Context r1 = (android.content.Context) r1
            int r3 = defpackage.jad.d
            T r4 = r13.element
            vk3 r4 = (defpackage.vk3) r4
            java.lang.String r4 = r4.f()
            T r13 = r13.element
            vk3 r13 = (defpackage.vk3) r13
            long r5 = r13.r()
            java.lang.Long r13 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r5)
            java.lang.Object[] r13 = new java.lang.Object[]{r4, r13}
            java.lang.String r13 = r1.getString(r3, r13)
            r0.append(r13)
        L_0x00e5:
            kotlin.Lazy r13 = r12.a
            java.lang.Object r13 = r13.getValue()
            fn4 r13 = (defpackage.fn4) r13
            e0g r13 = r13.h()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r13.b
            r1.append(r3)
            java.lang.String r3 = "("
            r1.append(r3)
            int r3 = r13.c
            java.lang.String r4 = ")"
            java.lang.String r1 = defpackage.wj6.l(r1, r3, r4)
            kotlin.Pair r3 = new kotlin.Pair
            java.lang.String r4 = "locale"
            java.lang.String r5 = r13.f
            r3.<init>(r4, r5)
            kotlin.Pair r4 = new kotlin.Pair
            java.lang.String r5 = "appVersion"
            r4.<init>(r5, r1)
            kotlin.Pair r5 = new kotlin.Pair
            java.lang.String r1 = "screen"
            java.lang.String r6 = r13.i
            r5.<init>(r1, r6)
            kotlin.Pair r6 = new kotlin.Pair
            java.lang.String r1 = "deviceName"
            java.lang.String r7 = r13.h
            r6.<init>(r1, r7)
            kotlin.Pair r7 = new kotlin.Pair
            java.lang.String r1 = "deviceType"
            java.lang.String r8 = r13.a
            r7.<init>(r1, r8)
            kotlin.Pair r8 = new kotlin.Pair
            java.lang.String r1 = "osVersion"
            java.lang.String r9 = r13.e
            r8.<init>(r1, r9)
            kotlin.Pair r9 = new kotlin.Pair
            java.util.TimeZone r1 = r13.k
            java.lang.String r1 = r1.getID()
            java.lang.String r10 = "timezone"
            r9.<init>(r10, r1)
            kotlin.Pair r10 = new kotlin.Pair
            java.lang.String r1 = "deviceLocale"
            java.lang.String r11 = r13.g
            r10.<init>(r1, r11)
            kotlin.Pair r11 = new kotlin.Pair
            int r13 = r13.j
            java.lang.String r13 = defpackage.i2a.e(r13)
            java.lang.String r1 = "pushDeviceType"
            r11.<init>(r1, r13)
            kotlin.Pair[] r13 = new kotlin.Pair[]{r3, r4, r5, r6, r7, r8, r9, r10, r11}
            java.util.List r13 = kotlin.collections.CollectionsKt.listOf(r13)
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.Iterator r13 = r13.iterator()
        L_0x016d:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x019e
            java.lang.Object r1 = r13.next()
            kotlin.Pair r1 = (kotlin.Pair) r1
            java.lang.Object r3 = r1.getFirst()
            java.lang.Object r1 = r1.getSecond()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = ": "
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = "\n"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r0.append(r1)
            goto L_0x016d
        L_0x019e:
            java.lang.String r13 = r0.toString()
            kotlin.Lazy r12 = r12.e
            java.lang.Object r12 = r12.getValue()
            bud r12 = (defpackage.bud) r12
            akd r12 = (defpackage.akd) r12
            r12.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r0 = ru.ok.tamtam.android.prefs.PmsKey.f111supportemail
            java.lang.String r1 = "support@max.ru"
            java.lang.String r12 = r12.u(r0, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "mailto:"
            r0.<init>(r1)
            r0.append(r12)
            int r12 = r2.length()
            java.lang.String r1 = "utf-8"
            if (r12 <= 0) goto L_0x01d8
            java.lang.String r12 = "?subject="
            r0.append(r12)
            java.lang.String r12 = android.net.Uri.encode(r2, r1)
            r0.append(r12)
            java.lang.String r12 = "&"
            goto L_0x01da
        L_0x01d8:
            java.lang.String r12 = "?"
        L_0x01da:
            int r2 = r13.length()
            if (r2 <= 0) goto L_0x01ef
            r0.append(r12)
            java.lang.String r12 = "body="
            r0.append(r12)
            java.lang.String r12 = android.net.Uri.encode(r13, r1)
            r0.append(r12)
        L_0x01ef:
            java.lang.String r12 = r0.toString()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bk5.a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
