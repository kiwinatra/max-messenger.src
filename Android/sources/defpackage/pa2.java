package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* renamed from: pa2  reason: default package */
public final class pa2 {
    public final n6e a = m5a.b(0, 0, (cu0) null, 7);
    public final jx3 b;

    public pa2(sv0 sv0, gaf gaf) {
        this.b = e14.a(((osa) gaf).c());
        sv0.d(this);
    }

    @oye
    public final void onEvent(na2 na2) {
        ev0.v(this.b, (CoroutineContext) null, (f14) null, new oa2(this, na2, (Continuation) null), 3);
    }
}
