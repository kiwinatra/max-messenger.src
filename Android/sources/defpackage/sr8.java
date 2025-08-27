package defpackage;

import kotlin.Lazy;

/* renamed from: sr8  reason: default package */
public final class sr8 extends xag {
    public final u25 b;
    public final Lazy c;
    public final Lazy o;
    public final s85 v;
    public final xme w;
    public final etc x;

    public sr8(uq7 uq7, int i) {
        fq7 fq7 = fq7.a;
        Lazy h = fq7.getAccessor().h(fq.class);
        Lazy h2 = fq7.getAccessor().h(gk.class);
        u25 u25 = (u25) fq7.getAccessor().g(u25.class);
        uq7 = (i & 8) != 0 ? null : uq7;
        this.b = u25;
        this.c = h;
        this.o = h2;
        this.v = new s85(0);
        xme a = f6e.a((Object) null);
        this.w = a;
        this.x = new etc(a);
        if (uq7 != null) {
            uq7.a();
        }
    }
}
