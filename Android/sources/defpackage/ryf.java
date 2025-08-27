package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ryf  reason: default package */
public final class ryf extends ContinuationImpl {
    public tyf a;
    public Object b;
    public a0a c;
    public /* synthetic */ Object o;
    public final /* synthetic */ tyf v;
    public int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ryf(tyf tyf, Continuation continuation) {
        super(continuation);
        this.v = tyf;
    }

    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.w |= IntCompanionObject.MIN_VALUE;
        return this.v.g((m57) null, this);
    }
}
