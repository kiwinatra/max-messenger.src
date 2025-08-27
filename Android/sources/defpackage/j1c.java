package defpackage;

import android.app.Application;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.reflect.KProperty;

/* renamed from: j1c  reason: default package */
public final class j1c extends xag {
    public static final /* synthetic */ KProperty[] A0 = {rae.s(j1c.class, "submitChangesJob", "getSubmitChangesJob()Lkotlinx/coroutines/Job;", 0)};
    public final xme X;
    public final etc Y;
    public final xme Z;
    public final xz4 b;
    public final Lazy c;
    public final Lazy o;
    public final Lazy v;
    public final etc v0;
    public final Lazy w;
    public final s85 w0 = new s85(0);
    public final Lazy x;
    public final s85 x0 = new s85(0);
    public final Lazy y;
    public final wie y0 = o5a.U();
    public final Lazy z;
    public final AtomicReference z0 = new AtomicReference();

    public j1c(long j, gzb gzb) {
        xz4 xz4;
        bzb bzb = bzb.a;
        this.c = bzb.getAccessor().h(bud.class);
        this.o = bzb.e();
        Lazy lazy = LazyKt.lazy(new mxb(8));
        this.v = lazy;
        this.w = bzb.getAccessor().h(edb.class);
        this.x = bzb.getAccessor().h(po5.class);
        this.y = bzb.getAccessor().h(Application.class);
        this.z = bzb.d();
        xme a = f6e.a(CollectionsKt.emptyList());
        this.X = a;
        this.Y = new etc(a);
        xme a2 = f6e.a((Object) null);
        this.Z = a2;
        this.v0 = new etc(a2);
        int ordinal = gzb.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            xz4 = new m82(j, this.a);
        } else if (ordinal == 2) {
            xz4 = new pn3(j, this.a);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.b = xz4;
        bs0.K(bs0.F(new ps5(new on2(xz4.g, 28), new z0c(this, (Continuation) null), 5), ((osa) j()).a()), this.a);
        bs0.K(bs0.F(new ps5(xz4.e, new a1c(this, (Continuation) null), 5), ((osa) j()).c()), this.a);
        bs0.K(bs0.F(new ps5(xz4.f, new b1c(this, (Continuation) null), 5), ((osa) j()).c()), this.a);
        bs0.K(new ps5(new dtc(((szb) lazy.getValue()).a), new i1c(this, (Continuation) null), 5), this.a);
    }

    public final void i() {
        this.b.b();
    }

    public final gaf j() {
        return (gaf) this.o.getValue();
    }

    public final void k() {
        if (!((edb) this.w.getValue()).b(edb.l)) {
            xag.h(this.w0, wzb.b);
            return;
        }
        ev0.v(this.a, ((osa) j()).b(), (f14) null, new g1c(this, (Continuation) null), 2);
    }

    public final void l() {
        this.z0.set((Object) null);
        xag.h(this.w0, new h0c(new igf(ixa.j), Integer.valueOf(cad.K)));
    }

    public final void m() {
        this.z0.set((Object) null);
        xag.h(this.w0, new h0c(new igf(ixa.p), Integer.valueOf(cad.K)));
    }

    public final void n() {
        aje v2 = ev0.v(this.a, (CoroutineContext) null, (f14) null, new h1c(this, (Continuation) null), 3);
        this.y0.setValue(this, A0[0], v2);
    }
}
