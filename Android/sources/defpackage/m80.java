package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: m80  reason: default package */
public final class m80 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ n80 b;
    public int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m80(n80 n80, Continuation continuation) {
        super(continuation);
        this.b = n80;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= IntCompanionObject.MIN_VALUE;
        return this.b.a((f0d) null, this);
    }
}
