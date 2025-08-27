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

/* renamed from: qtb  reason: default package */
public final class qtb extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ rtb b;
    public final /* synthetic */ long c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qtb(rtb rtb, long j, Continuation continuation) {
        super(2, continuation);
        this.b = rtb;
        this.c = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new qtb(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qtb) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            rtb rtb = this.b;
            n6e n6e = rtb.i;
            Duration.Companion companion = Duration.Companion;
            g12 d = gt5.d(n6e, DurationKt.toDuration(this.c, DurationUnit.MILLISECONDS));
            bx bxVar = new bx(11, (Object) rtb);
            this.a = 1;
            if (d.e(bxVar, this) == coroutine_suspended) {
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
