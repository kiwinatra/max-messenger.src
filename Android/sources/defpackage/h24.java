package defpackage;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* renamed from: h24  reason: default package */
public final /* synthetic */ class h24 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h24(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02d8  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0332 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r20) {
        /*
            r19 = this;
            r0 = r19
            r2 = 0
            r3 = 1
            int r4 = r0.a
            switch(r4) {
                case 0: goto L_0x04c8;
                case 1: goto L_0x0443;
                case 2: goto L_0x0424;
                case 3: goto L_0x0414;
                case 4: goto L_0x0404;
                case 5: goto L_0x03e1;
                case 6: goto L_0x03d3;
                case 7: goto L_0x03c5;
                case 8: goto L_0x03b9;
                case 9: goto L_0x03ad;
                case 10: goto L_0x03a1;
                case 11: goto L_0x0393;
                case 12: goto L_0x0385;
                case 13: goto L_0x0362;
                case 14: goto L_0x0352;
                case 15: goto L_0x0214;
                case 16: goto L_0x01d5;
                case 17: goto L_0x01c5;
                case 18: goto L_0x01b3;
                case 19: goto L_0x01a1;
                case 20: goto L_0x0189;
                case 21: goto L_0x017d;
                case 22: goto L_0x016f;
                case 23: goto L_0x0163;
                case 24: goto L_0x0151;
                case 25: goto L_0x0139;
                case 26: goto L_0x012b;
                case 27: goto L_0x00f3;
                case 28: goto L_0x00d8;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r1 = r0.b
            ipc r1 = (defpackage.ipc) r1
            gpc r1 = r1.a
            if (r1 == 0) goto L_0x00d7
            one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet r1 = (one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet) r1
            fg1 r1 = r1.r0()
            java.lang.Object r0 = r0.c
            hpc r0 = (defpackage.hpc) r0
            int r0 = r0.a
            xme r4 = r1.x
            java.lang.Object r5 = r4.getValue()
            dg1 r5 = (defpackage.dg1) r5
            java.lang.Integer r5 = r5.a
            if (r5 != 0) goto L_0x002a
            goto L_0x0032
        L_0x002a:
            int r5 = r5.intValue()
            if (r5 != r0) goto L_0x0032
            goto L_0x00d7
        L_0x0032:
            yf1 r5 = defpackage.yf1.a
            s85 r6 = r1.x0
            defpackage.xag.h(r6, r5)
            java.lang.Object r5 = r4.getValue()
            dg1 r5 = (defpackage.dg1) r5
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r7 = 6
            dg1 r5 = defpackage.dg1.a(r5, r6, r2, r2, r7)
            r4.m(r2, r5)
            xme r4 = r1.X
            java.util.List r5 = r1.k()
            r4.setValue(r5)
            int r4 = defpackage.qqa.j0
            xme r5 = r1.Z
            xme r6 = r1.y
            if (r0 != r4) goto L_0x009e
            int r0 = defpackage.sqa.N
            igf r1 = new igf
            r1.<init>(r0)
            r6.getClass()
            r6.m(r2, r1)
            dbe r0 = defpackage.kpc.b
            r0.getClass()
            kpc r0 = defpackage.kpc.OTHER
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            int r4 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r0, 10)
            r1.<init>(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0083:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0097
            java.lang.Object r4 = r0.next()
            kpc r4 = (defpackage.kpc) r4
            cg1 r4 = defpackage.o5a.j0(r4, r3)
            r1.add(r4)
            goto L_0x0083
        L_0x0097:
            r5.getClass()
            r5.m(r2, r1)
            goto L_0x00d7
        L_0x009e:
            int r3 = defpackage.qqa.i0
            boolean r1 = r1.c
            if (r0 != r3) goto L_0x00bc
            int r0 = defpackage.sqa.M
            igf r3 = new igf
            r3.<init>(r0)
            r6.getClass()
            r6.m(r2, r3)
            java.util.ArrayList r0 = defpackage.fg1.j(r1)
            r5.getClass()
            r5.m(r2, r0)
            goto L_0x00d7
        L_0x00bc:
            int r3 = defpackage.qqa.h0
            if (r0 != r3) goto L_0x00d7
            int r0 = defpackage.sqa.L
            igf r3 = new igf
            r3.<init>(r0)
            r6.getClass()
            r6.m(r2, r3)
            java.util.ArrayList r0 = defpackage.fg1.j(r1)
            r5.getClass()
            r5.m(r2, r0)
        L_0x00d7:
            return
        L_0x00d8:
            java.lang.Object r1 = r0.b
            k5c r1 = (defpackage.k5c) r1
            l5c r2 = r1.F0
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "ProfileRowHolder"
            java.lang.String r4 = "onProfileRowClicked %s"
            defpackage.z68.c(r3, r4, r2)
            l5c r1 = r1.F0
            java.lang.Object r0 = r0.c
            rma r0 = (defpackage.rma) r0
            r0.s1(r1)
            return
        L_0x00f3:
            java.lang.Object r1 = r0.b
            prb r1 = (defpackage.prb) r1
            dy5 r1 = r1.v
            if (r1 == 0) goto L_0x012a
            java.lang.Object r0 = r0.c
            cy5 r0 = (defpackage.cy5) r0
            if (r0 == 0) goto L_0x012a
            int r2 = r0.a
            int r3 = defpackage.lic.delete_chat_more_action
            if (r2 != r3) goto L_0x0113
            by5 r2 = new by5
            s26 r0 = r0.b
            r2.<init>(r0)
            kotlin.jvm.functions.Function1 r0 = r1.b
            r0.invoke(r2)
        L_0x0113:
            f7a r0 = r1.a
            java.lang.Object r1 = r0.b
            sz7 r1 = (defpackage.sz7) r1
            if (r1 == 0) goto L_0x012a
            mo r1 = r1.I0
            boolean r1 = r1.isShowing()
            if (r1 == 0) goto L_0x012a
            java.lang.Object r0 = r0.b
            sz7 r0 = (defpackage.sz7) r0
            r0.dismiss()
        L_0x012a:
            return
        L_0x012b:
            java.lang.Object r1 = r0.b
            fkb r1 = (defpackage.fkb) r1
            kotlin.jvm.functions.Function1 r1 = r1.E0
            java.lang.Object r0 = r0.c
            w16 r0 = (defpackage.w16) r0
            r1.invoke(r0)
            return
        L_0x0139:
            java.lang.Object r1 = r0.c
            hhb r1 = (defpackage.hhb) r1
            dkb r2 = r1.y
            long r2 = r2.a
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            dkb r1 = r1.y
            ckb r1 = r1.b
            java.lang.Object r0 = r0.b
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r0.invoke(r2, r1)
            return
        L_0x0151:
            java.lang.Object r1 = r0.c
            e3b r1 = (defpackage.e3b) r1
            int r1 = r1.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.b
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r0.invoke(r1)
            return
        L_0x0163:
            java.lang.Object r1 = r0.b
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            java.lang.Object r0 = r0.c
            q7a r0 = (defpackage.q7a) r0
            r1.invoke(r0)
            return
        L_0x016f:
            java.lang.Object r1 = r0.c
            one.me.sdk.uikit.common.miniplayer.MiniPlayerView r1 = (one.me.sdk.uikit.common.miniplayer.MiniPlayerView) r1
            pr9 r1 = r1.E0
            java.lang.Object r0 = r0.b
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r0.invoke(r1)
            return
        L_0x017d:
            java.lang.Object r1 = r0.b
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            java.lang.Object r0 = r0.c
            ge9 r0 = (defpackage.ge9) r0
            r1.invoke(r0)
            return
        L_0x0189:
            java.lang.Object r1 = r0.c
            qw3 r1 = (defpackage.qw3) r1
            java.lang.Object r1 = r1.G0
            y29 r1 = (defpackage.y29) r1
            if (r1 == 0) goto L_0x01a0
            long r1 = r1.a
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object r0 = r0.b
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r0.invoke(r1)
        L_0x01a0:
            return
        L_0x01a1:
            java.lang.Object r1 = r0.c
            z29 r1 = (defpackage.z29) r1
            long r1 = r1.a
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object r0 = r0.b
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r0.invoke(r1)
            return
        L_0x01b3:
            java.lang.Object r1 = r0.c
            t29 r1 = (defpackage.t29) r1
            int r1 = r1.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.b
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r0.invoke(r1)
            return
        L_0x01c5:
            java.lang.Object r1 = r0.b
            h19 r1 = (defpackage.h19) r1
            kotlin.jvm.functions.Function1 r1 = r1.a
            if (r1 == 0) goto L_0x01d4
            java.lang.Object r0 = r0.c
            x19 r0 = (defpackage.x19) r0
            r1.invoke(r0)
        L_0x01d4:
            return
        L_0x01d5:
            int r2 = ru.ok.tamtam.markdown.ui.preview.MarkdownMenuView.x
            java.lang.Object r2 = r0.b
            ru.ok.tamtam.markdown.ui.preview.MarkdownMenuView r2 = (ru.ok.tamtam.markdown.ui.preview.MarkdownMenuView) r2
            r2.getClass()
            java.util.ArrayList r4 = r2.a
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
        L_0x01e5:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x020e
            java.lang.Object r6 = r4.next()
            int r7 = r5 + 1
            if (r5 >= 0) goto L_0x01f6
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L_0x01f6:
            cf8 r6 = (defpackage.cf8) r6
            java.lang.Object r8 = r6.getTag()
            java.lang.Object r9 = r0.c
            bf8 r9 = (defpackage.bf8) r9
            if (r8 != r9) goto L_0x0204
            r8 = r3
            goto L_0x0205
        L_0x0204:
            r8 = 0
        L_0x0205:
            r6.a(r8, r3)
            if (r8 == 0) goto L_0x020c
            r2.c = r5
        L_0x020c:
            r5 = r7
            goto L_0x01e5
        L_0x020e:
            int r0 = r2.c
            r2.a(r0, r3)
            return
        L_0x0214:
            java.lang.Object r4 = r0.b
            one.me.main.MainScreen r4 = (one.me.main.MainScreen) r4
            java.lang.Object r0 = r0.c
            spa r0 = (defpackage.spa) r0
            java.lang.String r5 = r4.w
            a67 r6 = defpackage.z68.b
            if (r6 != 0) goto L_0x0224
            goto L_0x034e
        L_0x0224:
            boolean r7 = r6.c()
            if (r7 == 0) goto L_0x034e
            w78 r7 = defpackage.w78.o
            android.graphics.Rect r8 = defpackage.rcg.a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "\n"
            r8.<init>(r9)
            android.content.res.Resources r10 = r20.getResources()
            android.view.View r11 = r20.getRootView()
            java.util.LinkedList r12 = new java.util.LinkedList
            r12.<init>()
            java.lang.String r13 = ""
            kotlin.Pair r11 = kotlin.TuplesKt.to(r13, r11)
            r12.push(r11)
        L_0x024b:
            boolean r11 = r12.isEmpty()
            if (r11 != 0) goto L_0x033c
            java.lang.Object r11 = r12.pop()
            kotlin.Pair r11 = (kotlin.Pair) r11
            java.lang.Object r14 = r11.getSecond()
            android.view.View r14 = (android.view.View) r14
            boolean r15 = r12.isEmpty()
            if (r15 != 0) goto L_0x027a
            java.lang.Object r15 = r11.getFirst()
            java.lang.Object r16 = r12.peek()
            kotlin.Pair r16 = (kotlin.Pair) r16
            java.lang.Object r1 = r16.getFirst()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r15, (java.lang.Object) r1)
            if (r1 == 0) goto L_0x0278
            goto L_0x027a
        L_0x0278:
            r1 = 0
            goto L_0x027b
        L_0x027a:
            r1 = r3
        L_0x027b:
            java.lang.Object r15 = r11.getFirst()
            if (r1 == 0) goto L_0x0286
            java.lang.String r16 = "└── "
        L_0x0283:
            r2 = r16
            goto L_0x0289
        L_0x0286:
            java.lang.String r16 = "├── "
            goto L_0x0283
        L_0x0289:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r15)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.Class r3 = r14.getClass()
            java.lang.String r3 = r3.getSimpleName()
            int r15 = r14.getId()
            r19 = r13
            java.lang.String r13 = " / "
            if (r10 != 0) goto L_0x02b3
            r17 = r0
            r18 = r10
        L_0x02ae:
            r0 = r19
        L_0x02b0:
            r10 = r20
            goto L_0x02cf
        L_0x02b3:
            r17 = r0
            int r0 = r14.getId()     // Catch:{ all -> 0x02cc }
            java.lang.String r0 = r10.getResourceEntryName(r0)     // Catch:{ all -> 0x02cc }
            r18 = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x02ae }
            r10.<init>(r13)     // Catch:{ all -> 0x02ae }
            r10.append(r0)     // Catch:{ all -> 0x02ae }
            java.lang.String r0 = r10.toString()     // Catch:{ all -> 0x02ae }
            goto L_0x02b0
        L_0x02cc:
            r18 = r10
            goto L_0x02ae
        L_0x02cf:
            boolean r13 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r14, (java.lang.Object) r10)
            if (r13 == 0) goto L_0x02d8
            java.lang.String r13 = " *********"
            goto L_0x02da
        L_0x02d8:
            r13 = r19
        L_0x02da:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r2)
            r10.append(r3)
            java.lang.String r2 = " id="
            r10.append(r2)
            r10.append(r15)
            r10.append(r0)
            r10.append(r13)
            java.lang.String r0 = r10.toString()
            r8.append(r0)
            r8.append(r9)
            boolean r0 = r14 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0332
            android.view.ViewGroup r14 = (android.view.ViewGroup) r14
            int r0 = r14.getChildCount()
            r2 = 0
        L_0x0308:
            if (r2 >= r0) goto L_0x0332
            java.lang.Object r3 = r11.getFirst()
            if (r1 == 0) goto L_0x0313
            java.lang.String r10 = "    "
            goto L_0x0315
        L_0x0313:
            java.lang.String r10 = "│   "
        L_0x0315:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r3)
            r13.append(r10)
            java.lang.String r3 = r13.toString()
            android.view.View r10 = r14.getChildAt(r2)
            kotlin.Pair r3 = kotlin.TuplesKt.to(r3, r10)
            r12.push(r3)
            r3 = 1
            int r2 = r2 + r3
            goto L_0x0308
        L_0x0332:
            r13 = r19
            r0 = r17
            r10 = r18
            r2 = 0
            r3 = 1
            goto L_0x024b
        L_0x033c:
            r17 = r0
            java.lang.String r0 = r8.toString()
            java.lang.String r1 = "before handleClick, view hierarchy ... "
            java.lang.String r0 = defpackage.a81.m(r1, r0)
            r1 = 0
            r6.d(r7, r5, r0, r1)
            r0 = r17
        L_0x034e:
            r4.i0(r0)
            return
        L_0x0352:
            java.lang.Object r1 = r0.b
            qb8 r1 = (defpackage.qb8) r1
            gpe r1 = r1.F0
            if (r1 == 0) goto L_0x0361
            java.lang.Object r0 = r0.c
            uoe r0 = (defpackage.uoe) r0
            r0.f(r1)
        L_0x0361:
            return
        L_0x0362:
            kotlin.reflect.KProperty[] r1 = one.me.android.join.JoinChatWidget.v0
            java.lang.Object r1 = r0.b
            one.me.sdk.uikit.common.button.OneMeButton r1 = (one.me.sdk.uikit.common.button.OneMeButton) r1
            r2 = 1
            r1.setProgressEnabled(r2)
            java.lang.Object r0 = r0.c
            one.me.android.join.JoinChatWidget r0 = (one.me.android.join.JoinChatWidget) r0
            kotlin.Lazy r0 = r0.Y
            java.lang.Object r0 = r0.getValue()
            do7 r0 = (defpackage.do7) r0
            jx3 r1 = r0.a
            bo7 r2 = new bo7
            r3 = 0
            r2.<init>(r0, r3)
            r0 = 3
            defpackage.ev0.v(r1, r3, r3, r2, r0)
            return
        L_0x0385:
            java.lang.Object r1 = r0.c
            xj7 r1 = (defpackage.xj7) r1
            wj7 r1 = r1.a
            java.lang.Object r0 = r0.b
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r0.invoke(r1)
            return
        L_0x0393:
            java.lang.Object r1 = r0.c
            u27 r1 = (defpackage.u27) r1
            java.lang.String r1 = r1.a
            java.lang.Object r0 = r0.b
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r0.invoke(r1)
            return
        L_0x03a1:
            java.lang.Object r1 = r0.b
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            java.lang.Object r0 = r0.c
            ss6 r0 = (defpackage.ss6) r0
            r1.invoke(r0)
            return
        L_0x03ad:
            java.lang.Object r1 = r0.b
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            java.lang.Object r0 = r0.c
            qs6 r0 = (defpackage.qs6) r0
            r1.invoke(r0)
            return
        L_0x03b9:
            java.lang.Object r1 = r0.b
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            java.lang.Object r0 = r0.c
            ns6 r0 = (defpackage.ns6) r0
            r1.invoke(r0)
            return
        L_0x03c5:
            java.lang.Object r1 = r0.b
            en0 r1 = (defpackage.en0) r1
            kotlin.jvm.functions.Function1 r1 = r1.E0
            java.lang.Object r0 = r0.c
            y56 r0 = (defpackage.y56) r0
            r1.invoke(r0)
            return
        L_0x03d3:
            java.lang.Object r1 = r0.b
            y36 r1 = (defpackage.y36) r1
            kotlin.jvm.functions.Function1 r1 = r1.D0
            java.lang.Object r0 = r0.c
            x16 r0 = (defpackage.x16) r0
            r1.invoke(r0)
            return
        L_0x03e1:
            java.lang.Object r1 = r0.c
            m16 r1 = (defpackage.m16) r1
            long r1 = r1.a
            java.lang.Object r0 = r0.b
            my5 r0 = (defpackage.my5) r0
            one.me.folders.edit.FolderEditScreen r0 = (one.me.folders.edit.FolderEditScreen) r0
            m06 r0 = r0.d0()
            gaf r3 = r0.o
            osa r3 = (defpackage.osa) r3
            q04 r3 = r3.b()
            g06 r4 = new g06
            r5 = 0
            r4.<init>(r0, r1, r5)
            r1 = 2
            defpackage.xag.g(r0, r3, r5, r4, r1)
            return
        L_0x0404:
            java.lang.Object r1 = r0.b
            p06 r1 = (defpackage.p06) r1
            java.lang.Object r1 = r1.v
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            java.lang.Object r0 = r0.c
            qo5 r0 = (defpackage.qo5) r0
            r1.invoke(r0)
            return
        L_0x0414:
            java.lang.Object r1 = r0.b
            mf5 r1 = (defpackage.mf5) r1
            if (r1 == 0) goto L_0x0423
            ru.ok.messages.actions.ExtraActionsView r1 = (ru.ok.messages.actions.ExtraActionsView) r1
            java.lang.Object r0 = r0.c
            lf5 r0 = (defpackage.lf5) r0
            r1.r(r0)
        L_0x0423:
            return
        L_0x0424:
            java.lang.Object r1 = r0.c
            q35 r1 = (defpackage.q35) r1
            vx1 r2 = r1.H0
            if (r2 == 0) goto L_0x0442
            android.view.View r3 = r1.a
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.graphics.drawable.ShapeDrawable r1 = r1.D0
            r3.setBackground(r1)
            int r1 = r2.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.b
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r0.invoke(r1)
        L_0x0442:
            return
        L_0x0443:
            r5 = r2
            java.lang.Object r1 = r0.b
            g15 r1 = (defpackage.g15) r1
            n25 r1 = r1.D0
            if (r1 == 0) goto L_0x04c7
            java.lang.Object r0 = r0.c
            rt6 r0 = (defpackage.rt6) r0
            java.lang.Object r0 = r0.b
            one.me.keyboardmedia.emoji.KeyboardEmojiWidget r0 = (one.me.keyboardmedia.emoji.KeyboardEmojiWidget) r0
            android.view.View r2 = r0.getView()
            if (r2 == 0) goto L_0x045f
            qw6 r3 = defpackage.qw6.KEYBOARD_TAP
            defpackage.b0h.K(r2, r3)
        L_0x045f:
            kotlin.Lazy r0 = r0.b
            java.lang.Object r0 = r0.getValue()
            sr8 r0 = (defpackage.sr8) r0
            long r7 = r1.w
            r2 = 0
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0482
            kotlin.Lazy r2 = r0.o
            java.lang.Object r2 = r2.getValue()
            gk r2 = (defpackage.gk) r2
            tz9 r2 = r2.i(r7)
            java.lang.Object r2 = r2.getValue()
            hi r2 = (defpackage.hi) r2
            goto L_0x0486
        L_0x0482:
            r0.getClass()
            r2 = r5
        L_0x0486:
            java.lang.CharSequence r11 = r1.c
            r1 = 20
            if (r2 == 0) goto L_0x04a7
            float r1 = (float) r1
            android.content.res.Resources r3 = defpackage.vo4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r1 = r1 * r3
            int r12 = kotlin.math.MathKt.roundToInt((float) r1)
            u25 r6 = r0.b
            java.lang.String r9 = r2.c
            java.lang.String r10 = r2.e
            java.lang.CharSequence r1 = r6.b(r7, r9, r10, r11, r12)
            goto L_0x04bd
        L_0x04a7:
            float r1 = (float) r1
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r1 = r1 * r2
            int r1 = kotlin.math.MathKt.roundToInt((float) r1)
            u25 r2 = r0.b
            java.lang.CharSequence r1 = r2.e(r11, r1)
        L_0x04bd:
            lr8 r2 = new lr8
            r2.<init>(r1)
            s85 r0 = r0.v
            defpackage.xag.h(r0, r2)
        L_0x04c7:
            return
        L_0x04c8:
            java.lang.Object r1 = r0.c
            g24 r1 = (defpackage.g24) r1
            int r1 = r1.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.b
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r0.invoke(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h24.onClick(android.view.View):void");
    }

    public /* synthetic */ h24(kbe kbe, Function1 function1, int i) {
        this.a = i;
        this.c = kbe;
        this.b = function1;
    }
}
