package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: lx  reason: default package */
public final class lx extends ContinuationImpl {
    public nx a;
    public a32 b;
    public List c;
    public /* synthetic */ Object o;
    public final /* synthetic */ nx v;
    public int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lx(nx nxVar, Continuation continuation) {
        super(continuation);
        this.v = nxVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.w |= IntCompanionObject.MIN_VALUE;
        return this.v.a((a32) null, (List) null, this);
    }
}
