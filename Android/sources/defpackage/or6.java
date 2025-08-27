package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: or6  reason: default package */
public final class or6 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ aqg b;
    public int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public or6(aqg aqg, Continuation continuation) {
        super(continuation);
        this.b = aqg;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= IntCompanionObject.MIN_VALUE;
        return this.b.i((String) null, this);
    }
}
