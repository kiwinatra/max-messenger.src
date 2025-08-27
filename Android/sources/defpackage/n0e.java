package defpackage;

import kotlin.Lazy;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.reflect.KProperty;

/* renamed from: n0e  reason: default package */
public final class n0e extends xag implements u65 {
    public static final /* synthetic */ KProperty[] x0 = {rae.s(n0e.class, "openProfileJob", "getOpenProfileJob()Lkotlinx/coroutines/Job;", 0)};
    public final etc X;
    public Long Y;
    public int Z;
    public final jp0 b;
    public final Lazy c;
    public final Lazy o;
    public final Lazy v;
    public final wie v0 = o5a.U();
    public final Lazy w;
    public final s85 w0 = new s85(0);
    public final Lazy x;
    public final Lazy y;
    public final xme z;

    public n0e(jp0 jp0) {
        e3e e3e = e3e.a;
        Lazy h = e3e.getAccessor().h(rl.class);
        Lazy h2 = e3e.getAccessor().h(eu3.class);
        Lazy h3 = e3e.getAccessor().h(qx2.class);
        Lazy h4 = e3e.getAccessor().h(ns3.class);
        Lazy h5 = e3e.getAccessor().h(rs3.class);
        Lazy c2 = e3e.c();
        this.b = jp0;
        this.c = h;
        this.o = h2;
        this.v = h3;
        this.w = h4;
        this.x = h5;
        this.y = c2;
        xme a = f6e.a(MapsKt.emptyMap());
        this.z = a;
        this.X = new etc(a);
        bs0.K(new ps5(new dtc(jp0.b), new i0e(this, h2, (Continuation) null), 5), this.a);
        xag.g(this, (CoroutineContext) null, (f14) null, new j0e(this, (Continuation) null), 3);
    }

    public final boolean B() {
        return false;
    }

    public final boolean E1() {
        return this.Z < Integer.MAX_VALUE;
    }

    public final void i() {
        jp0 jp0 = this.b;
        ((sv0) jp0.a.getValue()).f(jp0);
    }

    public final void j(int i) {
        if (this.Y == null) {
            jna jna = (jna) ((rl) this.c.getValue());
            this.Y = Long.valueOf(jna.z(jna, new so3(((ltb) jna.D()).a.n(), i)));
        }
    }

    public final void u1() {
        j(this.Z);
    }
}
