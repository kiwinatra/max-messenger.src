package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: co5  reason: default package */
public final class co5 extends ContinuationImpl {
    public do5 a;
    public Object b;
    public Object c;
    public xz9 o;
    public /* synthetic */ Object v;
    public final /* synthetic */ do5 w;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public co5(do5 do5, Continuation continuation) {
        super(continuation);
        this.w = do5;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= IntCompanionObject.MIN_VALUE;
        return this.w.f((ulf) null, (cxf) null, this);
    }
}
