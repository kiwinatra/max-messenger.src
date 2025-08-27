package defpackage;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: kp1  reason: default package */
public final class kp1 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ mp1 c;
    public final /* synthetic */ long o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kp1(mp1 mp1, long j, Continuation continuation) {
        super(2, continuation);
        this.c = mp1;
        this.o = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        kp1 kp1 = new kp1(this.c, this.o, continuation);
        kp1.b = obj;
        return kp1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((kp1) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            d14 d14 = (d14) this.b;
            mp1 mp1 = this.c;
            long j = this.o;
            Result.Companion companion = Result.Companion;
            Duration.Companion companion2 = Duration.Companion;
            long duration = DurationKt.toDuration(10, DurationUnit.SECONDS);
            this.a = 1;
            if (((is9) mp1.B.getValue()).u(j, duration, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.m23constructorimpl(ResultKt.createFailure(th));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        obj2 = Result.m23constructorimpl(Unit.INSTANCE);
        Throwable r9 = Result.m26exceptionOrNullimpl(obj2);
        if (r9 != null) {
            z68.f("CallEngineTag", "fail to fetch missed user", r9);
        }
        return Unit.INSTANCE;
    }
}
