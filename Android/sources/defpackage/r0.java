package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: r0  reason: default package */
public final class r0 extends ContinuationImpl {
    public pbd a;
    public /* synthetic */ Object b;
    public final /* synthetic */ sbd c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r0(sbd sbd, Continuation continuation) {
        super(continuation);
        this.c = sbd;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.e((ds5) null, this);
    }
}
