package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: y53  reason: default package */
public final class y53 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ z53 b;
    public int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y53(z53 z53, Continuation continuation) {
        super(continuation);
        this.b = z53;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= IntCompanionObject.MIN_VALUE;
        return this.b.a((Object) null, this);
    }
}
