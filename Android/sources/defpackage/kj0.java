package defpackage;

import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: kj0  reason: default package */
public abstract class kj0 implements fs6 {
    public final ur0 a;
    public ds6 b = new ece(7);
    public es6 c = new Object();
    public cs6 d = new rx0(25);
    public Executor e = dp4.a;
    public int f = -1;
    public int g = -1;

    /* JADX WARNING: type inference failed for: r3v2, types: [es6, java.lang.Object] */
    public kj0(boolean z) {
        this.a = new ur0(z, 1);
    }

    public final void a(yr6 yr6, gs6 gs6, long j) {
        try {
            int i = this.f;
            int i2 = gs6.c;
            ur0 ur0 = this.a;
            int i3 = gs6.d;
            if (i == i2) {
                if (this.g == i3) {
                    if (!((gm7) ur0.g()).hasNext()) {
                    }
                    gs6 h = ur0.h();
                    ld8.y(h.b, h.c, h.d);
                    gi4 gi4 = (gi4) this;
                    if (!gi4.u || !gi4.t) {
                        ld8.k();
                    }
                    d(gs6.a, j);
                    this.b.v(gs6);
                    this.c.l(h, j);
                }
            }
            int i4 = gs6.c;
            this.f = i4;
            this.g = i3;
            ode k = f6e.k(((gi4) this).i, i4, i3);
            ur0.e(yr6, k.a, k.b);
            gs6 h2 = ur0.h();
            ld8.y(h2.b, h2.c, h2.d);
            gi4 gi42 = (gi4) this;
            ld8.k();
            d(gs6.a, j);
            this.b.v(gs6);
            this.c.l(h2, j);
        } catch (VideoFrameProcessingException | GlUtil$GlException e2) {
            this.e.execute(new c(13, this, e2));
        }
    }

    public final void b(gs6 gs6) {
        ur0 ur0 = this.a;
        if (((ArrayDeque) ur0.e).contains(gs6)) {
            ArrayDeque arrayDeque = (ArrayDeque) ur0.e;
            n79.n(arrayDeque.contains(gs6));
            arrayDeque.remove(gs6);
            ((ArrayDeque) ur0.d).add(gs6);
            this.b.r();
        }
    }

    public final void c() {
        this.c.h();
    }

    public abstract void d(int i, long j);

    public final void e(Executor executor, ak4 ak4) {
        this.e = executor;
        this.d = ak4;
    }

    public final void f(l15 l15) {
        this.c = l15;
    }

    public final void flush() {
        ur0 ur0 = this.a;
        ArrayDeque arrayDeque = (ArrayDeque) ur0.e;
        ((ArrayDeque) ur0.d).addAll(arrayDeque);
        arrayDeque.clear();
        this.b.w();
        for (int i = 0; i < ur0.b; i++) {
            this.b.r();
        }
    }

    public final void g(ds6 ds6) {
        this.b = ds6;
        for (int i = 0; i < this.a.f(); i++) {
            ds6.r();
        }
    }
}
