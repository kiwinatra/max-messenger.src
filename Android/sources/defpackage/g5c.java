package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: g5c  reason: default package */
public final class g5c extends ContinuationImpl {
    public boolean a;
    public a32 b;
    public Long c;
    public /* synthetic */ Object o;
    public final /* synthetic */ j5c v;
    public int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g5c(j5c j5c, Continuation continuation) {
        super(continuation);
        this.v = j5c;
    }

    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.w |= IntCompanionObject.MIN_VALUE;
        return this.v.h((Long) null, false, (a32) null, this);
    }
}
