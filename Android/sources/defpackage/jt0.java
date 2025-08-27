package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: jt0  reason: default package */
public final class jt0 extends ContinuationImpl {
    public sa3 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ st0 c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jt0(st0 st0, Continuation continuation) {
        super(continuation);
        this.c = st0;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.b(this);
    }
}
