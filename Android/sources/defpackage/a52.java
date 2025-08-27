package defpackage;

import one.me.devmenu.DevMenuScreen;

/* renamed from: a52  reason: default package */
public final class a52 implements ds5 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ ds5 c;
    public final /* synthetic */ Object o;

    public /* synthetic */ a52(ds5 ds5, Object obj, int i) {
        this.a = i;
        this.o = obj;
        this.c = ds5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x033f  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x03bc  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x03c9  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0476  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0482  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x04fd  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0509  */
    /* JADX WARNING: Removed duplicated region for block: B:243:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:248:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r28, kotlin.coroutines.Continuation r29) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = 5
            r4 = 300(0x12c, double:1.48E-321)
            r6 = 0
            r7 = 2
            r8 = 0
            java.lang.String r9 = "Index overflow has happened"
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 1
            int r13 = r0.a
            switch(r13) {
                case 0: goto L_0x04dd;
                case 1: goto L_0x0456;
                case 2: goto L_0x039c;
                case 3: goto L_0x0313;
                case 4: goto L_0x026c;
                case 5: goto L_0x01fa;
                case 6: goto L_0x0176;
                case 7: goto L_0x00ee;
                case 8: goto L_0x0075;
                default: goto L_0x0018;
            }
        L_0x0018:
            boolean r3 = r2 instanceof defpackage.mpd
            if (r3 == 0) goto L_0x0029
            r3 = r2
            mpd r3 = (defpackage.mpd) r3
            int r4 = r3.b
            r5 = r4 & r11
            if (r5 == 0) goto L_0x0029
            int r4 = r4 - r11
            r3.b = r4
            goto L_0x002e
        L_0x0029:
            mpd r3 = new mpd
            r3.<init>(r0, r2)
        L_0x002e:
            java.lang.Object r2 = r3.a
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.b
            if (r5 == 0) goto L_0x0044
            if (r5 != r12) goto L_0x003e
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x006c
        L_0x003e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x0044:
            kotlin.ResultKt.throwOnFailure(r2)
            int r2 = r0.b
            int r5 = r2 + 1
            r0.b = r5
            if (r2 < 0) goto L_0x006f
            if (r2 != 0) goto L_0x0061
            r2 = r1
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r5 = r0.o
            opd r5 = (defpackage.opd) r5
            xme r5 = r5.w
            java.lang.Object r2 = kotlin.collections.CollectionsKt.firstOrNull(r2)
            r5.setValue(r2)
        L_0x0061:
            r3.b = r12
            ds5 r0 = r0.c
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r4) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x006e:
            return r4
        L_0x006f:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            r0.<init>(r9)
            throw r0
        L_0x0075:
            boolean r3 = r2 instanceof defpackage.n4c
            if (r3 == 0) goto L_0x0086
            r3 = r2
            n4c r3 = (defpackage.n4c) r3
            int r4 = r3.b
            r5 = r4 & r11
            if (r5 == 0) goto L_0x0086
            int r4 = r4 - r11
            r3.b = r4
            goto L_0x008b
        L_0x0086:
            n4c r3 = new n4c
            r3.<init>(r0, r2)
        L_0x008b:
            java.lang.Object r2 = r3.a
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.b
            if (r5 == 0) goto L_0x00b0
            if (r5 == r12) goto L_0x00a3
            if (r5 != r7) goto L_0x009d
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x00e5
        L_0x009d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x00a3:
            java.lang.Object r0 = r3.o
            a52 r1 = r3.c
            kotlin.ResultKt.throwOnFailure(r2)
            r26 = r1
            r1 = r0
            r0 = r26
            goto L_0x00d6
        L_0x00b0:
            kotlin.ResultKt.throwOnFailure(r2)
            int r2 = r0.b
            int r5 = r2 + 1
            r0.b = r5
            if (r2 < 0) goto L_0x00e8
            if (r2 != 0) goto L_0x00d6
            r2 = r1
            c4c r2 = (defpackage.c4c) r2
            java.lang.Object r5 = r0.o
            q4c r5 = (defpackage.q4c) r5
            xme r6 = r5.y0
            r6.setValue(r2)
            r3.c = r0
            r3.o = r1
            r3.b = r12
            java.lang.Object r2 = defpackage.q4c.j(r5, r2, r3)
            if (r2 != r4) goto L_0x00d6
            goto L_0x00e7
        L_0x00d6:
            ds5 r0 = r0.c
            r3.c = r8
            r3.o = r8
            r3.b = r7
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r4) goto L_0x00e5
            goto L_0x00e7
        L_0x00e5:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x00e7:
            return r4
        L_0x00e8:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            r0.<init>(r9)
            throw r0
        L_0x00ee:
            boolean r3 = r2 instanceof defpackage.x2c
            if (r3 == 0) goto L_0x00ff
            r3 = r2
            x2c r3 = (defpackage.x2c) r3
            int r4 = r3.b
            r5 = r4 & r11
            if (r5 == 0) goto L_0x00ff
            int r4 = r4 - r11
            r3.b = r4
            goto L_0x0104
        L_0x00ff:
            x2c r3 = new x2c
            r3.<init>(r0, r2)
        L_0x0104:
            java.lang.Object r2 = r3.a
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.b
            if (r5 == 0) goto L_0x011a
            if (r5 != r12) goto L_0x0114
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x016d
        L_0x0114:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x011a:
            kotlin.ResultKt.throwOnFailure(r2)
            int r2 = r0.b
            int r5 = r2 + 1
            r0.b = r5
            if (r2 < 0) goto L_0x0170
            if (r2 != 0) goto L_0x0162
            r2 = r1
            a32 r2 = (defpackage.a32) r2
            m72 r5 = r2.b
            boolean r5 = r5.e()
            if (r5 != 0) goto L_0x0162
            m72 r5 = r2.b
            int r5 = r5.r0
            if (r5 != r7) goto L_0x0162
            kotlin.reflect.KProperty[] r5 = defpackage.z2c.C0
            java.lang.Object r5 = r0.o
            z2c r5 = (defpackage.z2c) r5
            kotlin.Lazy r7 = r5.o
            java.lang.Object r7 = r7.getValue()
            gaf r7 = (defpackage.gaf) r7
            osa r7 = (defpackage.osa) r7
            q04 r7 = r7.b()
            f14 r9 = defpackage.f14.b
            n2c r10 = new n2c
            r10.<init>(r5, r2, r8)
            jx3 r2 = r5.a
            aje r2 = defpackage.ev0.u(r2, r7, r9, r10)
            kotlin.reflect.KProperty[] r7 = defpackage.z2c.C0
            r6 = r7[r6]
            wie r7 = r5.Z
            r7.setValue(r5, r6, r2)
        L_0x0162:
            r3.b = r12
            ds5 r0 = r0.c
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r4) goto L_0x016d
            goto L_0x016f
        L_0x016d:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x016f:
            return r4
        L_0x0170:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            r0.<init>(r9)
            throw r0
        L_0x0176:
            boolean r3 = r2 instanceof defpackage.ym9
            if (r3 == 0) goto L_0x0187
            r3 = r2
            ym9 r3 = (defpackage.ym9) r3
            int r4 = r3.b
            r5 = r4 & r11
            if (r5 == 0) goto L_0x0187
            int r4 = r4 - r11
            r3.b = r4
            goto L_0x018c
        L_0x0187:
            ym9 r3 = new ym9
            r3.<init>(r0, r2)
        L_0x018c:
            java.lang.Object r2 = r3.a
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.b
            if (r5 == 0) goto L_0x01b1
            if (r5 == r12) goto L_0x01a4
            if (r5 != r7) goto L_0x019e
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x01f1
        L_0x019e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x01a4:
            java.lang.Object r0 = r3.o
            a52 r1 = r3.c
            kotlin.ResultKt.throwOnFailure(r2)
            r26 = r1
            r1 = r0
            r0 = r26
            goto L_0x01e2
        L_0x01b1:
            kotlin.ResultKt.throwOnFailure(r2)
            int r2 = r0.b
            int r5 = r2 + 1
            r0.b = r5
            if (r2 < 0) goto L_0x01f4
            if (r2 != 0) goto L_0x01e2
            r2 = r1
            kotlin.Pair r2 = (kotlin.Pair) r2
            java.lang.Object r5 = r2.component1()
            a32 r5 = (defpackage.a32) r5
            java.lang.Object r2 = r2.component2()
            wj9 r2 = (defpackage.wj9) r2
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
            r3.c = r0
            r3.o = r1
            r3.b = r12
            java.lang.Object r6 = r0.o
            en9 r6 = (defpackage.en9) r6
            java.lang.Object r2 = defpackage.en9.j(r6, r5, r2, r3)
            if (r2 != r4) goto L_0x01e2
            goto L_0x01f3
        L_0x01e2:
            ds5 r0 = r0.c
            r3.c = r8
            r3.o = r8
            r3.b = r7
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r4) goto L_0x01f1
            goto L_0x01f3
        L_0x01f1:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x01f3:
            return r4
        L_0x01f4:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            r0.<init>(r9)
            throw r0
        L_0x01fa:
            boolean r3 = r2 instanceof defpackage.bn4
            if (r3 == 0) goto L_0x020b
            r3 = r2
            bn4 r3 = (defpackage.bn4) r3
            int r4 = r3.b
            r5 = r4 & r11
            if (r5 == 0) goto L_0x020b
            int r4 = r4 - r11
            r3.b = r4
            goto L_0x0210
        L_0x020b:
            bn4 r3 = new bn4
            r3.<init>(r0, r2)
        L_0x0210:
            java.lang.Object r2 = r3.a
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.b
            if (r5 == 0) goto L_0x0226
            if (r5 != r12) goto L_0x0220
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x0269
        L_0x0220:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x0226:
            kotlin.ResultKt.throwOnFailure(r2)
            java.util.List r1 = (java.util.List) r1
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            int r5 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r1, 10)
            r2.<init>(r5)
            java.util.Iterator r1 = r1.iterator()
        L_0x023a:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x025e
            java.lang.Object r5 = r1.next()
            o94 r5 = (defpackage.o94) r5
            java.lang.Object r7 = r0.o
            one.me.devmenu.DevMenuScreen r7 = (one.me.devmenu.DevMenuScreen) r7
            iz9 r8 = r7.y
            long r9 = r5.a
            r8.e(r9, r5)
            int r8 = r0.b
            int r8 = r8 + r12
            r9 = 14
            s1e r5 = one.me.devmenu.DevMenuScreen.f0(r7, r5, r8, r6, r9)
            r2.add(r5)
            goto L_0x023a
        L_0x025e:
            r3.b = r12
            ds5 r0 = r0.c
            java.lang.Object r0 = r0.a(r2, r3)
            if (r0 != r4) goto L_0x0269
            goto L_0x026b
        L_0x0269:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x026b:
            return r4
        L_0x026c:
            boolean r3 = r2 instanceof defpackage.in3
            if (r3 == 0) goto L_0x027d
            r3 = r2
            in3 r3 = (defpackage.in3) r3
            int r4 = r3.b
            r5 = r4 & r11
            if (r5 == 0) goto L_0x027d
            int r4 = r4 - r11
            r3.b = r4
            goto L_0x0282
        L_0x027d:
            in3 r3 = new in3
            r3.<init>(r0, r2)
        L_0x0282:
            java.lang.Object r2 = r3.a
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.b
            if (r5 == 0) goto L_0x0299
            if (r5 != r12) goto L_0x0293
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x030a
        L_0x0293:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x0299:
            kotlin.ResultKt.throwOnFailure(r2)
            int r2 = r0.b
            int r5 = r2 + 1
            r0.b = r5
            if (r2 < 0) goto L_0x030d
            if (r2 != 0) goto L_0x02ff
            r2 = r1
            vk3 r2 = (defpackage.vk3) r2
            java.lang.Object r5 = r0.o
            pn3 r5 = (defpackage.pn3) r5
            java.util.concurrent.atomic.AtomicBoolean r9 = r5.C
            long r10 = r2.r()
            kotlin.Lazy r13 = r5.r
            java.lang.Object r13 = r13.getValue()
            x23 r13 = (defpackage.x23) r13
            qjd r13 = (defpackage.qjd) r13
            long r13 = r13.s()
            int r10 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r10 != 0) goto L_0x02c6
            r6 = r12
        L_0x02c6:
            r9.set(r6)
            oz4 r2 = defpackage.pn3.o(r5, r2)
        L_0x02cd:
            xme r6 = r5.j
            java.lang.Object r9 = r6.getValue()
            r10 = r9
            oz4 r10 = (defpackage.oz4) r10
            boolean r6 = r6.b(r9, r2)
            if (r6 == 0) goto L_0x02cd
        L_0x02dc:
            xme r6 = r5.k
            java.lang.Object r9 = r6.getValue()
            r10 = r9
            oz4 r10 = (defpackage.oz4) r10
            boolean r6 = r6.b(r9, r2)
            if (r6 == 0) goto L_0x02dc
            gaf r2 = r5.q()
            osa r2 = (defpackage.osa) r2
            q04 r2 = r2.b()
            on3 r6 = new on3
            r6.<init>(r5, r8)
            d14 r5 = r5.a
            defpackage.ev0.v(r5, r2, r8, r6, r7)
        L_0x02ff:
            r3.b = r12
            ds5 r0 = r0.c
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r4) goto L_0x030a
            goto L_0x030c
        L_0x030a:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x030c:
            return r4
        L_0x030d:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            r0.<init>(r9)
            throw r0
        L_0x0313:
            boolean r6 = r2 instanceof defpackage.vl3
            if (r6 == 0) goto L_0x0324
            r6 = r2
            vl3 r6 = (defpackage.vl3) r6
            int r7 = r6.b
            r13 = r7 & r11
            if (r13 == 0) goto L_0x0324
            int r7 = r7 - r11
            r6.b = r7
            goto L_0x0329
        L_0x0324:
            vl3 r6 = new vl3
            r6.<init>(r0, r2)
        L_0x0329:
            java.lang.Object r2 = r6.a
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r11 = r6.b
            if (r11 == 0) goto L_0x033f
            if (r11 != r12) goto L_0x0339
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x0393
        L_0x0339:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x033f:
            kotlin.ResultKt.throwOnFailure(r2)
            int r2 = r0.b
            int r10 = r2 + 1
            r0.b = r10
            if (r2 < 0) goto L_0x0396
            if (r2 != 0) goto L_0x0388
            r2 = r1
            vk3 r2 = (defpackage.vk3) r2
            java.lang.Object r9 = r0.o
            cm3 r9 = (defpackage.cm3) r9
            h02 r2 = defpackage.cm3.m(r9, r2)
            xme r10 = r9.h
            r10.getClass()
            r10.m(r8, r2)
            xme r10 = r9.i
            r10.getClass()
            r10.m(r8, r2)
            kotlin.time.Duration$Companion r2 = kotlin.time.Duration.Companion
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.MILLISECONDS
            long r4 = kotlin.time.DurationKt.toDuration((long) r4, (kotlin.time.DurationUnit) r2)
            long r4 = defpackage.xk4.e(r4)
            dtc r2 = r9.q
            bs5 r2 = defpackage.bs0.v(r2, r4)
            am3 r4 = new am3
            r4.<init>(r9, r8)
            ps5 r5 = new ps5
            r5.<init>(r2, r4, r3)
            d14 r2 = r9.b
            defpackage.bs0.K(r5, r2)
        L_0x0388:
            r6.b = r12
            ds5 r0 = r0.c
            java.lang.Object r0 = r0.a(r1, r6)
            if (r0 != r7) goto L_0x0393
            goto L_0x0395
        L_0x0393:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
        L_0x0395:
            return r7
        L_0x0396:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            r0.<init>(r9)
            throw r0
        L_0x039c:
            boolean r3 = r2 instanceof defpackage.fp2
            if (r3 == 0) goto L_0x03ad
            r3 = r2
            fp2 r3 = (defpackage.fp2) r3
            int r4 = r3.b
            r5 = r4 & r11
            if (r5 == 0) goto L_0x03ad
            int r4 = r4 - r11
            r3.b = r4
            goto L_0x03b2
        L_0x03ad:
            fp2 r3 = new fp2
            r3.<init>(r0, r2)
        L_0x03b2:
            java.lang.Object r2 = r3.a
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.b
            if (r5 == 0) goto L_0x03c9
            if (r5 != r12) goto L_0x03c3
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x044d
        L_0x03c3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x03c9:
            kotlin.ResultKt.throwOnFailure(r2)
            int r2 = r0.b
            int r5 = r2 + 1
            r0.b = r5
            if (r2 < 0) goto L_0x0450
            if (r2 != 0) goto L_0x0442
            r2 = r1
            a32 r2 = (defpackage.a32) r2
            kotlin.reflect.KProperty[] r5 = defpackage.lp2.X0
            java.lang.Object r5 = r0.o
            lp2 r5 = (defpackage.lp2) r5
            r5.getClass()
            boolean r6 = r2.J()
            if (r6 == 0) goto L_0x0442
            kotlin.Lazy r5 = r5.X
            java.lang.Object r5 = r5.getValue()
            rl r5 = (defpackage.rl) r5
            vk3 r2 = r2.m()
            if (r2 == 0) goto L_0x03fe
            long r6 = r2.r()
            java.lang.Long r8 = java.lang.Long.valueOf(r6)
        L_0x03fe:
            if (r8 == 0) goto L_0x0436
            long r17 = r8.longValue()
            jna r5 = (defpackage.jna) r5
            pq0 r20 = new pq0
            jtb r2 = r5.D()
            ltb r2 = (defpackage.ltb) r2
            a33 r2 = r2.a
            long r15 = r2.n()
            r14 = 0
            r13 = r20
            r13.<init>(r14, r15, r17)
            ocf r2 = r5.E()
            r2.getClass()
            mcf r5 = new mcf
            r23 = 0
            r25 = 0
            r21 = 0
            r22 = 0
            r19 = r5
            r19.<init>(r20, r21, r22, r23, r25)
            pbf r2 = r2.a
            defpackage.ocf.a(r2, r5)
            goto L_0x0442
        L_0x0436:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0442:
            r3.b = r12
            ds5 r0 = r0.c
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r4) goto L_0x044d
            goto L_0x044f
        L_0x044d:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x044f:
            return r4
        L_0x0450:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            r0.<init>(r9)
            throw r0
        L_0x0456:
            boolean r3 = r2 instanceof defpackage.i82
            if (r3 == 0) goto L_0x0467
            r3 = r2
            i82 r3 = (defpackage.i82) r3
            int r4 = r3.b
            r5 = r4 & r11
            if (r5 == 0) goto L_0x0467
            int r4 = r4 - r11
            r3.b = r4
            goto L_0x046c
        L_0x0467:
            i82 r3 = new i82
            r3.<init>(r0, r2)
        L_0x046c:
            java.lang.Object r2 = r3.a
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.b
            if (r5 == 0) goto L_0x0482
            if (r5 != r12) goto L_0x047c
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x04d4
        L_0x047c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x0482:
            kotlin.ResultKt.throwOnFailure(r2)
            int r2 = r0.b
            int r5 = r2 + 1
            r0.b = r5
            if (r2 < 0) goto L_0x04d7
            if (r2 != 0) goto L_0x04c9
            r2 = r1
            a32 r2 = (defpackage.a32) r2
            java.lang.Object r5 = r0.o
            m82 r5 = (defpackage.m82) r5
            java.util.concurrent.atomic.AtomicBoolean r5 = r5.p
            boolean r6 = r2.c0()
            r5.set(r6)
            java.lang.Object r5 = r0.o
            m82 r5 = (defpackage.m82) r5
            boolean r6 = r2.a()
            r5.q = r6
            java.lang.Object r5 = r0.o
            m82 r5 = (defpackage.m82) r5
            nz4 r2 = defpackage.m82.o(r5, r2)
            java.lang.Object r5 = r0.o
            m82 r5 = (defpackage.m82) r5
            xme r5 = r5.j
            r5.getClass()
            r5.m(r8, r2)
            java.lang.Object r5 = r0.o
            m82 r5 = (defpackage.m82) r5
            xme r5 = r5.k
            r5.getClass()
            r5.m(r8, r2)
        L_0x04c9:
            ds5 r0 = r0.c
            r3.b = r12
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r4) goto L_0x04d4
            goto L_0x04d6
        L_0x04d4:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x04d6:
            return r4
        L_0x04d7:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            r0.<init>(r9)
            throw r0
        L_0x04dd:
            boolean r6 = r2 instanceof defpackage.z42
            if (r6 == 0) goto L_0x04ee
            r6 = r2
            z42 r6 = (defpackage.z42) r6
            int r7 = r6.b
            r13 = r7 & r11
            if (r13 == 0) goto L_0x04ee
            int r7 = r7 - r11
            r6.b = r7
            goto L_0x04f3
        L_0x04ee:
            z42 r6 = new z42
            r6.<init>(r0, r2)
        L_0x04f3:
            java.lang.Object r2 = r6.a
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r11 = r6.b
            if (r11 == 0) goto L_0x0509
            if (r11 != r12) goto L_0x0503
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x0562
        L_0x0503:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x0509:
            kotlin.ResultKt.throwOnFailure(r2)
            int r2 = r0.b
            int r10 = r2 + 1
            r0.b = r10
            if (r2 < 0) goto L_0x0565
            if (r2 != 0) goto L_0x0557
            r2 = r1
            a32 r2 = (defpackage.a32) r2
            kotlin.reflect.KProperty[] r9 = defpackage.h52.y
            java.lang.Object r9 = r0.o
            h52 r9 = (defpackage.h52) r9
            r9.getClass()
            g02 r2 = defpackage.h52.t(r2)
            xme r10 = r9.h
            r10.getClass()
            r10.m(r8, r2)
            xme r10 = r9.i
            r10.getClass()
            r10.m(r8, r2)
            kotlin.time.Duration$Companion r2 = kotlin.time.Duration.Companion
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.MILLISECONDS
            long r4 = kotlin.time.DurationKt.toDuration((long) r4, (kotlin.time.DurationUnit) r2)
            long r4 = defpackage.xk4.e(r4)
            dtc r2 = r9.s
            bs5 r2 = defpackage.bs0.v(r2, r4)
            f52 r4 = new f52
            r4.<init>(r9, r8)
            ps5 r5 = new ps5
            r5.<init>(r2, r4, r3)
            d14 r2 = r9.b
            defpackage.bs0.K(r5, r2)
        L_0x0557:
            r6.b = r12
            ds5 r0 = r0.c
            java.lang.Object r0 = r0.a(r1, r6)
            if (r0 != r7) goto L_0x0562
            goto L_0x0564
        L_0x0562:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
        L_0x0564:
            return r7
        L_0x0565:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a52.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public a52(ds5 ds5, DevMenuScreen devMenuScreen, int i) {
        this.a = 5;
        this.c = ds5;
        this.o = devMenuScreen;
        this.b = i;
    }
}
