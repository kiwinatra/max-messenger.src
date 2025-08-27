package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: vo9  reason: default package */
public final class vo9 extends ContinuationImpl {
    public wo9 a;
    public Object b;
    public long c;
    public long o;
    public /* synthetic */ Object v;
    public final /* synthetic */ wo9 w;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vo9(wo9 wo9, Continuation continuation) {
        super(continuation);
        this.w = wo9;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= IntCompanionObject.MIN_VALUE;
        return this.w.b(0, (List) null, this);
    }
}
