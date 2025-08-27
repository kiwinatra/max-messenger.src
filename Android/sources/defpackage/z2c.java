package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.io.ConstantsKt;
import kotlin.reflect.KProperty;
import kotlin.uuid.Uuid;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: z2c  reason: default package */
public final class z2c extends xag {
    public static final /* synthetic */ KProperty[] C0 = {rae.s(z2c.class, "getChatLinkJob", "getGetChatLinkJob()Lkotlinx/coroutines/Job;", 0)};
    public final s85 A0;
    public final s85 B0;
    public final Lazy X;
    public final r1c Y;
    public final wie Z = o5a.U();
    public final long b;
    public final Lazy c;
    public final Lazy o;
    public final Lazy v;
    public final AtomicLong v0 = new AtomicLong();
    public final Lazy w;
    public final AtomicLong w0 = new AtomicLong(-9223372036854775807L);
    public final n6e x;
    public final AtomicBoolean x0 = new AtomicBoolean(false);
    public final Lazy y;
    public final xme y0;
    public final Lazy z;
    public final etc z0;

    public z2c(long j, Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6, Lazy lazy7) {
        long j2 = j;
        this.b = j2;
        this.c = lazy2;
        this.o = lazy3;
        this.v = lazy4;
        this.w = lazy5;
        n6e b2 = m5a.b(0, 0, (cu0) null, 7);
        this.x = b2;
        this.y = lazy;
        this.z = lazy6;
        this.X = lazy7;
        r1c r1c = (r1c) jxb.a.getAccessor().g(r1c.class);
        this.Y = r1c;
        g12 M = bs0.M(new on2(b2, 28), new v2c(((mi0) lazy5.getValue()).b, this, 1));
        xme a = f6e.a(CollectionsKt.emptyList());
        this.y0 = a;
        this.z0 = new etc(a);
        this.A0 = new s85(0);
        this.B0 = new s85(0);
        bs0.K(bs0.F(new v2c(new ps5(new sbd(new y2c(new on2(((my2) ((qx2) lazy2.getValue())).o(j2), 28), (Continuation) null, this)), new o2c(this, (Continuation) null), 5), this, 0), ((osa) ((gaf) lazy3.getValue())).a()), this.a);
        bs0.K(bs0.F(new ps5(M, new p2c(2, this, z2c.class, "handleApiError", "handleApiError(Lone/me/profile/screens/invite/CreateLinkErrors;)V", 4, 0), 5), ((osa) ((gaf) lazy3.getValue())).a()), this.a);
        bs0.K(new ps5(new dtc(r1c.b), new q2c(this, (Continuation) null), 5), this.a);
    }

    public final void i() {
        r1c r1c = this.Y;
        r1c.a.f(r1c);
        KProperty[] kPropertyArr = C0;
        KProperty kProperty = kPropertyArr[0];
        wie wie = this.Z;
        pm7 pm7 = (pm7) wie.getValue(this, kProperty);
        if (pm7 != null) {
            pm7.b((CancellationException) null);
        }
        wie.setValue(this, kPropertyArr[0], (Object) null);
    }

    public final void j(a32 a32) {
        ngf ngf;
        a32 a322 = a32;
        List createListBuilder = CollectionsKt.createListBuilder();
        createListBuilder.add(new c3c(a322.b.r0 == 2 ? lxa.f1 : a32.L() ? lxa.S0 : lxa.Q0, (ogf) null, 6));
        m72 m72 = a322.b;
        String str = m72.I;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        createListBuilder.add(new h3c(new xa2(a322.h(kl0.c, jl0.a), m72.a, a32.r(), str2, !this.x0.get() && str2.length() == 0, a32.a0(), ld9.F(a322.f(((qjd) ((x23) this.X.getValue())).s()), Uuid.SIZE_BITS))));
        createListBuilder.add(new c3c(lxa.T0, puf.o, 2));
        int i = jxa.P;
        s1e s1e = new s1e((long) i, 0, new igf(lxa.a), (h1e) null, (ngf) null, Integer.valueOf(cad.X1), (f1e) null, (y0e) null, (ngf) null, 0, 984);
        String l = l();
        createListBuilder.add(new p3c(i, s1e, !(l == null || l.length() == 0), 536879104));
        int i2 = jxa.O;
        s1e s1e2 = new s1e((long) i2, 0, new igf(lxa.g1), (h1e) null, (ngf) null, Integer.valueOf(cad.Z1), (f1e) null, (y0e) null, (ngf) null, 0, 984);
        String l2 = l();
        createListBuilder.add(new p3c(i2, s1e2, !(l2 == null || l2.length() == 0), -2147475456));
        if (a32.L() && a32.e0()) {
            vj5 vj5 = (vj5) ((uj5) this.z.getValue());
            vj5.getClass();
            if (vj5.m(PmsKey.f33editchattypescreenenabled, false)) {
                int i3 = m72.r0;
                int i4 = i3 == 0 ? -1 : r2c.$EnumSwitchMapping$0[tr1.y(i3)];
                if (i4 == -1) {
                    ngf = ngf.a;
                } else if (i4 == 1) {
                    ngf = new igf(lxa.n);
                } else if (i4 == 2) {
                    ngf = new igf(lxa.m);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                int i5 = jxa.M;
                createListBuilder.add(new p3c(i5, new s1e((long) i5, 0, new igf(lxa.a1), (h1e) null, (ngf) null, Integer.valueOf(cad.f2), new b1e(ngf, (Integer) null), (y0e) null, (ngf) null, 0, 920), true, ConstantsKt.DEFAULT_BUFFER_SIZE));
            }
        }
        this.y0.setValue(CollectionsKt.build(createListBuilder));
    }

    public final a32 k() {
        return (a32) ((my2) ((qx2) this.c.getValue())).o(this.b).a.getValue();
    }

    public final String l() {
        m72 m72;
        String str;
        a32 k = k();
        if (k == null || (m72 = k.b) == null || (str = m72.I) == null || str.length() == 0) {
            return null;
        }
        return str;
    }
}
