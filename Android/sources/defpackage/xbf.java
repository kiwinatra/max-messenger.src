package defpackage;

import kotlin.collections.CollectionsKt;
import kotlin.reflect.KProperty;

/* renamed from: xbf  reason: default package */
public final /* synthetic */ class xbf implements x6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xbf(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        yba yba = (yba) ((vtd) ((ybf) this.b).k.getValue()).g.get();
        yba.getClass();
        xba xba = (xba) this.c;
        z68.c(yba.d, "onNotifMsgDeleteRange: %s", xba);
        KProperty[] kPropertyArr = yba.c;
        KProperty kProperty = kPropertyArr[0];
        hs7 hs7 = yba.a;
        ((r62) hs7.get()).n0(CollectionsKt.listOf(xba.c));
        KProperty kProperty2 = kPropertyArr[0];
        a32 D = ((r62) hs7.get()).D(xba.c.a);
        if (D != null) {
            KProperty kProperty3 = kPropertyArr[1];
            ((fa9) yba.b.get()).c(D.a, xba.o, xba.v);
            KProperty kProperty4 = kPropertyArr[0];
            ((r62) hs7.get()).A(D.a);
        }
    }

    private final void b() {
        tcf tcf = (tcf) this.b;
        x23 x23 = (x23) this.c;
        synchronized (tcf.w0) {
            tcf.i(x23);
            tcf.w0.notifyAll();
        }
    }

    private final void c() {
        jxf jxf = (jxf) this.b;
        jxf.getClass();
        StringBuilder sb = new StringBuilder("onDisposeUpload: data=");
        kxf kxf = (kxf) this.c;
        sb.append(kxf);
        z68.a("jxf", sb.toString());
        jxf.c(kxf);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:331:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r28 = this;
            r0 = r28
            r4 = 5
            r5 = 3
            r6 = 2
            r7 = 0
            r8 = 4
            r9 = 1
            r10 = 0
            int r11 = r0.a
            switch(r11) {
                case 0: goto L_0x0be6;
                case 1: goto L_0x0ade;
                case 2: goto L_0x0a0d;
                case 3: goto L_0x09b8;
                case 4: goto L_0x08bb;
                case 5: goto L_0x06e7;
                case 6: goto L_0x06b9;
                case 7: goto L_0x022c;
                case 8: goto L_0x0218;
                case 9: goto L_0x0134;
                case 10: goto L_0x00d5;
                case 11: goto L_0x0063;
                case 12: goto L_0x0034;
                case 13: goto L_0x0030;
                case 14: goto L_0x002c;
                case 15: goto L_0x0028;
                default: goto L_0x000e;
            }
        L_0x000e:
            java.lang.Object r1 = r0.b
            t4g r1 = (defpackage.t4g) r1
            r1.getClass()
            java.lang.Object r0 = r0.c
            k4g r0 = (defpackage.k4g) r0
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r3 = "t4g"
            java.lang.String r4 = "onDispose: conversionData = %s"
            defpackage.z68.c(r3, r4, r2)
            r1.a(r0)
            return
        L_0x0028:
            r28.c()
            return
        L_0x002c:
            r28.b()
            return
        L_0x0030:
            r28.a()
            return
        L_0x0034:
            java.lang.Object r1 = r0.b
            ybf r1 = (defpackage.ybf) r1
            kotlin.Lazy r1 = r1.q
            java.lang.Object r1 = r1.getValue()
            dp1 r1 = (defpackage.dp1) r1
            mp1 r1 = (defpackage.mp1) r1
            kotlin.Lazy r2 = r1.s
            java.lang.Object r2 = r2.getValue()
            gaf r2 = (defpackage.gaf) r2
            osa r2 = (defpackage.osa) r2
            gc8 r2 = r2.c()
            gc8 r2 = r2.t0()
            lp1 r3 = new lp1
            java.lang.Object r0 = r0.c
            sf1 r0 = (defpackage.sf1) r0
            r3.<init>(r0, r1, r7)
            cp1 r0 = r1.a
            defpackage.ev0.v(r0, r2, r7, r3, r6)
            return
        L_0x0063:
            java.lang.Object r1 = r0.b
            ybf r1 = (defpackage.ybf) r1
            kotlin.Lazy r1 = r1.k
            java.lang.Object r1 = r1.getValue()
            vtd r1 = (defpackage.vtd) r1
            hs7 r1 = r1.a
            java.lang.Object r1 = r1.get()
            bba r1 = (defpackage.bba) r1
            r1.getClass()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "onNotifDebug, response = "
            r2.<init>(r3)
            java.lang.Object r0 = r0.c
            g94 r0 = (defpackage.g94) r0
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = defpackage.bba.e
            defpackage.z68.c(r3, r2, new java.lang.Object[0])
            jq5 r0 = r0.c
            jq5 r2 = defpackage.jq5.f
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x00aa
            ru.ok.tamtam.util.HandledException r0 = new ru.ok.tamtam.util.HandledException
            java.lang.String r2 = "onNotifDebug"
            r0.<init>(r2)
            m95 r1 = r1.a
            uta r1 = (defpackage.uta) r1
            r1.c(r0, r9)
            goto L_0x00d4
        L_0x00aa:
            jq5 r2 = defpackage.jq5.g
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r0 == 0) goto L_0x00d4
            kotlin.reflect.KProperty[] r0 = defpackage.bba.d
            r2 = r0[r10]
            hs7 r2 = r1.b
            java.lang.Object r2 = r2.get()
            s74 r2 = (defpackage.s74) r2
            a74 r2 = (defpackage.a74) r2
            c7d r2 = r2.e
            r2.a()
            r0 = r0[r9]
            hs7 r0 = r1.c
            java.lang.Object r0 = r0.get()
            deb r0 = (defpackage.deb) r0
            meb r0 = (defpackage.meb) r0
            r0.c()
        L_0x00d4:
            return
        L_0x00d5:
            java.lang.Object r1 = r0.b
            ybf r1 = (defpackage.ybf) r1
            kotlin.Lazy r1 = r1.k
            java.lang.Object r1 = r1.getValue()
            vtd r1 = (defpackage.vtd) r1
            hs7 r1 = r1.l
            java.lang.Object r1 = r1.get()
            eba r1 = (defpackage.eba) r1
            jtb r2 = r1.a()
            ltb r2 = (defpackage.ltb) r2
            a33 r2 = r2.a
            java.lang.Object r0 = r0.c
            cba r0 = (defpackage.cba) r0
            long r3 = r0.v
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "user.draftsLastSync"
            r2.k(r4, r3)
            jtb r2 = r1.a()
            ltb r2 = (defpackage.ltb) r2
            cud r2 = r2.b
            boolean r2 = r2.w()
            if (r2 != 0) goto L_0x0116
            java.lang.String r0 = defpackage.eba.e
            java.lang.String r1 = "onNotifDraft: Drafts sync disabled"
            defpackage.z68.c(r0, r1, new java.lang.Object[0])
            goto L_0x0133
        L_0x0116:
            kotlin.reflect.KProperty[] r2 = defpackage.eba.d
            r2 = r2[r6]
            hs7 r1 = r1.c
            java.lang.Object r1 = r1.get()
            ur4 r1 = (defpackage.ur4) r1
            long r2 = r0.c
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r3 = r0.o
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            qtd r0 = r0.w
            r1.a(r2, r3, r0)
        L_0x0133:
            return
        L_0x0134:
            java.lang.Object r1 = r0.b
            ybf r1 = (defpackage.ybf) r1
            kotlin.Lazy r1 = r1.k
            java.lang.Object r1 = r1.getValue()
            vtd r1 = (defpackage.vtd) r1
            hs7 r1 = r1.m
            java.lang.Object r1 = r1.get()
            aca r1 = (defpackage.aca) r1
            kotlin.Lazy r2 = r1.b
            java.lang.Object r2 = r2.getValue()
            bud r2 = (defpackage.bud) r2
            r2.getClass()
            gqc r2 = defpackage.gqc.a
            gqc r2 = defpackage.gqc.a
            java.lang.Object r0 = r0.c
            zba r0 = (defpackage.zba) r0
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r3 = "aca"
            java.lang.String r4 = "reactions, onNotifReactionsChanged, %s"
            defpackage.z68.c(r3, r4, r2)
            kotlin.Lazy r2 = r1.a
            java.lang.Object r2 = r2.getValue()
            ae9 r2 = (defpackage.ae9) r2
            long r3 = r0.c
            java.util.List r5 = r0.w
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            int r8 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r5, 10)
            r6.<init>(r8)
            java.util.Iterator r5 = r5.iterator()
        L_0x0181:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x01a6
            java.lang.Object r8 = r5.next()
            pd9 r8 = (defpackage.pd9) r8
            wd9 r10 = new wd9
            kotlin.Lazy r11 = r1.c
            java.lang.Object r11 = r11.getValue()
            yd9 r11 = (defpackage.yd9) r11
            nd9 r12 = r8.a
            qqc r11 = r11.d(r12)
            int r8 = r8.b
            r10.<init>(r11, r8)
            r6.add(r10)
            goto L_0x0181
        L_0x01a6:
            kotlin.Lazy r1 = r2.b
            java.lang.Object r1 = r1.getValue()
            qx2 r1 = (defpackage.qx2) r1
            my2 r1 = (defpackage.my2) r1
            etc r1 = r1.p(r3)
            ome r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            a32 r1 = (defpackage.a32) r1
            if (r1 != 0) goto L_0x01bf
            goto L_0x0217
        L_0x01bf:
            fa9 r3 = r2.b()
            long r4 = r1.a
            long r10 = r0.o
            ha9 r1 = r3.k(r4, r10)
            if (r1 != 0) goto L_0x01ce
            goto L_0x0217
        L_0x01ce:
            qe9 r3 = defpackage.qe9.DELETED
            qe9 r8 = r1.Y
            if (r8 != r3) goto L_0x01d5
            goto L_0x0217
        L_0x01d5:
            xd9 r3 = r1.Q0
            if (r3 == 0) goto L_0x01db
            qqc r7 = r3.c
        L_0x01db:
            xd9 r8 = new xd9
            int r0 = r0.v
            r8.<init>(r6, r0, r7)
            java.util.Set r0 = defpackage.ae9.a(r3, r8)
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r3)
            r3 = r3 ^ r9
            java.lang.Object[] r6 = new java.lang.Object[]{r0}
            java.lang.String r7 = "ae9"
            java.lang.String r12 = "reactions, NOTIF_REACTIONS_CHANGED, reactionsDiff = %s"
            defpackage.z68.c(r7, r12, r6)
            fa9 r6 = r2.b()
            java.lang.Long r7 = java.lang.Long.valueOf(r10)
            kotlin.Pair r7 = kotlin.TuplesKt.to(r7, r8)
            java.util.Map r7 = kotlin.collections.MapsKt.mapOf(r7)
            r6.i(r7)
            java.lang.Long r6 = java.lang.Long.valueOf(r4)
            r2.d(r6, r1, r0, r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r4)
            r2.g(r3, r1, r0, r9)
        L_0x0217:
            return
        L_0x0218:
            java.lang.Object r1 = r0.b
            ybf r1 = (defpackage.ybf) r1
            kotlin.Lazy r1 = r1.o
            java.lang.Object r1 = r1.getValue()
            rtb r1 = (defpackage.rtb) r1
            java.lang.Object r0 = r0.c
            cca r0 = (defpackage.cca) r0
            r1.k(r0)
            return
        L_0x022c:
            java.lang.Object r11 = r0.b
            ybf r11 = (defpackage.ybf) r11
            kotlin.Lazy r11 = r11.k
            java.lang.Object r11 = r11.getValue()
            vtd r11 = (defpackage.vtd) r11
            hs7 r11 = r11.k
            java.lang.Object r11 = r11.get()
            paa r11 = (defpackage.paa) r11
            r11.getClass()
            java.lang.Object r0 = r0.c
            qaa r0 = (defpackage.qaa) r0
            int r12 = r0.v
            java.lang.String r13 = "onNotifUpdated: id=%d"
            java.lang.String r14 = "onListUpdated: ids=%s"
            java.lang.String r15 = "onNotifAssetsUpdate: unknown asset type"
            java.lang.String r1 = "paa"
            if (r12 != r4) goto L_0x03df
            java.lang.String r2 = "Handle FAVORITE_STICKER_SET update"
            defpackage.z68.c(r1, r2, new java.lang.Object[0])
            r11.a(r0)
            hs7 r1 = r11.a
            java.lang.Object r1 = r1.get()
            ai5 r1 = (defpackage.ai5) r1
            long r2 = r0.c
            java.util.ArrayList r11 = r0.o
            wt r12 = r0.w
            int r0 = r0.x
            r1.getClass()
            java.lang.Long r10 = java.lang.Long.valueOf(r2)
            java.lang.String r7 = r12.a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r4 = new java.lang.Object[]{r10, r7, r4}
            java.lang.String r7 = "ai5"
            java.lang.String r10 = "onNotifAssetsUpdate: id=%d, updateType=%s, position=%d"
            defpackage.z68.c(r7, r10, r4)
            int r4 = r12.ordinal()
            kotlin.Lazy r10 = r1.o
            kc3 r12 = r1.z
            if (r4 == r9) goto L_0x03ad
            if (r4 == r6) goto L_0x036c
            if (r4 == r5) goto L_0x0332
            if (r4 == r8) goto L_0x02d7
            r0 = 5
            if (r4 == r0) goto L_0x029c
            r0 = 0
            defpackage.z68.f(r7, r15, r0)
            goto L_0x06b8
        L_0x029c:
            java.lang.Object[] r0 = new java.lang.Object[]{r11}
            defpackage.z68.c(r7, r14, r0)
            mka r0 = r1.b()
            x52 r2 = new x52
            r3 = 13
            r2.<init>(r3, r11)
            na3 r3 = new na3
            r3.<init>(r8, r0, r2)
            kotlin.Lazy r0 = r1.c
            java.lang.Object r0 = r0.getValue()
            lfd r0 = (defpackage.lfd) r0
            xa3 r0 = r3.l(r0)
            uh5 r2 = new uh5
            r3 = 0
            r2.<init>(r3, r11)
            th5 r4 = new th5
            r4.<init>(r1, r11, r9)
            ao1 r1 = new ao1
            r1.<init>(r3, r4, r2)
            r0.j(r1)
            r12.a(r1)
            goto L_0x06b8
        L_0x02d7:
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            defpackage.z68.c(r7, r13, r0)
            kotlin.Lazy r0 = r1.b
            java.lang.Object r0 = r0.getValue()
            vqe r0 = (defpackage.vqe) r0
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            java.util.List r4 = java.util.Collections.singletonList(r4)
            fce r0 = r0.d(r4)
            qa3 r4 = new qa3
            r4.<init>(r5, r0)
            mka r0 = r1.b()
            lw4 r6 = new lw4
            r7 = 19
            r6.<init>(r7)
            wbe r7 = new wbe
            r8 = 0
            r7.<init>(r0, r6, r8)
            hb3 r0 = new hb3
            r0.<init>(r7, r4)
            java.lang.Object r4 = r10.getValue()
            lfd r4 = (defpackage.lfd) r4
            fce r0 = r0.n(r4)
            sh5 r4 = new sh5
            r4.<init>(r1, r9)
            vh5 r6 = new vh5
            r6.<init>(r1, r2, r8)
            ao1 r1 = new ao1
            r1.<init>(r5, r4, r6)
            r0.l(r1)
            r12.a(r1)
            goto L_0x06b8
        L_0x0332:
            mka r4 = r1.b()
            ph5 r5 = new ph5
            r5.<init>(r0, r9, r2)
            na3 r6 = new na3
            r6.<init>(r8, r4, r5)
            java.lang.Object r4 = r10.getValue()
            lfd r4 = (defpackage.lfd) r4
            xa3 r4 = r6.l(r4)
            zh5 r5 = new zh5
            r6 = 0
            r5.<init>(r0, r6, r2)
            rb4 r7 = new rb4
            r21 = 1
            r16 = r7
            r17 = r1
            r18 = r2
            r20 = r0
            r16.<init>((java.lang.Object) r17, (long) r18, (int) r20, (int) r21)
            ao1 r0 = new ao1
            r0.<init>(r6, r7, r5)
            r4.j(r0)
            r12.a(r0)
            goto L_0x06b8
        L_0x036c:
            boolean r0 = defpackage.cjf.B(r11)
            if (r0 != 0) goto L_0x0373
            goto L_0x037b
        L_0x0373:
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            java.util.List r11 = java.util.Collections.singletonList(r0)
        L_0x037b:
            mka r0 = r1.b()
            x52 r2 = new x52
            r3 = 15
            r2.<init>(r3, r11)
            na3 r3 = new na3
            r3.<init>(r8, r0, r2)
            java.lang.Object r0 = r10.getValue()
            lfd r0 = (defpackage.lfd) r0
            xa3 r0 = r3.l(r0)
            uh5 r2 = new uh5
            r2.<init>(r9, r11)
            th5 r3 = new th5
            r4 = 0
            r3.<init>(r1, r11, r4)
            ao1 r1 = new ao1
            r1.<init>(r4, r3, r2)
            r0.j(r1)
            r12.a(r1)
            goto L_0x06b8
        L_0x03ad:
            mka r0 = r1.b()
            c10 r4 = new c10
            r5 = 18
            r4.<init>(r2, r5)
            na3 r5 = new na3
            r5.<init>(r8, r0, r4)
            java.lang.Object r0 = r10.getValue()
            lfd r0 = (defpackage.lfd) r0
            xa3 r0 = r5.l(r0)
            wh5 r4 = new wh5
            r5 = 0
            r4.<init>(r2, r5)
            vh5 r6 = new vh5
            r6.<init>(r1, r2, r9)
            ao1 r1 = new ao1
            r1.<init>(r5, r6, r4)
            r0.j(r1)
            r12.a(r1)
            goto L_0x06b8
        L_0x03df:
            if (r12 != r8) goto L_0x0589
            java.lang.String r4 = "Handle FAVORITE_STICKER update"
            defpackage.z68.c(r1, r4, new java.lang.Object[0])
            r11.a(r0)
            hs7 r1 = r11.b
            java.lang.Object r1 = r1.get()
            vi5 r1 = (defpackage.vi5) r1
            long r10 = r0.c
            java.util.ArrayList r4 = r0.o
            wt r7 = r0.w
            int r0 = r0.x
            r1.getClass()
            java.lang.Long r12 = java.lang.Long.valueOf(r10)
            java.lang.String r2 = r7.a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r2 = new java.lang.Object[]{r12, r4, r2, r3}
            java.lang.String r3 = "vi5"
            java.lang.String r12 = "onNotifAssetsUpdate: id=%d, ids=%s, updateType=%s, position=%d"
            defpackage.z68.c(r3, r12, r2)
            int r2 = r7.ordinal()
            kc3 r7 = r1.h
            hs7 r12 = r1.c
            hs7 r8 = r1.a
            if (r2 == r9) goto L_0x0551
            if (r2 == r6) goto L_0x0508
            if (r2 == r5) goto L_0x04c6
            r5 = 4
            if (r2 == r5) goto L_0x046d
            r0 = 5
            if (r2 == r0) goto L_0x042d
            r0 = 0
            defpackage.z68.f(r3, r15, r0)
            goto L_0x06b8
        L_0x042d:
            java.lang.Object[] r0 = new java.lang.Object[]{r4}
            defpackage.z68.c(r3, r14, r0)
            java.lang.Object r0 = r8.get()
            rh5 r0 = (defpackage.rh5) r0
            wbe r0 = r0.a()
            x52 r2 = new x52
            r3 = 10
            r2.<init>(r3, r4)
            na3 r3 = new na3
            r5 = 4
            r3.<init>(r5, r0, r2)
            java.lang.Object r0 = r12.get()
            lfd r0 = (defpackage.lfd) r0
            xa3 r0 = r3.l(r0)
            uh5 r2 = new uh5
            r2.<init>(r6, r4)
            ui5 r3 = new ui5
            r5 = 0
            r3.<init>(r1, r4, r5)
            ao1 r1 = new ao1
            r1.<init>(r5, r3, r2)
            r0.j(r1)
            r7.a(r1)
            goto L_0x06b8
        L_0x046d:
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            defpackage.z68.c(r3, r13, r0)
            hi5 r0 = new hi5
            r0.<init>(r1, r10, r9)
            mka r2 = new mka
            r2.<init>(r6, r0)
            qa3 r0 = new qa3
            r3 = 3
            r0.<init>(r3, r2)
            java.lang.Object r2 = r8.get()
            rh5 r2 = (defpackage.rh5) r2
            wbe r2 = r2.a()
            lw4 r3 = new lw4
            r4 = 17
            r3.<init>(r4)
            wbe r4 = new wbe
            r5 = 0
            r4.<init>(r2, r3, r5)
            hb3 r2 = new hb3
            r2.<init>(r4, r0)
            java.lang.Object r0 = r12.get()
            lfd r0 = (defpackage.lfd) r0
            fce r0 = r2.n(r0)
            si5 r2 = new si5
            r2.<init>(r1, r5)
            ri5 r3 = new ri5
            r3.<init>(r1, r10, r9)
            ao1 r1 = new ao1
            r4 = 3
            r1.<init>(r4, r2, r3)
            r0.l(r1)
            r7.a(r1)
            goto L_0x06b8
        L_0x04c6:
            java.lang.Object r2 = r8.get()
            rh5 r2 = (defpackage.rh5) r2
            wbe r2 = r2.a()
            ph5 r3 = new ph5
            r4 = 0
            r3.<init>(r0, r4, r10)
            na3 r4 = new na3
            r5 = 4
            r4.<init>(r5, r2, r3)
            java.lang.Object r2 = r12.get()
            lfd r2 = (defpackage.lfd) r2
            xa3 r2 = r4.l(r2)
            zh5 r3 = new zh5
            r3.<init>(r0, r9, r10)
            rb4 r4 = new rb4
            r27 = 2
            r22 = r4
            r23 = r1
            r24 = r10
            r26 = r0
            r22.<init>((java.lang.Object) r23, (long) r24, (int) r26, (int) r27)
            ao1 r0 = new ao1
            r1 = 0
            r0.<init>(r1, r4, r3)
            r2.j(r0)
            r7.a(r0)
            goto L_0x06b8
        L_0x0508:
            boolean r0 = defpackage.cjf.B(r4)
            if (r0 != 0) goto L_0x050f
            goto L_0x0517
        L_0x050f:
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            java.util.List r4 = java.util.Collections.singletonList(r0)
        L_0x0517:
            java.lang.Object r0 = r8.get()
            rh5 r0 = (defpackage.rh5) r0
            wbe r0 = r0.a()
            x52 r2 = new x52
            r3 = 12
            r2.<init>(r3, r4)
            na3 r3 = new na3
            r5 = 4
            r3.<init>(r5, r0, r2)
            java.lang.Object r0 = r12.get()
            lfd r0 = (defpackage.lfd) r0
            xa3 r0 = r3.l(r0)
            uh5 r2 = new uh5
            r3 = 5
            r2.<init>(r3, r4)
            ui5 r3 = new ui5
            r3.<init>(r1, r4, r9)
            ao1 r1 = new ao1
            r4 = 0
            r1.<init>(r4, r3, r2)
            r0.j(r1)
            r7.a(r1)
            goto L_0x06b8
        L_0x0551:
            r4 = 0
            java.lang.Object r0 = r8.get()
            rh5 r0 = (defpackage.rh5) r0
            wbe r0 = r0.a()
            lh5 r2 = new lh5
            r2.<init>(r4, r10, r9)
            na3 r3 = new na3
            r5 = 4
            r3.<init>(r5, r0, r2)
            java.lang.Object r0 = r12.get()
            lfd r0 = (defpackage.lfd) r0
            xa3 r0 = r3.l(r0)
            wh5 r2 = new wh5
            r3 = 5
            r2.<init>(r10, r3)
            ri5 r3 = new ri5
            r3.<init>(r1, r10, r4)
            ao1 r1 = new ao1
            r1.<init>(r4, r3, r2)
            r0.j(r1)
            r7.a(r1)
            goto L_0x06b8
        L_0x0589:
            r2 = r5
            if (r12 != r2) goto L_0x05c5
            java.lang.String r2 = "Handle STICKER_SET update"
            defpackage.z68.c(r1, r2, new java.lang.Object[0])
            wt r2 = r0.w
            wt r3 = defpackage.wt.UPDATED
            if (r2 != r3) goto L_0x05af
            hs7 r1 = r11.d
            java.lang.Object r1 = r1.get()
            rl r1 = (defpackage.rl) r1
            long r2 = r0.c
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r2 = 3
            r1.c(r2, r0)
            goto L_0x06b8
        L_0x05af:
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unhandled sticker set update type: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r2 = 0
            defpackage.z68.f(r1, r0, r2)
            goto L_0x06b8
        L_0x05c5:
            r2 = 6
            if (r12 != r2) goto L_0x06a4
            java.lang.String r2 = "Handle RECENT update"
            defpackage.z68.c(r1, r2, new java.lang.Object[0])
            hs7 r1 = r11.e
            java.lang.Object r1 = r1.get()
            gvc r1 = (defpackage.gvc) r1
            java.util.ArrayList r2 = r0.z
            java.util.List r3 = r0.X
            wt r0 = r0.w
            if (r2 != 0) goto L_0x05e5
            r1.getClass()
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x05f1
        L_0x05e5:
            kotlin.Lazy r4 = r1.f
            java.lang.Object r4 = r4.getValue()
            bjd r4 = (defpackage.bjd) r4
            java.util.ArrayList r2 = defpackage.qe8.p(r2, r4)
        L_0x05f1:
            if (r3 != 0) goto L_0x05f8
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x05fc
        L_0x05f8:
            java.util.ArrayList r3 = defpackage.qe8.k(r3)
        L_0x05fc:
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = r2
            java.util.Collection r5 = (java.util.Collection) r5
            r4.<init>(r5)
            java.util.Collection r3 = (java.util.Collection) r3
            r4.addAll(r3)
            boolean r3 = r4.isEmpty()
            if (r3 == 0) goto L_0x0611
            goto L_0x06b8
        L_0x0611:
            kotlin.collections.CollectionsKt.reverse(r4)
            int r3 = r0.ordinal()
            ifg r5 = r1.g
            kotlin.Lazy r7 = r1.c
            if (r3 == r9) goto L_0x066f
            if (r3 == r6) goto L_0x062d
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "gvc"
            java.lang.String r2 = "Unhandled notif assets update: %s"
            defpackage.z68.g(r1, r2, r0)
            goto L_0x06b8
        L_0x062d:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0636
            ua3 r0 = defpackage.ua3.a
            goto L_0x064f
        L_0x0636:
            wuc r0 = r1.b()
            na3 r0 = r0.c(r2)
            dvc r3 = new dvc
            r4 = 0
            r3.<init>(r1, r2, r4)
            qa3 r1 = new qa3
            r1.<init>(r9, r3)
            na3 r2 = new na3
            r2.<init>(r4, r0, r1)
            r0 = r2
        L_0x064f:
            java.lang.Object r1 = r7.getValue()
            lfd r1 = (defpackage.lfd) r1
            xa3 r0 = r0.l(r1)
            ue4 r1 = new ue4
            r2 = 11
            r1.<init>(r2)
            t9a r2 = defpackage.t9a.x
            ao1 r3 = new ao1
            r4 = 0
            r3.<init>(r4, r2, r1)
            r0.j(r3)
            r5.a(r3)
            goto L_0x06b8
        L_0x066f:
            wuc r0 = r1.b()
            j6d r1 = r0.a
            mka r1 = r1.n()
            vuc r2 = new vuc
            r2.<init>(r0, r4, r6)
            na3 r0 = new na3
            r3 = 4
            r0.<init>(r3, r1, r2)
            java.lang.Object r1 = r7.getValue()
            lfd r1 = (defpackage.lfd) r1
            xa3 r0 = r0.l(r1)
            ue4 r1 = new ue4
            r2 = 10
            r1.<init>(r2)
            s9a r2 = defpackage.s9a.w
            ao1 r3 = new ao1
            r4 = 0
            r3.<init>(r4, r2, r1)
            r0.j(r3)
            r5.a(r3)
            goto L_0x06b8
        L_0x06a4:
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unhandled notif assets update: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r2 = 0
            defpackage.z68.f(r1, r0, r2)
        L_0x06b8:
            return
        L_0x06b9:
            java.lang.Object r1 = r0.b
            ybf r1 = (defpackage.ybf) r1
            jtb r2 = r1.a
            ltb r2 = (defpackage.ltb) r2
            a33 r2 = r2.a
            boolean r2 = r2.C()
            if (r2 == 0) goto L_0x06ca
            goto L_0x06e6
        L_0x06ca:
            kotlin.Lazy r1 = r1.k
            java.lang.Object r1 = r1.getValue()
            vtd r1 = (defpackage.vtd) r1
            hs7 r1 = r1.c
            java.lang.Object r1 = r1.get()
            mba r1 = (defpackage.mba) r1
            r1.getClass()
            bl4 r2 = defpackage.bl4.REGULAR
            java.lang.Object r0 = r0.c
            kba r0 = (defpackage.kba) r0
            r1.a(r0, r2)
        L_0x06e6:
            return
        L_0x06e7:
            java.lang.Object r1 = r0.b
            ybf r1 = (defpackage.ybf) r1
            kotlin.Lazy r1 = r1.k
            java.lang.Object r1 = r1.getValue()
            vtd r1 = (defpackage.vtd) r1
            hs7 r1 = r1.f
            java.lang.Object r1 = r1.get()
            t20 r1 = (defpackage.t20) r1
            r1.getClass()
            java.lang.Object r0 = r0.c
            raa r0 = (defpackage.raa) r0
            long r2 = r0.c
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            java.lang.String r3 = "t20"
            if (r2 != 0) goto L_0x0721
            long r6 = r0.o
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x0721
            long r6 = r0.v
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0719
            goto L_0x0721
        L_0x0719:
            java.lang.String r0 = "onNotifAttach bad response, empty videoId/audioId skipped"
            r1 = 0
            defpackage.z68.f(r3, r0, r1)
            goto L_0x08ba
        L_0x0721:
            hs7 r2 = r1.a
            java.lang.Object r6 = r2.get()
            fa9 r6 = (defpackage.fa9) r6
            long r7 = r0.c
            long r10 = r0.o
            long r12 = r0.v
            r6.getClass()
            cd4 r14 = defpackage.oa9.b
            java.util.ArrayList r6 = r6.t()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x0741:
            boolean r15 = r6.hasNext()
            if (r15 == 0) goto L_0x079b
            java.lang.Object r15 = r6.next()
            ha9 r15 = (defpackage.ha9) r15
            boolean r16 = r15.o()
            if (r16 == 0) goto L_0x0793
            w28 r9 = r15.x0
            java.lang.Object r9 = r9.b
            java.util.List r9 = (java.util.List) r9
            java.util.Iterator r9 = r9.iterator()
        L_0x075d:
            boolean r18 = r9.hasNext()
            if (r18 == 0) goto L_0x0793
            java.lang.Object r18 = r9.next()
            r4 = r18
            l20 r4 = (defpackage.l20) r4
            i10 r5 = r4.e
            r28 = r6
            if (r5 == 0) goto L_0x0777
            long r5 = r5.a
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x078b
        L_0x0777:
            k20 r5 = r4.d
            if (r5 == 0) goto L_0x0781
            long r5 = r5.a
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x078b
        L_0x0781:
            s10 r4 = r4.j
            if (r4 == 0) goto L_0x078e
            long r4 = r4.a
            int r4 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r4 != 0) goto L_0x078e
        L_0x078b:
            r14.add(r15)
        L_0x078e:
            r6 = r28
            r4 = 0
            goto L_0x075d
        L_0x0793:
            r28 = r6
            r6 = r28
            r4 = 0
            r9 = 1
            goto L_0x0741
        L_0x079b:
            boolean r4 = r14.isEmpty()
            if (r4 == 0) goto L_0x07a9
            java.lang.String r0 = "onNotifAttach: failed to find message by videoId/audioId/fileId, skipped"
            r1 = 0
            defpackage.z68.f(r3, r0, r1)
            goto L_0x08ba
        L_0x07a9:
            java.lang.String r4 = r0.w
            boolean r4 = defpackage.cvg.A(r4)
            sv0 r5 = r1.b
            if (r4 != 0) goto L_0x07e2
            java.lang.String r0 = "onNotifAttach: got error, mark message with ERROR status"
            defpackage.z68.c(r3, r0, new java.lang.Object[0])
            java.util.Iterator r0 = r14.iterator()
        L_0x07bc:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x08af
            java.lang.Object r3 = r0.next()
            ha9 r3 = (defpackage.ha9) r3
            java.lang.Object r4 = r2.get()
            fa9 r4 = (defpackage.fa9) r4
            oa9 r6 = defpackage.oa9.ERROR
            r4.z(r3, r6)
            twf r4 = new twf
            r8 = 0
            long r9 = r3.z
            long r11 = r3.b
            r7 = r4
            r7.<init>(r8, r9, r11)
            r5.c(r4)
            goto L_0x07bc
        L_0x07e2:
            java.lang.String r2 = "onNotifAttach: updateStatusesForMessages"
            defpackage.z68.c(r3, r2, new java.lang.Object[0])
            java.util.Iterator r2 = r14.iterator()
        L_0x07eb:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x08af
            java.lang.Object r3 = r2.next()
            ha9 r3 = (defpackage.ha9) r3
            w28 r4 = r3.x0
            java.lang.Object r4 = r4.b
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x0801:
            boolean r6 = r4.hasNext()
            long r11 = r3.b
            if (r6 == 0) goto L_0x089c
            java.lang.Object r6 = r4.next()
            l20 r6 = (defpackage.l20) r6
            z10 r7 = r6.w
            z10 r8 = defpackage.z10.c
            if (r7 != r8) goto L_0x0816
            goto L_0x0801
        L_0x0816:
            long r9 = r0.c
            r13 = 0
            int r7 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r7 == 0) goto L_0x0830
            boolean r7 = r6.a()
            if (r7 == 0) goto L_0x0830
            i10 r7 = r6.e
            long r9 = r7.a
            long r13 = r0.c
            int r7 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r7 != 0) goto L_0x0830
            r7 = 1
            goto L_0x0831
        L_0x0830:
            r7 = 0
        L_0x0831:
            long r9 = r0.o
            r13 = 0
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r9 == 0) goto L_0x084b
            boolean r9 = r6.i()
            if (r9 == 0) goto L_0x084b
            k20 r9 = r6.d
            long r9 = r9.a
            long r13 = r0.o
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r9 != 0) goto L_0x084b
            r9 = 1
            goto L_0x084c
        L_0x084b:
            r9 = 0
        L_0x084c:
            long r13 = r0.v
            r17 = 0
            int r10 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r10 == 0) goto L_0x0869
            boolean r10 = r6.c()
            if (r10 == 0) goto L_0x0869
            s10 r10 = r6.j
            long r13 = r10.a
            r28 = r4
            r15 = r5
            long r4 = r0.v
            int r4 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x086c
            r4 = 1
            goto L_0x086d
        L_0x0869:
            r28 = r4
            r15 = r5
        L_0x086c:
            r4 = 0
        L_0x086d:
            java.lang.String r5 = r6.q
            if (r7 != 0) goto L_0x0898
            if (r9 != 0) goto L_0x0898
            if (r4 == 0) goto L_0x0876
            goto L_0x0898
        L_0x0876:
            z10 r4 = defpackage.z10.b
            z10 r7 = r6.w
            if (r7 != r4) goto L_0x0893
            boolean r4 = r6.i()
            if (r4 != 0) goto L_0x088e
            boolean r4 = r6.c()
            if (r4 != 0) goto L_0x088e
            boolean r4 = r6.a()
            if (r4 == 0) goto L_0x0893
        L_0x088e:
            z10 r4 = defpackage.z10.a
            r1.d(r11, r5, r4)
        L_0x0893:
            r4 = r28
            r5 = r15
            goto L_0x0801
        L_0x0898:
            r1.d(r11, r5, r8)
            goto L_0x0893
        L_0x089c:
            r15 = r5
            r17 = 0
            twf r4 = new twf
            r8 = 0
            long r9 = r3.z
            r7 = r4
            r7.<init>(r8, r9, r11)
            r3 = r15
            r3.c(r4)
            r5 = r3
            goto L_0x07eb
        L_0x08af:
            hs7 r0 = r1.c
            java.lang.Object r0 = r0.get()
            jqg r0 = (defpackage.jqg) r0
            defpackage.rvd.A(r0)
        L_0x08ba:
            return
        L_0x08bb:
            java.lang.Object r1 = r0.b
            ybf r1 = (defpackage.ybf) r1
            kotlin.Lazy r1 = r1.k
            java.lang.Object r1 = r1.getValue()
            vtd r1 = (defpackage.vtd) r1
            hs7 r1 = r1.b
            java.lang.Object r1 = r1.get()
            jba r1 = (defpackage.jba) r1
            r1.getClass()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "onNotifMark, response = "
            r2.<init>(r3)
            java.lang.Object r0 = r0.c
            iba r0 = (defpackage.iba) r0
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "jba"
            defpackage.z68.c(r3, r2, new java.lang.Object[0])
            hs7 r2 = r1.e
            java.lang.Object r4 = r2.get()
            r62 r4 = (defpackage.r62) r4
            long r5 = r0.c
            a32 r4 = r4.D(r5)
            if (r4 == 0) goto L_0x09b1
            java.lang.Object r5 = r2.get()
            r6 = r5
            r62 r6 = (defpackage.r62) r6
            long r9 = r0.o
            long r11 = r0.v
            java.lang.Integer r13 = r0.w
            r14 = 1
            long r7 = r4.a
            r6.z0(r7, r9, r11, r13, r14)
            hs7 r5 = r1.b
            java.lang.Object r5 = r5.get()
            jqg r5 = (defpackage.jqg) r5
            svd r6 = new svd
            long r7 = r4.a
            r6.<init>(r7)
            r5.a(r6)
            long r5 = r0.o
            jtb r9 = r1.c
            ltb r9 = (defpackage.ltb) r9
            a33 r9 = r9.a
            long r9 = r9.s()
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            sv0 r6 = r1.d
            if (r5 != 0) goto L_0x09a7
            java.lang.String r5 = "onNotifMark, already read from another device or WEB"
            defpackage.z68.c(r3, r5, new java.lang.Object[0])
            hs7 r3 = r1.f
            java.lang.Object r5 = r3.get()
            qwa r5 = (defpackage.qwa) r5
            m72 r9 = r4.b
            long r10 = r9.a
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            java.util.Set r10 = java.util.Collections.singleton(r10)
            r5.d(r10)
            boolean r4 = r4.f0()
            if (r4 == 0) goto L_0x0971
            java.lang.Object r2 = r2.get()
            r62 r2 = (defpackage.r62) r2
            java.lang.Long r4 = java.lang.Long.valueOf(r7)
            java.util.List r4 = java.util.Collections.singletonList(r4)
            bl4 r5 = defpackage.bl4.REGULAR
            r2.getClass()
            ktg r10 = new ktg
            r11 = 17
            r10.<init>(r2, r5, r4, r11)
            java.lang.String r4 = "syncMessages"
            r2.p0(r4, r10)
        L_0x0971:
            hs7 r1 = r1.a
            java.lang.Object r1 = r1.get()
            rl r1 = (defpackage.rl) r1
            jna r1 = (defpackage.jna) r1
            long r4 = r9.a
            r1.l(r4)
            xy2 r1 = new xy2
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            java.util.List r2 = java.util.Collections.singletonList(r2)
            java.util.List r2 = (java.util.List) r2
            r7 = 0
            r1.<init>(r2, r7)
            r6.c(r1)
            java.lang.Integer r0 = r0.w
            if (r0 == 0) goto L_0x099d
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x09b7
        L_0x099d:
            java.lang.Object r0 = r3.get()
            qwa r0 = (defpackage.qwa) r0
            r0.a(r4)
            goto L_0x09b7
        L_0x09a7:
            wsc r0 = new wsc
            r1 = 0
            r0.<init>(r7, r1)
            r6.c(r0)
            goto L_0x09b7
        L_0x09b1:
            java.lang.String r0 = "onNotifMark chat not found"
            r1 = 0
            defpackage.z68.f(r3, r0, r1)
        L_0x09b7:
            return
        L_0x09b8:
            java.lang.Object r1 = r0.b
            ybf r1 = (defpackage.ybf) r1
            kotlin.Lazy r1 = r1.k
            java.lang.Object r1 = r1.getValue()
            vtd r1 = (defpackage.vtd) r1
            hs7 r1 = r1.i
            java.lang.Object r1 = r1.get()
            uaa r1 = (defpackage.uaa) r1
            r1.getClass()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "onNotifCallbackAnswer: "
            r2.<init>(r3)
            java.lang.Object r0 = r0.c
            taa r0 = (defpackage.taa) r0
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = defpackage.uaa.d
            defpackage.z68.c(r3, r2, new java.lang.Object[0])
            kotlin.reflect.KProperty[] r2 = defpackage.uaa.c
            r3 = 0
            r2 = r2[r3]
            hs7 r2 = r1.b
            java.lang.Object r2 = r2.get()
            r62 r2 = (defpackage.r62) r2
            long r3 = r0.o
            a32 r2 = r2.D(r3)
            if (r2 == 0) goto L_0x09fe
            long r2 = r2.a
            goto L_0x0a00
        L_0x09fe:
            r2 = -1
        L_0x0a00:
            zn1 r4 = new zn1
            java.lang.String r0 = r0.c
            r4.<init>(r2, r0)
            sv0 r0 = r1.a
            r0.c(r4)
            return
        L_0x0a0d:
            java.lang.Object r1 = r0.b
            ybf r1 = (defpackage.ybf) r1
            kotlin.Lazy r1 = r1.k
            java.lang.Object r1 = r1.getValue()
            vtd r1 = (defpackage.vtd) r1
            hs7 r1 = r1.m
            java.lang.Object r1 = r1.get()
            aca r1 = (defpackage.aca) r1
            kotlin.Lazy r2 = r1.b
            java.lang.Object r2 = r2.getValue()
            bud r2 = (defpackage.bud) r2
            r2.getClass()
            gqc r2 = defpackage.gqc.a
            gqc r2 = defpackage.gqc.a
            java.lang.Object r0 = r0.c
            bca r0 = (defpackage.bca) r0
            ud9 r2 = r0.v
            if (r2 == 0) goto L_0x0a45
            java.util.List r2 = r2.a
            if (r2 == 0) goto L_0x0a45
            int r2 = r2.size()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            goto L_0x0a46
        L_0x0a45:
            r7 = 0
        L_0x0a46:
            java.lang.Object[] r2 = new java.lang.Object[]{r7}
            java.lang.String r3 = "reactions, onNotifYouReacted, counters Count = %s"
            java.lang.String r4 = "aca"
            defpackage.z68.c(r4, r3, r2)
            kotlin.Lazy r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            ae9 r1 = (defpackage.ae9) r1
            long r2 = r0.c
            long r4 = r0.o
            ud9 r0 = r0.v
            kotlin.Lazy r6 = r1.d
            java.lang.Object r6 = r6.getValue()
            yd9 r6 = (defpackage.yd9) r6
            java.lang.Long r7 = java.lang.Long.valueOf(r4)
            kotlin.Pair r0 = kotlin.TuplesKt.to(r7, r0)
            java.util.Map r0 = kotlin.collections.MapsKt.mapOf(r0)
            java.util.LinkedHashMap r0 = r6.c(r0)
            kotlin.Lazy r6 = r1.b
            java.lang.Object r6 = r6.getValue()
            qx2 r6 = (defpackage.qx2) r6
            my2 r6 = (defpackage.my2) r6
            etc r2 = r6.p(r2)
            ome r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            a32 r2 = (defpackage.a32) r2
            if (r2 != 0) goto L_0x0a90
            goto L_0x0add
        L_0x0a90:
            fa9 r3 = r1.b()
            long r6 = r2.a
            ha9 r2 = r3.k(r6, r4)
            if (r2 != 0) goto L_0x0a9d
            goto L_0x0add
        L_0x0a9d:
            qe9 r3 = defpackage.qe9.DELETED
            qe9 r8 = r2.Y
            if (r8 != r3) goto L_0x0aa4
            goto L_0x0add
        L_0x0aa4:
            fa9 r3 = r1.b()
            r3.i(r0)
            java.lang.Long r3 = java.lang.Long.valueOf(r4)
            java.lang.Object r3 = r0.get(r3)
            xd9 r3 = (defpackage.xd9) r3
            xd9 r8 = r2.Q0
            java.util.Set r3 = defpackage.ae9.a(r8, r3)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Object r0 = r0.get(r4)
            xd9 r0 = (defpackage.xd9) r0
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r8)
            r4 = 1
            r0 = r0 ^ r4
            java.lang.Object[] r4 = new java.lang.Object[]{r3}
            java.lang.String r5 = "ae9"
            java.lang.String r8 = "reactions, NOTIF_YOU_REACTED, reactionsDiff = %s"
            defpackage.z68.c(r5, r8, r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r1.d(r4, r2, r3, r0)
        L_0x0add:
            return
        L_0x0ade:
            java.lang.Object r1 = r0.b
            ybf r1 = (defpackage.ybf) r1
            kotlin.Lazy r1 = r1.j
            java.lang.Object r1 = r1.getValue()
            is3 r1 = (defpackage.is3) r1
            r1.getClass()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "onNotifContactSort: "
            r2.<init>(r3)
            java.lang.Object r0 = r0.c
            aba r0 = (defpackage.aba) r0
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "is3"
            defpackage.z68.c(r3, r2, new java.lang.Object[0])
            java.util.ArrayList r2 = r0.c
            java.util.ArrayList r4 = r0.v
            if (r4 == 0) goto L_0x0b0f
            int r4 = r4.size()
            goto L_0x0b10
        L_0x0b0f:
            r4 = 0
        L_0x0b10:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            if (r2 == 0) goto L_0x0b1b
            int r5 = r2.size()
            goto L_0x0b1c
        L_0x0b1b:
            r5 = 0
        L_0x0b1c:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5}
            java.lang.String r5 = "onNotifContactSort, ids count = %d, phones count = $d"
            defpackage.z68.c(r3, r5, r4)
            kotlin.Lazy r4 = r1.b
            kotlin.Lazy r5 = r1.a
            kotlin.Lazy r6 = r1.c
            if (r2 == 0) goto L_0x0b86
            hs3 r7 = new hs3
            java.util.ArrayList r0 = r0.o
            r7.<init>(r2, r0)
            r1.e = r7
            java.lang.Object r0 = r6.getValue()
            ln5 r0 = (defpackage.ln5) r0
            po5 r0 = (defpackage.po5) r0
            r0.getClass()
            java.io.File r2 = new java.io.File
            java.lang.String r0 = r0.b()
            java.lang.String r6 = "phonesSort"
            r2.<init>(r0, r6)
            hs3 r0 = r1.e
            boolean r0 = defpackage.cjf.R(r2, r0)
            if (r0 == 0) goto L_0x0b70
            java.lang.Object r0 = r5.getValue()
            jtb r0 = (defpackage.jtb) r0
            ltb r0 = (defpackage.ltb) r0
            a33 r0 = r0.a
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "user.phonesSortLastSync"
            r0.k(r2, r1)
            goto L_0x0b76
        L_0x0b70:
            java.lang.String r0 = "Failed to store phones sort"
            r1 = 0
            defpackage.z68.f(r3, r0, r1)
        L_0x0b76:
            java.lang.Object r0 = r4.getValue()
            sv0 r0 = (defpackage.sv0) r0
            js3 r1 = new js3
            r2 = 6
            r1.<init>(r2)
            r0.c(r1)
            goto L_0x0be5
        L_0x0b86:
            java.util.ArrayList r2 = r0.v
            if (r2 == 0) goto L_0x0bdf
            hs3 r7 = new hs3
            java.util.ArrayList r0 = r0.o
            r7.<init>(r2, r0)
            r1.d = r7
            java.lang.Object r0 = r6.getValue()
            ln5 r0 = (defpackage.ln5) r0
            po5 r0 = (defpackage.po5) r0
            r0.getClass()
            java.io.File r2 = new java.io.File
            java.lang.String r0 = r0.b()
            java.lang.String r6 = "contactSort"
            r2.<init>(r0, r6)
            hs3 r0 = r1.d
            boolean r0 = defpackage.cjf.R(r2, r0)
            if (r0 == 0) goto L_0x0bc9
            java.lang.Object r0 = r5.getValue()
            jtb r0 = (defpackage.jtb) r0
            ltb r0 = (defpackage.ltb) r0
            a33 r0 = r0.a
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "user.contactSortLastSync"
            r0.k(r2, r1)
            goto L_0x0bcf
        L_0x0bc9:
            java.lang.String r0 = "Failed to store contact sort"
            r1 = 0
            defpackage.z68.f(r3, r0, r1)
        L_0x0bcf:
            java.lang.Object r0 = r4.getValue()
            sv0 r0 = (defpackage.sv0) r0
            js3 r1 = new js3
            r2 = 0
            r1.<init>(r2)
            r0.c(r1)
            goto L_0x0be5
        L_0x0bdf:
            java.lang.String r0 = "Wrong notif contact sort data"
            r1 = 0
            defpackage.z68.f(r3, r0, r1)
        L_0x0be5:
            return
        L_0x0be6:
            java.lang.Object r1 = r0.b
            ybf r1 = (defpackage.ybf) r1
            java.lang.Object r0 = r0.c
            dca r0 = (defpackage.dca) r0
            kotlin.Lazy r1 = r1.h
            java.lang.Object r1 = r1.getValue()
            ne7 r1 = (defpackage.ne7) r1
            java.lang.String r2 = "onNotif, chat.id = "
            monitor-enter(r1)
            long r3 = r0.o     // Catch:{ all -> 0x0c5d }
            hs7 r5 = r1.b     // Catch:{ all -> 0x0c5d }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x0c5d }
            jtb r5 = (defpackage.jtb) r5     // Catch:{ all -> 0x0c5d }
            ltb r5 = (defpackage.ltb) r5     // Catch:{ all -> 0x0c5d }
            a33 r5 = r5.a     // Catch:{ all -> 0x0c5d }
            long r5 = r5.s()     // Catch:{ all -> 0x0c5d }
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0c12
            monitor-exit(r1)
            goto L_0x0c90
        L_0x0c12:
            hs7 r3 = r1.g     // Catch:{ all -> 0x0c5d }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x0c5d }
            is9 r3 = (defpackage.is9) r3     // Catch:{ all -> 0x0c5d }
            r3.t(r0)     // Catch:{ all -> 0x0c5d }
            hs7 r3 = r1.h     // Catch:{ all -> 0x0c5d }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x0c5d }
            r62 r3 = (defpackage.r62) r3     // Catch:{ all -> 0x0c5d }
            long r4 = r0.c     // Catch:{ all -> 0x0c5d }
            a32 r9 = r3.D(r4)     // Catch:{ all -> 0x0c5d }
            if (r9 == 0) goto L_0x0c8f
            java.lang.String r3 = "ne7"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c5d }
            r4.<init>(r2)     // Catch:{ all -> 0x0c5d }
            long r5 = r9.a     // Catch:{ all -> 0x0c5d }
            r4.append(r5)     // Catch:{ all -> 0x0c5d }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x0c5d }
            defpackage.z68.c(r3, r2, new java.lang.Object[0])     // Catch:{ all -> 0x0c5d }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0c5d }
            long r4 = r9.a     // Catch:{ all -> 0x0c5d }
            java.util.Map r4 = r1.a(r4)     // Catch:{ all -> 0x0c5d }
            if (r4 != 0) goto L_0x0c5f
            java.util.concurrent.ConcurrentHashMap r4 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ all -> 0x0c5d }
            r4.<init>()     // Catch:{ all -> 0x0c5d }
            long r5 = r9.a     // Catch:{ all -> 0x0c5d }
            java.util.concurrent.ConcurrentHashMap r7 = r1.k     // Catch:{ all -> 0x0c5d }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0c5d }
            r7.put(r5, r4)     // Catch:{ all -> 0x0c5d }
            goto L_0x0c5f
        L_0x0c5d:
            r0 = move-exception
            goto L_0x0c91
        L_0x0c5f:
            long r5 = r0.o     // Catch:{ all -> 0x0c5d }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0c5d }
            oaa r6 = new oaa     // Catch:{ all -> 0x0c5d }
            b10 r7 = r0.v     // Catch:{ all -> 0x0c5d }
            r6.<init>(r2, r7)     // Catch:{ all -> 0x0c5d }
            r4.put(r5, r6)     // Catch:{ all -> 0x0c5d }
            long r4 = r9.a     // Catch:{ all -> 0x0c5d }
            long r6 = r0.o     // Catch:{ all -> 0x0c5d }
            hs7 r0 = r1.f     // Catch:{ all -> 0x0c5d }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0c5d }
            lfd r0 = (defpackage.lfd) r0     // Catch:{ all -> 0x0c5d }
            y55 r10 = new y55     // Catch:{ all -> 0x0c5d }
            r3 = 4
            r2 = r10
            r8 = r1
            r2.<init>(r3, r4, r6, r8)     // Catch:{ all -> 0x0c5d }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0c5d }
            r3 = 6000(0x1770, double:2.9644E-320)
            r0.d(r10, r3, r2)     // Catch:{ all -> 0x0c5d }
            long r2 = r9.a     // Catch:{ all -> 0x0c5d }
            r1.b(r2)     // Catch:{ all -> 0x0c5d }
        L_0x0c8f:
            monitor-exit(r1)
        L_0x0c90:
            return
        L_0x0c91:
            monitor-exit(r1)     // Catch:{ all -> 0x0c5d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xbf.run():void");
    }

    public /* synthetic */ xbf(tcf tcf, scf scf, x23 x23) {
        this.a = 14;
        this.b = tcf;
        this.c = x23;
    }
}
