package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: tx  reason: default package */
public final class tx extends ContinuationImpl {
    public ux a;
    public long b;
    public long c;
    public int o;
    public /* synthetic */ Object v;
    public final /* synthetic */ ux w;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tx(ux uxVar, Continuation continuation) {
        super(continuation);
        this.w = uxVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= IntCompanionObject.MIN_VALUE;
        return this.w.c(0, 0, 0, this);
    }
}
