package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: uf2  reason: default package */
public final class uf2 extends ContinuationImpl {
    public vf2 a;
    public long b;
    public long c;
    public int o;
    public /* synthetic */ Object v;
    public final /* synthetic */ vf2 w;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uf2(vf2 vf2, Continuation continuation) {
        super(continuation);
        this.w = vf2;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= IntCompanionObject.MIN_VALUE;
        return this.w.c(0, 0, 0, this);
    }
}
