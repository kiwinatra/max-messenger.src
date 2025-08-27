package defpackage;

import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* renamed from: wp1  reason: default package */
public final class wp1 {
    public final n6e a = m5a.b(0, 0, (cu0) null, 7);
    public final jx3 b;

    public wp1(Lazy lazy) {
        Lazy lazy2 = rjd.R;
        this.b = e14.a(((osa) ((gaf) lazy.getValue())).c());
        ((sv0) lazy2.getValue()).d(this);
    }

    @oye
    public final void onEvent(d31 d31) {
        ev0.v(this.b, (CoroutineContext) null, (f14) null, new up1(this, d31, (Continuation) null), 3);
    }

    @oye
    public final void onEvent(hj0 hj0) {
        ev0.v(this.b, (CoroutineContext) null, (f14) null, new vp1(this, hj0, (Continuation) null), 3);
    }
}
