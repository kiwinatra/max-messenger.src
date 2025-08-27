package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: u39  reason: default package */
public final class u39 implements o39 {
    public final n6e a;
    public final jx3 b;
    public final ps5 c;

    public u39(sv0 sv0, gaf gaf) {
        n6e b2 = m5a.b(0, 0, (cu0) null, 7);
        this.a = b2;
        this.b = e14.a(((osa) gaf).c());
        Duration.Companion companion = Duration.Companion;
        this.c = gt5.a(b2, DurationKt.toDuration(1000, DurationUnit.MILLISECONDS), new ui0(12));
        sv0.d(this);
    }

    public final void a() {
        ev0.v(this.b, (CoroutineContext) null, (f14) null, new p39(this, (Continuation) null), 3);
    }

    @oye
    public final void onEvent(w88 w88) {
        a();
    }

    @oye
    public final void onEvent(veb veb) {
        a();
    }

    @oye
    public final void onEvent(zu3 zu3) {
        a();
    }

    @oye
    public final void onEvent(jwf jwf) {
        a();
    }

    @oye
    public final void onEvent(xy2 xy2) {
        a();
    }
}
