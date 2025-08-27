package defpackage;

import android.graphics.RectF;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.text.StringsKt;

/* renamed from: pn3  reason: default package */
public final class pn3 extends xz4 {
    public final Lazy A;
    public final Lazy B = LazyKt.lazy(new oq2(28));
    public final AtomicBoolean C = new AtomicBoolean(false);
    public final g85 D = new g85(CollectionsKt.listOf(new Object(), new id(), new Object()));
    public final g85 E = new g85(CollectionsKt.plus(CollectionsKt.listOf(new Object(), new id(), new Object()), new Object()));
    public final long o;
    public final Lazy p;
    public final Lazy q;
    public final Lazy r;
    public final Lazy s;
    public final Lazy t;
    public final Lazy u;
    public final Lazy v;
    public final Lazy w;
    public final Lazy x;
    public final Lazy y;
    public final ct7 z;

    public pn3(long j, d14 d14) {
        super(d14);
        this.o = j;
        bzb bzb = bzb.a;
        Lazy h = bzb.getAccessor().h(eu3.class);
        this.p = h;
        this.q = bzb.d();
        this.r = bzb.getAccessor().h(x23.class);
        this.s = bzb.getAccessor().h(pid.class);
        this.t = bzb.e();
        this.u = bzb.getAccessor().h(doa.class);
        this.v = bzb.getAccessor().h(dp1.class);
        this.w = bzb.getAccessor().h(zr3.class);
        this.x = bzb.getAccessor().h(yr3.class);
        this.y = bzb.getAccessor().h(zk3.class);
        this.z = new ct7(bzb.getAccessor().h(dxa.class));
        this.A = bzb.c();
        bs0.K(bs0.F(new ps5(new wb(13, new sbd(new jn3(new on2(((eu3) h.getValue()).c(j), 28), (Continuation) null, this)), this), new xm3(this, (Continuation) null), 5), ((osa) q()).b()), d14);
    }

    public static final Object n(pn3 pn3, Continuation continuation) {
        boolean z2 = pn3.C.get();
        n6e n6e = pn3.e;
        if (z2) {
            pn3.c().getClass();
            Object a = n6e.a(new g0c(new igf(ixa.b0), new igf(ixa.a0), CollectionsKt.listOf(new pg3(fxa.f0, new igf(ixa.Z), og3.a), new pg3(fxa.g0, new igf(ixa.Y), og3.b))), continuation);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Unit.INSTANCE;
        }
        vk3 vk3 = (vk3) ((eu3) pn3.p.getValue()).c(pn3.o).a.getValue();
        String f = vk3 != null ? vk3.f() : null;
        if (f == null) {
            f = "";
        }
        pn3.c().getClass();
        kgf kgf = new kgf(ixa.G0, ArraysKt.toList((T[]) new Object[]{f}));
        List createListBuilder = CollectionsKt.createListBuilder();
        createListBuilder.add(new pg3(fxa.f, new igf(ixa.F0), og3.a));
        createListBuilder.add(new pg3(fxa.e, new igf(ixa.D0), og3.b));
        Unit unit = Unit.INSTANCE;
        Object a2 = n6e.a(new g0c(kgf, (ngf) null, CollectionsKt.build(createListBuilder)), continuation);
        return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Unit.INSTANCE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a7, code lost:
        r17 = r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.oz4 o(defpackage.pn3 r20, defpackage.vk3 r21) {
        /*
            r0 = r20
            r1 = r21
            java.lang.String r2 = "6M"
            kotlin.Lazy r3 = r0.r
            java.lang.Object r3 = r3.getValue()
            x23 r3 = (defpackage.x23) r3
            qjd r3 = (defpackage.qjd) r3
            java.lang.String r3 = r3.p()
            kl0 r4 = defpackage.kl0.c
            java.lang.String r6 = r1.u(r3, r4)
            long r7 = r21.r()
            java.lang.CharSequence r10 = r21.q()
            java.lang.String r9 = r21.g()
            java.lang.String r12 = r21.i()
            vm3 r3 = r1.a
            um3 r4 = r3.c
            java.lang.String r14 = r4.o
            java.lang.String r4 = r4.p
            if (r4 == 0) goto L_0x0052
            int r4 = r4.length()
            if (r4 != 0) goto L_0x003b
            goto L_0x0052
        L_0x003b:
            um3 r3 = r3.c
            java.lang.String r3 = r3.p
            android.net.Uri r3 = android.net.Uri.parse(r3)
            java.lang.String r3 = r3.getLastPathSegment()
            if (r3 != 0) goto L_0x004b
            java.lang.String r3 = ""
        L_0x004b:
            mgf r4 = new mgf
            r4.<init>(r3)
        L_0x0050:
            r15 = r4
            goto L_0x005a
        L_0x0052:
            int r3 = defpackage.ixa.h2
            igf r4 = new igf
            r4.<init>(r3)
            goto L_0x0050
        L_0x005a:
            long r3 = r21.s()
            java.lang.String r16 = java.lang.String.valueOf(r3)
            kotlin.Lazy r0 = r0.s
            java.lang.Object r0 = r0.getValue()
            pid r0 = (defpackage.pid) r0
            hq r0 = (defpackage.hq) r0
            ls7 r0 = r0.g
            java.lang.String r1 = "app.privacy.inactive.ttl"
            java.lang.String r0 = r0.getString(r1, r2)
            m0g r1 = defpackage.m0g.TTL_6M
            if (r0 == 0) goto L_0x00a2
            r3 = -1
            int r4 = r0.hashCode()
            switch(r4) {
                case 1596: goto L_0x0095;
                case 1658: goto L_0x008a;
                case 1751: goto L_0x0081;
                default: goto L_0x0080;
            }
        L_0x0080:
            goto L_0x009f
        L_0x0081:
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0088
            goto L_0x009f
        L_0x0088:
            r3 = 2
            goto L_0x009f
        L_0x008a:
            java.lang.String r2 = "3M"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0093
            goto L_0x009f
        L_0x0093:
            r3 = 1
            goto L_0x009f
        L_0x0095:
            java.lang.String r2 = "1M"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x009e
            goto L_0x009f
        L_0x009e:
            r3 = 0
        L_0x009f:
            switch(r3) {
                case 0: goto L_0x00aa;
                case 1: goto L_0x00a5;
                case 2: goto L_0x00a2;
                default: goto L_0x00a2;
            }
        L_0x00a2:
            r17 = r1
            goto L_0x00ad
        L_0x00a5:
            m0g r0 = defpackage.m0g.TTL_3M
        L_0x00a7:
            r17 = r0
            goto L_0x00ad
        L_0x00aa:
            m0g r0 = defpackage.m0g.TTL_1M
            goto L_0x00a7
        L_0x00ad:
            oz4 r0 = new oz4
            r11 = 0
            r13 = 0
            r18 = 0
            r19 = 0
            r5 = r0
            r5.<init>(r6, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pn3.o(pn3, vk3):oz4");
    }

    public static final void p(pn3 pn3, long j) {
        Object value;
        oz4 oz4;
        xme xme;
        Object value2;
        xme xme2 = pn3.k;
        do {
            value = xme2.getValue();
            oz4 oz42 = (oz4) value;
            if (oz42 != null) {
                oz4 = oz4.c(oz42, (String) null, (c63) null, (String) null, (c63) null, (String) null, (ngf) null, (m0g) null, j != 0, Long.valueOf(j), 2047);
            } else {
                oz4 = null;
            }
        } while (!xme2.b(value, oz4));
        Unit unit = Unit.INSTANCE;
        do {
            xme = pn3.d;
            value2 = xme.getValue();
            List list = (List) value2;
        } while (!xme.b(value2, pn3.f().a(pn3)));
    }

    public final void a(int i) {
        ev0.v(this.a, ((osa) q()).a(), (f14) null, new ym3(i, this, (Continuation) null), 2);
    }

    public final void b() {
    }

    public final boolean d() {
        return this.C.get();
    }

    public final long e() {
        return this.o;
    }

    public final void g(int i) {
        if (i == fxa.b) {
            r(m0g.TTL_1M);
        } else if (i == fxa.c) {
            r(m0g.TTL_3M);
        } else if (i == fxa.d) {
            r(m0g.TTL_6M);
        } else {
            int i2 = fxa.f0;
            d14 d14 = this.a;
            if (i == i2) {
                ev0.v(d14, ((osa) q()).b(), (f14) null, new cn3(this, true, (Continuation) null), 2);
            } else if (i == fxa.f) {
                ev0.v(d14, ((osa) q()).b().plus(caa.a), (f14) null, new bn3(this, (Continuation) null), 2);
            } else if (i == fxa.k0) {
                ((mp1) ((dp1) this.v.getValue())).u((nw6) null);
                ev0.v(d14, ((osa) q()).b(), (f14) null, new en3(this, (Continuation) null), 2);
            }
        }
    }

    public final Object h(String str, RectF rectF, Continuation continuation) {
        this.n.set(((jna) ((rl) this.A.getValue())).N(str, j4b.l(rectF)));
        Object a = this.e.a(new h0c(new igf(ixa.q), Boxing.boxInt(cad.n)), continuation);
        return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Unit.INSTANCE;
    }

    public final Unit i() {
        vk3 vk3 = (vk3) ((eu3) this.p.getValue()).c(this.o).a.getValue();
        if (vk3 == null) {
            return Unit.INSTANCE;
        }
        xme xme = this.c;
        azb azb = (azb) xme.getValue();
        xme.setValue(azb != null ? azb.a(azb, vk3.u(((qjd) ((x23) this.r.getValue())).p(), kl0.c), false, 126) : null);
        return Unit.INSTANCE;
    }

    public final void j() {
        ev0.v(this.a, ((osa) q()).b(), (f14) null, new fn3(this, (Continuation) null), 2);
    }

    public final void k() {
        ev0.v(this.a, ((osa) q()).a(), (f14) null, new gn3(this, (Continuation) null), 2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(kotlin.coroutines.Continuation r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.kn3
            if (r0 == 0) goto L_0x0013
            r0 = r12
            kn3 r0 = (defpackage.kn3) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            kn3 r0 = new kn3
            r0.<init>(r11, r12)
        L_0x0018:
            java.lang.Object r12 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x004b
            if (r2 == r5) goto L_0x003e
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x010b
        L_0x0031:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0039:
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x010d
        L_0x003e:
            oz4 r11 = r0.b
            pn3 r2 = r0.a
            kotlin.ResultKt.throwOnFailure(r12)
            r10 = r12
            r12 = r11
            r11 = r2
            r2 = r10
            goto L_0x00c1
        L_0x004b:
            kotlin.ResultKt.throwOnFailure(r12)
            xme r12 = r11.k
            java.lang.Object r12 = r12.getValue()
            oz4 r12 = (defpackage.oz4) r12
            r2 = 0
            if (r12 != 0) goto L_0x005e
            java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
            return r11
        L_0x005e:
            java.util.concurrent.atomic.AtomicBoolean r7 = r11.C
            boolean r7 = r7.get()
            if (r7 == 0) goto L_0x00e6
            g85 r3 = r11.E
            boolean r3 = r11.s(r3)
            if (r3 != 0) goto L_0x0073
            java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
            return r11
        L_0x0073:
            m0g r2 = r12.k
            if (r2 == 0) goto L_0x00ca
            kotlin.Lazy r3 = r11.s
            java.lang.Object r7 = r3.getValue()
            pid r7 = (defpackage.pid) r7
            hq r7 = (defpackage.hq) r7
            ls7 r7 = r7.g
            java.lang.String r8 = "6M"
            java.lang.String r9 = "app.privacy.inactive.ttl"
            java.lang.String r7 = r7.getString(r9, r8)
            java.lang.String r8 = r2.a
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r7)
            r7 = r7 ^ r5
            if (r7 == 0) goto L_0x0095
            goto L_0x0096
        L_0x0095:
            r2 = r6
        L_0x0096:
            if (r2 == 0) goto L_0x00ca
            java.lang.Object r3 = r3.getValue()
            pid r3 = (defpackage.pid) r3
            hq r3 = (defpackage.hq) r3
            java.lang.String r7 = r2.a
            r3.l(r9, r7)
            gaf r3 = r11.q()
            osa r3 = (defpackage.osa) r3
            q04 r3 = r3.b()
            ln3 r7 = new ln3
            r7.<init>(r11, r2, r6)
            r0.a = r11
            r0.b = r12
            r0.v = r5
            java.lang.Object r2 = defpackage.ev0.I(r3, r7, r0)
            if (r2 != r1) goto L_0x00c1
            return r1
        L_0x00c1:
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            kotlin.coroutines.jvm.internal.Boxing.boxLong(r2)
        L_0x00ca:
            gaf r2 = r11.q()
            osa r2 = (defpackage.osa) r2
            q04 r2 = r2.b()
            mn3 r3 = new mn3
            r3.<init>(r11, r12, r6)
            r0.a = r6
            r0.b = r6
            r0.v = r4
            java.lang.Object r11 = defpackage.ev0.I(r2, r3, r0)
            if (r11 != r1) goto L_0x010d
            return r1
        L_0x00e6:
            g85 r4 = r11.D
            boolean r4 = r11.s(r4)
            if (r4 != 0) goto L_0x00f3
            java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
            return r11
        L_0x00f3:
            gaf r2 = r11.q()
            osa r2 = (defpackage.osa) r2
            q04 r2 = r2.b()
            nn3 r4 = new nn3
            r4.<init>(r11, r12, r6)
            r0.v = r3
            java.lang.Object r11 = defpackage.ev0.I(r2, r4, r0)
            if (r11 != r1) goto L_0x010b
            return r1
        L_0x010b:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
        L_0x010d:
            java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pn3.l(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void m(int i, String str) {
        Object value;
        oz4 oz4;
        Object value2;
        oz4 oz42;
        Object value3;
        oz4 oz43;
        xme xme = this.k;
        if (i == 1) {
            do {
                value3 = xme.getValue();
                oz43 = (oz4) value3;
            } while (!xme.b(value3, oz43 != null ? oz4.c(oz43, str, (c63) null, (String) null, (c63) null, (String) null, (ngf) null, (m0g) null, false, (Long) null, 8171) : null));
        } else if (i == 2) {
            do {
                value2 = xme.getValue();
                oz42 = (oz4) value2;
            } while (!xme.b(value2, oz42 != null ? oz4.c(oz42, (String) null, (c63) null, str, (c63) null, (String) null, (ngf) null, (m0g) null, false, (Long) null, 8095) : null));
        } else if (i == 4) {
            do {
                value = xme.getValue();
                oz4 = (oz4) value;
            } while (!xme.b(value, oz4 != null ? oz4.c(oz4, (String) null, (c63) null, (String) null, (c63) null, str, (ngf) null, (m0g) null, false, (Long) null, 8063) : null));
        }
    }

    public final gaf q() {
        return (gaf) this.t.getValue();
    }

    public final void r(m0g m0g) {
        xme xme;
        Object value;
        oz4 oz4;
        do {
            xme = this.k;
            value = xme.getValue();
            oz4 = (oz4) value;
        } while (!xme.b(value, oz4 != null ? oz4.c(oz4, (String) null, (c63) null, (String) null, (c63) null, (String) null, (ngf) null, m0g, false, (Long) null, 7167) : null));
    }

    public final boolean s(g85 g85) {
        Object value;
        oz4 oz4;
        xme xme;
        Object value2;
        String str;
        oz4 oz42;
        String str2;
        g85 g852 = g85;
        huf huf = huf.a;
        xme xme2 = this.k;
        oz4 oz43 = (oz4) xme2.getValue();
        String str3 = oz43 != null ? oz43.c : null;
        huf huf2 = huf.a;
        String str4 = "";
        if (str3 == null) {
            str3 = str4;
        }
        c63 a = g852.a(huf2, str3);
        huf huf3 = huf.b;
        oz4 oz44 = (oz4) xme2.getValue();
        String str5 = oz44 != null ? oz44.f : null;
        if (str5 != null) {
            str4 = str5;
        }
        c63 a2 = g852.a(huf3, str4);
        oz4 oz45 = (oz4) xme2.getValue();
        boolean z2 = true;
        if (!(oz45 == null || (str = oz45.c) == null || !StringsKt.isBlank(str) || (oz42 = (oz4) xme2.getValue()) == null || (str2 = oz42.f) == null || StringsKt.isBlank(str2))) {
            a = new c63(CollectionsKt.listOf(new igf(ead.h0)));
        }
        if (!(a == null && a2 == null)) {
            z2 = false;
        }
        do {
            value = xme2.getValue();
            oz4 = (oz4) value;
        } while (!xme2.b(value, oz4 != null ? oz4.c(oz4, (String) null, a, (String) null, a2, (String) null, (ngf) null, (m0g) null, false, (Long) null, 8111) : null));
        do {
            xme = this.d;
            value2 = xme.getValue();
            List list = (List) value2;
        } while (!xme.b(value2, f().a(this)));
        return z2;
    }
}
