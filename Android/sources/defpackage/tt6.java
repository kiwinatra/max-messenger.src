package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: tt6  reason: default package */
public final class tt6 extends ContinuationImpl {
    public wt6 a;
    public String b;
    public Object c;
    public /* synthetic */ Object o;
    public final /* synthetic */ wt6 v;
    public int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tt6(wt6 wt6, Continuation continuation) {
        super(continuation);
        this.v = wt6;
    }

    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.w |= IntCompanionObject.MIN_VALUE;
        return wt6.a(this.v, (String) null, this);
    }
}
