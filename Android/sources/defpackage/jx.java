package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: jx  reason: default package */
public final class jx extends ContinuationImpl {
    public nx a;
    public a32 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ nx o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jx(nx nxVar, Continuation continuation) {
        super(continuation);
        this.o = nxVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return this.o.c(0, 0, 0, this);
    }
}
