package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: jo7  reason: default package */
public final class jo7 extends ContinuationImpl {
    public lo7 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ lo7 c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jo7(lo7 lo7, Continuation continuation) {
        super(continuation);
        this.c = lo7;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.e((jgg) null, this);
    }
}
