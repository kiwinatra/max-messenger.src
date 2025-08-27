package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: yi5  reason: default package */
public final class yi5 extends ContinuationImpl {
    public zi5 a;
    public ekd b;
    public /* synthetic */ Object c;
    public final /* synthetic */ zi5 o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yi5(zi5 zi5, Continuation continuation) {
        super(continuation);
        this.o = zi5;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return this.o.a(this);
    }
}
