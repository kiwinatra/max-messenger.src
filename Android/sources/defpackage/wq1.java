package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: wq1  reason: default package */
public final class wq1 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ xq1 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wq1(xq1 xq1, Continuation continuation) {
        super(2, continuation);
        this.b = xq1;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new wq1(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wq1) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            if (this.b.a(this) == coroutine_suspended) {
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
