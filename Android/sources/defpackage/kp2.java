package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: kp2  reason: default package */
public final class kp2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ lp2 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kp2(lp2 lp2, Continuation continuation) {
        super(2, continuation);
        this.b = lp2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new kp2(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((kp2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        lp2 lp2 = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            obj = lp2.q(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ((my2) lp2.o).n().q0(((Number) obj).longValue());
        xag.h(lp2.T0, new co2(ead.J, (Integer) null, Boxing.boxInt(cad.n), 2));
        return Unit.INSTANCE;
    }
}
