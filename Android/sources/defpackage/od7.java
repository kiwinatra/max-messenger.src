package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: od7  reason: default package */
public final class od7 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ yd7 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public od7(yd7 yd7, Continuation continuation) {
        super(2, continuation);
        this.b = yd7;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new od7(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((od7) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            yd7 yd7 = this.b;
            yd7.Y.setValue((Object) null);
            z68.c(yd7.C0, "cancel prefetchJob", new Object[0]);
            pm7 pm7 = yd7.w0;
            if (pm7 != null) {
                pm7.b((CancellationException) null);
            }
            yd7.w0 = null;
            yd7.g();
            pm7 pm72 = yd7.w0;
            if (pm72 != null) {
                this.a = 1;
                if (pm72.d(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
