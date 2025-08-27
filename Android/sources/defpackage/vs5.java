package defpackage;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.TimeoutCancellationException;

/* renamed from: vs5  reason: default package */
public final class vs5 extends SuspendLambda implements Function3 {
    public int a;
    public /* synthetic */ ds5 b;
    public /* synthetic */ Throwable c;

    /* JADX WARNING: type inference failed for: r1v1, types: [kotlin.coroutines.jvm.internal.SuspendLambda, vs5] */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ? suspendLambda = new SuspendLambda(3, (Continuation) obj3);
        suspendLambda.b = (ds5) obj;
        suspendLambda.c = (Throwable) obj2;
        return suspendLambda.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ds5 ds5 = this.b;
            Throwable th = this.c;
            if (th instanceof TimeoutCancellationException) {
                Result.Companion companion = Result.Companion;
                Result r1 = Result.m22boximpl(Result.m23constructorimpl(ResultKt.createFailure(th)));
                this.b = null;
                this.a = 1;
                if (ds5.a(r1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                throw th;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
