package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: isa  reason: default package */
public final class isa extends ContinuationImpl {
    public msa a;
    public ha9 b;
    public xz c;
    public /* synthetic */ Object o;
    public final /* synthetic */ msa v;
    public int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public isa(msa msa, Continuation continuation) {
        super(continuation);
        this.v = msa;
    }

    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.w |= IntCompanionObject.MIN_VALUE;
        return this.v.d((ha9) null, (xz) null, this);
    }
}
