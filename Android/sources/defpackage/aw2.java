package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* renamed from: aw2  reason: default package */
public final class aw2 implements bs5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bs5 b;
    public final /* synthetic */ tw2 c;

    public /* synthetic */ aw2(bs5 bs5, tw2 tw2, int i) {
        this.a = i;
        this.b = bs5;
        this.c = tw2;
    }

    public final Object e(ds5 ds5, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object e = this.b.e(new zv2(ds5, this.c, 0), continuation);
                return e == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e : Unit.INSTANCE;
            case 1:
                Object e2 = this.b.e(new zv2(ds5, this.c, 1), continuation);
                return e2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e2 : Unit.INSTANCE;
            case 2:
                Object e3 = this.b.e(new zv2(ds5, this.c, 2), continuation);
                return e3 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e3 : Unit.INSTANCE;
            case 3:
                Object e4 = this.b.e(new zv2(ds5, this.c, 3), continuation);
                return e4 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e4 : Unit.INSTANCE;
            default:
                Object e5 = this.b.e(new zv2(ds5, this.c, 4), continuation);
                return e5 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e5 : Unit.INSTANCE;
        }
    }
}
