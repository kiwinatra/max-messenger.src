package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: m7g  reason: default package */
public final class m7g {
    public final j7g a;
    public volatile long b = -1;

    public m7g(j7g j7g) {
        this.a = j7g;
    }

    @oye
    public final void onEvent(tv9 tv9) {
        l20 l20;
        Object obj;
        if (tv9.a == this.b) {
            this.a.k().f(this);
            a32 D = this.a.l().D(this.a.v);
            rm rmVar = null;
            if (D == null) {
                this.a.k().c(new hj0(this.a.a, new qaf("attachment.token.expired", "chat deleted", (String) null)));
                return;
            }
            ha9 k = this.a.o().k(D.a, this.a.w);
            if (k == null || k.Y == qe9.DELETED) {
                this.a.k().c(new hj0(this.a.a, new qaf("attachment.token.expired", "message deleted", (String) null)));
                return;
            }
            if (k.x0 == null) {
                this.a.k().c(new hj0(this.a.a, new qaf("attachment.token.expired", "attaches not found", (String) null)));
            }
            long j = this.a.o;
            w28 w28 = k.x0;
            if (w28 == null) {
                l20 = null;
            } else {
                Iterator it = ((List) w28.b).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((l20) obj).d.a == j) {
                        break;
                    }
                }
                l20 = (l20) obj;
            }
            if (l20 == null) {
                this.a.k().c(new hj0(this.a.a, new qaf("attachment.token.expired", "video deleted", (String) null)));
                return;
            }
            k20 k20 = l20.d;
            j7g j7g = this.a;
            j7g j7g2 = new j7g(j7g.a, j7g.o, j7g.v, j7g.w, k.b, j7g.y, j7g.z, k20.l, true);
            rm rmVar2 = this.a.c;
            if (rmVar2 != null) {
                rmVar = rmVar2;
            }
            pbf pbf = (pbf) rmVar.V.getValue();
            pbf.getClass();
            ((wbf) pbf).b(j7g2, j7g2, false);
        }
    }

    @oye
    public final void onEvent(sv9 sv9) {
        if (sv9.a == this.b) {
            this.a.k().f(this);
            this.a.k().c(new hj0(this.a.a, sv9.b));
        }
    }
}
