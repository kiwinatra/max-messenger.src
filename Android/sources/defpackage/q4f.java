package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: q4f  reason: default package */
public final class q4f extends ContinuationImpl {
    public bxf a;
    public /* synthetic */ Object b;
    public final /* synthetic */ h5f c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q4f(h5f h5f, Continuation continuation) {
        super(continuation);
        this.c = h5f;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return h5f.b(this.c, (bxf) null, this);
    }
}
