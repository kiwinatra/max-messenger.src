package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: b02  reason: default package */
public final class b02 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ d02 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b02(d02 d02, Continuation continuation) {
        super(2, continuation);
        this.b = d02;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new b02(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b02) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            rz1 rz1 = this.b.b;
            this.a = 1;
            if (rz1.c(this) == coroutine_suspended) {
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
