package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: k06  reason: default package */
public final class k06 extends ContinuationImpl {
    public m06 a;
    public tz9 b;
    public Object c;
    public /* synthetic */ Object o;
    public final /* synthetic */ m06 v;
    public int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k06(m06 m06, Continuation continuation) {
        super(continuation);
        this.v = m06;
    }

    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.w |= IntCompanionObject.MIN_VALUE;
        return m06.k(this.v, this);
    }
}
