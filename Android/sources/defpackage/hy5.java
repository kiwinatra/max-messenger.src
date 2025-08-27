package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: hy5  reason: default package */
public final class hy5 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ jy5 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hy5(jy5 jy5, Continuation continuation) {
        super(2, continuation);
        this.b = jy5;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new hy5(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hy5) create((Unit) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            if (jy5.a(this.b, this) == coroutine_suspended) {
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
