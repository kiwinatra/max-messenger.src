package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ryb  reason: default package */
public final class ryb extends ContinuationImpl {
    public a32 a;
    public vk3 b;
    public boolean c;
    public int o;
    public /* synthetic */ Object v;
    public final /* synthetic */ syb w;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ryb(syb syb, Continuation continuation) {
        super(continuation);
        this.w = syb;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= IntCompanionObject.MIN_VALUE;
        return syb.j(this.w, (a32) null, (vk3) null, false, this);
    }
}
