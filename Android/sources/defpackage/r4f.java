package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: r4f  reason: default package */
public final class r4f extends ContinuationImpl {
    public h5f a;
    public fbf b;
    public ibf c;
    public long o;
    public /* synthetic */ Object v;
    public final /* synthetic */ h5f w;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r4f(h5f h5f, Continuation continuation) {
        super(continuation);
        this.w = h5f;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= IntCompanionObject.MIN_VALUE;
        return this.w.i((fbf) null, 0, this);
    }
}
