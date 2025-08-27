package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: b06  reason: default package */
public final class b06 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ m06 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b06(Object obj, Continuation continuation, m06 m06) {
        super(2, continuation);
        this.b = obj;
        this.c = m06;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new b06(this.b, continuation, this.c);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b06) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long longValue = ((Number) this.b).longValue();
            KProperty[] kPropertyArr = m06.D0;
            this.a = 1;
            obj = ((my2) ((qx2) this.c.y.getValue())).m(longValue, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a32 a32 = (a32) obj;
        if (a32 != null) {
            return Boxing.boxLong(a32.a);
        }
        return null;
    }
}
