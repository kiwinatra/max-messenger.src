package defpackage;

import android.content.DialogInterface;
import ru.ok.messages.views.dialogs.FrgDlgConstructorSendConfirmation;

/* renamed from: d10  reason: default package */
public final /* synthetic */ class d10 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d10(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: ru.ok.messages.settings.FrgPinLockSettings} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v2, types: [ch6] */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02a4, code lost:
        if (r9 == defpackage.lic.layout_member_menu_radio__delete_all) goto L_0x02a6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r9, int r10) {
        /*
            r8 = this;
            java.lang.String r9 = "gsg"
            r0 = 3
            r1 = -1
            r2 = 2
            r3 = 0
            r4 = 1
            r5 = 0
            java.lang.Object r6 = r8.b
            int r8 = r8.a
            switch(r8) {
                case 0: goto L_0x03be;
                case 1: goto L_0x0395;
                case 2: goto L_0x02c5;
                case 3: goto L_0x027c;
                case 4: goto L_0x0264;
                case 5: goto L_0x0240;
                case 6: goto L_0x021e;
                case 7: goto L_0x0212;
                case 8: goto L_0x020c;
                case 9: goto L_0x0206;
                case 10: goto L_0x01cb;
                case 11: goto L_0x019f;
                case 12: goto L_0x0183;
                case 13: goto L_0x00bf;
                case 14: goto L_0x00b9;
                case 15: goto L_0x00a3;
                case 16: goto L_0x006d;
                case 17: goto L_0x005f;
                case 18: goto L_0x0017;
                default: goto L_0x000f;
            }
        L_0x000f:
            w7g r8 = defpackage.w7g.a
            ru.ok.messages.views.dialogs.VideoQualityPickerDialog r6 = (ru.ok.messages.views.dialogs.VideoQualityPickerDialog) r6
            r6.c3(r8)
            return
        L_0x0017:
            ru.ok.messages.views.dialogs.PickPhotoDialog r6 = (ru.ok.messages.views.dialogs.PickPhotoDialog) r6
            java.lang.String r8 = "ru.ok.tamtam.dialogs.PICK_PHOTO_REQUEST_KEY"
            if (r10 == 0) goto L_0x0041
            if (r10 == r4) goto L_0x0026
            if (r10 == r2) goto L_0x0022
            goto L_0x005b
        L_0x0022:
            r6.Z2(r0)
            goto L_0x005b
        L_0x0026:
            androidx.fragment.app.c r9 = r6.Q1()
            xfb r10 = defpackage.xfb.b
            java.lang.String r0 = "TAKE_PHOTO"
            kotlin.Pair r10 = kotlin.TuplesKt.to(r0, r10)
            kotlin.Pair[] r10 = new kotlin.Pair[]{r10}
            android.os.Bundle r10 = defpackage.o54.f(r10)
            r9.f0(r8, r10)
            r6.Z2(r2)
            goto L_0x005b
        L_0x0041:
            androidx.fragment.app.c r9 = r6.Q1()
            xfb r10 = defpackage.xfb.c
            java.lang.String r0 = "PICK_FROM_GALLERY"
            kotlin.Pair r10 = kotlin.TuplesKt.to(r0, r10)
            kotlin.Pair[] r10 = new kotlin.Pair[]{r10}
            android.os.Bundle r10 = defpackage.o54.f(r10)
            r9.f0(r8, r10)
            r6.Z2(r4)
        L_0x005b:
            r6.T2(r4, r5)
            return
        L_0x005f:
            ru.ok.messages.views.dialogs.MakeNonAdminDialog r6 = (ru.ok.messages.views.dialogs.MakeNonAdminDialog) r6
            java.lang.Object r8 = r6.b3()
            md8 r8 = (defpackage.md8) r8
            long r9 = r6.F1
            r8.T(r9)
            return
        L_0x006d:
            ru.ok.messages.views.dialogs.LoadMediaDialog r6 = (ru.ok.messages.views.dialogs.LoadMediaDialog) r6
            androidx.fragment.app.a r8 = r6.U1(r4)
            if (r8 == 0) goto L_0x00a2
            android.content.Intent r9 = new android.content.Intent
            r9.<init>()
            android.os.Bundle r0 = r6.F2()
            java.lang.String r3 = "ru.ok.tamtam.extra.SETTING_ID"
            int r0 = r0.getInt(r3)
            r9.putExtra(r3, r0)
            java.lang.String r0 = "ru.ok.tamtam.extra.RESULT_ITEM"
            if (r10 == 0) goto L_0x0098
            if (r10 == r4) goto L_0x0094
            if (r10 == r2) goto L_0x0090
            goto L_0x009b
        L_0x0090:
            r9.putExtra(r0, r1)
            goto L_0x009b
        L_0x0094:
            r9.putExtra(r0, r4)
            goto L_0x009b
        L_0x0098:
            r9.putExtra(r0, r5)
        L_0x009b:
            int r10 = r6.V1()
            r8.f2(r10, r1, r9)
        L_0x00a2:
            return
        L_0x00a3:
            ru.ok.messages.views.dialogs.InputDialog r6 = (ru.ok.messages.views.dialogs.InputDialog) r6
            boolean r8 = r6.E1
            if (r8 != 0) goto L_0x00b6
            androidx.fragment.app.a r8 = r6.U1(r4)
            if (r8 == 0) goto L_0x00b6
            int r9 = r6.V1()
            r8.f2(r9, r5, r3)
        L_0x00b6:
            r6.E1 = r4
            return
        L_0x00b9:
            ru.ok.messages.views.dialogs.FrgDlgStopLiveLocation r6 = (ru.ok.messages.views.dialogs.FrgDlgStopLiveLocation) r6
            r6.T2(r5, r5)
            return
        L_0x00bf:
            ru.ok.messages.views.dialogs.FrgDlgSendingFile r6 = (ru.ok.messages.views.dialogs.FrgDlgSendingFile) r6
            android.os.Bundle r8 = r6.F2()
            java.lang.String r0 = "ru.ok.tamtam.extra.CHECKED_COUNT"
            int r8 = r8.getInt(r0)
            java.lang.Object r0 = r6.b3()
            ru.ok.messages.views.fragments.base.FrgBaseProfile r0 = (ru.ok.messages.views.fragments.base.FrgBaseProfile) r0
            if (r10 != 0) goto L_0x0124
            if (r8 <= 0) goto L_0x00eb
            r0.getClass()
            id3 r8 = defpackage.ym.e()
            qra r8 = (defpackage.qra) r8
            h48 r8 = r8.s()
            sqd r8 = r8.f
            r8.s(r2)
            r0.w3()
            goto L_0x0124
        L_0x00eb:
            r0.getClass()
            id3 r8 = defpackage.ym.e()
            qra r8 = (defpackage.qra) r8
            h48 r8 = r8.s()
            sqd r8 = r8.f
            r8.s(r2)
            n99 r8 = r0.P1
            ru.ok.messages.views.fragments.base.FrgBase r8 = r8.w
            m5 r8 = r8.X2()
            z38 r1 = defpackage.a48.a()
            r1.a = r4
            r2 = 4
            r1.c = r2
            a48 r2 = new a48
            r2.<init>((defpackage.z38) r1)
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<tfb> r6 = defpackage.tfb.class
            r1.<init>(r8, r6)
            java.lang.String r6 = "GalleryActivity:extra_options"
            r1.putExtra(r6, r2)
            r2 = 111(0x6f, float:1.56E-43)
            r8.startActivityForResult(r1, r2)
        L_0x0124:
            if (r10 != r4) goto L_0x0182
            r0.getClass()
            sjd r8 = r0.q1     // Catch:{ Exception -> 0x0165 }
            nd r8 = r8.c()     // Catch:{ Exception -> 0x0165 }
            java.lang.String r10 = "ACTION_FILE_OPEN_PICKER"
            r8.e(r10)     // Catch:{ Exception -> 0x0165 }
            java.util.ArrayList r8 = defpackage.gsg.j     // Catch:{ Exception -> 0x0165 }
            java.lang.String r8 = defpackage.hsg.n     // Catch:{ Exception -> 0x0165 }
            android.content.Intent r8 = new android.content.Intent     // Catch:{ Exception -> 0x0165 }
            java.lang.String r10 = "android.intent.action.GET_CONTENT"
            r8.<init>(r10)     // Catch:{ Exception -> 0x0165 }
            java.lang.String r10 = "android.intent.category.OPENABLE"
            r8.addCategory(r10)     // Catch:{ Exception -> 0x0165 }
            java.lang.String r10 = "*/*"
            r8.setType(r10)     // Catch:{ Exception -> 0x0165 }
            r10 = 116(0x74, float:1.63E-43)
            r0.S2(r8, r10, r3)     // Catch:{ ActivityNotFoundException -> 0x014f }
            goto L_0x0182
        L_0x014f:
            r8 = move-exception
            java.lang.String r10 = "openFiles: "
            defpackage.z68.f(r9, r10, r8)     // Catch:{ Exception -> 0x0165 }
            android.content.Context r8 = r0.G2()     // Catch:{ Exception -> 0x0165 }
            int r9 = defpackage.qad.B5     // Catch:{ Exception -> 0x0165 }
            android.os.Handler r10 = defpackage.hi7.j     // Catch:{ Exception -> 0x0165 }
            java.lang.String r9 = r8.getString(r9)     // Catch:{ Exception -> 0x0165 }
            defpackage.hi7.b0(r5, r8, r9)     // Catch:{ Exception -> 0x0165 }
            goto L_0x0182
        L_0x0165:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r9 = r0.B1
            java.lang.String r10 = "onDlgOpenDirectories, %s"
            defpackage.z68.c(r9, r10, r8)
            android.content.Context r8 = r0.O1()
            int r9 = defpackage.qad.r0
            java.lang.String r9 = r0.S1(r9)
            defpackage.hi7.b0(r5, r8, r9)
        L_0x0182:
            return
        L_0x0183:
            ru.ok.messages.views.dialogs.FrgDlgRestartLocation r6 = (ru.ok.messages.views.dialogs.FrgDlgRestartLocation) r6
            java.lang.Object r8 = r6.b3()
            vh6 r8 = (defpackage.vh6) r8
            android.os.Bundle r9 = r6.x
            java.lang.String r10 = "ru.ok.tamtam.extra.MY_MESSAGE_ID"
            long r9 = r9.getLong(r10)
            android.os.Bundle r0 = r6.x
            java.lang.String r1 = "ru.ok.tamtam.extra.MY_MESSAGE_DURATION"
            long r0 = r0.getLong(r1)
            r8.e0(r9, r0)
            return
        L_0x019f:
            ru.ok.messages.views.dialogs.FrgDlgReportType r6 = (ru.ok.messages.views.dialogs.FrgDlgReportType) r6
            java.lang.Object r8 = r6.b3()
            uh6 r8 = (defpackage.uh6) r8
            if (r10 == 0) goto L_0x01c5
            if (r10 == r4) goto L_0x01bf
            if (r10 == r2) goto L_0x01b9
            if (r10 == r0) goto L_0x01b3
            r8.C0(r3)
            goto L_0x01ca
        L_0x01b3:
            z93 r9 = defpackage.z93.FAKE
            r8.C0(r9)
            goto L_0x01ca
        L_0x01b9:
            z93 r9 = defpackage.z93.EXTREMISM
            r8.C0(r9)
            goto L_0x01ca
        L_0x01bf:
            z93 r9 = defpackage.z93.PORNO
            r8.C0(r9)
            goto L_0x01ca
        L_0x01c5:
            z93 r9 = defpackage.z93.SPAM
            r8.C0(r9)
        L_0x01ca:
            return
        L_0x01cb:
            ru.ok.messages.views.dialogs.FrgDlgPinAutoLock r6 = (ru.ok.messages.views.dialogs.FrgDlgPinAutoLock) r6
            androidx.fragment.app.a r8 = r6.G0
            if (r8 == 0) goto L_0x01d4
            r3 = r8
            ru.ok.messages.settings.FrgPinLockSettings r3 = (ru.ok.messages.settings.FrgPinLockSettings) r3
        L_0x01d4:
            if (r3 == 0) goto L_0x0205
            long[] r8 = ru.ok.messages.views.dialogs.FrgDlgPinAutoLock.F1
            r8 = r8[r10]
            id3 r10 = defpackage.ym.e()
            qra r10 = (defpackage.qra) r10
            nd r10 = r10.c()
            r0 = 0
            long r0 = java.lang.Math.max(r0, r8)
            r4 = 60000(0xea60, double:2.9644E-319)
            long r0 = r0 / r4
            int r0 = (int) r0
            long r0 = (long) r0
            java.lang.String r2 = "PASSCODE_AUTOLOCK"
            r10.h(r0, r2)
            nlb r10 = r3.E1
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            java.lang.String r9 = "pinLock.timeout"
            hq r10 = r10.c
            r10.k(r9, r8)
            r3.k3()
        L_0x0205:
            return
        L_0x0206:
            ru.ok.messages.views.dialogs.FrgDlgMoveOwnerConfirm r6 = (ru.ok.messages.views.dialogs.FrgDlgMoveOwnerConfirm) r6
            r6.T2(r5, r5)
            return
        L_0x020c:
            ru.ok.messages.views.dialogs.FrgDlgLangChoose r6 = (ru.ok.messages.views.dialogs.FrgDlgLangChoose) r6
            r6.T2(r5, r5)
            return
        L_0x0212:
            ru.ok.messages.views.dialogs.FrgDlgFavoriteStickersLimit r6 = (ru.ok.messages.views.dialogs.FrgDlgFavoriteStickersLimit) r6
            java.lang.Object r8 = r6.b3()
            hh6 r8 = (defpackage.hh6) r8
            r8.J0()
            return
        L_0x021e:
            ru.ok.messages.views.dialogs.FrgDlgDeleteChat r6 = (ru.ok.messages.views.dialogs.FrgDlgDeleteChat) r6
            androidx.fragment.app.c r8 = r6.Q1()
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            java.lang.String r10 = "ru.ok.messages.views.dialogs.FrgDlgDeleteChat"
            r8.f0(r10, r9)
            java.lang.Object r8 = r6.b3()
            eh6 r8 = (defpackage.eh6) r8
            android.os.Bundle r9 = r6.x
            java.lang.String r10 = "ru.ok.tamtam.extra.CHAT_ID"
            long r9 = r9.getLong(r10)
            r8.I(r9)
            return
        L_0x0240:
            ru.ok.messages.views.dialogs.FrgDlgConstructorSendConfirmation r6 = (ru.ok.messages.views.dialogs.FrgDlgConstructorSendConfirmation) r6
            if (r10 == 0) goto L_0x025c
            if (r10 == r4) goto L_0x0254
            if (r10 == r2) goto L_0x024c
            r6.getClass()
            return
        L_0x024c:
            java.lang.Object r8 = r6.b3()
            defpackage.rae.w(r8)
            throw r3
        L_0x0254:
            java.lang.Object r8 = r6.b3()
            defpackage.rae.w(r8)
            throw r3
        L_0x025c:
            java.lang.Object r8 = r6.b3()
            defpackage.rae.w(r8)
            throw r3
        L_0x0264:
            ru.ok.messages.views.dialogs.FrgDlgChatsNotification r6 = (ru.ok.messages.views.dialogs.FrgDlgChatsNotification) r6
            androidx.fragment.app.a r8 = r6.G0
            if (r8 == 0) goto L_0x026d
            r3 = r8
            ch6 r3 = (defpackage.ch6) r3
        L_0x026d:
            if (r3 == 0) goto L_0x027b
            if (r10 == 0) goto L_0x0275
            if (r10 == r4) goto L_0x0278
            if (r10 == r2) goto L_0x0277
        L_0x0275:
            r2 = r5
            goto L_0x0278
        L_0x0277:
            r2 = r4
        L_0x0278:
            r3.v0(r2)
        L_0x027b:
            return
        L_0x027c:
            ru.ok.messages.views.dialogs.FrgDlgChatMemberDelete r6 = (ru.ok.messages.views.dialogs.FrgDlgChatMemberDelete) r6
            bh6 r8 = r6.F1
            if (r8 == 0) goto L_0x02c4
            java.lang.Object r8 = r6.b3()
            ah6 r8 = (defpackage.ah6) r8
            bh6 r9 = r6.F1
            androidx.appcompat.widget.AppCompatCheckBox r10 = r9.b
            boolean r10 = r10.isChecked()
            if (r10 != 0) goto L_0x0294
        L_0x0292:
            r1 = r5
            goto L_0x02a6
        L_0x0294:
            android.widget.RadioGroup r9 = r9.c
            int r9 = r9.getCheckedRadioButtonId()
            int r10 = defpackage.lic.layout_member_menu_radio__delete_1_day
            if (r9 != r10) goto L_0x02a2
            r1 = 86400(0x15180, float:1.21072E-40)
            goto L_0x02a6
        L_0x02a2:
            int r10 = defpackage.lic.layout_member_menu_radio__delete_all
            if (r9 != r10) goto L_0x0292
        L_0x02a6:
            boolean r9 = r6.H1
            if (r9 == 0) goto L_0x02b0
            long r9 = r6.G1
            r8.M(r1, r9)
            goto L_0x02b5
        L_0x02b0:
            long r9 = r6.G1
            r8.t1(r1, r9)
        L_0x02b5:
            id3 r8 = defpackage.ym.e()
            qra r8 = (defpackage.qra) r8
            nd r8 = r8.c()
            java.lang.String r9 = "ACTION_CHAT_MEMBER_DELETE_WITH_MESSAGES"
            r8.c(r1, r9)
        L_0x02c4:
            return
        L_0x02c5:
            ru.ok.messages.views.dialogs.FrgDlgAudioTracksPicker r6 = (ru.ok.messages.views.dialogs.FrgDlgAudioTracksPicker) r6
            java.lang.Object r8 = r6.b3()
            ru.ok.messages.media.attaches.fragments.FrgAttachVideo r8 = (ru.ok.messages.media.attaches.fragments.FrgAttachVideo) r8
            java.util.ArrayList r9 = r6.F1
            java.lang.Object r9 = r9.get(r10)
            mpf r9 = (defpackage.mpf) r9
            r8.getClass()
            java.lang.Object[] r10 = new java.lang.Object[]{r9}
            java.lang.String r0 = "ru.ok.messages.media.attaches.fragments.FrgAttachVideo"
            java.lang.String r1 = "onAudioTrackSelected %s"
            defpackage.z68.c(r0, r1, r10)
            j0a r8 = r8.N1
            if (r8 != 0) goto L_0x02e9
            goto L_0x0391
        L_0x02e9:
            java.lang.Object[] r10 = new java.lang.Object[]{r9}
            java.lang.String r0 = "j0a"
            java.lang.String r1 = "selectAudioTrack %s"
            defpackage.z68.c(r0, r1, r10)
            boolean r10 = r8.Y()
            if (r10 != 0) goto L_0x02fc
            goto L_0x0391
        L_0x02fc:
            l20 r10 = r8.v0
            if (r10 == 0) goto L_0x0318
            ha9 r0 = r8.Z
            if (r0 == 0) goto L_0x0318
            int r1 = r9.z
            fa9 r2 = r8.x
            r2.getClass()
            fc5 r3 = new fc5
            int r4 = r9.y
            r7 = 5
            r3.<init>(r1, r4, r7)
            java.lang.String r10 = r10.q
            r2.u(r0, r10, r3)
        L_0x0318:
            ju8 r8 = r8.b
            m48 r8 = (defpackage.m48) r8
            f4g r10 = r8.f
            if (r10 != 0) goto L_0x0322
            goto L_0x0391
        L_0x0322:
            sb5 r8 = r8.b
            r8.getClass()
            java.lang.Object[] r10 = new java.lang.Object[]{r9}
            java.lang.String r0 = "sb5"
            java.lang.String r1 = "selectAudioTrack: %s"
            defpackage.z68.c(r0, r1, r10)
            defpackage.sb5.u()
            mpf r10 = defpackage.mpf.X
            ic3 r8 = r8.b
            java.lang.Object r0 = r8.a
            rj4 r0 = (defpackage.rj4) r0
            if (r9 != r10) goto L_0x036f
            me8 r9 = r0.c
            if (r9 != 0) goto L_0x0344
            goto L_0x0391
        L_0x0344:
            android.util.Pair r8 = r8.r(r9)
            java.lang.Object r8 = r8.second
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r8 >= 0) goto L_0x0353
            goto L_0x0391
        L_0x0353:
            fj4 r9 = r0.b()
            android.util.SparseArray r10 = r9.M
            java.lang.Object r1 = r10.get(r8)
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L_0x036b
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0368
            goto L_0x036b
        L_0x0368:
            r10.remove(r8)
        L_0x036b:
            r0.h(r9)
            goto L_0x0391
        L_0x036f:
            me8 r8 = r0.c
            if (r8 != 0) goto L_0x0374
            goto L_0x0391
        L_0x0374:
            gj4 r10 = new gj4
            int r1 = r9.y
            int r2 = r9.z
            int[] r2 = new int[]{r2}
            r10.<init>(r2, r1, r5)
            tpf[] r8 = r8.c
            int r9 = r9.x
            r8 = r8[r9]
            fj4 r1 = r0.b()
            r1.e(r9, r8, r10)
            r0.h(r1)
        L_0x0391:
            r6.T2(r5, r5)
            return
        L_0x0395:
            ru.ok.messages.views.dialogs.ConfirmationOkDialog r6 = (ru.ok.messages.views.dialogs.ConfirmationOkDialog) r6
            androidx.fragment.app.c r8 = r6.Q1()
            ch3 r9 = defpackage.ch3.a
            java.lang.String r10 = "OK_CLICKED"
            kotlin.Pair r9 = kotlin.TuplesKt.to(r10, r9)
            kotlin.Pair[] r9 = new kotlin.Pair[]{r9}
            android.os.Bundle r9 = defpackage.o54.f(r9)
            java.lang.String r10 = "ru.ok.tamtam.dialogs.CONFIRMATION_OK_REQUEST_KEY"
            r8.f0(r10, r9)
            androidx.fragment.app.a r8 = r6.U1(r4)
            if (r8 == 0) goto L_0x03bd
            int r9 = r6.V1()
            r8.f2(r9, r1, r3)
        L_0x03bd:
            return
        L_0x03be:
            android.content.Context r6 = (android.content.Context) r6
            java.util.ArrayList r8 = defpackage.gsg.j
            java.lang.String r8 = "package:"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03e3 }
            r10.<init>(r8)     // Catch:{ Exception -> 0x03e3 }
            java.lang.String r8 = r6.getPackageName()     // Catch:{ Exception -> 0x03e3 }
            r10.append(r8)     // Catch:{ Exception -> 0x03e3 }
            java.lang.String r8 = r10.toString()     // Catch:{ Exception -> 0x03e3 }
            android.net.Uri r8 = android.net.Uri.parse(r8)     // Catch:{ Exception -> 0x03e3 }
            android.content.Intent r10 = new android.content.Intent     // Catch:{ Exception -> 0x03e3 }
            java.lang.String r0 = "android.settings.MANAGE_UNKNOWN_APP_SOURCES"
            r10.<init>(r0, r8)     // Catch:{ Exception -> 0x03e3 }
            r6.startActivity(r10)     // Catch:{ Exception -> 0x03e3 }
            goto L_0x03eb
        L_0x03e3:
            r8 = move-exception
            java.lang.String r10 = r8.getMessage()
            defpackage.z68.f(r9, r10, r8)
        L_0x03eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d10.onClick(android.content.DialogInterface, int):void");
    }

    public /* synthetic */ d10(FrgDlgConstructorSendConfirmation frgDlgConstructorSendConfirmation, nd ndVar) {
        this.a = 5;
        this.b = frgDlgConstructorSendConfirmation;
    }
}
