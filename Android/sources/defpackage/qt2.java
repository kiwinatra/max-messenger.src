package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: qt2  reason: default package */
public final class qt2 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;

    /* JADX WARNING: type inference failed for: r1v1, types: [kotlin.coroutines.Continuation, kotlin.coroutines.jvm.internal.SuspendLambda, qt2] */
    public final Continuation create(Object obj, Continuation continuation) {
        ? suspendLambda = new SuspendLambda(2, continuation);
        suspendLambda.b = obj;
        return suspendLambda;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qt2) create((ds5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ls2 ls2 = ls2.a;
            this.a = 1;
            if (((ds5) this.b).a(ls2, this) == coroutine_suspended) {
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
