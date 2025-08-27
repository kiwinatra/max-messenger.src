package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: jve  reason: default package */
public final class jve extends ContinuationImpl {
    public u8e a;
    public /* synthetic */ Object b;
    public final /* synthetic */ mve c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jve(mve mve, Continuation continuation) {
        super(continuation);
        this.c = mve;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.l((fue) null, this);
    }
}
