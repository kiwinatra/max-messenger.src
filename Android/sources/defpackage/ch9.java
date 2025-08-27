package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ch9  reason: default package */
public final class ch9 extends ContinuationImpl {
    public mh9 a;
    public tg9 b;
    public vg9 c;
    public /* synthetic */ Object o;
    public final /* synthetic */ mh9 v;
    public int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ch9(mh9 mh9, Continuation continuation) {
        super(continuation);
        this.v = mh9;
    }

    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.w |= IntCompanionObject.MIN_VALUE;
        return mh9.j(this.v, (tg9) null, this);
    }
}
