package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: fca  reason: default package */
public final class fca extends ContinuationImpl {
    public ba7 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ jca c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fca(jca jca, Continuation continuation) {
        super(continuation);
        this.c = jca;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.a((ba7) null, (qa7) null, this);
    }
}
