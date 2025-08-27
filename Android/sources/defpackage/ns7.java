package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;

/* renamed from: ns7  reason: default package */
public final class ns7 extends aje {
    public final Continuation o;

    public ns7(CoroutineContext coroutineContext, Function2 function2) {
        super(coroutineContext, true, false);
        this.o = IntrinsicsKt.createCoroutineUnintercepted(function2, this, this);
    }

    public final void Z() {
        qw1.a(this.o, this);
    }
}
