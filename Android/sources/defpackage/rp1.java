package defpackage;

import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* renamed from: rp1  reason: default package */
public final class rp1 {
    public final n6e a = m5a.b(0, 0, (cu0) null, 7);
    public final jx3 b;

    public rp1(Lazy lazy, Lazy lazy2) {
        this.b = e14.a(((osa) ((gaf) lazy2.getValue())).c());
        ((sv0) lazy.getValue()).d(this);
    }

    @oye
    public final void onEvent(p98 p98) {
        ev0.v(this.b, (CoroutineContext) null, (f14) null, new np1(this, (Continuation) null), 3);
    }

    @oye
    public final void onEvent(zu3 zu3) {
        ev0.v(this.b, (CoroutineContext) null, (f14) null, new op1(this, zu3, (Continuation) null), 3);
    }

    @oye
    public final void onEvent(nw7 nw7) {
        ev0.v(this.b, (CoroutineContext) null, (f14) null, new pp1(this, nw7, (Continuation) null), 3);
    }

    @oye
    public final void onEvent(hj0 hj0) {
        ev0.v(this.b, (CoroutineContext) null, (f14) null, new qp1(this, hj0, (Continuation) null), 3);
    }
}
