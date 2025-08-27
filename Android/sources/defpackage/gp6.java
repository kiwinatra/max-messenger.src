package defpackage;

import android.content.Context;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: gp6  reason: default package */
public final class gp6 extends xag {
    public static final /* synthetic */ int P0 = 0;
    public final etc A0;
    public final ru0 B0;
    public final y02 C0;
    public final sqd D0;
    public boolean E0;
    public pm7 F0;
    public aje G0;
    public final Lazy H0;
    public final fn6 I0;
    public aje J0;
    public final gn6 K0;
    public final go6 L0;
    public final xme M0;
    public final Lazy N0;
    public final s85 O0;
    public final xme X = f6e.a(CollectionsKt.emptyList());
    public final xme Y;
    public final xme Z;
    public final ql6 b;
    public final Context c;
    public final s04 o;
    public final s48 v;
    public final xn6 v0;
    public final om6 w;
    public xm6 w0;
    public final Lazy x;
    public final xme x0;
    public final Lazy y;
    public final xme y0;
    public final Lazy z;
    public final xme z0;

    public gp6(ql6 ql6, Context context, n95 n95, h48 h48, s48 s48, Lazy lazy, Lazy lazy2, om6 om6) {
        Lazy lazy3 = rjd.P;
        Lazy lazy4 = rjd.N;
        this.b = ql6;
        this.c = context;
        this.o = n95;
        this.v = s48;
        this.w = om6;
        this.x = lazy4;
        this.y = lazy;
        this.z = lazy2;
        Boolean bool = Boolean.FALSE;
        this.Y = f6e.a(bool);
        xme a = f6e.a(CollectionsKt.emptyList());
        this.Z = a;
        this.v0 = new xn6(a, this, 2);
        this.w0 = fqc.a(context);
        xme a2 = f6e.a(bool);
        this.x0 = a2;
        this.y0 = a2;
        xme a3 = f6e.a((Object) null);
        this.z0 = a3;
        this.A0 = new etc(a3);
        ru0 a4 = o54.a(-2, 6, (cu0) null);
        this.B0 = a4;
        this.C0 = bs0.Q(a4);
        sqd sqd = h48.f;
        this.D0 = sqd;
        this.H0 = lazy3;
        fn6 fn6 = new fn6(0, this);
        this.I0 = fn6;
        gn6 gn6 = new gn6(0, this);
        this.K0 = gn6;
        go6 go6 = new go6(1, this);
        this.L0 = go6;
        this.M0 = f6e.a((Object) null);
        Lazy lazy5 = LazyKt.lazy(new u75(18, this));
        this.N0 = lazy5;
        s85 s85 = new s85(0);
        this.O0 = s85;
        yd7 yd7 = (yd7) s48;
        pm7 pm7 = yd7.w0;
        if (pm7 == null || !pm7.e0()) {
            yd7.g();
        }
        z68.c("gp6", "init", new Object[0]);
        bs5 F = bs0.F(new ps5(new xn6(ql6.b ? yd7.x : yd7.X, this, 0), new zn6(this, (Continuation) null), 5), ((osa) l()).e());
        jx3 jx3 = this.a;
        bs0.K(F, e14.g(jx3, n95));
        bs0.K(bs0.F(new ps5(new xn6(yd7.Z, this, 1), new ao6(this, (Continuation) null), 5), ((osa) l()).a()), e14.g(jx3, n95));
        if (ql6.c) {
            sqd.c.add(gn6);
            sqd.e.add(go6);
            sqd.f.add(fn6);
            sqd.l.add((hn6) lazy5.getValue());
        }
        Duration.Companion companion = Duration.Companion;
        bs0.K(new ps5(vme.a(s85, DurationKt.toDuration(300, DurationUnit.MILLISECONDS)), new bo6(this, (Continuation) null), 5), e14.g(jx3, n95));
    }

    public static final Object j(gp6 gp6, List list, Continuation continuation) {
        return ev0.I(((osa) gp6.l()).e(), new cp6(gp6, list, (Continuation) null), continuation);
    }

    public static void k(gp6 gp6, boolean z2, int i) {
        boolean z3 = true;
        if ((i & 1) != 0) {
            z2 = false;
        }
        if ((i & 2) == 0) {
            z3 = false;
        }
        gp6.getClass();
        z68.c("gp6", "clearSelections()", new Object[0]);
        if (z3) {
            gp6.D0.a();
        }
        xag.g(gp6, ((osa) gp6.l()).e().plus(gp6.o), (f14) null, new pn6(gp6, z2, (Continuation) null), 2);
        List emptyList = CollectionsKt.emptyList();
        om6 om6 = gp6.w;
        om6.getClass();
        xag.h(om6.c, new im6(emptyList));
    }

    public final void i() {
        z68.c("gp6", "onCleared()", new Object[0]);
        sqd sqd = this.D0;
        sqd.e.remove(this.L0);
        sqd.f.remove(this.I0);
        sqd.c.remove(this.K0);
        sqd.l.remove((hn6) this.N0.getValue());
        ((yd7) this.v).c();
    }

    public final gaf l() {
        return (gaf) this.x.getValue();
    }

    public final int m(k48 k48) {
        return this.D0.h(cvg.M(k48));
    }

    public final int n(k48 k48, boolean z2) {
        z68.c("gp6", "onItemSelect: " + k48, new Object[0]);
        this.E0 = true;
        d48 M = cvg.M(k48);
        sqd sqd = this.D0;
        int h = sqd.h(M);
        if (h == 0 && ((Boolean) this.Y.getValue()).booleanValue()) {
            return 0;
        }
        akd akd = (akd) ((bud) this.z.getValue());
        akd.getClass();
        int r = (int) akd.r(PmsKey.f60maxattachcount, (long) 12);
        om6 om6 = this.w;
        if (!((Boolean) om6.b.invoke()).booleanValue() || h != 0 || sqd.c() < r) {
            if (z2) {
                sqd.u(M);
            }
            xag.g(this, ((osa) l()).e().plus(this.o), (f14) null, new fo6(this, (Continuation) null), 2);
            this.E0 = false;
            return sqd.h(cvg.M(k48));
        }
        xag.h(om6.c, new km6(r));
        return 0;
    }
}
