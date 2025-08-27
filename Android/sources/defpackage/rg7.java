package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import one.me.login.inputname.InputNameScreen;

/* renamed from: rg7  reason: default package */
public final /* synthetic */ class rg7 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ InputNameScreen b;

    public /* synthetic */ rg7(InputNameScreen inputNameScreen, int i) {
        this.a = i;
        this.b = inputNameScreen;
    }

    public final Object invoke(Object obj) {
        InputNameScreen inputNameScreen = this.b;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                KProperty[] kPropertyArr = InputNameScreen.z0;
                inputNameScreen.h0();
                return Unit.INSTANCE;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                KProperty[] kPropertyArr2 = InputNameScreen.z0;
                boolean z = charSequence.length() > 0;
                String obj2 = charSequence.toString();
                inputNameScreen.getClass();
                KProperty kProperty = InputNameScreen.z0[5];
                inputNameScreen.x0.b(inputNameScreen, obj2);
                vf c0 = inputNameScreen.c0();
                c0.c = true;
                c0.setEnabled(z);
                yg7 g0 = inputNameScreen.g0();
                huf huf = huf.a;
                g0.getClass();
                xag.h(g0.y, new gy6(huf));
                return Unit.INSTANCE;
            case 2:
                CharSequence charSequence2 = (CharSequence) obj;
                KProperty[] kPropertyArr3 = InputNameScreen.z0;
                yg7 g02 = inputNameScreen.g0();
                huf huf2 = huf.b;
                g02.getClass();
                xag.h(g02.y, new gy6(huf2));
                String obj3 = charSequence2.toString();
                KProperty kProperty2 = InputNameScreen.z0[6];
                inputNameScreen.y0.b(inputNameScreen, obj3);
                inputNameScreen.g0().j(charSequence2.toString(), inputNameScreen.e0().a.isFocused());
                return Unit.INSTANCE;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                KProperty[] kPropertyArr4 = InputNameScreen.z0;
                if (inputNameScreen.e0().b()) {
                    return Unit.INSTANCE;
                }
                inputNameScreen.g0().j(inputNameScreen.f0(), booleanValue);
                return Unit.INSTANCE;
        }
    }
}
