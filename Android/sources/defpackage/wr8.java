package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: wr8  reason: default package */
public final class wr8 extends SuspendLambda implements Function2 {
    public final /* synthetic */ xr8 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wr8(xr8 xr8, Continuation continuation) {
        super(2, continuation);
        this.a = xr8;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new wr8(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((wr8) create(bool, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        xr8 xr8 = this.a;
        xr8.e(!xr8.e);
        xr8.h.invoke();
        return Unit.INSTANCE;
    }
}
