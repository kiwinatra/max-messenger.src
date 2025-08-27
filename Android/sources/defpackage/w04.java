package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: w04  reason: default package */
public final class w04 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ x04 b;
    public int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w04(x04 x04, Continuation continuation) {
        super(continuation);
        this.b = x04;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= IntCompanionObject.MIN_VALUE;
        return this.b.m(this);
    }
}
