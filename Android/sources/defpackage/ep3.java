package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ep3  reason: default package */
public final class ep3 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ kp3 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ep3(kp3 kp3, Continuation continuation) {
        super(2, continuation);
        this.b = kp3;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ep3 ep3 = new ep3(this.b, continuation);
        ep3.a = obj;
        return ep3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ep3) create((lcb) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (((lcb) this.a) instanceof lcb) {
            this.b.d();
            return Unit.INSTANCE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
