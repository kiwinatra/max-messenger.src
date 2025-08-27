package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: qr9  reason: default package */
public final class qr9 extends ContinuationImpl {
    public f0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ f0 c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qr9(f0 f0Var, Continuation continuation) {
        super(continuation);
        this.c = f0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.g(this);
    }
}
