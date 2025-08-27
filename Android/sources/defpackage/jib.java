package defpackage;

import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* renamed from: jib  reason: default package */
public final class jib extends xag {
    public static final /* synthetic */ KProperty[] D0 = {rae.s(jib.class, "searchJob", "getSearchJob()Lkotlinx/coroutines/Job;", 0)};
    public final xme A0;
    public final xme B0;
    public volatile jz9 C0;
    public final Lazy X;
    public final Lazy Y;
    public final wie Z = o5a.U();
    public final String b;
    public final dt2 c;
    public final cp3 o;
    public final x23 v;
    public final etc v0;
    public final Function0 w;
    public final xme w0;
    public final Lazy x;
    public final etc x0;
    public final Lazy y;
    public final xme y0;
    public final Lazy z;
    public final etc z0;

    /* JADX WARNING: type inference failed for: r10v4, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    public jib(String str, wt2 wt2, cp3 cp3, x23 x23, uib uib, gaf gaf, Lazy lazy, Lazy lazy2, Lazy lazy3) {
        cs2 cs2 = cs2.a;
        Lazy h = cs2.getAccessor().h(bud.class);
        Lazy h2 = cs2.getAccessor().h(edd.class);
        this.b = str;
        this.c = wt2;
        this.o = cp3;
        this.v = x23;
        this.w = uib;
        this.x = lazy;
        this.y = lazy2;
        this.z = lazy3;
        this.X = h;
        this.Y = h2;
        xme a = f6e.a(CollectionsKt.emptyList());
        this.v0 = new etc(a);
        xme a2 = f6e.a(Boolean.TRUE);
        this.w0 = a2;
        this.x0 = new etc(a2);
        xme a3 = f6e.a((Object) null);
        this.y0 = a3;
        this.z0 = new etc(a3);
        this.A0 = f6e.a(0L);
        xme a4 = f6e.a(CollectionsKt.emptyList());
        this.B0 = a4;
        this.C0 = xa8.a();
        osa osa = (osa) gaf;
        bs0.K(bs0.F(new ps5(new fib(new i21(wt2.w0, a4, new x2(this, (Continuation) null, 20), 4), this, 1), new zqa(a, 6), 5), osa.a()), this.a);
        String f = ((a33) x23).f("user.Phone", (String) null);
        StringBuilder sb = new StringBuilder();
        int length = f.length();
        for (int i = 0; i < length; i++) {
            char charAt = f.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        Long longOrNull = StringsKt.toLongOrNull(sb.toString());
        bs0.K(bs0.F(new ps5(new va1(4, new i21(this.o.c(), new ps5(new fib(new fib(this.A0, this, 0), this, 2), new SuspendLambda(2, (Continuation<Object>) null)), new gw2(3, (Continuation) null, 1), 4), new ew2(new ed7(8), 3), this, longOrNull), new zqa(5, (Object) this.B0), 5), osa.a()), this.a);
    }

    public static final hhb j(jib jib, xk2 xk2) {
        mgf mgf;
        igf igf;
        jib.getClass();
        Long l = xk2.A0;
        CharSequence charSequence = xk2.o;
        if (l != null && (charSequence == null || charSequence.length() == 0)) {
            igf = new igf(jra.G);
        } else if (charSequence != null) {
            mgf = new mgf(charSequence);
            ckb ckb = ckb.a;
            long j = xk2.a;
            dkb dkb = new dkb(j, ckb);
            return new hhb(j, xk2.B0, xk2.c, mgf, xk2.b, xk2.z, xk2.X, dkb, xk2.C0);
        } else {
            igf = null;
        }
        mgf = igf;
        ckb ckb2 = ckb.a;
        long j2 = xk2.a;
        dkb dkb2 = new dkb(j2, ckb2);
        return new hhb(j2, xk2.B0, xk2.c, mgf, xk2.b, xk2.z, xk2.X, dkb2, xk2.C0);
    }

    public final void i() {
        k().h = null;
    }

    public final fd8 k() {
        return (fd8) this.x.getValue();
    }
}
