package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: pq6  reason: default package */
public final class pq6 extends ContinuationImpl {
    public qq6 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ qq6 c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pq6(qq6 qq6, Continuation continuation) {
        super(continuation);
        this.c = qq6;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.a(this);
    }
}
