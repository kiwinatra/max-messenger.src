package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: m4f  reason: default package */
public final class m4f extends ContinuationImpl {
    public h5f a;
    public kxf b;
    public /* synthetic */ Object c;
    public final /* synthetic */ h5f o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m4f(h5f h5f, Continuation continuation) {
        super(continuation);
        this.o = h5f;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return this.o.d((kxf) null, this);
    }
}
