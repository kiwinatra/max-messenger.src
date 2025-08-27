package defpackage;

import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.reflect.KProperty;

/* renamed from: d4e  reason: default package */
public final class d4e extends xag implements hg3 {
    public static final /* synthetic */ KProperty[] w = {rae.s(d4e.class, "codeJob", "getCodeJob()Lkotlinx/coroutines/Job;", 0)};
    public final Lazy b;
    public final Lazy c;
    public final wie o = o5a.U();
    public final s85 v = new s85(0);

    public d4e() {
        e3e e3e = e3e.a;
        Lazy c2 = e3e.c();
        Lazy h = e3e.getAccessor().h(m95.class);
        this.b = c2;
        this.c = h;
    }

    public final void c(String str) {
        aje u = ev0.u(this.a, ((osa) ((gaf) this.b.getValue())).a().plus(new n95((m95) this.c.getValue())), f14.b, new c4e(str, this, (Continuation) null));
        this.o.setValue(this, w[0], u);
    }
}
