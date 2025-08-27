package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ly9  reason: default package */
public final class ly9 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ xy9 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ly9(xy9 xy9, Continuation continuation) {
        super(2, continuation);
        this.b = xy9;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ly9(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ly9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long j = xy9.M;
            this.a = 1;
            if (xk4.c(j, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i2 = xy9.N;
        this.b.k(false);
        return Unit.INSTANCE;
    }
}
