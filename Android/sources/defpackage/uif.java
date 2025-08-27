package defpackage;

import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: uif  reason: default package */
public final class uif extends SuspendLambda implements Function2 {
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuspendLambda(2, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((uif) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        npg w = ct.w();
        z68.b("ThreadsDeveloperTools", "Threads count: " + ((Map) w.b), (Throwable) w.c);
        return Unit.INSTANCE;
    }
}
