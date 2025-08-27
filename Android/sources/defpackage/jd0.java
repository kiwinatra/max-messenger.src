package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: jd0  reason: default package */
public final class jd0 extends ContinuationImpl {
    public ld0 a;
    public xk2 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ld0 o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jd0(ld0 ld0, Continuation continuation) {
        super(continuation);
        this.o = ld0;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return this.o.a((xk2) null, this);
    }
}
