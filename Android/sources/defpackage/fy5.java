package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: fy5  reason: default package */
public final class fy5 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ gy5 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fy5(gy5 gy5, Continuation continuation) {
        super(2, continuation);
        this.b = gy5;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        fy5 fy5 = new fy5(this.b, continuation);
        fy5.a = obj;
        return fy5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fy5) create((zx5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        zx5 zx5 = (zx5) this.a;
        gy5 gy5 = this.b;
        zx5 zx52 = gy5.d;
        if (zx52 == null) {
            gy5.d = zx5;
        } else {
            gy5.getClass();
            if (zx52 != null && !Intrinsics.areEqual((Object) zx52, (Object) zx5)) {
                if (!Intrinsics.areEqual((Object) zx52.w, (Object) zx5.w) || !Intrinsics.areEqual((Object) zx52.Y, (Object) zx5.Y) || !Intrinsics.areEqual((Object) zx52.v0, (Object) zx5.v0) || !Intrinsics.areEqual((Object) zx52.Z, (Object) zx5.Z)) {
                    gy5.a(ls2.a);
                }
                gy5.d = zx5;
            }
        }
        return Unit.INSTANCE;
    }
}
