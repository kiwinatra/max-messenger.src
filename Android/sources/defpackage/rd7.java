package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: rd7  reason: default package */
public final class rd7 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ yd7 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rd7(yd7 yd7, Continuation continuation) {
        super(2, continuation);
        this.b = yd7;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new rd7(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rd7) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            String str = yd7.C0;
            yd7 yd7 = this.b;
            yd7.getClass();
            Object d = e14.d(new kd7(yd7, (Continuation) null), this);
            if (d != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                d = Unit.INSTANCE;
            }
            if (d == coroutine_suspended) {
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
