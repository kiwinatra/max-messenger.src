package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ct5  reason: default package */
public final class ct5 extends ContinuationImpl {
    public dt5 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ dt5 c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ct5(dt5 dt5, Continuation continuation) {
        super(continuation);
        this.c = dt5;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.a((Object) null, this);
    }
}
