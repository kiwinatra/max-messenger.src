package defpackage;

import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: u1c  reason: default package */
public final class u1c {
    public final n6e a = m5a.b(0, 0, (cu0) null, 7);
    public final jx3 b;

    public u1c(sv0 sv0, Lazy lazy) {
        this.b = e14.a(((osa) ((gaf) lazy.getValue())).c());
        sv0.d(this);
    }

    public static final ngf a(u1c u1c, qaf qaf) {
        u1c.getClass();
        String str = qaf.o;
        if (str != null && str.length() != 0) {
            return new mgf(str);
        }
        String str2 = qaf.b;
        return (!m58.A(str2) || !Intrinsics.areEqual((Object) str2, (Object) "io.exception")) ? (!m58.A(str2) || Intrinsics.areEqual((Object) str2, (Object) "io.exception")) ? new igf(qad.u1) : new igf(qad.z1) : new igf(qad.w1);
    }

    @oye
    public final void onEvent(hj0 hj0) {
        ev0.v(this.b, (CoroutineContext) null, (f14) null, new s1c(this, hj0, (Continuation) null), 3);
    }

    @oye
    public final void onEvent(k1c k1c) {
        ev0.v(this.b, (CoroutineContext) null, (f14) null, new t1c(this, k1c, (Continuation) null), 3);
    }
}
