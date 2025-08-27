package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: xm1  reason: default package */
public final class xm1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ ym1 b;
    public int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xm1(ym1 ym1, Continuation continuation) {
        super(continuation);
        this.b = ym1;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= IntCompanionObject.MIN_VALUE;
        return this.b.a(0, this);
    }
}
