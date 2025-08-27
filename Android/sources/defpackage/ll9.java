package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ll9  reason: default package */
public final class ll9 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ en9 b;
    public final /* synthetic */ long c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ll9(en9 en9, long j, Continuation continuation) {
        super(2, continuation);
        this.b = en9;
        this.c = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ll9(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ll9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        long j = this.c;
        en9 en9 = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            obj = gq6.a((gq6) en9.X0.getValue(), j, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        vk3 vk3 = (vk3) obj;
        int i2 = (j > ((qjd) en9.x0).s() ? 1 : (j == ((qjd) en9.x0).s() ? 0 : -1));
        s85 s85 = en9.q1;
        if (i2 == 0) {
            xag.h(s85, new o8e(new igf(qad.E8), 0, (igf) null, 6));
        } else if (vk3 == null || vk3.n() != 0 || vk3.B()) {
            xag.h(s85, new o8e(new igf(ewa.M0), 0, (igf) null, 6));
        } else {
            fk9.b.getClass();
            xag.h(en9.t1, new pa4(":profile?id=" + j + "&type=contact"));
        }
        return Unit.INSTANCE;
    }
}
