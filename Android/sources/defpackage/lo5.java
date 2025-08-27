package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: lo5  reason: default package */
public final class lo5 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ no5 b;
    public int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lo5(no5 no5, Continuation continuation) {
        super(continuation);
        this.b = no5;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= IntCompanionObject.MIN_VALUE;
        return this.b.a(this);
    }
}
