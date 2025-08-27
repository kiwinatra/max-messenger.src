package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: g06  reason: default package */
public final class g06 extends SuspendLambda implements Function2 {
    public final /* synthetic */ m06 a;
    public final /* synthetic */ long b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g06(m06 m06, long j, Continuation continuation) {
        super(2, continuation);
        this.a = m06;
        this.b = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new g06(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((g06) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        KProperty[] kPropertyArr = m06.D0;
        this.a.l(this.b);
        return Unit.INSTANCE;
    }
}
