package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: np0  reason: default package */
public final class np0 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ pp0 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public np0(pp0 pp0, Continuation continuation) {
        super(2, continuation);
        this.b = pp0;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new np0(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((np0) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        pp0 pp0 = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long j = pp0.a;
            this.a = 1;
            if (xk4.b(j, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (((x04) pp0.b).c <= 0) {
            pm7 pm7 = (pm7) pp0.f;
            if (pm7 != null) {
                pm7.b((CancellationException) null);
            }
            pp0.f = null;
        }
        return Unit.INSTANCE;
    }
}
