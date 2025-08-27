package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: zo2  reason: default package */
public final class zo2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ lp2 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zo2(lp2 lp2, Continuation continuation) {
        super(2, continuation);
        this.a = lp2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new zo2(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zo2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        lp2 lp2 = this.a;
        a32 a32 = (a32) lp2.Q0.a.getValue();
        if (a32 == null) {
            return Unit.INSTANCE;
        }
        long j = a32.b.a;
        d6b d6b = (d6b) lp2.B0.getValue();
        d6b.getClass();
        if (j != 0) {
            d6b.f(j, b10.STICKER, 0);
        }
        return Unit.INSTANCE;
    }
}
