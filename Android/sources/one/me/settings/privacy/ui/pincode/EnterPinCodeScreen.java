package one.me.settings.privacy.ui.pincode;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lone/me/settings/privacy/ui/pincode/EnterPinCodeScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "j75", "settings-privacy_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nEnterPinCodeScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterPinCodeScreen.kt\none/me/settings/privacy/ui/pincode/EnterPinCodeScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n*L\n1#1,68:1\n235#2,10:69\n410#2,8:79\n410#2,8:87\n410#2,8:95\n*S KotlinDebug\n*F\n+ 1 EnterPinCodeScreen.kt\none/me/settings/privacy/ui/pincode/EnterPinCodeScreen\n*L\n22#1:69,10\n43#1:79,8\n52#1:87,8\n56#1:95,8\n*E\n"})
@SuppressLint({"ValidController"})
public final class EnterPinCodeScreen extends Widget {
    public static final /* synthetic */ KProperty[] v = {wj6.p(EnterPinCodeScreen.class, "pinCodeView", "getPinCodeView()Lone/me/settings/privacy/ui/pincode/PinCodeView;", 0)};
    public final yh7 a = yh7.d;
    public final w28 b = new w28(jgd.SETTINGS_PRIVACY_INSERT_PINCODE);
    public final Lazy c = createViewModelLazy(o75.class, new rn2(22, new qr3(22)));
    public final ReadOnlyProperty o = viewBinding(zhc.oneme_settings_privacy_enter_pin_code_root);

    public EnterPinCodeScreen() {
        super((Bundle) null, 0, 3, (DefaultConstructorMarker) null);
    }

    public final yh7 getInsetsConfig() {
        return this.a;
    }

    public final pgd getScreenDelegate() {
        return this.b;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        mlb mlb = new mlb(viewGroup.getContext());
        mlb.setId(zhc.oneme_settings_privacy_enter_pin_code_root);
        mlb.setListener((o75) this.c.getValue());
        mlb.setTitle(gmc.oneme_settings_privacy_enter_pin_code_title);
        mlb.setDescription(Integer.valueOf(gmc.oneme_settings_privacy_enter_pin_code_description));
        mlb.setLocked(true);
        mlb.setOnBackPress(new i75(this, 0));
        mlb.setForgotPinCodeClickListener(new i75(this, 1));
        return mlb;
    }

    public final void onDetach(View view) {
        kr7.C(view);
    }

    public final void onViewCreated(View view) {
        Lazy lazy = this.c;
        s85 s85 = ((o75) lazy.getValue()).v;
        iu7 iu7 = iu7.o;
        bs0.K(new ps5(ct.k(s85, getViewLifecycleOwner().getLifecycle(), iu7), new k75((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(((o75) lazy.getValue()).w, getViewLifecycleOwner().getLifecycle(), iu7), new l75((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(((o75) lazy.getValue()).x, getViewLifecycleOwner().getLifecycle(), iu7), new m75((Continuation) null, this), 5), getViewLifecycleScope());
    }
}
