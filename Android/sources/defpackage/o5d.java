package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: o5d  reason: default package */
public final class o5d extends ContinuationImpl {
    public c6d a;
    public String b;
    public int c;
    public /* synthetic */ Object o;
    public final /* synthetic */ c6d v;
    public int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o5d(c6d c6d, Continuation continuation) {
        super(continuation);
        this.v = c6d;
    }

    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.w |= IntCompanionObject.MIN_VALUE;
        return c6d.h(this.v, (String) null, 0, this);
    }
}
