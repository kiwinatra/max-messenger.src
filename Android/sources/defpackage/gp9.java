package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: gp9  reason: default package */
public final class gp9 extends xag {
    public final fq b;
    public final xme c;
    public final etc o;
    public final s85 v = new s85(0);

    public gp9(fq fqVar) {
        this.b = fqVar;
        xme a = f6e.a(CollectionsKt.emptyList());
        this.c = a;
        this.o = new etc(a);
        j();
    }

    public final void j() {
        List createListBuilder = CollectionsKt.createListBuilder();
        createListBuilder.add(new s1e(LongCompanionObject.MAX_VALUE, 0, new igf(lwa.a), (h1e) null, (ngf) null, (Integer) null, new d1e(((hq) this.b).g.getBoolean("app.messages.send.by.enter", false), true), (y0e) null, (ngf) null, 0, 952));
        createListBuilder.add(new s1e(9223372036854775806L, 0, new igf(lwa.b), (h1e) null, (ngf) null, (Integer) null, a1e.a, (y0e) null, (ngf) null, 0, 952));
        List build = CollectionsKt.build(createListBuilder);
        this.c.setValue(build);
        String name = gp9.class.getName();
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, name, wj6.h(build.size(), "process sections. finish, size:"), (Throwable) null);
        }
    }
}
