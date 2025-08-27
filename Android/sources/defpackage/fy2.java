package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: fy2  reason: default package */
public final class fy2 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ my2 b;
    public int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fy2(my2 my2, Continuation continuation) {
        super(continuation);
        this.b = my2;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= IntCompanionObject.MIN_VALUE;
        return this.b.i(this);
    }
}
