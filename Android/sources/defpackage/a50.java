package defpackage;

import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: a50  reason: default package */
public final class a50 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Lazy a;
    public final /* synthetic */ c50 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a50(Lazy lazy, c50 c50, Continuation continuation) {
        super(2, continuation);
        this.a = lazy;
        this.b = c50;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new a50(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((a50) create((ds5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Lazy lazy = this.a;
        c50 c50 = this.b;
        ((xy9) ((dy9) lazy.getValue())).e(c50.e);
        ev0.v(c50.c, (CoroutineContext) null, (f14) null, new z40(lazy, c50, (Continuation) null), 3);
        return Unit.INSTANCE;
    }
}
