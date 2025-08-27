package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: qs5  reason: default package */
public final class qs5 extends ContinuationImpl {
    public rs5 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ rs5 c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qs5(rs5 rs5, Continuation continuation) {
        super(continuation);
        this.c = rs5;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.a((Object) null, this);
    }
}
