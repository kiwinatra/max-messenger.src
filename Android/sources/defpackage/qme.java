package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: qme  reason: default package */
public final class qme extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ long b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qme(long j, Continuation continuation) {
        super(2, continuation);
        this.b = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new qme(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qme) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            if (xk4.c(this.b, this) == coroutine_suspended) {
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
