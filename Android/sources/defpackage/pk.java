package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: pk  reason: default package */
public final class pk extends SuspendLambda implements Function2 {
    public final /* synthetic */ rk a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pk(rk rkVar, Continuation continuation) {
        super(2, continuation);
        this.a = rkVar;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new pk(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pk) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        rk rkVar = this.a;
        vb2 vb2 = (vb2) ((fq2) rkVar.f.getValue());
        vb2.w.i(-1);
        vb2.y.i(-1);
        ((esb) rkVar.d.getValue()).a();
        ((my2) ((qx2) rkVar.e.getValue())).n().V();
        ((wi0) ((ns2) rkVar.g.getValue())).a(ls2.a);
        return Unit.INSTANCE;
    }
}
