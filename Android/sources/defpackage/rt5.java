package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.time.Duration;
import kotlinx.coroutines.TimeoutCancellationException;

/* renamed from: rt5  reason: default package */
public final class rt5 extends SuspendLambda implements Function1 {
    public final /* synthetic */ long a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rt5(long j, Continuation continuation) {
        super(1, continuation);
        this.a = j;
    }

    public final Continuation create(Continuation continuation) {
        return new rt5(this.a, continuation);
    }

    public final Object invoke(Object obj) {
        ((rt5) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
        throw null;
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        throw new TimeoutCancellationException("Timed out waiting for " + Duration.m1402toStringimpl(this.a), (pm7) null);
    }
}
