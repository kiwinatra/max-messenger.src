package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: gr0  reason: default package */
public final class gr0 extends ContinuationImpl {
    public hr0 a;
    public yt2 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ hr0 o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gr0(hr0 hr0, Continuation continuation) {
        super(continuation);
        this.o = hr0;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return hr0.a(this.o, this);
    }
}
