package ru.ok.messages.views;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import ru.ok.messages.views.fragments.base.FrgBaseProfile;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ok/messages/views/ProfileFragment;", "Landroidx/fragment/app/a;", "Lvde;", "Lih6;", "Llpe;", "<init>", "()V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nProfileFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProfileFragment.kt\nru/ok/messages/views/ProfileFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentManager.kt\nandroidx/fragment/app/FragmentManagerKt\n*L\n1#1,206:1\n172#2,9:207\n28#3,12:216\n*S KotlinDebug\n*F\n+ 1 ProfileFragment.kt\nru/ok/messages/views/ProfileFragment\n*L\n53#1:207,9\n124#1:216,12\n*E\n"})
public final class ProfileFragment extends a implements vde, ih6, lpe {
    public FrgBaseProfile l1;
    public final bbg m1 = new bbg(Reflection.getOrCreateKotlinClass(ProfileViewModel.class), (Function0) new tc(18, this), (Function0) new tc(20, this), (Function0) new tc(19, this));
    public final Lazy n1 = LazyKt.lazy(new ifb(8, this));

    public ProfileFragment() {
        super(ujc.fragment_profile);
    }

    public final void A1(int i) {
        ((qra) ryg.x(this)).c().e("SWIPE_BACK_PROFILE");
        new Intent();
        M1();
        b M1 = M1();
        if (M1 != null) {
            M1.overridePendingTransition(0, 0);
        }
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [androidx.fragment.app.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A2(android.view.View r21, android.os.Bundle r22) {
        /*
            r20 = this;
            r6 = r20
            r7 = r22
            int r0 = defpackage.lic.act_profile__slideout
            r1 = r21
            android.view.View r0 = r1.findViewById(r0)
            ru.ok.messages.views.widgets.SlideOutLayout r0 = (ru.ok.messages.views.widgets.SlideOutLayout) r0
            r0.setSlideOutListener(r6)
            bbg r8 = r6.m1
            java.lang.Object r0 = r8.getValue()
            r9 = r0
            ru.ok.messages.views.ProfileViewModel r9 = (ru.ok.messages.views.ProfileViewModel) r9
            q13 r10 = new q13
            androidx.fragment.app.b r0 = r20.M1()
            r1 = r0
            m5 r1 = (defpackage.m5) r1
            androidx.fragment.app.c r2 = r20.Q1()
            id3 r0 = defpackage.ryg.x(r20)
            qra r0 = (defpackage.qra) r0
            r62 r3 = r0.l()
            d6a r4 = new d6a
            id3 r0 = defpackage.ryg.x(r20)
            qra r0 = (defpackage.qra) r0
            nd r0 = r0.c()
            r5 = 9
            r4.<init>((int) r5, (java.lang.Object) r0)
            r0 = r10
            r5 = r20
            r0.<init>((defpackage.m5) r1, (androidx.fragment.app.c) r2, (defpackage.r62) r3, (defpackage.d6a) r4, (defpackage.lpe) r5)
            r9.c = r10
            r0 = 0
            java.lang.String r1 = "ru.ok.messages.views.ProfileFragment"
            r2 = 0
            if (r7 != 0) goto L_0x0200
            android.os.Bundle r3 = r20.F2()
            java.lang.String r4 = "ru.ok.tamtam.extra.PROFILE_TYPE"
            java.lang.String r4 = r3.getString(r4)
            if (r4 == 0) goto L_0x01f8
            java.lang.String r5 = "PROFILE_SETTINGS"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0066
            r4 = 1
            goto L_0x008d
        L_0x0066:
            java.lang.String r5 = "CONTACT"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0070
            r4 = 2
            goto L_0x008d
        L_0x0070:
            java.lang.String r5 = "PHONE"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x007a
            r4 = 3
            goto L_0x008d
        L_0x007a:
            java.lang.String r5 = "SEARCH_CONTACT"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0084
            r4 = 4
            goto L_0x008d
        L_0x0084:
            java.lang.String r5 = "CHAT"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x01ec
            r4 = 5
        L_0x008d:
            int r4 = defpackage.tr1.y(r4)
            java.lang.String r5 = "ru.ok.tamtam.extra.EXTRA_CONTACT_ID"
            java.lang.String r7 = "ru.ok.tamtam.extra.PRIVACY_WARNING"
            if (r4 == 0) goto L_0x01bb
            r8 = 0
            r10 = 1
            if (r4 == r10) goto L_0x0152
            r5 = 2
            if (r4 == r5) goto L_0x0137
            r5 = 3
            if (r4 == r5) goto L_0x011c
            r5 = 4
            if (r4 != r5) goto L_0x0116
            id3 r4 = defpackage.ryg.x(r20)
            qra r4 = (defpackage.qra) r4
            r62 r4 = r4.l()
            android.os.Bundle r5 = r20.F2()
            java.lang.String r7 = "ru.ok.tamtam.extra.CHAT_ID"
            long r10 = r5.getLong(r7, r8)
            a32 r4 = r4.G(r10)
            if (r4 != 0) goto L_0x00ce
            java.lang.String r2 = "Chat is null. Close profile"
            defpackage.z68.f(r1, r2, r0)
            androidx.fragment.app.b r0 = r20.M1()
            if (r0 == 0) goto L_0x00cd
            r0.finish()
        L_0x00cd:
            return
        L_0x00ce:
            boolean r0 = r4.K()
            java.lang.String r4 = "ru.ok.tamtam.extra.EXTRA_CHAT_ID"
            if (r0 == 0) goto L_0x00f0
            android.os.Bundle r0 = r20.F2()
            long r7 = r0.getLong(r7, r8)
            ru.ok.messages.views.fragments.FrgChannelProfile r0 = new ru.ok.messages.views.fragments.FrgChannelProfile
            r0.<init>()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r3.putLong(r4, r7)
            r0.L2(r3)
            goto L_0x01d6
        L_0x00f0:
            android.os.Bundle r0 = r20.F2()
            long r7 = r0.getLong(r7, r8)
            java.lang.String r0 = "ru.ok.tamtam.extra.CHAT_ACCESS_TOKEN"
            java.lang.String r0 = r3.getString(r0)
            ru.ok.messages.views.fragments.FrgChatProfile r3 = new ru.ok.messages.views.fragments.FrgChatProfile
            r3.<init>()
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            r5.putLong(r4, r7)
            java.lang.String r4 = "ru.ok.tamtam.extra.EXTRA_CHAT_ACCESS_TOKEN"
            r5.putString(r4, r0)
            r3.L2(r5)
        L_0x0113:
            r0 = r3
            goto L_0x01d6
        L_0x0116:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x011c:
            java.lang.String r0 = "ru.ok.tamtam.extra.CONTACT_SEARCH"
            java.io.Serializable r0 = r3.getSerializable(r0)
            cs3 r0 = (defpackage.cs3) r0
            ru.ok.messages.views.fragments.FrgContactSearchProfile r3 = new ru.ok.messages.views.fragments.FrgContactSearchProfile
            r3.<init>()
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r5 = "ru.ok.tamtam.extra.CONTACT_SEARCH_RESULT"
            r4.putSerializable(r5, r0)
            r3.L2(r4)
            goto L_0x0113
        L_0x0137:
            java.lang.String r0 = "ru.ok.tamtam.extra.PHONE"
            android.os.Parcelable r0 = r3.getParcelable(r0)
            beb r0 = (defpackage.beb) r0
            ru.ok.messages.views.fragments.FrgPhoneProfile r3 = new ru.ok.messages.views.fragments.FrgPhoneProfile
            r3.<init>()
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r5 = "ru.ok.tamtam.extra.EXTRA_PHONE"
            r4.putParcelable(r5, r0)
            r3.L2(r4)
            goto L_0x0113
        L_0x0152:
            android.os.Bundle r0 = r20.F2()
            java.lang.String r4 = "ru.ok.tamtam.extra.CONTACT_ID"
            long r11 = r0.getLong(r4, r8)
            boolean r0 = r3.getBoolean(r7, r2)
            ru.ok.messages.views.fragments.FrgContactProfile r3 = new ru.ok.messages.views.fragments.FrgContactProfile
            r3.<init>()
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            r13.putLong(r5, r11)
            r13.putBoolean(r7, r0)
            r3.L2(r13)
            id3 r0 = defpackage.ryg.x(r20)
            qra r0 = (defpackage.qra) r0
            km3 r0 = r0.m()
            android.os.Bundle r5 = r20.F2()
            long r4 = r5.getLong(r4, r8)
            vk3 r0 = r0.p(r4, r2)
            if (r0 == 0) goto L_0x0113
            boolean r0 = r0.x()
            if (r0 != r10) goto L_0x0113
            pl6 r0 = new pl6
            java.util.List r17 = kotlin.collections.CollectionsKt.emptyList()
            r16 = 0
            r18 = 0
            r12 = 0
            r13 = 1
            r14 = 1
            r15 = 1
            r19 = 800(0x320, float:1.121E-42)
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            android.os.Bundle r4 = r3.F2()
            java.lang.String r5 = "gallery_mode"
            r4.putParcelable(r5, r0)
            androidx.fragment.app.b r4 = r20.E2()
            android.content.Intent r4 = r4.getIntent()
            r4.putExtra(r5, r0)
            goto L_0x0113
        L_0x01bb:
            ru.ok.messages.views.fragments.FrgProfileSettings r0 = new ru.ok.messages.views.fragments.FrgProfileSettings
            r0.<init>()
            id3 r3 = defpackage.ym.e()
            long r3 = r3.a()
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            r8.putLong(r5, r3)
            r8.putBoolean(r7, r2)
            r0.L2(r8)
        L_0x01d6:
            r6.l1 = r0
            androidx.fragment.app.c r0 = r20.Q1()
            xe0 r3 = new xe0
            r3.<init>(r0)
            int r0 = defpackage.lic.act_profile__container
            ru.ok.messages.views.fragments.base.FrgBaseProfile r4 = r6.l1
            r3.k(r0, r4, r1)
            r3.e(r2)
            goto L_0x0232
        L_0x01ec:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "No enum constant ru.ok.messages.views.ActProfile.ProfileType."
            java.lang.String r1 = r1.concat(r4)
            r0.<init>(r1)
            throw r0
        L_0x01f8:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Name is null"
            r0.<init>(r1)
            throw r0
        L_0x0200:
            androidx.fragment.app.c r3 = r20.Q1()
            androidx.fragment.app.a r1 = r3.E(r1)
            boolean r3 = r1 instanceof ru.ok.messages.views.fragments.base.FrgBaseProfile
            if (r3 == 0) goto L_0x020f
            r0 = r1
            ru.ok.messages.views.fragments.base.FrgBaseProfile r0 = (ru.ok.messages.views.fragments.base.FrgBaseProfile) r0
        L_0x020f:
            r6.l1 = r0
            java.lang.Object r0 = r8.getValue()
            ru.ok.messages.views.ProfileViewModel r0 = (ru.ok.messages.views.ProfileViewModel) r0
            q13 r0 = r0.c
            if (r0 == 0) goto L_0x0232
            java.lang.String r1 = "ru.ok.tamtam.extra.HIDE_STICKER_PREVIEW"
            r7.getBoolean(r1, r2)
            java.lang.Object r1 = r0.b
            androidx.fragment.app.c r1 = (androidx.fragment.app.c) r1
            java.lang.String r2 = "ru.ok.messages.stickers.FrgStickerPreview"
            androidx.fragment.app.a r1 = r1.E(r2)
            ru.ok.messages.stickers.FrgStickerPreview r1 = (ru.ok.messages.stickers.FrgStickerPreview) r1
            r0.v = r1
            if (r1 == 0) goto L_0x0232
            r1.a2 = r0
        L_0x0232:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.views.ProfileFragment.A2(android.view.View, android.os.Bundle):void");
    }

    public final void D1() {
    }

    public final boolean e1() {
        return true;
    }

    public final void f2(int i, int i2, Intent intent) {
        if (i == -1) {
            switch (i) {
                case 110:
                case 111:
                case 112:
                    FrgBaseProfile frgBaseProfile = this.l1;
                    if (frgBaseProfile != null) {
                        frgBaseProfile.w3();
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else if (i == 3 && intent != null && intent.getBooleanExtra("ru.ok.tamtam.extra.HAS_CHANGES", false)) {
            M1();
        }
    }

    public final void h0() {
    }

    public final void i2(Bundle bundle) {
        super.i2(bundle);
        b0h.b(E2().getOnBackPressedDispatcher(), this, new jkb(7, (Object) this));
    }

    public final void onConfigurationChanged(Configuration configuration) {
        b33 b33;
        this.Q0 = true;
        FrgBaseProfile frgBaseProfile = this.l1;
        if (frgBaseProfile != null && (b33 = frgBaseProfile.N1) != null) {
            b33.c();
        }
    }
}
