package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: y1d  reason: default package */
public final class y1d extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ju7 c;
    public final /* synthetic */ iu7 o;
    public final /* synthetic */ Function2 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y1d(ju7 ju7, iu7 iu7, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.c = ju7;
        this.o = iu7;
        this.v = function2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        y1d y1d = new y1d(this.c, this.o, this.v, continuation);
        y1d.b = obj;
        return y1d;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((y1d) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            bi4 bi4 = dq4.a;
            gc8 t0 = lc8.a.t0();
            Function2 function2 = this.v;
            x1d x1d = new x1d(this.c, this.o, (d14) this.b, function2, (Continuation) null);
            this.a = 1;
            if (ev0.I(t0, x1d, this) == coroutine_suspended) {
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
