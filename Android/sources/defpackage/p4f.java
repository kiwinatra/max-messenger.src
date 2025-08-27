package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: p4f  reason: default package */
public final class p4f extends ContinuationImpl {
    public h5f a;
    public kxf b;
    public a0a c;
    public /* synthetic */ Object o;
    public final /* synthetic */ h5f v;
    public int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p4f(h5f h5f, Continuation continuation) {
        super(continuation);
        this.v = h5f;
    }

    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.w |= IntCompanionObject.MIN_VALUE;
        return this.v.g((kxf) null, this);
    }
}
