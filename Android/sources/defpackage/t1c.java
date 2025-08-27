package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: t1c  reason: default package */
public final class t1c extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ u1c b;
    public final /* synthetic */ k1c c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t1c(u1c u1c, k1c k1c, Continuation continuation) {
        super(2, continuation);
        this.b = u1c;
        this.c = k1c;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new t1c(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((t1c) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            u1c u1c = this.b;
            n6e n6e = u1c.a;
            l1c l1c = new l1c((Long) null, u1c.a(u1c, this.c.b));
            this.a = 1;
            if (n6e.a(l1c, this) == coroutine_suspended) {
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
