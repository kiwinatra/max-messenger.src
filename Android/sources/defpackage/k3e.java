package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.settings.privacy.ui.ChangeDisabledDialog;
import one.me.settings.privacy.ui.SettingsPrivacyScreen;
import one.me.settings.privacy.ui.pincode.EnterPinCodeScreen;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: k3e  reason: default package */
public final class k3e extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ SettingsPrivacyScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k3e(Continuation continuation, SettingsPrivacyScreen settingsPrivacyScreen) {
        super(2, continuation);
        this.b = settingsPrivacyScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        k3e k3e = new k3e(continuation, this.b);
        k3e.a = obj;
        return k3e;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((k3e) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        v5a v5a = (v5a) this.a;
        boolean z = v5a instanceof xzd;
        e9d e9d = null;
        SettingsPrivacyScreen settingsPrivacyScreen = this.b;
        if (z) {
            xzd xzd = (xzd) v5a;
            KProperty[] kPropertyArr = SettingsPrivacyScreen.x;
            settingsPrivacyScreen.getClass();
            KProperty[] kPropertyArr2 = BottomSheetWidget.v0;
            ngf ngf = xzd.b;
            Bundle bundle = new Bundle();
            bundle.putParcelable("title", ngf);
            bundle.putBundle(ApiProtocol.PARAM_PAYLOAD, (Bundle) null);
            jgd jgd = xzd.d;
            if (jgd != null) {
                bundle.putString("stat_screen", jgd.name());
            }
            for (wzd wzd : xzd.c) {
                boolean z2 = wzd.c;
                ngf ngf2 = wzd.a;
                int i = wzd.b;
                if (z2) {
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList("buttons");
                    if (parcelableArrayList == null) {
                        parcelableArrayList = new ArrayList();
                    }
                    parcelableArrayList.add(new pg3(i, ngf2, og3.a));
                    bundle.putParcelableArrayList("buttons", parcelableArrayList);
                } else {
                    ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("buttons");
                    if (parcelableArrayList2 == null) {
                        parcelableArrayList2 = new ArrayList();
                    }
                    parcelableArrayList2.add(new pg3(i, ngf2, og3.c));
                    bundle.putParcelableArrayList("buttons", parcelableArrayList2);
                }
            }
            ConfirmationBottomSheet confirmationBottomSheet = new ConfirmationBottomSheet(bundle);
            confirmationBottomSheet.setTargetController(settingsPrivacyScreen);
            zx3 zx3 = settingsPrivacyScreen;
            while (zx3.getParentController() != null) {
                zx3 = zx3.getParentController();
            }
            l9d l9d = zx3 instanceof l9d ? (l9d) zx3 : null;
            if (l9d != null) {
                e9d = l9d.K();
            }
            confirmationBottomSheet.p0(settingsPrivacyScreen);
            if (e9d != null) {
                i9d i9d = new i9d(confirmationBottomSheet, (String) null, (ey3) null, (ey3) null, false, -1);
                a81.t(false, i9d, true, "BottomSheetWidget");
                e9d.G(i9d);
            }
        } else if (v5a instanceof pa4) {
            i3e.b.Y0((pa4) v5a);
        } else if (v5a instanceof yzd) {
            e0b e0b = new e0b((Widget) settingsPrivacyScreen);
            e0b.h(((yzd) v5a).b);
            e0b.j();
        } else if (v5a instanceof vzd) {
            EnterPinCodeScreen enterPinCodeScreen = new EnterPinCodeScreen();
            enterPinCodeScreen.setTargetController(settingsPrivacyScreen);
            settingsPrivacyScreen.getRouter().G(iq.n(enterPinCodeScreen, new u2g(), new u2g()));
        } else if (v5a instanceof uzd) {
            KProperty[] kPropertyArr3 = BottomSheetWidget.v0;
            ChangeDisabledDialog changeDisabledDialog = new ChangeDisabledDialog();
            changeDisabledDialog.setTargetController(settingsPrivacyScreen);
            zx3 zx32 = settingsPrivacyScreen;
            while (zx32.getParentController() != null) {
                zx32 = zx32.getParentController();
            }
            l9d l9d2 = zx32 instanceof l9d ? (l9d) zx32 : null;
            if (l9d2 != null) {
                e9d = l9d2.K();
            }
            changeDisabledDialog.p0(settingsPrivacyScreen);
            if (e9d != null) {
                i9d i9d2 = new i9d(changeDisabledDialog, (String) null, (ey3) null, (ey3) null, false, -1);
                a81.t(false, i9d2, true, "change-disabled");
                e9d.G(i9d2);
            }
        }
        KProperty[] kPropertyArr4 = SettingsPrivacyScreen.x;
        settingsPrivacyScreen.c0().F0.c();
        return Unit.INSTANCE;
    }
}
