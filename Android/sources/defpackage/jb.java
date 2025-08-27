package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: jb  reason: default package */
public final class jb extends ContinuationImpl {
    public lb a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ lb o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jb(lb lbVar, Continuation continuation) {
        super(continuation);
        this.o = lbVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return lb.a(this.o, this);
    }
}
