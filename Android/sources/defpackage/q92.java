package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: q92  reason: default package */
public final class q92 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ ia2 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q92(ia2 ia2, Continuation continuation) {
        super(2, continuation);
        this.b = ia2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new q92(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((q92) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = ia2.K0;
            c6d g = this.b.g();
            this.a = 1;
            g.getClass();
            if (n6d.a(g.a, new jkb(13, (Object) g), this) == coroutine_suspended) {
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
