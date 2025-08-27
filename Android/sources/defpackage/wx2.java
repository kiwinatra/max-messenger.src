package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: wx2  reason: default package */
public final class wx2 extends ContinuationImpl {
    public ay2 a;
    public long b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ay2 o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wx2(ay2 ay2, Continuation continuation) {
        super(continuation);
        this.o = ay2;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return ay2.e(this.o, 0, this);
    }
}
