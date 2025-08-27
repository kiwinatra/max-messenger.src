package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: gsa  reason: default package */
public final class gsa extends ContinuationImpl {
    public int X;
    public msa a;
    public xz b;
    public boolean c;
    public boolean o;
    public boolean v;
    public long w;
    public long x;
    public /* synthetic */ Object y;
    public final /* synthetic */ msa z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gsa(msa msa, Continuation continuation) {
        super(continuation);
        this.z = msa;
    }

    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.X |= IntCompanionObject.MIN_VALUE;
        return this.z.c((ie8) null, (ha9) null, false, (xz) null, false, this);
    }
}
