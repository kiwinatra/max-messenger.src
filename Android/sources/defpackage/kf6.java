package defpackage;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;

/* renamed from: kf6  reason: default package */
public final /* synthetic */ class kf6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q13 b;

    public /* synthetic */ kf6(q13 q13, int i) {
        this.a = i;
        this.b = q13;
    }

    public final Object invoke() {
        q13 q13 = this.b;
        switch (this.a) {
            case 0:
                return ((aua) ((Lazy) q13.o).getValue()).b();
            case 1:
                return ((aua) ((Lazy) q13.o).getValue()).a();
            case 2:
                return ((aua) ((Lazy) q13.o).getValue()).a();
            default:
                int availableProcessors = Runtime.getRuntime().availableProcessors();
                aua aua = (aua) ((Lazy) q13.o).getValue();
                KProperty[] kPropertyArr = aua.o;
                return aua.h(aua.e(availableProcessors, "frsc-sch", availableProcessors, 5), "frsc-sch");
        }
    }
}
