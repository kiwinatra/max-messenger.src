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

/* renamed from: et5  reason: default package */
public final class et5 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ bs5 o;
    public final /* synthetic */ cwb v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public et5(long j, bs5 bs5, cwb cwb, Continuation continuation) {
        super(2, continuation);
        this.c = j;
        this.o = bs5;
        this.v = cwb;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        et5 et5 = new et5(this.c, this.o, this.v, continuation);
        et5.b = obj;
        return et5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((et5) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            d14 d14 = (d14) this.b;
            long r5 = Duration.m1371getInWholeMillisecondsimpl(this.c);
            CoroutineContext U = d14.U();
            dt5 dt5 = new dt5(new Ref.LongRef(), r5, this.v, new Ref.ObjectRef(), d14, U);
            this.a = 1;
            if (this.o.e(dt5, this) == coroutine_suspended) {
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
