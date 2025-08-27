package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* renamed from: io4  reason: default package */
public final class io4 {
    public final long a;
    public final sv0 b;
    public final qx2 c;
    public final n6e d = m5a.b(0, 0, (cu0) null, 7);
    public final jx3 e;

    public io4(long j, sv0 sv0, gaf gaf, qx2 qx2) {
        this.a = j;
        this.b = sv0;
        this.c = qx2;
        this.e = e14.a(((osa) gaf).c().t0());
        sv0.d(this);
    }

    @oye
    public final void onEvent(xy2 xy2) {
        vk3 m;
        for (Number longValue : xy2.b) {
            a32 a32 = (a32) ((my2) this.c).o(longValue.longValue()).a.getValue();
            if (a32 != null && (m = a32.m()) != null) {
                if (m.r() == this.a) {
                    ev0.v(this.e, (CoroutineContext) null, (f14) null, new ho4(this, (Continuation) null), 3);
                    return;
                }
                return;
            }
        }
    }
}
