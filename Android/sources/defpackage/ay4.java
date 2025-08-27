package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ay4  reason: default package */
public final class ay4 extends SuspendLambda implements Function2 {
    public long a;
    public int b;
    public final /* synthetic */ by4 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ay4(by4 by4, Continuation continuation) {
        super(2, continuation);
        this.c = by4;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ay4(this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ay4) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        long j;
        Object value;
        long longValue;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        by4 by4 = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            j = System.currentTimeMillis();
            long longValue2 = ((Number) by4.c.getValue()).longValue();
            this.a = j;
            this.b = 1;
            if (xk4.b(longValue2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1 || i == 2) {
            j = this.a;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        do {
            xme xme = by4.d;
            do {
                value = xme.getValue();
                Long l = (Long) value;
            } while (!xme.b(value, Boxing.boxLong((System.currentTimeMillis() - j) / ((long) 1000))));
            longValue = ((Number) by4.c.getValue()).longValue();
            this.a = j;
            this.b = 2;
        } while (xk4.b(longValue, this) != coroutine_suspended);
        return coroutine_suspended;
    }
}
