package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: qp1  reason: default package */
public final class qp1 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ rp1 b;
    public final /* synthetic */ hj0 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qp1(rp1 rp1, hj0 hj0, Continuation continuation) {
        super(2, continuation);
        this.b = rp1;
        this.c = hj0;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new qp1(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qp1) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            n6e n6e = this.b.a;
            v41 v41 = new v41(this.c.a);
            this.a = 1;
            if (n6e.a(v41, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
