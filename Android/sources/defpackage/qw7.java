package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* renamed from: qw7  reason: default package */
public final class qw7 {
    public final n6e a = m5a.b(0, 0, (cu0) null, 7);
    public final jx3 b;

    public qw7(sv0 sv0, gaf gaf) {
        this.b = e14.a(((osa) gaf).c());
        sv0.d(this);
    }

    @oye
    public final void onEvent(nw7 nw7) {
        ev0.v(this.b, (CoroutineContext) null, (f14) null, new ow7(this, nw7, (Continuation) null), 3);
    }

    @oye
    public final void onEvent(hj0 hj0) {
        ev0.v(this.b, (CoroutineContext) null, (f14) null, new pw7(this, hj0, (Continuation) null), 3);
    }
}
