package defpackage;

import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: szb  reason: default package */
public final class szb {
    public final n6e a = m5a.b(0, 0, (cu0) null, 7);
    public final jx3 b;

    public szb(sv0 sv0, Lazy lazy) {
        this.b = e14.a(((osa) ((gaf) lazy.getValue())).c());
        sv0.d(this);
    }

    public static final ngf a(szb szb, qaf qaf) {
        szb.getClass();
        String str = qaf.o;
        if (str != null && str.length() != 0) {
            return new mgf(str);
        }
        String str2 = qaf.b;
        return (!m58.A(str2) || !Intrinsics.areEqual((Object) str2, (Object) "io.exception")) ? (!m58.A(str2) || Intrinsics.areEqual((Object) str2, (Object) "io.exception")) ? new igf(qad.u1) : new igf(qad.z1) : new igf(qad.w1);
    }

    @oye
    public final void onEvent(o1c o1c) {
        ev0.v(this.b, (CoroutineContext) null, (f14) null, new nzb(this, o1c, (Continuation) null), 3);
    }

    @oye
    public final void onEvent(pwb pwb) {
        ev0.v(this.b, (CoroutineContext) null, (f14) null, new ozb(this, pwb, (Continuation) null), 3);
    }

    @oye
    public final void onEvent(hj0 hj0) {
        ev0.v(this.b, (CoroutineContext) null, (f14) null, new pzb(this, hj0, (Continuation) null), 3);
    }

    @oye
    public final void onEvent(k1c k1c) {
        ev0.v(this.b, (CoroutineContext) null, (f14) null, new qzb(this, k1c, (Continuation) null), 3);
    }

    @oye
    public final void onEvent(yr2 yr2) {
        ev0.v(this.b, (CoroutineContext) null, (f14) null, new rzb(this, yr2, (Continuation) null), 3);
    }
}
