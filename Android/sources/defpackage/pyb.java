package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: pyb  reason: default package */
public final class pyb extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ nyb c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pyb(nyb nyb, Continuation continuation) {
        super(continuation);
        this.c = nyb;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.c.a((Object) null, this);
    }
}
