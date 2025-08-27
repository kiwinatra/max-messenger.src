package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: yv6  reason: default package */
public final class yv6 extends SuspendLambda implements Function2 {
    public final /* synthetic */ x6 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yv6(x6 x6Var, Continuation continuation) {
        super(2, continuation);
        this.a = x6Var;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new yv6(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yv6) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.a.run();
        return Unit.INSTANCE;
    }
}
