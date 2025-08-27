package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: qf2  reason: default package */
public final class qf2 extends ContinuationImpl {
    public vf2 a;
    public a32 b;
    public ha9 c;
    public long o;
    public int v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ vf2 y;
    public int z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qf2(vf2 vf2, Continuation continuation) {
        super(continuation);
        this.y = vf2;
    }

    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= IntCompanionObject.MIN_VALUE;
        return this.y.a(0, 0, 0, 0, 0, this);
    }
}
