package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: so6  reason: default package */
public final class so6 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ uo6 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public so6(uo6 uo6, Continuation continuation) {
        super(continuation);
        this.c = uo6;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.c.a((Object) null, this);
    }
}
