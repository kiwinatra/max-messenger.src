package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: syf  reason: default package */
public final class syf extends ContinuationImpl {
    public tyf a;
    public a0a b;
    public /* synthetic */ Object c;
    public final /* synthetic */ tyf o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public syf(tyf tyf, Continuation continuation) {
        super(continuation);
        this.o = tyf;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return this.o.h(this);
    }
}
