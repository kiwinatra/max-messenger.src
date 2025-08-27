package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function3;

/* renamed from: s12  reason: default package */
public final class s12 extends m12 {
    public final Function3 v;

    public s12(Function3 function3, bs5 bs5, CoroutineContext coroutineContext, int i, cu0 cu0) {
        super(bs5, coroutineContext, i, cu0);
        this.v = function3;
    }

    public final f12 j(CoroutineContext coroutineContext, int i, cu0 cu0) {
        return new s12(this.v, this.o, coroutineContext, i, cu0);
    }

    public final Object m(ds5 ds5, Continuation continuation) {
        Object d = e14.d(new r12(this, ds5, (Continuation) null), continuation);
        return d == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? d : Unit.INSTANCE;
    }
}
