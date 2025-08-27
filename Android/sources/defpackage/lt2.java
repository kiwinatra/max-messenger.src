package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: lt2  reason: default package */
public final class lt2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ wt2 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lt2(wt2 wt2, Continuation continuation) {
        super(2, continuation);
        this.b = wt2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new lt2(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((lt2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.b.X.set(true);
            this.b.Z.clear();
            this.b.a.h.clear();
            wt2 wt2 = this.b;
            wt2.a.j = wt2;
            wt2 wt22 = this.b;
            this.a = 1;
            if (wt22.d(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.b.Y.set(false);
        return Unit.INSTANCE;
    }
}
