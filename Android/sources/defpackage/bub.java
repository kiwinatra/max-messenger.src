package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: bub  reason: default package */
public final class bub extends vzf {
    public static final ztb v = new Object();
    public static final ew6 w = ryg.G();
    public aub o;
    public Executor p;
    public bwd q;
    public za7 r;
    public q3f s;
    public z3f t;
    public cwd u;

    public final void A(Rect rect) {
        this.i = rect;
        su1 c = c();
        q3f q3f = this.s;
        if (c != null && q3f != null) {
            ev0.E(new wt0(q3f, h(c, l(c)), b(), 5));
        }
    }

    public final void D() {
        cwd cwd = this.u;
        if (cwd != null) {
            cwd.b();
            this.u = null;
        }
        za7 za7 = this.r;
        if (za7 != null) {
            za7.a();
            this.r = null;
        }
        q3f q3f = this.s;
        if (q3f != null) {
            q3f.c();
            this.s = null;
        }
        this.t = null;
    }

    public final void E(aub aub) {
        ev0.g();
        Size size = null;
        if (aub == null) {
            this.o = null;
            this.c = 2;
            p();
            return;
        }
        this.o = aub;
        this.p = w;
        hc0 hc0 = this.g;
        if (hc0 != null) {
            size = hc0.a;
        }
        if (size != null) {
            F((cub) this.f, hc0);
            o();
        }
        n();
    }

    public final void F(cub cub, hc0 hc0) {
        Rect rect;
        hc0 hc02 = hc0;
        ev0.g();
        su1 c = c();
        Objects.requireNonNull(c);
        D();
        Rect rect2 = null;
        bs0.r((String) null, this.s == null);
        Matrix matrix = this.j;
        boolean l = c.l();
        Size size = hc02.a;
        Rect rect3 = this.i;
        if (rect3 != null) {
            rect = rect3;
        } else {
            if (size != null) {
                rect2 = new Rect(0, 0, size.getWidth(), size.getHeight());
            }
            rect = rect2;
        }
        Objects.requireNonNull(rect);
        q3f q3f = new q3f(1, 34, hc0, matrix, l, rect, h(c, l(c)), b(), c.l() && l(c));
        this.s = q3f;
        q3f.a(new o99(19, this));
        z3f d = this.s.d(c, true);
        this.t = d;
        this.r = d.l;
        if (this.o != null) {
            su1 c2 = c();
            q3f q3f2 = this.s;
            if (!(c2 == null || q3f2 == null)) {
                ev0.E(new wt0(q3f2, h(c2, l(c2)), b(), 5));
            }
            aub aub = this.o;
            aub.getClass();
            z3f z3f = this.t;
            z3f.getClass();
            this.p.execute(new sx8(26, aub, z3f));
        }
        bwd d2 = bwd.d(cub, hc02.a);
        u40 u40 = d2.b;
        u40.getClass();
        ((pz9) u40.f).f(bx1.k, hc02.c);
        int V = cub.V();
        if (V != 0) {
            u40.getClass();
            if (V != 0) {
                ((pz9) u40.f).f(zzf.s0, Integer.valueOf(V));
            }
        }
        je3 je3 = hc02.d;
        if (je3 != null) {
            u40.c(je3);
        }
        if (this.o != null) {
            d2.b(this.r, hc02.b, ((Integer) ((x97) this.f).k(x97.I, -1)).intValue());
        }
        cwd cwd = this.u;
        if (cwd != null) {
            cwd.b();
        }
        cwd cwd2 = new cwd(new b87(3, this));
        this.u = cwd2;
        d2.f = cwd2;
        this.q = d2;
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{d2.c()}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        C(Collections.unmodifiableList(arrayList));
    }

    public final zzf f(boolean z, c0g c0g) {
        v.getClass();
        cub cub = ztb.a;
        je3 a = c0g.a(cub.O(), 1);
        if (z) {
            a = je3.L(a, cub);
        }
        if (a == null) {
            return null;
        }
        return new cub(c5b.a(((d87) k(a)).b));
    }

    public final Set j() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    public final yzf k(je3 je3) {
        return new d87(pz9.d(je3), 2);
    }

    public final zzf s(qu1 qu1, yzf yzf) {
        ((pz9) yzf.q()).f(m97.D, 34);
        return yzf.s();
    }

    public final String toString() {
        return "Preview:".concat(g());
    }

    public final hc0 v(je3 je3) {
        this.q.a(je3);
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{this.q.c()}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        C(Collections.unmodifiableList(arrayList));
        q13 a = this.g.a();
        a.v = je3;
        return a.h();
    }

    public final hc0 w(hc0 hc0, hc0 hc02) {
        F((cub) this.f, hc0);
        return hc0;
    }

    public final void x() {
        D();
    }
}
