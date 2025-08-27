package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: p12  reason: default package */
public final class p12 extends ContinuationImpl {
    public q12 a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ q12 o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p12(q12 q12, Continuation continuation) {
        super(continuation);
        this.o = q12;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return this.o.a((Object) null, this);
    }
}
