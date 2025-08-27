package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: so9  reason: default package */
public final class so9 extends ContinuationImpl {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ to9 c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public so9(to9 to9, Continuation continuation) {
        super(continuation);
        this.c = to9;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.c(0, 0, 0, false, 0, (bl4) null, this);
    }
}
