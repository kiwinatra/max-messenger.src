package defpackage;

import android.util.Range;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: z3f  reason: default package */
public final class z3f {
    public static final Range p = hc0.f;
    public final Object a = new Object();
    public final Size b;
    public final vy4 c;
    public final Range d;
    public final su1 e;
    public final boolean f;
    public final go1 g;
    public final do1 h;
    public final go1 i;
    public final do1 j;
    public final do1 k;
    public final za7 l;
    public oc0 m;
    public y3f n;
    public Executor o;

    public z3f(Size size, su1 su1, boolean z, vy4 vy4, Range range, m3f m3f) {
        this.b = size;
        this.e = su1;
        this.f = z;
        this.c = vy4;
        this.d = range;
        String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        AtomicReference atomicReference = new AtomicReference((Object) null);
        go1 F = m5a.F(new v3f(atomicReference, str, 0));
        do1 do1 = (do1) atomicReference.get();
        do1.getClass();
        this.k = do1;
        AtomicReference atomicReference2 = new AtomicReference((Object) null);
        go1 F2 = m5a.F(new v3f(atomicReference2, str, 1));
        this.i = F2;
        hd8.a(F2, new fj(23, (Object) do1, (Object) F), ryg.j());
        do1 do12 = (do1) atomicReference2.get();
        do12.getClass();
        AtomicReference atomicReference3 = new AtomicReference((Object) null);
        go1 F3 = m5a.F(new v3f(atomicReference3, str, 2));
        this.g = F3;
        do1 do13 = (do1) atomicReference3.get();
        do13.getClass();
        this.h = do13;
        za7 za7 = new za7(this, size);
        this.l = za7;
        zz7 J = hd8.J(za7.e);
        hd8.a(F3, new aqg(J, do12, str), ryg.j());
        J.d(new ri4(this, 1), ryg.j());
        ep4 j2 = ryg.j();
        AtomicReference atomicReference4 = new AtomicReference((Object) null);
        hd8.a(m5a.F(new pbb(18, this, atomicReference4)), new d6a(11, (Object) m3f), j2);
        do1 do14 = (do1) atomicReference4.get();
        do14.getClass();
        this.j = do14;
    }

    public final boolean a() {
        return this.g.b.isDone();
    }

    public final void b(Surface surface, Executor executor, tk3 tk3) {
        if (!this.h.b(surface)) {
            go1 go1 = this.g;
            if (!go1.isCancelled()) {
                bs0.r((String) null, go1.b.isDone());
                try {
                    go1.get();
                    executor.execute(new w3f(tk3, surface, 0));
                    return;
                } catch (InterruptedException | ExecutionException unused) {
                    executor.execute(new w3f(tk3, surface, 1));
                    return;
                }
            }
        }
        hd8.a(this.i, new xe8(27, tk3, surface), executor);
    }

    public final void c(Executor executor, y3f y3f) {
        oc0 oc0;
        synchronized (this.a) {
            this.n = y3f;
            this.o = executor;
            oc0 = this.m;
        }
        if (oc0 != null) {
            executor.execute(new u3f(y3f, oc0, 1));
        }
    }

    public final void d() {
        this.h.d(new Exception("Surface request will not complete."));
    }
}
