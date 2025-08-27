package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: cq2  reason: default package */
public final class cq2 extends ContinuationImpl {
    public dq2 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ dq2 c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cq2(dq2 dq2, Continuation continuation) {
        super(continuation);
        this.c = dq2;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.d(this);
    }
}
