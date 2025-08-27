package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: qyb  reason: default package */
public final class qyb extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ bs5 c;
    public final /* synthetic */ syb o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qyb(i21 i21, Continuation continuation, syb syb) {
        super(2, continuation);
        this.c = i21;
        this.o = syb;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        qyb qyb = new qyb((i21) this.c, continuation, this.o);
        qyb.b = obj;
        return qyb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qyb) create((ds5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            nyb nyb = new nyb((ds5) this.b, this.o, 1);
            this.a = 1;
            if (this.c.e(nyb, this) == coroutine_suspended) {
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
