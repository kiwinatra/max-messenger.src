package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: a8e  reason: default package */
public final class a8e extends ContinuationImpl {
    public c8e a;
    public a32 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ c8e o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a8e(c8e c8e, Continuation continuation) {
        super(continuation);
        this.o = c8e;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return c8e.b(this.o, (a32) null, this);
    }
}
