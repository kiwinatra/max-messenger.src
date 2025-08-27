package defpackage;

import kotlin.jvm.functions.Function1;
import one.me.startconversation.channel.PickSubscribersScreen;

/* renamed from: vq7  reason: default package */
public final /* synthetic */ class vq7 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vq7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v10, types: [int] */
    /* JADX WARNING: type inference failed for: r5v19 */
    /* JADX WARNING: type inference failed for: r5v20 */
    /* JADX WARNING: type inference failed for: r5v21 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = 2
            r3 = 0
            r4 = 1
            r5 = 0
            java.lang.Object r6 = r0.b
            int r0 = r0.a
            switch(r0) {
                case 0: goto L_0x0481;
                case 1: goto L_0x045e;
                case 2: goto L_0x044a;
                case 3: goto L_0x043a;
                case 4: goto L_0x040a;
                case 5: goto L_0x03fe;
                case 6: goto L_0x03eb;
                case 7: goto L_0x02ad;
                case 8: goto L_0x0294;
                case 9: goto L_0x0275;
                case 10: goto L_0x0264;
                case 11: goto L_0x024c;
                case 12: goto L_0x0238;
                case 13: goto L_0x0214;
                case 14: goto L_0x01e3;
                case 15: goto L_0x01d9;
                case 16: goto L_0x01ce;
                case 17: goto L_0x01ad;
                case 18: goto L_0x019c;
                case 19: goto L_0x0183;
                case 20: goto L_0x016b;
                case 21: goto L_0x0134;
                case 22: goto L_0x010a;
                case 23: goto L_0x00f9;
                case 24: goto L_0x00e3;
                case 25: goto L_0x00d0;
                case 26: goto L_0x00ba;
                case 27: goto L_0x00a7;
                case 28: goto L_0x005a;
                default: goto L_0x000f;
            }
        L_0x000f:
            r0 = r1
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            one.me.chats.picker.chats.PickerChatsListWidget2 r6 = (one.me.chats.picker.chats.PickerChatsListWidget2) r6
            rd3 r1 = r6.z
            java.util.List r1 = r1.F()
            java.lang.Object r1 = kotlin.collections.CollectionsKt.first(r1)
            tyc r1 = (defpackage.tyc) r1
            fhb r2 = r6.X
            if (r1 != r2) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            fhb r2 = r6.Y
        L_0x002b:
            int r1 = r2.j()
            if (r1 <= r0) goto L_0x0055
            if (r0 < 0) goto L_0x0055
            vhb r1 = r6.e0()
            etc r1 = r1.x
            ome r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            java.util.Set r1 = (java.util.Set) r1
            java.lang.Object r0 = r2.E(r0)
            lz7 r0 = (defpackage.lz7) r0
            hhb r0 = (defpackage.hhb) r0
            dkb r0 = r0.y
            long r2 = r0.a
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            boolean r5 = r1.contains(r0)
        L_0x0055:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            return r0
        L_0x005a:
            r0 = r1
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            one.me.chats.picker.PickerChatsListWidget r6 = (one.me.chats.picker.PickerChatsListWidget) r6
            rd3 r1 = r6.z
            java.util.List r1 = r1.F()
            java.lang.Object r1 = kotlin.collections.CollectionsKt.first(r1)
            tyc r1 = (defpackage.tyc) r1
            fhb r2 = r6.X
            if (r1 != r2) goto L_0x0074
            goto L_0x0076
        L_0x0074:
            fhb r2 = r6.Y
        L_0x0076:
            int r1 = r2.j()
            if (r1 <= r0) goto L_0x00a2
            if (r0 < 0) goto L_0x00a2
            kotlin.Lazy r1 = r6.a
            java.lang.Object r1 = r1.getValue()
            whb r1 = (defpackage.whb) r1
            etc r1 = r1.v0
            ome r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            java.util.Set r1 = (java.util.Set) r1
            java.lang.Object r0 = r2.E(r0)
            lz7 r0 = (defpackage.lz7) r0
            hhb r0 = (defpackage.hhb) r0
            long r2 = r0.a
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            boolean r5 = r1.contains(r0)
        L_0x00a2:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            return r0
        L_0x00a7:
            r0 = r1
            android.view.View r0 = (android.view.View) r0
            kotlin.reflect.KProperty[] r0 = one.me.chats.picker.PickerChatController.z0
            one.me.chats.picker.PickerChatController r6 = (one.me.chats.picker.PickerChatController) r6
            fma r0 = r6.getOnBackPressedDispatcher()
            if (r0 == 0) goto L_0x00b7
            r0.d()
        L_0x00b7:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00ba:
            r0 = r1
            ble r0 = (defpackage.ble) r0
            r0.o1()
            agb r6 = (defpackage.agb) r6
            zfb r6 = (defpackage.zfb) r6
            long r1 = r6.a
            pa4 r1 = r0.n1(r1)
            r0.Y0(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00d0:
            r0 = r1
            android.view.View r0 = (android.view.View) r0
            kotlin.reflect.KProperty[] r0 = one.me.startconversation.chat.PickChatMembers.Z
            one.me.startconversation.chat.PickChatMembers r6 = (one.me.startconversation.chat.PickChatMembers) r6
            fma r0 = r6.getOnBackPressedDispatcher()
            if (r0 == 0) goto L_0x00e0
            r0.d()
        L_0x00e0:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00e3:
            r0 = r1
            android.view.View r0 = (android.view.View) r0
            int r0 = r0.getId()
            k3b r6 = (defpackage.k3b) r6
            int r1 = r6.getId()
            if (r0 == r1) goto L_0x00f3
            goto L_0x00f4
        L_0x00f3:
            r4 = r5
        L_0x00f4:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L_0x00f9:
            r0 = r1
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r0 = java.lang.String.valueOf(r0)
            zwa r6 = (defpackage.zwa) r6
            android.widget.EditText r1 = r6.z
            r1.setText(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x010a:
            qk3 r6 = (defpackage.qk3) r6
            r0 = r1
            java.lang.Float r0 = (java.lang.Float) r0
            float r1 = r0.floatValue()
            r6.accept(r0)     // Catch:{ all -> 0x0117 }
            goto L_0x0131
        L_0x0117:
            r0 = move-exception
            r2 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Progress consumer has failed to accept the progress ("
            r0.<init>(r3)
            r0.append(r1)
            java.lang.String r1 = ") of media transform"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "qva"
            defpackage.z68.f(r1, r0, r2)
        L_0x0131:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0134:
            r0 = r1
            java.util.List r0 = (java.util.List) r0
            ke3 r1 = new ke3
            jna r6 = (defpackage.jna) r6
            jtb r2 = r6.D()
            ltb r2 = (defpackage.ltb) r2
            a33 r2 = r2.a
            long r8 = r2.n()
            java.util.Collection r0 = (java.util.Collection) r0
            long[] r15 = kotlin.collections.CollectionsKt.toLongArray(r0)
            r14 = 0
            r16 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r17 = 0
            r18 = 0
            r7 = r1
            r7.<init>(r8, r10, r12, r13, r14, r15, r16, r17, r18)
            ocf r0 = r6.E()
            r2 = 12
            long r0 = defpackage.ocf.d(r0, r1, r5, r5, r2)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L_0x016b:
            r0 = r1
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            kotlin.Lazy r6 = (kotlin.Lazy) r6
            java.lang.Object r2 = r6.getValue()
            km3 r2 = (defpackage.km3) r2
            boolean r0 = r2.u(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x0183:
            r0 = r1
            nf7 r0 = (defpackage.nf7) r0
            zq9 r6 = (defpackage.zq9) r6
            kotlin.Lazy r1 = r6.x
            java.lang.Object r1 = r1.getValue()
            t8c r1 = (defpackage.t8c) r1
            r1.getClass()
            java.lang.String r2 = r0.d
            rf7[] r0 = r0.q
            java.lang.CharSequence r0 = r1.a(r2, r0)
            return r0
        L_0x019c:
            r0 = r1
            android.view.View r0 = (android.view.View) r0
            kotlin.reflect.KProperty[] r0 = one.me.messages.settings.MessagesSettingsScreen.w
            one.me.messages.settings.MessagesSettingsScreen r6 = (one.me.messages.settings.MessagesSettingsScreen) r6
            e9d r0 = r6.getRouter()
            r0.C()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x01ad:
            r0 = r1
            java.lang.Long r0 = (java.lang.Long) r0
            r0.longValue()
            fea r6 = (defpackage.fea) r6
            java.util.Map r1 = r6.a
            java.lang.Object r0 = r1.get(r0)
            yk2 r0 = (defpackage.yk2) r0
            if (r0 == 0) goto L_0x01c9
            java.util.List r0 = r0.f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01c8
            goto L_0x01c9
        L_0x01c8:
            r4 = r5
        L_0x01c9:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L_0x01ce:
            r0 = r1
            lf9 r0 = (defpackage.lf9) r0
            gg9 r6 = (defpackage.gg9) r6
            r6.getClass()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L_0x01d9:
            r0 = r1
            bj2 r0 = (defpackage.bj2) r0
            x59 r6 = (defpackage.x59) r6
            y29 r0 = r6.t(r0)
            return r0
        L_0x01e3:
            r0 = r1
            vk3 r0 = (defpackage.vk3) r0
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref.ObjectRef) r6
            T r1 = r6.element
            x59 r1 = (defpackage.x59) r1
            bj2 r2 = new bj2
            fo3 r3 = defpackage.qe8.t(r0)
            T r4 = r6.element
            x59 r4 = (defpackage.x59) r4
            kotlin.Lazy r4 = r4.w0
            java.lang.Object r4 = r4.getValue()
            ptb r4 = (defpackage.ptb) r4
            long r5 = r0.r()
            mtb r0 = r4.b(r5)
            ntb r0 = defpackage.qe8.m(r0)
            r4 = 0
            r2.<init>(r3, r0, r4)
            y29 r0 = r1.t(r2)
            return r0
        L_0x0214:
            r0 = r1
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            one.me.members.list.MembersListWidget r6 = (one.me.members.list.MembersListWidget) r6
            t56 r1 = r6.X
            int r1 = r1.j()
            int r0 = r0 - r1
            t56 r1 = r6.z
            int r2 = r1.j()
            if (r2 < r0) goto L_0x0237
            if (r0 < 0) goto L_0x0237
            java.lang.Object r0 = r1.E(r0)
            lz7 r0 = (defpackage.lz7) r0
            r3 = r0
            z29 r3 = (defpackage.z29) r3
        L_0x0237:
            return r3
        L_0x0238:
            r0 = r1
            z29 r0 = (defpackage.z29) r0
            long r0 = r0.a
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r0 = r6.contains(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x024c:
            r0 = r1
            z29 r0 = (defpackage.z29) r0
            n39 r6 = (defpackage.n39) r6
            l39 r6 = (defpackage.l39) r6
            java.util.List r1 = r6.a
            long r2 = r0.a
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            boolean r0 = r1.contains(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x0264:
            r0 = r1
            android.view.View r0 = (android.view.View) r0
            kotlin.reflect.KProperty[] r0 = one.me.mediapicker.MediaPickerScreen.z0
            one.me.mediapicker.MediaPickerScreen r6 = (one.me.mediapicker.MediaPickerScreen) r6
            e9d r0 = r6.getRouter()
            r0.C()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0275:
            r0 = r1
            xla r0 = (defpackage.xla) r0
            kotlin.reflect.KProperty[] r0 = one.me.keyboardmedia.MediaKeyboardWidget.A0
            one.me.keyboardmedia.MediaKeyboardWidget r6 = (one.me.keyboardmedia.MediaKeyboardWidget) r6
            kotlin.Lazy r0 = r6.c
            java.lang.Object r0 = r0.getValue()
            sr8 r0 = (defpackage.sr8) r0
            xme r0 = r0.w
            r5a r1 = new r5a
            r1.<init>()
            r0.getClass()
            r0.m(r3, r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0294:
            r0 = r1
            android.view.MenuItem r0 = (android.view.MenuItem) r0
            hf8 r6 = (defpackage.hf8) r6
            java.util.HashSet r1 = r6.c
            int r0 = r0.getItemId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            r0 = r0 ^ r4
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x02ad:
            r0 = r1
            ze8 r0 = (defpackage.ze8) r0
            ce r6 = (defpackage.ce) r6
            java.lang.Object r1 = r6.c
            android.widget.EditText r1 = (android.widget.EditText) r1
            boolean r7 = r1.hasSelection()
            if (r7 != 0) goto L_0x02be
            goto L_0x03e8
        L_0x02be:
            android.text.Editable r7 = r1.getText()
            if (r7 == 0) goto L_0x03e8
            android.text.SpannableString r7 = android.text.SpannableString.valueOf(r7)
            if (r7 != 0) goto L_0x02cc
            goto L_0x03e8
        L_0x02cc:
            int r8 = r1.getSelectionStart()
            int r9 = r1.getSelectionEnd()
            if8 r10 = r0.b
            java.lang.Object r11 = r6.v
            u6h r11 = (defpackage.u6h) r11
            if (r10 == 0) goto L_0x02e3
            java.lang.Object r12 = r11.b
            s3a r12 = (defpackage.s3a) r12
            r12.k(r10)
        L_0x02e3:
            int r10 = r0.ordinal()
            java.lang.Object r12 = r6.w
            xw3 r12 = (defpackage.xw3) r12
            switch(r10) {
                case 0: goto L_0x03ba;
                case 1: goto L_0x03a8;
                case 2: goto L_0x0396;
                case 3: goto L_0x0384;
                case 4: goto L_0x0372;
                case 5: goto L_0x0360;
                case 6: goto L_0x034e;
                case 7: goto L_0x030c;
                case 8: goto L_0x02f0;
                default: goto L_0x02ee;
            }
        L_0x02ee:
            goto L_0x03cb
        L_0x02f0:
            java.lang.Object r0 = r12.y
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x02f8:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto L_0x0307
            java.lang.Object r10 = r0.next()
            ze8 r10 = (defpackage.ze8) r10
            r10.c = r5
            goto L_0x02f8
        L_0x0307:
            defpackage.ld8.e0(r7, r8, r9)
            goto L_0x03cb
        L_0x030c:
            java.lang.Class<ky7> r10 = defpackage.ky7.class
            boolean r13 = r6.l(r10)
            r12.E(r0, r13)
            java.lang.Object[] r0 = r7.getSpans(r8, r9, r10)
            ky7[] r0 = (defpackage.ky7[]) r0
            if (r0 == 0) goto L_0x0345
            int r10 = r0.length
            if (r10 != 0) goto L_0x0321
            goto L_0x0345
        L_0x0321:
            int r10 = r0.length
        L_0x0322:
            if (r5 >= r10) goto L_0x0335
            r13 = r0[r5]
            int r14 = r7.getSpanStart(r13)
            int r15 = r7.getSpanEnd(r13)
            if (r14 != r8) goto L_0x0333
            if (r15 != r9) goto L_0x0333
            goto L_0x0336
        L_0x0333:
            int r5 = r5 + r4
            goto L_0x0322
        L_0x0335:
            r13 = r3
        L_0x0336:
            if (r13 == 0) goto L_0x033b
            java.lang.String r0 = r13.b
            goto L_0x033c
        L_0x033b:
            r0 = r3
        L_0x033c:
            java.lang.Object r5 = r11.b
            s3a r5 = (defpackage.s3a) r5
            r5.x(r8, r9, r0)
            goto L_0x03cb
        L_0x0345:
            java.lang.Object r0 = r11.b
            s3a r0 = (defpackage.s3a) r0
            r0.x(r8, r9, r3)
            goto L_0x03cb
        L_0x034e:
            java.lang.Class<d43> r10 = defpackage.d43.class
            boolean r10 = r6.l(r10)
            r12.E(r0, r10)
            d43 r0 = new d43
            r0.<init>()
            defpackage.ld8.k0(r7, r8, r9, r5, r0)
            goto L_0x03cb
        L_0x0360:
            java.lang.Class<gvf> r5 = defpackage.gvf.class
            boolean r5 = r6.l(r5)
            r12.E(r0, r5)
            gvf r0 = new gvf
            r0.<init>()
            defpackage.ld8.k0(r7, r8, r9, r4, r0)
            goto L_0x03cb
        L_0x0372:
            java.lang.Class<uxe> r5 = defpackage.uxe.class
            boolean r5 = r6.l(r5)
            r12.E(r0, r5)
            uxe r0 = new uxe
            r0.<init>()
            defpackage.ld8.k0(r7, r8, r9, r4, r0)
            goto L_0x03cb
        L_0x0384:
            java.lang.Class<xs9> r5 = defpackage.xs9.class
            boolean r5 = r6.l(r5)
            r12.E(r0, r5)
            xs9 r0 = new xs9
            r0.<init>()
            defpackage.ld8.k0(r7, r8, r9, r4, r0)
            goto L_0x03cb
        L_0x0396:
            java.lang.Class<ol7> r10 = defpackage.ol7.class
            boolean r10 = r6.l(r10)
            r12.E(r0, r10)
            ol7 r0 = new ol7
            r0.<init>()
            defpackage.ld8.k0(r7, r8, r9, r5, r0)
            goto L_0x03cb
        L_0x03a8:
            java.lang.Class<eq0> r10 = defpackage.eq0.class
            boolean r10 = r6.l(r10)
            r12.E(r0, r10)
            eq0 r0 = new eq0
            r0.<init>()
            defpackage.ld8.k0(r7, r8, r9, r5, r0)
            goto L_0x03cb
        L_0x03ba:
            java.lang.Class<mx6> r5 = defpackage.mx6.class
            boolean r5 = r6.l(r5)
            r12.E(r0, r5)
            mx6 r0 = new mx6
            r0.<init>()
            defpackage.ld8.k0(r7, r8, r9, r4, r0)
        L_0x03cb:
            r1.setText(r7)
            r1.setSelection(r8, r9)
            boolean r0 = r6.k()
            r12.x = r0
            java.lang.Object r0 = r12.y
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            int r0 = r0 - r2
            uyc r1 = r12.a
            r1.d(r0, r4, r3)
            r12.m()
        L_0x03e8:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x03eb:
            r0 = r1
            android.view.View r0 = (android.view.View) r0
            kotlin.reflect.KProperty[] r0 = one.me.devmenu.logsviewer.LogsViewerScreen.w
            one.me.devmenu.logsviewer.LogsViewerScreen r6 = (one.me.devmenu.logsviewer.LogsViewerScreen) r6
            fma r0 = r6.getOnBackPressedDispatcher()
            if (r0 == 0) goto L_0x03fb
            r0.d()
        L_0x03fb:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x03fe:
            zi6 r6 = (defpackage.zi6) r6
            java.lang.Object r0 = r6.apply(r1)     // Catch:{ all -> 0x0407 }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ all -> 0x0407 }
            goto L_0x0409
        L_0x0407:
            java.lang.String r0 = ""
        L_0x0409:
            return r0
        L_0x040a:
            r0 = r1
            n78 r0 = (defpackage.n78) r0
            k78 r6 = (defpackage.k78) r6
            r6.getClass()
            q78 r7 = new q78
            r78 r6 = defpackage.r78.WAITING
            java.lang.String r1 = r0.d
            md r2 = defpackage.md.COLD_START
            java.lang.String r2 = "COLD_START"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            if (r1 != 0) goto L_0x042f
            java.lang.String r1 = r0.d
            java.lang.String r2 = "WARM_START"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            if (r1 == 0) goto L_0x042d
            goto L_0x042f
        L_0x042d:
            r8 = r5
            goto L_0x0430
        L_0x042f:
            r8 = r4
        L_0x0430:
            r2 = 0
            r1 = r7
            r4 = r0
            r5 = r6
            r6 = r8
            r1.<init>(r2, r4, r5, r6)
            return r7
        L_0x043a:
            r0 = r1
            wk6 r0 = (defpackage.wk6) r0
            h48 r6 = (defpackage.h48) r6
            s48 r1 = r6.c
            vk6 r0 = r0.a
            yd7 r1 = (defpackage.yd7) r1
            java.util.List r0 = r1.d(r0)
            return r0
        L_0x044a:
            boolean r0 = r1 instanceof defpackage.my7
            qy7 r6 = (defpackage.qy7) r6
            if (r0 == 0) goto L_0x0458
            r0 = r1
            my7 r0 = (defpackage.my7) r0
            ny7 r1 = r6.a
            r0.a = r1
            goto L_0x045b
        L_0x0458:
            r6.c(r1)
        L_0x045b:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x045e:
            r0 = r1
            xla r0 = (defpackage.xla) r0
            int r0 = one.me.android.deeplink.LinkInterceptorWidget.o
            one.me.android.deeplink.LinkInterceptorWidget r6 = (one.me.android.deeplink.LinkInterceptorWidget) r6
            android.app.Activity r0 = r6.getActivity()
            boolean r0 = r0 instanceof defpackage.t7d
            if (r0 == 0) goto L_0x0475
            e9d r0 = r6.getRouter()
            r0.C()
            goto L_0x047e
        L_0x0475:
            android.app.Activity r0 = r6.getActivity()
            if (r0 == 0) goto L_0x047e
            r0.finish()
        L_0x047e:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0481:
            r0 = r1
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            kotlin.reflect.KProperty[] r3 = one.me.keyboardmedia.stickers.KeyboardStickersWidget.z
            one.me.keyboardmedia.stickers.KeyboardStickersWidget r6 = (one.me.keyboardmedia.stickers.KeyboardStickersWidget) r6
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r3 = r6.c0()
            r3.G0()
            hwe r3 = r6.e0()
            r3.getClass()
            cu3 r4 = new cu3
            r4.<init>(r3, r0, r2)
            r3.m(r0, r4)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vq7.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ vq7(PickSubscribersScreen pickSubscribersScreen, agb agb) {
        this.a = 26;
        this.b = agb;
    }
}
