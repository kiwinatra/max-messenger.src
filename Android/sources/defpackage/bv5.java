package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: bv5  reason: default package */
public final class bv5 extends ContinuationImpl {
    public yu5 a;
    public /* synthetic */ Object b;
    public int c;
    public final /* synthetic */ yu5 o;
    public Object v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bv5(yu5 yu5, Continuation continuation) {
        super(continuation);
        this.o = yu5;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= IntCompanionObject.MIN_VALUE;
        return this.o.a((Object) null, this);
    }
}
