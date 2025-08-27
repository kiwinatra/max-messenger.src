package defpackage;

import android.content.Intent;
import android.graphics.Point;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.video.CameraManager;

/* renamed from: jj1  reason: default package */
public final class jj1 extends xag implements ph1 {
    public static final /* synthetic */ KProperty[] O0;
    public final Lazy A0;
    public final Lazy B0;
    public final etc C0;
    public final xme D0;
    public final xme E0;
    public final xme F0;
    public final xme G0;
    public final xme H0;
    public final etc I0;
    public final Lazy J0;
    public final s85 K0;
    public final etc L0;
    public final Lazy M0;
    public final Lazy N0;
    public final Lazy X;
    public final Lazy Y;
    public final Lazy Z;
    public final qcb b;
    public final ap1 c;
    public final Lazy o;
    public final q01 v;
    public final wie v0 = o5a.U();
    public final l91 w;
    public final etc w0;
    public final hl1 x;
    public final xme x0;
    public final wgd y;
    public final Lazy y0;
    public final Lazy z;
    public final Lazy z0;

    static {
        Class<jj1> cls = jj1.class;
        O0 = new KProperty[]{rae.s(cls, "openOpponentChat", "getOpenOpponentChat()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "openOpponentProfile", "getOpenOpponentProfile()Lkotlinx/coroutines/Job;", 0)};
    }

    /* JADX WARNING: type inference failed for: r7v7, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    public jj1(Lazy lazy, qcb qcb, ap1 ap1, q01 q01, l91 l91, hl1 hl1, wgd wgd, Lazy lazy2, Lazy lazy3) {
        ap1 ap12 = ap1;
        Lazy lazy4 = rjd.c;
        Lazy lazy5 = rjd.N;
        this.b = qcb;
        this.c = ap12;
        this.o = lazy5;
        this.v = q01;
        this.w = l91;
        this.x = hl1;
        this.y = wgd;
        this.z = lazy2;
        this.X = lazy3;
        this.Y = lazy4;
        this.Z = lazy;
        o5a.U();
        etc etc = ap12.m;
        this.w0 = etc;
        xme a = f6e.a(new k91());
        this.x0 = a;
        this.y0 = LazyKt.lazy(new pi1(this, 0));
        this.z0 = LazyKt.lazy(new pi1(this, 1));
        this.A0 = LazyKt.lazy(new pi1(this, 2));
        this.B0 = LazyKt.lazy(new pi1(this, 3));
        etc etc2 = new etc(a);
        this.C0 = etc2;
        this.D0 = f6e.a(MapsKt.emptyMap());
        vag vag = vag.b;
        pn1 pn1 = r14;
        pn1 pn12 = new pn1(vag, CollectionsKt.emptyList(), (evf) null, (nr7) null, false, (zd0) null);
        xme a2 = f6e.a(new j31(pn1));
        this.E0 = a2;
        this.F0 = a2;
        this.G0 = f6e.a(Boolean.TRUE);
        xme a3 = f6e.a(jl1.d);
        this.H0 = a3;
        this.I0 = new etc(a3);
        Lazy lazy6 = LazyKt.lazy(new v11(23));
        this.J0 = lazy6;
        this.K0 = new s85(0);
        this.L0 = bs0.X(new pc(etc, 15), this.a, z6e.a, vag);
        pi1 pi1 = new pi1(this, 4);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.M0 = LazyKt.lazy(lazyThreadSafetyMode, pi1);
        this.N0 = LazyKt.lazy(lazyThreadSafetyMode, new v11(24));
        bs0.K(new ps5(((p6g) lazy6.getValue()).d, new SuspendLambda(2, (Continuation<Object>) null), 5), this.a);
        bs5 c2 = ap1.c();
        bs5 pcVar = new pc(etc, 16);
        bs5 pcVar2 = new pc(etc2, 17);
        bs5 pcVar3 = new pc(etc2, 18);
        bs5 pcVar4 = new pc(etc2, 19);
        bs5[] bs5Arr = {c2, pcVar, pcVar2, pcVar3, pcVar4};
        bs0.K(new wb(19, bs5Arr, new yi1(this, (Continuation) null)), this.a);
        bs5 bs5 = ap12.c.e;
        bs5 pcVar5 = new pc(ap1.c(), 20);
        bs5 wbVar = new wb(6, ap1.c(), this);
        bs5[] bs5Arr2 = {bs5, etc2, pcVar5, wbVar};
        bs0.K(new wb(18, bs5Arr2, new zi1(this, (Continuation) null)), this.a);
        bs0.K(new ps5(new pc(((chd) ap12.i).v, 21), new si1(this, (Continuation) null), 5), this.a);
        ev0.v(this.a, ((osa) ((gaf) lazy5.getValue())).a(), (f14) null, new ui1(this, (Continuation) null), 2);
        ev0.v(this.a, ((osa) ((gaf) lazy5.getValue())).a(), (f14) null, new wi1(this, (Continuation) null), 2);
    }

    public final boolean j(boolean z2) {
        return (!l().g && !z2) || l().g || l().u;
    }

    public final void k() {
        Object value;
        xme xme = this.c.l;
        do {
            value = xme.getValue();
        } while (!xme.b(value, zm1.a((zm1) value, (ze1) null, (ze1) null, (ze1) null, (vag) null, 23)));
    }

    public final k91 l() {
        return (k91) this.C0.a.getValue();
    }

    public final void m(boolean z2) {
        xme xme;
        Object value;
        do {
            xme = this.G0;
            value = xme.getValue();
            ((Boolean) value).getClass();
        } while (!xme.b(value, Boolean.valueOf(z2)));
    }

    public final boolean n() {
        return ((Boolean) this.y0.getValue()).booleanValue();
    }

    public final void o(ze1 ze1) {
        if (!Intrinsics.areEqual((Object) ze1, (Object) ze1.c) && ((k91) this.C0.a.getValue()).g) {
            this.c.e(ze1, false);
        }
    }

    public final void q(boolean z2, Intent intent) {
        Conversation a;
        ap1 ap1 = this.c;
        kgd kgd = ap1.h;
        if (!z2 || !kgd.c()) {
            if (z2 && (a = ((jz3) kgd.a.getValue()).a()) != null && !a.isDestroyed() && intent != null) {
                CameraManager a2 = ap1.e.a();
                if (a2 != null) {
                    a2.setCameraEnabled(false);
                }
                ap1.g.a = intent;
                kgd.b(true);
            } else if (!z2 && kgd.c()) {
                kgd.b(false);
            }
        }
        tq1 tq1 = (tq1) this.Z.getValue();
        boolean z3 = ((k91) this.C0.a.getValue()).g;
        tq1.getClass();
        tq1.a(tq1, "SCREEN_SHARE", (String) null, (String) null, Integer.valueOf(z2 ? 1 : 0), (String) null, (String) null, z3, 54);
    }

    public final void r(ze1 ze1, Point point) {
        if (!Intrinsics.areEqual((Object) ze1, (Object) ze1.c) && ((k91) this.C0.a.getValue()).g) {
            xag.h(this.K0, new ii1(ld8.j0(ze1, Intrinsics.areEqual((Object) ((zm1) this.w0.a.getValue()).a, (Object) ze1), ((v9b) this.c.d).c(), point)));
        }
    }
}
