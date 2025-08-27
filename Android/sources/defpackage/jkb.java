package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.chats.picker.members.PickerMembersListWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;
import one.me.pinbars.PinBarsWidget;
import one.me.profile.ProfileScreen;
import one.me.profile.screens.invite.ProfileInviteScreen;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;
import one.me.settings.privacy.ui.SettingMediaScreen;
import one.me.settings.privacy.ui.SettingsPrivacyScreen;
import one.me.settings.privacy.ui.blacklist.SettingsBlacklistScreen;
import one.me.settings.privacy.ui.onboarding.SafeModeOnboardingScreen;
import one.me.sharedata.ShareDataPickerScreen;
import one.me.stickerspreview.StickerPreviewScreen;
import one.me.stickerssettings.stickersscreen.StickersScreen;
import one.me.stickersshowcase.StickersShowcaseScreen;
import org.apache.http.util.LangUtils;
import ru.ok.messages.stickers.FrgStickerPreview;
import ru.ok.messages.views.ProfileFragment;
import ru.ok.messages.views.ProfileViewModel;
import ru.ok.messages.views.fragments.base.FrgBaseProfile;
import ru.ok.messages.views.widgets.quickcamera.QuickCameraView;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.util.HandledException;

/* renamed from: jkb  reason: default package */
public final /* synthetic */ class jkb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jkb() {
        this.a = 25;
        this.b = dr3.b;
    }

    public final Object invoke(Object obj) {
        hob hob;
        FrgStickerPreview frgStickerPreview;
        qc7 qc7;
        xd9 xd9;
        qqc qqc;
        long j = 0;
        boolean z = false;
        hqc hqc = null;
        Object obj2 = this.b;
        switch (this.a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                KProperty[] kPropertyArr = PickerMembersListWidget.v0;
                PickerMembersListWidget pickerMembersListWidget = (PickerMembersListWidget) obj2;
                CharSequence charSequence = (CharSequence) pickerMembersListWidget.e0().X.a.getValue();
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                }
                if (!z) {
                    return null;
                }
                fhb fhb = pickerMembersListWidget.w;
                if (intValue < fhb.j()) {
                    return ((hhb) ((lz7) fhb.E(intValue))).c;
                }
                return null;
            case 1:
                pr9 pr9 = (pr9) obj;
                int i = PinBarsWidget.x;
                PinBarsWidget pinBarsWidget = (PinBarsWidget) obj2;
                View view = pinBarsWidget.getView();
                if (view != null) {
                    b0h.K(view, qw6.CONFIRM);
                }
                blb c0 = pinBarsWidget.c0();
                int ordinal = pr9.ordinal();
                if (ordinal == 0) {
                    hob = hob.c;
                } else if (ordinal == 1) {
                    hob = hob.o;
                } else if (ordinal == 2) {
                    hob = hob.v;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                bpb bpb = c0.z;
                bpb.getClass();
                EnumEntries enumEntries = hob.x;
                float f = ((hob) enumEntries.get((hob.ordinal() + 1) % enumEntries.size())).a;
                xy9 xy9 = (xy9) bpb.b;
                xy9.getClass();
                ev0.v(xy9.j, (CoroutineContext) null, (f14) null, new uy9(xy9, f, (Continuation) null), 3);
                return Unit.INSTANCE;
            case 2:
                View view2 = (View) obj;
                ((mlb) obj2).K0.invoke();
                return Unit.INSTANCE;
            case 3:
                Throwable th = (Throwable) obj;
                bpb bpb2 = (bpb) obj2;
                ((xy9) bpb2.b).u(bpb2.g);
                return Unit.INSTANCE;
            case 4:
                int intValue2 = ((Integer) obj).intValue();
                StringBuilder sb = new StringBuilder();
                eqb eqb = (eqb) obj2;
                sb.append(eqb.e[intValue2]);
                sb.append(": ");
                sb.append(eqb.h(intValue2).a());
                return sb.toString();
            case 5:
                View view3 = (View) obj;
                KProperty[] kPropertyArr2 = ProfileChangeLinkScreen.Y;
                fma onBackPressedDispatcher = ((ProfileChangeLinkScreen) obj2).getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return Unit.INSTANCE;
            case 6:
                vzb vzb = (vzb) obj;
                vzb.W0().b(":chat-list", (Bundle) null);
                String i2 = wj6.i(((cxb) ((hxb) obj2)).b, ":start-conversation/add-subscribers?id=");
                Unit unit = Unit.INSTANCE;
                vzb.W0().b(i2, (Bundle) null);
                return Unit.INSTANCE;
            case 7:
                xla xla = (xla) obj;
                ProfileFragment profileFragment = (ProfileFragment) obj2;
                q13 q13 = ((ProfileViewModel) profileFragment.m1.getValue()).c;
                if (q13 == null || (frgStickerPreview = (FrgStickerPreview) q13.v) == null) {
                    FrgBaseProfile frgBaseProfile = profileFragment.l1;
                    if (frgBaseProfile != null && !frgBaseProfile.d3()) {
                        new Intent();
                        profileFragment.M1();
                    }
                    return Unit.INSTANCE;
                }
                if (!frgStickerPreview.d3()) {
                    q13.i();
                }
                return Unit.INSTANCE;
            case 8:
                LinearLayout linearLayout = (LinearLayout) obj;
                KProperty[] kPropertyArr3 = ProfileInviteScreen.w;
                ProfileInviteScreen profileInviteScreen = (ProfileInviteScreen) obj2;
                profileInviteScreen.getClass();
                h3b d = o54.d(linearLayout.getContext(), (AttributeSet) null);
                d.setLayoutParams(new fj3(-1, -2));
                d.setTitle(lxa.o);
                d.setForm(z2b.a);
                d.setTextShimmerEnabled(false);
                d.setLeftActions(new p2b(new oo9(23)));
                linearLayout.addView(d);
                RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), (AttributeSet) null);
                recyclerView.setLayoutParams(new fj3(-1, -1));
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager());
                recyclerView.setClipToPadding(false);
                recyclerView.setClipChildren(false);
                recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density), recyclerView.getPaddingEnd(), recyclerView.getPaddingBottom());
                recyclerView.setAdapter(profileInviteScreen.o);
                recyclerView.setItemAnimator((yyc) null);
                ez9 ez9 = ri7.a;
                ez9 ez92 = new ez9(1);
                ez92.g(4);
                recyclerView.j(new mnd(fu4.k.e(recyclerView.getContext()).f(), new pbb(6, profileInviteScreen, ez92), (h9) null, 12));
                float f2 = (float) 12;
                recyclerView.j(new ue8(ki7.a(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(((float) 24) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density)), ki7.a(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), 0), ki7.a(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), 0), 1));
                linearLayout.addView(recyclerView);
                return Unit.INSTANCE;
            case 9:
                CharSequence charSequence2 = (CharSequence) obj;
                k7c g0 = ((ProfileScreen) ((x5c) obj2).v).g0();
                String h = g0.I0.h();
                if (h != null) {
                    xag.h(g0.w0, new y5c(new kgf(ead.i, ArraysKt.toList((T[]) new Object[]{h}))));
                }
                return Unit.INSTANCE;
            case 10:
                k2b k2b = (k2b) obj;
                return Integer.valueOf(((tf7) obj2).a);
            case 11:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i3 = QuickCameraView.o;
                if (!booleanValue) {
                    z68.c("ru.ok.messages.views.widgets.quickcamera.QuickCameraView", "ScreenStateReceiver: screen off", new Object[0]);
                    acc acc = ((QuickCameraView) obj2).c;
                    if (acc != null) {
                        b4a b4a = (b4a) acc;
                        n5b n5b = b4a.w0;
                        if (n5b != null) {
                            n5b.b = null;
                            n5b.disable();
                            b4a.w0 = null;
                        }
                        b4a.q0();
                    }
                }
                return Unit.INSTANCE;
            case 12:
                xqc xqc = (xqc) obj;
                trc trc = ((urc) obj2).b;
                if (trc != null) {
                    MessageContextMenuBottomSheet messageContextMenuBottomSheet = (MessageContextMenuBottomSheet) trc;
                    MessageModel s0 = messageContextMenuBottomSheet.s0();
                    hqc hqc2 = xqc.b;
                    long j2 = s0 != null ? s0.a : 0;
                    if (s0 != null) {
                        j = s0.b;
                    }
                    ((vsc) messageContextMenuBottomSheet.O0.getValue()).j().p(new osc(hqc2, j2, j, s0 != null ? s0.y0 : null));
                    messageContextMenuBottomSheet.i0(true);
                    if (!(s0 == null || (xd9 = s0.y0) == null || (qqc = xd9.c) == null)) {
                        hqc = qqc.b;
                    }
                    if (!Intrinsics.areEqual((Object) hqc, (Object) xqc.b) && (qc7 = (qc7) vi9.a.getAccessor().j(qc7.class)) != null) {
                        qc7.f(SetsKt.setOf(new pc7(nc7.ADD_2_REACTIONS, 1)), jgd.CHAT);
                    }
                }
                return Unit.INSTANCE;
            case 13:
                c6d c6d = (c6d) obj2;
                c6d.getClass();
                return c6d.c(c6d, (Continuation) obj);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                Throwable th2 = (Throwable) obj;
                ((mq4) obj2).dispose();
                return Unit.INSTANCE;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                gg9 gg9 = (gg9) ((View) obj).findViewById(((ni0) obj2).b);
                if (gg9 == null) {
                    return null;
                }
                return gg9.getMessageAttachmentsView();
            case 16:
                View view4 = (View) obj;
                int i4 = SafeModeOnboardingScreen.c;
                fma onBackPressedDispatcher2 = ((SafeModeOnboardingScreen) obj2).getOnBackPressedDispatcher();
                if (onBackPressedDispatcher2 != null) {
                    onBackPressedDispatcher2.d();
                }
                return Unit.INSTANCE;
            case LangUtils.HASH_SEED /*17*/:
                int intValue3 = ((Integer) obj).intValue();
                StringBuilder sb2 = new StringBuilder();
                wsd wsd = (wsd) obj2;
                sb2.append(wsd.f[intValue3]);
                sb2.append(": ");
                sb2.append(wsd.g[intValue3].a());
                return sb2.toString();
            case 18:
                View view5 = (View) obj;
                KProperty[] kPropertyArr4 = SettingMediaScreen.w;
                ((SettingMediaScreen) obj2).getRouter().C();
                return Unit.INSTANCE;
            case 19:
                View view6 = (View) obj;
                KProperty[] kPropertyArr5 = SettingsBlacklistScreen.x;
                ((SettingsBlacklistScreen) obj2).getRouter().C();
                return Unit.INSTANCE;
            case 20:
                View view7 = (View) obj;
                KProperty[] kPropertyArr6 = SettingsPrivacyScreen.x;
                ((SettingsPrivacyScreen) obj2).getRouter().C();
                return Unit.INSTANCE;
            case 21:
                View view8 = (View) obj;
                KProperty[] kPropertyArr7 = ShareDataPickerScreen.A0;
                fma onBackPressedDispatcher3 = ((ShareDataPickerScreen) obj2).getOnBackPressedDispatcher();
                if (onBackPressedDispatcher3 != null) {
                    onBackPressedDispatcher3.d();
                }
                return Unit.INSTANCE;
            case 22:
                View view9 = (View) obj;
                KProperty[] kPropertyArr8 = StickerPreviewScreen.v0;
                ((StickerPreviewScreen) obj2).getRouter().C();
                return Unit.INSTANCE;
            case 23:
                View view10 = (View) obj;
                KProperty[] kPropertyArr9 = StickersScreen.Y;
                ((StickersScreen) obj2).getRouter().C();
                return Unit.INSTANCE;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                View view11 = (View) obj;
                KProperty[] kPropertyArr10 = StickersShowcaseScreen.Y;
                ((StickersShowcaseScreen) obj2).getRouter().C();
                return Unit.INSTANCE;
            case 25:
                if (((er3) obj).b == ((dr3) obj2)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 26:
                if (!((bj2) obj).a.c()) {
                    ((gy8) obj2).getClass();
                }
                return true;
            case 27:
                ((hff) obj2).d.invoke((af8) obj);
                return Unit.INSTANCE;
            case 28:
                ((uta) ((m95) obj2)).c((HandledException) obj, true);
                return Unit.INSTANCE;
            default:
                b89 b89 = (b89) obj;
                z0g z0g = (z0g) obj2;
                z0g.getClass();
                int i5 = y0g.$EnumSwitchMapping$0[z0g.b.ordinal()];
                if (i5 == 1) {
                    j = b89.b;
                } else if (i5 == 2) {
                    cl4 cl4 = b89.B0;
                    if (cl4 != null) {
                        j = cl4.a;
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return Long.valueOf(j);
        }
    }

    public /* synthetic */ jkb(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ jkb(ProfileChangeLinkScreen profileChangeLinkScreen, hxb hxb) {
        this.a = 6;
        this.b = hxb;
    }
}
