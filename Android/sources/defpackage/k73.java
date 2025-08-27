package defpackage;

import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* renamed from: k73  reason: default package */
public final class k73 {
    public final sv0 a;
    public final gaf b;
    public final n6e c = m5a.b(0, 0, (cu0) null, 7);
    public final Lazy d;
    public final jx3 e;

    public k73(sv0 sv0, gaf gaf, Lazy lazy) {
        this.a = sv0;
        this.b = gaf;
        this.d = lazy;
        this.e = e14.a(((osa) gaf).a());
        sv0.d(this);
    }

    public final void a(f73 f73) {
        ev0.v(this.e, (CoroutineContext) null, (f14) null, new g73(this, f73, (Continuation) null), 3);
    }

    @oye
    public final void onAddChatEvent(fa faVar) {
        a(new d73(faVar.b));
    }

    @oye
    public final void onChatMembersUpdateEvent(dk2 dk2) {
        int y = tr1.y(dk2.v);
        long j = dk2.o;
        if (y == 0) {
            a(new d73(j));
        } else if (y == 1) {
            a(new e73(j));
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @oye
    public final void onIncomingMessageEvent(ke7 ke7) {
        if (ke7.w) {
            ev0.v(this.e, (CoroutineContext) null, (f14) null, new j73(this, ke7, (Continuation) null), 3);
        }
    }

    @oye
    public final void onLeaveChatEvent(rs7 rs7) {
        a(new e73(rs7.b));
    }

    @oye
    public final void onRemoveChatEvent(c1d c1d) {
        a(new e73(c1d.b));
    }
}
