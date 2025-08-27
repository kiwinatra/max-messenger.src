package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ey2  reason: default package */
public final class ey2 extends ContinuationImpl {
    public my2 a;
    public List b;
    public long c;
    public boolean o;
    public /* synthetic */ Object v;
    public final /* synthetic */ my2 w;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ey2(my2 my2, Continuation continuation) {
        super(continuation);
        this.w = my2;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= IntCompanionObject.MIN_VALUE;
        return this.w.g(0, (List) null, false, this);
    }
}
