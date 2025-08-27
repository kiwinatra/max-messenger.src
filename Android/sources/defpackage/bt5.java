package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: bt5  reason: default package */
public final class bt5 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ Ref.LongRef b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long o;
    public final /* synthetic */ long v;
    public final /* synthetic */ CoroutineContext w;
    public final /* synthetic */ cwb x;
    public final /* synthetic */ Object y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bt5(Ref.LongRef longRef, long j, long j2, long j3, CoroutineContext coroutineContext, cwb cwb, Object obj, Continuation continuation) {
        super(2, continuation);
        this.b = longRef;
        this.c = j;
        this.o = j2;
        this.v = j3;
        this.w = coroutineContext;
        this.x = cwb;
        this.y = obj;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new bt5(this.b, this.c, this.o, this.v, this.w, this.x, this.y, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bt5) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        Ref.LongRef longRef = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            if (xk4.b(longRef.element - this.c, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (this.o == longRef.element) {
            Duration.Companion companion = Duration.Companion;
            longRef.element = Duration.m1371getInWholeMillisecondsimpl(DurationKt.toDuration(System.nanoTime(), DurationUnit.NANOSECONDS)) + this.v;
            at5 at5 = new at5(this.x, this.y, (Continuation) null);
            this.a = 2;
            if (ev0.I(this.w, at5, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
