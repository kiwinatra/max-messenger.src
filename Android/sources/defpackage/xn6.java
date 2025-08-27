package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* renamed from: xn6  reason: default package */
public final class xn6 implements bs5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bs5 b;
    public final /* synthetic */ gp6 c;

    public /* synthetic */ xn6(bs5 bs5, gp6 gp6, int i) {
        this.a = i;
        this.b = bs5;
        this.c = gp6;
    }

    public final Object e(ds5 ds5, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object e = this.b.e(new wn6(ds5, this.c, 0), continuation);
                return e == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e : Unit.INSTANCE;
            case 1:
                Object e2 = this.b.e(new wn6(ds5, this.c, 1), continuation);
                return e2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e2 : Unit.INSTANCE;
            default:
                Object e3 = this.b.e(new wn6(ds5, this.c, 2), continuation);
                return e3 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e3 : Unit.INSTANCE;
        }
    }
}
