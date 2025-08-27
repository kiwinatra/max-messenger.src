package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: xv2  reason: default package */
public final class xv2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ tw2 b;
    public final /* synthetic */ long c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xv2(tw2 tw2, long j, Continuation continuation) {
        super(2, continuation);
        this.b = tw2;
        this.c = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new xv2(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xv2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        tw2 tw2 = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            qx2 k = tw2.k(tw2);
            this.a = 1;
            obj = ((my2) k).u(this.c, this);
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
            xag.h(tw2.K0, ox2.b.o1(a32.a));
        }
        return Unit.INSTANCE;
    }
}
