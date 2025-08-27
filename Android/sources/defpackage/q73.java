package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: q73  reason: default package */
public final class q73 extends ContinuationImpl {
    public t73 a;
    public op2 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ t73 o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q73(t73 t73, Continuation continuation) {
        super(continuation);
        this.o = t73;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return t73.b(this.o, this);
    }
}
