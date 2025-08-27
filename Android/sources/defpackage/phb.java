package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: phb  reason: default package */
public final class phb extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ whb b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public phb(Object obj, Continuation continuation, whb whb) {
        super(2, continuation);
        this.a = obj;
        this.b = whb;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new phb(this.a, continuation, this.b);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((phb) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return this.b.c.a(((ald) this.a).o);
    }
}
