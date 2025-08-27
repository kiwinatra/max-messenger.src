package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: yl2  reason: default package */
public final class yl2 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ em2 b;
    public int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yl2(em2 em2, Continuation continuation) {
        super(continuation);
        this.b = em2;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= IntCompanionObject.MIN_VALUE;
        return this.b.t(this);
    }
}
