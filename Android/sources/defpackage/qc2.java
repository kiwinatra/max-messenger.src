package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: qc2  reason: default package */
public final class qc2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ rc2 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qc2(rc2 rc2, Continuation continuation) {
        super(2, continuation);
        this.b = rc2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        qc2 qc2 = new qc2(this.b, continuation);
        qc2.a = obj;
        return qc2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qc2) create((w50) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        rc2.L(this.b, (w50) this.a);
        return Unit.INSTANCE;
    }
}
