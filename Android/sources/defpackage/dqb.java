package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* renamed from: dqb  reason: default package */
public final /* synthetic */ class dqb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ eqb b;

    public /* synthetic */ dqb(eqb eqb, int i) {
        this.a = i;
        this.b = eqb;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                op6 op6 = this.b.b;
                return op6 != null ? op6.c() : n79.g;
            case 1:
                return y64.o(this.b.b != null ? new ArrayList(0) : null);
            default:
                eqb eqb = this.b;
                return Integer.valueOf(hsg.v(eqb, (usd[]) eqb.j.getValue()));
        }
    }
}
