package defpackage;

import com.my.tracker.MyTracker;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: s4a  reason: default package */
public final class s4a extends SuspendLambda implements Function2 {
    public /* synthetic */ long a;

    /* JADX WARNING: type inference failed for: r1v1, types: [s4a, kotlin.coroutines.Continuation, kotlin.coroutines.jvm.internal.SuspendLambda] */
    public final Continuation create(Object obj, Continuation continuation) {
        ? suspendLambda = new SuspendLambda(2, continuation);
        suspendLambda.a = ((Number) obj).longValue();
        return suspendLambda;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((s4a) create(Long.valueOf(((Number) obj).longValue()), (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        MyTracker.trackLoginEvent(String.valueOf(this.a), (String) null);
        return Unit.INSTANCE;
    }
}
