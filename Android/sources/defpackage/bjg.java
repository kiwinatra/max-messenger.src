package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: bjg  reason: default package */
public final class bjg extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ hjg b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bjg(hjg hjg, Continuation continuation) {
        super(2, continuation);
        this.b = hjg;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new bjg(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bjg) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            hjg hjg = this.b;
            y02 Q = bs0.Q((ru0) hjg.A0.o);
            bx bxVar = new bx(14, (Object) hjg);
            this.a = 1;
            if (Q.e(bxVar, this) == coroutine_suspended) {
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
