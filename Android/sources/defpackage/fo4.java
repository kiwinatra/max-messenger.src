package defpackage;

import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.reflect.KProperty;

/* renamed from: fo4  reason: default package */
public final class fo4 extends xag {
    public static final /* synthetic */ KProperty[] y = {rae.s(fo4.class, "changeDialogNotificationsJob", "getChangeDialogNotificationsJob()Lkotlinx/coroutines/Job;", 0)};
    public final Lazy b;
    public final Lazy c;
    public final Lazy o;
    public final xme v;
    public final etc w;
    public final wie x = o5a.U();

    public fo4() {
        rfa rfa = rfa.a;
        Lazy h = rfa.getAccessor().h(fq.class);
        Lazy h2 = rfa.getAccessor().h(rl.class);
        Lazy h3 = rfa.getAccessor().h(gaf.class);
        this.b = h2;
        this.c = h;
        this.o = h3;
        xme a = f6e.a(CollectionsKt.emptyList());
        this.v = a;
        this.w = new etc(a);
        a.setValue(j());
    }

    public final List j() {
        List createListBuilder = CollectionsKt.createListBuilder();
        s1e s1e = r3;
        s1e s1e2 = new s1e((long) rwa.h, 0, new igf(swa.g), (h1e) null, (ngf) null, (Integer) null, new d1e(((pid) ((fq) this.c.getValue())).o() != 1, true), (y0e) null, (ngf) null, 0, 952);
        createListBuilder.add(s1e);
        return CollectionsKt.build(createListBuilder);
    }

    public final void k(long j) {
        if (j == ((long) rwa.h)) {
            aje u = ev0.u(this.a, ((osa) ((gaf) this.o.getValue())).b(), f14.b, new eo4(this, (Continuation) null));
            this.x.setValue(this, y[0], u);
        }
    }
}
