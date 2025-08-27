package defpackage;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* renamed from: kqc  reason: default package */
public final /* synthetic */ class kqc implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kqc(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [y14] */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v46, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r1v47 */
    /* JADX WARNING: type inference failed for: r1v51 */
    /* JADX WARNING: type inference failed for: r1v52 */
    /* JADX WARNING: type inference failed for: r1v53 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
            r2 = 1
            java.lang.Object r3 = r6.b
            java.lang.Object r4 = r6.c
            int r6 = r6.a
            switch(r6) {
                case 0: goto L_0x0460;
                case 1: goto L_0x0458;
                case 2: goto L_0x0450;
                case 3: goto L_0x0436;
                case 4: goto L_0x0414;
                case 5: goto L_0x03bb;
                case 6: goto L_0x0381;
                case 7: goto L_0x0285;
                case 8: goto L_0x0250;
                case 9: goto L_0x0244;
                case 10: goto L_0x022a;
                case 11: goto L_0x0109;
                case 12: goto L_0x00fc;
                case 13: goto L_0x00ee;
                case 14: goto L_0x0083;
                case 15: goto L_0x0077;
                case 16: goto L_0x006b;
                case 17: goto L_0x004e;
                case 18: goto L_0x0042;
                case 19: goto L_0x0023;
                case 20: goto L_0x0016;
                default: goto L_0x000c;
            }
        L_0x000c:
            h0g r4 = (defpackage.h0g) r4
            androidx.appcompat.widget.AppCompatImageView r6 = r4.o
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r3.invoke(r6)
            return
        L_0x0016:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            if (r4 == 0) goto L_0x001d
            r4.invoke()
        L_0x001d:
            ymf r3 = (defpackage.ymf) r3
            r3.a()
            return
        L_0x0023:
            l0f r4 = (defpackage.l0f) r4
            r6 = r4
            one.me.sdk.messagewrite.mention.SuggestionsWidget r6 = (one.me.sdk.messagewrite.mention.SuggestionsWidget) r6
            v0f r7 = r6.r0()
        L_0x002c:
            xme r0 = r7.I0
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            o0f r2 = (defpackage.o0f) r2
            r2 = r3
            o0f r2 = (defpackage.o0f) r2
            boolean r0 = r0.b(r1, r2)
            if (r0 == 0) goto L_0x002c
            r6.s0()
            return
        L_0x0042:
            kue r4 = (defpackage.kue) r4
            wmd r6 = r4.D0
            if (r6 == 0) goto L_0x004d
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r3.invoke(r6)
        L_0x004d:
            return
        L_0x004e:
            vre r4 = (defpackage.vre) r4
            wx1 r6 = r4.J0
            if (r6 == 0) goto L_0x006a
            android.view.View r7 = r4.a
            one.me.sdk.uikit.common.views.OneMeDraweeView r7 = (one.me.sdk.uikit.common.views.OneMeDraweeView) r7
            android.graphics.drawable.ShapeDrawable r0 = r4.D0
            r7.setBackground(r0)
            mqe r6 = r6.b
            long r6 = r6.a
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r3.invoke(r6)
        L_0x006a:
            return
        L_0x006b:
            hqe r4 = (defpackage.hqe) r4
            wmd r6 = r4.H0
            if (r6 == 0) goto L_0x0076
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r3.invoke(r6)
        L_0x0076:
            return
        L_0x0077:
            qb8 r4 = (defpackage.qb8) r4
            gpe r6 = r4.F0
            if (r6 == 0) goto L_0x0082
            uoe r3 = (defpackage.uoe) r3
            r3.f(r6)
        L_0x0082:
            return
        L_0x0083:
            kotlin.reflect.KProperty[] r6 = one.me.calls.ui.bottomsheet.record.StartRecordBottomSheet.y0
            one.me.calls.ui.bottomsheet.record.StartRecordBottomSheet r4 = (one.me.calls.ui.bottomsheet.record.StartRecordBottomSheet) r4
            kotlin.Lazy r6 = r4.x0
            java.lang.Object r6 = r6.getValue()
            ame r6 = (defpackage.ame) r6
            android.widget.EditText r3 = (android.widget.EditText) r3
            android.text.Editable r7 = r3.getText()
            ph1 r6 = r6.b
            if (r7 == 0) goto L_0x00b9
            boolean r3 = kotlin.text.StringsKt.isBlank(r7)
            if (r3 == 0) goto L_0x00b9
            int r3 = r7.length()
            if (r3 <= 0) goto L_0x00b9
            jj1 r6 = (defpackage.jj1) r6
            s85 r6 = r6.K0
            gi1 r7 = new gi1
            int r0 = defpackage.sqa.w0
            igf r1 = new igf
            r1.<init>(r0)
            r7.<init>(r1)
            defpackage.xag.h(r6, r7)
            goto L_0x00ed
        L_0x00b9:
            if (r7 == 0) goto L_0x00c1
            int r3 = r7.length()
            if (r3 != 0) goto L_0x00c2
        L_0x00c1:
            r0 = r2
        L_0x00c2:
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x00c6
            goto L_0x00c7
        L_0x00c6:
            r7 = r1
        L_0x00c7:
            if (r7 != 0) goto L_0x00dd
            r7 = r6
            jj1 r7 = (defpackage.jj1) r7
            etc r7 = r7.C0
            ome r7 = r7.a
            java.lang.Object r7 = r7.getValue()
            k91 r7 = (defpackage.k91) r7
            l21 r7 = r7.f
            if (r7 == 0) goto L_0x00de
            java.lang.CharSequence r1 = r7.b
            goto L_0x00de
        L_0x00dd:
            r1 = r7
        L_0x00de:
            jj1 r6 = (defpackage.jj1) r6
            s85 r6 = r6.K0
            zh1 r7 = new zh1
            r7.<init>(r1)
            defpackage.xag.h(r6, r7)
            r4.i0(r2)
        L_0x00ed:
            return
        L_0x00ee:
            efe r4 = (defpackage.efe) r4
            r4.getClass()
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            r3.onClick(r7)
            r4.a(r2)
            return
        L_0x00fc:
            v7e r4 = (defpackage.v7e) r4
            one.me.sdk.uikit.common.button.OneMeButton r6 = r4.H0
            r6.setProgressEnabled(r2)
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            r3.invoke()
            return
        L_0x0109:
            lz7 r3 = (defpackage.lz7) r3
            tmd r3 = (defpackage.tmd) r3
            long r6 = r3.o
            syc r4 = (defpackage.syc) r4
            r4.getClass()
            kotlin.reflect.KProperty[] r0 = one.me.settings.privacy.ui.SettingsPrivacyScreen.x
            java.lang.Object r0 = r4.b
            one.me.settings.privacy.ui.SettingsPrivacyScreen r0 = (one.me.settings.privacy.ui.SettingsPrivacyScreen) r0
            y3e r0 = r0.c0()
            r0.getClass()
            long r1 = defpackage.uza.i
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x012e
            xzd r6 = defpackage.xzd.f
            r0.q(r6)
            goto L_0x0229
        L_0x012e:
            long r1 = defpackage.uza.d
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x016d
            bud r1 = r0.o()
            akd r1 = (defpackage.akd) r1
            boolean r1 = r1.x()
            if (r1 == 0) goto L_0x0164
            pid r1 = r0.l()
            boolean r1 = r1.r()
            if (r1 == 0) goto L_0x0164
            r0.E0 = r6
            x23 r6 = r0.m()
            boolean r6 = r6.a()
            if (r6 == 0) goto L_0x015d
            vzd r6 = defpackage.vzd.b
            r0.q(r6)
            goto L_0x0229
        L_0x015d:
            uzd r6 = defpackage.uzd.b
            r0.q(r6)
            goto L_0x0229
        L_0x0164:
            xzd r6 = defpackage.xzd.h
            r0.q(r6)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            goto L_0x0229
        L_0x016d:
            long r1 = defpackage.uza.b
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x01ac
            bud r1 = r0.o()
            akd r1 = (defpackage.akd) r1
            boolean r1 = r1.x()
            if (r1 == 0) goto L_0x01a3
            pid r1 = r0.l()
            boolean r1 = r1.r()
            if (r1 == 0) goto L_0x01a3
            r0.E0 = r6
            x23 r6 = r0.m()
            boolean r6 = r6.a()
            if (r6 == 0) goto L_0x019c
            vzd r6 = defpackage.vzd.b
            r0.q(r6)
            goto L_0x0229
        L_0x019c:
            uzd r6 = defpackage.uzd.b
            r0.q(r6)
            goto L_0x0229
        L_0x01a3:
            xzd r6 = defpackage.xzd.j
            r0.q(r6)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            goto L_0x0229
        L_0x01ac:
            long r1 = defpackage.uza.c
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x01c2
            i3e r6 = defpackage.i3e.b
            r6.getClass()
            pa4 r6 = new pa4
            java.lang.String r7 = ":settings/blacklist"
            r6.<init>(r7)
            r0.q(r6)
            goto L_0x0229
        L_0x01c2:
            long r1 = defpackage.uza.e
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x01ce
            xzd r6 = defpackage.xzd.k
            r0.q(r6)
            goto L_0x0229
        L_0x01ce:
            long r1 = defpackage.uza.h
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x020a
            bud r1 = r0.o()
            akd r1 = (defpackage.akd) r1
            boolean r1 = r1.x()
            if (r1 == 0) goto L_0x0202
            pid r1 = r0.l()
            boolean r1 = r1.r()
            if (r1 == 0) goto L_0x0202
            r0.E0 = r6
            x23 r6 = r0.m()
            boolean r6 = r6.a()
            if (r6 == 0) goto L_0x01fc
            vzd r6 = defpackage.vzd.b
            r0.q(r6)
            goto L_0x0229
        L_0x01fc:
            uzd r6 = defpackage.uzd.b
            r0.q(r6)
            goto L_0x0229
        L_0x0202:
            xzd r6 = defpackage.xzd.i
            r0.q(r6)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            goto L_0x0229
        L_0x020a:
            long r1 = defpackage.uza.g
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 != 0) goto L_0x0229
            pid r6 = r0.l()
            boolean r6 = r6.r()
            if (r6 == 0) goto L_0x0229
            x23 r6 = r0.m()
            boolean r6 = r6.a()
            if (r6 != 0) goto L_0x0229
            uzd r6 = defpackage.uzd.b
            r0.q(r6)
        L_0x0229:
            return
        L_0x022a:
            lz7 r3 = (defpackage.lz7) r3
            and r3 = (defpackage.and) r3
            long r6 = r3.o
            nob r4 = (defpackage.nob) r4
            r4.getClass()
            kotlin.reflect.KProperty[] r0 = one.me.settings.privacy.ui.SettingMediaScreen.w
            java.lang.Object r0 = r4.a
            one.me.settings.privacy.ui.SettingMediaScreen r0 = (one.me.settings.privacy.ui.SettingMediaScreen) r0
            jzd r0 = r0.c0()
            int r6 = (int) r6
            r0.l(r6)
            return
        L_0x0244:
            i1e r3 = (defpackage.i1e) r3
            long r6 = r3.getItemId()
            j1e r4 = (defpackage.j1e) r4
            r4.e(r6)
            return
        L_0x0250:
            v0e r4 = (defpackage.v0e) r4
            ru.ok.messages.views.fragments.FrgProfileSettings r6 = r4.E0
            r6.getClass()
            j6c r3 = (defpackage.j6c) r3
            int r7 = r3.a
            int r1 = defpackage.lic.setting_debug_info
            if (r7 == r1) goto L_0x0260
            goto L_0x0284
        L_0x0260:
            android.content.Context r7 = r6.G2()
            java.lang.CharSequence r1 = r3.c
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "clipboard"
            java.lang.Object r7 = r7.getSystemService(r2)
            android.content.ClipboardManager r7 = (android.content.ClipboardManager) r7
            java.lang.String r2 = "debug info"
            android.content.ClipData r1 = android.content.ClipData.newPlainText(r2, r1)
            r7.setPrimaryClip(r1)
            android.content.Context r6 = r6.G2()
            java.lang.String r7 = "Debug info copied!"
            defpackage.hi7.b0(r0, r6, r7)
        L_0x0284:
            return
        L_0x0285:
            android.view.View r3 = (android.view.View) r3
            int r6 = r3.getId()
            ru.ok.messages.views.fragments.FrgProfileSettings r4 = (ru.ok.messages.views.fragments.FrgProfileSettings) r4
            r4.getClass()
            int r7 = defpackage.lic.setting_feedback
            if (r6 != r7) goto L_0x02b7
            dm4 r6 = r4.p1
            java.lang.Object r6 = r6.b
            id3 r6 = (defpackage.id3) r6
            qra r6 = (defpackage.qra) r6
            q4 r6 = r6.getAccessor()
            java.lang.Class<yj5> r7 = defpackage.yj5.class
            java.lang.Object r6 = r6.g(r7)
            yj5 r6 = (defpackage.yj5) r6
            r4.E2()
            r6.getClass()
            java.lang.String r6 = "yj5"
            java.lang.String r7 = "support new feedback"
            defpackage.z68.c(r6, r7, new java.lang.Object[0])
            goto L_0x0380
        L_0x02b7:
            int r7 = defpackage.lic.setting_contact_invite
            if (r6 != r7) goto L_0x02f3
            android.content.Context r6 = r4.O1()
            android.content.Context r7 = r4.O1()
            ym r0 = defpackage.ym.v
            ltb r0 = r0.c()
            cud r0 = r0.b
            ls7 r3 = r0.g
            java.lang.String r4 = "invite-short"
            java.lang.String r1 = r3.getString(r4, r1)
            if (r1 == 0) goto L_0x02d6
            goto L_0x02ee
        L_0x02d6:
            kotlin.jvm.internal.StringCompanionObject r1 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            int r1 = defpackage.jad.r
            java.lang.String r7 = r7.getString(r1)
            java.lang.String r0 = r0.p()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            java.lang.String r1 = java.lang.String.format(r7, r0)
        L_0x02ee:
            defpackage.gsg.B(r6, r1)
            goto L_0x0380
        L_0x02f3:
            int r7 = defpackage.lic.setting_language
            if (r6 != r7) goto L_0x030b
            ru.ok.messages.views.dialogs.FrgDlgLangChoose r6 = new ru.ok.messages.views.dialogs.FrgDlgLangChoose
            r6.<init>()
            androidx.fragment.app.b r7 = r4.M1()
            ed6 r7 = r7.v()
            java.lang.String r0 = "ru.ok.messages.views.dialogs.FrgDlgLangChoose"
            r6.Y2(r7, r0)
            goto L_0x0380
        L_0x030b:
            int r7 = defpackage.lic.setting_dev
            if (r6 != r7) goto L_0x0320
            androidx.fragment.app.b r6 = r4.M1()
            int r7 = ru.ok.messages.views.dev.ActDevOptions.z0
            android.content.Intent r7 = new android.content.Intent
            java.lang.Class<ru.ok.messages.views.dev.ActDevOptions> r0 = ru.ok.messages.views.dev.ActDevOptions.class
            r7.<init>(r6, r0)
            r6.startActivity(r7)
            goto L_0x0380
        L_0x0320:
            int r7 = defpackage.lic.setting_dev_logs
            if (r6 != r7) goto L_0x0335
            android.content.Context r6 = r4.O1()
            int r7 = defpackage.c6.z0
            android.content.Intent r7 = new android.content.Intent
            java.lang.Class<c6> r0 = defpackage.c6.class
            r7.<init>(r6, r0)
            r6.startActivity(r7)
            goto L_0x0380
        L_0x0335:
            int r7 = defpackage.lic.setting_folders
            if (r6 != r7) goto L_0x036b
            dm4 r6 = r4.p1
            java.lang.Object r6 = r6.b
            id3 r6 = (defpackage.id3) r6
            qra r6 = (defpackage.qra) r6
            q4 r6 = r6.getAccessor()
            java.lang.Class<saf> r7 = defpackage.saf.class
            java.lang.Object r6 = r6.g(r7)
            saf r6 = (defpackage.saf) r6
            x9f r6 = r6.a
            androidx.fragment.app.b r7 = r4.E2()
            o46 r0 = defpackage.o46.a
            r6.getClass()
            int r6 = defpackage.u6.z0
            android.content.Intent r6 = new android.content.Intent
            java.lang.Class<u6> r1 = defpackage.u6.class
            r6.<init>(r7, r1)
            java.lang.String r1 = "settings.folders.from"
            android.content.Intent r6 = r6.putExtra(r1, r0)
            r7.startActivity(r6)
            goto L_0x0380
        L_0x036b:
            int r7 = defpackage.lic.setting_version
            if (r6 == r7) goto L_0x0380
            int r7 = defpackage.lic.setting_debug_info
            if (r6 == r7) goto L_0x0380
            androidx.fragment.app.b r7 = r4.M1()
            gk8 r0 = r4.h2
            boolean r0 = r0.F()
            ru.ok.messages.settings.ActSettings.T(r6, r7, r0)
        L_0x0380:
            return
        L_0x0381:
            lz7 r3 = (defpackage.lz7) r3
            bp0 r3 = (defpackage.bp0) r3
            long r6 = r3.a
            bpa r4 = (defpackage.bpa) r4
            r4.getClass()
            kotlin.reflect.KProperty[] r2 = one.me.settings.privacy.ui.blacklist.SettingsBlacklistScreen.x
            java.lang.Object r2 = r4.b
            one.me.settings.privacy.ui.blacklist.SettingsBlacklistScreen r2 = (one.me.settings.privacy.ui.blacklist.SettingsBlacklistScreen) r2
            n0e r2 = r2.c0()
            kotlin.Lazy r3 = r2.y
            java.lang.Object r3 = r3.getValue()
            gaf r3 = (defpackage.gaf) r3
            osa r3 = (defpackage.osa) r3
            q04 r3 = r3.a()
            f14 r4 = defpackage.f14.b
            l0e r5 = new l0e
            r5.<init>(r2, r6, r1)
            jx3 r6 = r2.a
            aje r6 = defpackage.ev0.u(r6, r3, r4, r5)
            kotlin.reflect.KProperty[] r7 = defpackage.n0e.x0
            r7 = r7[r0]
            wie r0 = r2.v0
            r0.setValue(r2, r7, r6)
            return
        L_0x03bb:
            kotlin.reflect.KProperty[] r6 = one.me.devmenu.server.ServerPortBottomSheet.z0
            one.me.devmenu.server.ServerPortBottomSheet r4 = (one.me.devmenu.server.ServerPortBottomSheet) r4
            r4.getClass()
            kotlin.reflect.KProperty[] r6 = one.me.devmenu.server.ServerPortBottomSheet.z0
            r6 = r6[r0]
            kotlin.properties.ReadOnlyProperty r7 = r4.x0
            java.lang.Object r6 = r7.getValue(r4, r6)
            h2b r6 = (defpackage.h2b) r6
            java.lang.CharSequence r6 = r6.getText()
            if (r6 == 0) goto L_0x03da
            int r7 = r6.length()
            if (r7 != 0) goto L_0x03db
        L_0x03da:
            r0 = r2
        L_0x03db:
            r7 = r0 ^ 1
            if (r7 == 0) goto L_0x0413
            kotlin.Lazy r7 = r4.w0
            java.lang.Object r7 = r7.getValue()
            wrb r7 = (defpackage.wrb) r7
            java.lang.String r6 = r6.toString()
            vra r0 = new vra
            one.me.sdk.uikit.common.button.OneMeButton r3 = (one.me.sdk.uikit.common.button.OneMeButton) r3
            r2 = 19
            r0.<init>(r2, r3, r4)
            jx3 r2 = r7.a
            kotlin.Lazy r3 = r7.c
            java.lang.Object r3 = r3.getValue()
            gaf r3 = (defpackage.gaf) r3
            osa r3 = (defpackage.osa) r3
            q04 r3 = r3.b()
            caa r4 = defpackage.caa.a
            kotlin.coroutines.CoroutineContext r3 = r3.plus(r4)
            vrb r4 = new vrb
            r4.<init>(r7, r6, r0, r1)
            r6 = 2
            defpackage.ev0.v(r2, r3, r1, r4, r6)
        L_0x0413:
            return
        L_0x0414:
            ypd r4 = (defpackage.ypd) r4
            android.widget.ImageView r6 = r4.D0
            boolean r6 = r6.isSelected()
            if (r6 == 0) goto L_0x041f
            goto L_0x0435
        L_0x041f:
            int r6 = defpackage.hhc.profile_selectable_item_tag
            android.view.View r7 = r4.a
            java.lang.Object r6 = defpackage.vzg.w(r7, r6)
            boolean r7 = r6 instanceof java.lang.Integer
            if (r7 == 0) goto L_0x042e
            r1 = r6
            java.lang.Integer r1 = (java.lang.Integer) r1
        L_0x042e:
            if (r1 == 0) goto L_0x0435
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r3.invoke(r1)
        L_0x0435:
            return
        L_0x0436:
            int r6 = one.me.sdk.phoneutils.SelectCountryBottomSheet.w0
            one.me.sdk.phoneutils.SelectCountryBottomSheet r4 = (one.me.sdk.phoneutils.SelectCountryBottomSheet) r4
            zx3 r6 = r4.getTargetController()
            boolean r7 = r6 instanceof defpackage.y14
            if (r7 == 0) goto L_0x0445
            r1 = r6
            y14 r1 = (defpackage.y14) r1
        L_0x0445:
            if (r1 == 0) goto L_0x044c
            ysa r3 = (defpackage.ysa) r3
            r1.D(r3)
        L_0x044c:
            r4.i0(r2)
            return
        L_0x0450:
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            cuc r4 = (defpackage.cuc) r4
            r3.invoke(r4)
            return
        L_0x0458:
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            xqc r4 = (defpackage.xqc) r4
            r3.invoke(r4)
            return
        L_0x0460:
            qw6 r6 = defpackage.qw6.CONFIRM
            nqc r4 = (defpackage.nqc) r4
            defpackage.b0h.K(r4, r6)
            hqc r6 = r4.getReaction()
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r3.invoke(r6)
            int r6 = r4.getCount()
            if (r6 != r2) goto L_0x047c
            boolean r6 = r4.b()
            if (r6 != 0) goto L_0x0483
        L_0x047c:
            boolean r6 = r4.b()
            r4.a(r6)
        L_0x0483:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kqc.onClick(android.view.View):void");
    }

    public /* synthetic */ kqc(Function1 function1, Object obj, int i) {
        this.a = i;
        this.b = function1;
        this.c = obj;
    }
}
