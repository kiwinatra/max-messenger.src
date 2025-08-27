package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: r59  reason: default package */
public final class r59 extends ContinuationImpl {
    public x59 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ x59 c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r59(x59 x59, Continuation continuation) {
        super(continuation);
        this.c = x59;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return x59.l(this.c, (a32) null, this);
    }
}
