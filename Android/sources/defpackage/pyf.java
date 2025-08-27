package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: pyf  reason: default package */
public final class pyf extends ContinuationImpl {
    public tyf a;
    public /* synthetic */ Object b;
    public final /* synthetic */ tyf c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pyf(tyf tyf, Continuation continuation) {
        super(continuation);
        this.c = tyf;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.e((m57) null, this);
    }
}
