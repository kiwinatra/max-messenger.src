package defpackage;

import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* renamed from: v0f  reason: default package */
public final class v0f extends xag {
    public static final /* synthetic */ KProperty[] S0;
    public final Lazy A0;
    public v1f B0 = v1f.g;
    public final xme C0;
    public final etc D0;
    public final n6e E0;
    public final n6e F0;
    public final xme G0;
    public final xme H0;
    public final xme I0;
    public final etc J0;
    public final xme K0;
    public final xme L0;
    public final wie M0;
    public final wie N0;
    public b33 O0;
    public l72 P0;
    public l15 Q0;
    public Function2 R0;
    public final Lazy X;
    public final Lazy Y;
    public final Lazy Z;
    public final ome b;
    public final Lazy c;
    public final Lazy o;
    public final Function0 v;
    public final Lazy v0;
    public final i69 w;
    public final Lazy w0;
    public final Lazy x;
    public final Lazy x0;
    public final Lazy y;
    public final Lazy y0;
    public final Lazy z;
    public final Lazy z0;

    static {
        Class<v0f> cls = v0f.class;
        S0 = new KProperty[]{rae.s(cls, "loadingJob", "getLoadingJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "processTextJob", "getProcessTextJob()Lkotlinx/coroutines/Job;", 0)};
    }

    public v0f(etc etc, Function0 function0, i69 i69) {
        Lazy lazy = rjd.i0;
        Lazy lazy2 = rjd.G1;
        Lazy lazy3 = rjd.k;
        Lazy lazy4 = rjd.R;
        Lazy lazy5 = rjd.F;
        Lazy lazy6 = rjd.w;
        Lazy lazy7 = rjd.G0;
        Lazy lazy8 = rjd.N;
        Lazy lazy9 = rjd.M;
        Lazy lazy10 = rjd.j;
        Lazy lazy11 = rjd.l0;
        Lazy lazy12 = rjd.t0;
        Lazy lazy13 = rjd.Q;
        Lazy lazy14 = rjd.r;
        this.b = etc;
        this.c = lazy;
        this.o = lazy2;
        this.v = function0;
        this.w = i69;
        this.x = lazy14;
        this.y = lazy8;
        this.z = lazy3;
        this.X = lazy4;
        this.Y = lazy6;
        this.Z = lazy5;
        this.v0 = lazy7;
        this.w0 = lazy9;
        this.x0 = lazy10;
        this.y0 = lazy11;
        this.z0 = lazy12;
        this.A0 = lazy13;
        xme a = f6e.a((Object) null);
        this.C0 = a;
        this.D0 = new etc(a);
        n6e b2 = m5a.b(0, 0, (cu0) null, 7);
        this.E0 = b2;
        this.F0 = b2;
        xme a2 = f6e.a((Object) null);
        this.G0 = a2;
        this.H0 = f6e.a(0);
        xme a3 = f6e.a((Object) null);
        this.I0 = a3;
        this.J0 = new etc(a3);
        xme a4 = f6e.a((Object) null);
        this.K0 = a4;
        this.L0 = a4;
        this.M0 = o5a.U();
        this.N0 = o5a.U();
        bs0.K(new ps5(a2, new r0f(this, (Continuation) null), 5), this.a);
    }

    public final void j(int i, String str) {
        b33 b33;
        l15 l15;
        xme xme;
        Object value;
        l72 l72 = this.P0;
        if (l72 != null && (b33 = this.O0) != null && (l15 = this.Q0) != null) {
            if (str == null || StringsKt.isBlank(str)) {
                this.B0 = v1f.g;
                do {
                    xme = this.C0;
                    value = xme.getValue();
                    h0f h0f = (h0f) value;
                } while (!xme.b(value, (Object) null));
                return;
            }
            aje v2 = ev0.v(this.a, ((osa) ((gaf) this.y.getValue())).b(), (f14) null, new t0f(this, str, i, l72, b33, l15, (Continuation) null), 2);
            this.M0.setValue(this, S0[0], v2);
        }
    }

    public final void k(CharSequence charSequence) {
        if (charSequence != null && !StringsKt.isBlank(charSequence)) {
            aje v2 = ev0.v(this.a, (CoroutineContext) null, (f14) null, new u0f(this, charSequence, (Continuation) null), 3);
            this.N0.setValue(this, S0[1], v2);
        }
    }
}
