package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: lu5  reason: default package */
public final class lu5 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ ps5 c;
    public os5 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lu5(ps5 ps5, Continuation continuation) {
        super(continuation);
        this.c = ps5;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.c.e((ds5) null, this);
    }
}
