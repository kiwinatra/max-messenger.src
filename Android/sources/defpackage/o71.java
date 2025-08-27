package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.calllist.ui.CallHistoryScreen;

/* renamed from: o71  reason: default package */
public final /* synthetic */ class o71 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallHistoryScreen b;

    public /* synthetic */ o71(CallHistoryScreen callHistoryScreen, int i) {
        this.a = i;
        this.b = callHistoryScreen;
    }

    public final Object invoke() {
        xme xme;
        Object value;
        CallHistoryScreen callHistoryScreen = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = CallHistoryScreen.y0;
                v71 d0 = callHistoryScreen.d0();
                do {
                    xme = d0.w;
                    value = xme.getValue();
                    t71 t71 = (t71) value;
                } while (!xme.b(value, new t71()));
                ((h3b) callHistoryScreen.v.getValue(callHistoryScreen, CallHistoryScreen.y0[1])).b();
                return Unit.INSTANCE;
            case 1:
                Lazy lazy = callHistoryScreen.a;
                Lazy lazy2 = rjd.a;
                return new v71(sjd.a.getAccessor().h(uj5.class), new qpg(lazy), (lf1) callHistoryScreen.c.getValue());
            case 2:
                KProperty[] kPropertyArr2 = CallHistoryScreen.y0;
                return new lf1(LazyKt.lazy(new o71(callHistoryScreen, 3)), new eng(callHistoryScreen, 0));
            default:
                KProperty[] kPropertyArr3 = CallHistoryScreen.y0;
                return callHistoryScreen.getRouter();
        }
    }
}
