package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: csa  reason: default package */
public final class csa extends ContinuationImpl {
    public esa a;
    public he8 b;
    public int c;
    public /* synthetic */ Object o;
    public final /* synthetic */ esa v;
    public int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public csa(esa esa, Continuation continuation) {
        super(continuation);
        this.v = esa;
    }

    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.w |= IntCompanionObject.MIN_VALUE;
        return this.v.b((ge8) null, (rr2) null, 0, 0, this);
    }
}
