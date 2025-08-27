package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: li2  reason: default package */
public final class li2 extends ContinuationImpl {
    public aj2 a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ aj2 o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public li2(aj2 aj2, Continuation continuation) {
        super(continuation);
        this.o = aj2;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return aj2.m(this.o, (ha9) null, this);
    }
}
