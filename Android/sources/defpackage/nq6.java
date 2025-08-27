package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: nq6  reason: default package */
public final class nq6 extends ContinuationImpl {
    public Object a;
    public /* synthetic */ Object b;
    public final /* synthetic */ oq6 c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nq6(oq6 oq6, Continuation continuation) {
        super(continuation);
        this.c = oq6;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.a((String) null, this);
    }
}
