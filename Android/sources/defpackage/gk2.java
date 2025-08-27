package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* renamed from: gk2  reason: default package */
public final class gk2 implements bs5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bs5 b;
    public final /* synthetic */ lk2 c;

    public /* synthetic */ gk2(bs5 bs5, lk2 lk2, int i) {
        this.a = i;
        this.b = bs5;
        this.c = lk2;
    }

    public final Object e(ds5 ds5, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object e = this.b.e(new fk2(ds5, this.c, 0), continuation);
                return e == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e : Unit.INSTANCE;
            default:
                Object e2 = this.b.e(new fk2(ds5, this.c, 1), continuation);
                return e2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e2 : Unit.INSTANCE;
        }
    }
}
