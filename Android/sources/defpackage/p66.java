package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: p66  reason: default package */
public final class p66 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;

    /* JADX WARNING: type inference failed for: r1v1, types: [p66, kotlin.coroutines.Continuation, kotlin.coroutines.jvm.internal.SuspendLambda] */
    public final Continuation create(Object obj, Continuation continuation) {
        ? suspendLambda = new SuspendLambda(2, continuation);
        suspendLambda.a = obj;
        return suspendLambda;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((p66) create((v5a) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        v5a v5a = (v5a) this.a;
        if (v5a instanceof n66) {
            z16.b.o1(xy5.a);
        } else if (v5a instanceof o66) {
            z16.b.p1(((o66) v5a).b);
        }
        return Unit.INSTANCE;
    }
}
