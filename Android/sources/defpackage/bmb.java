package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* renamed from: bmb  reason: default package */
public final class bmb {
    public final n6e a = m5a.b(0, 0, (cu0) null, 7);
    public final jx3 b;

    public bmb(sv0 sv0, gaf gaf) {
        this.b = e14.a(((osa) gaf).c());
        sv0.d(this);
    }

    @oye
    public final void onEvent(xy2 xy2) {
        jz9 jz9 = new jz9((Object) null);
        for (Number longValue : xy2.b) {
            jz9.e(longValue.longValue());
        }
        ev0.v(this.b, (CoroutineContext) null, (f14) null, new amb(this, new ece(16), (Continuation) null), 3);
    }
}
