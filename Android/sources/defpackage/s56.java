package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: s56  reason: default package */
public final /* synthetic */ class s56 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t56 b;

    public /* synthetic */ s56(t56 t56, int i) {
        this.a = i;
        this.b = t56;
    }

    public final Object invoke(Object obj) {
        y56 y56 = (y56) obj;
        switch (this.a) {
            case 0:
                d66 d66 = (d66) this.b.w;
                if (d66 != null) {
                    ((ms1) d66).e(y56);
                }
                return Unit.INSTANCE;
            case 1:
                d66 d662 = (d66) this.b.w;
                if (d662 != null) {
                    ((ms1) d662).e(y56);
                }
                return Unit.INSTANCE;
            default:
                d66 d663 = (d66) this.b.w;
                if (d663 != null) {
                    ((ms1) d663).e(y56);
                }
                return Unit.INSTANCE;
        }
    }
}
