package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: n50  reason: default package */
public final class n50 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ q50 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n50(q50 q50, Continuation continuation) {
        super(2, continuation);
        this.b = q50;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        n50 n50 = new n50(this.b, continuation);
        n50.a = obj;
        return n50;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((n50) create((w50) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        w50 w50 = (w50) this.a;
        q50 q50 = this.b;
        q50.N0 = w50;
        if (w50 != null) {
            if (Intrinsics.areEqual((Object) w50.a, (Object) q50.L0)) {
                mz4 mz4 = mz4.a;
                m30 m30 = w50.c;
                if (Intrinsics.areEqual((Object) m30, (Object) mz4)) {
                    q50.A0.c(c44.DEFAULT_ASPECT_RATIO, false);
                }
                q50.c(m30);
                return Unit.INSTANCE;
            }
        }
        q50.c(cd4.b);
        return Unit.INSTANCE;
    }
}
