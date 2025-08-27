package defpackage;

import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.login.confirm.ConfirmPhoneScreen;

/* renamed from: gf3  reason: default package */
public final /* synthetic */ class gf3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConfirmPhoneScreen b;

    public /* synthetic */ gf3(ConfirmPhoneScreen confirmPhoneScreen, int i) {
        this.a = i;
        this.b = confirmPhoneScreen;
    }

    public final Object invoke() {
        ConfirmPhoneScreen confirmPhoneScreen = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = ConfirmPhoneScreen.A0;
                confirmPhoneScreen.getClass();
                KProperty[] kPropertyArr2 = ConfirmPhoneScreen.A0;
                KProperty kProperty = kPropertyArr2[2];
                int intValue = ((Number) confirmPhoneScreen.v.a(confirmPhoneScreen)).intValue();
                KProperty kProperty2 = kPropertyArr2[0];
                KProperty kProperty3 = kPropertyArr2[1];
                n88 n88 = n88.a;
                n88.getClass();
                return new wf3(intValue, (String) confirmPhoneScreen.c.a(confirmPhoneScreen), (String) confirmPhoneScreen.o.a(confirmPhoneScreen), LazyKt.lazy(new ck7(14)), LazyKt.lazy(new ck7(16)), LazyKt.lazy(new ck7(15)), n88.getAccessor().h(gaf.class), n88.getAccessor().h(rh3.class));
            case 1:
                KProperty[] kPropertyArr3 = ConfirmPhoneScreen.A0;
                return new aj7(confirmPhoneScreen.getRouter());
            default:
                KProperty[] kPropertyArr4 = ConfirmPhoneScreen.A0;
                return q8.p(nlc.oneme_login_confirm_timer, confirmPhoneScreen.getContext());
        }
    }
}
