package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ey5  reason: default package */
public final class ey5 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ gy5 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ey5(gy5 gy5, Continuation continuation) {
        super(2, continuation);
        this.b = gy5;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ey5(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ey5) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            gy5 gy5 = this.b;
            ps5 b2 = ((wi0) gy5.c).b();
            n6e n6e = gy5.a;
            this.a = 1;
            if (b2.e(n6e, this) == coroutine_suspended) {
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
