package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.time.Duration;

/* renamed from: ov2  reason: default package */
public final class ov2 extends xag implements vc8 {
    public static final /* synthetic */ KProperty[] O0 = {rae.s(ov2.class, "processSearchResultJob", "getProcessSearchResultJob()Lkotlinx/coroutines/Job;", 0)};
    public final Lazy A0;
    public final Lazy B0;
    public final xme C0;
    public final etc D0;
    public final xme E0;
    public final s85 F0 = new s85(0);
    public final s85 G0 = new s85(0);
    public final String H0 = ov2.class.getName();
    public final mv2 I0 = new mv2(this);
    public final q04 J0;
    public aje K0;
    public aje L0;
    public aje M0;
    public final wie N0;
    public final Lazy X;
    public final Lazy Y;
    public final Lazy Z;
    public final ruc b;
    public final st3 c;
    public final fd8 o;
    public final ny2 v;
    public final Lazy v0;
    public final dld w;
    public final Lazy w0;
    public final gaf x;
    public final Lazy x0;
    public final Lazy y;
    public final Lazy y0;
    public final Lazy z;
    public final Lazy z0;

    public ov2() {
        sjd sjd = sjd.a;
        fd8 fd8 = (fd8) sjd.getAccessor().g(fd8.class);
        cs2 cs2 = cs2.a;
        gaf y2 = sjd.y();
        Lazy lazy = rjd.k0;
        Lazy lazy2 = rjd.A0;
        Lazy lazy3 = rjd.c;
        Lazy lazy4 = rjd.f;
        Lazy lazy5 = rjd.d;
        Lazy h = sjd.getAccessor().h(x23.class);
        Lazy h2 = sjd.getAccessor().h(bud.class);
        Lazy lazy6 = rjd.z0;
        Lazy lazy7 = lazy;
        Lazy h3 = cs2.getAccessor().h(hl3.class);
        Lazy h4 = cs2.getAccessor().h(ns2.class);
        Lazy h5 = cs2.getAccessor().h(bo3.class);
        Lazy h6 = cs2.getAccessor().h(e24.class);
        this.b = (ruc) sjd.getAccessor().g(ruc.class);
        this.c = (st3) sjd.getAccessor().g(st3.class);
        this.o = fd8;
        this.v = (ny2) cs2.getAccessor().g(ny2.class);
        this.w = (dld) cs2.getAccessor().g(dld.class);
        this.x = y2;
        this.y = lazy2;
        this.z = h;
        this.X = h2;
        this.Y = lazy3;
        this.Z = lazy4;
        this.v0 = lazy5;
        this.w0 = lazy7;
        this.x0 = lazy6;
        this.y0 = h3;
        this.z0 = h4;
        this.A0 = h5;
        this.B0 = h6;
        xme a = f6e.a(vu2.f);
        this.C0 = a;
        this.D0 = new etc(a);
        xme a2 = f6e.a((Object) null);
        this.E0 = a2;
        this.J0 = ((osa) y2).b().s0(1, "ChatsListSearchViewModelDispatcher");
        this.N0 = o5a.U();
        fd8.h = this;
        l(true);
        bs0.K(new ps5(bs0.v(new eu5(a2, 0), 300), new wq0(2, this, ov2.class, "loadByQuery", "loadByQuery(Ljava/lang/String;)V", 4, 9), 5), this.a);
    }

    public static final Unit j(ov2 ov2, long j, long j2) {
        qx2 k = ov2.k();
        long m = ((qjd) ((x23) ov2.z.getValue())).m();
        ((my2) k).n().Y(j, Duration.m1371getInWholeMillisecondsimpl(j2) + m);
        return Unit.INSTANCE;
    }

    public final void f(String str, List list) {
        if (!Intrinsics.areEqual((Object) ((vu2) this.C0.getValue()).b, (Object) str)) {
            z68.i(this.H0, "chats search: query changed, skip content", (Throwable) null);
            return;
        }
        aje u = ev0.u(this.a, ((osa) this.x).a().plus(this.I0), f14.b, new iv2(this, str, list, (Continuation) null));
        this.N0.setValue(this, O0[0], u);
    }

    public final void i() {
        aje aje = this.K0;
        if (aje != null) {
            aje.b((CancellationException) null);
        }
        fd8 fd8 = this.o;
        fd8.d();
        aje aje2 = this.L0;
        if (aje2 != null) {
            aje2.b((CancellationException) null);
        }
        fd8.h = null;
    }

    public final qx2 k() {
        return (qx2) this.Y.getValue();
    }

    public final void l(boolean z2) {
        aje aje = this.K0;
        if (aje == null || !aje.isActive()) {
            this.o.d();
            this.E0.setValue((Object) null);
            aje aje2 = this.L0;
            if (aje2 != null) {
                aje2.b((CancellationException) null);
            }
            pm7 pm7 = (pm7) this.N0.getValue(this, O0[0]);
            if (pm7 != null) {
                pm7.b((CancellationException) null);
            }
            this.K0 = ev0.v(this.a, this.J0.plus(this.I0), (f14) null, new yu2(this, z2, (Continuation) null), 2);
        }
    }

    public final void m(long j) {
        pa4 pa4;
        a32 q = ((my2) k()).q(j);
        if (q != null) {
            pa4 = ox2.b.o1(q.a);
        } else {
            ox2.b.getClass();
            pa4 = new pa4(":profile?id=" + j + "&type=contact");
        }
        xag.h(this.F0, pa4);
    }
}
