package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ao7  reason: default package */
public final class ao7 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ do7 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ao7(do7 do7, Continuation continuation) {
        super(2, continuation);
        this.b = do7;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ao7 ao7 = new ao7(this.b, continuation);
        ao7.a = obj;
        return ao7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ao7) create((ab2) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        xag.h(this.b.v, new v5a(Long.valueOf(((ab2) this.a).c)));
        return Unit.INSTANCE;
    }
}
