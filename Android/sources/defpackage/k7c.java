package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.reflect.KProperty;

/* renamed from: k7c  reason: default package */
public final class k7c extends xag {
    public static final /* synthetic */ KProperty[] M0;
    public final Lazy A0;
    public final Lazy B0;
    public final xme C0;
    public final etc D0;
    public final xme E0;
    public final etc F0;
    public final xme G0;
    public final etc H0;
    public final gwb I0;
    public final AtomicReference J0;
    public final Context K0;
    public boolean L0;
    public final Lazy X;
    public final Lazy Y;
    public final Lazy Z;
    public final txb b;
    public final Lazy c;
    public final Lazy o;
    public final Lazy v;
    public final Lazy v0;
    public final Lazy w;
    public final s85 w0 = new s85(0);
    public final Lazy x;
    public final s85 x0 = new s85(0);
    public final Lazy y;
    public final wie y0 = o5a.U();
    public final r1c z;
    public final wie z0 = o5a.U();

    static {
        Class<k7c> cls = k7c.class;
        M0 = new KProperty[]{rae.s(cls, "leaveChatJob", "getLeaveChatJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "attacheClickJob", "getAttacheClickJob()Lkotlinx/coroutines/Job;", 0)};
    }

    public k7c(long j, txb txb, boolean z2) {
        gwb gwb;
        this.b = txb;
        String name = k7c.class.getName();
        jxb jxb = jxb.a;
        Lazy e = jxb.e();
        this.c = e;
        this.o = jxb.c();
        this.v = jxb.getAccessor().h(e1d.class);
        this.w = jxb.getAccessor().h(jqg.class);
        this.x = jxb.f();
        this.y = jxb.getAccessor().h(c7d.class);
        r1c r1c = (r1c) jxb.getAccessor().g(r1c.class);
        this.z = r1c;
        this.X = jxb.getAccessor().h(edb.class);
        this.Y = jxb.d();
        this.Z = jxb.getAccessor().h(bud.class);
        this.v0 = jxb.getAccessor().h(po5.class);
        mxb mxb = new mxb(11);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.A0 = LazyKt.lazy(lazyThreadSafetyMode, mxb);
        this.B0 = LazyKt.lazy(lazyThreadSafetyMode, new mxb(12));
        xme a = f6e.a(CollectionsKt.emptyList());
        this.C0 = a;
        this.D0 = new etc(a);
        xme a2 = f6e.a(CollectionsKt.emptyList());
        this.E0 = a2;
        this.F0 = new etc(a2);
        xme a3 = f6e.a((Object) null);
        this.G0 = a3;
        this.H0 = new etc(a3);
        this.J0 = new AtomicReference();
        this.K0 = (Context) jxb.getAccessor().g(Context.class);
        z68.c(name, "inited by " + txb + ":#" + j, new Object[0]);
        int ordinal = txb.ordinal();
        if (ordinal == 0) {
            a32 a32 = (a32) ((my2) m()).o(j).a.getValue();
            vk3 m = a32 != null ? a32.m() : null;
            if (a32 == null || !a32.J()) {
                gwb = (a32 == null || !a32.N() || m == null) ? new em2(j, this.a) : new vr3(m.r(), this.a, z2);
            } else if (m != null) {
                gwb = new yq0(m.r(), this.a);
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else if (ordinal == 1) {
            gwb = new gwb(j);
        } else if (ordinal == 2) {
            vk3 vk3 = (vk3) ((eu3) e.getValue()).c(j).a.getValue();
            gwb = (vk3 == null || !vk3.x()) ? new vr3(j, this.a, z2) : new yq0(j, this.a);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.I0 = gwb;
        bs0.K(bs0.F(new ps5(new on2(gwb.e, 28), new s6c(this, (Continuation) null), 5), ((osa) n()).a()), this.a);
        bs0.K(new ps5(new dtc(r1c.b), new t6c(this, (Continuation) null), 5), this.a);
    }

    public final void i() {
        this.I0.d();
        r1c r1c = this.z;
        r1c.a.f(r1c);
        KProperty[] kPropertyArr = M0;
        KProperty kProperty = kPropertyArr[0];
        wie wie = this.y0;
        pm7 pm7 = (pm7) wie.getValue(this, kProperty);
        if (pm7 != null) {
            pm7.b((CancellationException) null);
        }
        wie.setValue(this, kPropertyArr[0], (Object) null);
        KProperty kProperty2 = kPropertyArr[1];
        wie wie2 = this.z0;
        pm7 pm72 = (pm7) wie2.getValue(this, kProperty2);
        if (pm72 != null) {
            pm72.b((CancellationException) null);
        }
        wie2.setValue(this, kPropertyArr[1], (Object) null);
    }

    public final void j() {
        Long i = this.I0.i();
        if (i != null) {
            xag.h(this.w0, new b6c(new igf(lxa.B0), new cu3(this, i.longValue(), 1)));
        }
    }

    public final String k() {
        String h = this.I0.h();
        if (h == null) {
            return "";
        }
        if (b59.C()) {
            xag.h(this.w0, new g6c(new igf(lxa.o1), Integer.valueOf(cad.w)));
        }
        return h;
    }

    public final void l() {
        Long i;
        if (!this.L0 && (i = this.I0.i()) != null) {
            long longValue = i.longValue();
            this.L0 = true;
            CoroutineContext plus = ((osa) n()).b().plus(caa.a);
            f14 f14 = f14.a;
            y6c y6c = new y6c(this, longValue, (Continuation) null);
            ev0.u(this.a, plus, f14.c, y6c);
        }
    }

    public final qx2 m() {
        return (qx2) this.o.getValue();
    }

    public final gaf n() {
        return (gaf) this.x.getValue();
    }

    public final void o(boolean z2) {
        gwb gwb = this.I0;
        txb l = gwb.l();
        if (l != null) {
            long m = gwb.m();
            if (l == txb.LOCAL_CHAT) {
                Long j = gwb.j();
                if (j != null) {
                    m = j.longValue();
                    l = txb.SERVER_CHAT;
                } else {
                    return;
                }
            }
            xag.h(this.x0, new a5c(m, l, z2));
        }
    }

    public final void q() {
        if (!((edb) this.X.getValue()).b(edb.l)) {
            xag.h(this.w0, z5c.a);
            return;
        }
        ev0.v(this.a, ((osa) n()).b(), (f14) null, new g7c(this, (Continuation) null), 2);
    }

    public final void r() {
        this.J0.set((Object) null);
        xag.h(this.w0, new g6c(new igf(lxa.Y), Integer.valueOf(cad.K)));
    }

    public final void t() {
        xag.h(this.w0, new b6c(new igf(lxa.p0), new r6c(this, 0)));
    }

    public final void u() {
        c6c c6c;
        c6c c6c2;
        owb owb = (owb) this.G0.getValue();
        Object obj = owb != null ? owb.e : null;
        if (obj == null) {
            obj = "";
        }
        qr2 k = this.I0.k();
        if (k != null) {
            swb swb = (swb) this.B0.getValue();
            swb.getClass();
            int ordinal = k.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    igf igf = new igf(lxa.M0);
                    igf igf2 = new igf(lxa.N0);
                    List createListBuilder = CollectionsKt.createListBuilder();
                    createListBuilder.add(new pg3(jxa.B, new igf(lxa.L0), og3.a));
                    createListBuilder.add(swb.b());
                    Unit unit = Unit.INSTANCE;
                    c6c2 = new c6c(igf, igf2, CollectionsKt.build(createListBuilder), (Bundle) null);
                } else if (ordinal == 2) {
                    igf igf3 = new igf(lxa.K0);
                    igf igf4 = new igf(lxa.J0);
                    List createListBuilder2 = CollectionsKt.createListBuilder();
                    int i = jxa.r;
                    igf igf5 = new igf(lxa.i0);
                    og3 og3 = og3.a;
                    createListBuilder2.add(new pg3(i, igf5, og3));
                    createListBuilder2.add(new pg3(jxa.A, new igf(lxa.I0), og3));
                    createListBuilder2.add(swb.b());
                    Unit unit2 = Unit.INSTANCE;
                    c6c2 = new c6c(igf3, igf4, CollectionsKt.build(createListBuilder2), (Bundle) null);
                } else if (ordinal == 3) {
                    c6c = swb.c();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                c6c = c6c2;
            } else {
                kgf kgf = new kgf(lxa.O0, ArraysKt.toList((T[]) new Object[]{obj}));
                List createListBuilder3 = CollectionsKt.createListBuilder();
                int i2 = jxa.r;
                igf igf6 = new igf(lxa.i0);
                og3 og32 = og3.a;
                createListBuilder3.add(new pg3(i2, igf6, og32));
                createListBuilder3.add(new pg3(jxa.B, new igf(lxa.L0), og32));
                createListBuilder3.add(swb.b());
                Unit unit3 = Unit.INSTANCE;
                c6c = new c6c(kgf, (ngf) null, CollectionsKt.build(createListBuilder3), (Bundle) null);
            }
            xag.h(this.w0, c6c);
        }
    }

    public final void v(boolean z2) {
        xag.h(this.w0, new b6c(new igf(z2 ? lxa.n0 : lxa.q0), new om1(this, z2, 1)));
    }

    public final void w() {
        this.J0.set((Object) null);
        xag.h(this.w0, new g6c(new igf(lxa.Y), Integer.valueOf(cad.K)));
    }
}
