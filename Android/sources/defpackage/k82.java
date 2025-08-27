package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: k82  reason: default package */
public final class k82 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ m82 b;
    public int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k82(m82 m82, Continuation continuation) {
        super(continuation);
        this.b = m82;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= IntCompanionObject.MIN_VALUE;
        return this.b.l(this);
    }
}
