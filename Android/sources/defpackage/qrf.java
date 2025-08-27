package defpackage;

import android.content.Context;
import android.opengl.EGLContext;
import android.util.SparseArray;
import androidx.media3.common.util.GlUtil$GlException;
import androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: qrf  reason: default package */
public final class qrf implements trf, l6g {
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public long D0 = -9223372036854775807L;
    public volatile boolean E0;
    public final ScheduledExecutorService X;
    public final fk4 Y;
    public final ArrayDeque Z;
    public final Context a;
    public final m53 b;
    public final wsb c;
    public final rx0 o;
    public final k6g v;
    public final SparseArray v0;
    public final Executor w;
    public final long w0;
    public final t9a x;
    public gk4 x0;
    public final ArrayList y;
    public zj4 y0;
    public final SparseArray z = new SparseArray();
    public boolean z0;

    public qrf(Context context, m53 m53, rx0 rx0, k6g k6g, t9a t9a, List list, long j) {
        dp4 dp4 = dp4.a;
        this.a = context;
        this.b = m53;
        this.o = rx0;
        this.v = k6g;
        this.w = dp4;
        this.x = t9a;
        this.y = new ArrayList(list);
        this.w0 = j;
        int i = v0g.a;
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new td3(3, "Effect:MultipleInputVideoGraph:Thread"));
        this.X = newSingleThreadScheduledExecutor;
        wsb wsb = new wsb(17);
        this.c = wsb;
        DefaultVideoFrameProcessor$Factory$Builder defaultVideoFrameProcessor$Factory$Builder = new DefaultVideoFrameProcessor$Factory$Builder();
        defaultVideoFrameProcessor$Factory$Builder.a = 2;
        defaultVideoFrameProcessor$Factory$Builder.c = wsb;
        defaultVideoFrameProcessor$Factory$Builder.b = newSingleThreadScheduledExecutor;
        this.Y = defaultVideoFrameProcessor$Factory$Builder.build();
        this.Z = new ArrayDeque();
        this.v0 = new SparseArray();
    }

    public final void a() {
        boolean z2;
        n79.o(this.x0);
        if (this.A0) {
            ArrayDeque arrayDeque = this.Z;
            rx9 rx9 = (rx9) arrayDeque.peek();
            if (rx9 != null) {
                gk4 gk4 = this.x0;
                gk4.getClass();
                int i = rx9.a.a;
                if (!gk4.k.e()) {
                    z2 = false;
                } else {
                    q2 q2Var = gk4.d.k;
                    n79.o(q2Var);
                    q2Var.P(i, rx9.b);
                    z2 = true;
                }
                n79.n(z2);
                arrayDeque.remove();
                if (this.B0 && arrayDeque.isEmpty()) {
                    gk4 gk42 = this.x0;
                    gk42.getClass();
                    gk42.f();
                }
            }
        }
    }

    public final void c() {
        n79.n(this.z.size() == 0 && this.y0 == null && this.x0 == null && !this.C0);
        gk4 b2 = this.Y.b(this.a, this.o, this.b, true, dp4.a, new vs6(29, (Object) this));
        this.x0 = b2;
        qx9 qx9 = new qx9(this);
        SparseArray sparseArray = b2.d.g;
        n79.n(v0g.l(sparseArray, 3));
        ((sh7) sparseArray.get(3)).a.V(qx9);
        this.y0 = new zj4(this.a, this.c, this.x, this.X, new rt6(29, (Object) this), new qx9(this));
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder, java.lang.Object] */
    public final gu6 d(int i) {
        n79.n(!v0g.l(this.z, i));
        zj4 zj4 = this.y0;
        zj4.getClass();
        synchronized (zj4) {
            n79.n(!v0g.l(zj4.g, i));
            zj4.g.put(i, new yj4());
            if (zj4.o == -1) {
                zj4.o = i;
            }
        }
        fk4 fk4 = this.Y;
        ? obj = new Object();
        obj.a = fk4.a;
        obj.b = fk4.d;
        obj.c = fk4.c;
        obj.f = !fk4.b;
        boolean z2 = fk4.g;
        boolean z3 = fk4.h;
        obj.d = new ud0(this, i, 8);
        obj.e = 2;
        this.z.put(i, obj.build().b(this.a, rx0.o, this.b, true, this.w, new ni0((Object) this, i, 13)));
        SparseArray sparseArray = this.z;
        n79.n(v0g.l(sparseArray, i));
        return new u5g((x5g) sparseArray.get(i), (vtb) null, this.w0);
    }

    public final boolean f() {
        return this.E0;
    }

    public final void j(r3f r3f) {
        gk4 gk4 = this.x0;
        gk4.getClass();
        gk4.e(r3f);
    }

    public final void release() {
        if (!this.C0) {
            for (int i = 0; i < this.z.size(); i++) {
                SparseArray sparseArray = this.z;
                ((gk4) ((x5g) sparseArray.get(sparseArray.keyAt(i)))).d();
            }
            this.z.clear();
            zj4 zj4 = this.y0;
            if (zj4 != null) {
                synchronized (zj4) {
                    n79.n(zj4.h);
                    try {
                        zj4.f.t(new uj4(zj4, 1));
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        throw new IllegalStateException(e);
                    }
                }
                this.y0 = null;
            }
            gk4 gk4 = this.x0;
            if (gk4 != null) {
                gk4.d();
                this.x0 = null;
            }
            try {
                if (((EGLContext) this.c.b) != null) {
                    ld8.v((EGLContext) this.c.b, ld8.H());
                }
            } catch (GlUtil$GlException e2) {
                i8b.p("Error releasing GL context", e2);
            }
            this.X.shutdown();
            try {
                this.X.awaitTermination(1000, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e3) {
                Thread.currentThread().interrupt();
                this.w.execute(new sx8(9, this, e3));
            }
            this.C0 = true;
        }
    }
}
