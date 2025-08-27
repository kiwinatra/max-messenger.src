package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: er0  reason: default package */
public final class er0 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ hr0 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public er0(hr0 hr0, Continuation continuation) {
        super(2, continuation);
        this.b = hr0;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new er0(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((er0) create((ds2) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            obj = hr0.a(this.b, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
