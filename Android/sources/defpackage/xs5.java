package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: xs5  reason: default package */
public final class xs5 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ju7 c;
    public final /* synthetic */ iu7 o;
    public final /* synthetic */ bs5 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xs5(ju7 ju7, iu7 iu7, bs5 bs5, Continuation continuation) {
        super(2, continuation);
        this.c = ju7;
        this.o = iu7;
        this.v = bs5;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        xs5 xs5 = new xs5(this.c, this.o, this.v, continuation);
        xs5.b = obj;
        return xs5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xs5) create((cwb) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        cwb cwb;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            cwb cwb2 = (cwb) this.b;
            ws5 ws5 = new ws5(this.v, cwb2, (Continuation) null);
            this.b = cwb2;
            this.a = 1;
            if (gsg.w(this.c, this.o, ws5, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            cwb = cwb2;
        } else if (i == 1) {
            cwb = (cwb) this.b;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ((zvb) cwb).p((Throwable) null);
        return Unit.INSTANCE;
    }
}
