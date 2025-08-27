package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: cx  reason: default package */
public final class cx extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ bs5 c;
    public final /* synthetic */ gx o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cx(xme xme, Continuation continuation, gx gxVar) {
        super(2, continuation);
        this.c = xme;
        this.o = gxVar;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        cx cxVar = new cx((xme) this.c, continuation, this.o);
        cxVar.b = obj;
        return cxVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cx) create((ds5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            bx bxVar = new bx((ds5) this.b, this.o);
            this.a = 1;
            if (this.c.e(bxVar, this) == coroutine_suspended) {
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
