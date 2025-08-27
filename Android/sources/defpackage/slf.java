package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: slf  reason: default package */
public final class slf extends ContinuationImpl {
    public ulf a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ulf c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public slf(ulf ulf, Continuation continuation) {
        super(continuation);
        this.c = ulf;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.a(this);
    }
}
