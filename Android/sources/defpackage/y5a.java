package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: y5a  reason: default package */
public final class y5a extends ContinuationImpl {
    public z5a a;
    public a0a b;
    public /* synthetic */ Object c;
    public final /* synthetic */ z5a o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y5a(z5a z5a, Continuation continuation) {
        super(continuation);
        this.o = z5a;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return z5a.a(this.o, this);
    }
}
