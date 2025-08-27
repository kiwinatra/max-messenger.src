package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ate  reason: default package */
public final class ate extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ bte b;
    public int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ate(bte bte, Continuation continuation) {
        super(continuation);
        this.b = bte;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= IntCompanionObject.MIN_VALUE;
        return this.b.c((String) null, 0, 0, this);
    }
}
