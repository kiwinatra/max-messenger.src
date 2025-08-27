package defpackage;

import java.util.List;
import kotlin.Pair;

/* renamed from: rk9  reason: default package */
public final class rk9 extends xag {
    public final xme b;
    public final etc c;
    public final xme o;
    public final etc v;
    public final xme w;
    public final etc x;
    public final s85 y = new s85(0);
    public final s85 z = new s85(0);

    public rk9() {
        xme a = f6e.a(Boolean.FALSE);
        this.b = a;
        this.c = new etc(a);
        xme a2 = f6e.a((Object) null);
        this.o = a2;
        this.v = new etc(a2);
        xme a3 = f6e.a((Object) null);
        this.w = a3;
        this.x = new etc(a3);
    }

    public final void j(Pair pair) {
        xme xme;
        Object value;
        do {
            xme = this.o;
            value = xme.getValue();
            uy6 uy6 = (uy6) value;
        } while (!xme.b(value, pair == null ? null : new uy6(((Number) pair.getFirst()).longValue(), (List) pair.getSecond())));
    }
}
