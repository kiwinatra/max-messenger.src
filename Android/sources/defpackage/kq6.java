package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: kq6  reason: default package */
public final class kq6 extends ContinuationImpl {
    public mq6 a;
    public long b;
    public /* synthetic */ Object c;
    public final /* synthetic */ mq6 o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kq6(mq6 mq6, Continuation continuation) {
        super(continuation);
        this.o = mq6;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return this.o.a(0, false, this);
    }
}
