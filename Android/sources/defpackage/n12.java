package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* renamed from: n12  reason: default package */
public final class n12 extends m12 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n12(int i, int i2, cu0 cu0, bs5 bs5, CoroutineContext coroutineContext) {
        super(bs5, (i2 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? cu0.a : cu0);
    }

    public final f12 j(CoroutineContext coroutineContext, int i, cu0 cu0) {
        return new m12(this.o, coroutineContext, i, cu0);
    }

    public final bs5 k() {
        return this.o;
    }

    public final Object m(ds5 ds5, Continuation continuation) {
        Object e = this.o.e(ds5, continuation);
        return e == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e : Unit.INSTANCE;
    }
}
