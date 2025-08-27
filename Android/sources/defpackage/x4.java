package defpackage;

import android.view.View;

/* renamed from: x4  reason: default package */
public final /* synthetic */ class x4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: type inference failed for: r4v31, types: [aje] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x029f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = 7
            r2 = 3
            r3 = 0
            r4 = 0
            r5 = 1
            int r6 = r0.a
            switch(r6) {
                case 0: goto L_0x05d3;
                case 1: goto L_0x05c9;
                case 2: goto L_0x05bf;
                case 3: goto L_0x05b5;
                case 4: goto L_0x05ab;
                case 5: goto L_0x05a1;
                case 6: goto L_0x057c;
                case 7: goto L_0x04cc;
                case 8: goto L_0x0492;
                case 9: goto L_0x0488;
                case 10: goto L_0x03d1;
                case 11: goto L_0x03be;
                case 12: goto L_0x03b3;
                case 13: goto L_0x0370;
                case 14: goto L_0x02cf;
                case 15: goto L_0x02c3;
                case 16: goto L_0x0149;
                case 17: goto L_0x0129;
                case 18: goto L_0x00f3;
                case 19: goto L_0x00e9;
                case 20: goto L_0x00df;
                case 21: goto L_0x00d5;
                case 22: goto L_0x00cb;
                case 23: goto L_0x00c1;
                case 24: goto L_0x00a1;
                case 25: goto L_0x0095;
                case 26: goto L_0x007f;
                case 27: goto L_0x0056;
                case 28: goto L_0x0041;
                default: goto L_0x000c;
            }
        L_0x000c:
            kotlin.reflect.KProperty[] r1 = one.me.chats.picker.contacts.ContactsPickerScreen.X
            java.lang.Object r0 = r0.b
            one.me.chats.picker.contacts.ContactsPickerScreen r0 = (one.me.chats.picker.contacts.ContactsPickerScreen) r0
            vhb r0 = r0.l0()
            ukb r0 = r0.c
            bu3 r0 = (defpackage.bu3) r0
            d14 r1 = r0.d
            if (r1 == 0) goto L_0x0037
            kotlin.Lazy r2 = r0.c
            java.lang.Object r2 = r2.getValue()
            gaf r2 = (defpackage.gaf) r2
            osa r2 = (defpackage.osa) r2
            q04 r2 = r2.b()
            f14 r5 = defpackage.f14.b
            au3 r6 = new au3
            r6.<init>(r0, r4)
            aje r4 = defpackage.ev0.u(r1, r2, r5, r6)
        L_0x0037:
            kotlin.reflect.KProperty[] r1 = defpackage.bu3.h
            r1 = r1[r3]
            wie r2 = r0.e
            r2.setValue(r0, r1, r4)
            return
        L_0x0041:
            java.lang.Object r0 = r0.b
            at3 r0 = (defpackage.at3) r0
            ys3 r1 = r0.D0
            r1.q()
            rh0 r1 = defpackage.rh0.CONTACTS
            ph0 r2 = defpackage.ph0.LARGE
            oh0 r3 = defpackage.oh0.BANNER
            fi0 r0 = r0.E0
            r0.a(r1, r2, r3)
            return
        L_0x0056:
            java.lang.Object r0 = r0.b
            one.me.login.confirm.ConfirmPhoneScreen r0 = (one.me.login.confirm.ConfirmPhoneScreen) r0
            kotlin.reflect.KProperty[] r1 = one.me.login.confirm.ConfirmPhoneScreen.A0
            wf3 r0 = r0.h0()
            r0.B0 = r4
            jx3 r1 = r0.a
            kotlin.Lazy r2 = r0.z
            java.lang.Object r2 = r2.getValue()
            gaf r2 = (defpackage.gaf) r2
            osa r2 = (defpackage.osa) r2
            q04 r2 = r2.b()
            sf3 r3 = new sf3
            r3.<init>(r0, r4)
            f14 r4 = defpackage.f14.a
            abg r0 = r0.b
            r0.a(r1, r2, r4, r3)
            return
        L_0x007f:
            java.lang.Object r0 = r0.b
            l23 r0 = (defpackage.l23) r0
            android.widget.EditText r1 = r0.i
            if (r1 != 0) goto L_0x0088
            goto L_0x0094
        L_0x0088:
            android.text.Editable r1 = r1.getText()
            if (r1 == 0) goto L_0x0091
            r1.clear()
        L_0x0091:
            r0.q()
        L_0x0094:
            return
        L_0x0095:
            java.lang.Object r0 = r0.b
            az2 r0 = (defpackage.az2) r0
            android.view.View r0 = r0.Q0
            androidx.appcompat.widget.SwitchCompat r0 = (androidx.appcompat.widget.SwitchCompat) r0
            r0.toggle()
            return
        L_0x00a1:
            kotlin.reflect.KProperty[] r1 = one.me.chats.list.ChatsListWidget.I0
            ox2 r1 = defpackage.ox2.b
            java.lang.Object r0 = r0.b
            one.me.chats.list.ChatsListWidget r0 = (one.me.chats.list.ChatsListWidget) r0
            java.lang.String r0 = r0.b
            ta4 r1 = r1.W0()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = ":settings/folder/members-picker?folder_id="
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.b(r0, r4)
            return
        L_0x00c1:
            int r1 = ru.ok.messages.messages.widgets.ChatMsgSearchResultView.J0
            java.lang.Object r0 = r0.b
            ru.ok.messages.messages.widgets.ChatMsgSearchResultView r0 = (ru.ok.messages.messages.widgets.ChatMsgSearchResultView) r0
            r0.getClass()
            return
        L_0x00cb:
            kotlin.reflect.KProperty[] r1 = one.me.dialogs.share.media.ChatMediaDownloadBottomSheet.C0
            java.lang.Object r0 = r0.b
            one.me.dialogs.share.media.ChatMediaDownloadBottomSheet r0 = (one.me.dialogs.share.media.ChatMediaDownloadBottomSheet) r0
            r0.i0(r5)
            return
        L_0x00d5:
            int r1 = ru.ok.messages.channels.ChatControlBottomView.v0
            java.lang.Object r0 = r0.b
            ru.ok.messages.channels.ChatControlBottomView r0 = (ru.ok.messages.channels.ChatControlBottomView) r0
            r0.getClass()
            return
        L_0x00df:
            dbe r1 = one.me.sdk.bottomsheet.BaseBottomSheetWidget.v
            java.lang.Object r0 = r0.b
            one.me.settings.privacy.ui.ChangeDisabledDialog r0 = (one.me.settings.privacy.ui.ChangeDisabledDialog) r0
            r0.i0(r5)
            return
        L_0x00e9:
            java.lang.Object r0 = r0.b
            tx1 r0 = (defpackage.tx1) r0
            kotlin.jvm.functions.Function0 r0 = r0.D0
            r0.invoke()
            return
        L_0x00f3:
            java.lang.Object r0 = r0.b
            xt1 r0 = (defpackage.xt1) r0
            ecc r1 = r0.a
            if (r1 != 0) goto L_0x00fc
            r1 = r4
        L_0x00fc:
            hcc r1 = r1.o
            if (r1 != 0) goto L_0x0101
            goto L_0x0102
        L_0x0101:
            r4 = r1
        L_0x0102:
            ddb r1 = r4.w0
            boolean r1 = r1.i()
            if (r1 != 0) goto L_0x0111
            vbc r2 = defpackage.vbc.a
            s85 r3 = r4.Z
            defpackage.xag.h(r3, r2)
        L_0x0111:
            if (r1 == 0) goto L_0x0128
            boolean r1 = r0.x0
            r1 = r1 ^ r5
            r0.a(r1, r5)
            if (r1 == 0) goto L_0x0128
            wt1 r0 = r0.w0
            if (r0 == 0) goto L_0x0128
            one.me.chatscreen.mediabar.MediaBarWidget r0 = (one.me.chatscreen.mediabar.MediaBarWidget) r0
            jgd r1 = defpackage.jgd.CHAT_ATTACH_PICKER_CAMERA
            z5a r0 = r0.o
            defpackage.z5a.g(r0, r1)
        L_0x0128:
            return
        L_0x0129:
            java.lang.Object r0 = r0.b
            tl1 r0 = (defpackage.tl1) r0
            sl1 r0 = r0.E0
            if (r0 == 0) goto L_0x0148
            wie r0 = (defpackage.wie) r0
            kotlin.reflect.KProperty[] r1 = one.me.calls.ui.ui.call.panels.CallTopPanelWidget.o
            java.lang.Object r0 = r0.b
            one.me.calls.ui.ui.call.panels.CallTopPanelWidget r0 = (one.me.calls.ui.ui.call.panels.CallTopPanelWidget) r0
            am1 r0 = r0.d0()
            ph1 r0 = r0.b
            jj1 r0 = (defpackage.jj1) r0
            s85 r0 = r0.K0
            bi1 r1 = defpackage.bi1.b
            defpackage.xag.h(r0, r1)
        L_0x0148:
            return
        L_0x0149:
            kotlin.reflect.KProperty[] r6 = one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet.G0
            java.lang.Object r0 = r0.b
            one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet r0 = (one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet) r0
            fg1 r6 = r0.r0()
            kotlin.reflect.KProperty[] r7 = one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet.G0
            r7 = r7[r1]
            kotlin.properties.ReadOnlyProperty r8 = r0.F0
            java.lang.Object r0 = r8.getValue(r0, r7)
            c54 r0 = (defpackage.c54) r0
            java.lang.String r0 = r0.getText()
            r6.getClass()
            if (r0 == 0) goto L_0x0171
            int r7 = r0.length()
            if (r7 != 0) goto L_0x016f
            goto L_0x0171
        L_0x016f:
            r7 = r3
            goto L_0x0172
        L_0x0171:
            r7 = r5
        L_0x0172:
            r7 = r7 ^ r5
            if (r7 == 0) goto L_0x0177
            r13 = r0
            goto L_0x0178
        L_0x0177:
            r13 = r4
        L_0x0178:
            xme r0 = r6.x
            java.lang.Object r7 = r0.getValue()
            dg1 r7 = (defpackage.dg1) r7
            java.lang.Integer r7 = r7.a
            int r8 = defpackage.qqa.j0
            r9 = 2
            if (r7 != 0) goto L_0x0188
            goto L_0x0190
        L_0x0188:
            int r10 = r7.intValue()
            if (r10 != r8) goto L_0x0190
            r7 = r5
            goto L_0x01aa
        L_0x0190:
            int r8 = defpackage.qqa.i0
            if (r7 != 0) goto L_0x0195
            goto L_0x019d
        L_0x0195:
            int r10 = r7.intValue()
            if (r10 != r8) goto L_0x019d
            r7 = r9
            goto L_0x01aa
        L_0x019d:
            int r8 = defpackage.qqa.h0
            if (r7 != 0) goto L_0x01a3
            goto L_0x02c2
        L_0x01a3:
            int r7 = r7.intValue()
            if (r7 != r8) goto L_0x02c2
            r7 = r2
        L_0x01aa:
            java.lang.Object r8 = r0.getValue()
            dg1 r8 = (defpackage.dg1) r8
            qi7 r8 = r8.b
            int[] r10 = r8.b
            long[] r8 = r8.a
            int r11 = r8.length
            int r11 = r11 - r9
            r14 = 128(0x80, double:6.32E-322)
            r16 = 255(0xff, double:1.26E-321)
            r18 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r12 = 8
            if (r11 < 0) goto L_0x0215
            r4 = r3
            r24 = r6
        L_0x01c8:
            r5 = r8[r4]
            r21 = r10
            long r9 = ~r5
            long r9 = r9 << r1
            long r9 = r9 & r5
            long r9 = r9 & r18
            int r9 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r9 == 0) goto L_0x020b
            int r9 = r4 - r11
            int r9 = ~r9
            int r9 = r9 >>> 31
            int r9 = 8 - r9
            r10 = r3
        L_0x01dd:
            if (r10 >= r9) goto L_0x0207
            long r22 = r5 & r16
            int r22 = (r22 > r14 ? 1 : (r22 == r14 ? 0 : -1))
            if (r22 >= 0) goto L_0x0201
            int r22 = r4 << 3
            int r22 = r22 + r10
            r22 = r21[r22]
            dbe r23 = defpackage.kpc.b
            r23.getClass()
            kpc r3 = defpackage.dbe.g(r22)
            kpc r2 = defpackage.kpc.OTHER
            if (r3 != r2) goto L_0x0201
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            r14 = 1
            r3 = r24
            goto L_0x028b
        L_0x0201:
            long r5 = r5 >> r12
            r2 = 1
            int r10 = r10 + r2
            r2 = 3
            r3 = 0
            goto L_0x01dd
        L_0x0207:
            r2 = 1
            if (r9 != r12) goto L_0x0217
            goto L_0x020c
        L_0x020b:
            r2 = 1
        L_0x020c:
            if (r4 == r11) goto L_0x0217
            int r4 = r4 + r2
            r10 = r21
            r2 = 3
            r3 = 0
            r9 = 2
            goto L_0x01c8
        L_0x0215:
            r24 = r6
        L_0x0217:
            java.util.List r2 = kotlin.collections.CollectionsKt.createListBuilder()
            r3 = r24
            java.util.List r4 = r3.o
            if (r4 == 0) goto L_0x0226
            java.util.Collection r4 = (java.util.Collection) r4
            r2.addAll(r4)
        L_0x0226:
            java.lang.Object r0 = r0.getValue()
            dg1 r0 = (defpackage.dg1) r0
            qi7 r0 = r0.b
            int[] r4 = r0.b
            long[] r0 = r0.a
            int r5 = r0.length
            r6 = 2
            int r5 = r5 - r6
            if (r5 < 0) goto L_0x0286
            r6 = 0
        L_0x0238:
            r8 = r0[r6]
            long r10 = ~r8
            long r10 = r10 << r1
            long r10 = r10 & r8
            long r10 = r10 & r18
            int r10 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r10 == 0) goto L_0x027d
            int r10 = r6 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            int r10 = 8 - r10
            r11 = 0
        L_0x024b:
            if (r11 >= r10) goto L_0x0277
            long r20 = r8 & r16
            int r20 = (r20 > r14 ? 1 : (r20 == r14 ? 0 : -1))
            if (r20 >= 0) goto L_0x026f
            r20 = 3
            int r21 = r6 << 3
            int r21 = r21 + r11
            r21 = r4[r21]
            dbe r22 = defpackage.kpc.b
            r22.getClass()
            kpc r14 = defpackage.dbe.g(r21)
            if (r14 == 0) goto L_0x0271
            java.lang.String r14 = r14.a
            if (r14 != 0) goto L_0x026b
            goto L_0x0271
        L_0x026b:
            r2.add(r14)
            goto L_0x0271
        L_0x026f:
            r20 = 3
        L_0x0271:
            long r8 = r8 >> r12
            r14 = 1
            int r11 = r11 + r14
            r14 = 128(0x80, double:6.32E-322)
            goto L_0x024b
        L_0x0277:
            r14 = 1
            r20 = 3
            if (r10 != r12) goto L_0x0287
            goto L_0x0280
        L_0x027d:
            r14 = 1
            r20 = 3
        L_0x0280:
            if (r6 == r5) goto L_0x0287
            int r6 = r6 + r14
            r14 = 128(0x80, double:6.32E-322)
            goto L_0x0238
        L_0x0286:
            r14 = 1
        L_0x0287:
            java.util.List r0 = kotlin.collections.CollectionsKt.build(r2)
        L_0x028b:
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r14
            if (r1 == 0) goto L_0x0296
            goto L_0x0297
        L_0x0296:
            r0 = 0
        L_0x0297:
            if (r0 == 0) goto L_0x029f
            java.lang.String r4 = r0.toString()
            r11 = r4
            goto L_0x02a0
        L_0x029f:
            r11 = 0
        L_0x02a0:
            kotlin.Lazy r0 = r3.w
            java.lang.Object r0 = r0.getValue()
            r8 = r0
            tq1 r8 = (defpackage.tq1) r8
            r8.getClass()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            r14 = 0
            r15 = 0
            java.lang.String r9 = "CALL_REVIEW"
            java.lang.String r10 = r3.b
            r16 = 96
            defpackage.tq1.a(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            zf1 r0 = defpackage.zf1.a
            s85 r1 = r3.x0
            defpackage.xag.h(r1, r0)
        L_0x02c2:
            return
        L_0x02c3:
            java.lang.Object r0 = r0.b
            aa1 r0 = (defpackage.aa1) r0
            z91 r0 = r0.a
            if (r0 == 0) goto L_0x02ce
            r0.g()
        L_0x02ce:
            return
        L_0x02cf:
            kotlin.reflect.KProperty[] r1 = one.me.calls.ui.ui.indicator.CallIndicatorWidget.v
            java.lang.Object r0 = r0.b
            one.me.calls.ui.ui.indicator.CallIndicatorWidget r0 = (one.me.calls.ui.ui.indicator.CallIndicatorWidget) r0
            hn r1 = r0.requireActivity()
            defpackage.kr7.A(r1)
            kotlin.Lazy r0 = r0.o
            java.lang.Object r0 = r0.getValue()
            t81 r0 = (defpackage.t81) r0
            dp1 r1 = r0.c
            mp1 r1 = (defpackage.mp1) r1
            boolean r2 = r1.q()
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x035f
            s44 r1 = r1.j()
            ld9 r1 = r1.a
            if (r1 == 0) goto L_0x0301
            boolean r1 = r1.J()
            r2 = 1
            if (r1 != r2) goto L_0x0301
            r5 = 1
            goto L_0x0302
        L_0x0301:
            r5 = 0
        L_0x0302:
            a21 r0 = r0.b
            k21 r0 = (defpackage.k21) r0
            xme r0 = r0.k
            java.lang.Object r0 = r0.getValue()
            y11 r0 = (defpackage.y11) r0
            id1 r1 = defpackage.id1.b
            java.lang.Long r2 = r0.a
            if (r2 == 0) goto L_0x0319
            long r6 = r2.longValue()
            goto L_0x031b
        L_0x0319:
            r6 = 0
        L_0x031b:
            java.lang.CharSequence r2 = r0.b
            if (r2 == 0) goto L_0x0324
            java.lang.String r2 = r2.toString()
            goto L_0x0325
        L_0x0324:
            r2 = 0
        L_0x0325:
            if (r2 != 0) goto L_0x0328
            goto L_0x0329
        L_0x0328:
            r3 = r2
        L_0x0329:
            java.lang.String r0 = r0.c
            if (r0 == 0) goto L_0x0339
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r0 = r0.getBytes(r2)
            r2 = 0
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r2)
            goto L_0x033a
        L_0x0339:
            r0 = 0
        L_0x033a:
            ta4 r1 = r1.W0()
            java.lang.String r2 = ":call-incoming?chat_id="
            java.lang.String r4 = "&call_name="
            java.lang.StringBuilder r2 = defpackage.i2a.k(r2, r6, r4, r3)
            java.lang.String r3 = "&call_avatar="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = "&video_enabled="
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = r2.toString()
            r2 = 0
            r1.b(r0, r2)
            goto L_0x036f
        L_0x035f:
            r2 = 0
            id1 r0 = defpackage.id1.b
            ta4 r0 = r0.W0()
            java.lang.String r1 = ":call-active?place="
            java.lang.String r1 = r1.concat(r3)
            r0.b(r1, r2)
        L_0x036f:
            return
        L_0x0370:
            kotlin.reflect.KProperty[] r2 = one.me.calllist.ui.CallHistoryScreen.y0
            java.lang.Object r0 = r0.b
            one.me.calllist.ui.CallHistoryScreen r0 = (one.me.calllist.ui.CallHistoryScreen) r0
            v71 r0 = r0.d0()
            v11 r2 = new v11
            r2.<init>(r1)
            lf1 r0 = r0.o
            r0.c()
            r1 = 1
            r0.j = r1
            edb r1 = r0.e()
            eng r3 = r0.a
            r4 = 0
            boolean r1 = r1.a(r4, r3)
            if (r1 == 0) goto L_0x03aa
            kotlin.Lazy r0 = r0.d
            java.lang.Object r0 = r0.getValue()
            rh3 r0 = (defpackage.rh3) r0
            boolean r0 = r0.e()
            if (r0 != 0) goto L_0x03a6
            r3.b()
            goto L_0x03b2
        L_0x03a6:
            r2.invoke()
            goto L_0x03b2
        L_0x03aa:
            r0.l = r2
            r1 = 0
            r0.h = r1
            r1 = 0
            r0.i = r1
        L_0x03b2:
            return
        L_0x03b3:
            r1 = r3
            java.lang.Object r0 = r0.b
            a61 r0 = (defpackage.a61) r0
            androidx.viewpager2.widget.ViewPager2 r0 = r0.H0
            r0.e(r1, r1)
            return
        L_0x03be:
            java.lang.Object r0 = r0.b
            l01 r0 = (defpackage.l01) r0
            j01 r0 = r0.a
            if (r0 == 0) goto L_0x03d0
            gg9 r0 = (defpackage.gg9) r0
            t3a r1 = r0.b1
            if (r1 == 0) goto L_0x03d0
            of9 r0 = r0.U0
            a89 r0 = r0.a
        L_0x03d0:
            return
        L_0x03d1:
            java.lang.Object r0 = r0.b
            z70 r0 = (defpackage.z70) r0
            y70 r0 = r0.a
            if (r0 == 0) goto L_0x0487
            ru.ok.messages.media.attaches.AudioAttachView r0 = (ru.ok.messages.media.attaches.AudioAttachView) r0
            z70 r1 = r0.w
            if (r1 != 0) goto L_0x03e1
            goto L_0x0487
        L_0x03e1:
            boolean r2 = r1.getPermanentlyExpanded()
            if (r2 != 0) goto L_0x0479
            of9 r2 = r0.v0
            if (r2 != 0) goto L_0x03ed
            goto L_0x0487
        L_0x03ed:
            boolean r3 = r2.b
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            boolean r1 = r1.o
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r1}
            java.lang.String r4 = "AudioAttachView"
            java.lang.String r5 = "onTranscriptionClick message.isExpanded = %b, audioTranscriptionView.isExpanded = %b"
            defpackage.z68.c(r4, r5, r1)
            a30 r0 = r0.C0
            if (r0 == 0) goto L_0x0487
            ek3 r0 = (defpackage.ek3) r0
            a89 r1 = r2.a
            ha9 r2 = r1.a
            long r4 = r2.b
            int r2 = r0.F(r4)
            r4 = -1
            if (r2 == r4) goto L_0x0487
            java.util.ArrayList r4 = r0.v
            nf9 r5 = new nf9
            r5.<init>()
            kotlin.reflect.KProperty[] r6 = defpackage.nf9.c
            r7 = 1
            r8 = r6[r7]
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            kotlin.properties.ReadWriteProperty r10 = r5.b
            r10.setValue(r5, r8, r9)
            r8 = 0
            r9 = r6[r8]
            kotlin.properties.ReadWriteProperty r8 = r5.a
            r8.setValue(r5, r9, r1)
            r8 = r3 ^ 1
            r6 = r6[r7]
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r8)
            r10.setValue(r5, r6, r7)
            of9 r5 = r5.a()
            r4.set(r2, r5)
            ni9 r4 = new ni9
            mi9 r5 = new mi9
            ha9 r1 = r1.a
            i10 r1 = r1.c()
            java.lang.String r1 = r1.f
            r5.<init>(r8, r1)
            r1 = 0
            r4.<init>(r1, r1, r5)
            uyc r1 = r0.a
            r5 = 1
            r1.d(r2, r5, r4)
            nd r0 = r0.Z
            if (r3 == 0) goto L_0x046e
            pd[] r1 = defpackage.pd.a
            r0.getClass()
            java.lang.String r1 = "AUDIO_TRANSCRIPTION_COLLAPSE"
            r0.e(r1)
            goto L_0x0487
        L_0x046e:
            pd[] r1 = defpackage.pd.a
            r0.getClass()
            java.lang.String r1 = "AUDIO_TRANSCRIPTION_EXPAND"
            r0.e(r1)
            goto L_0x0487
        L_0x0479:
            x20 r0 = r0.w0
            if (r0 == 0) goto L_0x0487
            gg9 r0 = (defpackage.gg9) r0
            t3a r1 = r0.b1
            if (r1 == 0) goto L_0x0487
            of9 r0 = r0.U0
            a89 r0 = r0.a
        L_0x0487:
            return
        L_0x0488:
            java.lang.Object r0 = r0.b
            ya r0 = (defpackage.ya) r0
            java.lang.Runnable r0 = r0.D0
            r0.run()
            return
        L_0x0492:
            kotlin.reflect.KProperty[] r1 = one.me.sdk.messagewrite.markdown.AddLinkBottomSheet.Z
            java.lang.Object r0 = r0.b
            one.me.sdk.messagewrite.markdown.AddLinkBottomSheet r0 = (one.me.sdk.messagewrite.markdown.AddLinkBottomSheet) r0
            r1 = 1
            r0.i0(r1)
            kotlin.Lazy r2 = r0.Y
            java.lang.Object r2 = r2.getValue()
            kf8 r2 = (defpackage.kf8) r2
            kotlin.reflect.KProperty[] r3 = one.me.sdk.messagewrite.markdown.AddLinkBottomSheet.Z
            r1 = r3[r1]
            kotlin.properties.ReadOnlyProperty r3 = r0.z
            java.lang.Object r1 = r3.getValue(r0, r1)
            androidx.appcompat.widget.AppCompatEditText r1 = (androidx.appcompat.widget.AppCompatEditText) r1
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            ta r0 = r0.y
            int r3 = r0.a
            r2.getClass()
            ta r4 = new ta
            int r0 = r0.b
            r4.<init>(r3, r0, r1)
            s85 r0 = r2.b
            defpackage.xag.h(r0, r4)
            return
        L_0x04cc:
            kotlin.reflect.KProperty[] r1 = one.me.profile.screens.addmembers.AddChatMembersScreen.Z
            java.lang.Object r0 = r0.b
            one.me.profile.screens.addmembers.AddChatMembersScreen r0 = (one.me.profile.screens.addmembers.AddChatMembersScreen) r0
            vhb r1 = r0.l0()
            ukb r1 = r1.c
            ha r1 = (defpackage.ha) r1
            boolean r1 = r1.h
            if (r1 == 0) goto L_0x04e6
            int r1 = defpackage.jxa.j
            r2 = 0
            r0.g(r1, r2)
            goto L_0x057b
        L_0x04e6:
            r2 = 0
            kotlin.reflect.KProperty[] r1 = one.me.sdk.bottomsheet.BottomSheetWidget.v0
            int r1 = defpackage.qad.h2
            igf r3 = new igf
            r3.<init>(r1)
            r1 = 6
            ng3 r1 = defpackage.b0h.a(r3, r2, r1)
            pg3 r3 = new pg3
            int r4 = defpackage.jxa.j
            int r5 = defpackage.qad.j2
            igf r6 = new igf
            r6.<init>(r5)
            og3 r5 = defpackage.og3.b
            r3.<init>(r4, r6, r5)
            pg3[] r3 = new defpackage.pg3[]{r3}
            r1.a(r3)
            pg3 r3 = new pg3
            int r4 = defpackage.jxa.i
            int r6 = defpackage.qad.i2
            igf r7 = new igf
            r7.<init>(r6)
            r3.<init>(r4, r7, r5)
            pg3[] r3 = new defpackage.pg3[]{r3}
            r1.a(r3)
            pg3 r3 = new pg3
            int r4 = defpackage.jxa.h
            int r6 = defpackage.qad.m0
            igf r7 = new igf
            r7.<init>(r6)
            r3.<init>(r4, r7, r5)
            pg3[] r3 = new defpackage.pg3[]{r3}
            r1.a(r3)
            android.os.Bundle r3 = r1.a
            java.lang.String r4 = "memorize_keyboard"
            r5 = 0
            r3.putBoolean(r4, r5)
            one.me.sdk.bottomsheet.ConfirmationBottomSheet r7 = r1.e()
            r7.setTargetController(r0)
            r1 = r0
        L_0x0546:
            zx3 r3 = r1.getParentController()
            if (r3 == 0) goto L_0x0551
            zx3 r1 = r1.getParentController()
            goto L_0x0546
        L_0x0551:
            boolean r3 = r1 instanceof defpackage.l9d
            if (r3 == 0) goto L_0x0558
            l9d r1 = (defpackage.l9d) r1
            goto L_0x0559
        L_0x0558:
            r1 = r2
        L_0x0559:
            if (r1 == 0) goto L_0x0560
            e9d r4 = r1.K()
            goto L_0x0561
        L_0x0560:
            r4 = r2
        L_0x0561:
            r7.p0(r0)
            if (r4 == 0) goto L_0x057b
            i9d r0 = new i9d
            r10 = 0
            r11 = 0
            r8 = 0
            r9 = 0
            r12 = -1
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            java.lang.String r1 = "BottomSheetWidget"
            r2 = 1
            r3 = 0
            defpackage.a81.t(r3, r0, r2, r1)
            r4.G(r0)
        L_0x057b:
            return
        L_0x057c:
            r2 = r5
            int r1 = ru.ok.messages.settings.ActSettings.A0
            java.lang.Object r0 = r0.b
            ru.ok.messages.settings.ActSettings r0 = (ru.ok.messages.settings.ActSettings) r0
            ed6 r1 = r0.v()
            java.util.ArrayList r4 = r1.d
            int r4 = r4.size()
            xe0 r1 = r1.h
            if (r1 == 0) goto L_0x0592
            r3 = r2
        L_0x0592:
            int r4 = r4 + r3
            if (r4 <= 0) goto L_0x059d
            ed6 r0 = r0.v()
            r0.T()
            goto L_0x05a0
        L_0x059d:
            r0.finish()
        L_0x05a0:
            return
        L_0x05a1:
            int r1 = ru.ok.messages.views.ActProfilePhoto.C0
            java.lang.Object r0 = r0.b
            ru.ok.messages.views.ActProfilePhoto r0 = (ru.ok.messages.views.ActProfilePhoto) r0
            r0.finish()
            return
        L_0x05ab:
            int r1 = ru.ok.messages.media.mediabar.ActLocalMedias.W0
            java.lang.Object r0 = r0.b
            ru.ok.messages.media.mediabar.ActLocalMedias r0 = (ru.ok.messages.media.mediabar.ActLocalMedias) r0
            r0.onBackPressed()
            return
        L_0x05b5:
            int r1 = ru.ok.messages.views.dev.ActDevOptions.z0
            java.lang.Object r0 = r0.b
            ru.ok.messages.views.dev.ActDevOptions r0 = (ru.ok.messages.views.dev.ActDevOptions) r0
            r0.finish()
            return
        L_0x05bf:
            int r1 = ru.ok.messages.contacts.profile.ActContactAvatars.L0
            java.lang.Object r0 = r0.b
            ru.ok.messages.contacts.profile.ActContactAvatars r0 = (ru.ok.messages.contacts.profile.ActContactAvatars) r0
            r0.finish()
            return
        L_0x05c9:
            java.util.HashSet r1 = ru.ok.messages.media.attaches.ActAttachesView.e1
            java.lang.Object r0 = r0.b
            ru.ok.messages.media.attaches.ActAttachesView r0 = (ru.ok.messages.media.attaches.ActAttachesView) r0
            r0.onBackPressed()
            return
        L_0x05d3:
            int r1 = ru.ok.messages.contacts.picker.ActAdminPicker.N0
            java.lang.Object r0 = r0.b
            ru.ok.messages.contacts.picker.ActAdminPicker r0 = (ru.ok.messages.contacts.picker.ActAdminPicker) r0
            r0.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x4.onClick(android.view.View):void");
    }

    public /* synthetic */ x4(tl1 tl1, View view) {
        this.a = 17;
        this.b = tl1;
    }
}
