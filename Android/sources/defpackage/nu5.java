package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: nu5  reason: default package */
public final class nu5 extends ContinuationImpl {
    public ou5 a;
    public /* synthetic */ Object b;
    public int c;
    public final /* synthetic */ ou5 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nu5(ou5 ou5, Continuation continuation) {
        super(continuation);
        this.o = ou5;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= IntCompanionObject.MIN_VALUE;
        return this.o.a((Object) null, this);
    }
}
