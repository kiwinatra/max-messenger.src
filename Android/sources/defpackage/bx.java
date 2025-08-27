package defpackage;

/* renamed from: bx  reason: default package */
public final class bx implements ds5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bx(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0332, code lost:
        r3 = r9.e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0387  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x039b  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x041f  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0446  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x04fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r18, kotlin.coroutines.Continuation r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 2
            r6 = 1
            r7 = 0
            java.lang.Object r8 = r0.b
            int r9 = r0.a
            switch(r9) {
                case 0: goto L_0x03fe;
                case 1: goto L_0x03d5;
                case 2: goto L_0x0367;
                case 3: goto L_0x030d;
                case 4: goto L_0x0302;
                case 5: goto L_0x02d4;
                case 6: goto L_0x02bf;
                case 7: goto L_0x02ab;
                case 8: goto L_0x0288;
                case 9: goto L_0x0260;
                case 10: goto L_0x021e;
                case 11: goto L_0x0213;
                case 12: goto L_0x020c;
                case 13: goto L_0x01cf;
                default: goto L_0x0014;
            }
        L_0x0014:
            r0 = r1
            oo7 r0 = (defpackage.oo7) r0
            boolean r1 = r0 instanceof defpackage.mo7
            r10 = r8
            hjg r10 = (defpackage.hjg) r10
            if (r1 == 0) goto L_0x0030
            s85 r1 = r10.I0
            nig r2 = new nig
            mo7 r0 = (defpackage.mo7) r0
            java.lang.String r3 = r0.a
            java.lang.String r0 = r0.b
            r2.<init>(r3, r0)
            defpackage.xag.h(r1, r2)
            goto L_0x01cc
        L_0x0030:
            boolean r1 = r0 instanceof defpackage.no7
            if (r1 == 0) goto L_0x0085
            no7 r0 = (defpackage.no7) r0
            wjg r1 = r0.a
            kotlin.reflect.KProperty[] r2 = defpackage.hjg.M0
            r10.getClass()
            rig r2 = new rig
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r1.b
            if (r4 == 0) goto L_0x004b
            r3.append(r4)
        L_0x004b:
            java.lang.String r4 = "\n"
            java.lang.String r5 = r1.c
            if (r5 == 0) goto L_0x005d
            int r6 = r3.length()
            if (r6 <= 0) goto L_0x005a
            r3.append(r4)
        L_0x005a:
            r3.append(r5)
        L_0x005d:
            java.lang.String r1 = r1.a
            if (r1 == 0) goto L_0x006d
            int r5 = r3.length()
            if (r5 <= 0) goto L_0x006a
            r3.append(r4)
        L_0x006a:
            r3.append(r1)
        L_0x006d:
            java.lang.String r1 = r3.toString()
            int r3 = r1.length()
            if (r3 != 0) goto L_0x0078
            goto L_0x0079
        L_0x0078:
            r7 = r1
        L_0x0079:
            tjg r0 = r0.b
            r2.<init>(r7, r0)
            s85 r0 = r10.I0
            defpackage.xag.h(r0, r2)
            goto L_0x01cc
        L_0x0085:
            boolean r1 = r0 instanceof defpackage.dlg
            if (r1 == 0) goto L_0x0095
            xme r0 = r10.B0
            h7b r1 = defpackage.h7b.c
            r0.getClass()
            r0.m(r7, r1)
            goto L_0x01cc
        L_0x0095:
            boolean r1 = r0 instanceof defpackage.alg
            if (r1 == 0) goto L_0x00a5
            s85 r0 = r10.I0
            iig r1 = new iig
            r1.<init>(r6)
            defpackage.xag.h(r0, r1)
            goto L_0x01cc
        L_0x00a5:
            boolean r1 = r0 instanceof defpackage.clg
            if (r1 == 0) goto L_0x00b8
            xme r1 = r10.C0
            clg r0 = (defpackage.clg) r0
            boolean r0 = r0.a
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            r1.setValue(r0)
            goto L_0x01cc
        L_0x00b8:
            boolean r1 = r0 instanceof defpackage.blg
            if (r1 == 0) goto L_0x00cb
            xme r1 = r10.D0
            blg r0 = (defpackage.blg) r0
            boolean r0 = r0.a
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            r1.setValue(r0)
            goto L_0x01cc
        L_0x00cb:
            boolean r1 = r0 instanceof defpackage.dhg
            if (r1 == 0) goto L_0x00e2
            dhg r0 = (defpackage.dhg) r0
            java.lang.String r0 = r0.a
            r10.getClass()
            lig r1 = new lig
            r1.<init>(r0)
            s85 r0 = r10.I0
            defpackage.xag.h(r0, r1)
            goto L_0x01cc
        L_0x00e2:
            boolean r1 = r0 instanceof defpackage.chg
            if (r1 == 0) goto L_0x00ff
            chg r0 = (defpackage.chg) r0
            java.lang.String r0 = r0.a
            kotlin.reflect.KProperty[] r1 = defpackage.hjg.M0
            r10.getClass()
            jig r1 = new jig
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r1.<init>(r0)
            s85 r0 = r10.I0
            defpackage.xag.h(r0, r1)
            goto L_0x01cc
        L_0x00ff:
            boolean r1 = r0 instanceof defpackage.i3d
            if (r1 == 0) goto L_0x0115
            lo7 r0 = (defpackage.lo7) r0
            java.lang.Object r0 = defpackage.hjg.k(r10, r0, r2)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L_0x0111
            goto L_0x01ce
        L_0x0111:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x01ce
        L_0x0115:
            boolean r1 = r0 instanceof defpackage.ywe
            if (r1 == 0) goto L_0x012b
            ywe r0 = (defpackage.ywe) r0
            java.lang.Object r0 = defpackage.hjg.j(r10, r0, r2)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L_0x0127
            goto L_0x01ce
        L_0x0127:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x01ce
        L_0x012b:
            boolean r1 = r0 instanceof defpackage.bgg
            if (r1 == 0) goto L_0x01be
            r11 = r0
            bgg r11 = (defpackage.bgg) r11
            kotlin.reflect.KProperty[] r0 = defpackage.hjg.M0
            r10.getClass()
            java.lang.String r0 = r11.c
            int r0 = r0.hashCode()
            long r12 = (long) r0
            java.util.concurrent.ConcurrentHashMap r0 = r10.K0
            java.lang.Long r1 = java.lang.Long.valueOf(r12)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0154
            cgg r0 = new cgg
            r0.<init>()
            r11.b(r0)
            goto L_0x01cc
        L_0x0154:
            pm7 r0 = r10.L0
            kotlin.Lazy r1 = r10.X
            jx3 r2 = r10.a
            if (r0 == 0) goto L_0x015d
            goto L_0x018d
        L_0x015d:
            kotlin.Lazy r0 = r10.x0
            java.lang.Object r0 = r0.getValue()
            zgg r0 = (defpackage.zgg) r0
            n6e r0 = r0.b
            dtc r3 = new dtc
            r3.<init>(r0)
            fjg r0 = new fjg
            r0.<init>(r10, r7)
            ps5 r4 = new ps5
            r6 = 5
            r4.<init>(r3, r0, r6)
            java.lang.Object r0 = r1.getValue()
            gaf r0 = (defpackage.gaf) r0
            osa r0 = (defpackage.osa) r0
            q04 r0 = r0.a()
            bs5 r0 = defpackage.bs0.F(r4, r0)
            pm7 r0 = defpackage.bs0.K(r0, r2)
            r10.L0 = r0
        L_0x018d:
            java.lang.String r0 = r11.d
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0196
            goto L_0x019e
        L_0x0196:
            java.lang.String r0 = r11.c
            int r0 = r0.length()
            if (r0 != 0) goto L_0x01a7
        L_0x019e:
            dgg r0 = new dgg
            r0.<init>()
            r11.b(r0)
            goto L_0x01cc
        L_0x01a7:
            java.lang.Object r0 = r1.getValue()
            gaf r0 = (defpackage.gaf) r0
            osa r0 = (defpackage.osa) r0
            q04 r0 = r0.b()
            vig r1 = new vig
            r14 = 0
            r9 = r1
            r9.<init>(r10, r11, r12, r14)
            defpackage.ev0.v(r2, r0, r7, r1, r5)
            goto L_0x01cc
        L_0x01be:
            boolean r1 = r0 instanceof defpackage.lo7
            if (r1 == 0) goto L_0x01cc
            lo7 r0 = (defpackage.lo7) r0
            v0 r1 = new v0
            r1.<init>()
            r0.b(r1)
        L_0x01cc:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x01ce:
            return r0
        L_0x01cf:
            r0 = r1
            java.lang.Long r0 = (java.lang.Long) r0
            long r1 = r0.longValue()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            f8f r8 = (defpackage.f8f) r8
            if (r1 <= 0) goto L_0x0202
            e24 r1 = r8.d()
            long r2 = r0.longValue()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.c(r2)
            e24 r1 = r8.d()
            long r2 = r0.longValue()
            int r0 = (int) r2
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "p"
            r1.b(r2, r0)
            goto L_0x0209
        L_0x0202:
            e24 r0 = r8.d()
            r0.c(r7)
        L_0x0209:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x020c:
            vk3 r1 = (defpackage.vk3) r1
            java.lang.Object r0 = r0.e(r1, r2)
            return r0
        L_0x0213:
            r0 = r1
            cca r0 = (defpackage.cca) r0
            rtb r8 = (defpackage.rtb) r8
            r8.k(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x021e:
            r0 = r1
            uy4 r0 = (defpackage.uy4) r0
            rta r8 = (defpackage.rta) r8
            java.util.WeakHashMap r1 = r8.b
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x022d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x025d
            java.lang.Object r2 = r1.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof android.widget.TextView
            if (r3 == 0) goto L_0x0253
            android.widget.TextView r2 = (android.widget.TextView) r2
            int r3 = defpackage.mya.a
            java.lang.Object r3 = r2.getTag(r3)
            boolean r4 = r3 instanceof defpackage.ogf
            if (r4 == 0) goto L_0x024c
            ogf r3 = (defpackage.ogf) r3
            goto L_0x024d
        L_0x024c:
            r3 = r7
        L_0x024d:
            if (r3 == 0) goto L_0x022d
            r3.b(r2, r0)
            goto L_0x022d
        L_0x0253:
            boolean r3 = r2 instanceof defpackage.x86
            if (r3 == 0) goto L_0x022d
            x86 r2 = (defpackage.x86) r2
            r2.a(r0)
            goto L_0x022d
        L_0x025d:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0260:
            r0 = r1
            n00 r0 = (defpackage.n00) r0
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0274
            if (r0 != r6) goto L_0x026e
            rj8 r0 = defpackage.rj8.a
            goto L_0x0276
        L_0x026e:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0274:
            tj8 r0 = defpackage.tj8.a
        L_0x0276:
            il8 r8 = (defpackage.il8) r8
            ru0 r1 = r8.z
            java.lang.Object r0 = r1.t(r0, r2)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L_0x0285
            goto L_0x0287
        L_0x0285:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x0287:
            return r0
        L_0x0288:
            z08 r8 = (defpackage.z08) r8
            r8.getClass()
            y08 r0 = new y08
            r0.<init>(r8, r1, r7)
            kotlin.coroutines.CoroutineContext r1 = r8.b
            java.lang.Object r0 = defpackage.ev0.I(r1, r0, r2)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L_0x029f
            goto L_0x02a1
        L_0x029f:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x02a1:
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L_0x02a8
            goto L_0x02aa
        L_0x02a8:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x02aa:
            return r0
        L_0x02ab:
            r0 = r1
            java.util.List r0 = (java.util.List) r0
            um5 r8 = (defpackage.um5) r8
            d14 r1 = r8.b
            qm7 r2 = r8.j
            rm5 r3 = new rm5
            r3.<init>(r8, r0, r7)
            defpackage.ev0.v(r1, r2, r7, r3, r5)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x02bf:
            r0 = r1
            v4b r0 = (defpackage.v4b) r0
            kotlin.reflect.KProperty[] r1 = defpackage.ng5.i
            ng5 r8 = (defpackage.ng5) r8
            wmb r1 = r8.b()
            rf1 r1 = r1.o
            if (r1 == 0) goto L_0x02d1
            r1.d(r0)
        L_0x02d1:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x02d4:
            r0 = r1
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "updateDisplayLayout send size="
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "DisplayLayoutListener"
            defpackage.z68.c(r2, r1, new java.lang.Object[0])
            lq4 r8 = (defpackage.lq4) r8
            kotlin.Lazy r1 = r8.b
            java.lang.Object r1 = r1.getValue()
            x9b r1 = (defpackage.x9b) r1
            java.util.Collection r0 = (java.util.Collection) r0
            y9b r1 = (defpackage.y9b) r1
            r1.updateDisplayLayout(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0302:
            r0 = r1
            a51 r0 = (defpackage.a51) r0
            mp1 r8 = (defpackage.mp1) r8
            r8.u(r7)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x030d:
            r9 = r1
            y11 r9 = (defpackage.y11) r9
            java.lang.Long r0 = r9.a
            r10 = r8
            h81 r10 = (defpackage.h81) r10
            long r1 = r10.c
            if (r0 != 0) goto L_0x031a
            goto L_0x0322
        L_0x031a:
            long r3 = r0.longValue()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0325
        L_0x0322:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0366
        L_0x0325:
            xme r0 = r10.z
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            f81 r2 = (defpackage.f81) r2
            java.lang.Long r2 = r9.d
            if (r2 == 0) goto L_0x0340
            java.lang.CharSequence r3 = r9.e
            if (r3 == 0) goto L_0x0340
            long r4 = r2.longValue()
            gd0 r2 = new gd0
            r2.<init>(r3, r4)
            goto L_0x0341
        L_0x0340:
            r2 = r7
        L_0x0341:
            zd0 r3 = new zd0
            java.lang.String r4 = r9.c
            r3.<init>(r2, r4)
            l21 r2 = new l21
            java.lang.Long r4 = r9.a
            java.lang.CharSequence r5 = r9.b
            r2.<init>(r4, r5, r3)
            hl1 r3 = r10.x
            boolean r4 = r10.b
            android.text.SpannableStringBuilder r3 = r3.a(r4)
            d81 r5 = new d81
            r5.<init>(r2, r4, r3)
            boolean r0 = r0.b(r1, r5)
            if (r0 == 0) goto L_0x0325
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x0366:
            return r0
        L_0x0367:
            boolean r7 = r2 instanceof defpackage.pt0
            if (r7 == 0) goto L_0x0378
            r7 = r2
            pt0 r7 = (defpackage.pt0) r7
            int r9 = r7.o
            r10 = r9 & r4
            if (r10 == 0) goto L_0x0378
            int r9 = r9 - r4
            r7.o = r9
            goto L_0x037d
        L_0x0378:
            pt0 r7 = new pt0
            r7.<init>(r0, r2)
        L_0x037d:
            java.lang.Object r0 = r7.b
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r7.o
            if (r4 == 0) goto L_0x039b
            if (r4 == r6) goto L_0x0397
            if (r4 != r5) goto L_0x0391
            m6f r1 = r7.a
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x03c2
        L_0x0391:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0397:
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x03ad
        L_0x039b:
            kotlin.ResultKt.throwOnFailure(r0)
            boolean r0 = r1 instanceof defpackage.ox5
            st0 r8 = (defpackage.st0) r8
            if (r0 == 0) goto L_0x03b0
            r7.o = r6
            java.lang.Object r0 = defpackage.st0.a(r8, r7)
            if (r0 != r2) goto L_0x03ad
            goto L_0x03d4
        L_0x03ad:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            goto L_0x03d4
        L_0x03b0:
            boolean r0 = r1 instanceof defpackage.m6f
            if (r0 == 0) goto L_0x03ce
            r0 = r1
            m6f r0 = (defpackage.m6f) r0
            r7.a = r0
            r7.o = r5
            java.lang.Object r0 = defpackage.st0.a(r8, r7)
            if (r0 != r2) goto L_0x03c2
            goto L_0x03d4
        L_0x03c2:
            m6f r1 = (defpackage.m6f) r1
            ra3 r0 = r1.a
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            sa3 r0 = (defpackage.sa3) r0
            r0.R(r1)
            goto L_0x03ad
        L_0x03ce:
            java.util.ArrayList r0 = r8.l
            r0.add(r1)
            goto L_0x03ad
        L_0x03d4:
            return r2
        L_0x03d5:
            r0 = r1
            java.lang.Number r0 = (java.lang.Number) r0
            float r9 = r0.floatValue()
            c50 r8 = (defpackage.c50) r8
            xme r10 = r8.g
        L_0x03e0:
            java.lang.Object r0 = r10.getValue()
            r1 = r0
            xz7 r1 = (defpackage.xz7) r1
            java.lang.Float r2 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r9)
            boolean r3 = r1.b
            r1.getClass()
            xz7 r1 = new xz7
            r1.<init>(r2, r3)
            boolean r0 = r10.b(r0, r1)
            if (r0 == 0) goto L_0x03e0
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x03fe:
            boolean r9 = r2 instanceof defpackage.ax
            if (r9 == 0) goto L_0x040f
            r9 = r2
            ax r9 = (defpackage.ax) r9
            int r10 = r9.b
            r11 = r10 & r4
            if (r11 == 0) goto L_0x040f
            int r10 = r10 - r4
            r9.b = r10
            goto L_0x0414
        L_0x040f:
            ax r9 = new ax
            r9.<init>(r0, r2)
        L_0x0414:
            java.lang.Object r2 = r9.a
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r10 = r9.b
            r11 = 3
            if (r10 == 0) goto L_0x0446
            if (r10 == r6) goto L_0x0439
            if (r10 == r5) goto L_0x042c
            if (r10 != r11) goto L_0x0426
            goto L_0x042c
        L_0x0426:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x042c:
            long r0 = r9.w
            wv r3 = r9.v
            bx r4 = r9.o
            kotlin.ResultKt.throwOnFailure(r2)
            r1 = r0
            r0 = r4
            goto L_0x04f0
        L_0x0439:
            long r0 = r9.w
            wv r3 = r9.v
            bx r4 = r9.o
            kotlin.ResultKt.throwOnFailure(r2)
            r12 = r0
            r6 = r3
            r10 = r4
            goto L_0x0489
        L_0x0446:
            kotlin.ResultKt.throwOnFailure(r2)
            r3 = r1
            wv r3 = (defpackage.wv) r3
            gx r8 = (defpackage.gx) r8
            kn5 r1 = r8.c
            if (r1 == 0) goto L_0x0463
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r10 = "next state — "
            r2.<init>(r10)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.c(r2)
        L_0x0463:
            kotlin.time.TimeSource$Monotonic r1 = kotlin.time.TimeSource.Monotonic.INSTANCE
            long r1 = r1.m1495markNowz9LOYto()
            boolean r10 = r3 instanceof defpackage.sv
            if (r10 != 0) goto L_0x04f0
            boolean r10 = r3 instanceof defpackage.tv
            if (r10 == 0) goto L_0x04ba
            r5 = r3
            tv r5 = (defpackage.tv) r5
            long r10 = r5.a
            r9.o = r0
            r9.v = r3
            r9.w = r1
            r9.b = r6
            java.lang.Object r5 = r8.s(r10, r9)
            if (r5 != r4) goto L_0x0486
            goto L_0x0520
        L_0x0486:
            r10 = r0
            r12 = r1
            r6 = r3
        L_0x0489:
            java.lang.Object r0 = r10.b
            gx r0 = (defpackage.gx) r0
            r1 = r6
            tv r1 = (defpackage.tv) r1
            long r14 = r1.a
            xme r0 = r0.y
        L_0x0494:
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            java.lang.Number r2 = (java.lang.Number) r2
            r2.longValue()
            java.lang.Long r2 = java.lang.Long.valueOf(r14)
            boolean r1 = r0.b(r1, r2)
            if (r1 == 0) goto L_0x0494
            java.lang.Object r0 = r10.b
            gx r0 = (defpackage.gx) r0
            xme r0 = r0.C
            sv r1 = defpackage.sv.a
            r0.getClass()
            r0.m(r7, r1)
            r3 = r6
            r0 = r10
            r1 = r12
            goto L_0x04f0
        L_0x04ba:
            boolean r6 = r3 instanceof defpackage.uv
            if (r6 == 0) goto L_0x04d2
            r6 = r3
            uv r6 = (defpackage.uv) r6
            long r6 = r6.a
            r9.o = r0
            r9.v = r3
            r9.w = r1
            r9.b = r5
            java.lang.Object r5 = r8.x(r6, r9)
            if (r5 != r4) goto L_0x04f0
            goto L_0x0520
        L_0x04d2:
            boolean r5 = r3 instanceof defpackage.vv
            if (r5 == 0) goto L_0x04ea
            r5 = r3
            vv r5 = (defpackage.vv) r5
            long r5 = r5.a
            r9.o = r0
            r9.v = r3
            r9.w = r1
            r9.b = r11
            java.lang.Object r5 = defpackage.gx.d(r8, r5, r9)
            if (r5 != r4) goto L_0x04f0
            goto L_0x0520
        L_0x04ea:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x04f0:
            long r1 = kotlin.time.TimeSource.Monotonic.ValueTimeMark.m1500elapsedNowUwyO8pc(r1)
            java.lang.Object r0 = r0.b
            gx r0 = (defpackage.gx) r0
            kn5 r0 = r0.c
            if (r0 == 0) goto L_0x051e
            long r1 = kotlin.time.Duration.m1371getInWholeMillisecondsimpl(r1)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "processed "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = " for "
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = "ms"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r0.c(r1)
        L_0x051e:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x0520:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object e(defpackage.vk3 r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            r0 = 0
            boolean r1 = r9 instanceof defpackage.iyd
            if (r1 == 0) goto L_0x0014
            r1 = r9
            iyd r1 = (defpackage.iyd) r1
            int r2 = r1.w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0014
            int r2 = r2 - r3
            r1.w = r2
            goto L_0x0019
        L_0x0014:
            iyd r1 = new iyd
            r1.<init>(r7, r9)
        L_0x0019:
            java.lang.Object r9 = r1.o
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.w
            r4 = 1
            if (r3 == 0) goto L_0x0038
            if (r3 != r4) goto L_0x0030
            int r7 = r1.c
            xme r8 = r1.b
            bx r0 = r1.a
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x008c
        L_0x0030:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r9)
            kotlin.reflect.KProperty[] r9 = defpackage.wyd.E0
            java.lang.Object r9 = r7.b
            wyd r9 = (defpackage.wyd) r9
            jtb r3 = r9.l()
            ltb r3 = (defpackage.ltb) r3
            vj5 r3 = r3.e
            r3.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r5 = ru.ok.tamtam.android.prefs.PmsKey.f35esiaenabled
            boolean r3 = r3.m(r5, r0)
            if (r3 == 0) goto L_0x0076
            etc r3 = r9.y0
            ome r3 = r3.a
            java.lang.Object r3 = r3.getValue()
            z3e r3 = (defpackage.z3e) r3
            boolean r3 = r3.g
            vm3 r8 = r8.a
            um3 r8 = r8.c
            int[] r8 = r8.v
            java.util.stream.IntStream r8 = java.util.Arrays.stream(r8)
            uk3 r5 = new uk3
            r5.<init>(r0)
            boolean r8 = r8.anyMatch(r5)
            if (r3 == r8) goto L_0x0076
            r0 = r4
        L_0x0076:
            r1.a = r7
            xme r8 = r9.x0
            r1.b = r8
            r1.c = r0
            r1.w = r4
            qq6 r9 = r9.c
            java.lang.Object r9 = r9.a(r1)
            if (r9 != r2) goto L_0x0089
            return r2
        L_0x0089:
            r6 = r0
            r0 = r7
            r7 = r6
        L_0x008c:
            r8.setValue(r9)
            if (r7 == 0) goto L_0x009a
            java.lang.Object r7 = r0.b
            wyd r7 = (defpackage.wyd) r7
            kotlin.reflect.KProperty[] r8 = defpackage.wyd.E0
            r7.j()
        L_0x009a:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx.e(vk3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public bx(ds5 ds5, gx gxVar) {
        this.a = 0;
        this.b = gxVar;
    }
}
