package defpackage;

import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: bcc  reason: default package */
public final class bcc extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ecc b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bcc(Continuation continuation, ecc ecc) {
        super(2, continuation);
        this.b = ecc;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        bcc bcc = new bcc(continuation, this.b);
        bcc.a = obj;
        return bcc;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bcc) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ibc ibc = (ibc) this.a;
        float f = ecc.F0;
        ecc ecc = this.b;
        ecc.getClass();
        if (ibc instanceof hbc) {
            at1 cameraApi = ecc.getCameraApi();
            ExecutorService executorService = ecc.v;
            if (executorService == null) {
                executorService = null;
            }
            cameraApi.d(executorService);
        } else if (ibc instanceof fbc) {
            ecc.getCameraApi().a(((fbc) ibc).a);
        } else if (ibc instanceof gbc) {
            ecc.getCameraApi().i();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
