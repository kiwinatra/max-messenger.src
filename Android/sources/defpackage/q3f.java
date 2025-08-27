package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: q3f  reason: default package */
public final class q3f {
    public final int a;
    public final Matrix b;
    public final boolean c;
    public final Rect d;
    public final boolean e;
    public final int f;
    public final hc0 g;
    public int h;
    public int i;
    public boolean j = false;
    public z3f k;
    public p3f l;
    public final HashSet m = new HashSet();
    public boolean n = false;
    public final ArrayList o = new ArrayList();

    public q3f(int i2, int i3, hc0 hc0, Matrix matrix, boolean z, Rect rect, int i4, int i5, boolean z2) {
        this.f = i2;
        this.a = i3;
        this.g = hc0;
        this.b = matrix;
        this.c = z;
        this.d = rect;
        this.i = i4;
        this.h = i5;
        this.e = z2;
        this.l = new p3f(hc0.a, i3);
    }

    public final void a(Runnable runnable) {
        ev0.g();
        b();
        this.m.add(runnable);
    }

    public final void b() {
        bs0.r("Edge is already closed.", !this.n);
    }

    public final void c() {
        ev0.g();
        this.l.a();
        this.n = true;
    }

    public final z3f d(su1 su1, boolean z) {
        ev0.g();
        b();
        hc0 hc0 = this.g;
        su1 su12 = su1;
        boolean z2 = z;
        z3f z3f = new z3f(hc0.a, su12, z2, hc0.b, hc0.c, new m3f(this, 0));
        try {
            za7 za7 = z3f.l;
            p3f p3f = this.l;
            Objects.requireNonNull(p3f);
            if (p3f.f(za7, new n3f(p3f, 0))) {
                hd8.J(p3f.e).d(new kk4((lk4) za7, 1), ryg.j());
            }
            this.k = z3f;
            f();
            return z3f;
        } catch (DeferrableSurface$SurfaceClosedException e2) {
            throw new AssertionError("Surface is somehow already closed", e2);
        } catch (RuntimeException e3) {
            z3f.d();
            throw e3;
        }
    }

    public final void e() {
        boolean z;
        ev0.g();
        b();
        p3f p3f = this.l;
        p3f.getClass();
        ev0.g();
        if (p3f.p == null) {
            synchronized (p3f.a) {
                z = p3f.c;
            }
            if (!z) {
                return;
            }
        }
        this.j = false;
        this.l.a();
        this.l = new p3f(this.g.a, this.a);
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final void f() {
        y3f y3f;
        Executor executor;
        ev0.g();
        oc0 oc0 = new oc0(this.d, this.i, this.h, this.c, this.b, this.e);
        z3f z3f = this.k;
        if (z3f != null) {
            synchronized (z3f.a) {
                z3f.m = oc0;
                y3f = z3f.n;
                executor = z3f.o;
            }
            if (!(y3f == null || executor == null)) {
                executor.execute(new u3f(y3f, oc0, 0));
            }
        }
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((tk3) it.next()).accept(oc0);
        }
    }
}
