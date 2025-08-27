package defpackage;

import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.reflect.KProperty;

/* renamed from: c50  reason: default package */
public final class c50 implements yz7 {
    public static final /* synthetic */ KProperty[] i = {rae.s(c50.class, "updatePlayer", "getUpdatePlayer()Lkotlinx/coroutines/Job;", 0)};
    public final Lazy a;
    public final Lazy b;
    public final jx3 c;
    public final wie d = o5a.U();
    public final rt6 e = new rt6(4, (Object) this);
    public volatile Long f;
    public final xme g;
    public final ps5 h;

    public c50(Lazy lazy, Lazy lazy2) {
        this.a = lazy2;
        this.b = lazy;
        this.c = e14.a(((osa) ((gaf) lazy.getValue())).c().t0().plus(kv0.b()));
        xme a2 = f6e.a(new xz7((Float) null, false));
        this.g = a2;
        this.h = new ps5(a2, new a50(lazy2, this, (Continuation) null));
    }

    public static final void a(c50 c50) {
        aje v = ev0.v(c50.c, (CoroutineContext) null, f14.b, new b50(c50, (Continuation) null), 1);
        c50.d.setValue(c50, i[0], v);
    }

    public final dy9 b() {
        return (dy9) this.a.getValue();
    }
}
