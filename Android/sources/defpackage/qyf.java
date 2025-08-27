package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: qyf  reason: default package */
public final class qyf extends ContinuationImpl {
    public tyf a;
    public /* synthetic */ Object b;
    public final /* synthetic */ tyf c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qyf(tyf tyf, Continuation continuation) {
        super(continuation);
        this.c = tyf;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.f((m57) null, this);
    }
}
