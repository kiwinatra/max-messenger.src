package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: h5c  reason: default package */
public final class h5c extends ContinuationImpl {
    public j5c a;
    public long b;
    public long c;
    public /* synthetic */ Object o;
    public final /* synthetic */ j5c v;
    public int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h5c(j5c j5c, Continuation continuation) {
        super(continuation);
        this.v = j5c;
    }

    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.w |= IntCompanionObject.MIN_VALUE;
        return this.v.i((Long) null, this);
    }
}
