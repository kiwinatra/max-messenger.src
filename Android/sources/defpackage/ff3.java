package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import one.me.login.confirm.ConfirmPhoneScreen;

/* renamed from: ff3  reason: default package */
public final /* synthetic */ class ff3 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConfirmPhoneScreen b;

    public /* synthetic */ ff3(ConfirmPhoneScreen confirmPhoneScreen, int i) {
        this.a = i;
        this.b = confirmPhoneScreen;
    }

    public final Object invoke(Object obj) {
        ConfirmPhoneScreen confirmPhoneScreen = this.b;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                KProperty[] kPropertyArr = ConfirmPhoneScreen.A0;
                confirmPhoneScreen.getRouter().C();
                return Unit.INSTANCE;
            default:
                ig3 ig3 = (ig3) obj;
                KProperty[] kPropertyArr2 = ConfirmPhoneScreen.A0;
                if (ig3 == ig3.SUCCESS) {
                    xme xme = confirmPhoneScreen.h0().A0;
                    Boolean bool = Boolean.TRUE;
                    xme.getClass();
                    xme.m((Object) null, bool);
                }
                return Unit.INSTANCE;
        }
    }
}
