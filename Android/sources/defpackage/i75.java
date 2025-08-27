package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.settings.privacy.ui.pincode.EnterPinCodeScreen;

/* renamed from: i75  reason: default package */
public final /* synthetic */ class i75 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EnterPinCodeScreen b;

    public /* synthetic */ i75(EnterPinCodeScreen enterPinCodeScreen, int i) {
        this.a = i;
        this.b = enterPinCodeScreen;
    }

    public final Object invoke() {
        EnterPinCodeScreen enterPinCodeScreen = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = EnterPinCodeScreen.v;
                kr7.C(enterPinCodeScreen.getView());
                fma onBackPressedDispatcher = enterPinCodeScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return Unit.INSTANCE;
            default:
                KProperty[] kPropertyArr2 = EnterPinCodeScreen.v;
                o75 o75 = (o75) enterPinCodeScreen.c.getValue();
                if (!o75.z) {
                    xag.h(o75.x, Unit.INSTANCE);
                }
                return Unit.INSTANCE;
        }
    }
}
