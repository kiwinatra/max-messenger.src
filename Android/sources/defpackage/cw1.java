package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: cw1  reason: default package */
public final class cw1 extends ContinuationImpl {
    public dw1 a;
    public long b;
    public long c;
    public long o;
    public long v;
    public /* synthetic */ Object w;
    public final /* synthetic */ dw1 x;
    public int y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cw1(dw1 dw1, Continuation continuation) {
        super(continuation);
        this.x = dw1;
    }

    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= IntCompanionObject.MIN_VALUE;
        return this.x.a(0, 0, 0, 0, (qqc) null, this);
    }
}
