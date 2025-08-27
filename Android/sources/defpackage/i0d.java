package defpackage;

import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;

/* renamed from: i0d  reason: default package */
public final class i0d implements frd, oh3 {
    public static final /* synthetic */ KProperty[] x0 = {rae.s(i0d.class, "registerJob", "getRegisterJob()Lkotlinx/coroutines/Job;", 0)};
    public final Lazy X;
    public final wie Y = o5a.U();
    public final n6e Z;
    public final /* synthetic */ abg a;
    public f0d b;
    public final d14 c;
    public final Function0 o;
    public final Lazy v;
    public final dtc v0;
    public final Lazy w;
    public final etc w0;
    public final Lazy x;
    public final Lazy y;
    public final Lazy z;

    public i0d(f0d f0d, d14 d14, s8a s8a, Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6, Lazy lazy7) {
        this.a = new abg(lazy2, new duc(1));
        this.b = f0d;
        this.c = d14;
        this.o = s8a;
        this.v = lazy4;
        this.w = lazy3;
        this.x = lazy;
        this.y = lazy5;
        this.z = lazy6;
        this.X = lazy7;
        n6e a2 = m5a.a(1, 1, cu0.b);
        this.Z = a2;
        this.v0 = new dtc(a2);
        this.w0 = new etc(f6e.a(onb.a));
    }

    public final void a(dqd dqd) {
        this.Z.d(dqd);
    }

    public final void b(fqd fqd) {
        pm7 a2 = this.a.a(this.c, ((osa) ((gaf) this.v.getValue())).b(), f14.b, new h0d(fqd, this, (Continuation) null));
        this.Y.setValue(this, x0[0], a2);
    }

    public final etc c() {
        return this.w0;
    }

    public final void d(q7a q7a) {
        this.Z.d(new dqd(q7a.c, q7a.b, q7a.a));
    }

    public final dtc e() {
        return this.a.o;
    }

    public final dtc f() {
        return this.v0;
    }

    public final jhf g() {
        return new jhf(nlc.oneme_login_neuro_avatars_title, nlc.oneme_login_neuro_avatars_description, nlc.oneme_login_neuro_avatars_continue_button);
    }
}
