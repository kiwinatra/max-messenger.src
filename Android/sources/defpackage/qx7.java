package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: qx7  reason: default package */
public final class qx7 extends ContinuationImpl {
    public ds5 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ by7 c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qx7(by7 by7, Continuation continuation) {
        super(continuation);
        this.c = by7;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.g((ds5) null, (cz7) null, this);
    }
}
