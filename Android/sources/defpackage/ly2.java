package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ly2  reason: default package */
public final class ly2 extends ContinuationImpl {
    public my2 a;
    public Set b;
    public long c;
    public int o;
    public /* synthetic */ Object v;
    public final /* synthetic */ my2 w;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ly2(my2 my2, Continuation continuation) {
        super(continuation);
        this.w = my2;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= IntCompanionObject.MIN_VALUE;
        return this.w.v(0, (Set) null, 0, this);
    }
}
