package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* renamed from: pw1  reason: default package */
public final class pw1 implements nw1 {
    public final bs5 a;

    public pw1(bs5 bs5) {
        this.a = bs5;
    }

    public final Object e(ds5 ds5, Continuation continuation) {
        Object e = this.a.e(new oc(ds5, 26), continuation);
        return e == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e : Unit.INSTANCE;
    }
}
