package defpackage;

import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: vhb  reason: default package */
public final class vhb extends xag {
    public final etc X;
    public final ojb b;
    public final ukb c;
    public final xme o;
    public final etc v;
    public final xme w;
    public final etc x;
    public final s85 y = new s85(0);
    public final xme z;

    public vhb(Set set, ojb ojb, ukb ukb, gaf gaf) {
        this.b = ojb;
        this.c = ukb;
        xme a = f6e.a(MapsKt.emptyMap());
        this.o = a;
        this.v = new etc(a);
        xme a2 = f6e.a(set);
        this.w = a2;
        this.x = new etc(a2);
        m5a.b(0, IntCompanionObject.MAX_VALUE, (cu0) null, 4);
        xme a3 = f6e.a("");
        this.z = a3;
        bs5 w2 = bs0.w(bs0.v(a3, 200));
        Object value = a3.getValue();
        this.X = bs0.X(w2, this.a, z6e.a, value);
        bs0.K(bs0.F(bs0.L(a2, new uhb(this, (Continuation) null)), ((osa) gaf).b()), this.a);
        ukb.c(this.a);
    }

    public final void i() {
        this.c.a();
    }

    public final void j(long j, ckb ckb) {
        xme xme = this.w;
        Set mutableSet = CollectionsKt.toMutableSet((Iterable) xme.getValue());
        boolean remove = mutableSet.remove(Long.valueOf(j));
        ukb ukb = this.c;
        if (!remove) {
            mutableSet.add(Long.valueOf(j));
            if (ckb != null) {
                ukb.b(new dkb(j, ckb));
            } else {
                ukb.getClass();
            }
        } else {
            ukb.d(j);
        }
        xme.getClass();
        xme.m((Object) null, mutableSet);
    }
}
