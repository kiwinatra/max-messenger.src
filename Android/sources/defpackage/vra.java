package defpackage;

import kotlin.jvm.functions.Function0;

/* renamed from: vra  reason: default package */
public final /* synthetic */ class vra implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vra(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: java.util.Set} */
    /* JADX WARNING: type inference failed for: r12v0, types: [java.util.Set] */
    /* JADX WARNING: type inference failed for: r12v1 */
    /* JADX WARNING: type inference failed for: r7v2, types: [java.util.Set] */
    /* JADX WARNING: type inference failed for: r3v46, types: [w7e, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r27 = this;
            r0 = r27
            r1 = -1
            r2 = 2
            js9 r3 = defpackage.fu4.k
            java.lang.String r4 = "Required value was null."
            r5 = 4
            r6 = 0
            r7 = 0
            r8 = 1
            java.lang.Object r9 = r0.c
            java.lang.Object r10 = r0.b
            int r0 = r0.a
            switch(r0) {
                case 0: goto L_0x06c6;
                case 1: goto L_0x06b4;
                case 2: goto L_0x0684;
                case 3: goto L_0x0626;
                case 4: goto L_0x0619;
                case 5: goto L_0x0530;
                case 6: goto L_0x050d;
                case 7: goto L_0x04f3;
                case 8: goto L_0x04ce;
                case 9: goto L_0x049f;
                case 10: goto L_0x047d;
                case 11: goto L_0x0463;
                case 12: goto L_0x0408;
                case 13: goto L_0x03f8;
                case 14: goto L_0x03c2;
                case 15: goto L_0x02d1;
                case 16: goto L_0x02c7;
                case 17: goto L_0x02ad;
                case 18: goto L_0x028e;
                case 19: goto L_0x027f;
                case 20: goto L_0x0218;
                case 21: goto L_0x0203;
                case 22: goto L_0x01dd;
                case 23: goto L_0x0181;
                case 24: goto L_0x016e;
                case 25: goto L_0x0098;
                case 26: goto L_0x0085;
                case 27: goto L_0x0075;
                case 28: goto L_0x0026;
                default: goto L_0x0015;
            }
        L_0x0015:
            kotlin.Lazy r10 = (kotlin.Lazy) r10
            java.lang.Object r0 = r10.getValue()
            tt0 r0 = (defpackage.tt0) r0
            ulf r9 = (defpackage.ulf) r9
            int r1 = r9.a
            java.nio.ByteBuffer r0 = r0.a(r1)
            return r0
        L_0x0026:
            kotlin.Lazy r10 = (kotlin.Lazy) r10
            java.lang.Object r0 = r10.getValue()
            lo0 r0 = (defpackage.lo0) r0
            g6f r9 = (defpackage.g6f) r9
            android.content.Context r1 = r9.x
            int r2 = defpackage.cad.Q1
            android.graphics.drawable.Drawable r1 = defpackage.ew3.b(r1, r2)
            if (r1 == 0) goto L_0x006b
            int r2 = r1.getIntrinsicWidth()
            int r3 = r1.getIntrinsicHeight()
            int r3 = r3 * r2
            int r3 = r3 * r5
            java.lang.Object r0 = r0.get(r3)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            int r2 = r1.getIntrinsicWidth()
            int r3 = r1.getIntrinsicHeight()
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
            r0.reconfigure(r2, r3, r4)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r0)
            int r3 = r2.getWidth()
            int r4 = r2.getHeight()
            r1.setBounds(r6, r6, r3, r4)
            r1.draw(r2)
            return r0
        L_0x006b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r4.toString()
            r0.<init>(r1)
            throw r0
        L_0x0075:
            qw3 r10 = (defpackage.qw3) r10
            java.lang.Object r0 = r10.G0
            mqe r0 = (defpackage.mqe) r0
            if (r0 == 0) goto L_0x0082
            xte r9 = (defpackage.xte) r9
            r9.c(r0)
        L_0x0082:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0085:
            androidx.fragment.app.c r10 = (androidx.fragment.app.c) r10
            ru.ok.tamtam.calls.CallDialogFragment r0 = defpackage.uke.a(r10)
            if (r0 == 0) goto L_0x0090
            r0.a3()
        L_0x0090:
            ru.ok.messages.calls.utils.StartCallsViewModel r9 = (ru.ok.messages.calls.utils.StartCallsViewModel) r9
            r9.m()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0098:
            c8e r10 = (defpackage.c8e) r10
            android.content.Context r0 = r10.a
            java.lang.Class<android.app.ActivityManager> r1 = android.app.ActivityManager.class
            java.lang.Object r0 = defpackage.fw3.b(r0, r1)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            if (r0 == 0) goto L_0x00ae
            int r0 = r0.getLauncherLargeIconSize()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
        L_0x00ae:
            int r0 = defpackage.lya.j
            android.content.Context r1 = r10.a
            fu4 r2 = r3.e(r1)
            k2b r2 = r2.f()
            u67 r2 = r2.getIcon()
            r2.getClass()
            r2 = -16745729(0xffffffffff007aff, float:-1.7077982E38)
            android.graphics.drawable.Drawable r0 = defpackage.iq.E(r0, r2, r1)
            if (r7 == 0) goto L_0x00cf
            int r2 = r7.intValue()
            goto L_0x00d3
        L_0x00cf:
            int r2 = r0.getIntrinsicWidth()
        L_0x00d3:
            if (r7 == 0) goto L_0x00da
            int r3 = r7.intValue()
            goto L_0x00de
        L_0x00da:
            int r3 = r0.getIntrinsicHeight()
        L_0x00de:
            android.graphics.Bitmap r0 = defpackage.kne.O(r0, r2, r3)
            int r2 = defpackage.rmc.shortcut_id_create_chat
            java.lang.String r2 = r1.getString(r2)
            w7e r3 = new w7e
            r3.<init>()
            r3.a = r1
            r3.b = r2
            int r2 = defpackage.qad.D9
            java.lang.String r2 = r1.getString(r2)
            r3.d = r2
            androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.b(r0)
            r3.f = r0
            zb8 r0 = defpackage.zb8.b
            r0.getClass()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            kotlin.Lazy r9 = (kotlin.Lazy) r9
            java.lang.Object r0 = r9.getValue()
            cm r0 = (defpackage.cm) r0
            fz7 r0 = (defpackage.fz7) r0
            java.lang.String r0 = r0.b
            java.lang.Object r2 = r9.getValue()
            cm r2 = (defpackage.cm) r2
            fz7 r2 = (defpackage.fz7) r2
            java.lang.String r2 = r2.e
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<one.me.android.MainActivity> r5 = one.me.android.MainActivity.class
            r4.<init>(r1, r5)
            java.lang.String r1 = "CUSTOM_DEEP_LINK"
            r4.setAction(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "://"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "/:start-conversation"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r4.setData(r0)
            android.content.Intent[] r0 = new android.content.Intent[]{r4}
            r3.c = r0
            java.lang.CharSequence r0 = r3.d
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0166
            android.content.Intent[] r0 = r3.c
            if (r0 == 0) goto L_0x015e
            int r0 = r0.length
            if (r0 == 0) goto L_0x015e
            return r3
        L_0x015e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Shortcut must have an intent"
            r0.<init>(r1)
            throw r0
        L_0x0166:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Shortcut must have a non-empty label"
            r0.<init>(r1)
            throw r0
        L_0x016e:
            a6e r10 = (defpackage.a6e) r10
            kotlin.jvm.functions.Function1 r0 = r10.v
            ti9 r1 = new ti9
            w4e r9 = (defpackage.w4e) r9
            long r2 = r9.g
            r1.<init>(r2, r9)
            r0.invoke(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0181:
            kotlin.reflect.KProperty[] r0 = one.me.sharedata.ShareDataPickerScreen.A0
            one.me.sharedata.ShareDataPickerScreen r10 = (one.me.sharedata.ShareDataPickerScreen) r10
            vhb r0 = r10.l0()
            ukb r0 = r0.c
            e5e r0 = (defpackage.e5e) r0
            dc9 r9 = (defpackage.dc9) r9
            java.lang.CharSequence r1 = r9.getText()
            vhb r2 = r10.l0()
            etc r2 = r2.x
            ome r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            java.util.Set r2 = (java.util.Set) r2
            r0.getClass()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x01da
            boolean r2 = r0.m
            if (r2 == 0) goto L_0x01af
            goto L_0x01da
        L_0x01af:
            r0.m = r8
            d14 r2 = r0.l
            if (r2 == 0) goto L_0x01d3
            caa r3 = defpackage.caa.a
            kotlin.Lazy r4 = r0.d
            java.lang.Object r4 = r4.getValue()
            gaf r4 = (defpackage.gaf) r4
            osa r4 = (defpackage.osa) r4
            q04 r4 = r4.a()
            kotlin.coroutines.CoroutineContext r3 = r3.plus(r4)
            f14 r4 = defpackage.f14.c
            d5e r5 = new d5e
            r5.<init>(r0, r1, r7)
            defpackage.ev0.u(r2, r3, r4, r5)
        L_0x01d3:
            n6e r0 = r0.i
            f5e r1 = defpackage.f5e.a
            r0.d(r1)
        L_0x01da:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x01dd:
            kotlin.reflect.KProperty[] r0 = one.me.sharedata.ShareDataPickerScreen.A0
            one.me.sharedata.ShareDataPickerScreen r10 = (one.me.sharedata.ShareDataPickerScreen) r10
            vhb r0 = r10.l0()
            ukb r0 = r0.c
            e5e r0 = (defpackage.e5e) r0
            og9 r1 = defpackage.og9.o
            zqd r0 = r0.k
            r0.C(r1)
            yh7 r0 = one.me.sharedata.ShareDataPickerScreen.B0
            android.view.View r9 = (android.view.View) r9
            defpackage.h88.f(r9, r0, r7)
            dc9 r0 = r10.n0()
            int r1 = defpackage.cad.c1
            r0.setLeftIcon(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0203:
            int r0 = one.me.settings.privacy.ui.pincode.SetupPinCodeScreen.o
            mlb r10 = (defpackage.mlb) r10
            defpackage.kr7.C(r10)
            one.me.settings.privacy.ui.pincode.SetupPinCodeScreen r9 = (one.me.settings.privacy.ui.pincode.SetupPinCodeScreen) r9
            fma r0 = r9.getOnBackPressedDispatcher()
            if (r0 == 0) goto L_0x0215
            r0.d()
        L_0x0215:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0218:
            lz7 r9 = (defpackage.lz7) r9
            bp0 r9 = (defpackage.bp0) r9
            long r0 = r9.a
            bpa r10 = (defpackage.bpa) r10
            r10.getClass()
            kotlin.reflect.KProperty[] r2 = one.me.settings.privacy.ui.blacklist.SettingsBlacklistScreen.x
            java.lang.Object r2 = r10.b
            one.me.settings.privacy.ui.blacklist.SettingsBlacklistScreen r2 = (one.me.settings.privacy.ui.blacklist.SettingsBlacklistScreen) r2
            n0e r2 = r2.c0()
            r2.getClass()
            android.os.Bundle r14 = new android.os.Bundle
            r14.<init>(r6)
            java.lang.String r3 = "user_unblock_id"
            r14.putLong(r3, r0)
            int r0 = defpackage.vza.b
            java.lang.CharSequence r1 = r9.c
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            kgf r11 = new kgf
            java.util.List r1 = kotlin.collections.ArraysKt.toList((T[]) r1)
            r11.<init>(r0, r1)
            wzd r0 = new wzd
            int r1 = defpackage.vza.c
            igf r3 = new igf
            r3.<init>(r1)
            int r1 = defpackage.tza.d
            r0.<init>(r3, r1, r8)
            wzd r1 = new wzd
            int r3 = defpackage.vza.a
            igf r4 = new igf
            r4.<init>(r3)
            int r3 = defpackage.tza.e
            r1.<init>(r4, r3, r6)
            wzd[] r0 = new defpackage.wzd[]{r0, r1}
            java.util.List r12 = kotlin.collections.CollectionsKt.listOf(r0)
            xzd r0 = new xzd
            r13 = 0
            r15 = 4
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            s85 r1 = r2.w0
            defpackage.xag.h(r1, r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x027f:
            kotlin.reflect.KProperty[] r0 = one.me.devmenu.server.ServerPortBottomSheet.z0
            one.me.sdk.uikit.common.button.OneMeButton r10 = (one.me.sdk.uikit.common.button.OneMeButton) r10
            defpackage.kr7.C(r10)
            one.me.devmenu.server.ServerPortBottomSheet r9 = (one.me.devmenu.server.ServerPortBottomSheet) r9
            r9.i0(r8)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x028e:
            android.text.TextPaint r0 = new android.text.TextPaint
            r0.<init>()
            bsd r9 = (defpackage.bsd) r9
            android.content.Context r1 = r9.a
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            q3d r2 = r9.f
            java.lang.Object r2 = r2.getValue()
            uy4 r2 = (defpackage.uy4) r2
            ogf r10 = (defpackage.ogf) r10
            r10.a(r0, r1, r2)
            return r0
        L_0x02ad:
            android.app.Activity r10 = (android.app.Activity) r10
            r0 = r10
            t7d r0 = (defpackage.t7d) r0
            boolean r0 = r0.i()
            if (r0 == 0) goto L_0x02bd
            one.me.android.root.RootController r9 = (one.me.android.root.RootController) r9
            defpackage.q8.b(r9)
        L_0x02bd:
            android.content.Intent r0 = r10.getIntent()
            defpackage.q8.r(r10, r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x02c7:
            android.app.Activity r10 = (android.app.Activity) r10
            android.content.Intent r9 = (android.content.Intent) r9
            defpackage.q8.r(r10, r9)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x02d1:
            f6d r10 = (defpackage.f6d) r10
            kotlin.Lazy r0 = r10.e
            java.lang.Object r0 = r0.getValue()
            cjd r0 = (defpackage.cjd) r0
            long r0 = r0.a()
            r2 = r9
            m72 r2 = (defpackage.m72) r2
            boolean r3 = r2.h(r0)
            kotlin.Lazy r4 = r10.c
            r23 = 0
            if (r3 == 0) goto L_0x0324
            java.lang.Object r5 = r4.getValue()
            ddd r5 = (defpackage.ddd) r5
            r5.getClass()
            java.lang.String r9 = "SELECT chat_id FROM saved_msg_chat WHERE user_id = ?"
            d7d r9 = defpackage.d7d.a(r8, r9)
            r9.k(r8, r0)
            i6d r5 = r5.a
            r5.b()
            android.database.Cursor r5 = r5.o(r9, r7)
            boolean r7 = r5.moveToFirst()     // Catch:{ all -> 0x0312 }
            if (r7 == 0) goto L_0x0314
            long r6 = r5.getLong(r6)     // Catch:{ all -> 0x0312 }
            goto L_0x0316
        L_0x0312:
            r0 = move-exception
            goto L_0x031d
        L_0x0314:
            r6 = r23
        L_0x0316:
            r5.close()
            r9.o()
            goto L_0x0371
        L_0x031d:
            r5.close()
            r9.o()
            throw r0
        L_0x0324:
            long r11 = r2.a
            int r5 = (r11 > r23 ? 1 : (r11 == r23 ? 0 : -1))
            if (r5 == 0) goto L_0x0333
            hs2 r5 = r10.c()
            long r6 = r5.e(r11)
            goto L_0x0371
        L_0x0333:
            long r11 = r2.l
            int r5 = (r11 > r23 ? 1 : (r11 == r23 ? 0 : -1))
            if (r5 == 0) goto L_0x036f
            hs2 r5 = r10.c()
            r5.getClass()
            java.lang.String r9 = "SELECT id FROM chats WHERE cid = ?"
            d7d r9 = defpackage.d7d.a(r8, r9)
            r9.k(r8, r11)
            i6d r5 = r5.a
            r5.b()
            android.database.Cursor r5 = r5.o(r9, r7)
            boolean r7 = r5.moveToFirst()     // Catch:{ all -> 0x035d }
            if (r7 == 0) goto L_0x035f
            long r6 = r5.getLong(r6)     // Catch:{ all -> 0x035d }
            goto L_0x0361
        L_0x035d:
            r0 = move-exception
            goto L_0x0368
        L_0x035f:
            r6 = r23
        L_0x0361:
            r5.close()
            r9.o()
            goto L_0x0371
        L_0x0368:
            r5.close()
            r9.o()
            throw r0
        L_0x036f:
            r6 = r23
        L_0x0371:
            hs2 r5 = r10.c()
            n82 r8 = new n82
            d72 r9 = r2.a()
            long r14 = r9.e
            kotlin.Lazy r9 = r10.d
            java.lang.Object r9 = r9.getValue()
            aj9 r9 = (defpackage.aj9) r9
            long r11 = r2.j
            long r11 = r9.k(r11)
            long r19 = defpackage.hi7.o(r11, r2)
            long r12 = r2.l
            r16 = r14
            long r14 = r2.a
            r11 = r8
            r21 = r12
            r12 = r6
            r17 = r16
            r16 = r2
            r11.<init>(r12, r14, r16, r17, r19, r21)
            kotlin.Lazy r2 = r10.f
            java.lang.Object r2 = r2.getValue()
            qi6 r2 = (defpackage.qi6) r2
            java.util.concurrent.ConcurrentHashMap r2 = r2.a
            long r8 = r5.d(r8, r2)
            if (r3 == 0) goto L_0x03bd
            int r2 = (r6 > r23 ? 1 : (r6 == r23 ? 0 : -1))
            if (r2 != 0) goto L_0x03bd
            java.lang.Object r2 = r4.getValue()
            ddd r2 = (defpackage.ddd) r2
            r2.a(r0, r8)
        L_0x03bd:
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            return r0
        L_0x03c2:
            kotlin.reflect.KProperty[] r0 = one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet.F0
            java.lang.String r0 = "open_type"
            java.lang.String r1 = "UNDEFINE"
            android.os.Bundle r10 = (android.os.Bundle) r10
            java.lang.String r0 = r10.getString(r0, r1)
            pxc r0 = defpackage.pxc.valueOf(r0)
            one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet r9 = (one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet) r9
            kotlin.Lazy r1 = r9.x0
            java.lang.Object r1 = r1.getValue()
            ph1 r1 = (defpackage.ph1) r1
            oh1 r2 = defpackage.oh1.a
            q4 r3 = r2.getAccessor()
            java.lang.Class<ahd> r4 = defpackage.ahd.class
            kotlin.Lazy r3 = r3.h(r4)
            q4 r2 = r2.getAccessor()
            java.lang.Class<hl1> r4 = defpackage.hl1.class
            kotlin.Lazy r2 = r2.h(r4)
            vxc r4 = new vxc
            r4.<init>(r0, r1, r2, r3)
            return r4
        L_0x03f8:
            kotlin.jvm.functions.Function0 r10 = (kotlin.jvm.functions.Function0) r10
            r10.invoke()
            pqc r9 = (defpackage.pqc) r9
            boolean r0 = r9.isLaidOut()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x0408:
            m2c r10 = (defpackage.m2c) r10
            l2c r0 = r10.v
            t3c r9 = (defpackage.t3c) r9
            p3c r9 = (defpackage.p3c) r9
            int r1 = r9.a
            one.me.profile.screens.invite.ProfileInviteScreen r0 = (one.me.profile.screens.invite.ProfileInviteScreen) r0
            z2c r0 = r0.c0()
            r0.getClass()
            int r2 = defpackage.jxa.P
            s85 r3 = r0.A0
            if (r1 != r2) goto L_0x0431
            java.lang.String r0 = r0.l()
            if (r0 != 0) goto L_0x0428
            goto L_0x0460
        L_0x0428:
            h2c r1 = new h2c
            r1.<init>(r0)
            defpackage.xag.h(r3, r1)
            goto L_0x0460
        L_0x0431:
            int r2 = defpackage.jxa.O
            if (r1 != r2) goto L_0x0445
            java.lang.String r0 = r0.l()
            if (r0 != 0) goto L_0x043c
            goto L_0x0460
        L_0x043c:
            g2c r1 = new g2c
            r1.<init>(r0)
            defpackage.xag.h(r3, r1)
            goto L_0x0460
        L_0x0445:
            int r2 = defpackage.jxa.M
            if (r1 != r2) goto L_0x0460
            r4c r1 = defpackage.r4c.b
            r1.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = ":profile/edit/link?id="
            r1.<init>(r2)
            long r4 = r0.b
            java.lang.String r0 = "&type=local_chat&flow=edit"
            java.lang.String r0 = defpackage.wj6.m(r1, r4, r0)
            defpackage.a81.r(r0, r3)
        L_0x0460:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0463:
            t56 r10 = (defpackage.t56) r10
            java.lang.Object r0 = r10.w
            w0c r0 = (defpackage.w0c) r0
            tzb r9 = (defpackage.tzb) r9
            p7 r9 = (defpackage.p7) r9
            int r1 = r9.a
            one.me.profileedit.ProfileEditScreen r0 = (one.me.profileedit.ProfileEditScreen) r0
            j1c r0 = r0.d0()
            xz4 r0 = r0.b
            r0.a(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x047d:
            kotlin.reflect.KProperty[] r0 = one.me.profileedit.ProfileEditScreen.w0
            j1c r0 = new j1c
            one.me.profileedit.ProfileEditScreen r10 = (one.me.profileedit.ProfileEditScreen) r10
            long r1 = r10.a
            java.lang.String r3 = "profile:type"
            android.os.Bundle r9 = (android.os.Bundle) r9
            android.os.Parcelable r3 = r9.getParcelable(r3)
            if (r3 == 0) goto L_0x0495
            gzb r3 = (defpackage.gzb) r3
            r0.<init>(r1, r3)
            return r0
        L_0x0495:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r4.toString()
            r0.<init>(r1)
            throw r0
        L_0x049f:
            t56 r10 = (defpackage.t56) r10
            java.lang.Object r0 = r10.w
            zxb r0 = (defpackage.zxb) r0
            tzb r9 = (defpackage.tzb) r9
            p7 r9 = (defpackage.p7) r9
            int r1 = r9.a
            long r1 = (long) r1
            s1e r3 = r9.b
            h1e r3 = r3.o
            h1e r4 = defpackage.h1e.o
            if (r3 != r4) goto L_0x04b5
            goto L_0x04b6
        L_0x04b5:
            r8 = r6
        L_0x04b6:
            one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget r0 = (one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget) r0
            if (r8 == 0) goto L_0x04c2
            syb r0 = r0.e0()
            r0.o()
            goto L_0x04cb
        L_0x04c2:
            syb r0 = r0.e0()
            kotlin.reflect.KProperty[] r3 = defpackage.syb.C0
            r0.n(r1, r6)
        L_0x04cb:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x04ce:
            kotlin.reflect.KProperty[] r0 = one.me.profileedit.screens.changelink.ProfileChangeLinkScreen.Y
            d02 r0 = new d02
            java.lang.String r1 = "entity:id"
            android.os.Bundle r10 = (android.os.Bundle) r10
            long r1 = r10.getLong(r1)
            one.me.profileedit.screens.changelink.ProfileChangeLinkScreen r9 = (one.me.profileedit.screens.changelink.ProfileChangeLinkScreen) r9
            r9.getClass()
            kotlin.reflect.KProperty[] r3 = one.me.profileedit.screens.changelink.ProfileChangeLinkScreen.Y
            r3 = r3[r8]
            is r3 = r9.b
            java.lang.Object r3 = r3.a(r9)
            gzb r3 = (defpackage.gzb) r3
            fzb r4 = r9.e0()
            r0.<init>(r1, r3, r4)
            return r0
        L_0x04f3:
            t56 r10 = (defpackage.t56) r10
            java.lang.Object r0 = r10.w
            vwb r0 = (defpackage.vwb) r0
            tzb r9 = (defpackage.tzb) r9
            p7 r9 = (defpackage.p7) r9
            int r1 = r9.a
            one.me.profileedit.screens.changelink.ProfileChangeLinkScreen r0 = (one.me.profileedit.screens.changelink.ProfileChangeLinkScreen) r0
            d02 r0 = r0.g0()
            rz1 r0 = r0.b
            r0.g(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x050d:
            bpb r10 = (defpackage.bpb) r10
            d14 r0 = r10.c
            gaf r9 = (defpackage.gaf) r9
            osa r9 = (defpackage.osa) r9
            q04 r1 = r9.a()
            f14 r2 = defpackage.f14.b
            zob r3 = new zob
            r3.<init>(r10, r7)
            aje r0 = defpackage.ev0.u(r0, r1, r2, r3)
            kotlin.reflect.KProperty[] r1 = defpackage.bpb.h
            r1 = r1[r6]
            wie r2 = r10.f
            r2.setValue(r10, r1, r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0530:
            kotlin.reflect.KProperty[] r0 = one.me.chats.picker.PickerChatController.z0
            hkb r18 = new hkb
            r18.<init>()
            cu2 r0 = new cu2
            one.me.chats.picker.PickerChatController r10 = (one.me.chats.picker.PickerChatController) r10
            android.content.Context r1 = r10.getContext()
            android.content.Context r20 = r1.getApplicationContext()
            lgb r1 = new lgb
            r1.<init>((int) r2)
            cs2 r2 = defpackage.cs2.a
            q4 r3 = r2.getAccessor()
            java.lang.Class<x23> r4 = defpackage.x23.class
            kotlin.Lazy r22 = r3.h(r4)
            q4 r3 = r2.getAccessor()
            java.lang.Class<bud> r4 = defpackage.bud.class
            kotlin.Lazy r23 = r3.h(r4)
            q4 r3 = r2.getAccessor()
            java.lang.Class<rtb> r4 = defpackage.rtb.class
            kotlin.Lazy r24 = r3.h(r4)
            q4 r3 = r2.getAccessor()
            java.lang.Class<fq2> r4 = defpackage.fq2.class
            kotlin.Lazy r25 = r3.h(r4)
            q4 r3 = r2.getAccessor()
            java.lang.Class<eq2> r4 = defpackage.eq2.class
            kotlin.Lazy r26 = r3.h(r4)
            r19 = r0
            r21 = r1
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            android.os.Bundle r9 = (android.os.Bundle) r9
            java.lang.String r1 = "ru.ok.tamtam.extra.DATA"
            android.os.Parcelable r1 = r9.getParcelable(r1)
            android.content.Intent r1 = (android.content.Intent) r1
            if (r1 == 0) goto L_0x05be
            d19 r3 = new d19
            q4 r4 = r2.getAccessor()
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            java.lang.Object r4 = r4.g(r5)
            android.content.Context r4 = (android.content.Context) r4
            q4 r5 = r2.getAccessor()
            java.lang.Class<m95> r6 = defpackage.m95.class
            java.lang.Object r5 = r5.g(r6)
            m95 r5 = (defpackage.m95) r5
            q4 r6 = r2.getAccessor()
            java.lang.Class<ln5> r11 = defpackage.ln5.class
            java.lang.Object r6 = r6.g(r11)
            ln5 r6 = (defpackage.ln5) r6
            r3.<init>(r4, r5, r6)
            u9 r1 = r3.i(r1)
            r14 = r1
            goto L_0x05bf
        L_0x05be:
            r14 = r7
        L_0x05bf:
            whb r1 = new whb
            java.lang.String r3 = "ru.ok.tamtam.extra.MESSAGES"
            long[] r3 = r9.getLongArray(r3)
            if (r3 == 0) goto L_0x05cd
            java.util.Set r7 = kotlin.collections.ArraysKt.toSet((long[]) r3)
        L_0x05cd:
            if (r7 != 0) goto L_0x05d5
            java.util.Set r3 = kotlin.collections.SetsKt.emptySet()
            r12 = r3
            goto L_0x05d6
        L_0x05d5:
            r12 = r7
        L_0x05d6:
            kotlin.reflect.KProperty[] r3 = one.me.chats.picker.PickerChatController.z0
            r3 = r3[r8]
            is r3 = r10.c
            java.lang.Object r3 = r3.a(r10)
            long[] r3 = (long[]) r3
            java.util.Set r13 = kotlin.collections.ArraysKt.toSet((long[]) r3)
            q4 r3 = r2.getAccessor()
            java.lang.Class<qx2> r4 = defpackage.qx2.class
            kotlin.Lazy r15 = r3.h(r4)
            q4 r3 = r2.getAccessor()
            java.lang.Class<eu3> r4 = defpackage.eu3.class
            kotlin.Lazy r16 = r3.h(r4)
            gaf r17 = r2.e()
            q4 r3 = r2.getAccessor()
            java.lang.Class<fd8> r4 = defpackage.fd8.class
            kotlin.Lazy r19 = r3.h(r4)
            q4 r2 = r2.getAccessor()
            java.lang.Class<q5e> r3 = defpackage.q5e.class
            kotlin.Lazy r21 = r2.h(r3)
            r11 = r1
            r20 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r1
        L_0x0619:
            k3b r10 = (defpackage.k3b) r10
            r10.b()
            kotlin.jvm.functions.Function0 r9 = (kotlin.jvm.functions.Function0) r9
            r9.invoke()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0626:
            android.widget.TextView r0 = new android.widget.TextView
            android.content.Context r10 = (android.content.Context) r10
            r0.<init>(r10)
            ogf r2 = defpackage.puf.o
            r2.b(r0, defpackage.uy4.b)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = -2
            r2.<init>(r1, r3)
            r0.setLayoutParams(r2)
            r1 = 12
            float r1 = (float) r1
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r1
            int r2 = kotlin.math.MathKt.roundToInt((float) r2)
            float r3 = (float) r5
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r3
            int r4 = kotlin.math.MathKt.roundToInt((float) r4)
            android.content.res.Resources r5 = defpackage.vo4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r1 = r1 * r5
            int r1 = kotlin.math.MathKt.roundToInt((float) r1)
            android.content.res.Resources r5 = defpackage.vo4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r3 = r3 * r5
            int r3 = kotlin.math.MathKt.roundToInt((float) r3)
            r0.setPadding(r2, r4, r1, r3)
            h2b r9 = (defpackage.h2b) r9
            r9.addView(r0)
            return r0
        L_0x0684:
            ita r0 = new ita
            android.content.Context r10 = (android.content.Context) r10
            r0.<init>(r10)
            int r1 = defpackage.dad.w0
            r0.setId(r1)
            b2b r9 = (defpackage.b2b) r9
            woa r1 = r9.getTabItem()
            voa r1 = r1.c
            int r1 = r1.ordinal()
            if (r1 == 0) goto L_0x06ae
            if (r1 == r8) goto L_0x06ab
            if (r1 != r2) goto L_0x06a5
            hta r1 = defpackage.hta.a
            goto L_0x06b0
        L_0x06a5:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x06ab:
            hta r1 = defpackage.hta.b
            goto L_0x06b0
        L_0x06ae:
            hta r1 = defpackage.hta.a
        L_0x06b0:
            r0.setAppearance(r1)
            return r0
        L_0x06b4:
            int r0 = defpackage.lta.f
            lta r10 = (defpackage.lta) r10
            et4 r0 = r10.a()
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.e
            jta r9 = (defpackage.jta) r9
            r0.remove(r9)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x06c6:
            int r0 = one.me.sdk.uikit.common.views.OneMeContactsChipGroup.F0
            one.me.sdk.richvector.EnhancedVectorDrawable r0 = new one.me.sdk.richvector.EnhancedVectorDrawable
            int r2 = defpackage.zec.ic_cancel_filled_24
            android.content.Context r10 = (android.content.Context) r10
            r0.<init>((android.content.Context) r10, (int) r2)
            one.me.sdk.uikit.common.views.OneMeContactsChipGroup r9 = (one.me.sdk.uikit.common.views.OneMeContactsChipGroup) r9
            k2b r2 = r3.f(r9)
            u67 r2 = r2.getIcon()
            r2.getClass()
            java.lang.String r2 = "circle_background"
            defpackage.hi7.Y(r0, r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vra.invoke():java.lang.Object");
    }
}
