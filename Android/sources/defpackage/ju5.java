package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ju5  reason: default package */
public final class ju5 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ ku5 b;
    public int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ju5(ku5 ku5, Continuation continuation) {
        super(continuation);
        this.b = ku5;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= IntCompanionObject.MIN_VALUE;
        return this.b.a((Object) null, this);
    }
}
