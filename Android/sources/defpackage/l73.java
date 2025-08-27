package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: l73  reason: default package */
public final class l73 extends SuspendLambda implements Function2 {
    public final /* synthetic */ t73 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l73(t73 t73, Continuation continuation) {
        super(2, continuation);
        this.a = t73;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new l73(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((l73) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        t73 t73 = this.a;
        t73.getClass();
        aje v = ev0.v(t73.k, (CoroutineContext) null, f14.b, new r73(t73, (Continuation) null), 1);
        t73.l.setValue(t73, t73.m[0], v);
        return Unit.INSTANCE;
    }
}
