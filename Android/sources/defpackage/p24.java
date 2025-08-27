package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* renamed from: p24  reason: default package */
public final class p24 {
    public final n6e a = m5a.b(0, 0, (cu0) null, 7);
    public final jx3 b;

    public p24(sv0 sv0, gaf gaf) {
        this.b = e14.a(((osa) gaf).a());
        sv0.d(this);
    }

    @oye
    public final void onEvent(a12 a12) {
        ev0.v(this.b, (CoroutineContext) null, (f14) null, new n24(this, a12, (Continuation) null), 3);
    }

    @oye
    public final void onEvent(hj0 hj0) {
        ev0.v(this.b, (CoroutineContext) null, (f14) null, new o24(this, hj0, (Continuation) null), 3);
    }
}
