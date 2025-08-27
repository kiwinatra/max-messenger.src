package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: wm1  reason: default package */
public final class wm1 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ ym1 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wm1(ym1 ym1, Continuation continuation) {
        super(2, continuation);
        this.b = ym1;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new wm1(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wm1) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            obj = ((eu3) this.b.b.getValue()).d();
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        vk3 vk3 = (vk3) obj;
        long r = vk3.r();
        String f = vk3.f();
        if (f == null) {
            f = "";
        }
        return new j0g(r, f, vk3.q(), vk3.B(), vk3.t(kl0.o));
    }
}
