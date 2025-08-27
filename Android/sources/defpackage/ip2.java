package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;

/* renamed from: ip2  reason: default package */
public final /* synthetic */ class ip2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lp2 b;

    public /* synthetic */ ip2(lp2 lp2, int i) {
        this.a = i;
        this.b = lp2;
    }

    public final Object invoke(Object obj) {
        lp2 lp2 = this.b;
        View view = (View) obj;
        switch (this.a) {
            case 0:
                xag.h(lp2.T0, yn2.a);
                return Unit.INSTANCE;
            default:
                KProperty[] kPropertyArr = lp2.X0;
                xag.g(lp2, ((osa) lp2.l()).b(), (f14) null, new mo2(lp2, view, (Continuation) null), 2);
                return Unit.INSTANCE;
        }
    }
}
