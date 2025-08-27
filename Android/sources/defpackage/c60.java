package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: c60  reason: default package */
public final class c60 extends SuspendLambda implements Function2 {
    public /* synthetic */ long a;
    public final /* synthetic */ d60 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c60(d60 d60, Continuation continuation) {
        super(2, continuation);
        this.b = d60;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        c60 c60 = new c60(this.b, continuation);
        c60.a = ((Number) obj).longValue();
        return c60;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c60) create(Long.valueOf(((Number) obj).longValue()), (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        long j = this.a;
        b60 b60 = this.b.c;
        if (b60 != null) {
            b60.setCurrentPosition(j);
        }
        return Unit.INSTANCE;
    }
}
