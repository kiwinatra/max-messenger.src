package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: v38  reason: default package */
public final class v38 extends ContinuationImpl {
    public y38 a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ y38 o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v38(y38 y38, Continuation continuation) {
        super(continuation);
        this.o = y38;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return this.o.j(0, this);
    }
}
