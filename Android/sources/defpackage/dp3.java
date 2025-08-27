package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: dp3  reason: default package */
public final class dp3 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ kp3 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dp3(kp3 kp3, Continuation continuation) {
        super(2, continuation);
        this.b = kp3;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        dp3 dp3 = new dp3(this.b, continuation);
        dp3.a = obj;
        return dp3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dp3) create((tn3) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        tn3 tn3 = (tn3) this.a;
        boolean areEqual = Intrinsics.areEqual((Object) tn3, (Object) rn3.a);
        kp3 kp3 = this.b;
        if (areEqual) {
            kp3.d();
        } else if (tn3 instanceof sn3) {
            kp3.d();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
