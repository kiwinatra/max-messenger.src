package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: st2  reason: default package */
public final class st2 extends ContinuationImpl {
    public ut2 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ut2 c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public st2(ut2 ut2, Continuation continuation) {
        super(continuation);
        this.c = ut2;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.e((ds5) null, this);
    }
}
