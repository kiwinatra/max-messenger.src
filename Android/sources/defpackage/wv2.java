package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: wv2  reason: default package */
public final class wv2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ tw2 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wv2(tw2 tw2, Continuation continuation) {
        super(2, continuation);
        this.b = tw2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new wv2(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wv2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            tw2 tw2 = this.b;
            xag.h(tw2.K0, new v5a(Unit.INSTANCE));
            q04 a2 = ((osa) tw2.w).a();
            ? suspendLambda = new SuspendLambda(2, (Continuation<Object>) null);
            this.a = 1;
            if (ev0.I(a2, suspendLambda, this) == coroutine_suspended) {
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
