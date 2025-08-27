package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: qk2  reason: default package */
public final class qk2 extends SuspendLambda implements Function2 {
    public rl a;
    public int b;
    public final /* synthetic */ rk2 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qk2(rk2 rk2, Continuation continuation) {
        super(2, continuation);
        this.c = rk2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new qk2(this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qk2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        rl rlVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            rk2 rk2 = this.c;
            rl rlVar2 = rk2.b;
            this.a = rlVar2;
            this.b = 1;
            obj = bs0.z(rk2.a, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            rlVar = rlVar2;
        } else if (i == 1) {
            rlVar = this.a;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long longValue = ((Number) obj).longValue();
        jna jna = (jna) rlVar;
        jna.getClass();
        jna.z(jna, new pq0(2, ((ltb) jna.D()).a.n(), longValue));
        return Unit.INSTANCE;
    }
}
