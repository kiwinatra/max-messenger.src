package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ilf  reason: default package */
public final class ilf extends ContinuationImpl {
    public rlf a;
    public /* synthetic */ Object b;
    public final /* synthetic */ rlf c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ilf(rlf rlf, Continuation continuation) {
        super(continuation);
        this.c = rlf;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.g(this);
    }
}
