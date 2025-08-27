package defpackage;

import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* renamed from: tkd  reason: default package */
public final class tkd {
    public final n6e a = m5a.b(0, 0, (cu0) null, 7);
    public final jx3 b;

    public tkd() {
        Lazy lazy = rjd.R;
        Lazy lazy2 = rjd.N;
        this.b = e14.a(((osa) ((gaf) lazy2.getValue())).c());
        ((sv0) lazy.getValue()).d(this);
    }

    @oye
    public final void onEvent(sk2 sk2) {
        ev0.v(this.b, (CoroutineContext) null, (f14) null, new rkd(this, sk2, (Continuation) null), 3);
    }

    @oye
    public final void onEvent(hj0 hj0) {
        ev0.v(this.b, (CoroutineContext) null, (f14) null, new skd(this, hj0, (Continuation) null), 3);
    }
}
