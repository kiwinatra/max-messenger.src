package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ko2  reason: default package */
public final class ko2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ lp2 b;
    public final /* synthetic */ long c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ko2(lp2 lp2, long j, Continuation continuation) {
        super(2, continuation);
        this.b = lp2;
        this.c = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ko2(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ko2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            lp2 lp2 = this.b;
            ((my2) lp2.o).n().X(this.c);
            cf5 cf5 = lp2.b;
            cf5.a.f(cf5);
            n6e n6e = lp2.S0;
            p33 p33 = p33.b;
            this.a = 1;
            if (n6e.a(p33, this) == coroutine_suspended) {
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
