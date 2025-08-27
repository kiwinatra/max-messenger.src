package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: gk5  reason: default package */
public final class gk5 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ i0 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gk5(i0 i0Var, Continuation continuation) {
        super(2, continuation);
        this.b = i0Var;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new gk5(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gk5) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            i0 i0Var = this.b;
            this.a = 1;
            lw1 lw1 = new lw1(1, IntrinsicsKt.intercepted(this));
            lw1.u();
            lw1.k(new ek5(i0Var, 0));
            i0Var.m(new fk5(0, lw1), new fs(2));
            obj = lw1.t();
            if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
