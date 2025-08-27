package defpackage;

import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: kpa  reason: default package */
public final class kpa extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ lpa b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kpa(lpa lpa, Continuation continuation) {
        super(2, continuation);
        this.b = lpa;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new kpa(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((kpa) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        lpa lpa = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            qa3 b2 = ((f8f) ((Lazy) lpa.w).getValue()).b();
            this.a = 1;
            if (bs0.e(b2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z68.c("PushToken", "Refresh current token succeed.", new Object[0]);
        f8f f8f = (f8f) ((Lazy) lpa.w).getValue();
        jpa jpa = new jpa(lpa);
        f8f.getClass();
        ev0.v(f8f.x, (CoroutineContext) null, (f14) null, new c8f(f8f, jpa, (Continuation) null), 3);
        return Unit.INSTANCE;
    }
}
