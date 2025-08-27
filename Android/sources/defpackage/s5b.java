package defpackage;

import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.reflect.KProperty;

/* renamed from: s5b  reason: default package */
public final class s5b extends xag {
    public static final /* synthetic */ KProperty[] y = {rae.s(s5b.class, "changePushNewUserJob", "getChangePushNewUserJob()Lkotlinx/coroutines/Job;", 0)};
    public final Lazy b;
    public final Lazy c;
    public final Lazy o;
    public final xme v;
    public final etc w;
    public final wie x = o5a.U();

    public s5b() {
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
        createListBuilder.add(new s1e((long) rwa.q, 0, new igf(swa.m), (h1e) null, (ngf) null, (Integer) null, new d1e(((hq) ((fq) this.c.getValue())).g.getBoolean("app.notification.show.new.users", true), true), (y0e) null, (ngf) null, 0, 952));
        return CollectionsKt.build(createListBuilder);
    }

    public final void k(long j) {
        if (j == ((long) rwa.q)) {
            aje u = ev0.u(this.a, ((osa) ((gaf) this.o.getValue())).b(), f14.b, new r5b(this, (Continuation) null));
            this.x.setValue(this, y[0], u);
        }
    }
}
