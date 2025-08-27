package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: qk7  reason: default package */
public final class qk7 extends ContinuationImpl {
    public Object a;
    public /* synthetic */ Object b;
    public final /* synthetic */ xk7 c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qk7(xk7 xk7, Continuation continuation) {
        super(continuation);
        this.c = xk7;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return xk7.j(this.c, (String) null, (String) null, this);
    }
}
