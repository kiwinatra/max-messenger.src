package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: dh2  reason: default package */
public final class dh2 extends ContinuationImpl {
    public gh2 a;
    public long b;
    public /* synthetic */ Object c;
    public final /* synthetic */ gh2 o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dh2(gh2 gh2, Continuation continuation) {
        super(continuation);
        this.o = gh2;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return gh2.k(this.o, (i29) null, this);
    }
}
