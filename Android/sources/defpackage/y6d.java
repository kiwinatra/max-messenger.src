package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: y6d  reason: default package */
public final class y6d extends ContinuationImpl {
    public z6d a;
    public /* synthetic */ Object b;
    public final /* synthetic */ z6d c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y6d(z6d z6d, Continuation continuation) {
        super(continuation);
        this.c = z6d;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.k(0, this);
    }
}
