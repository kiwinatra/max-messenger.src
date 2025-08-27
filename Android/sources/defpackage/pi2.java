package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: pi2  reason: default package */
public final class pi2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ aj2 b;
    public final /* synthetic */ yt c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pi2(aj2 aj2, yt ytVar, Continuation continuation) {
        super(2, continuation);
        this.b = aj2;
        this.c = ytVar;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new pi2(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pi2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            rl rlVar = this.b.X;
            this.a = 1;
            obj = ((jna) rlVar).T(this.c, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
