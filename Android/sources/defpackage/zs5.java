package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: zs5  reason: default package */
public final class zs5 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ bs5 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zs5(bs5 bs5, Continuation continuation) {
        super(2, continuation);
        this.b = bs5;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new zs5(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zs5) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            if (bs0.s(this.b, this) == coroutine_suspended) {
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
