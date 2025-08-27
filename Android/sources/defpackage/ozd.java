package defpackage;

import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* renamed from: ozd  reason: default package */
public final class ozd {
    public final Lazy a;
    public final n6e b = m5a.b(0, 0, (cu0) null, 7);
    public final jx3 c;

    public ozd(gaf gaf, Lazy lazy) {
        this.a = lazy;
        this.c = e14.a(((osa) gaf).a());
        ((sv0) lazy.getValue()).d(this);
    }

    @oye
    public final void onEvent(vxd vxd) {
        ev0.v(this.c, (CoroutineContext) null, (f14) null, new kzd(this, vxd, (Continuation) null), 3);
    }

    @oye
    public final void onEvent(txd txd) {
        ev0.v(this.c, (CoroutineContext) null, (f14) null, new lzd(this, txd, (Continuation) null), 3);
    }

    @oye
    public final void onEvent(sh3 sh3) {
        ev0.v(this.c, (CoroutineContext) null, (f14) null, new mzd(this, sh3, (Continuation) null), 3);
    }

    @oye
    public final void onEvent(hj0 hj0) {
        ev0.v(this.c, (CoroutineContext) null, (f14) null, new nzd(this, hj0, (Continuation) null), 3);
    }
}
