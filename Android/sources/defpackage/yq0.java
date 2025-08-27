package defpackage;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: yq0  reason: default package */
public final class yq0 extends gwb {
    public final Lazy f;
    public final Lazy g;
    public final Lazy h;
    public final Lazy i;
    public final Lazy j;
    public final Lazy k;
    public final Lazy l = LazyKt.lazy(LazyThreadSafetyMode.NONE, new m(20));
    public final io4 m;

    public yq0(long j2, d14 d14) {
        super(j2);
        jxb jxb = jxb.a;
        Lazy e = jxb.e();
        this.f = e;
        this.g = jxb.c();
        this.h = jxb.getAccessor().h(jje.class);
        this.i = jxb.getAccessor().h(h4f.class);
        Lazy f2 = jxb.f();
        this.j = f2;
        this.k = jxb.getAccessor().h(bud.class);
        io4 a = ((qwb) jxb.getAccessor().g(qwb.class)).a(j2);
        this.m = a;
        bs0.K(bs0.F(new ps5(new wb(4, new on2(((eu3) e.getValue()).c(j2), 28), this), new wq0(2, this, yq0.class, "emitState", "emitState(Lone/me/profile/viewmodel/logic/Profile$State;)V", 4, 0), 5), ((osa) ((gaf) f2.getValue())).a()), d14);
        bs0.K(bs0.F(new ps5(new dtc(a.d), new wq0(2, this, yq0.class, "handleProfileEvent", "handleProfileEvent(Lone/me/profile/viewmodel/logic/DialogProfileEvent;)V", 4, 1), 5), ((osa) ((gaf) f2.getValue())).a()), d14);
    }

    public final Object B(Continuation continuation) {
        Long i2 = i();
        if (i2 == null) {
            return Unit.INSTANCE;
        }
        Object a = ((jje) this.h.getValue()).a(i2.longValue(), continuation);
        return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Unit.INSTANCE;
    }

    public final Object C(Continuation continuation) {
        Long i2 = i();
        if (i2 == null) {
            return Unit.INSTANCE;
        }
        Object a = ((h4f) this.i.getValue()).a(i2.longValue(), continuation);
        return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Unit.INSTANCE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x01ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.fwb E(defpackage.vk3 r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            java.lang.String r2 = r25.m()
            java.lang.String r2 = defpackage.hhf.c(r2)
            long r4 = r25.r()
            java.lang.String r9 = r25.f()
            java.lang.CharSequence r10 = r25.q()
            int r3 = defpackage.lxa.W
            igf r11 = new igf
            r11.<init>(r3)
            java.util.List r7 = r25.v()
            kl0 r3 = defpackage.kl0.b
            java.lang.String r8 = r1.t(r3)
            boolean r3 = r25.w()
            r15 = 1
            r18 = 0
            if (r3 != 0) goto L_0x003c
            int r3 = r25.n()
            if (r3 == 0) goto L_0x0039
            goto L_0x003c
        L_0x0039:
            r13 = r18
            goto L_0x003d
        L_0x003c:
            r13 = r15
        L_0x003d:
            mgf r12 = new mgf
            r12.<init>(r2)
            boolean r14 = r25.z()
            owb r2 = new owb
            r6 = 0
            r3 = r2
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            kotlin.Lazy r3 = r0.c
            java.lang.Object r3 = r3.getValue()
            ind r3 = (defpackage.ind) r3
            a32 r4 = r24.F()
            r3.getClass()
            java.util.List r5 = kotlin.collections.CollectionsKt.createListBuilder()
            r3.b(r5, r1, r4)
            yva r16 = r3.a()
            yva r3 = r3.a()
            java.lang.CharSequence r17 = r1.o(r3)
            r16.getClass()
            r20 = 0
            r23 = 1
            r19 = 1
            r21 = 1
            r22 = 0
            java.lang.CharSequence r1 = r16.a(r17, r18, r19, r20, r21, r22, r23)
            if (r1 == 0) goto L_0x0098
            int r3 = r1.length()
            if (r3 != 0) goto L_0x0089
            goto L_0x0098
        L_0x0089:
            int r3 = defpackage.lxa.F
            n3c r4 = new n3c
            igf r6 = new igf
            r6.<init>(r3)
            r4.<init>(r1, r6)
            r5.add(r4)
        L_0x0098:
            e3c r1 = new e3c
            r1.<init>()
            r5.add(r1)
            java.util.List r1 = kotlin.collections.CollectionsKt.build(r5)
            kotlin.Lazy r3 = r0.b
            java.lang.Object r3 = r3.getValue()
            gw0 r3 = (defpackage.gw0) r3
            a32 r4 = r24.F()
            kotlin.Lazy r0 = r0.k
            java.lang.Object r0 = r0.getValue()
            bud r0 = (defpackage.bud) r0
            akd r0 = (defpackage.akd) r0
            r0.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r5 = ru.ok.tamtam.android.prefs.PmsKey.f11botcomplaintenabled
            r6 = 0
            boolean r0 = r0.m(r5, r6)
            r3.getClass()
            if (r4 == 0) goto L_0x017f
            m72 r5 = r4.b
            long r6 = r5.a
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L_0x017f
            boolean r6 = r4.h0()
            if (r6 == 0) goto L_0x00e1
            k72 r5 = r5.c
            k72 r6 = defpackage.k72.o
            if (r5 != r6) goto L_0x00e1
            goto L_0x017f
        L_0x00e1:
            boolean r0 = r4.h0()
            a89 r5 = r4.c
            if (r0 == 0) goto L_0x0101
            if (r5 != 0) goto L_0x0101
            gqa r0 = defpackage.gw0.f()
            gqa r3 = defpackage.gw0.e()
            gqa r4 = defpackage.gw0.a()
            gqa[] r0 = new defpackage.gqa[]{r0, r3, r4}
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            goto L_0x019e
        L_0x0101:
            boolean r0 = r4.h0()
            if (r0 == 0) goto L_0x011d
            gqa r0 = defpackage.gw0.f()
            gqa r3 = defpackage.gw0.e()
            gqa r4 = defpackage.gw0.a()
            gqa[] r0 = new defpackage.gqa[]{r0, r3, r4}
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            goto L_0x019e
        L_0x011d:
            kotlin.Lazy r0 = r3.a
            if (r5 != 0) goto L_0x0150
            java.util.List r3 = kotlin.collections.CollectionsKt.createListBuilder()
            gqa r5 = defpackage.gw0.f()
            r3.add(r5)
            java.lang.Object r0 = r0.getValue()
            x23 r0 = (defpackage.x23) r0
            boolean r0 = r4.X(r0)
            if (r0 == 0) goto L_0x013d
            gqa r0 = defpackage.gw0.b()
            goto L_0x0141
        L_0x013d:
            gqa r0 = defpackage.gw0.c()
        L_0x0141:
            r3.add(r0)
            gqa r0 = defpackage.gw0.a()
            r3.add(r0)
            java.util.List r0 = kotlin.collections.CollectionsKt.build(r3)
            goto L_0x019e
        L_0x0150:
            java.util.List r3 = kotlin.collections.CollectionsKt.createListBuilder()
            gqa r5 = defpackage.gw0.f()
            r3.add(r5)
            java.lang.Object r0 = r0.getValue()
            x23 r0 = (defpackage.x23) r0
            boolean r0 = r4.X(r0)
            if (r0 == 0) goto L_0x016c
            gqa r0 = defpackage.gw0.b()
            goto L_0x0170
        L_0x016c:
            gqa r0 = defpackage.gw0.c()
        L_0x0170:
            r3.add(r0)
            gqa r0 = defpackage.gw0.a()
            r3.add(r0)
            java.util.List r0 = kotlin.collections.CollectionsKt.build(r3)
            goto L_0x019e
        L_0x017f:
            java.util.List r3 = kotlin.collections.CollectionsKt.createListBuilder()
            gqa r4 = defpackage.gw0.f()
            r3.add(r4)
            gqa r4 = defpackage.gw0.e()
            r3.add(r4)
            if (r0 == 0) goto L_0x019a
            gqa r0 = defpackage.gw0.a()
            r3.add(r0)
        L_0x019a:
            java.util.List r0 = kotlin.collections.CollectionsKt.build(r3)
        L_0x019e:
            java.util.List r3 = kotlin.collections.CollectionsKt.createListBuilder()
            r4 = r0
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            r4 = r4 ^ r15
            if (r4 == 0) goto L_0x01b4
            a3c r4 = new a3c
            r4.<init>(r0)
            r3.add(r4)
        L_0x01b4:
            java.util.Collection r1 = (java.util.Collection) r1
            r3.addAll(r1)
            java.util.List r0 = kotlin.collections.CollectionsKt.build(r3)
            fwb r1 = new fwb
            r1.<init>(r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yq0.E(vk3):fwb");
    }

    public final a32 F() {
        return ((my2) ((qx2) this.g.getValue())).q(this.a);
    }

    public final void d() {
        io4 io4 = this.m;
        io4.b.f(io4);
    }

    public final String h() {
        vk3 vk3 = (vk3) ((eu3) this.f.getValue()).c(this.a).a.getValue();
        if (vk3 != null) {
            return vk3.j();
        }
        return null;
    }

    public final Long i() {
        a32 F = F();
        if (F != null) {
            return Long.valueOf(F.a);
        }
        return null;
    }

    public final Long j() {
        a32 F = F();
        if (F != null) {
            return Long.valueOf(F.b.a);
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
        return ((my2) ((qx2) this.g.getValue())).u(this.a, continuation);
    }

    public final pa4 x() {
        wc8 wc8 = txb.b;
        r4c.b.getClass();
        return new pa4(":profile/avatars?id=" + this.a + "&type=contact");
    }

    public final List z() {
        nxb nxb = (nxb) this.l.getValue();
        a32 F = F();
        akd akd = (akd) ((bud) this.k.getValue());
        akd.getClass();
        boolean m2 = akd.m(PmsKey.f11botcomplaintenabled, false);
        nxb.getClass();
        Lazy lazy = nxb.c;
        if (F != null) {
            m72 m72 = F.b;
            if (m72.a != 0 && (!F.h0() || m72.c != k72.o)) {
                boolean h0 = F.h0();
                Lazy lazy2 = nxb.f;
                a89 a89 = F.c;
                if (!h0 || a89 != null) {
                    boolean h02 = F.h0();
                    Lazy lazy3 = nxb.b;
                    if (h02) {
                        List createListBuilder = CollectionsKt.createListBuilder();
                        createListBuilder.add(nxb.a());
                        createListBuilder.add((ow3) lazy3.getValue());
                        if (m2) {
                            createListBuilder.add((ow3) lazy.getValue());
                        }
                        createListBuilder.add((ow3) lazy2.getValue());
                        return CollectionsKt.build(createListBuilder);
                    }
                    Lazy lazy4 = nxb.h;
                    Lazy lazy5 = nxb.d;
                    if (a89 == null) {
                        List createListBuilder2 = CollectionsKt.createListBuilder();
                        createListBuilder2.add(nxb.a());
                        if (m2) {
                            createListBuilder2.add((ow3) lazy.getValue());
                        }
                        createListBuilder2.add((ow3) lazy5.getValue());
                        createListBuilder2.add((ow3) lazy4.getValue());
                        return CollectionsKt.build(createListBuilder2);
                    }
                    List createListBuilder3 = CollectionsKt.createListBuilder();
                    createListBuilder3.add(nxb.a());
                    createListBuilder3.add((ow3) lazy3.getValue());
                    if (m2) {
                        createListBuilder3.add((ow3) lazy.getValue());
                    }
                    createListBuilder3.add((ow3) lazy5.getValue());
                    createListBuilder3.add((ow3) lazy4.getValue());
                    return CollectionsKt.build(createListBuilder3);
                }
                List createListBuilder4 = CollectionsKt.createListBuilder();
                createListBuilder4.add(nxb.a());
                if (m2) {
                    createListBuilder4.add((ow3) lazy.getValue());
                }
                createListBuilder4.add((ow3) lazy2.getValue());
                return CollectionsKt.build(createListBuilder4);
            }
        }
        List createListBuilder5 = CollectionsKt.createListBuilder();
        if (m2) {
            createListBuilder5.add((ow3) lazy.getValue());
        }
        return CollectionsKt.build(createListBuilder5);
    }
}
