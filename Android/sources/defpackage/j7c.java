package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: j7c  reason: default package */
public final class j7c extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ k7c b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j7c(k7c k7c, Continuation continuation) {
        super(2, continuation);
        this.b = k7c;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new j7c(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((j7c) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        k7c k7c = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            gwb gwb = k7c.I0;
            this.a = 1;
            if (gwb.D(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        xag.h(k7c.w0, new g6c(new igf(lxa.G0), Boxing.boxInt(cad.o)));
        return Unit.INSTANCE;
    }
}
