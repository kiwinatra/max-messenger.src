package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: y84  reason: default package */
public final class y84 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ z84 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y84(long j, z84 z84, Continuation continuation) {
        super(2, continuation);
        this.b = j;
        this.c = z84;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new y84(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((y84) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long j = this.b;
            if (j > 0) {
                this.a = 1;
                if (xk4.b(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z84 z84 = this.c;
        z84.c(z84.g);
        return Unit.INSTANCE;
    }
}
