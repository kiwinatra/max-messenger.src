package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* renamed from: g39  reason: default package */
public final class g39 {
    public final long a;
    public final long b;
    public final sv0 c;
    public final n6e d = m5a.b(0, 0, (cu0) null, 7);
    public final jx3 e;

    public g39(long j, long j2, sv0 sv0, gaf gaf) {
        this.a = j;
        this.b = j2;
        this.c = sv0;
        this.e = e14.a(((osa) gaf).a());
        sv0.d(this);
    }

    @oye
    public final void onEvent(twf twf) {
        if (twf.b == this.b) {
            if (twf.c == this.a || twf.v) {
                ev0.v(this.e, (CoroutineContext) null, (f14) null, new f39(this, (Continuation) null), 3);
            }
        }
    }

    @oye
    public final void onEvent(xy2 xy2) {
        if (xy2.b.contains(Long.valueOf(this.b))) {
            ev0.v(this.e, (CoroutineContext) null, (f14) null, new e39(this, (Continuation) null), 3);
        }
    }
}
