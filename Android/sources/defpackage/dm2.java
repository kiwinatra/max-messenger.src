package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: dm2  reason: default package */
public final class dm2 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ bs5 c;
    public final /* synthetic */ d14 o;
    public final /* synthetic */ em2 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dm2(on2 on2, Continuation continuation, d14 d14, em2 em2) {
        super(2, continuation);
        this.c = on2;
        this.o = d14;
        this.v = em2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        dm2 dm2 = new dm2((on2) this.c, continuation, this.o, this.v);
        dm2.b = obj;
        return dm2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dm2) create((ds5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            cm2 cm2 = new cm2((ds5) this.b, this.o, this.v);
            this.a = 1;
            if (this.c.e(cm2, this) == coroutine_suspended) {
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
