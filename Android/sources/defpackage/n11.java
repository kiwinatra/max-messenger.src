package defpackage;

import java.util.Collection;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import one.me.calls.ui.ui.call.CallScreen;

/* renamed from: n11  reason: default package */
public final /* synthetic */ class n11 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p11 b;

    public /* synthetic */ n11(p11 p11, int i) {
        this.a = i;
        this.b = p11;
    }

    public final Object invoke() {
        p11 p11 = this.b;
        switch (this.a) {
            case 0:
                o11 o11 = p11.F0;
                if (o11 != null) {
                    gga gga = CallScreen.J0;
                    ((CallScreen) ((rt6) o11).b).g0(true);
                }
                return Unit.INSTANCE;
            default:
                o11 o112 = p11.F0;
                if (o112 != null) {
                    gga gga2 = CallScreen.J0;
                    CallScreen callScreen = (CallScreen) ((rt6) o112).b;
                    callScreen.k0().c(rq1.RECALL, false);
                    jj1 p0 = callScreen.p0();
                    k91 l = p0.l();
                    ld9 ld9 = l.c;
                    aj8.a.getClass();
                    boolean r = nfd.r(l.r);
                    boolean r2 = nfd.r(l.s);
                    ap1 ap1 = p0.c;
                    ap1.getClass();
                    if (ld9 != null) {
                        Collection emptyList = CollectionsKt.emptyList();
                        ((mp1) ap1.a).y(new wje(new uje(ld9), r, r2, (Function0) null));
                    }
                    ap1.i();
                    ap1.j();
                }
                return Unit.INSTANCE;
        }
    }
}
