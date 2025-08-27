package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: xig  reason: default package */
public final class xig extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;

    /* JADX WARNING: type inference failed for: r1v1, types: [kotlin.coroutines.Continuation, xig, kotlin.coroutines.jvm.internal.SuspendLambda] */
    public final Continuation create(Object obj, Continuation continuation) {
        ? suspendLambda = new SuspendLambda(2, continuation);
        suspendLambda.b = obj;
        return suspendLambda;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xig) create((h7b) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        h7b h7b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            h7b h7b2 = (h7b) this.b;
            if (h7b2 != h7b.b) {
                return h7b2;
            }
            this.b = h7b2;
            this.a = 1;
            if (xk4.b(600, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            h7b = h7b2;
        } else if (i == 1) {
            h7b = (h7b) this.b;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return h7b;
    }
}
