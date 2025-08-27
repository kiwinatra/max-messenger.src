package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: olf  reason: default package */
public final class olf extends ContinuationImpl {
    public rlf a;
    public nw0 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ rlf o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public olf(rlf rlf, Continuation continuation) {
        super(continuation);
        this.o = rlf;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return this.o.n((nw0) null, this);
    }
}
