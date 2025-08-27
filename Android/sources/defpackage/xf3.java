package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.settings.privacy.ui.pincode.ConfirmPinCodeScreen;

/* renamed from: xf3  reason: default package */
public final /* synthetic */ class xf3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConfirmPinCodeScreen b;

    public /* synthetic */ xf3(ConfirmPinCodeScreen confirmPinCodeScreen, int i) {
        this.a = i;
        this.b = confirmPinCodeScreen;
    }

    public final Object invoke() {
        ConfirmPinCodeScreen confirmPinCodeScreen = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = ConfirmPinCodeScreen.w;
                fma onBackPressedDispatcher = confirmPinCodeScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return Unit.INSTANCE;
            default:
                KProperty[] kPropertyArr2 = ConfirmPinCodeScreen.w;
                confirmPinCodeScreen.getClass();
                KProperty kProperty = ConfirmPinCodeScreen.w[0];
                return new eg3((String) confirmPinCodeScreen.a.a(confirmPinCodeScreen));
        }
    }
}
