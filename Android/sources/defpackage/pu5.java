package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* renamed from: pu5  reason: default package */
public final class pu5 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ bs5 c;
    public final /* synthetic */ Function3 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pu5(wq4 wq4, b03 b03, Continuation continuation) {
        super(2, continuation);
        this.c = wq4;
        this.o = b03;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        pu5 pu5 = new pu5((wq4) this.c, (b03) this.o, continuation);
        pu5.b = obj;
        return pu5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pu5) create((ds5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ou5 ou5;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            bs5 bs5 = this.c;
            ou5 ou52 = new ou5((b03) this.o, (ds5) this.b);
            try {
                this.b = ou52;
                this.a = 1;
                if (bs5.e(ou52, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (AbortFlowException e) {
                e = e;
                ou5 = ou52;
                if (e.a != ou5) {
                    throw e;
                }
                return Unit.INSTANCE;
            }
        } else if (i == 1) {
            ou5 = (ou5) this.b;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (AbortFlowException e2) {
                e = e2;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
