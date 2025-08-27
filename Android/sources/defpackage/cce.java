package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: cce  reason: default package */
public abstract class cce implements l6g {
    public x5g X;
    public r3f Y;
    public boolean Z;
    public final Context a;
    public final v5g b;
    public final m53 c;
    public final k6g o;
    public final rx0 v;
    public boolean v0;
    public final Executor w;
    public volatile boolean w0;
    public final boolean x;
    public int x0 = -1;
    public final long y;
    public final vtb z;

    public cce(Context context, v5g v5g, m53 m53, k6g k6g, rx0 rx0, Executor executor, t9a t9a, boolean z2, vtb vtb, long j) {
        n79.m("SingleInputVideoGraph does not use VideoCompositor, and therefore cannot apply VideoCompositorSettings", t9a.y.equals(t9a));
        this.a = context;
        this.b = v5g;
        this.c = m53;
        this.o = k6g;
        this.v = rx0;
        this.w = executor;
        this.x = z2;
        this.z = vtb;
        this.y = j;
    }

    public final x5g a(int i) {
        int i2 = this.x0;
        n79.g(i2 != -1 && i2 == i);
        x5g x5g = this.X;
        n79.o(x5g);
        return x5g;
    }

    public final void b(int i) {
        if (this.X == null) {
            boolean z2 = this.v0;
        }
        n79.n(this.x0 == -1);
        this.x0 = i;
        x5g a2 = this.b.a(this.a, this.v, this.c, this.x, new jz2(10, (Object) this));
        this.X = a2;
        r3f r3f = this.Y;
        if (r3f != null) {
            ((gk4) a2).e(r3f);
        }
    }

    public final void c() {
    }

    public final boolean f() {
        return this.w0;
    }

    public final void j(r3f r3f) {
        this.Y = r3f;
        x5g x5g = this.X;
        if (x5g != null) {
            ((gk4) x5g).e(r3f);
        }
    }

    public final void release() {
        if (!this.v0) {
            x5g x5g = this.X;
            if (x5g != null) {
                ((gk4) x5g).d();
                this.X = null;
            }
            this.v0 = true;
        }
    }
}
