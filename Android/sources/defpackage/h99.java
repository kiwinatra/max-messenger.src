package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: h99  reason: default package */
public final class h99 extends ContinuationImpl {
    public i99 a;
    public z93 b;
    public List c;
    public /* synthetic */ Object o;
    public final /* synthetic */ i99 v;
    public int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h99(i99 i99, Continuation continuation) {
        super(continuation);
        this.v = i99;
    }

    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.w |= IntCompanionObject.MIN_VALUE;
        return this.v.a((z93) null, (List) null, this);
    }
}
