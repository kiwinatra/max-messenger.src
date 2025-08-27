package defpackage;

import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.reflect.KProperty;

/* renamed from: o75  reason: default package */
public final class o75 extends xag implements hg3 {
    public static final /* synthetic */ KProperty[] X = {rae.s(o75.class, "codeJob", "getCodeJob()Lkotlinx/coroutines/Job;", 0)};
    public final Lazy b;
    public final Lazy c;
    public final Lazy o;
    public final s85 v = new s85(0);
    public final s85 w = new s85(0);
    public final s85 x = new s85(0);
    public final wie y = o5a.U();
    public boolean z;

    public o75() {
        e3e e3e = e3e.a;
        Lazy h = e3e.getAccessor().h(x23.class);
        Lazy c2 = e3e.c();
        Lazy h2 = e3e.getAccessor().h(m95.class);
        this.b = h;
        this.c = c2;
        this.o = h2;
    }

    public final void c(String str) {
        aje u = ev0.u(this.a, ((osa) ((gaf) this.c.getValue())).a().plus(new n95((m95) this.o.getValue())), f14.b, new n75(this, str, (Continuation) null));
        this.y.setValue(this, X[0], u);
    }
}
