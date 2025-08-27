package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: qk5  reason: default package */
public final class qk5 extends ContinuationImpl {
    public rk5 a;
    public String b;
    public String c;
    public long o;
    public long v;
    public /* synthetic */ Object w;
    public final /* synthetic */ rk5 x;
    public int y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qk5(rk5 rk5, Continuation continuation) {
        super(continuation);
        this.x = rk5;
    }

    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= IntCompanionObject.MIN_VALUE;
        return this.x.c(0, 0, 0, (String) null, (String) null, this);
    }
}
