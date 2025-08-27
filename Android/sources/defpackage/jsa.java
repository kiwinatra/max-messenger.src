package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: jsa  reason: default package */
public final class jsa extends ContinuationImpl {
    public msa a;
    public ha9 b;
    public a32 c;
    public /* synthetic */ Object o;
    public final /* synthetic */ msa v;
    public int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jsa(msa msa, Continuation continuation) {
        super(continuation);
        this.v = msa;
    }

    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.w |= IntCompanionObject.MIN_VALUE;
        return this.v.g((a32) null, (ha9) null, this);
    }
}
