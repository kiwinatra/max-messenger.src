package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: t6c  reason: default package */
public final class t6c extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ k7c b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t6c(k7c k7c, Continuation continuation) {
        super(2, continuation);
        this.b = k7c;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        t6c t6c = new t6c(this.b, continuation);
        t6c.a = obj;
        return t6c;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((t6c) create((p1c) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        p1c p1c = (p1c) this.a;
        boolean z = p1c instanceof m1c;
        k7c k7c = this.b;
        if (z) {
            m1c m1c = (m1c) p1c;
            Long l = m1c.a;
            long g = k7c.I0.g();
            if (l != null && l.longValue() == g) {
                ev0.v(k7c.a, ((osa) k7c.n()).b(), (f14) null, new z6c(k7c, (Continuation) null), 2);
                xag.h(k7c.w0, new g6c(m1c.b, Integer.valueOf(cad.K)));
            }
        } else if (p1c instanceof n1c) {
            Long l2 = ((n1c) p1c).a;
            long g2 = k7c.I0.g();
            if (l2 != null && l2.longValue() == g2) {
                xag.h(k7c.w0, new g6c(new igf(lxa.Z), Integer.valueOf(lya.l)));
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
