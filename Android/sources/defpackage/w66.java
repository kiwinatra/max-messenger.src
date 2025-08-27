package defpackage;

import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* renamed from: w66  reason: default package */
public final class w66 extends xag {
    public final u82 b;
    public final gaf c;
    public final Lazy o;
    public final xme v;
    public final etc w;
    public final s85 x = new s85(0);
    public String y;
    public g0g z;

    public w66() {
        i66 i66 = i66.a;
        u82 u82 = (u82) i66.getAccessor().g(u82.class);
        gaf gaf = (gaf) i66.getAccessor().g(gaf.class);
        Lazy h = i66.getAccessor().h(xva.class);
        this.b = u82;
        this.c = gaf;
        this.o = h;
        xme a = f6e.a(CollectionsKt.emptyList());
        this.v = a;
        this.w = new etc(a);
        bs0.K(bs0.F(new ps5(((ia2) u82).j(), new r66(this, (Continuation) null), 5), ((osa) gaf).a()), this.a);
    }
}
