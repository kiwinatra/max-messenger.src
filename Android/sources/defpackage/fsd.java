package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* renamed from: fsd  reason: default package */
public final class fsd implements ds5 {
    public final qrd a;

    public fsd(qrd qrd) {
        this.a = qrd;
    }

    public final Object a(Object obj, Continuation continuation) {
        Object t = this.a.t(obj, continuation);
        return t == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? t : Unit.INSTANCE;
    }
}
