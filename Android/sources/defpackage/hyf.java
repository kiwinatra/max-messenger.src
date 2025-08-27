package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Ref;

/* renamed from: hyf  reason: default package */
public final class hyf extends ContinuationImpl {
    public Object a;
    public Ref.LongRef b;
    public /* synthetic */ Object c;
    public final /* synthetic */ iyf o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hyf(iyf iyf, Continuation continuation) {
        super(continuation);
        this.o = iyf;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return this.o.e(this);
    }
}
