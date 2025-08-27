package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: bhd  reason: default package */
public final class bhd extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ chd b;
    public final /* synthetic */ long c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bhd(chd chd, long j, Continuation continuation) {
        super(2, continuation);
        this.b = chd;
        this.c = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new bhd(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bhd) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        long longValue;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        chd chd = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long longValue2 = ((Number) chd.x.getValue()).longValue();
            this.a = 1;
            if (xk4.b(longValue2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1 || i == 2) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        do {
            xme xme = chd.y;
            do {
                value = xme.getValue();
                Long l = (Long) value;
            } while (!xme.b(value, Boxing.boxLong((System.currentTimeMillis() - this.c) / ((long) 1000))));
            longValue = ((Number) chd.x.getValue()).longValue();
            this.a = 2;
        } while (xk4.b(longValue, this) != coroutine_suspended);
        return coroutine_suspended;
    }
}
