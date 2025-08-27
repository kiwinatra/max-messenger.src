package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: l5d  reason: default package */
public final class l5d extends ContinuationImpl {
    public c6d a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ c6d o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l5d(c6d c6d, Continuation continuation) {
        super(continuation);
        this.o = c6d;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return c6d.b(this.o, (String) null, this);
    }
}
