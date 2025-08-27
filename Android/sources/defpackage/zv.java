package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: zv  reason: default package */
public final class zv extends ContinuationImpl {
    public gx a;
    public Object b;
    public sa3 c;
    public long o;
    public /* synthetic */ Object v;
    public final /* synthetic */ gx w;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zv(gx gxVar, Continuation continuation) {
        super(continuation);
        this.w = gxVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= IntCompanionObject.MIN_VALUE;
        return this.w.s(0, this);
    }
}
