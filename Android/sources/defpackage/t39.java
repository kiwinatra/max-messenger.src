package defpackage;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* renamed from: t39  reason: default package */
public final class t39 {
    public final n6e a = m5a.b(0, 0, (cu0) null, 7);
    public final jx3 b;

    public t39(sv0 sv0, gaf gaf) {
        this.b = e14.a(((osa) gaf).a());
        sv0.d(this);
    }

    @oye
    public final void onChatMembersUpdateEvent(dk2 dk2) {
        n39 n39;
        int y = tr1.y(dk2.v);
        List list = dk2.b;
        ij2 ij2 = dk2.c;
        long j = dk2.o;
        if (y == 0) {
            n39 = new k39(j, ij2, list);
        } else if (y == 1) {
            n39 = new m39(j, ij2, list);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        ev0.v(this.b, (CoroutineContext) null, (f14) null, new q39(this, n39, (Continuation) null), 3);
    }

    @oye
    public final void onEvent(zu3 zu3) {
        ev0.v(this.b, (CoroutineContext) null, (f14) null, new r39(this, zu3, (Continuation) null), 3);
    }
}
