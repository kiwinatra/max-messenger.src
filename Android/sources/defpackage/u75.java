package defpackage;

import kotlin.jvm.functions.Function0;

/* renamed from: u75  reason: default package */
public final /* synthetic */ class u75 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u75(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v127, resolved type: t75} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r1v13, types: [androidx.appcompat.widget.AppCompatImageButton, android.view.View, java.lang.Object, f26] */
    /* JADX WARNING: type inference failed for: r4v16, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v24, types: [e9d] */
    /* JADX WARNING: type inference failed for: r4v26 */
    /* JADX WARNING: type inference failed for: r4v27 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r19 = this;
            r0 = r19
            r1 = 16
            r2 = 2
            r3 = 0
            r4 = 0
            r5 = 1
            java.lang.Object r6 = r0.b
            int r0 = r0.a
            switch(r0) {
                case 0: goto L_0x04f4;
                case 1: goto L_0x04ed;
                case 2: goto L_0x04c5;
                case 3: goto L_0x0457;
                case 4: goto L_0x044f;
                case 5: goto L_0x0447;
                case 6: goto L_0x0420;
                case 7: goto L_0x040c;
                case 8: goto L_0x03b5;
                case 9: goto L_0x0343;
                case 10: goto L_0x0332;
                case 11: goto L_0x031e;
                case 12: goto L_0x0288;
                case 13: goto L_0x0255;
                case 14: goto L_0x023a;
                case 15: goto L_0x01f4;
                case 16: goto L_0x01e8;
                case 17: goto L_0x01dc;
                case 18: goto L_0x01d4;
                case 19: goto L_0x01ca;
                case 20: goto L_0x01c3;
                case 21: goto L_0x01a8;
                case 22: goto L_0x01a0;
                case 23: goto L_0x0197;
                case 24: goto L_0x00d1;
                case 25: goto L_0x00c2;
                case 26: goto L_0x006f;
                case 27: goto L_0x004e;
                case 28: goto L_0x0035;
                default: goto L_0x000f;
            }
        L_0x000f:
            zb8 r0 = defpackage.zb8.b
            kx7 r6 = (defpackage.kx7) r6
            gx7 r6 = (defpackage.gx7) r6
            java.lang.String r1 = r6.a
            ta4 r0 = r0.W0()
            zqd r2 = new zqd
            r3 = 9
            r2.<init>((int) r3)
            java.lang.String r3 = ":call-join-preview"
            r2.b = r3
            java.lang.String r3 = "link"
            r2.z(r1, r3)
            android.net.Uri r1 = r2.p()
            r0.c(r1, r4)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0035:
            kotlin.reflect.KProperty[] r0 = one.me.android.join.JoinChatWidget.v0
            do7 r0 = new do7
            one.me.android.join.JoinChatWidget r6 = (one.me.android.join.JoinChatWidget) r6
            r6.getClass()
            kotlin.reflect.KProperty[] r1 = one.me.android.join.JoinChatWidget.v0
            r1 = r1[r5]
            is r1 = r6.y
            java.lang.Object r1 = r1.a(r6)
            java.lang.String r1 = (java.lang.String) r1
            r0.<init>(r1)
            return r0
        L_0x004e:
            kotlin.reflect.KProperty[] r0 = one.me.inviteactions.invitebyqr.InviteByQrBottomSheet.C0
            e0b r0 = new e0b
            one.me.inviteactions.invitebyqr.InviteByQrBottomSheet r6 = (one.me.inviteactions.invitebyqr.InviteByQrBottomSheet) r6
            r0.<init>((one.me.sdk.arch.Widget) r6)
            android.content.Context r1 = r6.getContext()
            int r2 = defpackage.ead.f
            java.lang.String r1 = r1.getString(r2)
            r0.i(r1)
            o0b r1 = new o0b
            int r2 = defpackage.cad.K
            r1.<init>(r2)
            r0.f(r1)
            return r0
        L_0x006f:
            kotlin.reflect.KProperty[] r0 = one.me.inviteactions.invitebyphone.InviteByPhoneScreen.z0
            kotlin.reflect.KProperty[] r0 = one.me.sdk.bottomsheet.BottomSheetWidget.v0
            one.me.sdk.phoneutils.SelectCountryBottomSheet r8 = new one.me.sdk.phoneutils.SelectCountryBottomSheet
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.String r1 = "is_narnia_available"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r1, r0)
            kotlin.Pair[] r0 = new kotlin.Pair[]{r0}
            android.os.Bundle r0 = defpackage.o54.f(r0)
            r8.<init>(r0)
            one.me.inviteactions.invitebyphone.InviteByPhoneScreen r6 = (one.me.inviteactions.invitebyphone.InviteByPhoneScreen) r6
            r8.setTargetController(r6)
            r0 = r6
        L_0x008e:
            zx3 r1 = r0.getParentController()
            if (r1 == 0) goto L_0x0099
            zx3 r0 = r0.getParentController()
            goto L_0x008e
        L_0x0099:
            boolean r1 = r0 instanceof defpackage.l9d
            if (r1 == 0) goto L_0x00a0
            l9d r0 = (defpackage.l9d) r0
            goto L_0x00a1
        L_0x00a0:
            r0 = r4
        L_0x00a1:
            if (r0 == 0) goto L_0x00a7
            e9d r4 = r0.K()
        L_0x00a7:
            r8.p0(r6)
            if (r4 == 0) goto L_0x00bf
            i9d r0 = new i9d
            r10 = 0
            r13 = -1
            r9 = 0
            r11 = 0
            r12 = 0
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
            java.lang.String r1 = "BottomSheetWidget"
            defpackage.a81.t(r3, r0, r5, r1)
            r4.G(r0)
        L_0x00bf:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00c2:
            java.lang.String r0 = defpackage.yd7.C0
            java.lang.String r1 = "ManualGalleryContentObserver: on content changed"
            defpackage.z68.c(r0, r1, new java.lang.Object[0])
            yd7 r6 = (defpackage.yd7) r6
            r6.f()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00d1:
            tc7 r6 = (defpackage.tc7) r6
            bc3 r0 = r6.a
            if (r0 != 0) goto L_0x00d9
            goto L_0x0194
        L_0x00d9:
            h0h r1 = r6.b
            if (r1 != 0) goto L_0x00df
            goto L_0x0194
        L_0x00df:
            boolean r7 = r0.isDestroyed()
            if (r7 != 0) goto L_0x018b
            boolean r7 = r0.isFinishing()
            if (r7 == 0) goto L_0x00ed
            goto L_0x018b
        L_0x00ed:
            f5d r7 = r6.c
            if (r7 != 0) goto L_0x00fc
            o9a r0 = r6.d
            if (r0 == 0) goto L_0x0194
            xc7 r0 = defpackage.xc7.a
            defpackage.o9a.q()
            goto L_0x0194
        L_0x00fc:
            bc3 r8 = r6.a
            if (r8 != 0) goto L_0x0101
            goto L_0x011e
        L_0x0101:
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r9 = "com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE"
            r3.<init>(r9)
            java.lang.String r9 = "com.android.vending"
            r3.setPackage(r9)
            android.content.pm.PackageManager r8 = r8.getPackageManager()
            r9 = 128(0x80, float:1.794E-43)
            java.util.List r3 = r8.queryIntentServices(r3, r9)
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ r5
        L_0x011e:
            if (r3 != 0) goto L_0x012a
            o9a r0 = r6.d
            if (r0 == 0) goto L_0x0194
            xc7 r0 = defpackage.xc7.a
            defpackage.o9a.q()
            goto L_0x0194
        L_0x012a:
            bxg r7 = (defpackage.bxg) r7
            boolean r3 = r7.b
            if (r3 == 0) goto L_0x0135
            s7h r0 = defpackage.hsg.o(r4)
            goto L_0x016c
        L_0x0135:
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.google.android.play.core.common.PlayCoreDialogWrapperActivity> r4 = com.google.android.play.core.common.PlayCoreDialogWrapperActivity.class
            r3.<init>(r0, r4)
            java.lang.String r4 = "confirmation_intent"
            android.app.PendingIntent r7 = r7.a
            r3.putExtra(r4, r7)
            android.view.Window r4 = r0.getWindow()
            android.view.View r4 = r4.getDecorView()
            int r4 = r4.getWindowSystemUiVisibility()
            java.lang.String r7 = "window_flags"
            r3.putExtra(r7, r4)
            qdf r4 = new qdf
            r4.<init>()
            java.lang.Object r1 = r1.c
            android.os.Handler r1 = (android.os.Handler) r1
            so8 r7 = new so8
            r7.<init>(r2, r1, r4)
            java.lang.String r1 = "result_receiver"
            r3.putExtra(r1, r7)
            r0.startActivity(r3)
            s7h r0 = r4.a
        L_0x016c:
            sc7 r1 = new sc7
            r1.<init>(r6, r5)
            r0.getClass()
            k40 r3 = defpackage.xdf.a
            r0.c(r3, r1)
            sc7 r1 = new sc7
            r1.<init>(r6, r2)
            r0.a(r3, r1)
            sc7 r1 = new sc7
            r2 = 3
            r1.<init>(r6, r2)
            r0.i(r1)
            goto L_0x0194
        L_0x018b:
            o9a r0 = r6.d
            if (r0 == 0) goto L_0x0194
            xc7 r0 = defpackage.xc7.a
            defpackage.o9a.q()
        L_0x0194:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0197:
            zz6 r6 = (defpackage.zz6) r6
            ez6 r0 = r6.a
            dz6 r0 = r0.k()
            return r0
        L_0x01a0:
            vt6 r0 = new vt6
            wt6 r6 = (defpackage.wt6) r6
            r0.<init>(r6)
            return r0
        L_0x01a8:
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            ve8 r6 = (defpackage.ve8) r6
            kotlin.Lazy r1 = r6.a
            java.lang.Object r1 = r1.getValue()
            java.util.Locale r1 = (java.util.Locale) r1
            java.lang.String r2 = "yyyy-MM-dd'T'HH:mm:ss'Z'"
            r0.<init>(r2, r1)
            java.lang.String r1 = "UTC"
            java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r1)
            r0.setTimeZone(r1)
            return r0
        L_0x01c3:
            wp6 r6 = (defpackage.wp6) r6
            android.graphics.drawable.ShapeDrawable r0 = defpackage.wp6.a(r6)
            return r0
        L_0x01ca:
            kotlin.reflect.KProperty[] r0 = ru.ok.messages.gallery.GalleryViewModel.S
            hn6 r0 = new hn6
            ru.ok.messages.gallery.GalleryViewModel r6 = (ru.ok.messages.gallery.GalleryViewModel) r6
            r0.<init>(r5, r6)
            return r0
        L_0x01d4:
            hn6 r0 = new hn6
            gp6 r6 = (defpackage.gp6) r6
            r0.<init>(r3, r6)
            return r0
        L_0x01dc:
            ql6 r6 = (defpackage.ql6) r6
            boolean r0 = r6.b
            if (r0 == 0) goto L_0x01e5
            sk6 r0 = defpackage.sk6.a
            goto L_0x01e7
        L_0x01e5:
            rk6 r0 = defpackage.rk6.a
        L_0x01e7:
            return r0
        L_0x01e8:
            pl6 r6 = (defpackage.pl6) r6
            boolean r0 = r6.c
            if (r0 == 0) goto L_0x01f1
            sk6 r0 = defpackage.sk6.a
            goto L_0x01f3
        L_0x01f1:
            rk6 r0 = defpackage.rk6.a
        L_0x01f3:
            return r0
        L_0x01f4:
            ru.ok.messages.settings.FrgPrivacySettings r6 = (ru.ok.messages.settings.FrgPrivacySettings) r6
            r6.getClass()
            int r0 = defpackage.qad.S7
            r6.f3(r0, r5)
            dm4 r0 = r6.p1
            java.lang.Object r0 = r0.b
            id3 r0 = (defpackage.id3) r0
            qra r0 = (defpackage.qra) r0
            f8f r0 = r0.E()
            java.lang.String r0 = r0.g()
            sjd r1 = r6.q1
            rl r1 = r1.d()
            boolean r2 = defpackage.cvg.A(r0)
            if (r2 != 0) goto L_0x021e
            java.util.List r4 = java.util.Collections.singletonList(r0)
        L_0x021e:
            jna r1 = (defpackage.jna) r1
            ua2 r0 = new ua2
            jtb r2 = r1.D()
            ltb r2 = (defpackage.ltb) r2
            a33 r2 = r2.a
            long r2 = r2.n()
            r0.<init>(r5, r2, r4)
            long r0 = defpackage.jna.z(r1, r0)
            r6.G1 = r0
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x023a:
            ru.ok.messages.settings.notification.FrgNotificationSettings r6 = (ru.ok.messages.settings.notification.FrgNotificationSettings) r6
            hq r0 = r6.H1
            r0.E()
            sjd r0 = r6.q1
            rl r0 = r0.d()
            r0.getClass()
            jna r0 = (defpackage.jna) r0
            r0.w(r4, r5)
            r6.k3()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0255:
            ru.ok.messages.views.fragments.FrgContactSearchProfile r6 = (ru.ok.messages.views.fragments.FrgContactSearchProfile) r6
            cs3 r0 = r6.X1
            fo3 r0 = r0.a
            long r0 = r0.a
            id3 r2 = defpackage.ym.e()
            qra r2 = (defpackage.qra) r2
            nd r2 = r2.c()
            java.lang.String r4 = "CONTACTS_SEARCH_PROFILE_REMOVE_CONTACT"
            r2.e(r4)
            sjd r2 = r6.q1
            km3 r2 = r2.i()
            r2.y(r0)
            androidx.fragment.app.b r0 = r6.M1()
            int r1 = defpackage.qad.Z1
            java.lang.String r1 = r6.S1(r1)
            defpackage.hi7.b0(r3, r0, r1)
            r6.D3()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0288:
            ru.ok.messages.views.fragments.FrgContactProfile r6 = (ru.ok.messages.views.fragments.FrgContactProfile) r6
            sjd r0 = r6.q1
            km3 r0 = r0.i()
            vk3 r1 = r6.W1
            long r1 = r1.r()
            sjd r4 = r6.q1
            r62 r4 = r4.g()
            r0.getClass()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "block, id = "
            r5.<init>(r7)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r7 = "km3"
            defpackage.z68.c(r7, r5, new java.lang.Object[0])
            sm3 r5 = defpackage.sm3.a
            r0.g(r1, r5)
            hs7 r5 = r0.i
            java.lang.Object r5 = r5.get()
            rl r5 = (defpackage.rl) r5
            jna r5 = (defpackage.jna) r5
            ts3 r15 = new ts3
            jtb r7 = r5.D()
            ltb r7 = (defpackage.ltb) r7
            a33 r7 = r7.a
            long r9 = r7.n()
            r16 = 0
            r17 = 0
            r8 = 1
            r13 = 0
            r14 = 0
            r7 = r15
            r11 = r1
            r18 = r15
            r15 = r16
            r16 = r17
            r7.<init>(r8, r9, r11, r13, r14, r15, r16)
            ocf r5 = r5.E()
            r7 = 12
            r8 = r18
            defpackage.ocf.d(r5, r8, r3, r3, r7)
            k72 r5 = defpackage.k72.v
            r4.m(r1, r5)
            hs7 r4 = r0.m
            java.lang.Object r4 = r4.get()
            uu3 r4 = (defpackage.uu3) r4
            java.lang.Long r5 = java.lang.Long.valueOf(r1)
            java.util.List r5 = java.util.Collections.singletonList(r5)
            r4.b(r5)
            zu3 r4 = new zu3
            r4.<init>((long) r1)
            sv0 r0 = r0.g
            r0.c(r4)
            androidx.fragment.app.b r0 = r6.M1()
            int r1 = defpackage.qad.I
            java.lang.String r1 = r6.S1(r1)
            defpackage.hi7.b0(r3, r0, r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x031e:
            ea7 r0 = new ea7
            ie6 r6 = (defpackage.ie6) r6
            kotlin.Lazy r1 = r6.e
            java.lang.Object r1 = r1.getValue()
            da7 r1 = (defpackage.da7) r1
            r0.<init>(r1)
            ba7 r0 = r0.f()
            return r0
        L_0x0332:
            ru.ok.tamtam.upload.workers.ForegroundWorker r6 = (ru.ok.tamtam.upload.workers.ForegroundWorker) r6
            z9f r0 = r6.getTamComponent()
            sjd r0 = (defpackage.sjd) r0
            jtb r0 = r0.u()
            ltb r0 = (defpackage.ltb) r0
            cud r0 = r0.b
            return r0
        L_0x0343:
            ru.ok.messages.settings.folders.picker.FoldersPickerFragment r6 = (ru.ok.messages.settings.folders.picker.FoldersPickerFragment) r6
            m86 r0 = r6.B1
            android.os.Bundle r1 = r6.F2()
            java.lang.String r2 = "folders.picker.mode"
            android.os.Parcelable r1 = r1.getParcelable(r2)
            r3 = r1
            ss9 r3 = (defpackage.ss9) r3
            b33 r0 = r0.a
            java.lang.Object r1 = r0.a
            javax.inject.Provider r1 = (javax.inject.Provider) r1
            java.lang.Object r1 = r1.get()
            r4 = r1
            j16 r4 = (defpackage.j16) r4
            java.lang.Object r1 = r0.b
            javax.inject.Provider r1 = (javax.inject.Provider) r1
            java.lang.Object r1 = r1.get()
            r5 = r1
            my6 r5 = (defpackage.my6) r5
            java.lang.Object r1 = r0.c
            javax.inject.Provider r1 = (javax.inject.Provider) r1
            java.lang.Object r1 = r1.get()
            r6 = r1
            r62 r6 = (defpackage.r62) r6
            java.lang.Object r1 = r0.o
            javax.inject.Provider r1 = (javax.inject.Provider) r1
            java.lang.Object r1 = r1.get()
            r7 = r1
            tld r7 = (defpackage.tld) r7
            java.lang.Object r1 = r0.v
            javax.inject.Provider r1 = (javax.inject.Provider) r1
            java.lang.Object r1 = r1.get()
            r8 = r1
            u82 r8 = (defpackage.u82) r8
            java.lang.Object r1 = r0.w
            javax.inject.Provider r1 = (javax.inject.Provider) r1
            java.lang.Object r1 = r1.get()
            r9 = r1
            jua r9 = (defpackage.jua) r9
            java.lang.Object r1 = r0.x
            javax.inject.Provider r1 = (javax.inject.Provider) r1
            java.lang.Object r1 = r1.get()
            r10 = r1
            nd r10 = (defpackage.nd) r10
            java.lang.Object r0 = r0.y
            javax.inject.Provider r0 = (javax.inject.Provider) r0
            java.lang.Object r0 = r0.get()
            r11 = r0
            gaf r11 = (defpackage.gaf) r11
            ru.ok.messages.settings.folders.picker.FoldersPickerViewModel r0 = new ru.ok.messages.settings.folders.picker.FoldersPickerViewModel
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        L_0x03b5:
            g26 r6 = (defpackage.g26) r6
            android.view.View r0 = r6.a
            android.content.Context r0 = r0.getContext()
            f26 r1 = new f26
            r1.<init>(r0, r4)
            gmf r0 = new gmf
            r2 = 48
            float r2 = (float) r2
            android.content.res.Resources r3 = defpackage.vo4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r3 = r3 * r2
            int r3 = kotlin.math.MathKt.roundToInt((float) r3)
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r2 = r2 * r4
            int r2 = kotlin.math.MathKt.roundToInt((float) r2)
            r0.<init>(r3, r2)
            r2 = 8388613(0x800005, float:1.175495E-38)
            r0.a = r2
            r1.setLayoutParams(r0)
            int r0 = defpackage.nad.U0
            r1.setImageResource(r0)
            boolean r0 = r1.isInEditMode()
            if (r0 == 0) goto L_0x03fe
            vi4 r0 = defpackage.vi4.f0
            goto L_0x0408
        L_0x03fe:
            android.content.Context r0 = r1.getContext()
            kotlin.Lazy r2 = defpackage.scf.b0
            scf r0 = defpackage.j4b.k0(r0)
        L_0x0408:
            r1.L0(r0)
            return r1
        L_0x040c:
            kotlin.reflect.KProperty[] r0 = one.me.folders.picker.FolderMemberPickerScreen.v0
            int r0 = defpackage.pq7.a
            int r0 = defpackage.pq7.c
            boolean r0 = defpackage.pq7.b(r0)
            if (r0 == 0) goto L_0x041d
            one.me.folders.picker.FolderMemberPickerScreen r6 = (one.me.folders.picker.FolderMemberPickerScreen) r6
            defpackage.kr7.z(r6)
        L_0x041d:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0420:
            kotlin.reflect.KProperty[] r0 = one.me.folders.edit.FolderEditScreen.y
            m06 r0 = new m06
            one.me.folders.edit.FolderEditScreen r6 = (one.me.folders.edit.FolderEditScreen) r6
            r6.getClass()
            kotlin.reflect.KProperty[] r1 = one.me.folders.edit.FolderEditScreen.y
            r2 = r1[r3]
            is r2 = r6.b
            java.lang.Object r2 = r2.a(r6)
            java.lang.String r2 = (java.lang.String) r2
            r1 = r1[r5]
            is r1 = r6.c
            java.lang.Object r1 = r1.a(r6)
            java.lang.Number r1 = (java.lang.Number) r1
            long r3 = r1.longValue()
            r0.<init>(r2, r3)
            return r0
        L_0x0447:
            tr5 r0 = new tr5
            ur5 r6 = (defpackage.ur5) r6
            r0.<init>(r6)
            return r0
        L_0x044f:
            gn5 r0 = new gn5
            hn5 r6 = (defpackage.hn5) r6
            r0.<init>(r6)
            return r0
        L_0x0457:
            java.util.List r6 = (java.util.List) r6
            r0 = r6
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.sequences.Sequence r0 = kotlin.collections.CollectionsKt.asSequence(r0)
            of3 r2 = new of3
            r3 = 15
            r2.<init>(r3)
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.filter(r0, r2)
            of3 r2 = new of3
            r2.<init>(r1)
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.map(r0, r2)
            java.util.Set r0 = kotlin.sequences.SequencesKt.toSet(r0)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r3 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r0, 10)
            int r3 = kotlin.collections.MapsKt.mapCapacity(r3)
            int r1 = kotlin.ranges.RangesKt.coerceAtLeast((int) r3, (int) r1)
            r2.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x048d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x04c4
            java.lang.Object r1 = r0.next()
            r3 = r1
            java.lang.Number r3 = (java.lang.Number) r3
            long r3 = r3.longValue()
            int r5 = r6.size()
            java.util.ListIterator r5 = r6.listIterator(r5)
        L_0x04a6:
            boolean r7 = r5.hasPrevious()
            if (r7 == 0) goto L_0x04bc
            java.lang.Object r7 = r5.previous()
            mj5 r7 = (defpackage.mj5) r7
            long r8 = r7.f
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x04a6
            r2.put(r1, r7)
            goto L_0x048d
        L_0x04bc:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "List contains no element matching the predicate."
            r0.<init>(r1)
            throw r0
        L_0x04c4:
            return r2
        L_0x04c5:
            kotlin.reflect.KProperty[] r0 = one.me.inappreview.ui.FakeInAppReviewBottomSheet.F0
            js9 r0 = defpackage.fu4.k
            one.me.inappreview.ui.FakeInAppReviewBottomSheet r6 = (one.me.inappreview.ui.FakeInAppReviewBottomSheet) r6
            android.content.Context r1 = r6.getContext()
            fu4 r0 = r0.e(r1)
            k2b r0 = r0.f()
            ene r0 = r0.b()
            dne r0 = r0.a
            int r0 = r0.b
            android.graphics.drawable.ShapeDrawable r1 = r6.A0
            android.graphics.drawable.ShapeDrawable r2 = r6.y0
            android.graphics.drawable.RippleDrawable r3 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r3.<init>(r0, r1, r2)
            return r3
        L_0x04ed:
            w28 r6 = (defpackage.w28) r6
            r6.c = r4
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x04f4:
            v75 r6 = (defpackage.v75) r6
            usd r0 = r6.b
            if (r0 != 0) goto L_0x0511
            t75 r0 = new t75
            java.lang.Enum[] r1 = r6.a
            int r2 = r1.length
            r0.<init>(r2)
            int r2 = r1.length
            r4 = r3
        L_0x0504:
            if (r4 >= r2) goto L_0x0511
            r6 = r1[r4]
            java.lang.String r6 = r6.name()
            r0.j(r6, r3)
            int r4 = r4 + r5
            goto L_0x0504
        L_0x0511:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u75.invoke():java.lang.Object");
    }
}
