package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* renamed from: kgb  reason: default package */
public final class kgb {
    public final n6e a = m5a.b(0, 0, (cu0) null, 7);
    public final jx3 b;

    public kgb(sv0 sv0, gaf gaf) {
        this.b = e14.a(((osa) gaf).a());
        sv0.d(this);
    }

    @oye
    public final void onEvent(dk2 dk2) {
        ev0.v(this.b, (CoroutineContext) null, (f14) null, new igb(this, dk2, (Continuation) null), 3);
    }

    @oye
    public final void onEvent(hj0 hj0) {
        ev0.v(this.b, (CoroutineContext) null, (f14) null, new jgb(this, hj0, (Continuation) null), 3);
    }
}
