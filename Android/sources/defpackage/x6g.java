package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: x6g  reason: default package */
public final class x6g extends ContinuationImpl {
    public y6g a;
    public /* synthetic */ Object b;
    public final /* synthetic */ y6g c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x6g(y6g y6g, Continuation continuation) {
        super(continuation);
        this.c = y6g;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.f((kxc) null, this);
    }
}
