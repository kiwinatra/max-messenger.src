package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.EditText;
import android.widget.PopupWindow;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chatscreen.mediabar.partialmediaaccess.PartialMediaAccessWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.devmenu.server.ServerHostBottomSheet;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;
import one.me.notifications.settings.NotificationsSettingsScreen;
import one.me.profile.ProfileScreen;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;
import one.me.sdk.gallery.selectalbum.SelectAlbumWidget;
import one.me.settings.SettingsAvatarBottomSheet;
import one.me.startconversation.chat.PickChatMembers;
import org.apache.http.util.LangUtils;
import ru.ok.messages.contacts.picker.MultiPickerSelectionView;
import ru.ok.messages.messages.panels.widgets.MultiImageToggleButton;
import ru.ok.messages.stickers.widgets.StickerView;
import ru.ok.tamtam.nano.Protos;

/* renamed from: u99  reason: default package */
public final /* synthetic */ class u99 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u99(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onClick(View view) {
        m8d m8d;
        boolean z = false;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = MessageContextMenuBottomSheet.X0;
                ((MessageContextMenuBottomSheet) obj).i0(true);
                return;
            case 1:
                oc9 oc9 = (oc9) obj;
                nc9 nc9 = oc9.x;
                if (nc9 != null) {
                    gc9 gc9 = nc9.e;
                    if (gc9 == null || nc9.d != null) {
                        Function2 function2 = oc9.v;
                        if (function2 != null) {
                            function2.invoke(Long.valueOf(nc9.a), Long.valueOf(nc9.b));
                            return;
                        }
                        return;
                    }
                    Function1 function1 = oc9.w;
                    if (function1 != null) {
                        function1.invoke(gc9);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((ve9) obj).v.x(true);
                return;
            case 3:
                KProperty[] kPropertyArr2 = MultiImageToggleButton.z;
                MultiImageToggleButton multiImageToggleButton = (MultiImageToggleButton) obj;
                multiImageToggleButton.getCurrentStateIndex();
                int currentStateIndex = (multiImageToggleButton.getCurrentStateIndex() + 1) % multiImageToggleButton.v.size();
                if (multiImageToggleButton.y) {
                    multiImageToggleButton.setCurrentStateIndex(currentStateIndex);
                }
                nw9 nw9 = multiImageToggleButton.w;
                if (nw9 != null) {
                    multiImageToggleButton.getAllStatesCount();
                    StickerView.f(((zre) nw9).a);
                    return;
                }
                return;
            case 4:
                MultiPickerSelectionView multiPickerSelectionView = (MultiPickerSelectionView) obj;
                Iterator it = multiPickerSelectionView.a.iterator();
                while (it.hasNext()) {
                    sw9 sw9 = (sw9) it.next();
                    lf0 lf0 = multiPickerSelectionView.w;
                    List F = lf0.F();
                    new ArrayList();
                    ArrayList arrayList = (ArrayList) lf0.v;
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((lu3) it2.next()).getClass();
                    }
                    new ArrayList();
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        ((lu3) it3.next()).getClass();
                    }
                    sw9.Z((ArrayList) F, (ArrayList) lf0.E());
                }
                return;
            case 5:
                ((u3a) obj).N(new zj0(21));
                return;
            case 6:
                b4a b4a = (b4a) obj;
                dac dac = b4a.y;
                if (dac != null) {
                    dac.d(new x3a(b4a, 0));
                    return;
                }
                return;
            case 7:
                h5a h5a = (h5a) obj;
                if (h5a.a.p()) {
                    h5a.dismiss();
                    return;
                }
                AnimatorSet animatorSet = h5a.i;
                if (animatorSet == null || !animatorSet.isRunning()) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.5f});
                    ofFloat.addUpdateListener(new d5a(h5a, 0));
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, c44.DEFAULT_ASPECT_RATIO});
                    ofFloat2.addUpdateListener(new d5a(h5a, 1));
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{0.1f, c44.DEFAULT_ASPECT_RATIO});
                    ofFloat3.addUpdateListener(new d5a(h5a, 2));
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.setDuration(150);
                    animatorSet2.setInterpolator(new AccelerateInterpolator());
                    animatorSet2.addListener(new e5a(h5a, 0));
                    animatorSet2.playTogether(new Animator[]{ofFloat, ofFloat3, ofFloat2});
                    animatorSet2.start();
                    h5a.i = animatorSet2;
                    return;
                }
                return;
            case 8:
                ((y8a) obj).D0.invoke();
                return;
            case 9:
                KProperty[] kPropertyArr3 = NotificationsSettingsScreen.Y;
                fga c0 = ((NotificationsSettingsScreen) obj).c0();
                c0.x0.setValue(c0, fga.A0[0], ev0.u(c0.a, ((osa) ((gaf) c0.v.getValue())).b(), f14.b, new ega(c0, (Continuation) null)));
                return;
            case 10:
                hqa hqa = ((iqa) obj).a;
                if (hqa != null) {
                    hqa.a((fqa) view);
                    return;
                }
                return;
            case 11:
                ((j50) obj).d(g0b.v);
                return;
            case 12:
                PopupWindow popupWindow = (PopupWindow) obj;
                if (popupWindow != null) {
                    popupWindow.showAsDropDown(view);
                    return;
                }
                return;
            case 13:
                PartialMediaAccessWidget partialMediaAccessWidget = (PartialMediaAccessWidget) obj;
                ((edb) partialMediaAccessWidget.a.getValue()).f(new eng(partialMediaAccessWidget, 1), edb.m, 157);
                return;
            case Protos.Attaches.Attach.LOCATION:
                z9b z9b = (z9b) obj;
                EditText editText = z9b.f;
                if (editText != null) {
                    int selectionEnd = editText.getSelectionEnd();
                    EditText editText2 = z9b.f;
                    if (editText2 == null || !(editText2.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        z9b.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    } else {
                        z9b.f.setTransformationMethod((TransformationMethod) null);
                    }
                    if (selectionEnd >= 0) {
                        z9b.f.setSelection(selectionEnd);
                    }
                    z9b.q();
                    return;
                }
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA:
                KProperty[] kPropertyArr4 = PickChatMembers.Z;
                ble.b.W0().b(":chat/add-icon?ids=" + CollectionsKt___CollectionsKt.joinToString$default((Iterable) ((PickChatMembers) obj).l0().x.a.getValue(), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null), (Bundle) null);
                return;
            case 16:
                ((nrb) obj).l((Runnable) null, true);
                return;
            case LangUtils.HASH_SEED:
                orb orb = (orb) obj;
                frb frb = orb.a;
                if (frb != null && frb.j()) {
                    orb.j(true);
                    return;
                }
                return;
            case 18:
                KProperty[] kPropertyArr5 = ProfileChangeLinkScreen.Y;
                ProfileChangeLinkScreen profileChangeLinkScreen = (ProfileChangeLinkScreen) obj;
                profileChangeLinkScreen.d0();
                d02 g0 = profileChangeLinkScreen.g0();
                g0.X.setValue(g0, d02.Y[0], ev0.v(g0.a, (CoroutineContext) null, (f14) null, new c02(g0, (Continuation) null), 3));
                return;
            case 19:
                syb e0 = ((ProfileEditAdminPermissionsWidget) ((zxb) ((t56) obj).w)).e0();
                e0.z0.setValue(e0, syb.C0[0], ev0.u(e0.a, ((osa) ((gaf) e0.z.getValue())).a(), f14.b, new jyb(e0, (Continuation) null)));
                return;
            case 20:
                KProperty[] kPropertyArr6 = ProfileEditAdminPermissionsWidget.v0;
                ((ProfileEditAdminPermissionsWidget) obj).e0().k();
                return;
            case 21:
                KProperty[] kPropertyArr7 = ProfileScreen.D0;
                ProfileScreen profileScreen = (ProfileScreen) obj;
                b59.k(profileScreen.getContext(), profileScreen.g0().k());
                return;
            case 22:
                p8d p8d = (p8d) obj;
                if (p8d.getMode() != k8d.w && (m8d = p8d.J0) != null) {
                    m8d.b();
                    return;
                }
                return;
            case 23:
                aqd aqd = (aqd) obj;
                al6 al6 = aqd.G0;
                if (al6 != null) {
                    y3a y3a = aqd.D0;
                    y3a.getClass();
                    KProperty[] kPropertyArr8 = SelectAlbumWidget.w;
                    opd e02 = ((SelectAlbumWidget) y3a.b).e0();
                    xme xme = e02.w;
                    wk6 wk6 = al6.a;
                    xme.setValue(wk6);
                    xag.h(e02.o, new epd(wk6));
                    xag.h(e02.v, new bpd());
                    return;
                }
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                KProperty[] kPropertyArr9 = ServerHostBottomSheet.E0;
                ServerHostBottomSheet serverHostBottomSheet = (ServerHostBottomSheet) obj;
                serverHostBottomSheet.getClass();
                CharSequence text = ((h2b) serverHostBottomSheet.C0.getValue(serverHostBottomSheet, ServerHostBottomSheet.E0[3])).getText();
                if (text == null || text.length() == 0) {
                    z = true;
                }
                if (!z) {
                    c37 c37 = (c37) serverHostBottomSheet.w0.getValue();
                    String obj2 = text.toString();
                    SharedPreferences.Editor edit = c37.w.edit();
                    edit.putString("Custom", obj2);
                    edit.apply();
                    c37.l(obj2);
                    return;
                }
                return;
            case 25:
                hyd hyd = (hyd) obj;
                b0e b0e = hyd.M0;
                if (b0e != null) {
                    fyd fyd = hyd.L0;
                    b0e.E(fyd.a, fyd.w);
                    return;
                }
                return;
            case 26:
                KProperty[] kPropertyArr10 = SettingsAvatarBottomSheet.A0;
                SettingsAvatarBottomSheet settingsAvatarBottomSheet = (SettingsAvatarBottomSheet) obj;
                settingsAvatarBottomSheet.getClass();
                KProperty[] kPropertyArr11 = SettingsAvatarBottomSheet.A0;
                KProperty kProperty = kPropertyArr11[4];
                is isVar = settingsAvatarBottomSheet.z0;
                if (!((Boolean) isVar.a(settingsAvatarBottomSheet)).booleanValue()) {
                    KProperty kProperty2 = kPropertyArr11[4];
                    isVar.b(settingsAvatarBottomSheet, Boolean.TRUE);
                    settingsAvatarBottomSheet.getTargetController();
                }
                settingsAvatarBottomSheet.i0(true);
                return;
            case 27:
                ((v0e) obj).H0.toggle();
                return;
            case 28:
                ((jwb) obj).S0();
                return;
            default:
                Editable text2 = ((v7e) obj).F0.getText();
                if (text2 != null) {
                    text2.clear();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ u99(SettingsAvatarBottomSheet settingsAvatarBottomSheet, int i) {
        this.a = 26;
        this.b = settingsAvatarBottomSheet;
    }
}
