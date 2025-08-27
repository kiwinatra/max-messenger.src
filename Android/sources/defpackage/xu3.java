package defpackage;

import android.view.View;

/* renamed from: xu3  reason: default package */
public final /* synthetic */ class xu3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xu3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: sm6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: float[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v23 */
    /* JADX WARNING: type inference failed for: r1v24 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r10) {
        /*
            r9 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3 = 1
            java.lang.Object r4 = r9.b
            int r9 = r9.a
            switch(r9) {
                case 0: goto L_0x0411;
                case 1: goto L_0x0409;
                case 2: goto L_0x0401;
                case 3: goto L_0x03fb;
                case 4: goto L_0x03f3;
                case 5: goto L_0x03ed;
                case 6: goto L_0x03d6;
                case 7: goto L_0x03c6;
                case 8: goto L_0x03bc;
                case 9: goto L_0x03b2;
                case 10: goto L_0x030c;
                case 11: goto L_0x02d0;
                case 12: goto L_0x02c4;
                case 13: goto L_0x0294;
                case 14: goto L_0x028e;
                case 15: goto L_0x0282;
                case 16: goto L_0x024e;
                case 17: goto L_0x021b;
                case 18: goto L_0x01c3;
                case 19: goto L_0x016b;
                case 20: goto L_0x013a;
                case 21: goto L_0x011a;
                case 22: goto L_0x010d;
                case 23: goto L_0x0107;
                case 24: goto L_0x00db;
                case 25: goto L_0x00cc;
                case 26: goto L_0x00bc;
                case 27: goto L_0x0080;
                case 28: goto L_0x0013;
                default: goto L_0x000b;
            }
        L_0x000b:
            ru.ok.messages.media.attaches.MessageAttachmentsLayout r4 = (ru.ok.messages.media.attaches.MessageAttachmentsLayout) r4
            p89 r9 = r4.v
            r9.L(r2)
            return
        L_0x0013:
            n09 r4 = (defpackage.n09) r4
            java.lang.Object r9 = r4.c
            b8d r9 = (defpackage.b8d) r9
            java.lang.Object r10 = r4.z
            m09 r10 = (defpackage.m09) r10
            r9.getClass()
            kotlin.reflect.KProperty[] r0 = one.me.chatmedia.viewer.ChatMediaViewerScreen.H0
            java.lang.Object r9 = r9.a
            one.me.chatmedia.viewer.ChatMediaViewerScreen r9 = (one.me.chatmedia.viewer.ChatMediaViewerScreen) r9
            r9.getClass()
            int r10 = r10.ordinal()
            if (r10 == r3) goto L_0x0066
            r0 = 2
            if (r10 == r0) goto L_0x0066
            r0 = 4
            if (r10 == r0) goto L_0x0036
            goto L_0x007f
        L_0x0036:
            n09 r10 = r9.x0
            if (r10 == 0) goto L_0x003f
            m09 r0 = defpackage.m09.o
            r10.l(r0)
        L_0x003f:
            aj2 r9 = r9.r0()
            hr8 r10 = r9.r()
            boolean r0 = r10 instanceof defpackage.yq8
            if (r0 == 0) goto L_0x0058
            l85 r0 = new l85
            yq8 r10 = (defpackage.yq8) r10
            r0.<init>(r10)
            s85 r9 = r9.L0
            defpackage.xag.h(r9, r0)
            goto L_0x007f
        L_0x0058:
            boolean r0 = r10 instanceof defpackage.fr8
            if (r0 == 0) goto L_0x007f
            fr8 r10 = (defpackage.fr8) r10
            long r0 = r10.a
            java.lang.String r10 = r10.v
            r9.o(r0, r10)
            goto L_0x007f
        L_0x0066:
            n7g r10 = r9.p0()
            boolean r10 = r10.a()
            if (r10 == 0) goto L_0x0078
            n7g r9 = r9.p0()
            r9.pause()
            goto L_0x007f
        L_0x0078:
            n7g r9 = r9.p0()
            r9.play()
        L_0x007f:
            return
        L_0x0080:
            kotlin.reflect.KProperty[] r9 = one.me.mediapicker.permissions.MediaPickerPermissionWidget.o
            one.me.mediapicker.permissions.MediaPickerPermissionWidget r4 = (one.me.mediapicker.permissions.MediaPickerPermissionWidget) r4
            kotlin.Lazy r9 = r4.c
            java.lang.Object r9 = r9.getValue()
            edb r9 = (defpackage.edb) r9
            java.lang.String[] r10 = defpackage.edb.l
            boolean r9 = r9.b(r10)
            kotlin.Lazy r10 = r4.c
            if (r9 == 0) goto L_0x00a9
            java.lang.Object r9 = r10.getValue()
            edb r9 = (defpackage.edb) r9
            eng r10 = new eng
            r10.<init>(r4, r3)
            java.lang.String[] r0 = defpackage.edb.m
            r1 = 157(0x9d, float:2.2E-43)
            r9.f(r10, r0, r1)
            goto L_0x00bb
        L_0x00a9:
            java.lang.Object r9 = r10.getValue()
            edb r9 = (defpackage.edb) r9
            eng r10 = new eng
            r10.<init>(r4, r3)
            java.lang.String[] r0 = defpackage.edb.n
            r1 = 162(0xa2, float:2.27E-43)
            r9.f(r10, r0, r1)
        L_0x00bb:
            return
        L_0x00bc:
            kotlin.reflect.KProperty[] r9 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            one.me.chatscreen.mediabar.MediaBarWidget r4 = (one.me.chatscreen.mediabar.MediaBarWidget) r4
            om6 r9 = r4.k0()
            dm6 r10 = defpackage.dm6.a
            s85 r9 = r9.o
            defpackage.xag.h(r9, r10)
            return
        L_0x00cc:
            ok8 r4 = (defpackage.ok8) r4
            r4.l(r1, r3)
            ru.ok.messages.actions.ExtraActionsView r9 = r4.O0
            android.animation.ValueAnimator r10 = r9.w
            if (r10 != 0) goto L_0x00da
            r9.l(r1, r3)
        L_0x00da:
            return
        L_0x00db:
            ik8 r4 = (defpackage.ik8) r4
            hk8 r9 = r4.E0
            if (r9 != 0) goto L_0x00e2
            goto L_0x0106
        L_0x00e2:
            uqd r10 = r4.J0
            if (r10 != 0) goto L_0x00e7
            goto L_0x0106
        L_0x00e7:
            com.facebook.drawee.view.SimpleDraweeView r0 = r4.K0
            lv4 r2 = r0.getHierarchy()
            sp6 r2 = (defpackage.sp6) r2
            if (r2 == 0) goto L_0x00f7
            b9d r2 = r2.c
            if (r2 == 0) goto L_0x00f7
            float[] r1 = r2.c
        L_0x00f7:
            int r2 = r4.q()
            ru.ok.messages.media.mediabar.MediaBarPreviewLayout r9 = (ru.ok.messages.media.mediabar.MediaBarPreviewLayout) r9
            fk8 r9 = r9.R0
            if (r9 == 0) goto L_0x0106
            d48 r10 = r10.a
            r9.q(r10, r0, r2, r1)
        L_0x0106:
            return
        L_0x0107:
            com.google.android.material.datepicker.MaterialDatePicker r4 = (com.google.android.material.datepicker.MaterialDatePicker) r4
            r4.Z2()
            throw r1
        L_0x010d:
            ts7 r4 = (defpackage.ts7) r4
            androidx.appcompat.widget.SwitchCompat r9 = r4.F0
            boolean r10 = r9.isChecked()
            r10 = r10 ^ r3
            r9.setChecked(r10)
            return
        L_0x011a:
            kotlin.reflect.KProperty[] r9 = one.me.android.join.JoinChatWidget.v0
            one.me.android.join.JoinChatWidget r4 = (one.me.android.join.JoinChatWidget) r4
            r4.i0(r3)
            hn r9 = r4.requireActivity()
            boolean r9 = r9 instanceof defpackage.t7d
            r9 = r9 ^ r3
            if (r9 == 0) goto L_0x0132
            hn r9 = r4.requireActivity()
            r9.finish()
            goto L_0x0139
        L_0x0132:
            e9d r9 = r4.getRouter()
            r9.C()
        L_0x0139:
            return
        L_0x013a:
            kotlin.reflect.KProperty[] r9 = one.me.inviteactions.invitebyqr.InviteByQrBottomSheet.C0
            one.me.inviteactions.invitebyqr.InviteByQrBottomSheet r4 = (one.me.inviteactions.invitebyqr.InviteByQrBottomSheet) r4
            r4.getClass()
            kotlin.reflect.KProperty[] r9 = one.me.inviteactions.invitebyqr.InviteByQrBottomSheet.C0
            r10 = r9[r0]
            wie r2 = r4.B0
            java.lang.Object r10 = r2.getValue(r4, r10)
            pm7 r10 = (defpackage.pm7) r10
            if (r10 == 0) goto L_0x0156
            boolean r10 = r10.isActive()
            if (r10 != r3) goto L_0x0156
            goto L_0x016a
        L_0x0156:
            tu7 r10 = r4.getViewLifecycleScope()
            f14 r5 = defpackage.f14.b
            zk7 r6 = new zk7
            r6.<init>(r4, r1)
            aje r10 = defpackage.ev0.v(r10, r1, r5, r6, r3)
            r9 = r9[r0]
            r2.setValue(r4, r9, r10)
        L_0x016a:
            return
        L_0x016b:
            kotlin.reflect.KProperty[] r9 = one.me.inviteactions.invitebyphone.InviteByPhoneScreen.z0
            one.me.inviteactions.invitebyphone.InviteByPhoneScreen r4 = (one.me.inviteactions.invitebyphone.InviteByPhoneScreen) r4
            xk7 r9 = r4.f0()
            zwa r10 = r4.e0()
            java.lang.String r10 = r10.getCode()
            zwa r0 = r4.e0()
            java.lang.String r0 = r0.getPhoneWithoutCode()
            jx3 r5 = r9.a
            kotlin.Lazy r6 = r9.w
            java.lang.Object r6 = r6.getValue()
            gaf r6 = (defpackage.gaf) r6
            osa r6 = (defpackage.osa) r6
            q04 r6 = r6.b()
            f14 r7 = defpackage.f14.b
            uk7 r8 = new uk7
            r8.<init>(r9, r10, r0, r1)
            abg r10 = r9.b
            pm7 r10 = r10.a(r5, r6, r7, r8)
            aje r10 = (defpackage.aje) r10
            kotlin.reflect.KProperty[] r0 = defpackage.xk7.z0
            r0 = r0[r2]
            wie r1 = r9.Z
            r1.setValue(r9, r0, r10)
            androidx.appcompat.widget.AppCompatTextView r9 = r4.Y
            if (r9 == 0) goto L_0x01b6
            int r9 = r9.getVisibility()
            if (r9 != 0) goto L_0x01b6
            r2 = r3
        L_0x01b6:
            r9 = r2 ^ 1
            one.me.sdk.uikit.common.button.OneMeButton r10 = r4.d0()
            r10.setProgressEnabled(r9)
            r10.setClickable(r2)
            return
        L_0x01c3:
            kotlin.reflect.KProperty[] r9 = one.me.login.inputphone.InputPhoneScreen.D0
            one.me.login.inputphone.InputPhoneScreen r4 = (one.me.login.inputphone.InputPhoneScreen) r4
            rh7 r9 = r4.g0()
            zwa r10 = r4.f0()
            java.lang.String r10 = r10.getCode()
            zwa r0 = r4.f0()
            java.lang.String r0 = r0.getPhoneWithoutCode()
            jx3 r5 = r9.a
            kotlin.Lazy r6 = r9.o
            java.lang.Object r6 = r6.getValue()
            gaf r6 = (defpackage.gaf) r6
            osa r6 = (defpackage.osa) r6
            q04 r6 = r6.b()
            f14 r7 = defpackage.f14.b
            jh7 r8 = new jh7
            r8.<init>(r10, r0, r9, r1)
            abg r10 = r9.b
            pm7 r10 = r10.a(r5, r6, r7, r8)
            aje r10 = (defpackage.aje) r10
            kotlin.reflect.KProperty[] r0 = defpackage.rh7.B0
            r0 = r0[r2]
            wie r1 = r9.Z
            r1.setValue(r9, r0, r10)
            androidx.appcompat.widget.AppCompatTextView r9 = r4.v0
            if (r9 == 0) goto L_0x020e
            int r9 = r9.getVisibility()
            if (r9 != 0) goto L_0x020e
            r2 = r3
        L_0x020e:
            r9 = r2 ^ 1
            one.me.sdk.uikit.common.button.OneMeButton r10 = r4.e0()
            r10.setProgressEnabled(r9)
            r10.setClickable(r2)
            return
        L_0x021b:
            cn6 r4 = (defpackage.cn6) r4
            gp6 r9 = r4.D0
            int r10 = r4.q()
            ql6 r0 = r9.b
            boolean r0 = r0.a
            if (r0 == 0) goto L_0x022a
            int r10 = r10 - r3
        L_0x022a:
            if (r10 >= 0) goto L_0x022d
            goto L_0x0246
        L_0x022d:
            xme r0 = r9.Z
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r10 = kotlin.collections.CollectionsKt.getOrNull(r0, r10)
            tm6 r10 = (defpackage.tm6) r10
            if (r10 != 0) goto L_0x023e
            goto L_0x0246
        L_0x023e:
            k48 r0 = r10.c
            int r2 = r9.n(r0, r3)
            r10.h = r2
        L_0x0246:
            one.me.sdk.gallery.view.NumericCheckButton r9 = r4.E0
            if (r9 == 0) goto L_0x024d
            r9.setNumber(r2)
        L_0x024d:
            return
        L_0x024e:
            bn6 r4 = (defpackage.bn6) r4
            ru.ok.messages.gallery.GalleryViewModel r9 = r4.D0
            int r10 = r4.q()
            pl6 r0 = r9.m
            boolean r0 = r0.b
            if (r0 == 0) goto L_0x025d
            int r10 = r10 - r3
        L_0x025d:
            if (r10 >= 0) goto L_0x0260
            goto L_0x027a
        L_0x0260:
            java.util.List r0 = r9.m()
            java.lang.Object r10 = kotlin.collections.CollectionsKt.getOrNull(r0, r10)
            boolean r0 = r10 instanceof defpackage.sm6
            if (r0 == 0) goto L_0x026f
            r1 = r10
            sm6 r1 = (defpackage.sm6) r1
        L_0x026f:
            if (r1 != 0) goto L_0x0272
            goto L_0x027a
        L_0x0272:
            k48 r10 = r1.b
            int r2 = r9.s(r10, r2, r3)
            r1.c = r2
        L_0x027a:
            ru.ok.messages.media.mediabar.NumericCheckButton r9 = r4.E0
            if (r9 == 0) goto L_0x0281
            r9.setNumber(r2)
        L_0x0281:
            return
        L_0x0282:
            ru.ok.messages.gallery.GalleryFragment r4 = (ru.ok.messages.gallery.GalleryFragment) r4
            ru.ok.messages.gallery.GalleryViewModel r9 = r4.k3()
            qm6 r10 = defpackage.qm6.b
            r9.r(r2, r10)
            return
        L_0x028e:
            ru.ok.messages.media.mediabar.FrgLocalGif r4 = (ru.ok.messages.media.mediabar.FrgLocalGif) r4
            r4.e()
            return
        L_0x0294:
            ru.ok.messages.contacts.picker.FrgContactMultiPicker r4 = (ru.ok.messages.contacts.picker.FrgContactMultiPicker) r4
            java.util.HashSet r9 = r4.H1
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x02b5
            java.util.List r9 = java.util.Collections.emptyList()
            r4.l3(r9)
            id3 r9 = defpackage.ym.e()
            qra r9 = (defpackage.qra) r9
            nd r9 = r9.c()
            java.lang.String r10 = "ACTION_CREATE_CHAT_WITHOUT_MEMBERS"
            r9.e(r10)
            goto L_0x02c3
        L_0x02b5:
            java.util.List r9 = r4.I1
            tg6 r10 = new tg6
            r10.<init>(r4)
            java.util.List r9 = defpackage.cjf.q(r9, r10)
            r4.l3(r9)
        L_0x02c3:
            return
        L_0x02c4:
            ru.ok.messages.channels.FrgChatMembers r4 = (ru.ok.messages.channels.FrgChatMembers) r4
            androidx.fragment.app.b r9 = r4.M1()
            if (r9 == 0) goto L_0x02cf
            r9.finish()
        L_0x02cf:
            return
        L_0x02d0:
            int r9 = one.me.settings.privacy.ui.ForgotPinCodeDialog.w0
            one.me.settings.privacy.ui.ForgotPinCodeDialog r4 = (one.me.settings.privacy.ui.ForgotPinCodeDialog) r4
            r4.getClass()
            kotlin.reflect.KProperty[] r9 = one.me.sdk.bottomsheet.BottomSheetWidget.v0
            r9 = r9[r2]
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            is r10 = r4.Y
            r10.b(r4, r9)
            r6 r9 = new r6
            r10 = 12
            r9.<init>(r10, r4)
            e3e r10 = defpackage.e3e.a
            q4 r10 = r10.getAccessor()
            java.lang.Class<bud> r0 = defpackage.bud.class
            kotlin.Lazy r10 = r10.h(r0)
            java.lang.Object r10 = r10.getValue()
            bud r10 = (defpackage.bud) r10
            akd r10 = (defpackage.akd) r10
            r10.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r0 = ru.ok.tamtam.android.prefs.PmsKey.f110supportaccount
            java.lang.String r1 = "max.ru/support"
            java.lang.String r10 = r10.u(r0, r1)
            defpackage.ev0.z(r4, r10, r9)
            return
        L_0x030c:
            int r9 = one.me.appupdate.forceupdate.ForceUpdateScreen.o
            one.me.appupdate.forceupdate.ForceUpdateScreen r4 = (one.me.appupdate.forceupdate.ForceUpdateScreen) r4
            android.app.Activity r9 = r4.getActivity()
            if (r9 == 0) goto L_0x03b1
            sq r10 = r4.b
            vq r10 = (defpackage.vq) r10
            r10.getClass()
            h2g r1 = defpackage.h2g.a
            q4 r1 = r1.getAccessor()
            java.lang.Class<cxe> r3 = defpackage.cxe.class
            java.lang.Object r1 = r1.g(r3)
            cxe r1 = (defpackage.cxe) r1
            xt6 r1 = (defpackage.xt6) r1
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x033e
            rq r10 = defpackage.sq.a
            r10.getClass()
            java.lang.String r10 = defpackage.rq.b
            defpackage.kw3.b(r9, r10)
            goto L_0x03b1
        L_0x033e:
            p3h r10 = r10.b
            android.content.Context r1 = r10.b
            java.lang.String r1 = r1.getPackageName()
            kn5 r3 = defpackage.a7h.e
            a7h r10 = r10.a
            x7h r4 = r10.a
            if (r4 != 0) goto L_0x0376
            r10 = -9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r4 = 6
            java.lang.String r5 = "PlayCore"
            boolean r4 = android.util.Log.isLoggable(r5, r4)
            if (r4 == 0) goto L_0x0369
            java.lang.String r3 = r3.a
            java.lang.String r4 = "onError(%d)"
            defpackage.kn5.e(r3, r4, r1)
            goto L_0x036c
        L_0x0369:
            r3.getClass()
        L_0x036c:
            com.google.android.play.core.install.InstallException r1 = new com.google.android.play.core.install.InstallException
            r1.<init>(r10)
            s7h r10 = defpackage.hsg.n(r1)
            goto L_0x0397
        L_0x0376:
            java.lang.Object[] r5 = new java.lang.Object[]{r1}
            java.lang.String r6 = "requestUpdateInfo(%s)"
            r3.d(r6, r5)
            qdf r3 = new qdf
            r3.<init>()
            u5h r5 = new u5h
            r5.<init>((defpackage.a7h) r10, (defpackage.qdf) r3, (java.lang.String) r1, (defpackage.qdf) r3)
            u5h r10 = new u5h
            r10.<init>((defpackage.x7h) r4, (defpackage.qdf) r3, (defpackage.qdf) r3, (defpackage.u5h) r5)
            android.os.Handler r1 = r4.a()
            r1.post(r10)
            s7h r10 = r3.a
        L_0x0397:
            tq r1 = new tq
            r1.<init>(r9, r2)
            uq r3 = new uq
            r3.<init>(r2, r1)
            r10.getClass()
            k40 r1 = defpackage.xdf.a
            r10.d(r1, r3)
            d9d r2 = new d9d
            r2.<init>(r0, r9)
            r10.c(r1, r2)
        L_0x03b1:
            return
        L_0x03b2:
            c66 r4 = (defpackage.c66) r4
            java.lang.Object r9 = r4.E0
            kotlin.jvm.functions.Function0 r9 = (kotlin.jvm.functions.Function0) r9
            r9.invoke()
            return
        L_0x03bc:
            kotlin.reflect.KProperty[] r9 = one.me.folders.edit.FolderEditScreen.y
            int r9 = defpackage.gua.d
            one.me.folders.edit.FolderEditScreen r4 = (one.me.folders.edit.FolderEditScreen) r4
            r4.g(r9, r1)
            return
        L_0x03c6:
            my5 r4 = (defpackage.my5) r4
            one.me.folders.edit.FolderEditScreen r4 = (one.me.folders.edit.FolderEditScreen) r4
            m06 r9 = r4.d0()
            ry5 r10 = defpackage.ry5.a
            s85 r9 = r9.x0
            defpackage.xag.h(r9, r10)
            return
        L_0x03d6:
            j15 r4 = (defpackage.j15) r4
            r4.getClass()
            java.lang.Object r9 = r10.getTag()
            e15 r9 = (defpackage.e15) r9
            r4.E()
            h15 r10 = r4.o
            if (r10 != 0) goto L_0x03e9
            goto L_0x03ec
        L_0x03e9:
            r10.d(r9)
        L_0x03ec:
            return
        L_0x03ed:
            kx4 r4 = (defpackage.kx4) r4
            r4.u()
            return
        L_0x03f3:
            xn4 r4 = (defpackage.xn4) r4
            kotlin.jvm.functions.Function0 r9 = r4.a
            r9.invoke()
            return
        L_0x03fb:
            one.me.sdk.contextmenu.popup.ContextMenuPopupWindow r4 = (one.me.sdk.contextmenu.popup.ContextMenuPopupWindow) r4
            r4.dismiss()
            return
        L_0x0401:
            uw3 r4 = (defpackage.uw3) r4
            kotlin.jvm.functions.Function0 r9 = r4.D0
            r9.invoke()
            return
        L_0x0409:
            tw3 r4 = (defpackage.tw3) r4
            kotlin.jvm.functions.Function0 r9 = r4.D0
            r9.invoke()
            return
        L_0x0411:
            yu3 r4 = (defpackage.yu3) r4
            r4.getClass()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xu3.onClick(android.view.View):void");
    }

    public /* synthetic */ xu3(yu3 yu3, qs3 qs3) {
        this.a = 0;
        this.b = yu3;
    }
}
