package defpackage;

import android.graphics.RectF;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.reflect.KProperty;

/* renamed from: wyd  reason: default package */
public final class wyd extends xag {
    public static final /* synthetic */ KProperty[] E0 = {rae.s(wyd.class, "sectionItemsJob", "getSectionItemsJob()Lkotlinx/coroutines/Job;", 0)};
    public final etc A0;
    public final AtomicReference B0;
    public final AtomicLong C0;
    public final wie D0;
    public final Lazy X;
    public final Lazy Y;
    public final ni3 Z;
    public final vpa b;
    public final qq6 c;
    public final Lazy o;
    public final Lazy v;
    public final s85 v0 = new s85(0);
    public final Lazy w;
    public final s85 w0 = new s85(0);
    public final Lazy x;
    public final xme x0;
    public final Lazy y;
    public final etc y0;
    public final Lazy z;
    public final xme z0;

    /* JADX WARNING: type inference failed for: r4v1, types: [ni3, java.lang.Object] */
    public wyd(Lazy lazy, Lazy lazy2, vpa vpa, qq6 qq6, u1c u1c, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6, Lazy lazy7, eu3 eu3, Lazy lazy8) {
        Lazy h = v1e.a.getAccessor().h(bud.class);
        this.b = vpa;
        this.c = qq6;
        this.o = lazy;
        this.v = lazy2;
        this.w = lazy3;
        this.x = lazy4;
        this.y = lazy6;
        this.z = lazy5;
        this.X = lazy7;
        this.Y = lazy8;
        ? obj = new Object();
        red red = new red(16);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        obj.b = LazyKt.lazy(lazyThreadSafetyMode, red);
        obj.c = LazyKt.lazy(lazyThreadSafetyMode, new red(17));
        obj.d = LazyKt.lazy(lazyThreadSafetyMode, new red(18));
        obj.a = LazyKt.lazy(lazyThreadSafetyMode, new a2d(2, h));
        obj.e = LazyKt.lazy(lazyThreadSafetyMode, new red(19));
        obj.f = LazyKt.lazy(lazyThreadSafetyMode, new red(20));
        this.Z = obj;
        xme a = f6e.a(z3e.h);
        this.x0 = a;
        this.y0 = new etc(a);
        xme a2 = f6e.a(CollectionsKt.emptyList());
        this.z0 = a2;
        this.A0 = new etc(a2);
        this.B0 = new AtomicReference();
        this.C0 = new AtomicLong();
        this.D0 = o5a.U();
        j();
        ev0.v(this.a, ((osa) ((gaf) lazy3.getValue())).a(), (f14) null, new myd(lazy, eu3, this, (Continuation) null), 2);
        bs0.K(new ps5(new dtc(u1c.a), new nyd(this, (Continuation) null), 5), this.a);
    }

    public final void j() {
        aje u = ev0.u(this.a, ((osa) k()).a(), f14.b, new qyd(this, (Continuation) null));
        this.D0.setValue(this, E0[0], u);
    }

    public final gaf k() {
        return (gaf) this.w.getValue();
    }

    public final jtb l() {
        return (jtb) this.o.getValue();
    }

    public final Long m() {
        long j = ((z3e) this.y0.a.getValue()).a;
        Long valueOf = Long.valueOf(j);
        if (j != -1) {
            return valueOf;
        }
        return null;
    }

    public final void n(String str, RectF rectF) {
        ev0.v(this.a, ((osa) k()).b(), (f14) null, new syd(rectF, this, str, (Continuation) null), 2);
    }

    public final void o() {
        if (!((edb) this.x.getValue()).b(edb.l)) {
            xag.h(this.v0, t2e.b);
            return;
        }
        ev0.v(this.a, ((osa) k()).b(), (f14) null, new vyd(this, (Continuation) null), 2);
    }

    public final void q() {
        this.B0.set((Object) null);
        xag.h(this.v0, new z2e(new igf(xza.n), Integer.valueOf(cad.K)));
    }

    public final void r() {
        this.B0.set((Object) null);
        xag.h(this.v0, new z2e(new igf(xza.p), Integer.valueOf(cad.K)));
    }
}
