package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* renamed from: op0  reason: default package */
public final class op0 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ pp0 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public op0(pp0 pp0, Continuation continuation) {
        super(2, continuation);
        this.c = pp0;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        op0 op0 = new op0(this.c, continuation);
        op0.b = obj;
        return op0;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((op0) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        pp0 pp0 = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            z08 z08 = new z08((x04) pp0.b, ((d14) this.b).U());
            this.a = 1;
            if (((Function2) pp0.c).invoke(z08, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ((Function0) pp0.e).invoke();
        return Unit.INSTANCE;
    }
}
