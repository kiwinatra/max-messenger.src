package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: pg2  reason: default package */
public final class pg2 extends ContinuationImpl {
    public String a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ gh2 o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pg2(gh2 gh2, Continuation continuation) {
        super(continuation);
        this.o = gh2;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return this.o.u(0, (String) null, 0, false, this);
    }
}
