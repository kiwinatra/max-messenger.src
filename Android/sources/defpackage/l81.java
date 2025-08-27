package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: l81  reason: default package */
public final class l81 extends SuspendLambda implements Function2 {
    public int a;

    public final Continuation create(Object obj, Continuation continuation) {
        return new SuspendLambda(2, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((l81) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            if (xk4.b(300, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        qc7 r = qra.a.r();
        if (r != null) {
            r.f(SetsKt.setOf(new pc7(nc7.PARTICIPATED_IN_CALL, 1)), jgd.CALL);
        }
        return Unit.INSTANCE;
    }
}
