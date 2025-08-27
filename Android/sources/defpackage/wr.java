package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: wr  reason: default package */
public final class wr extends ContinuationImpl {
    public as a;
    public /* synthetic */ Object b;
    public final /* synthetic */ as c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wr(as asVar, Continuation continuation) {
        super(continuation);
        this.c = asVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.k(this);
    }
}
