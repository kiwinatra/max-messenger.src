package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: cm3  reason: default package */
public final class cm3 extends rz1 {
    public final Lazy j;
    public final Lazy k;
    public final Lazy l;
    public final Lazy m;
    public final Lazy n;
    public final bs5 o;
    public final n6e p;
    public final dtc q;
    public final AtomicLong r = new AtomicLong();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cm3(long j2, d14 d14) {
        super(j2, d14);
        d14 d142 = d14;
        bzb bzb = bzb.a;
        Lazy e = bzb.e();
        Lazy h = bzb.getAccessor().h(eu3.class);
        Lazy lazy = LazyKt.lazy(new oq2(26));
        Lazy c = bzb.c();
        Lazy lazy2 = LazyKt.lazy(new oq2(27));
        Lazy h2 = bzb.getAccessor().h(mi0.class);
        this.j = e;
        this.k = h;
        this.l = lazy;
        this.m = c;
        this.n = h2;
        this.o = bs0.F(new i21(new on2(this.c, 28), this.d, xl3.a, 4), ((osa) ((gaf) e.getValue())).a());
        n6e b = m5a.b(0, 0, (cu0) null, 7);
        this.p = b;
        this.q = new dtc(b);
        bs0.K(bs0.F(new ps5(this.i, new pl3(this, (Continuation) null), 5), ((osa) ((gaf) e.getValue())).a()), d142);
        bs0.K(bs0.F(new ps5(new tl3(new sbd(new wl3(new on2(((eu3) h.getValue()).c(j2), 28), (Continuation) null, this)), this, 0), new wq0(2, this, cm3.class, "emitState", "emitState(Lone/me/profileedit/screens/changelink/ChangeLink$State;)V", 4, 10), 5), ((osa) ((gaf) e.getValue())).b()), d142);
        bs0.K(new ps5(new tl3(((mi0) h2.getValue()).b, this, 1), new zw(16, (Object) this), 5), d142);
        bs0.K(new ps5(new dtc(((szb) lazy2.getValue()).a), new ql3(this, (Continuation) null), 5), d142);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r7 = android.net.Uri.parse(r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.h02 m(defpackage.cm3 r6, defpackage.vk3 r7) {
        /*
            r6.getClass()
            h02 r6 = new h02
            vm3 r7 = r7.a
            um3 r7 = r7.c
            java.lang.String r7 = r7.p
            if (r7 == 0) goto L_0x0019
            android.net.Uri r7 = android.net.Uri.parse(r7)
            if (r7 == 0) goto L_0x0019
            java.lang.String r7 = r7.getLastPathSegment()
        L_0x0017:
            r2 = r7
            goto L_0x001b
        L_0x0019:
            r7 = 0
            goto L_0x0017
        L_0x001b:
            int r1 = defpackage.ixa.c2
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cm3.m(cm3, vk3):h02");
    }

    public final void b() {
    }

    public final bs5 f() {
        return this.o;
    }

    public final Object j(Continuation continuation) {
        h02 h02 = (h02) this.i.getValue();
        if (h02 == null) {
            return Unit.INSTANCE;
        }
        if (h02.e) {
            Object a = this.f.a(new gxb(h02.c, (Integer) null, 14), continuation);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Unit.INSTANCE;
        }
        String str = h02.b;
        String obj = str != null ? StringsKt.trim((CharSequence) str).toString() : null;
        if (obj == null || obj.length() == 0) {
            str = "$REMOVE$";
        }
        Object I = ev0.I(((osa) ((gaf) this.j.getValue())).b(), new yl3(this, str, (Continuation) null), continuation);
        return I == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? I : Unit.INSTANCE;
    }

    public final void k(String str) {
        ev0.v(this.b, ((osa) ((gaf) this.j.getValue())).c().t0(), (f14) null, new bm3(this, str, (Continuation) null), 2);
    }

    public final Object n(wz1 wz1, Continuation continuation) {
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
}
