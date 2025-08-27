package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: gkb  reason: default package */
public final class gkb extends ContinuationImpl {
    public Object a;
    public ha9 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ hkb o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gkb(hkb hkb, Continuation continuation) {
        super(continuation);
        this.o = hkb;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return this.o.a((ha9) null, this);
    }
}
