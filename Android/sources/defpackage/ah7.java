package defpackage;

import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.login.inputphone.InputPhoneScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.phoneutils.SelectCountryBottomSheet;

/* renamed from: ah7  reason: default package */
public final /* synthetic */ class ah7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ InputPhoneScreen b;

    public /* synthetic */ ah7(InputPhoneScreen inputPhoneScreen, int i) {
        this.a = i;
        this.b = inputPhoneScreen;
    }

    public final Object invoke() {
        InputPhoneScreen inputPhoneScreen = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = InputPhoneScreen.D0;
                return new aj7(inputPhoneScreen.getRouter());
            default:
                KProperty[] kPropertyArr2 = InputPhoneScreen.D0;
                KProperty[] kPropertyArr3 = BottomSheetWidget.v0;
                SelectCountryBottomSheet selectCountryBottomSheet = new SelectCountryBottomSheet(o54.f(TuplesKt.to("is_narnia_available", Boolean.FALSE)));
                selectCountryBottomSheet.setTargetController(inputPhoneScreen);
                zx3 zx3 = inputPhoneScreen;
                while (zx3.getParentController() != null) {
                    zx3 = zx3.getParentController();
                }
                e9d e9d = null;
                l9d l9d = zx3 instanceof l9d ? (l9d) zx3 : null;
                if (l9d != null) {
                    e9d = l9d.K();
                }
                e9d e9d2 = e9d;
                selectCountryBottomSheet.p0(inputPhoneScreen);
                if (e9d2 != null) {
                    i9d i9d = new i9d(selectCountryBottomSheet, (String) null, (ey3) null, (ey3) null, false, -1);
                    a81.t(false, i9d, true, "BottomSheetWidget");
                    e9d2.G(i9d);
                }
                return Unit.INSTANCE;
        }
    }
}
