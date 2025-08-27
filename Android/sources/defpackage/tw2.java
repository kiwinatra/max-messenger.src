package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: tw2  reason: default package */
public final class tw2 extends xag {
    public static final /* synthetic */ KProperty[] T0 = {rae.s(tw2.class, "unblockContactJob", "getUnblockContactJob()Lkotlinx/coroutines/Job;", 0)};
    public final Lazy A0;
    public final Lazy B0;
    public final Lazy C0;
    public final xme D0;
    public final etc E0;
    public final xme F0;
    public final xme G0;
    public final etc H0;
    public final xme I0;
    public final etc J0;
    public final s85 K0;
    public final s85 L0;
    public volatile va8 M0;
    public final iz9 N0;
    public final xme O0;
    public final wie P0;
    public final n6e Q0;
    public final bs5 R0;
    public aje S0;
    public final Lazy X;
    public final Lazy Y;
    public final Lazy Z;
    public final cp3 b;
    public final String c;
    public final lf1 o;
    public final dt2 v;
    public final Lazy v0;
    public final gaf w;
    public final Lazy w0;
    public final Lazy x;
    public final Lazy x0;
    public final Lazy y;
    public final Lazy y0;
    public final Lazy z;
    public final Lazy z0;

    /* JADX WARNING: type inference failed for: r1v25, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    public tw2(cp3 cp3, String str, lf1 lf1) {
        Lazy lazy;
        Object obj;
        jf7 jf7;
        String str2 = str;
        cs2 cs2 = cs2.a;
        wt2 a = ((xs2) cs2.getAccessor().g(xs2.class)).a(str2);
        gaf e = cs2.e();
        Lazy h = cs2.getAccessor().h(f32.class);
        Lazy h2 = cs2.getAccessor().h(e1d.class);
        Lazy h3 = cs2.getAccessor().h(qx2.class);
        Lazy h4 = cs2.getAccessor().h(r62.class);
        Lazy h5 = cs2.getAccessor().h(hl3.class);
        Lazy h6 = cs2.getAccessor().h(rs3.class);
        Lazy h7 = cs2.getAccessor().h(x23.class);
        Lazy h8 = cs2.getAccessor().h(bud.class);
        Lazy h9 = cs2.getAccessor().h(ysc.class);
        tt7 tt7 = (tt7) cs2.getAccessor().g(tt7.class);
        kf7 kf7 = (kf7) cs2.getAccessor().g(kf7.class);
        kf7.getClass();
        if (Intrinsics.areEqual((Object) str2, (Object) "all.chat.folder")) {
            obj = "all.chat.folder";
            lazy = h9;
            jf7 = new er7(2, (Object) (uua) kf7.a.g(uua.class));
        } else {
            lazy = h9;
            obj = "all.chat.folder";
            jf7 = jf7.P;
        }
        Lazy h10 = cs2.getAccessor().h(u82.class);
        Lazy h11 = cs2.getAccessor().h(is9.class);
        Lazy h12 = cs2.getAccessor().h(xt2.class);
        Lazy h13 = cs2.getAccessor().h(by7.class);
        Lazy h14 = cs2.getAccessor().h(h4f.class);
        Lazy h15 = cs2.getAccessor().h(jqg.class);
        this.b = cp3;
        this.c = str2;
        this.o = lf1;
        this.v = a;
        this.w = e;
        this.x = h2;
        this.y = h7;
        this.z = h8;
        this.X = h3;
        this.Y = h4;
        this.Z = h5;
        this.v0 = h6;
        this.w0 = h;
        this.x0 = lazy;
        this.y0 = h10;
        this.z0 = h11;
        this.A0 = h13;
        this.B0 = h14;
        this.C0 = h15;
        xme a2 = f6e.a(jf7.r());
        this.D0 = a2;
        this.E0 = new etc(a2);
        xme a3 = f6e.a(CollectionsKt.emptyList());
        this.F0 = a3;
        xme a4 = f6e.a(a3.getValue());
        this.G0 = a4;
        this.H0 = new etc(a4);
        xme a5 = f6e.a(Boolean.FALSE);
        this.I0 = a5;
        this.J0 = new etc(a5);
        this.K0 = new s85(0);
        this.L0 = new s85(0);
        this.M0 = xa8.a;
        iz9 iz9 = ua8.a;
        this.N0 = new iz9();
        this.O0 = f6e.a(0L);
        this.P0 = o5a.U();
        this.Q0 = m5a.a(20, 20, cu0.b);
        if (Intrinsics.areEqual((Object) str2, obj)) {
            ir9 ir9 = (ir9) ((xt2) h12.getValue());
            pm7 pm7 = ir9.h;
            if (pm7 != null) {
                pm7.b((CancellationException) null);
            }
            ql8 ql8 = new ql8(new eu5(a.w0, 0), 9);
            Duration.Companion companion = Duration.Companion;
            of3 of3 = n79.e;
            bs5 wbVar = new wb(15, bs0.F(new ps5(bs0.F(new er9(new wq4(new er9(gt5.d(ql8, DurationKt.toDuration(3, DurationUnit.SECONDS)), ir9, 0), (Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(new r6(14, ir9), 2)), ir9, 1), ir9.e), new gr9(ir9, (Continuation) null), 5), ir9.d), new yp2(3, (Continuation) null, 2));
            ir9.h = bs0.K((nw1) (!(wbVar instanceof nw1) ? new pw1(wbVar) : wbVar), ir9.f);
        }
        bs0.K(bs0.F(new ps5(new aw2(new i21(a.w0, tt7.d, new x2(this, (Continuation) null, 6), 4), this, 0), new zw(a2, 11), 5), ((osa) e).a()), this.a);
        akd akd = (akd) ((bud) h8.getValue());
        akd.getClass();
        if (akd.m(PmsKey.f38fakechats, false)) {
            String f = ((a33) ((x23) h7.getValue())).f("user.Phone", (String) null);
            StringBuilder sb = new StringBuilder();
            int length = f.length();
            for (int i = 0; i < length; i++) {
                char charAt = f.charAt(i);
                if (Character.isDigit(charAt)) {
                    sb.append(charAt);
                }
            }
            ps5 ps5 = new ps5(bs0.L(new va1(1, new i21(this.b.c(), new ps5(new aw2(new aw2(this.O0, this, 1), this, 2), new SuspendLambda(2, (Continuation<Object>) null)), new gw2(3, (Continuation) null, 0), 4), new ew2(new cx4(14), 0), this, StringsKt.toLongOrNull(sb.toString())), new iw2(this, (Continuation) null)), new jw2(this, (Continuation) null));
            osa osa = (osa) this.w;
            bs5 F = bs0.F(ps5, osa.a());
            jx3 jx3 = this.a;
            bs0.K(F, jx3);
            bs0.K(bs0.F(new ps5(this.E0, new kw2(this, (Continuation) null), 5), osa.a()), jx3);
        }
        ev0.v(this.a, ((osa) this.w).a(), (f14) null, new qv2(this, (Continuation) null), 2);
        on2 on2 = new on2(bs0.w(this.Q0), 7);
        Duration.Companion companion2 = Duration.Companion;
        bs0.K(bs0.F(new wb(15, new ps5(new on2(new aw2(new g12(new ls5(DurationKt.toDuration(5, DurationUnit.SECONDS), on2, (Continuation) null), EmptyCoroutineContext.INSTANCE, -2, cu0.a, 0), this, 4), 8), new qw2(this, (Continuation) null), 5), new yp2(3, (Continuation) null, 1)), ((osa) this.w).b().s0(1, "missed")), this.a);
        this.R0 = bs0.F(new on2(bs0.w(new aw2(new i21(this.D0, ((ia2) ((u82) this.y0.getValue())).j(), new sa(3, (Continuation) null, 5), 4), this, 3)), 6), ((osa) this.w).a());
    }

    public static final boolean j(tw2 tw2, ss2 ss2) {
        tw2.getClass();
        return ss2.a.size() <= 10 && !ss2.b;
    }

    public static final qx2 k(tw2 tw2) {
        return (qx2) tw2.X.getValue();
    }

    public static final Unit l(tw2 tw2, long j, long j2) {
        tw2.m().Y(j, Duration.m1371getInWholeMillisecondsimpl(j2) + ((qjd) ((x23) tw2.y.getValue())).m());
        return Unit.INSTANCE;
    }

    public final r62 m() {
        return (r62) this.Y.getValue();
    }

    public final void n() {
        xme xme = this.O0;
        xme.m((Object) null, Long.valueOf(((Number) xme.getValue()).longValue() + 1));
    }
}
