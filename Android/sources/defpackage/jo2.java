package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: jo2  reason: default package */
public final class jo2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ lp2 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jo2(lp2 lp2, Continuation continuation) {
        super(2, continuation);
        this.b = lp2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new jo2(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jo2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            lp2 lp2 = this.b;
            a32 a32 = (a32) lp2.Q0.a.getValue();
            if (a32 == null) {
                return Unit.INSTANCE;
            }
            this.a = 1;
            if (((jje) lp2.w0.getValue()).a(a32.a, this) == coroutine_suspended) {
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
