package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: hva  reason: default package */
public final class hva extends ContinuationImpl {
    public kva a;
    public /* synthetic */ Object b;
    public final /* synthetic */ kva c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hva(kva kva, Continuation continuation) {
        super(continuation);
        this.c = kva;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.f(this);
    }
}
