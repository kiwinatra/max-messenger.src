package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ije  reason: default package */
public final class ije extends ContinuationImpl {
    public jje a;
    public /* synthetic */ Object b;
    public final /* synthetic */ jje c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ije(jje jje, Continuation continuation) {
        super(continuation);
        this.c = jje;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.a(0, this);
    }
}
