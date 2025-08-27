package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: wp2  reason: default package */
public final class wp2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ dq2 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wp2(dq2 dq2, Continuation continuation) {
        super(2, continuation);
        this.b = dq2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new wp2(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wp2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            if (this.b.d(this) == coroutine_suspended) {
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
