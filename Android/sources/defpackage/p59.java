package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: p59  reason: default package */
public final class p59 extends ContinuationImpl {
    public Object a;
    public a32 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ x59 o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p59(x59 x59, Continuation continuation) {
        super(continuation);
        this.o = x59;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return x59.k(this.o, (a32) null, this);
    }
}
