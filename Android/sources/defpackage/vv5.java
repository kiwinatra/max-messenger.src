package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: vv5  reason: default package */
public final class vv5 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ bs5 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vv5(bs5 bs5, Continuation continuation) {
        super(2, continuation);
        this.c = bs5;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        vv5 vv5 = new vv5(this.c, continuation);
        vv5.b = obj;
        return vv5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vv5) create((z08) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            bx bxVar = new bx(8, (Object) (z08) this.b);
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
