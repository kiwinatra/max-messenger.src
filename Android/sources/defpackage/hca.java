package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: hca  reason: default package */
public final class hca extends ContinuationImpl {
    public jca a;
    public vk3 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ jca o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hca(jca jca, Continuation continuation) {
        super(continuation);
        this.o = jca;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return this.o.c((vk3) null, this);
    }
}
