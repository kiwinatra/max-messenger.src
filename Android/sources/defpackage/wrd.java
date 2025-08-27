package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: wrd  reason: default package */
public final class wrd extends ContinuationImpl {
    public int X;
    public xrd a;
    public hqc b;
    public vd9 c;
    public long o;
    public long v;
    public long w;
    public long x;
    public /* synthetic */ Object y;
    public final /* synthetic */ xrd z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wrd(xrd xrd, Continuation continuation) {
        super(continuation);
        this.z = xrd;
    }

    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.X |= IntCompanionObject.MIN_VALUE;
        return this.z.a(0, 0, 0, 0, (hqc) null, (vd9) null, this);
    }
}
