package defpackage;

import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.reflect.KProperty;

/* renamed from: y3e  reason: default package */
public final class y3e extends xag {
    public static final /* synthetic */ KProperty[] I0;
    public Long A0;
    public Long B0;
    public wvd C0;
    public final ArrayList D0 = new ArrayList();
    public long E0;
    public final n6e F0;
    public final dtc G0;
    public final s85 H0;
    public final Lazy X;
    public final Lazy Y;
    public final xme Z;
    public final ozd b;
    public final abe c;
    public final gaf o;
    public final Lazy v;
    public final etc v0;
    public final Lazy w;
    public final wie w0 = o5a.U();
    public final Lazy x;
    public final wie x0 = o5a.U();
    public final Lazy y;
    public final wie y0 = o5a.U();
    public final Lazy z;
    public final wie z0 = o5a.U();

    static {
        Class<y3e> cls = y3e.class;
        I0 = new KProperty[]{rae.s(cls, "updateHowSeeOnlineJob", "getUpdateHowSeeOnlineJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "updateWhoCanCallJob", "getUpdateWhoCanCallJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "updateWhoCanAddToChatJob", "getUpdateWhoCanAddToChatJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "searchByPhoneJob", "getSearchByPhoneJob()Lkotlinx/coroutines/Job;", 0)};
    }

    public y3e(ozd ozd, abe abe, gaf gaf, Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, qe3 qe3) {
        e3e e3e = e3e.a;
        Lazy h = e3e.getAccessor().h(ywf.class);
        Lazy h2 = e3e.getAccessor().h(pwf.class);
        this.b = ozd;
        this.c = abe;
        this.o = gaf;
        this.v = lazy;
        this.w = lazy4;
        this.x = lazy5;
        this.y = lazy2;
        this.z = lazy3;
        this.X = h;
        this.Y = h2;
        xme a = f6e.a(CollectionsKt.emptyList());
        this.Z = a;
        this.v0 = new etc(a);
        n6e b2 = m5a.b(1, IntCompanionObject.MAX_VALUE, (cu0) null, 4);
        this.F0 = b2;
        this.G0 = new dtc(b2);
        this.H0 = new s85(0);
        if (this.A0 == null) {
            this.A0 = Long.valueOf(((jna) k()).V());
        }
        xag.g(this, (CoroutineContext) null, (f14) null, new n3e(this, (Continuation) null), 3);
        bs0.K(new ps5(new dtc(ozd.b), new o3e(this, (Continuation) null), 5), this.a);
        bs0.K(bs0.F(new ps5(new dtc(qe3.a), new p3e(this, (Continuation) null), 5), ((osa) gaf).a()), this.a);
    }

    public static final Object j(y3e y3e, Continuation continuation) {
        Object I = ev0.I(((osa) y3e.o).a(), new u3e(y3e, (Continuation) null), continuation);
        return I == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? I : Unit.INSTANCE;
    }

    public static igf n(String str) {
        int i = q3e.$EnumSwitchMapping$0[tr1.y(wzf.b(str))];
        return i != 1 ? i != 2 ? new igf(qad.m) : new igf(qad.C5) : new igf(qad.P1);
    }

    public final void i() {
        ozd ozd = this.b;
        ((sv0) ozd.a.getValue()).f(ozd);
    }

    public final rl k() {
        return (rl) this.w.getValue();
    }

    public final pid l() {
        return (pid) this.v.getValue();
    }

    public final x23 m() {
        return (x23) this.z.getValue();
    }

    public final bud o() {
        return (bud) this.y.getValue();
    }

    public final void q(v5a v5a) {
        this.F0.d(v5a);
    }
}
