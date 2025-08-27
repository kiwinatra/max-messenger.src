package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: vc9  reason: default package */
public final class vc9 extends ContinuationImpl {
    public wc9 a;
    public ha9 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ wc9 o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vc9(wc9 wc9, Continuation continuation) {
        super(continuation);
        this.o = wc9;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return this.o.a(0, this);
    }
}
