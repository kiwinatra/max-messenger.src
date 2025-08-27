package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: n59  reason: default package */
public final class n59 extends ContinuationImpl {
    public x59 a;
    public Object b;
    public List c;
    public List o;
    public /* synthetic */ Object v;
    public final /* synthetic */ x59 w;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n59(x59 x59, Continuation continuation) {
        super(continuation);
        this.w = x59;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= IntCompanionObject.MIN_VALUE;
        return this.w.o((a32) null, (ha9) null, this);
    }
}
