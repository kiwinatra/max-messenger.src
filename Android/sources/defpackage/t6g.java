package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: t6g  reason: default package */
public final class t6g extends ContinuationImpl {
    public y6g a;
    public kub b;
    public y6g c;
    public /* synthetic */ Object o;
    public final /* synthetic */ y6g v;
    public int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t6g(y6g y6g, Continuation continuation) {
        super(continuation);
        this.v = y6g;
    }

    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.w |= IntCompanionObject.MIN_VALUE;
        return this.v.k((kub) null, this);
    }
}
