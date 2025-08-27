package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: kn3  reason: default package */
public final class kn3 extends ContinuationImpl {
    public pn3 a;
    public oz4 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ pn3 o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kn3(pn3 pn3, Continuation continuation) {
        super(continuation);
        this.o = pn3;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return this.o.l(this);
    }
}
