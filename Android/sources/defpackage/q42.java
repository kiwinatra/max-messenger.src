package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: q42  reason: default package */
public final class q42 extends ContinuationImpl {
    public h52 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ h52 c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q42(h52 h52, Continuation continuation) {
        super(continuation);
        this.c = h52;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.n(this);
    }
}
