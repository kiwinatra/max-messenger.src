package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import one.me.calls.ui.ui.incoming.CallIncomingScreen;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.main.MainScreen;
import one.me.profile.screens.media.ChatMediaTabWidget;
import org.apache.http.util.LangUtils;
import ru.ok.messages.settings.folders.settings.presentation.FolderSettingsViewModel;
import ru.ok.tamtam.nano.Protos;

/* renamed from: s01  reason: default package */
public final /* synthetic */ class s01 extends FunctionReferenceImpl implements Function0 {
    public final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s01(int i, Object obj) {
        super(0, obj, CallIncomingScreen.class, "acceptCallIfPossible", "acceptCallIfPossible()V", 0);
        this.a = i;
        switch (i) {
            case 4:
                super(0, obj, ChatMediaTabWidget.class, "getCurrentScreen", "getCurrentScreen()Lone/me/sdk/statistics/screen/Screen;", 0);
                return;
            case 7:
                super(0, obj, ChatsListSearchScreen.class, "getCurrentScreen", "getCurrentScreen()Lone/me/sdk/statistics/screen/Screen;", 0);
                return;
            case 8:
                super(0, obj, ol3.class, "singleLineWithButton", "singleLineWithButton()Landroidx/constraintlayout/widget/ConstraintSet;", 0);
                return;
            case 9:
                super(0, obj, ol3.class, "singleLineWithoutAvatar", "singleLineWithoutAvatar()Landroidx/constraintlayout/widget/ConstraintSet;", 0);
                return;
            case 10:
                super(0, obj, ol3.class, "singleLineWithoutButton", "singleLineWithoutButton()Landroidx/constraintlayout/widget/ConstraintSet;", 0);
                return;
            case 11:
                super(0, obj, ol3.class, "twoLineWithButton", "twoLineWithButton()Landroidx/constraintlayout/widget/ConstraintSet;", 0);
                return;
            case 12:
                super(0, obj, ol3.class, "linesWithCallButtons", "linesWithCallButtons()Landroidx/constraintlayout/widget/ConstraintSet;", 0);
                return;
            case 13:
                super(0, obj, ol3.class, "twoLineWithoutAvatar", "twoLineWithoutAvatar()Landroidx/constraintlayout/widget/ConstraintSet;", 0);
                return;
            case Protos.Attaches.Attach.LOCATION:
                super(0, obj, ol3.class, "twoLineWithoutButton", "twoLineWithoutButton()Landroidx/constraintlayout/widget/ConstraintSet;", 0);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA:
                super(0, obj, ol3.class, "twoLineWithoutButtonWithBigAvatar", "twoLineWithoutButtonWithBigAvatar()Landroidx/constraintlayout/widget/ConstraintSet;", 0);
                return;
            case 16:
                super(0, obj, ol3.class, "allWithRadioButton", "allWithRadioButton()Landroidx/constraintlayout/widget/ConstraintSet;", 0);
                return;
            case LangUtils.HASH_SEED:
                super(0, obj, nt3.class, "onButtonClick", "onButtonClick()V", 0);
                return;
            case 18:
                super(0, obj, nt3.class, "onButtonClick", "onButtonClick()V", 0);
                return;
            case 22:
                super(0, obj, my5.class, "onAddChatsClick", "onAddChatsClick()V", 0);
                return;
            case 25:
                super(0, obj, MainScreen.class, "getCurrentScreen", "getCurrentScreen()Lone/me/sdk/statistics/screen/Screen;", 0);
                return;
            case 26:
                super(0, obj, MainScreen.class, "getCurrentParams", "getCurrentParams()Lone/me/sdk/statistics/params/Params;", 0);
                return;
            case 27:
                super(0, obj, MediaKeyboardWidget.class, "showBottomPanel", "showBottomPanel()V", 0);
                return;
            case 28:
                super(0, obj, MediaKeyboardWidget.class, "hideBottomPanel", "hideBottomPanel()V", 0);
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r0v39, types: [zx3] */
    /* JADX WARNING: type inference failed for: r4v9, types: [t5a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r12 = this;
            r0 = 3
            r1 = 200(0xc8, double:9.9E-322)
            r3 = 2
            r4 = 0
            r5 = 1
            r6 = 4
            r7 = 0
            int r8 = r12.a
            switch(r8) {
                case 0: goto L_0x03c1;
                case 1: goto L_0x039c;
                case 2: goto L_0x032a;
                case 3: goto L_0x02f1;
                case 4: goto L_0x02e8;
                case 5: goto L_0x02df;
                case 6: goto L_0x02d6;
                case 7: goto L_0x02b2;
                case 8: goto L_0x02a9;
                case 9: goto L_0x026d;
                case 10: goto L_0x0264;
                case 11: goto L_0x025b;
                case 12: goto L_0x0252;
                case 13: goto L_0x0249;
                case 14: goto L_0x0240;
                case 15: goto L_0x0237;
                case 16: goto L_0x01c7;
                case 17: goto L_0x01bd;
                case 18: goto L_0x01b3;
                case 19: goto L_0x01a0;
                case 20: goto L_0x018d;
                case 21: goto L_0x017a;
                case 22: goto L_0x014f;
                case 23: goto L_0x0126;
                case 24: goto L_0x0119;
                case 25: goto L_0x00e9;
                case 26: goto L_0x00bb;
                case 27: goto L_0x0074;
                case 28: goto L_0x001c;
                default: goto L_0x000d;
            }
        L_0x000d:
            java.lang.Object r12 = r12.receiver
            edb r12 = (defpackage.edb) r12
            java.lang.String[] r0 = defpackage.edb.h
            boolean r12 = r12.b(r0)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            return r12
        L_0x001c:
            java.lang.Object r12 = r12.receiver
            one.me.keyboardmedia.MediaKeyboardWidget r12 = (one.me.keyboardmedia.MediaKeyboardWidget) r12
            android.animation.ObjectAnimator r0 = r12.y0
            if (r0 == 0) goto L_0x002b
            boolean r0 = r0.isRunning()
            if (r0 != r5) goto L_0x002b
            goto L_0x0071
        L_0x002b:
            android.view.View r0 = r12.d0()
            float r0 = r0.getTranslationY()
            android.view.View r4 = r12.d0()
            int r4 = r4.getHeight()
            float r4 = (float) r4
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0041
            goto L_0x0071
        L_0x0041:
            android.animation.ObjectAnimator r0 = r12.y0
            if (r0 == 0) goto L_0x0048
            r0.cancel()
        L_0x0048:
            android.view.View r0 = r12.d0()
            float r0 = r0.getTranslationY()
            android.view.View r4 = r12.d0()
            int r4 = r4.getHeight()
            float r4 = (float) r4
            android.view.View r6 = r12.d0()
            android.util.Property r8 = android.view.View.TRANSLATION_Y
            float[] r3 = new float[r3]
            r3[r7] = r0
            r3[r5] = r4
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r6, r8, r3)
            r0.setDuration(r1)
            r0.start()
            r12.y0 = r0
        L_0x0071:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        L_0x0074:
            java.lang.Object r12 = r12.receiver
            one.me.keyboardmedia.MediaKeyboardWidget r12 = (one.me.keyboardmedia.MediaKeyboardWidget) r12
            android.animation.ObjectAnimator r0 = r12.y0
            if (r0 == 0) goto L_0x0083
            boolean r0 = r0.isRunning()
            if (r0 != r5) goto L_0x0083
            goto L_0x00b8
        L_0x0083:
            android.view.View r0 = r12.d0()
            float r0 = r0.getTranslationY()
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0091
            goto L_0x00b8
        L_0x0091:
            android.animation.ObjectAnimator r0 = r12.y0
            if (r0 == 0) goto L_0x0098
            r0.cancel()
        L_0x0098:
            android.view.View r0 = r12.d0()
            float r0 = r0.getTranslationY()
            android.view.View r6 = r12.d0()
            android.util.Property r8 = android.view.View.TRANSLATION_Y
            float[] r3 = new float[r3]
            r3[r7] = r0
            r3[r5] = r4
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r6, r8, r3)
            r0.setDuration(r1)
            r0.start()
            r12.y0 = r0
        L_0x00b8:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        L_0x00bb:
            java.lang.Object r12 = r12.receiver
            one.me.main.MainScreen r12 = (one.me.main.MainScreen) r12
            kotlin.reflect.KProperty[] r0 = one.me.main.MainScreen.x
            uc8 r0 = r12.h0()
            spa r0 = r0.o
            e9d r12 = r12.f0()
            if (r12 != 0) goto L_0x00d0
            h8b r12 = defpackage.h8b.e
            goto L_0x00e8
        L_0x00d0:
            java.lang.String r0 = r0.d
            zx3 r12 = r12.g(r0)
            boolean r0 = r12 instanceof defpackage.t5a
            if (r0 == 0) goto L_0x00dd
            r4 = r12
            t5a r4 = (defpackage.t5a) r4
        L_0x00dd:
            if (r4 != 0) goto L_0x00e2
            h8b r12 = defpackage.h8b.e
            goto L_0x00e8
        L_0x00e2:
            one.me.chats.tab.ChatsTabWidget r4 = (one.me.chats.tab.ChatsTabWidget) r4
            h8b r12 = r4.h0()
        L_0x00e8:
            return r12
        L_0x00e9:
            java.lang.Object r12 = r12.receiver
            one.me.main.MainScreen r12 = (one.me.main.MainScreen) r12
            kotlin.reflect.KProperty[] r0 = one.me.main.MainScreen.x
            uc8 r0 = r12.h0()
            spa r0 = r0.o
            e9d r1 = r12.f0()
            if (r1 != 0) goto L_0x0100
            jgd r12 = r12.g0()
            goto L_0x0118
        L_0x0100:
            java.lang.String r0 = r0.d
            zx3 r0 = r1.g(r0)
            boolean r1 = r0 instanceof defpackage.u5a
            if (r1 == 0) goto L_0x010d
            r4 = r0
            u5a r4 = (defpackage.u5a) r4
        L_0x010d:
            if (r4 != 0) goto L_0x0114
            jgd r12 = r12.g0()
            goto L_0x0118
        L_0x0114:
            jgd r12 = r4.m()
        L_0x0118:
            return r12
        L_0x0119:
            java.lang.Object r12 = r12.receiver
            java.util.concurrent.atomic.AtomicBoolean r12 = (java.util.concurrent.atomic.AtomicBoolean) r12
            boolean r12 = r12.get()
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            return r12
        L_0x0126:
            java.lang.Object r12 = r12.receiver
            ru.ok.messages.settings.folders.settings.presentation.FolderSettingsViewModel r12 = (ru.ok.messages.settings.folders.settings.presentation.FolderSettingsViewModel) r12
            xme r0 = r12.i
            java.lang.Object r1 = r0.getValue()
            y46 r1 = (defpackage.y46) r1
            tf6 r2 = r1.c
            if (r2 == 0) goto L_0x013d
            y46 r1 = defpackage.y46.a(r1)
            r0.m(r4, r1)
        L_0x013d:
            o85 r0 = new o85
            v46 r1 = defpackage.v46.a
            r0.<init>(r1)
            xme r12 = r12.k
            r12.getClass()
            r12.m(r4, r0)
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        L_0x014f:
            java.lang.Object r12 = r12.receiver
            my5 r12 = (defpackage.my5) r12
            one.me.folders.edit.FolderEditScreen r12 = (one.me.folders.edit.FolderEditScreen) r12
            m06 r12 = r12.d0()
            gaf r0 = r12.o
            osa r0 = (defpackage.osa) r0
            q04 r0 = r0.a()
            f14 r1 = defpackage.f14.b
            d06 r2 = new d06
            r2.<init>(r12, r4)
            jx3 r3 = r12.a
            aje r0 = defpackage.ev0.u(r3, r0, r1, r2)
            kotlin.reflect.KProperty[] r1 = defpackage.m06.D0
            r1 = r1[r7]
            wie r2 = r12.B0
            r2.setValue(r12, r1, r0)
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        L_0x017a:
            java.lang.Object r12 = r12.receiver
            x23 r12 = (defpackage.x23) r12
            a33 r12 = (defpackage.a33) r12
            ls7 r12 = r12.g
            java.lang.String r0 = "web_app:ssl_check"
            boolean r12 = r12.getBoolean(r0, r7)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            return r12
        L_0x018d:
            java.lang.Object r12 = r12.receiver
            x23 r12 = (defpackage.x23) r12
            a33 r12 = (defpackage.a33) r12
            ls7 r12 = r12.g
            java.lang.String r0 = "app.enable_in_app_review_not_from_market_build"
            boolean r12 = r12.getBoolean(r0, r7)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            return r12
        L_0x01a0:
            java.lang.Object r12 = r12.receiver
            x23 r12 = (defpackage.x23) r12
            a33 r12 = (defpackage.a33) r12
            ls7 r12 = r12.g
            java.lang.String r0 = "app.disable_in_app_review_time_condition"
            boolean r12 = r12.getBoolean(r0, r7)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            return r12
        L_0x01b3:
            java.lang.Object r12 = r12.receiver
            nt3 r12 = (defpackage.nt3) r12
            r12.I()
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        L_0x01bd:
            java.lang.Object r12 = r12.receiver
            nt3 r12 = (defpackage.nt3) r12
            r12.I()
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        L_0x01c7:
            java.lang.Object r12 = r12.receiver
            ol3 r12 = (defpackage.ol3) r12
            r12.getClass()
            pj3 r0 = new pj3
            r0.<init>()
            r0.d(r12)
            kotlin.Lazy r1 = r12.M0
            boolean r2 = defpackage.y7e.L(r1)
            one.me.sdk.uikit.common.avatar.OneMeAvatarView r12 = r12.E0
            if (r2 == 0) goto L_0x01ff
            java.lang.Object r2 = r1.getValue()
            androidx.appcompat.widget.AppCompatCheckBox r2 = (androidx.appcompat.widget.AppCompatCheckBox) r2
            int r2 = r2.getId()
            ni0 r3 = new ni0
            r3.<init>((java.lang.Object) r0, (int) r2, (int) r6)
            r3.R(r7)
            r3.b(r7)
            r3.P(r7)
            int r2 = r12.getId()
            r3.v(r2)
        L_0x01ff:
            int r12 = r12.getId()
            ni0 r2 = new ni0
            r2.<init>((java.lang.Object) r0, (int) r12, (int) r6)
            r2.R(r7)
            r2.b(r7)
            boolean r12 = defpackage.y7e.L(r1)
            if (r12 == 0) goto L_0x0233
            java.lang.Object r12 = r1.getValue()
            androidx.appcompat.widget.AppCompatCheckBox r12 = (androidx.appcompat.widget.AppCompatCheckBox) r12
            int r12 = r12.getId()
            ila r12 = r2.O(r12)
            r1 = 12
            float r1 = (float) r1
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            defpackage.tr1.u(r1, r2, r12)
            goto L_0x0236
        L_0x0233:
            r2.P(r7)
        L_0x0236:
            return r0
        L_0x0237:
            java.lang.Object r12 = r12.receiver
            ol3 r12 = (defpackage.ol3) r12
            pj3 r12 = defpackage.ol3.T(r12)
            return r12
        L_0x0240:
            java.lang.Object r12 = r12.receiver
            ol3 r12 = (defpackage.ol3) r12
            pj3 r12 = defpackage.ol3.S(r12)
            return r12
        L_0x0249:
            java.lang.Object r12 = r12.receiver
            ol3 r12 = (defpackage.ol3) r12
            pj3 r12 = defpackage.ol3.R(r12)
            return r12
        L_0x0252:
            java.lang.Object r12 = r12.receiver
            ol3 r12 = (defpackage.ol3) r12
            pj3 r12 = defpackage.ol3.N(r12)
            return r12
        L_0x025b:
            java.lang.Object r12 = r12.receiver
            ol3 r12 = (defpackage.ol3) r12
            pj3 r12 = defpackage.ol3.Q(r12)
            return r12
        L_0x0264:
            java.lang.Object r12 = r12.receiver
            ol3 r12 = (defpackage.ol3) r12
            pj3 r12 = defpackage.ol3.P(r12)
            return r12
        L_0x026d:
            java.lang.Object r12 = r12.receiver
            ol3 r12 = (defpackage.ol3) r12
            r12.getClass()
            pj3 r1 = new pj3
            r1.<init>()
            r1.d(r12)
            androidx.appcompat.widget.AppCompatTextView r12 = r12.F0
            int r12 = r12.getId()
            r1.e(r12, r0, r7, r0)
            r1.e(r12, r6, r7, r6)
            r0 = 6
            r1.e(r12, r0, r7, r0)
            ila r2 = new ila
            r2.<init>(r1, r0, r12, r6)
            r2.e(r7)
            r0 = 7
            r1.e(r12, r0, r7, r0)
            ila r2 = new ila
            r2.<init>(r1, r0, r12, r6)
            r2.e(r7)
            kj3 r12 = r1.j(r12)
            lj3 r12 = r12.d
            r12.l0 = r5
            return r1
        L_0x02a9:
            java.lang.Object r12 = r12.receiver
            ol3 r12 = (defpackage.ol3) r12
            pj3 r12 = defpackage.ol3.O(r12)
            return r12
        L_0x02b2:
            java.lang.Object r12 = r12.receiver
            one.me.chats.search.ChatsListSearchScreen r12 = (one.me.chats.search.ChatsListSearchScreen) r12
            kotlin.reflect.KProperty[] r1 = one.me.chats.search.ChatsListSearchScreen.F0
            ov2 r12 = r12.d0()
            etc r12 = r12.D0
            ome r12 = r12.a
            java.lang.Object r12 = r12.getValue()
            vu2 r12 = (defpackage.vu2) r12
            uu2 r12 = r12.a
            int r12 = r12.ordinal()
            if (r12 == r0) goto L_0x02d3
            if (r12 == r6) goto L_0x02d3
            jgd r12 = defpackage.jgd.CHATS_LIST_SEARCH_INITIAL
            goto L_0x02d5
        L_0x02d3:
            jgd r12 = defpackage.jgd.CHATS_LIST_SEARCH_RESULT
        L_0x02d5:
            return r12
        L_0x02d6:
            java.lang.Object r12 = r12.receiver
            lk2 r12 = (defpackage.lk2) r12
            bs5 r12 = r12.l()
            return r12
        L_0x02df:
            java.lang.Object r12 = r12.receiver
            lk2 r12 = (defpackage.lk2) r12
            bs5 r12 = r12.l()
            return r12
        L_0x02e8:
            java.lang.Object r12 = r12.receiver
            one.me.profile.screens.media.ChatMediaTabWidget r12 = (one.me.profile.screens.media.ChatMediaTabWidget) r12
            jgd r12 = one.me.profile.screens.media.ChatMediaTabWidget.c0(r12)
            return r12
        L_0x02f1:
            java.lang.Object r12 = r12.receiver
            q32 r12 = (defpackage.q32) r12
            kotlin.Lazy r0 = r12.c
            java.lang.Object r0 = r0.getValue()
            qx2 r0 = (defpackage.qx2) r0
            long r1 = r12.b
            my2 r0 = (defpackage.my2) r0
            etc r0 = r0.o(r1)
            on2 r1 = new on2
            r2 = 28
            r1.<init>(r0, r2)
            pc r0 = new pc
            r2 = 24
            r0.<init>(r1, r2)
            kotlin.Lazy r12 = r12.v
            java.lang.Object r12 = r12.getValue()
            gaf r12 = (defpackage.gaf) r12
            osa r12 = (defpackage.osa) r12
            q04 r12 = r12.b()
            bs5 r12 = defpackage.bs0.F(r0, r12)
            bs5 r12 = defpackage.bs0.w(r12)
            return r12
        L_0x032a:
            java.lang.Object r12 = r12.receiver
            one.me.calls.ui.ui.incoming.CallIncomingScreen r12 = (one.me.calls.ui.ui.incoming.CallIncomingScreen) r12
            u9a r0 = one.me.calls.ui.ui.incoming.CallIncomingScreen.x
            kotlin.Lazy r0 = r12.o
            java.lang.Object r0 = r0.getValue()
            edb r0 = (defpackage.edb) r0
            java.lang.String[] r2 = defpackage.edb.h
            boolean r0 = r0.b(r2)
            if (r0 != 0) goto L_0x0392
            kotlin.Lazy r0 = r12.v
            java.lang.Object r0 = r0.getValue()
            r3 = r0
            tq1 r3 = (defpackage.tq1) r3
            dp1 r0 = r12.a
            mp1 r0 = (defpackage.mp1) r0
            s44 r1 = r0.j()
            java.lang.String r5 = r1.c
            s44 r0 = r0.j()
            boolean r10 = r0.h
            r3.getClass()
            r7 = 0
            r11 = 56
            java.lang.String r4 = "REQUEST_PERMISSION_MIC"
            java.lang.String r6 = "BEFORE_JOIN"
            r8 = 0
            r9 = 0
            defpackage.tq1.a(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            kotlin.Lazy r0 = r12.o
            java.lang.Object r0 = r0.getValue()
            edb r0 = (defpackage.edb) r0
            kotlin.Lazy r12 = r12.w
            java.lang.Object r12 = r12.getValue()
            r1 = r12
            eng r1 = (defpackage.eng) r1
            int r5 = defpackage.sqa.c
            r0.getClass()
            int r4 = defpackage.bmc.permissions_audio_title
            int r6 = defpackage.aza.e
            boolean r12 = defpackage.edb.i(r1, r2)
            r3 = 160(0xa0, float:2.24E-43)
            if (r12 == 0) goto L_0x038e
            r1.c(r2, r3, r4, r5, r6)
            goto L_0x0399
        L_0x038e:
            r0.f(r1, r2, r3)
            goto L_0x0399
        L_0x0392:
            h81 r12 = r12.c0()
            r12.j()
        L_0x0399:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        L_0x039c:
            java.lang.Object r12 = r12.receiver
            r0 = r12
            h81 r0 = (defpackage.h81) r0
            nw6 r12 = defpackage.nw6.c
            dp1 r1 = r0.v
            mp1 r1 = (defpackage.mp1) r1
            r1.u(r12)
        L_0x03aa:
            xme r12 = r0.z
            java.lang.Object r1 = r12.getValue()
            r2 = r1
            f81 r2 = (defpackage.f81) r2
            e81 r2 = new e81
            r2.<init>(r7)
            boolean r12 = r12.b(r1, r2)
            if (r12 == 0) goto L_0x03aa
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        L_0x03c1:
            java.lang.Object r12 = r12.receiver
            x23 r12 = (defpackage.x23) r12
            a33 r12 = (defpackage.a33) r12
            ls7 r12 = r12.g
            java.lang.String r0 = "app.calls_sdk.logging.webrtc"
            boolean r12 = r12.getBoolean(r0, r7)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s01.invoke():java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s01(h81 h81) {
        super(0, h81, h81.class, "declineCall", "declineCall()V", 0);
        this.a = 1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s01(q32 q32) {
        super(0, q32, q32.class, "getButtonActions", "getButtonActions()Lkotlinx/coroutines/flow/Flow;", 0);
        this.a = 3;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s01(lk2 lk2, int i) {
        super(0, lk2, lk2.class, "getMemberListActions", "getMemberListActions()Lkotlinx/coroutines/flow/Flow;", 0);
        this.a = i;
        switch (i) {
            case 6:
                super(0, lk2, lk2.class, "getMemberListActions", "getMemberListActions()Lkotlinx/coroutines/flow/Flow;", 0);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s01(x23 x23, int i) {
        super(0, x23, x23.class, "isWebRtcLoggingEnabled", "isWebRtcLoggingEnabled()Z", 0);
        this.a = i;
        switch (i) {
            case 19:
                super(0, x23, x23.class, "isDisableInAppReviewTimeCondition", "isDisableInAppReviewTimeCondition()Z", 0);
                return;
            case 20:
                super(0, x23, x23.class, "isEnableInAppReviewNotFromMarketBuild", "isEnableInAppReviewNotFromMarketBuild()Z", 0);
                return;
            case 21:
                super(0, x23, x23.class, "isDisableWebAppSsl", "isDisableWebAppSsl()Z", 0);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s01(edb edb) {
        super(0, edb, edb.class, "checkAudioPermission", "checkAudioPermission()Z", 0);
        this.a = 29;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s01(AtomicBoolean atomicBoolean) {
        super(0, atomicBoolean, AtomicBoolean.class, "get", "get()Z", 0);
        this.a = 24;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s01(FolderSettingsViewModel folderSettingsViewModel) {
        super(0, folderSettingsViewModel, FolderSettingsViewModel.class, "onCreateFolderClick", "onCreateFolderClick()V", 0);
        this.a = 23;
    }
}
