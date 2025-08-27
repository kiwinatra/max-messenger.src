package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ica  reason: default package */
public final class ica extends ContinuationImpl {
    public jca a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ jca o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ica(jca jca, Continuation continuation) {
        super(continuation);
        this.o = jca;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return this.o.d((String) null, this);
    }
}
