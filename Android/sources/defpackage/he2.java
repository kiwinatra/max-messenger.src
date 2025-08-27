package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* renamed from: he2  reason: default package */
public final class he2 {
    public final long a;
    public final n6e b = m5a.b(0, 0, (cu0) null, 7);
    public final jx3 c;

    public he2(long j, sv0 sv0, gaf gaf) {
        this.a = j;
        this.c = e14.a(((osa) gaf).a());
        sv0.d(this);
    }

    public final void a(fe2 fe2) {
        ev0.v(this.c, (CoroutineContext) null, (f14) null, new ge2(this, fe2, (Continuation) null), 3);
    }

    @oye
    public final void onEvent(ke7 ke7) {
        if (ke7.b == this.a && !ke7.w) {
            a(new zd2(ke7.c));
        }
    }

    @oye
    public final void onEvent(w5b w5b) {
        if (w5b.b == this.a) {
            a(new zd2(w5b.o));
        }
    }

    @oye
    public final void onEvent(twf twf) {
        if (twf.b == this.a) {
            a(new de2(twf.c));
        }
    }

    @oye
    public final void onEvent(tr4 tr4) {
        a(new ae2(tr4.v, tr4.o));
    }

    @oye
    public final void onEvent(vr4 vr4) {
        a(new be2(vr4.o));
    }

    @oye
    public final void onEvent(kv9 kv9) {
        if (kv9.b == this.a) {
            a(new ce2(kv9.v));
        }
    }
}
