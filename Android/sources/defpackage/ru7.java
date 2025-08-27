package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ru7  reason: default package */
public final class ru7 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ tu7 b;
    public final /* synthetic */ Function2 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ru7(tu7 tu7, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.b = tu7;
        this.c = function2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ru7(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ru7) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ju7 ju7 = ((vu7) this.b).a;
            this.a = 1;
            iu7 iu7 = iu7.c;
            bi4 bi4 = dq4.a;
            if (ev0.I(lc8.a.t0(), new pab(ju7, iu7, this.c, (Continuation) null), this) == coroutine_suspended) {
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
