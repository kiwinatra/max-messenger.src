package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: r1c  reason: default package */
public final class r1c {
    public final sv0 a;
    public final n6e b = m5a.b(0, 0, (cu0) null, 7);
    public final jx3 c;

    public r1c(sv0 sv0, gaf gaf) {
        this.a = sv0;
        this.c = e14.a(((osa) gaf).c());
        sv0.d(this);
    }

    @oye
    public final void onEvent(hj0 hj0) {
        ngf ngf;
        igf igf;
        Long valueOf = Long.valueOf(hj0.a);
        qaf qaf = hj0.b;
        String str = qaf.o;
        if (str == null || str.length() == 0) {
            String str2 = qaf.b;
            if (m58.A(str2) && Intrinsics.areEqual((Object) str2, (Object) "io.exception")) {
                igf = new igf(qad.w1);
            } else if (!m58.A(str2) || Intrinsics.areEqual((Object) str2, (Object) "io.exception")) {
                igf = new igf(qad.u1);
            } else {
                igf = new igf(qad.z1);
            }
            ngf = igf;
        } else {
            ngf = new mgf(str);
        }
        ev0.v(this.c, (CoroutineContext) null, (f14) null, new q1c(this, new m1c(valueOf, ngf), (Continuation) null), 3);
    }

    @oye
    public final void onEvent(yr2 yr2) {
        ev0.v(this.c, (CoroutineContext) null, (f14) null, new q1c(this, new n1c(Long.valueOf(yr2.a)), (Continuation) null), 3);
    }
}
