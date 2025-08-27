package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: xn3  reason: default package */
public final class xn3 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ bo3 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xn3(bo3 bo3, Continuation continuation) {
        super(2, continuation);
        this.b = bo3;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new xn3(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xn3) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            n6e n6e = this.b.a;
            rn3 rn3 = rn3.a;
            this.a = 1;
            if (n6e.a(rn3, this) == coroutine_suspended) {
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
