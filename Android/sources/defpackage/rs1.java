package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: rs1  reason: default package */
public final /* synthetic */ class rs1 implements eo1, vu {
    public final /* synthetic */ int a;
    public final /* synthetic */ ss1 b;

    public /* synthetic */ rs1(ss1 ss1, int i) {
        this.a = i;
        this.b = ss1;
    }

    public zz7 apply(Object obj) {
        Void voidR = (Void) obj;
        switch (this.a) {
            case 1:
                ss1 ss1 = this.b;
                if (!ss1.f) {
                    return xa7.c;
                }
                wx5 wx5 = ss1.a.h;
                wx5.getClass();
                return m5a.F(new lc5(10, (Object) wx5));
            default:
                fm0 fm0 = new fm0(17);
                ss1 ss12 = this.b;
                ScheduledExecutorService scheduledExecutorService = ss12.e;
                long millis = TimeUnit.NANOSECONDS.toMillis(ss1.g);
                ns1 ns1 = new ns1(fm0);
                lr1 lr1 = ss12.a;
                lr1.p(ns1);
                ir1 ir1 = new ir1(5, lr1, ns1);
                go1 go1 = ns1.b;
                go1.b.d(ir1, lr1.c);
                return m5a.F(new cr0(go1, scheduledExecutorService, millis));
        }
    }

    public Object r(do1 do1) {
        this.b.a.j.a(do1, true);
        return "TorchOn";
    }
}
