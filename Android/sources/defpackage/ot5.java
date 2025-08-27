package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ot5  reason: default package */
public final class ot5 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ bs5 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ot5(bs5 bs5, Continuation continuation) {
        super(2, continuation);
        this.c = bs5;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ot5 ot5 = new ot5(this.c, continuation);
        ot5.b = obj;
        return ot5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ot5) create((cwb) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            js5 js5 = new js5((cwb) this.b, 2);
            this.a = 1;
            if (this.c.e(js5, this) == coroutine_suspended) {
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
