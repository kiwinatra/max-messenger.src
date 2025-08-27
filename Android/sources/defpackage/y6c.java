package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: y6c  reason: default package */
public final class y6c extends SuspendLambda implements Function2 {
    public final /* synthetic */ k7c a;
    public final /* synthetic */ long b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y6c(k7c k7c, long j, Continuation continuation) {
        super(2, continuation);
        this.a = k7c;
        this.b = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new y6c(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((y6c) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        k7c k7c = this.a;
        e1d.a((e1d) k7c.v.getValue(), this.b);
        xag.h(k7c.x0, c5c.b);
        return Unit.INSTANCE;
    }
}
