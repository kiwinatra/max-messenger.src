package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: mt2  reason: default package */
public final class mt2 extends ContinuationImpl {
    public wt2 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ wt2 c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mt2(wt2 wt2, Continuation continuation) {
        super(continuation);
        this.c = wt2;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.d(this);
    }
}
