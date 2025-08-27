package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: j59  reason: default package */
public final class j59 extends ContinuationImpl {
    public l59 a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ l59 o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j59(l59 l59, Continuation continuation) {
        super(continuation);
        this.o = l59;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return l59.b(this.o, this);
    }
}
