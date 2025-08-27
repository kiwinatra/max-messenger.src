package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: i1c  reason: default package */
public final class i1c extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ j1c b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i1c(j1c j1c, Continuation continuation) {
        super(2, continuation);
        this.b = j1c;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        i1c i1c = new i1c(this.b, continuation);
        i1c.a = obj;
        return i1c;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((i1c) create((mzb) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        mzb mzb = (mzb) this.a;
        boolean z = mzb instanceof lzb;
        j1c j1c = this.b;
        if (z) {
            lzb lzb = (lzb) mzb;
            Long l = lzb.a;
            xz4 xz4 = j1c.b;
            long j = xz4.n.get();
            ngf ngf = lzb.b;
            s85 s85 = j1c.w0;
            if (l != null && l.longValue() == j) {
                ev0.v(j1c.a, ((osa) j1c.j()).b(), (f14) null, new d1c(j1c, (Continuation) null), 2);
                xag.h(s85, new h0c(ngf, Integer.valueOf(cad.K)));
            } else {
                long j2 = xz4.m.get();
                if (l != null && l.longValue() == j2) {
                    xag.h(s85, new h0c(ngf, Integer.valueOf(cad.K)));
                } else if (l == null) {
                    xag.h(s85, new h0c(ngf, Integer.valueOf(cad.K)));
                }
            }
        } else if (mzb instanceof izb) {
            Long boxLong = Boxing.boxLong(((izb) mzb).a);
            long j3 = j1c.b.n.get();
            if (boxLong != null && boxLong.longValue() == j3) {
                xag.h(j1c.w0, new h0c(new igf(ixa.q), Integer.valueOf(cad.n)));
            }
        } else if (mzb instanceof kzb) {
            xag.h(j1c.w0, new h0c(new igf(ixa.q), Boxing.boxInt(cad.n)));
        }
        return Unit.INSTANCE;
    }
}
