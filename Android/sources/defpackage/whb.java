package defpackage;

import java.util.Set;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;

/* renamed from: whb  reason: default package */
public final class whb extends xag {
    public static final shb E0 = new shb((String) null, CollectionsKt.emptyList());
    public final zqd A0 = new zqd(11);
    public final s85 B0 = new s85(0);
    public final xme C0;
    public boolean D0;
    public final xme X;
    public final etc Y;
    public final xme Z;
    public final u9 b;
    public final cu2 c;
    public final Lazy o;
    public final Lazy v;
    public final etc v0;
    public final Lazy w;
    public final xme w0;
    public final Lazy x;
    public final etc x0;
    public final xme y;
    public final xme y0;
    public final etc z;
    public final etc z0;

    public whb(Set set, Set set2, u9 u9Var, Lazy lazy, Lazy lazy2, gaf gaf, hkb hkb, Lazy lazy3, cu2 cu2, Lazy lazy4) {
        this.b = u9Var;
        this.c = cu2;
        this.o = lazy;
        this.v = lazy2;
        this.w = lazy3;
        this.x = lazy4;
        xme a = f6e.a(MapsKt.emptyMap());
        this.y = a;
        this.z = new etc(a);
        xme a2 = f6e.a(MapsKt.emptyMap());
        this.X = a2;
        this.Y = new etc(a2);
        xme a3 = f6e.a(set2);
        this.Z = a3;
        this.v0 = new etc(a3);
        xme a4 = f6e.a((Object) null);
        this.w0 = a4;
        this.x0 = new etc(a4);
        xme a5 = f6e.a(E0);
        this.y0 = a5;
        this.z0 = new etc(a5);
        xme a6 = f6e.a("");
        this.C0 = a6;
        osa osa = (osa) gaf;
        bs0.K(bs0.F(bs0.L(a3, new lhb(this, (Continuation) null)), osa.b()), this.a);
        if (!set.isEmpty()) {
            xag.g(this, osa.b(), (f14) null, new mhb(this, set, hkb, (Continuation) null), 2);
        } else if (u9Var != null) {
            xag.g(this, osa.b(), (f14) null, new nhb(this, hkb, (Continuation) null), 2);
        }
        bs0.K(new ps5(bs0.L(bs0.w(new wb(28, bs0.v(a6, 200), this)), new ohb(this, (Continuation) null)), new qhb(this, (Continuation) null), 5), this.a);
    }

    public final void i() {
        j().h = null;
    }

    public final fd8 j() {
        return (fd8) this.w.getValue();
    }

    public final void k(long j) {
        xme xme = this.Z;
        Set mutableSet = CollectionsKt.toMutableSet((Iterable) xme.getValue());
        if (!mutableSet.remove(Long.valueOf(j))) {
            mutableSet.add(Long.valueOf(j));
        }
        xme.getClass();
        xme.m((Object) null, mutableSet);
    }
}
