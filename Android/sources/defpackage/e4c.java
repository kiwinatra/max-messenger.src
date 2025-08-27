package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e4c  reason: default package */
public final class e4c extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;

    /* JADX WARNING: type inference failed for: r1v1, types: [kotlin.coroutines.Continuation, e4c, kotlin.coroutines.jvm.internal.SuspendLambda] */
    public final Continuation create(Object obj, Continuation continuation) {
        ? suspendLambda = new SuspendLambda(2, continuation);
        suspendLambda.a = obj;
        return suspendLambda;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e4c) create((v5a) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (Intrinsics.areEqual((Object) (v5a) this.a, (Object) p33.b)) {
            vzb.b.W0().d();
        }
        return Unit.INSTANCE;
    }
}
