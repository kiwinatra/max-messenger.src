package one.me.settings.privacy.ui.pincode;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/settings/privacy/ui/pincode/ConfirmPinCodeScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "hash", "(Ljava/lang/String;)V", "settings-privacy_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nConfirmPinCodeScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfirmPinCodeScreen.kt\none/me/settings/privacy/ui/pincode/ConfirmPinCodeScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n*L\n1#1,76:1\n420#2:77\n235#2,10:78\n410#2,8:88\n410#2,8:96\n410#2,8:104\n*S KotlinDebug\n*F\n+ 1 ConfirmPinCodeScreen.kt\none/me/settings/privacy/ui/pincode/ConfirmPinCodeScreen\n*L\n21#1:77\n22#1:78,10\n44#1:88,8\n62#1:96,8\n66#1:104,8\n*E\n"})
@SuppressLint({"ValidController"})
public final class ConfirmPinCodeScreen extends Widget {
    public static final /* synthetic */ KProperty[] w;
    public final is a;
    public final Lazy b;
    public final w28 c;
    public final yh7 o;
    public final ReadOnlyProperty v;

    static {
        Class<ConfirmPinCodeScreen> cls = ConfirmPinCodeScreen.class;
        w = new KProperty[]{wj6.p(cls, "hash", "getHash()Ljava/lang/String;", 0), wj6.p(cls, "pinCodeView", "getPinCodeView()Lone/me/settings/privacy/ui/pincode/PinCodeView;", 0)};
    }

    public ConfirmPinCodeScreen(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        this.a = new is(String.class, "confirm_pin_code:hash");
        this.b = createViewModelLazy(eg3.class, new rn2(18, new xf3(this, 1)));
        this.c = new w28(jgd.SETTINGS_PRIVACY_ACCEPT_PINCODE);
        this.o = yh7.d;
        this.v = viewBinding(zhc.oneme_settings_privacy_setup_pin_code_root_view);
    }

    public static final mlb c0(ConfirmPinCodeScreen confirmPinCodeScreen) {
        confirmPinCodeScreen.getClass();
        return (mlb) confirmPinCodeScreen.v.getValue(confirmPinCodeScreen, w[1]);
    }

    public final yh7 getInsetsConfig() {
        return this.o;
    }

    public final pgd getScreenDelegate() {
        return this.c;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        mlb mlb = new mlb(viewGroup.getContext());
        mlb.setId(zhc.oneme_settings_privacy_setup_pin_code_root_view);
        mlb.setListener((eg3) this.b.getValue());
        mlb.setTitle(gmc.oneme_settings_privacy_onboarding_re_enter_pin_code);
        mlb.setLocked(true);
        mlb.setOnBackPress(new xf3(this, 0));
        return mlb;
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    public final void onViewCreated(View view) {
        Lazy lazy = this.b;
        on2 on2 = ((eg3) lazy.getValue()).y;
        iu7 iu7 = iu7.o;
        bs0.K(new ps5(ct.k(on2, getViewLifecycleOwner().getLifecycle(), iu7), new yf3((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(((eg3) lazy.getValue()).Y, getViewLifecycleOwner().getLifecycle(), iu7), new SuspendLambda(2, (Continuation<Object>) null), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(((eg3) lazy.getValue()).X, getViewLifecycleOwner().getLifecycle(), iu7), new ag3((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public ConfirmPinCodeScreen(String str) {
        this(o54.f(TuplesKt.to("confirm_pin_code:hash", str)));
    }
}
