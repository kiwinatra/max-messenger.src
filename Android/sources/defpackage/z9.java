package defpackage;

import kotlin.Lazy;
import kotlin.text.StringsKt;

/* renamed from: z9  reason: default package */
public final class z9 extends gh4 {
    public final /* synthetic */ int d;
    public final long e;
    public final Lazy f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z9(long j, Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, int i) {
        super(lazy2, lazy3, lazy4);
        this.d = i;
        this.e = j;
        this.f = lazy;
    }

    public ngf a(vk3 vk3) {
        switch (this.d) {
            case 1:
                a32 g = g();
                if (g == null) {
                    return null;
                }
                long r = vk3.r();
                String str = (g.E() && g.G(r)) ? ((v62) g.b.R.get(Long.valueOf(r))).d : null;
                if (str != null && !StringsKt.isBlank(str)) {
                    return new mgf(str);
                }
                if (g.Z(vk3.r())) {
                    return new igf(lxa.l2);
                }
                if (g.G(vk3.r())) {
                    return new igf(lxa.X1);
                }
                return null;
            default:
                return super.a(vk3);
        }
    }

    public ngf c(vk3 vk3) {
        switch (this.d) {
            case 0:
                if (vk3.w) {
                    return new igf(lxa.k2);
                }
                a32 a32 = (a32) ((my2) ((qx2) this.f.getValue())).o(this.e).a.getValue();
                return (a32 == null || !a32.G(vk3.r())) ? super.c(vk3) : new igf(lxa.i2);
            default:
                return super.c(vk3);
        }
    }

    public boolean d(vk3 vk3) {
        switch (this.d) {
            case 0:
                if (!vk3.w) {
                    a32 a32 = (a32) ((my2) ((qx2) this.f.getValue())).o(this.e).a.getValue();
                    if (a32 == null || !a32.G(vk3.r())) {
                        return true;
                    }
                }
                return false;
            default:
                return super.d(vk3);
        }
    }

    public boolean e(vk3 vk3) {
        a32 g;
        switch (this.d) {
            case 1:
                boolean z = vk3.r() != ((qjd) b()).s();
                a32 g2 = g();
                boolean z2 = g2 != null && !g2.Z(vk3.r());
                a32 g3 = g();
                boolean z3 = g3 != null && g3.t(((qjd) b()).s()) && (g = g()) != null && g.G(vk3.r());
                a32 g4 = g();
                boolean z4 = !(g4 != null && g4.G(vk3.r()));
                if (!z2 || !z) {
                    return false;
                }
                return z3 || z4;
            default:
                return super.e(vk3);
        }
    }

    public z29 f(vk3 vk3) {
        switch (this.d) {
            case 1:
                z29 f2 = super.f(vk3);
                a32 g = g();
                boolean z = false;
                if (g != null && g.Z(vk3.r())) {
                    z = true;
                }
                return z29.h(f2, z);
            default:
                return super.f(vk3);
        }
    }

    public a32 g() {
        return (a32) ((my2) ((qx2) this.f.getValue())).o(this.e).a.getValue();
    }
}
