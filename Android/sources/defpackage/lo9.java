package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* renamed from: lo9  reason: default package */
public final class lo9 {
    public final n6e a = m5a.b(0, 0, (cu0) null, 7);
    public final jx3 b;

    public lo9(sv0 sv0, gaf gaf) {
        this.b = e14.a(((osa) gaf).c());
        sv0.d(this);
    }

    @oye
    public final void onEvent(tr4 tr4) {
        ev0.v(this.b, (CoroutineContext) null, (f14) null, new ko9(this, new ho9(tr4.v, tr4.o), (Continuation) null), 3);
    }

    @oye
    public final void onEvent(vr4 vr4) {
        ev0.v(this.b, (CoroutineContext) null, (f14) null, new ko9(this, new io9(vr4.o, vr4.c), (Continuation) null), 3);
    }
}
