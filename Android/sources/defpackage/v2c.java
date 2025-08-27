package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* renamed from: v2c  reason: default package */
public final class v2c implements bs5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bs5 b;
    public final /* synthetic */ z2c c;

    public /* synthetic */ v2c(bs5 bs5, z2c z2c, int i) {
        this.a = i;
        this.b = bs5;
        this.c = z2c;
    }

    public final Object e(ds5 ds5, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object e = this.b.e(new u2c(ds5, this.c, 0), continuation);
                return e == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e : Unit.INSTANCE;
            default:
                Object e2 = this.b.e(new u2c(ds5, this.c, 1), continuation);
                return e2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e2 : Unit.INSTANCE;
        }
    }
}
