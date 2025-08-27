package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import ru.ok.messages.calls.utils.StartCallsViewModel;

/* renamed from: mke  reason: default package */
public final /* synthetic */ class mke implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StartCallsViewModel b;

    public /* synthetic */ mke(StartCallsViewModel startCallsViewModel, int i) {
        this.a = i;
        this.b = startCallsViewModel;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                StartCallsViewModel startCallsViewModel = this.b;
                startCallsViewModel.getClass();
                z68.c(StartCallsViewModel.u, "on positive button clicked", new Object[0]);
                KProperty[] kPropertyArr = StartCallsViewModel.t;
                pje pje = (pje) startCallsViewModel.j.getValue(startCallsViewModel, kPropertyArr[0]);
                if (pje != null) {
                    if (pje instanceof kje) {
                        w21 w21 = startCallsViewModel.f;
                        w21.getClass();
                        y64.B(new b(21, (Object) w21));
                        hsg.l(startCallsViewModel.p);
                        o85 o85 = new o85(new zje(w21));
                        xme xme = startCallsViewModel.n;
                        xme.getClass();
                        xme.m((Object) null, o85);
                    } else {
                        if (pje instanceof oje) {
                            if (!((Boolean) startCallsViewModel.k.getValue(startCallsViewModel, kPropertyArr[1])).booleanValue()) {
                                startCallsViewModel.m();
                            }
                        }
                        startCallsViewModel.l(pje, startCallsViewModel.k());
                    }
                }
                return Unit.INSTANCE;
            default:
                StartCallsViewModel startCallsViewModel2 = this.b;
                startCallsViewModel2.getClass();
                z68.c(StartCallsViewModel.u, "on negative button clicked", new Object[0]);
                hsg.l(startCallsViewModel2.q);
                return Unit.INSTANCE;
        }
    }
}
