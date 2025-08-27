package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: fj7  reason: default package */
public final class fj7 extends ContinuationImpl {
    public hj7 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ hj7 c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fj7(hj7 hj7, Continuation continuation) {
        super(continuation);
        this.c = hj7;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.a(this);
    }
}
