package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: hsa  reason: default package */
public final class hsa extends ContinuationImpl {
    public int A0;
    public int X;
    public int Y;
    public int Z;
    public Object a;
    public Object b;
    public Object c;
    public ha9 o;
    public Object v;
    public boolean v0;
    public Object w;
    public long w0;
    public Object x;
    public long x0;
    public Object y;
    public /* synthetic */ Object y0;
    public xz z;
    public final /* synthetic */ msa z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hsa(msa msa, Continuation continuation) {
        super(continuation);
        this.z0 = msa;
    }

    public final Object invokeSuspend(Object obj) {
        this.y0 = obj;
        this.A0 |= IntCompanionObject.MIN_VALUE;
        return msa.a(this.z0, (ge8) null, (xz) null, this);
    }
}
