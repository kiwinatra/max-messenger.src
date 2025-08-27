package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: vlf  reason: default package */
public final class vlf extends ContinuationImpl {
    public Object a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ xlf o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vlf(xlf xlf, Continuation continuation) {
        super(continuation);
        this.o = xlf;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return this.o.a((xn5) null, this);
    }
}
