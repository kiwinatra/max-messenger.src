package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: l5g  reason: default package */
public final class l5g extends ContinuationImpl {
    public n5g a;
    public l20 b;
    public k20 c;
    public /* synthetic */ Object o;
    public final /* synthetic */ n5g v;
    public int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l5g(n5g n5g, Continuation continuation) {
        super(continuation);
        this.v = n5g;
    }

    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.w |= IntCompanionObject.MIN_VALUE;
        return this.v.b((l20) null, 0, 0, this);
    }
}
