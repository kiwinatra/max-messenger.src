package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ci0  reason: default package */
public final class ci0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ qh0 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ci0(qh0 qh0, Continuation continuation) {
        super(2, continuation);
        this.a = qh0;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ci0(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ci0) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return Boxing.boxBoolean(!((Boolean) this.a.c().invoke()).booleanValue());
    }
}
