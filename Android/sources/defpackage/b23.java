package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: b23  reason: default package */
public final class b23 extends ContinuationImpl {
    public d23 a;
    public Long b;
    public long c;
    public /* synthetic */ Object o;
    public final /* synthetic */ d23 v;
    public int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b23(d23 d23, Continuation continuation) {
        super(continuation);
        this.v = d23;
    }

    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.w |= IntCompanionObject.MIN_VALUE;
        return this.v.g(0, (mta) null, this);
    }
}
