package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import one.me.calls.ui.ui.call.CallScreen;

/* renamed from: zg1  reason: default package */
public final /* synthetic */ class zg1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallScreen b;

    public /* synthetic */ zg1(CallScreen callScreen, int i) {
        this.a = i;
        this.b = callScreen;
    }

    public final Object invoke(Object obj) {
        CallScreen callScreen = this.b;
        switch (this.a) {
            case 0:
                gga gga = CallScreen.J0;
                callScreen.p0().c.a((vag) obj);
                return Unit.INSTANCE;
            case 1:
                if (((Boolean) obj).booleanValue() && !callScreen.y) {
                    callScreen.p0().m(true);
                }
                callScreen.Y.c();
                return Unit.INSTANCE;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                gga gga2 = CallScreen.J0;
                if (!booleanValue) {
                    callScreen.p0().m(false);
                }
                return Unit.INSTANCE;
        }
    }
}
