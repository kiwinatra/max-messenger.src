package defpackage;

import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: tta  reason: default package */
public final class tta extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ Lazy b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tta(Lazy lazy, Continuation continuation) {
        super(2, continuation);
        this.b = lazy;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new tta(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tta) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            if (((kva) this.b.getValue()).k(this) == coroutine_suspended) {
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
