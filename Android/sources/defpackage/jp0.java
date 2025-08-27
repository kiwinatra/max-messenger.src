package defpackage;

import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* renamed from: jp0  reason: default package */
public final class jp0 {
    public final Lazy a;
    public final n6e b = m5a.b(0, 0, (cu0) null, 7);
    public final jx3 c;

    public jp0(Lazy lazy, Lazy lazy2) {
        this.a = lazy;
        this.c = e14.a(((osa) ((gaf) lazy2.getValue())).a());
        ((sv0) lazy.getValue()).d(this);
    }

    @oye
    public final void onEvent(zu3 zu3) {
        ev0.v(this.c, (CoroutineContext) null, (f14) null, new gp0(this, zu3, (Continuation) null), 3);
    }

    @oye
    public final void onEvent(wo3 wo3) {
        ev0.v(this.c, (CoroutineContext) null, (f14) null, new hp0(this, wo3, (Continuation) null), 3);
    }

    @oye
    public final void onEvent(hj0 hj0) {
        ev0.v(this.c, (CoroutineContext) null, (f14) null, new ip0(this, hj0, (Continuation) null), 3);
    }
}
