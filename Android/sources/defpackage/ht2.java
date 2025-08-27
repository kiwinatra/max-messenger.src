package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Ref;

/* renamed from: ht2  reason: default package */
public final class ht2 extends ContinuationImpl {
    public wt2 a;
    public Ref.BooleanRef b;
    public /* synthetic */ Object c;
    public final /* synthetic */ wt2 o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ht2(wt2 wt2, Continuation continuation) {
        super(continuation);
        this.o = wt2;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return wt2.b(this.o, (sn3) null, this);
    }
}
