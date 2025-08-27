package defpackage;

import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.io.ConstantsKt;

/* renamed from: ayb  reason: default package */
public final class ayb implements lwb {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;

    public ayb(Lazy lazy, Lazy lazy2, Lazy lazy3) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
    }

    public final Object a(vk3 vk3, a32 a32, cyb cyb, eyb eyb, Long l, Continuation continuation) {
        vk3 vk32 = vk3;
        cyb cyb2 = cyb;
        List createListBuilder = CollectionsKt.createListBuilder();
        boolean z = true;
        int i = ((ptb) this.a.getValue()).b(vk3.r()).a;
        boolean z2 = i == 10 || i == 20 || i == 40;
        String t = vk32.t(kl0.c);
        String str = t == null ? "" : t;
        CharSequence d = ((rtb) ((ttb) this.b.getValue()).a.getValue()).d(vk32, true);
        boolean s = a32.s();
        if (cyb2.a || !s) {
            z = false;
        }
        long r = vk3.r();
        String f = vk3.f();
        createListBuilder.add(new lo3(r, f == null ? "" : f, new mgf(d), str, z2, vk3.q(), eyb, 536903680, false, 256));
        int i2 = fxa.S;
        s1e s1e = r7;
        s1e s1e2 = new s1e((long) i2, 0, new igf(ixa.k1), (h1e) null, (ngf) null, (Integer) null, new d1e(cyb2.a, s), (y0e) null, (ngf) null, 0, 920);
        createListBuilder.add(new p7(i2, s1e, -2147482624));
        createListBuilder.add(new nmd(new igf(ixa.v1), puf.o, ConstantsKt.DEFAULT_BLOCK_SIZE, 2));
        createListBuilder.add(new nmd(new igf(ixa.j1), (ogf) null, 2048, 6));
        int i3 = fxa.O;
        createListBuilder.add(new p7(i3, new s1e((long) i3, 0, new igf(ixa.s1), (h1e) null, (ngf) null, (Integer) null, new d1e(cyb2.b, z), (y0e) null, (ngf) null, 0, 920), 536871936));
        int i4 = fxa.P;
        createListBuilder.add(new p7(i4, new s1e((long) i4, 0, new igf(ixa.h1), (h1e) null, (ngf) null, (Integer) null, new d1e(cyb2.c, z), (y0e) null, (ngf) null, 0, 920), 1073742848));
        int i5 = fxa.F;
        createListBuilder.add(new p7(i5, new s1e((long) i5, 0, new igf(ixa.o1), (h1e) null, (ngf) null, (Integer) null, new d1e(cyb2.d, z), (y0e) null, (ngf) null, 0, 920), 1073742848));
        int i6 = fxa.N;
        createListBuilder.add(new p7(i6, new s1e((long) i6, 0, new igf(ixa.r1), (h1e) null, (ngf) null, (Integer) null, new d1e(cyb2.e, z), (y0e) null, (ngf) null, 0, 920), -2147482624));
        createListBuilder.add(new nmd(ngf.a, (ogf) null, 0, 14));
        if (s && eyb == eyb.CHANGE_ADMIN) {
            int i7 = fxa.D;
            createListBuilder.add(new p7(i7, new s1e((long) i7, 0, new igf(ixa.e), (h1e) null, (ngf) null, Boxing.boxInt(cad.T0), a1e.a, (y0e) null, (ngf) null, 0, 920), 1024));
            createListBuilder.add(new vl4(new igf(ixa.V0)));
        }
        return CollectionsKt.build(createListBuilder);
    }

    public final Object b(vk3 vk3, a32 a32, cyb cyb, eyb eyb, Long l, Continuation continuation) {
        vk3 vk32 = vk3;
        cyb cyb2 = cyb;
        List createListBuilder = CollectionsKt.createListBuilder();
        boolean z = true;
        int i = ((ptb) this.a.getValue()).b(vk3.r()).a;
        boolean z2 = i == 10 || i == 20 || i == 40;
        String t = vk32.t(kl0.c);
        String str = "";
        String str2 = t == null ? str : t;
        CharSequence d = ((rtb) ((ttb) this.b.getValue()).a.getValue()).d(vk32, true);
        boolean s = a32.s();
        boolean z3 = !cyb2.a && s;
        boolean z4 = cyb2.e;
        if (!z3 || !z4) {
            z = false;
        }
        long r = vk3.r();
        String f = vk3.f();
        if (f != null) {
            str = f;
        }
        boolean z5 = z4;
        String str3 = str;
        boolean z6 = z3;
        boolean z7 = z;
        boolean z8 = s;
        createListBuilder.add(new lo3(r, str3, new mgf(d), str2, z2, vk3.q(), eyb, 536903680, false, 256));
        int i2 = fxa.S;
        s1e s1e = r8;
        s1e s1e2 = new s1e((long) i2, 0, new igf(ixa.k1), (h1e) null, (ngf) null, (Integer) null, new d1e(cyb2.a, z8), (y0e) null, (ngf) null, 0, 920);
        createListBuilder.add(new p7(i2, s1e, -2147482624));
        createListBuilder.add(new nmd(new igf(ixa.l1), puf.o, ConstantsKt.DEFAULT_BLOCK_SIZE, 2));
        createListBuilder.add(new nmd(new igf(ixa.j1), (ogf) null, 2048, 6));
        int i3 = fxa.O;
        createListBuilder.add(new p7(i3, new s1e((long) i3, 0, new igf(ixa.b1), (h1e) null, (ngf) null, (Integer) null, new d1e(cyb2.b, z6), (y0e) null, (ngf) null, 0, 920), 536871936));
        int i4 = fxa.P;
        int i5 = 1073742848;
        createListBuilder.add(new p7(i4, new s1e((long) i4, 0, new igf(ixa.h1), (h1e) null, (ngf) null, (Integer) null, new d1e(cyb2.c, z6), (y0e) null, (ngf) null, 0, 920), 1073742848));
        int i6 = fxa.F;
        createListBuilder.add(new p7(i6, new s1e((long) i6, 0, new igf(ixa.M0), (h1e) null, (ngf) null, (Integer) null, new d1e(cyb2.d, z6), (y0e) null, (ngf) null, 0, 920), 1073742848));
        int i7 = fxa.N;
        s1e s1e3 = new s1e((long) i7, 0, new igf(ixa.a1), (h1e) null, (ngf) null, (Integer) null, new d1e(z5, z6), (y0e) null, (ngf) null, 0, 920);
        Lazy lazy = this.c;
        if (!((vj5) ((uj5) lazy.getValue())).n()) {
            i5 = -2147482624;
        }
        createListBuilder.add(new p7(i7, s1e3, i5));
        if (((vj5) ((uj5) lazy.getValue())).n()) {
            int i8 = fxa.M;
            createListBuilder.add(new p7(i8, new s1e((long) i8, 0, new igf(ixa.Z0), (h1e) null, (ngf) null, (Integer) null, new d1e(cyb2.f, z7), (y0e) null, (ngf) null, 0, 920), -2147482624));
        }
        createListBuilder.add(new nmd(ngf.a, (ogf) null, 0, 14));
        if (z8 && eyb == eyb.CHANGE_ADMIN) {
            int i9 = fxa.D;
            createListBuilder.add(new p7(i9, new s1e((long) i9, 0, new igf(ixa.e), (h1e) null, (ngf) null, Boxing.boxInt(cad.T0), a1e.a, (y0e) null, (ngf) null, 0, 920), 1024));
            createListBuilder.add(new vl4(new igf(ixa.V0)));
        }
        return CollectionsKt.build(createListBuilder);
    }
}
