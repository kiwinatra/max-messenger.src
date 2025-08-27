package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: bk0  reason: default package */
public final /* synthetic */ class bk0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f3a b;

    public /* synthetic */ bk0(f3a f3a, int i) {
        this.a = i;
        this.b = f3a;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                f3a f3a = this.b;
                f3a.y.e("LOCATION_MAP_TYPE_NORMAL");
                f3a.N(new zj0(8));
                return Unit.INSTANCE;
            case 1:
                f3a f3a2 = this.b;
                f3a2.y.e("LOCATION_MAP_TYPE_SATELLITE");
                f3a2.N(new zj0(7));
                return Unit.INSTANCE;
            default:
                f3a f3a3 = this.b;
                f3a3.y.e("LOCATION_MAP_TYPE_HYBRID");
                f3a3.N(new zj0(9));
                return Unit.INSTANCE;
        }
    }
}
