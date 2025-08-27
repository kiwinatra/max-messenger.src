package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: jt2  reason: default package */
public final class jt2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ wt2 b;
    public final /* synthetic */ ms2 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jt2(wt2 wt2, ms2 ms2, Continuation continuation) {
        super(2, continuation);
        this.b = wt2;
        this.c = ms2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new jt2(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jt2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            if (wt2.a(this.b, (ks2) this.c, this) == coroutine_suspended) {
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
