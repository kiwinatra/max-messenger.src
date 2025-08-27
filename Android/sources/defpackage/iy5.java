package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: iy5  reason: default package */
public final class iy5 extends ContinuationImpl {
    public jy5 a;
    public au2 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ jy5 o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public iy5(jy5 jy5, Continuation continuation) {
        super(continuation);
        this.o = jy5;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return jy5.a(this.o, this);
    }
}
