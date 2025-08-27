package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: ka2  reason: default package */
public final class ka2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ la2 b;
    public final /* synthetic */ ma2 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ka2(la2 la2, ma2 ma2, Continuation continuation) {
        super(2, continuation);
        this.b = la2;
        this.c = ma2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ka2(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ka2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            is9 p = this.b.p();
            Duration.Companion companion = Duration.Companion;
            long duration = DurationKt.toDuration(2, DurationUnit.SECONDS);
            this.a = 1;
            if (p.n(this.c, duration, this) == coroutine_suspended) {
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
