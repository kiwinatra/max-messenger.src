package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: xn2  reason: default package */
public final class xn2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ lp2 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xn2(lp2 lp2, Continuation continuation) {
        super(2, continuation);
        this.a = lp2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new xn2(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xn2) create((mn5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        xag.h(this.a.T0, new co2(mra.m, Boxing.boxInt(mra.l), (Integer) null, 4));
        return Unit.INSTANCE;
    }
}
