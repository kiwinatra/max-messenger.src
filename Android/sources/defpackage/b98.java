package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Ref;

/* renamed from: b98  reason: default package */
public final class b98 extends ContinuationImpl {
    public boolean X;
    public int Y;
    public /* synthetic */ Object Z;
    public e98 a;
    public l88 b;
    public Ref.LongRef c;
    public x23 o;
    public List v;
    public final /* synthetic */ e98 v0;
    public long w;
    public int w0;
    public long x;
    public long y;
    public long z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b98(e98 e98, Continuation continuation) {
        super(continuation);
        this.v0 = e98;
    }

    public final Object invokeSuspend(Object obj) {
        this.Z = obj;
        this.w0 |= IntCompanionObject.MIN_VALUE;
        return this.v0.q(0, (l88) null, 0, this);
    }
}
