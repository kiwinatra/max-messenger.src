package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: m59  reason: default package */
public final class m59 extends ContinuationImpl {
    public Object a;
    public Object b;
    public Object c;
    public int o;
    public /* synthetic */ Object v;
    public final /* synthetic */ x59 w;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m59(x59 x59, Continuation continuation) {
        super(continuation);
        this.w = x59;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= IntCompanionObject.MIN_VALUE;
        return this.w.n((a32) null, (ha9) null, false, this);
    }
}
