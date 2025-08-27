package defpackage;

import android.net.Uri;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* renamed from: h52  reason: default package */
public final class h52 extends rz1 {
    public static final /* synthetic */ KProperty[] y = {rae.s(h52.class, "generateLinkJob", "getGenerateLinkJob()Lkotlinx/coroutines/Job;", 0)};
    public final fzb j;
    public final Lazy k;
    public final Lazy l;
    public final Lazy m;
    public final Lazy n;
    public final Lazy o;
    public final Lazy p;
    public final bs5 q;
    public final n6e r;
    public final dtc s;
    public final wie t = o5a.U();
    public final AtomicLong u = new AtomicLong();
    public final AtomicLong v = new AtomicLong();
    public final AtomicLong w = new AtomicLong();
    public final AtomicBoolean x = new AtomicBoolean();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h52(long j2, d14 d14, fzb fzb) {
        super(j2, d14);
        bzb bzb = bzb.a;
        Lazy e = bzb.e();
        Lazy d = bzb.d();
        Lazy h = bzb.getAccessor().h(fz7.class);
        Lazy lazy = LazyKt.lazy(new lj1(28));
        Lazy c = bzb.c();
        Lazy lazy2 = LazyKt.lazy(new lj1(29));
        Lazy h2 = bzb.getAccessor().h(mi0.class);
        this.j = fzb;
        this.k = e;
        this.l = d;
        this.m = h;
        this.n = lazy;
        this.o = c;
        this.p = h2;
        this.q = bs0.F(new i21(new on2(this.c, 28), this.d, c52.a, 4), ((osa) ((gaf) e.getValue())).a());
        n6e b = m5a.b(0, 0, (cu0) null, 7);
        this.r = b;
        this.s = new dtc(b);
        bs0.K(bs0.F(new ps5(this.i, new l42(this, (Continuation) null), 5), ((osa) ((gaf) e.getValue())).a()), d14);
        bs0.K(bs0.F(new ps5(new x42(new ps5(new sbd(new b52(new on2(((my2) ((qx2) d.getValue())).o(j2), 28), (Continuation) null, this)), new m42(this, (Continuation) null), 5), this, 0), new n42(this, (Continuation) null), 5), ((osa) ((gaf) e.getValue())).b()), d14);
        bs0.K(new ps5(new x42(((mi0) h2.getValue()).b, this, 1), new zw(2, (Object) this), 5), d14);
        bs0.K(new ps5(new dtc(((szb) lazy2.getValue()).a), new j42(this, j2, (Continuation) null), 5), d14);
    }

    public static final void m(h52 h52, a32 a32) {
        h52.getClass();
        g02 t2 = t(a32);
        xme xme = h52.h;
        xme.getClass();
        xme.m((Object) null, t2);
        xme xme2 = h52.i;
        xme2.getClass();
        xme2.m((Object) null, t2);
        g02 g02 = (g02) xme2.getValue();
        if ((g02 != null ? g02.b : null) == f02.c) {
            xme2.m((Object) null, t2);
        }
        h52.d(h52.s());
    }

    public static g02 t(a32 a32) {
        String str;
        String str2;
        Object obj;
        Uri parse;
        ejd ejd = f02.a;
        int i = a32.b.r0;
        if (i == 1) {
            str = "PUBLIC";
        } else if (i == 2) {
            str = "PRIVATE";
        } else {
            throw null;
        }
        ejd.getClass();
        Iterator it = f02.v.iterator();
        while (true) {
            str2 = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual((Object) ((f02) obj).name(), (Object) str)) {
                break;
            }
        }
        f02 f02 = (f02) obj;
        if (f02 == null) {
            f02 = f02.c;
        }
        f02 f022 = f02.c;
        m72 m72 = a32.b;
        if (f02 == f022) {
            str2 = m72.I;
        } else {
            String str3 = m72.I;
            if (!(str3 == null || (parse = Uri.parse(str3)) == null)) {
                str2 = parse.getLastPathSegment();
            }
        }
        return new g02(f02, str2);
    }

    public final void a() {
        ev0.v(this.b, ((osa) p()).a(), (f14) null, new p42(this, (Continuation) null), 2);
    }

    public final void b() {
        KProperty[] kPropertyArr = y;
        KProperty kProperty = kPropertyArr[0];
        wie wie = this.t;
        pm7 pm7 = (pm7) wie.getValue(this, kProperty);
        if (pm7 != null) {
            pm7.b((CancellationException) null);
        }
        wie.setValue(this, kPropertyArr[0], (Object) null);
    }

    public final Object c(Continuation continuation) {
        Object n2 = n(continuation);
        return n2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? n2 : Unit.INSTANCE;
    }

    public final void e() {
        aje v2 = ev0.v(this.b, ((osa) p()).b(), (f14) null, new r42(this, true, (Continuation) null), 2);
        this.t.setValue(this, y[0], v2);
    }

    public final bs5 f() {
        return this.q;
    }

    public final void g(int i) {
        ev0.v(this.b, (CoroutineContext) null, (f14) null, new s42(i, this, (Continuation) null), 3);
    }

    public final void h(int i) {
        ev0.v(this.b, ((osa) p()).a(), (f14) null, new t42(i, this, (Continuation) null), 2);
    }

    public final void i(int i) {
        ev0.v(this.b, ((osa) p()).a(), (f14) null, new u42(i, this, (Continuation) null), 2);
    }

    public final Object j(Continuation continuation) {
        a32 o2 = o();
        if (o2 == null) {
            return Unit.INSTANCE;
        }
        g02 g02 = (g02) this.i.getValue();
        if (g02 == null) {
            return Unit.INSTANCE;
        }
        fzb fzb = fzb.CREATE;
        n6e n6e = this.f;
        if (this.j == fzb && o2.K() && Intrinsics.areEqual((Object) q(), (Object) Boxing.boxBoolean(false))) {
            Object a = n6e.a(new cxb(this.a), continuation);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Unit.INSTANCE;
        } else if (g02.f) {
            Object a2 = n6e.a(new gxb(g02.d, (Integer) null, 14), continuation);
            return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Unit.INSTANCE;
        } else {
            Object I = ev0.I(((osa) p()).b(), new d52(this, g02, o2, (Continuation) null), continuation);
            return I == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? I : Unit.INSTANCE;
        }
    }

    public final void k(String str) {
        ev0.v(this.b, ((osa) p()).c().t0(), (f14) null, new g52(this, str, (Continuation) null), 2);
    }

    public final void l(int i) {
        int i2 = fxa.i0;
        xme xme = this.i;
        xme xme2 = this.h;
        if (i == i2) {
            g02 g02 = (g02) xme2.getValue();
            f02 f02 = g02 != null ? g02.b : null;
            f02 f022 = f02.c;
            xme.setValue(f02 == f022 ? (g02) xme2.getValue() : new g02(f022, (String) null));
        } else if (i == fxa.j0) {
            g02 g022 = (g02) xme2.getValue();
            f02 f023 = g022 != null ? g022.b : null;
            f02 f024 = f02.b;
            xme.setValue(f023 == f024 ? (g02) xme2.getValue() : new g02(f024, (String) null));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object n(kotlin.coroutines.Continuation r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.q42
            if (r0 == 0) goto L_0x0013
            r0 = r11
            q42 r0 = (defpackage.q42) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            q42 r0 = new q42
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 6
            r4 = 0
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r2 == 0) goto L_0x004f
            if (r2 == r8) goto L_0x0048
            if (r2 == r7) goto L_0x0043
            if (r2 == r6) goto L_0x003d
            if (r2 != r5) goto L_0x0035
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x00a7
        L_0x0035:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003d:
            h52 r10 = r0.a
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0082
        L_0x0043:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x00f5
        L_0x0048:
            h52 r10 = r0.a
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x00d0
        L_0x004f:
            kotlin.ResultKt.throwOnFailure(r11)
            xme r11 = r10.i
            java.lang.Object r11 = r11.getValue()
            g02 r11 = (defpackage.g02) r11
            if (r11 != 0) goto L_0x005f
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        L_0x005f:
            f02 r2 = r11.b
            int r2 = r2.ordinal()
            n6e r9 = r10.f
            java.lang.String r11 = r11.c
            if (r2 == 0) goto L_0x00b0
            if (r2 != r8) goto L_0x00aa
            if (r11 != 0) goto L_0x0072
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        L_0x0072:
            axb r2 = new axb
            r2.<init>(r11)
            r0.a = r10
            r0.o = r6
            java.lang.Object r11 = r9.a(r2, r0)
            if (r11 != r1) goto L_0x0082
            return r1
        L_0x0082:
            boolean r11 = defpackage.b59.C()
            if (r11 == 0) goto L_0x00f8
            n6e r10 = r10.f
            gxb r11 = new gxb
            int r2 = defpackage.ixa.j2
            igf r6 = new igf
            r6.<init>(r2)
            int r2 = defpackage.cad.u
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r2)
            r11.<init>(r6, r2, r3)
            r0.a = r4
            r0.o = r5
            java.lang.Object r10 = r10.a(r11, r0)
            if (r10 != r1) goto L_0x00a7
            return r1
        L_0x00a7:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        L_0x00aa:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L_0x00b0:
            axb r2 = new axb
            kotlin.Lazy r5 = r10.m
            java.lang.Object r5 = r5.getValue()
            fz7 r5 = (defpackage.fz7) r5
            java.lang.String r5 = r5.e
            java.lang.String r6 = "/"
            java.lang.String r11 = defpackage.g63.i(r5, r6, r11)
            r2.<init>(r11)
            r0.a = r10
            r0.o = r8
            java.lang.Object r11 = r9.a(r2, r0)
            if (r11 != r1) goto L_0x00d0
            return r1
        L_0x00d0:
            boolean r11 = defpackage.b59.C()
            if (r11 == 0) goto L_0x00f8
            n6e r10 = r10.f
            gxb r11 = new gxb
            int r2 = defpackage.ixa.o2
            igf r5 = new igf
            r5.<init>(r2)
            int r2 = defpackage.cad.u
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r2)
            r11.<init>(r5, r2, r3)
            r0.a = r4
            r0.o = r7
            java.lang.Object r10 = r10.a(r11, r0)
            if (r10 != r1) goto L_0x00f5
            return r1
        L_0x00f5:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        L_0x00f8:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h52.n(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final a32 o() {
        return (a32) ((my2) ((qx2) this.l.getValue())).o(this.a).a.getValue();
    }

    public final gaf p() {
        return (gaf) this.k.getValue();
    }

    public final Boolean q() {
        g02 g02 = (g02) this.h.getValue();
        if (g02 != null) {
            return Boolean.valueOf(g02.b((i02) this.i.getValue()));
        }
        return null;
    }

    public final Object r(wz1 wz1, Continuation continuation) {
        boolean areEqual = Intrinsics.areEqual((Object) wz1, (Object) tz1.a);
        n6e n6e = this.f;
        if (areEqual) {
            Object a = n6e.a(new gxb(new igf(ixa.f2), new igf(ixa.d2), true, Boxing.boxInt(cad.K)), continuation);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Unit.INSTANCE;
        } else if (Intrinsics.areEqual((Object) wz1, (Object) uz1.a)) {
            Object a2 = n6e.a(new gxb(new igf(ixa.g2), new igf(ixa.e2), true, Boxing.boxInt(cad.K)), continuation);
            return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Unit.INSTANCE;
        } else if (wz1 instanceof sz1) {
            Object a3 = n6e.a(new gxb(((sz1) wz1).a, (Integer) null, 14), continuation);
            return a3 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a3 : Unit.INSTANCE;
        } else if (wz1 instanceof vz1) {
            Object a4 = n6e.a(new gxb(((vz1) wz1).a, (Integer) null, 14), continuation);
            return a4 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a4 : Unit.INSTANCE;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final qz1 s() {
        a32 o2 = o();
        return new qz1(new e02((o2 == null || !o2.K()) ? ixa.a2 : ixa.U1, false, true, false), ((xz1) this.g.getValue()).a(this));
    }
}
