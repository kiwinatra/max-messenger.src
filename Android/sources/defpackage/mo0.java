package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: mo0  reason: default package */
public final class mo0 extends ContinuationImpl {
    public no0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ no0 c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mo0(no0 no0, Continuation continuation) {
        super(continuation);
        this.c = no0;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.b((qa7) null, this);
    }
}
