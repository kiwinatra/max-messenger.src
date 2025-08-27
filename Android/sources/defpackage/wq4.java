package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* renamed from: wq4  reason: default package */
public final class wq4 implements bs5 {
    public final bs5 a;
    public final Function1 b;
    public final Function2 c;

    public wq4(bs5 bs5, Function2 function2) {
        of3 of3 = n79.e;
        this.a = bs5;
        this.b = of3;
        this.c = function2;
    }

    public final Object e(ds5 ds5, Continuation continuation) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = q8.e;
        Object e = this.a.e(new vq4(this, objectRef, ds5), continuation);
        return e == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e : Unit.INSTANCE;
    }
}
