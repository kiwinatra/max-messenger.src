package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: opa  reason: default package */
public final class opa {
    public final jx3 a;
    public final x23 b;
    public final bud c;
    public final vpa d;
    public final dp1 e;
    public final Lazy f = LazyKt.lazy(LazyThreadSafetyMode.NONE, gy3.X);

    public opa(q4 q4Var) {
        this.a = e14.a(((osa) ((gaf) q4Var.g(gaf.class))).c());
        this.b = (x23) q4Var.g(x23.class);
        this.c = (bud) q4Var.g(bud.class);
        this.d = (vpa) q4Var.g(vpa.class);
        this.e = (dp1) q4Var.g(dp1.class);
    }

    public final boolean a() {
        akd akd = (akd) this.c;
        akd.getClass();
        if (((int) akd.r(zjd.a, (long) 0)) != 1) {
            return false;
        }
        String string = ((a33) this.b).g.getString("version.force.update.received", "");
        this.d.getClass();
        return Intrinsics.areEqual((Object) string, (Object) "25.6.4");
    }

    public final void b() {
        ((mp1) this.e).u((nw6) null);
        ev0.v(this.a, (CoroutineContext) null, (f14) null, new npa(this, (Continuation) null), 3);
    }
}
