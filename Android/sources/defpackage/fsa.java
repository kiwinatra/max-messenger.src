package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: fsa  reason: default package */
public final class fsa extends ContinuationImpl {
    public msa a;
    public ha9 b;
    public xz c;
    public l10 o;
    public /* synthetic */ Object v;
    public final /* synthetic */ msa w;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fsa(msa msa, Continuation continuation) {
        super(continuation);
        this.w = msa;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= IntCompanionObject.MIN_VALUE;
        return this.w.b((ha9) null, (xz) null, this);
    }
}
