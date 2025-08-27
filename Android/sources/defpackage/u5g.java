package defpackage;

import android.graphics.Bitmap;
import android.util.SparseArray;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: u5g  reason: default package */
public final class u5g implements gu6 {
    public final x5g a;
    public final AtomicLong b = new AtomicLong();
    public final long c;
    public final vtb d;

    public u5g(x5g x5g, vtb vtb, long j) {
        this.a = x5g;
        this.c = j;
        this.d = vtb;
    }

    public final Surface a() {
        SparseArray sparseArray = ((gk4) this.a).d.g;
        n79.n(v0g.l(sparseArray, 1));
        return ((sh7) sparseArray.get(1)).a.H();
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [qb7, jb7] */
    public final void b(e05 e05, long j, ea6 ea6, boolean z) {
        int i;
        List list;
        long b2 = e05.b(j);
        AtomicLong atomicLong = this.b;
        if (ea6 != null) {
            int i2 = ea6.w % 180;
            int i3 = ea6.u;
            int i4 = ea6.t;
            int i5 = i2 == 0 ? i4 : i3;
            if (i2 != 0) {
                i3 = i4;
            }
            ode ode = new ode(i5, i3);
            String str = ea6.n;
            str.getClass();
            if (vq9.i(str)) {
                i = 2;
            } else if (str.equals("video/raw")) {
                i = 3;
            } else if (vq9.k(str)) {
                i = 1;
            } else {
                throw new IllegalArgumentException("MIME type not supported ".concat(str));
            }
            tb7 tb7 = e05.g.b;
            vtb vtb = this.d;
            if (vtb == null) {
                list = tb7.p(tb7);
            } else {
                ? jb7 = new jb7(4);
                jb7.e(tb7);
                jb7.a(vtb);
                list = jb7.j();
            }
            m53 m53 = ea6.A;
            m53.getClass();
            ((gk4) this.a).c(i, list, new je6(m53, ode.a, ode.b, ea6.x, atomicLong.get() + this.c));
        }
        atomicLong.addAndGet(b2);
    }

    public final int c() {
        q2 q2Var = ((gk4) this.a).d.k;
        if (q2Var != null) {
            return q2Var.I();
        }
        return 0;
    }

    public final void e() {
        ((gk4) this.a).f();
    }

    public final int g(Bitmap bitmap, skf skf) {
        gk4 gk4 = (gk4) this.a;
        if (!gk4.k.e()) {
            return 2;
        }
        if (m53.g(gk4.p)) {
            n79.f("VideoFrameProcessor configured for HDR output, but either received SDR input, or is on an API level that doesn't support gainmaps. SDR to HDR tonemapping is not supported.", v0g.a >= 34 && bitmap.hasGainmap());
        }
        je6 je6 = gk4.q;
        je6.getClass();
        q2 q2Var = gk4.d.k;
        n79.o(q2Var);
        q2Var.O(bitmap, new je6(je6.a, je6.b, je6.c, je6.d, je6.e), skf);
        return 1;
    }

    public final boolean h(long j) {
        return ((gk4) this.a).b();
    }
}
