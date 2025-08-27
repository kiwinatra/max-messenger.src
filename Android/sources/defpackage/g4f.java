package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: g4f  reason: default package */
public final class g4f extends ContinuationImpl {
    public h4f a;
    public long b;
    public /* synthetic */ Object c;
    public final /* synthetic */ h4f o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g4f(h4f h4f, Continuation continuation) {
        super(continuation);
        this.o = h4f;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return this.o.a(0, this);
    }
}
