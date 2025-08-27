package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ql2  reason: default package */
public final class ql2 extends ContinuationImpl {
    public rl2 a;
    public long b;
    public long c;
    public long o;
    public boolean v;
    public /* synthetic */ Object w;
    public final /* synthetic */ rl2 x;
    public int y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ql2(rl2 rl2, Continuation continuation) {
        super(continuation);
        this.x = rl2;
    }

    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= IntCompanionObject.MIN_VALUE;
        return this.x.a(0, 0, 0, false, this);
    }
}
