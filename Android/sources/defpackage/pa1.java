package defpackage;

import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: pa1  reason: default package */
public final class pa1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ya1 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pa1(ya1 ya1, Continuation continuation) {
        super(2, continuation);
        this.b = ya1;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        pa1 pa1 = new pa1(this.b, continuation);
        pa1.a = obj;
        return pa1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pa1) create((a51) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        qa1 qa1;
        String str;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        a51 a51 = (a51) this.a;
        if (a51 instanceof v41) {
            long j = ((v41) a51).a;
            Long l = this.b.x0;
            if (l != null && j == l.longValue()) {
                this.b.x0 = null;
            }
        } else if (a51 instanceof w41) {
            w41 w41 = (w41) a51;
            long j2 = w41.a.a;
            Long l2 = this.b.x0;
            if (l2 != null && j2 == l2.longValue()) {
                this.b.x0 = null;
                ya1 ya1 = this.b;
                xme xme = ya1.Z;
                do {
                    value = xme.getValue();
                    qa1 = (qa1) value;
                    nw7 nw7 = w41.a;
                    gv6 gv6 = nw7.v;
                    if (gv6 == null || (str = gv6.v) == null) {
                        d4g d4g = nw7.w;
                        str = d4g != null ? d4g.o : null;
                    }
                    d4g d4g2 = nw7.w;
                    ya1.w0.setValue(ya1, ya1.z0[0], ev0.u(ya1.a, ((osa) ((gaf) ya1.X.getValue())).b(), f14.b, new wa1(d4g2.x, d4g2.v, ya1, (Continuation) null)));
                } while (!xme.b(value, qa1.a(qa1, (zd0) null, (aj8) null, (aj8) null, false, str != null ? new mgf(str) : new igf(sqa.z), (ArrayList) null, (ngf) null, 111)));
            }
        }
        return Unit.INSTANCE;
    }
}
