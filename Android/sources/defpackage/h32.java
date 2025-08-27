package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.ArraysKt;

/* renamed from: h32  reason: default package */
public final class h32 extends gh4 {
    public final long d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public final Lazy h = LazyKt.lazy(new nm1(4, this));

    public h32(long j, Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6) {
        super(lazy3, lazy4, lazy5);
        this.d = j;
        this.e = lazy;
        this.f = lazy2;
        this.g = lazy6;
    }

    public final ngf c(vk3 vk3) {
        String f2;
        a32 g2 = g();
        Long e2 = g2 != null ? g2.e(vk3.r()) : null;
        if (vk3.w) {
            return new igf(lxa.k2);
        }
        long s = ((qjd) b()).s();
        Lazy lazy = this.h;
        if (e2 != null && e2.longValue() == s) {
            return new igf(((Boolean) lazy.getValue()).booleanValue() ? lxa.S : lxa.j2);
        }
        a32 g3 = g();
        if (g3 != null && g3.Z(vk3.r()) && ((Boolean) lazy.getValue()).booleanValue()) {
            a32 g4 = g();
            return new igf((g4 == null || !g4.K()) ? lxa.n2 : lxa.m2);
        } else if (e2 == null || !((Boolean) lazy.getValue()).booleanValue()) {
            return super.c(vk3);
        } else {
            vk3 vk32 = (vk3) ((eu3) this.f.getValue()).c(e2.longValue()).a.getValue();
            return (vk32 == null || (f2 = vk32.f()) == null) ? super.c(vk3) : new kgf(lxa.R, ArraysKt.toList((T[]) new Object[]{f2}));
        }
    }

    public final boolean e(vk3 vk3) {
        a32 g2;
        boolean z = vk3.r() != ((qjd) b()).s();
        a32 g3 = g();
        boolean z2 = g3 != null && !g3.Z(vk3.r());
        a32 g4 = g();
        boolean z3 = g4 != null && g4.t(((qjd) b()).s()) && (g2 = g()) != null && g2.G(vk3.r());
        a32 g5 = g();
        boolean z4 = !(g5 != null && g5.G(vk3.r()));
        if (!z2 || !z) {
            return false;
        }
        return z3 || z4;
    }

    public final z29 f(vk3 vk3) {
        z29 f2 = super.f(vk3);
        a32 g2 = g();
        boolean z = false;
        if (g2 != null && g2.Z(vk3.r())) {
            z = true;
        }
        return z29.h(f2, z);
    }

    public final a32 g() {
        return (a32) ((my2) ((qx2) this.e.getValue())).o(this.d).a.getValue();
    }
}
