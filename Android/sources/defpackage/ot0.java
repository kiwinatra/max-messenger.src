package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ot0  reason: default package */
public final class ot0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ st0 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ot0(st0 st0, Continuation continuation) {
        super(2, continuation);
        this.a = st0;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ot0(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ot0) create((ds5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.a.k.set(true);
        return Unit.INSTANCE;
    }
}
