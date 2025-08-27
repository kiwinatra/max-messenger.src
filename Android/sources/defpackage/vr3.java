package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.reflect.KProperty;

/* renamed from: vr3  reason: default package */
public final class vr3 extends gwb {
    public final boolean f;
    public final Lazy g;
    public final Lazy h;
    public final Lazy i;
    public final Lazy j;
    public final Lazy k;
    public final Lazy l;
    public final Lazy m;
    public t73 n;
    public final g93 o = new g93();
    public final Lazy p;
    public final Lazy q;
    public final io4 r;
    public final Lazy s;
    public final xme t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vr3(long j2, d14 d14, boolean z) {
        super(j2);
        long j3 = j2;
        d14 d142 = d14;
        this.f = z;
        jxb jxb = jxb.a;
        Lazy e = jxb.e();
        this.g = e;
        this.h = jxb.c();
        Lazy h2 = jxb.getAccessor().h(ttb.class);
        this.i = h2;
        this.j = jxb.getAccessor().h(zk3.class);
        this.k = jxb.getAccessor().h(hl3.class);
        this.l = jxb.getAccessor().h(rs3.class);
        Lazy f2 = jxb.f();
        this.m = f2;
        qr3 qr3 = new qr3(0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.p = LazyKt.lazy(lazyThreadSafetyMode, qr3);
        this.q = LazyKt.lazy(lazyThreadSafetyMode, new qr3(1));
        io4 a = ((qwb) jxb.getAccessor().g(qwb.class)).a(j3);
        this.r = a;
        this.s = jxb.getAccessor().h(is9.class);
        xme a2 = f6e.a(CollectionsKt.emptyList());
        this.t = a2;
        t73 t73 = new t73(j3);
        this.n = t73;
        bs0.K(new ps5(t73.i, new rr3(this, (Continuation) null), 5), d142);
        bs0.K(bs0.F(new ps5(bs0.u(new on2(bs0.D(((eu3) e.getValue()).c(j3), new tr3(this, j3, (Continuation) null)), 28), new etc(((rtb) ((ttb) h2.getValue()).a.getValue()).e().c(j3)), new etc(a2), new sr3(this, (Continuation) null)), new wq0(2, this, vr3.class, "emitState", "emitState(Lone/me/profile/viewmodel/logic/Profile$State;)V", 4, 11), 5), ((osa) ((gaf) f2.getValue())).a()), d142);
        bs0.K(bs0.F(new ps5(new dtc(a.d), new wq0(2, this, vr3.class, "handleProfileEvent", "handleProfileEvent(Lone/me/profile/viewmodel/logic/DialogProfileEvent;)V", 4, 12), 5), ((osa) ((gaf) f2.getValue())).a()), d142);
    }

    public final Unit D(Continuation continuation) {
        Unit a = ((rs3) this.l.getValue()).a(this.a);
        return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Unit.INSTANCE;
    }

    public final Pair E(vk3 vk3) {
        List list;
        m72 m72;
        vk3 vk32 = vk3;
        String name = vr3.class.getName();
        z68.c(name, "buildAppBarAndItems " + vk32, new Object[0]);
        owb owb = new owb(vk3.r(), vk3.c(), vk3.v(), vk32.t(kl0.b), vk3.f(), vk3.q(), new mgf(((rtb) ((ttb) this.i.getValue()).a.getValue()).d(vk32, true)), new mgf(hhf.c(vk3.m())), vk3.w() || vk3.n() != 0, vk3.z());
        ind ind = (ind) this.c.getValue();
        Lazy lazy = this.h;
        long j2 = this.a;
        a32 q2 = ((my2) ((qx2) lazy.getValue())).q(j2);
        ind.getClass();
        List createListBuilder = CollectionsKt.createListBuilder();
        ind.b(createListBuilder, vk32, q2);
        yva a = ind.a();
        CharSequence o2 = vk32.o(ind.a());
        a.getClass();
        CharSequence a2 = a.a(o2, false, true, false, true, (List) null, true);
        if (!(a2 == null || a2.length() == 0)) {
            createListBuilder.add(new n3c(a2, new igf(vk3.x() ? lxa.F : lxa.G)));
        }
        long s2 = vk3.s();
        b3c b3c = null;
        if (s2 > 0) {
            String valueOf = String.valueOf(s2);
            Lazy lazy2 = ind.c;
            String a3 = fhf.a((aeb) ind.b.getValue(), valueOf, ((a33) ((x23) lazy2.getValue())).g.getString("app.location.country.code", (String) null), ((qjd) ((x23) lazy2.getValue())).q());
            if (a3 != null && a3.length() > 1) {
                createListBuilder.add(new r3c(a3));
            }
        }
        createListBuilder.add(new Object());
        List build = CollectionsKt.build(createListBuilder);
        gw0 gw0 = (gw0) this.b.getValue();
        a32 q3 = ((my2) ((qx2) lazy.getValue())).q(j2);
        gw0.getClass();
        if (vk3.w()) {
            list = CollectionsKt.listOf(new gqa(jxa.p1, (cqa) null, Integer.valueOf(lxa.M), Integer.valueOf(cad.j1), 158), gw0.d(), gw0.a());
        } else {
            List createListBuilder2 = CollectionsKt.createListBuilder();
            if (!this.f) {
                createListBuilder2.add(gw0.f());
            }
            if (!vk3.x() && !vk3.B() && vk3.n() == 0) {
                createListBuilder2.add(new gqa(jxa.l, (cqa) null, Integer.valueOf(lxa.k), Integer.valueOf(cad.c0), 158));
                createListBuilder2.add(new gqa(jxa.q1, (cqa) null, Integer.valueOf(lxa.N), Integer.valueOf(cad.m2), 158));
            }
            if (!(((q3 == null || (m72 = q3.b) == null) ? null : m72.c) == k72.o || q3 == null)) {
                createListBuilder2.add(q3.X((x23) gw0.a.getValue()) ? gw0.b() : gw0.c());
            }
            createListBuilder2.add(gw0.a());
            list = CollectionsKt.build(createListBuilder2);
        }
        if (!vk3.c() && !vk3.w() && vk3.n() == 0) {
            b3c = new b3c(lxa.h);
        }
        List createListBuilder3 = CollectionsKt.createListBuilder();
        if (true ^ list.isEmpty()) {
            createListBuilder3.add(new a3c(list));
        }
        if (b3c != null) {
            createListBuilder3.add(b3c);
        }
        createListBuilder3.addAll(build);
        return TuplesKt.to(owb, CollectionsKt.build(createListBuilder3));
    }

    public final vk3 F() {
        return (vk3) ((eu3) this.g.getValue()).c(this.a).a.getValue();
    }

    public final Unit a(Continuation continuation) {
        Unit a = ((hl3) this.k.getValue()).a(this.a);
        return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Unit.INSTANCE;
    }

    public final void d() {
        io4 io4 = this.r;
        io4.b.f(io4);
        t73 t73 = this.n;
        if (t73 != null) {
            k73 k73 = (k73) t73.e.getValue();
            k73.a.f(k73);
            KProperty[] kPropertyArr = t73.m;
            KProperty kProperty = kPropertyArr[0];
            wie wie = t73.l;
            pm7 pm7 = (pm7) wie.getValue(t73, kProperty);
            if (pm7 != null) {
                pm7.b((CancellationException) null);
            }
            wie.setValue(t73, kPropertyArr[0], (Object) null);
        }
        this.n = null;
    }

    public final j91 e() {
        return new y4c(this.a, txb.CONTACT);
    }

    public final String h() {
        vk3 F = F();
        if (F != null) {
            return F.j();
        }
        return null;
    }

    public final Long i() {
        a32 q2 = ((my2) ((qx2) this.h.getValue())).q(this.a);
        if (q2 != null) {
            return Long.valueOf(q2.a);
        }
        return null;
    }

    public final Long j() {
        a32 q2 = ((my2) ((qx2) this.h.getValue())).q(this.a);
        if (q2 != null) {
            return Long.valueOf(q2.b.a);
        }
        return null;
    }

    public final qr2 k() {
        return qr2.b;
    }

    public final txb l() {
        return txb.CONTACT;
    }

    public final Object n(Continuation continuation) {
        return ((my2) ((qx2) this.h.getValue())).u(this.a, continuation);
    }

    public final String o() {
        vk3 F = F();
        if (F != null) {
            return Long.valueOf(F.s()).toString();
        }
        return null;
    }

    public final boolean r() {
        return true;
    }

    public final void s() {
        t73 t73 = this.n;
        if (t73 != null) {
            aje v = ev0.v(t73.k, (CoroutineContext) null, f14.b, new r73(t73, (Continuation) null), 1);
            t73.l.setValue(t73, t73.m[0], v);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object t(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.ur3
            if (r0 == 0) goto L_0x0013
            r0 = r5
            ur3 r0 = (defpackage.ur3) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.c = r1
            goto L_0x0018
        L_0x0013:
            ur3 r0 = new ur3
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x0047
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r5)
            kotlin.Lazy r5 = r4.j
            java.lang.Object r5 = r5.getValue()
            zk3 r5 = (defpackage.zk3) r5
            r0.c = r3
            long r2 = r4.a
            kotlin.Unit r4 = r5.a(r2)
            if (r4 != r1) goto L_0x0047
            return r1
        L_0x0047:
            g6c r4 = new g6c
            int r5 = defpackage.cad.n
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r5)
            int r0 = defpackage.lxa.E0
            igf r1 = new igf
            r1.<init>(r0)
            r4.<init>(r1, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vr3.t(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean w() {
        t73 t73 = this.n;
        if (t73 == null) {
            return false;
        }
        j83 j83 = (j83) t73.h.getValue();
        z73 z73 = j83 instanceof z73 ? (z73) j83 : null;
        return z73 != null && z73.b;
    }

    public final pa4 x() {
        wc8 wc8 = txb.b;
        r4c.b.getClass();
        return new pa4(":profile/avatars?id=" + this.a + "&type=contact");
    }

    public final h6c y() {
        owb owb;
        CharSequence charSequence;
        fwb fwb = (fwb) this.e.a.getValue();
        if (fwb == null || (owb = fwb.a) == null || (charSequence = owb.e) == null) {
            return null;
        }
        return ((swb) this.q.getValue()).a(charSequence, qr2.b);
    }

    public final List z() {
        nxb nxb = (nxb) this.p.getValue();
        vk3 F = F();
        nxb.getClass();
        List createListBuilder = CollectionsKt.createListBuilder();
        createListBuilder.add(nxb.a());
        createListBuilder.add((ow3) nxb.b.getValue());
        if (F == null || !F.w()) {
            createListBuilder.add((ow3) nxb.e.getValue());
        }
        createListBuilder.add((ow3) nxb.f.getValue());
        return CollectionsKt.build(createListBuilder);
    }
}
