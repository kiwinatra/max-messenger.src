package defpackage;

import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;

/* renamed from: jl2  reason: default package */
public final class jl2 extends xag {
    public final Lazy b;
    public final Lazy c;
    public final xme o;
    public final etc v;

    public jl2() {
        rfa rfa = rfa.a;
        Lazy h = rfa.getAccessor().h(fq.class);
        this.b = rfa.getAccessor().h(rl.class);
        this.c = h;
        xme a = f6e.a(CollectionsKt.emptyList());
        this.o = a;
        this.v = new etc(a);
        a.setValue(j());
    }

    public final List j() {
        List createListBuilder = CollectionsKt.createListBuilder();
        boolean z = false;
        boolean z2 = ((pid) k()).n() != 1;
        boolean z3 = ((pid) k()).n() == 0;
        if (((pid) k()).n() == 2) {
            z = true;
        }
        s1e s1e = r5;
        s1e s1e2 = new s1e((long) rwa.a, 0, new igf(swa.a), (h1e) null, (ngf) null, (Integer) null, new d1e(z2, true), (y0e) null, (ngf) null, 0, 952);
        createListBuilder.add(s1e);
        if (z2) {
            createListBuilder.add(new s1e((long) rwa.f, 1, new igf(swa.e), (h1e) null, (ngf) null, (Integer) null, new c1e(z3, true), (y0e) null, (ngf) null, 0, 952));
            createListBuilder.add(new s1e((long) rwa.g, 1, new igf(swa.f), (h1e) null, (ngf) null, (Integer) null, new c1e(z, true), (y0e) null, (ngf) null, 0, 952));
        }
        return CollectionsKt.build(createListBuilder);
    }

    public final fq k() {
        return (fq) this.c.getValue();
    }

    public final void l(long j) {
        if (j == ((long) rwa.a)) {
            int i = 1;
            if (((pid) k()).n() == 1) {
                i = ((pid) k()).g.getInt("app.notification.chats.show.last", 0);
            }
            m(i);
        } else if (j == ((long) rwa.f)) {
            m(0);
        } else if (j == ((long) rwa.g)) {
            m(2);
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [l0g, java.lang.Object] */
    public final void m(int i) {
        String t = pid.t(i);
        ((pid) k()).s(i);
        ? obj = new Object();
        obj.d = t;
        ((rl) this.b.getValue()).a(new n0g(obj));
        this.o.setValue(j());
    }
}
