package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: hgg  reason: default package */
public final class hgg extends ContinuationImpl {
    public mgg a;
    public pgg b;
    public bgg c;
    public /* synthetic */ Object o;
    public final /* synthetic */ mgg v;
    public int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hgg(mgg mgg, Continuation continuation) {
        super(continuation);
        this.v = mgg;
    }

    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.w |= IntCompanionObject.MIN_VALUE;
        return this.v.e((String) null, this);
    }
}
