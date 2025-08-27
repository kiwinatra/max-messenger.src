package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: np1  reason: default package */
public final class np1 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ rp1 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public np1(rp1 rp1, Continuation continuation) {
        super(2, continuation);
        this.b = rp1;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new np1(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((np1) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            n6e n6e = this.b.a;
            x41 x41 = x41.a;
            this.a = 1;
            if (n6e.a(x41, this) == coroutine_suspended) {
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
