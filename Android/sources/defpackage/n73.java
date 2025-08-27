package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: n73  reason: default package */
public final class n73 extends ContinuationImpl {
    public t73 a;
    public f73 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ t73 o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n73(t73 t73, Continuation continuation) {
        super(continuation);
        this.o = t73;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return t73.a(this.o, (f73) null, this);
    }
}
