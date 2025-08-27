package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: u6g  reason: default package */
public final class u6g extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ y6g b;
    public int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u6g(y6g y6g, Continuation continuation) {
        super(continuation);
        this.b = y6g;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= IntCompanionObject.MIN_VALUE;
        return this.b.e(0, this);
    }
}
