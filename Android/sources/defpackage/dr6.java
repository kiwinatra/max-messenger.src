package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: dr6  reason: default package */
public final class dr6 extends ContinuationImpl {
    public er6 a;
    public long[] b;
    public long c;
    public /* synthetic */ Object o;
    public final /* synthetic */ er6 v;
    public int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dr6(er6 er6, Continuation continuation) {
        super(continuation);
        this.v = er6;
    }

    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.w |= IntCompanionObject.MIN_VALUE;
        return this.v.b(0, this);
    }
}
