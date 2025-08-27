package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: xj  reason: default package */
public final class xj extends ContinuationImpl {
    public gk a;
    public asc b;
    public /* synthetic */ Object c;
    public final /* synthetic */ gk o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xj(gk gkVar, Continuation continuation) {
        super(continuation);
        this.o = gkVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return this.o.f((asc) null, this);
    }
}
