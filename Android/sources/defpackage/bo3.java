package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* renamed from: bo3  reason: default package */
public final class bo3 {
    public final n6e a = m5a.b(0, 0, (cu0) null, 7);
    public final jx3 b;

    public bo3(sv0 sv0, gaf gaf) {
        this.b = e14.a(((osa) gaf).a());
        sv0.d(this);
    }

    public final bs5 a() {
        return new dtc(this.a);
    }

    @oye
    public final void onEvent(w88 w88) {
        ev0.v(this.b, (CoroutineContext) null, (f14) null, new xn3(this, (Continuation) null), 3);
    }

    @oye
    public final void onEvent(veb veb) {
        ev0.v(this.b, (CoroutineContext) null, (f14) null, new yn3(this, (Continuation) null), 3);
    }

    @oye
    public final void onEvent(zu3 zu3) {
        ev0.v(this.b, (CoroutineContext) null, (f14) null, new zn3(this, zu3, (Continuation) null), 3);
    }

    @oye
    public final void onEvent(jwf jwf) {
        ev0.v(this.b, (CoroutineContext) null, (f14) null, new ao3(this, (Continuation) null), 3);
    }
}
