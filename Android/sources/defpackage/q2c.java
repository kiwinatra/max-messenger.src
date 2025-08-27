package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: q2c  reason: default package */
public final class q2c extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ z2c b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q2c(z2c z2c, Continuation continuation) {
        super(2, continuation);
        this.b = z2c;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        q2c q2c = new q2c(this.b, continuation);
        q2c.a = obj;
        return q2c;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((q2c) create((p1c) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        p1c p1c = (p1c) this.a;
        if (p1c instanceof n1c) {
            Long l = ((n1c) p1c).a;
            z2c z2c = this.b;
            long j = z2c.v0.get();
            if (l != null && l.longValue() == j) {
                xag.h(z2c.B0, new e2c(cad.B, new igf(lxa.X0)));
            }
        }
        return Unit.INSTANCE;
    }
}
