package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: mlf  reason: default package */
public final class mlf extends ContinuationImpl {
    public rlf a;
    public nw0 b;
    public long c;
    public int o;
    public /* synthetic */ Object v;
    public final /* synthetic */ rlf w;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mlf(rlf rlf, Continuation continuation) {
        super(continuation);
        this.w = rlf;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= IntCompanionObject.MIN_VALUE;
        return this.w.l((nw0) null, this);
    }
}
