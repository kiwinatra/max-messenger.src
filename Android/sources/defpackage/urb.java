package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* renamed from: urb  reason: default package */
public final class urb extends SuspendLambda implements Function2 {
    public final /* synthetic */ Function0 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public urb(vra vra, Continuation continuation) {
        super(2, continuation);
        this.a = vra;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new urb((vra) this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((urb) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.a.invoke();
        return Unit.INSTANCE;
    }
}
