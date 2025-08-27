package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: du3  reason: default package */
public final class du3 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ eu3 b;
    public int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public du3(eu3 eu3, Continuation continuation) {
        super(continuation);
        this.b = eu3;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= IntCompanionObject.MIN_VALUE;
        return this.b.b(0, this);
    }
}
