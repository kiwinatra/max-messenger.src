package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: fu5  reason: default package */
public final class fu5 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ gu5 b;
    public int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fu5(gu5 gu5, Continuation continuation) {
        super(continuation);
        this.b = gu5;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= IntCompanionObject.MIN_VALUE;
        return this.b.a((Object) null, this);
    }
}
