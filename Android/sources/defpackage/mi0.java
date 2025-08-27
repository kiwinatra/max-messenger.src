package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* renamed from: mi0  reason: default package */
public final class mi0 {
    public final n6e a;
    public final dtc b;
    public final jx3 c;

    public mi0(sv0 sv0, gaf gaf) {
        n6e b2 = m5a.b(0, 0, (cu0) null, 7);
        this.a = b2;
        this.b = new dtc(b2);
        this.c = e14.a(((osa) gaf).c());
        sv0.d(this);
    }

    @oye
    public final void onBaseError(hj0 hj0) {
        ev0.v(this.c, (CoroutineContext) null, (f14) null, new li0(this, hj0, (Continuation) null), 3);
    }
}
