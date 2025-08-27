package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: fo2  reason: default package */
public final class fo2 extends SuspendLambda implements Function2 {
    public d23 a;
    public int b;
    public final /* synthetic */ lp2 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fo2(lp2 lp2, Continuation continuation) {
        super(2, continuation);
        this.c = lp2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new fo2(this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fo2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        d23 d23;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            lp2 lp2 = this.c;
            d23 = lp2.x;
            this.a = d23;
            this.b = 1;
            obj = lp2.q(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            d23 = this.a;
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long longValue = ((Number) obj).longValue();
        this.a = null;
        this.b = 2;
        if (d23.n(longValue, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
