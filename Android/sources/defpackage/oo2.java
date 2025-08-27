package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: oo2  reason: default package */
public final class oo2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ lp2 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oo2(lp2 lp2, Continuation continuation) {
        super(2, continuation);
        this.b = lp2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new oo2(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((oo2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        vk3 m;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            lp2 lp2 = this.b;
            a32 a32 = (a32) lp2.Q0.a.getValue();
            if (a32 == null || (m = a32.m()) == null) {
                return Unit.INSTANCE;
            }
            long r = m.r();
            this.a = 1;
            if (((rs3) lp2.x0.getValue()).a(r) == coroutine_suspended) {
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
