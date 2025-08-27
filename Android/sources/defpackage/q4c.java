package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.reflect.KProperty;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: q4c  reason: default package */
public final class q4c extends xag {
    public static final /* synthetic */ KProperty[] A0 = {rae.s(q4c.class, "updateOptionsJob", "getUpdateOptionsJob()Lkotlinx/coroutines/Job;", 0)};
    public final n6e X;
    public final wie Y = o5a.U();
    public final n6e Z;
    public final long b;
    public final Lazy c;
    public final Lazy o;
    public final Lazy v;
    public final dtc v0;
    public final Lazy w;
    public final s85 w0;
    public final Lazy x;
    public final AtomicLong x0;
    public final Lazy y;
    public final xme y0;
    public final Lazy z;
    public qn7 z0;

    public q4c(long j, Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6, Lazy lazy7) {
        long j2 = j;
        this.b = j2;
        this.c = lazy;
        this.o = lazy2;
        this.v = lazy3;
        this.w = lazy4;
        this.x = lazy6;
        this.y = lazy5;
        this.z = lazy7;
        n6e b2 = m5a.b(0, 0, (cu0) null, 7);
        this.X = b2;
        g12 M = bs0.M(new l4c(((mi0) lazy4.getValue()).b, this, 1), new on2(b2, 28));
        n6e a = m5a.a(1, 1, cu0.b);
        this.Z = a;
        this.v0 = new dtc(a);
        this.w0 = new s85(0);
        this.x0 = new AtomicLong(-9223372036854775807L);
        this.y0 = f6e.a(new c4c(false, false, false, false, false));
        qm7 b3 = kv0.b();
        b3.h0();
        this.z0 = b3;
        bs0.K(bs0.F(new sbd(new o4c(new l4c(new on2(((my2) ((qx2) lazy.getValue())).o(j2), 28), this, 0), (Continuation) null, this)), ((osa) ((gaf) lazy2.getValue())).a()), this.a);
        bs0.K(bs0.F(new ps5(M, new g4c(this, (Continuation) null), 5), ((osa) ((gaf) lazy2.getValue())).a()), this.a);
    }

    public static final Object j(q4c q4c, c4c c4c, Continuation continuation) {
        q4c q4c2 = q4c;
        c4c c4c2 = c4c;
        q4c.getClass();
        List createListBuilder = CollectionsKt.createListBuilder();
        createListBuilder.add(new nmd(new igf(ixa.B1), (ogf) null, 0, 14));
        int i = fxa.n0;
        createListBuilder.add(new p7(i, new s1e((long) i, 0, new igf(ixa.z1), (h1e) null, (ngf) null, Boxing.boxInt(cad.s0), new d1e(c4c2.a, true), (y0e) null, (ngf) null, 0, 920), 536871936));
        int i2 = fxa.l0;
        igf igf = new igf(ixa.x1);
        Integer boxInt = Boxing.boxInt(cad.b);
        boolean z2 = c4c2.b;
        boolean z3 = z2;
        createListBuilder.add(new p7(i2, new s1e((long) i2, 0, igf, (h1e) null, (ngf) null, boxInt, new d1e(z2, true), (y0e) null, (ngf) null, 0, 920), 1073742848));
        int i3 = fxa.o0;
        createListBuilder.add(new p7(i3, new s1e((long) i3, 0, new igf(ixa.A1), (h1e) null, (ngf) null, Boxing.boxInt(cad.E1), new d1e(c4c2.c, true), (y0e) null, (ngf) null, 0, 920), 1073742848));
        Lazy lazy = q4c2.z;
        vj5 vj5 = (vj5) ((uj5) lazy.getValue());
        vj5.getClass();
        if (vj5.m(PmsKey.gce, false)) {
            int i4 = fxa.m0;
            createListBuilder.add(new p7(i4, new s1e((long) i4, 0, new igf(ixa.y1), (h1e) null, (ngf) null, Boxing.boxInt(cad.B1), new d1e(c4c2.d, true), (y0e) null, (ngf) null, 0, 920), 1073742848));
        }
        if (((vj5) ((uj5) lazy.getValue())).n()) {
            int i5 = fxa.p0;
            createListBuilder.add(new p7(i5, new s1e((long) i5, 0, new igf(ixa.C1), (h1e) null, (ngf) null, Boxing.boxInt(cad.h1), new d1e(c4c2.e, z3), (y0e) null, (ngf) null, 0, 920), 1073742848));
        }
        Object obj = createListBuilder.get(CollectionsKt.getLastIndex(createListBuilder));
        p7 p7Var = obj instanceof p7 ? (p7) obj : null;
        if (p7Var != null) {
            createListBuilder.set(CollectionsKt.getLastIndex(createListBuilder), new p7(p7Var.a, p7Var.b, -2147482624));
        }
        Object a = q4c2.Z.a(CollectionsKt.build(createListBuilder), continuation);
        return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Unit.INSTANCE;
    }

    public static final c4c k(q4c q4c, a32 a32) {
        q4c.getClass();
        b72 b72 = a32.b.H;
        boolean z2 = b72.i;
        return new c4c(!b72.b, !b72.d, b72.e, !b72.f, z2);
    }

    public final void l(HashMap hashMap) {
        aje u = ev0.u(this.a, ((osa) ((gaf) this.o.getValue())).b(), f14.b, new p4c(this, hashMap, (Continuation) null));
        this.Y.setValue(this, A0[0], u);
    }
}
