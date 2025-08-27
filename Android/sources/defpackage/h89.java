package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: h89  reason: default package */
public final class h89 extends ContinuationImpl {
    public j89 a;
    public long b;
    public /* synthetic */ Object c;
    public final /* synthetic */ j89 o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h89(j89 j89, Continuation continuation) {
        super(continuation);
        this.o = j89;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return this.o.d(0, this);
    }
}
