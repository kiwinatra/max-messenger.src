package defpackage;

import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* renamed from: cf5  reason: default package */
public final class cf5 {
    public final sv0 a;
    public final n6e b = m5a.b(0, 0, (cu0) null, 7);
    public final jx3 c;
    public final Lazy d;
    public final Long e;

    public cf5(gaf gaf, sv0 sv0, long j, q72 q72, Lazy lazy) {
        ta2 ta2;
        etc etc;
        this.a = sv0;
        Long l = null;
        this.c = e14.a(((osa) gaf).c());
        this.d = lazy;
        sv0.d(this);
        int ordinal = q72.ordinal();
        if (ordinal == 0) {
            ta2 = ta2.a;
        } else if (ordinal == 1) {
            ta2 = ta2.b;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        qx2 qx2 = (qx2) lazy.getValue();
        qx2.getClass();
        int ordinal2 = ta2.ordinal();
        if (ordinal2 == 0) {
            etc = ((my2) qx2).o(j);
        } else if (ordinal2 == 1) {
            etc = ((my2) qx2).p(j);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        a32 a32 = (a32) etc.a.getValue();
        this.e = a32 != null ? Long.valueOf(a32.a) : l;
    }

    @oye
    public final void onEvent(c1d c1d) {
        long j = c1d.b;
        Long l = this.e;
        if (l != null && j == l.longValue()) {
            ev0.v(this.c, (CoroutineContext) null, (f14) null, new bf5(this, (Continuation) null), 3);
        }
    }
}
