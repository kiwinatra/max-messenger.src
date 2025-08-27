package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* renamed from: ya2  reason: default package */
public final class ya2 extends qm implements lcf {
    public final String o;
    public final String v;

    public ya2(long j, String str, String str2) {
        super(j);
        this.o = str;
        this.v = str2;
    }

    public final void e(ibf ibf) {
        za2 za2 = (za2) ibf;
        List n0 = l().n0(CollectionsKt.listOf(za2.c));
        k().c(new xy2(n0, true, false, (bl4) null, (zub) null, 124));
        k().c(new ab2(za2.c.V0, this.a, ((Number) n0.get(0)).longValue(), this.o));
    }

    public final fbf g() {
        return new yt(this.o, this.v, 22);
    }

    public final void h(qaf qaf) {
        k().c(new hj0(this.a, qaf));
    }
}
