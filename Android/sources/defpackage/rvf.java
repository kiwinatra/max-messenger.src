package defpackage;

import kotlin.Lazy;

/* renamed from: rvf  reason: default package */
public final class rvf {
    public final d14 a;
    public final eu3 b;
    public final gaf c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public final xme h;
    public final etc i;

    public rvf(ome ome, d14 d14, eu3 eu3, gaf gaf, Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4) {
        vk3 m;
        gaf gaf2 = gaf;
        this.a = d14;
        this.b = eu3;
        this.c = gaf2;
        this.d = lazy2;
        this.e = lazy3;
        this.f = lazy4;
        this.g = lazy;
        Long l = null;
        xme a2 = f6e.a((Object) null);
        this.h = a2;
        this.i = new etc(a2);
        a32 a32 = (a32) ome.getValue();
        if (a32 != null && a32.N() && ((a32.E() || a32.S()) && (m = a32.m()) != null && !m.x())) {
            l = Long.valueOf(m.r());
        }
        if (l != null) {
            bs0.K(bs0.F(new ps5(new on2(eu3.c(l.longValue()), 28), new p2c(2, this, rvf.class, "handleContact", "handleContact(Lru/ok/tamtam/contacts/Contact;)V", 4, 21), 5), ((osa) gaf2).b()), d14);
        }
    }
}
