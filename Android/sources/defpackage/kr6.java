package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: kr6  reason: default package */
public final class kr6 extends ContinuationImpl {
    public lr6 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ lr6 c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kr6(lr6 lr6, Continuation continuation) {
        super(continuation);
        this.c = lr6;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.a(0, (ij2) null, 0, (String) null, this);
    }
}
