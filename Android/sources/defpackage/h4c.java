package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: h4c  reason: default package */
public final class h4c extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ q4c c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h4c(long j, q4c q4c, Continuation continuation) {
        super(2, continuation);
        this.b = j;
        this.c = q4c;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new h4c(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h4c) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.b == ((long) fxa.p0)) {
                e0b e0b = (e0b) this.c.x.getValue();
                e0b.h(new igf(ixa.D1));
                e0b.j();
            }
            this.a = 1;
            if (xk4.b(250, this) == coroutine_suspended) {
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
