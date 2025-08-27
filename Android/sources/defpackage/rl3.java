package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: rl3  reason: default package */
public final class rl3 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ sl3 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rl3(sl3 sl3, Continuation continuation) {
        super(continuation);
        this.c = sl3;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.c.a((Object) null, this);
    }
}
