package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: aq2  reason: default package */
public final class aq2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ dq2 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aq2(dq2 dq2, Continuation continuation) {
        super(2, continuation);
        this.b = dq2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        aq2 aq2 = new aq2(this.b, continuation);
        aq2.a = obj;
        return aq2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((aq2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        d14 d14 = (d14) this.a;
        if (!((Boolean) this.b.d.invoke()).booleanValue()) {
            return Unit.INSTANCE;
        }
        this.b.j = false;
        pm7 pm7 = this.b.f;
        if (pm7 != null) {
            pm7.b((CancellationException) null);
        }
        dq2 dq2 = this.b;
        dq2.f = ev0.v(d14, dq2.l, (f14) null, new wp2(dq2, (Continuation) null), 2);
        dq2 dq22 = this.b;
        wb wbVar = new wb(11, new on2(((my2) dq22.c).o(dq22.a), 28), this.b);
        Duration.Companion companion = Duration.Companion;
        bs0.K(new wb(15, new ps5(bs0.v(wbVar, xk4.e(DurationKt.toDuration(10, DurationUnit.SECONDS))), new xp2(this.b, (Continuation) null), 5), new yp2(3, (Continuation) null, 0)), d14);
        return Unit.INSTANCE;
    }
}
