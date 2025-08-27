package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: au5  reason: default package */
public final class au5 extends ContinuationImpl {
    public bu5 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ bu5 c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public au5(bu5 bu5, Continuation continuation) {
        super(continuation);
        this.c = bu5;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.a((Object) null, this);
    }
}
