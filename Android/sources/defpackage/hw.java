package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: hw  reason: default package */
public final class hw extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ gx b;
    public int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hw(gx gxVar, Continuation continuation) {
        super(continuation);
        this.b = gxVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= IntCompanionObject.MIN_VALUE;
        return gx.b(this.b, (u0d) null, 0, this);
    }
}
