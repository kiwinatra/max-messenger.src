package one.me.settings.privacy.ui.pincode;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/settings/privacy/ui/pincode/SetupPinCodeScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "settings-privacy_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSetupPinCodeScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SetupPinCodeScreen.kt\none/me/settings/privacy/ui/pincode/SetupPinCodeScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n*L\n1#1,42:1\n235#2,10:43\n410#2,8:53\n*S KotlinDebug\n*F\n+ 1 SetupPinCodeScreen.kt\none/me/settings/privacy/ui/pincode/SetupPinCodeScreen\n*L\n19#1:43,10\n38#1:53,8\n*E\n"})
@SuppressLint({"ValidController"})
public final class SetupPinCodeScreen extends Widget {
    public static final /* synthetic */ int o = 0;
    public final Lazy a = createViewModelLazy(d4e.class, new zfa(27, new red(22)));
    public final w28 b = new w28(jgd.SETTINGS_PRIVACY_NEW_PINCODE);
    public final yh7 c = yh7.d;

    public SetupPinCodeScreen() {
        super((Bundle) null, 0, 3, (DefaultConstructorMarker) null);
    }

    public final yh7 getInsetsConfig() {
        return this.c;
    }

    public final pgd getScreenDelegate() {
        return this.b;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        mlb mlb = new mlb(viewGroup.getContext());
        mlb.setId(zhc.oneme_settings_privacy_setup_pin_code_root_view);
        mlb.setListener((d4e) this.a.getValue());
        mlb.setTitle(gmc.oneme_settings_privacy_onboarding_come_up_pin_code);
        mlb.setLocked(false);
        mlb.setOnBackPress(new vra(21, mlb, this));
        return mlb;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    public final void onViewCreated(View view) {
        bs0.K(new ps5(ct.k(new on2(((d4e) this.a.getValue()).v, 28), getViewLifecycleOwner().getLifecycle(), iu7.o), new SuspendLambda(2, (Continuation<Object>) null), 5), getViewLifecycleScope());
    }
}
