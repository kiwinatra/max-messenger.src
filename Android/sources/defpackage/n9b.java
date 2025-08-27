package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* renamed from: n9b  reason: default package */
public final class n9b implements bs5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bs5 b;
    public final /* synthetic */ v9b c;

    public /* synthetic */ n9b(bs5 bs5, v9b v9b, int i) {
        this.a = i;
        this.b = bs5;
        this.c = v9b;
    }

    public final Object e(ds5 ds5, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object e = this.b.e(new m9b(ds5, this.c, 0), continuation);
                return e == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e : Unit.INSTANCE;
            case 1:
                Object e2 = this.b.e(new m9b(ds5, this.c, 1), continuation);
                return e2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e2 : Unit.INSTANCE;
            default:
                Object e3 = this.b.e(new m9b(ds5, this.c, 2), continuation);
                return e3 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e3 : Unit.INSTANCE;
        }
    }
}
