package defpackage;

import android.util.Size;

/* renamed from: p3f  reason: default package */
public final class p3f extends lk4 {
    public final go1 n = m5a.F(new nqd(20, this));
    public do1 o;
    public lk4 p;
    public s3f q;

    public p3f(Size size, int i) {
        super(size, i);
    }

    public final void a() {
        super.a();
        ev0.E(new n3f(this, 2));
    }

    public final zz7 e() {
        return this.n;
    }

    public final boolean f(lk4 lk4, Runnable runnable) {
        boolean z;
        ev0.g();
        lk4.getClass();
        lk4 lk42 = this.p;
        boolean z2 = false;
        if (lk42 == lk4) {
            return false;
        }
        bs0.r("A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider", lk42 == null);
        Size size = this.h;
        Size size2 = lk4.h;
        bs0.m("The provider's size(" + size + ") must match the parent(" + size2 + ")", size.equals(size2));
        int i = lk4.i;
        int i2 = this.i;
        if (i2 == i) {
            z2 = true;
        }
        bs0.m(a81.l("The provider's format(", i2, ") must match the parent(", i, ")"), z2);
        synchronized (this.a) {
            z = this.c;
        }
        bs0.r("The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.", !z);
        this.p = lk4;
        hd8.N(lk4.c(), this.o);
        lk4.d();
        hd8.J(this.e).d(new kk4(lk4, 2), ryg.j());
        hd8.J(lk4.g).d(runnable, ryg.G());
        return true;
    }
}
