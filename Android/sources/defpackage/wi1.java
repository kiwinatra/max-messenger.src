package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: wi1  reason: default package */
public final class wi1 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ jj1 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wi1(jj1 jj1, Continuation continuation) {
        super(2, continuation);
        this.b = jj1;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new wi1(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wi1) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            jj1 jj1 = this.b;
            wb u = bs0.u(jj1.C0, jj1.w0, jj1.D0, new vi1(jj1, (Continuation) null, 0));
            this.a = 1;
            if (bs0.s(u, this) == coroutine_suspended) {
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
