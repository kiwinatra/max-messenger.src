package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: wee  reason: default package */
public final class wee extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c = 100;
    public final /* synthetic */ Function1 o;
    public final /* synthetic */ lg7 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wee(int i, tee tee, lg7 lg7, Continuation continuation) {
        super(2, continuation);
        this.b = i;
        this.o = tee;
        this.v = lg7;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new wee(this.b, (tee) this.o, this.v, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wee) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            if (xk4.b(((long) this.b) * this.c, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.o.invoke(this.v);
        return Unit.INSTANCE;
    }
}
