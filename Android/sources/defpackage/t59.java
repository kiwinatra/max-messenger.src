package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: t59  reason: default package */
public final class t59 extends ContinuationImpl {
    public x59 a;
    public x59 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ x59 o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t59(x59 x59, Continuation continuation) {
        super(continuation);
        this.o = x59;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return this.o.r(this);
    }
}
