package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: f06  reason: default package */
public final class f06 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ m06 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f06(m06 m06, Continuation continuation) {
        super(2, continuation);
        this.b = m06;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new f06(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((f06) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        m06 m06 = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            u82 u82 = m06.v;
            this.a = 1;
            if (((ia2) u82).c(m06.b, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        xag.h(m06.x0, new qy5(false));
        return Unit.INSTANCE;
    }
}
