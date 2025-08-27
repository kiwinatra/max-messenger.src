package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: jlf  reason: default package */
public final class jlf extends ContinuationImpl {
    public rlf a;
    public nw0 b;
    public int c;
    public /* synthetic */ Object o;
    public final /* synthetic */ rlf v;
    public int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jlf(rlf rlf, Continuation continuation) {
        super(continuation);
        this.v = rlf;
    }

    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.w |= IntCompanionObject.MIN_VALUE;
        return this.v.h((nw0) null, this);
    }
}
