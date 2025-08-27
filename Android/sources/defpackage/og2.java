package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: og2  reason: default package */
public final class og2 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ gh2 b;
    public int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public og2(gh2 gh2, Continuation continuation) {
        super(continuation);
        this.b = gh2;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= IntCompanionObject.MIN_VALUE;
        return this.b.t(0, this);
    }
}
