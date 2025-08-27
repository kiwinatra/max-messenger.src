package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: s4f  reason: default package */
public final class s4f extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ h5f b;
    public int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s4f(h5f h5f, Continuation continuation) {
        super(continuation);
        this.b = h5f;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= IntCompanionObject.MIN_VALUE;
        return h5f.c(this.b, (Throwable) null, this);
    }
}
