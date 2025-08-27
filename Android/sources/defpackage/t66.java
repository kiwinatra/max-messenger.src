package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: t66  reason: default package */
public final class t66 extends SuspendLambda implements Function2 {
    public final /* synthetic */ zx5 a;
    public final /* synthetic */ w66 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t66(zx5 zx5, w66 w66, Continuation continuation) {
        super(2, continuation);
        this.a = zx5;
        this.b = w66;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new t66(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((t66) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        xag.h(this.b.x, new o66(new z26(this.a.a, false)));
        return Unit.INSTANCE;
    }
}
