package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: t12  reason: default package */
public final class t12 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ bs5 b;
    public final /* synthetic */ fsd c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t12(bs5 bs5, fsd fsd, Continuation continuation) {
        super(2, continuation);
        this.b = bs5;
        this.c = fsd;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new t12(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((t12) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            if (this.b.e(this.c, this) == coroutine_suspended) {
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
