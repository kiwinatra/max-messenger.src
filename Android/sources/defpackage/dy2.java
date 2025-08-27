package defpackage;

import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: dy2  reason: default package */
public final class dy2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Lazy a;
    public final /* synthetic */ my2 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dy2(Lazy lazy, my2 my2, Continuation continuation) {
        super(2, continuation);
        this.a = lazy;
        this.b = my2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new dy2(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dy2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ((r62) this.a.getValue()).G = this.b.b;
        return Unit.INSTANCE;
    }
}
