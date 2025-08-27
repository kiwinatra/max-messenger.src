package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: mb6  reason: default package */
public final class mb6 extends ContinuationImpl {
    public Object a;
    public ha9 b;
    public Long c;
    public /* synthetic */ Object o;
    public final /* synthetic */ nb6 v;
    public int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mb6(nb6 nb6, Continuation continuation) {
        super(continuation);
        this.v = nb6;
    }

    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.w |= IntCompanionObject.MIN_VALUE;
        return this.v.a((ha9) null, (Long) null, this);
    }
}
