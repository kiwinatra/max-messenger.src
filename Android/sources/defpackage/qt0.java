package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: qt0  reason: default package */
public final class qt0 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ st0 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qt0(st0 st0, Continuation continuation) {
        super(2, continuation);
        this.b = st0;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new qt0(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qt0) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            st0 st0 = this.b;
            long j = st0.c;
            n6e n6e = st0.i;
            ps5 ps5 = new ps5(bs0.F(bs0.M(st0.j, new sbd(new lt0(j, (Continuation) null)), n6e), st0.b), new ot0(st0, (Continuation) null));
            bx bxVar = new bx(2, (Object) st0);
            this.a = 1;
            if (ps5.e(bxVar, this) == coroutine_suspended) {
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
