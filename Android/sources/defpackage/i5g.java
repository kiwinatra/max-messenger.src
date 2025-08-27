package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: i5g  reason: default package */
public final class i5g extends ContinuationImpl {
    public n5g a;
    public k20 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ n5g o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i5g(n5g n5g, Continuation continuation) {
        super(continuation);
        this.o = n5g;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return this.o.a((l20) null, 0, 0, this);
    }
}
