package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: q9b  reason: default package */
public final class q9b extends SuspendLambda implements Function2 {
    public final /* synthetic */ v9b a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q9b(v9b v9b, Continuation continuation) {
        super(2, continuation);
        this.a = v9b;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new q9b(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((q9b) create(bool, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.a.d();
        return Unit.INSTANCE;
    }
}
