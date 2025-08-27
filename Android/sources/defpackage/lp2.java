package defpackage;

import android.content.Context;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.reflect.KProperty;

/* renamed from: lp2  reason: default package */
public final class lp2 extends xag {
    public static final /* synthetic */ KProperty[] X0;
    public final Lazy A0;
    public final Lazy B0;
    public final Lazy C0;
    public final wie D0 = o5a.U();
    public final wie E0 = o5a.U();
    public final wie F0 = o5a.U();
    public final wie G0 = o5a.U();
    public final wie H0 = o5a.U();
    public final wie I0 = o5a.U();
    public final wie J0 = o5a.U();
    public final wie K0 = o5a.U();
    public final wie L0 = o5a.U();
    public final wie M0 = o5a.U();
    public final wie N0 = o5a.U();
    public final wie O0 = o5a.U();
    public final etc P0;
    public final etc Q0;
    public final etc R0;
    public final n6e S0;
    public final s85 T0;
    public final wb U0;
    public final etc V0;
    public final etc W0;
    public final Lazy X;
    public final Lazy Y;
    public final Lazy Z;
    public final cf5 b;
    public final pn5 c;
    public final qx2 o;
    public final uz4 v;
    public final Lazy v0;
    public final o21 w;
    public final Lazy w0;
    public final d23 x;
    public final Lazy x0;
    public final fu4 y;
    public final Lazy y0;
    public final ap9 z;
    public final Lazy z0;

    static {
        Class<lp2> cls = lp2.class;
        X0 = new KProperty[]{rae.s(cls, "sendMediaJob", "getSendMediaJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "sendStickerJob", "getSendStickerJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "sendTypingJob", "getSendTypingJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "sendContactsJob", "getSendContactsJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "sendLocationJob", "getSendLocationJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "sendBotCommandJob", "getSendBotCommandJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "editMessageJob", "getEditMessageJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "joinChatJob", "getJoinChatJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "subscribeChannelJob", "getSubscribeChannelJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "saveDraftJob", "getSaveDraftJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "restoreDraftJob", "getRestoreDraftJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "clearDraftJob", "getClearDraftJob()Lkotlinx/coroutines/Job;", 0)};
    }

    public lp2(long j, q72 q72) {
        ta2 ta2;
        etc etc;
        Object obj;
        vk3 m;
        long j2 = j;
        un2 un2 = un2.a;
        un2.getClass();
        Lazy lazy = LazyKt.lazy(new r52(29));
        Lazy lazy2 = tn2.a;
        Class<rl> cls = rl.class;
        Lazy h = un2.getAccessor().h(cls);
        Class<x23> cls2 = x23.class;
        Lazy h2 = un2.getAccessor().h(cls2);
        Lazy h3 = un2.getAccessor().h(uj5.class);
        Class<gaf> cls3 = gaf.class;
        Lazy h4 = un2.getAccessor().h(cls3);
        Lazy h5 = un2.getAccessor().h(jje.class);
        Lazy h6 = un2.getAccessor().h(rs3.class);
        ji3 ji3 = (ji3) un2.getAccessor().g(ji3.class);
        Class<jqg> cls4 = jqg.class;
        Lazy h7 = un2.getAccessor().h(cls4);
        Class<gaf> cls5 = cls3;
        Lazy h8 = un2.getAccessor().h(ej9.class);
        Lazy h9 = un2.getAccessor().h(d6b.class);
        tt7 tt7 = (tt7) un2.getAccessor().g(tt7.class);
        Class<qx2> cls6 = qx2.class;
        Lazy lazy3 = h4;
        Lazy lazy4 = h7;
        cf5 cf5 = r1;
        Class<gaf> cls7 = cls5;
        Lazy lazy5 = h8;
        Lazy lazy6 = h9;
        Lazy h10 = un2.getAccessor().h(sn7.class);
        Lazy lazy7 = lazy;
        Lazy lazy8 = h5;
        Lazy lazy9 = h6;
        Class<x23> cls8 = cls2;
        Lazy lazy10 = lazy3;
        Lazy lazy11 = h;
        Lazy lazy12 = h3;
        Class<rl> cls9 = cls;
        cf5 cf52 = new cf5(un2.getDispatchers(), (sv0) un2.getAccessor().g(sv0.class), j, q72, un2.getAccessor().h(cls6));
        pn5 pn5 = (pn5) un2.getAccessor().g(pn5.class);
        qx2 qx2 = (qx2) un2.getAccessor().g(cls6);
        Class<ar6> cls10 = ar6.class;
        eu3 eu3 = (eu3) un2.getAccessor().g(eu3.class);
        Lazy lazy13 = h2;
        uz4 uz4 = new uz4(un2.getAccessor().h(cls10), un2.getAccessor().h(to9.class), un2.getAccessor().h(cls7), un2.getAccessor().h(cls4));
        o21 o21 = new o21(un2.getAccessor().h(cls6), un2.getAccessor().h(yva.class), un2.getAccessor().h(cls7));
        d23 c2 = un2.c();
        un2.getClass();
        a23 a23 = new a23(un2.getAccessor().h(cls7), un2.getAccessor().h(eef.class));
        fu4 fu4 = new fu4(un2.getAccessor().h(m95.class), un2.getAccessor().h(cls6), un2.getAccessor().h(cls8), un2.getAccessor().h(bud.class), un2.getAccessor().h(cls9), un2.getAccessor().h(cls10), un2.getAccessor().h(cls7), un2.c(), a23);
        ap9 d = un2.d();
        Lazy h11 = un2.getAccessor().h(luf.class);
        srd srd = new srd(un2.getAccessor().h(cls8), un2.getAccessor().h(tcf.class), un2.getAccessor().h(cls7), 8);
        Context context = (Context) un2.getAccessor().g(Context.class);
        cf5 cf53 = cf5;
        this.b = cf53;
        this.c = pn5;
        this.o = qx2;
        this.v = uz4;
        this.w = o21;
        this.x = c2;
        this.y = fu4;
        this.z = d;
        this.X = lazy11;
        Lazy lazy14 = lazy13;
        this.Y = lazy14;
        this.Z = lazy12;
        Lazy lazy15 = lazy10;
        this.v0 = lazy15;
        this.w0 = lazy8;
        this.x0 = lazy9;
        this.y0 = lazy7;
        this.z0 = h7;
        this.A0 = lazy5;
        this.B0 = lazy6;
        this.C0 = h10;
        i21 i21 = new i21((etc) fu4.k.e(context).j, srd, context, 1);
        o9a o9a = z6e.a;
        this.P0 = bs0.X(i21, this.a, o9a, (Object) null);
        int ordinal = q72.ordinal();
        if (ordinal == 0) {
            ta2 = ta2.a;
        } else if (ordinal == 1) {
            ta2 = ta2.b;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        qx2.getClass();
        int ordinal2 = ta2.ordinal();
        if (ordinal2 == 0) {
            etc = ((my2) qx2).o(j);
        } else if (ordinal2 == 1) {
            etc = ((my2) qx2).p(j);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.Q0 = etc;
        this.R0 = bs0.X(new on2(new on2(etc, 28), 1), this.a, o9a, (Object) null);
        this.S0 = m5a.b(0, 0, (cu0) null, 7);
        this.T0 = new s85(0);
        this.U0 = bs0.u(new on2(etc, 28), bs0.w(new i21(tt7.d, this, h11, 2)), bs0.w(new wb(10, new etc(ji3.b), this)), new jp2(lazy14, this, (Continuation) null, 0));
        a32 a32 = (a32) etc.a.getValue();
        if (a32 == null || (m = a32.m()) == null) {
            obj = new fs5(3, (Object) null);
        } else {
            obj = eu3.c(m.r());
        }
        this.V0 = bs0.X(new i21(new on2(etc, 28), obj, new ce1((Object) this, lazy14, (Continuation) null, 1), 4), this.a, o9a, (Object) null);
        this.W0 = bs0.X(bs0.F(new on2(new dtc(cf53.b), 2), ((osa) ((gaf) lazy15.getValue())).b()), this.a, o9a, Boolean.FALSE);
        bs0.K(bs0.F(new sbd(new gp2(new on2(etc, 28), (Continuation) null, this)), ((osa) l()).b()), this.a);
        bs0.K(new ps5(new dtc(pn5.b), new xn2(this, (Continuation) null), 5), this.a);
    }

    public final void i() {
        cf5 cf5 = this.b;
        cf5.a.f(cf5);
        pn5 pn5 = this.c;
        pn5.a.f(pn5);
    }

    public final void j() {
        z68.c(lp2.class.getName(), "clear draft", new Object[0]);
        aje u = ev0.u(this.a, ((osa) l()).b(), f14.b, new fo2(this, (Continuation) null));
        this.O0.setValue(this, X0[11], u);
    }

    public final void k(CharSequence charSequence, Long l, List list, boolean z2) {
        a32 a32 = (a32) this.Q0.a.getValue();
        Long valueOf = a32 != null ? Long.valueOf(a32.a) : null;
        if (l != null && valueOf != null) {
            this.J0.setValue(this, X0[6], xag.g(this, (CoroutineContext) null, f14.b, new io2(this, l, valueOf, charSequence, list, z2, (Continuation) null), 1));
            j();
        }
    }

    public final gaf l() {
        return (gaf) this.v0.getValue();
    }

    public final boolean m() {
        a32 a32 = (a32) this.Q0.a.getValue();
        return a32 != null && a32.K();
    }

    public final boolean n() {
        a32 a32 = (a32) this.Q0.a.getValue();
        return a32 != null && a32.N();
    }

    public final void o() {
        igf igf = new igf(ead.D);
        int i = dad.l0;
        igf igf2 = new igf(ead.F);
        og3 og3 = og3.c;
        xag.h(this.T0, new zn2(igf, CollectionsKt.listOf(new pg3(i, igf2, og3), new pg3(dad.m0, new igf(ead.G), og3), new pg3(dad.k0, new igf(ead.E), og3), new pg3(dad.n0, new igf(ead.H), og3.a), new pg3(dad.q, new igf(ead.h), og3))));
    }

    public final Object q(Continuation continuation) {
        return ev0.I(((osa) l()).b(), new po2(this, (Continuation) null), continuation);
    }

    public final void r(CharSequence charSequence, Long l, Long l2) {
        String name = lp2.class.getName();
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            Integer valueOf = charSequence != null ? Integer.valueOf(charSequence.length()) : null;
            a67.d(w78, name, "save draft, textLength:" + valueOf, (Throwable) null);
        }
        this.M0.setValue(this, X0[9], ev0.u(this.a, ((osa) l()).b(), f14.b, new ro2(this, charSequence, l, l2, (Continuation) null)));
    }

    public final void t(s58 s58, float f, long j, Long l) {
        String name = lp2.class.getName();
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            StringBuilder sb = new StringBuilder("sendLocation ");
            s58 s582 = s58;
            sb.append(s58);
            a67.d(w78, name, sb.toString(), (Throwable) null);
        } else {
            s58 s583 = s58;
        }
        a32 a32 = (a32) this.Q0.a.getValue();
        if (a32 != null) {
            long j2 = a32.a;
            this.H0.setValue(this, X0[4], ev0.u(this.a, ((osa) l()).b(), f14.b, new wo2(j2, s58, f, j, this, l, (Continuation) null)));
        }
    }

    public final void u(CharSequence charSequence, Long l, List list, boolean z2) {
        a32 a32 = (a32) this.Q0.a.getValue();
        if (a32 != null) {
            aje g = xag.g(this, (CoroutineContext) null, f14.b, new xo2(this, a32.a, charSequence, list, z2, l, (Continuation) null), 1);
            this.D0.setValue(this, X0[0], g);
        }
    }
}
