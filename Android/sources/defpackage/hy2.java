package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: hy2  reason: default package */
public final class hy2 extends ContinuationImpl {
    public my2 a;
    public long b;
    public /* synthetic */ Object c;
    public final /* synthetic */ my2 o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hy2(my2 my2, Continuation continuation) {
        super(continuation);
        this.o = my2;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return this.o.l(0, this);
    }
}
