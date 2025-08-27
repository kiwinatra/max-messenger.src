package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.login.inputname.InputNameScreen;

/* renamed from: qg7  reason: default package */
public final /* synthetic */ class qg7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ InputNameScreen b;

    public /* synthetic */ qg7(InputNameScreen inputNameScreen, int i) {
        this.a = i;
        this.b = inputNameScreen;
    }

    public final Object invoke() {
        boolean z = false;
        InputNameScreen inputNameScreen = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = InputNameScreen.z0;
                return new aj7(inputNameScreen.getRouter());
            case 1:
                KProperty[] kPropertyArr2 = InputNameScreen.z0;
                inputNameScreen.getClass();
                KProperty[] kPropertyArr3 = InputNameScreen.z0;
                KProperty kProperty = kPropertyArr3[0];
                KProperty kProperty2 = kPropertyArr3[1];
                return new yg7((String) inputNameScreen.b.a(inputNameScreen), (String) inputNameScreen.c.a(inputNameScreen), n88.a.getAccessor().h(rh3.class));
            default:
                KProperty[] kPropertyArr4 = InputNameScreen.z0;
                yg7 g0 = inputNameScreen.g0();
                KProperty kProperty3 = InputNameScreen.z0[5];
                String str = (String) inputNameScreen.x0.a(inputNameScreen);
                String f0 = inputNameScreen.f0();
                g0.getClass();
                boolean k = g0.k(huf.a, str);
                boolean k2 = g0.k(huf.b, f0);
                if (k && k2) {
                    xag.h(g0.w, new pg7(new f0d(g0.c, g0.o, str, f0, (Long) null)));
                }
                if (inputNameScreen.d0().b() || inputNameScreen.e0().b()) {
                    z = true;
                }
                inputNameScreen.c0().setActiveButtonLoaderState(!z);
                return Unit.INSTANCE;
        }
    }
}
