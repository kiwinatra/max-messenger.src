package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.functions.Function0;

/* renamed from: xta  reason: default package */
public final /* synthetic */ class xta implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aua b;
    public final /* synthetic */ v95 c;

    public /* synthetic */ xta(aua aua, v95 v95, int i) {
        this.a = i;
        this.b = aua;
        this.c = v95;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                aua aua = this.b;
                wta wta = (wta) aua.e.getValue();
                v95 v95 = this.c;
                int i = v95.b;
                wta.getClass();
                return aua.j(ScheduledExecutorService.class.cast(new ScheduledThreadPoolExecutor(i, wta.a.B("OneMeScheduler", Integer.valueOf(v95.g)))), "OneMeScheduler");
            case 1:
                aua aua2 = this.b;
                return aua2.h(aua2.b(), this.c.a);
            default:
                aua aua3 = this.b;
                return aua3.h(aua3.c(), this.c.a);
        }
    }
}
