package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;

/* renamed from: nsa  reason: default package */
public final /* synthetic */ class nsa implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ osa b;

    public /* synthetic */ nsa(osa osa, int i) {
        this.a = i;
        this.b = osa;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new y95(this.b.d().a());
            case 1:
                return new y95(this.b.d().b());
            case 2:
                aua d = this.b.d();
                d.getClass();
                KProperty kProperty = aua.o[4];
                return new y95(d.d(d.j));
            case 3:
                return new y95((ScheduledExecutorService) this.b.d().m.getValue());
            default:
                aua d2 = this.b.d();
                d2.getClass();
                KProperty kProperty2 = aua.o[3];
                return new y95(d2.d(d2.i));
        }
    }
}
