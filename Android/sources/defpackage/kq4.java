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

/* renamed from: kq4  reason: default package */
public final class kq4 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ lq4 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kq4(lq4 lq4, Continuation continuation) {
        super(2, continuation);
        this.b = lq4;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new kq4(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((kq4) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            lq4 lq4 = this.b;
            Duration.Companion companion = Duration.Companion;
            g12 d = gt5.d((sz9) lq4.c.getValue(), DurationKt.toDuration(1, DurationUnit.SECONDS));
            bx bxVar = new bx(5, (Object) lq4);
            this.a = 1;
            Object e = d.e(new vb(16, bxVar, lq4), this);
            if (e != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                e = Unit.INSTANCE;
            }
            if (e == coroutine_suspended) {
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
