package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: pk5  reason: default package */
public final class pk5 extends ContinuationImpl {
    public rk5 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ rk5 c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pk5(rk5 rk5, Continuation continuation) {
        super(continuation);
        this.c = rk5;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.a(0, 0, (String) null, (String) null, (String) null, (cl5) null, this);
    }
}
