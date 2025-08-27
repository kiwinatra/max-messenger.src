package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.common.VideoFrameProcessingException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: fd3  reason: default package */
public final class fd3 implements k6g {
    public static final fs y0 = new fs(1);
    public k7f X;
    public mub Y;
    public Pair Z;
    public final Context a;
    public final ed3 b;
    public final y5g c;
    public final g6g o;
    public final nub v;
    public int v0;
    public final c7f w;
    public int w0 = 0;
    public final CopyOnWriteArraySet x;
    public long x0;
    public ea6 y;
    public pc5 z;

    public fd3(ce ceVar) {
        Context context = (Context) ceVar.b;
        this.a = context;
        ed3 ed3 = new ed3(this, context);
        this.b = ed3;
        c7f c7f = (c7f) ceVar.w;
        this.w = c7f;
        y5g y5g = (y5g) ceVar.c;
        this.c = y5g;
        y5g.l = c7f;
        this.o = new g6g(new e4(10, (Object) this), y5g);
        cd3 cd3 = (cd3) ceVar.v;
        n79.o(cd3);
        this.v = cd3;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.x = copyOnWriteArraySet;
        copyOnWriteArraySet.add(ed3);
    }

    public final void F(long j) {
        if (this.v0 <= 0) {
            long j2 = j - this.x0;
            g6g g6g = this.o;
            v8g v8g = g6g.g;
            if (v8g != null) {
                g6g.d.a(j2, v8g);
                g6g.g = null;
            }
            g6g.f.e(j2);
        }
    }

    public final void a(VideoFrameProcessingException videoFrameProcessingException) {
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            ed3 ed3 = (ed3) it.next();
            ed3.p.execute(new ktg(ed3, ed3.o, videoFrameProcessingException, 18));
        }
    }

    public final void b(Surface surface, int i, int i2) {
        if (this.Y != null) {
            this.Y.j(surface != null ? new r3f(surface, i, i2, 0) : null);
            this.c.h(surface);
        }
    }

    public final void c(long j, long j2) {
        fd3 fd3 = this;
        if (fd3.v0 == 0) {
            while (true) {
                g6g g6g = fd3.o;
                zy zyVar = g6g.f;
                if (zyVar.o != 0) {
                    long f = zyVar.f();
                    Long l = (Long) g6g.e.f(f);
                    y5g y5g = g6g.b;
                    if (!(l == null || l.longValue() == g6g.i)) {
                        g6g.i = l.longValue();
                        y5g.d(2);
                    }
                    y5g y5g2 = y5g;
                    zy zyVar2 = zyVar;
                    long j3 = f;
                    int a2 = g6g.b.a(f, j, j2, g6g.i, false, g6g.c);
                    e4 e4Var = g6g.a;
                    if (a2 == 0 || a2 == 1) {
                        g6g.j = j3;
                        boolean z2 = false;
                        boolean z3 = a2 == 0;
                        long h = zyVar2.h();
                        v8g v8g = (v8g) g6g.d.f(h);
                        if (v8g != null && !v8g.equals(v8g.e) && !v8g.equals(g6g.h)) {
                            g6g.h = v8g;
                            e4Var.getClass();
                            ba6 ba6 = new ba6();
                            ba6.s = v8g.a;
                            ba6.t = v8g.b;
                            ba6.m = vq9.l("video/raw");
                            ea6 ea6 = new ea6(ba6);
                            fd3 fd32 = (fd3) e4Var.b;
                            fd32.y = ea6;
                            Iterator it = fd32.x.iterator();
                            while (it.hasNext()) {
                                ed3 ed3 = (ed3) it.next();
                                ed3.p.execute(new dd3(ed3, ed3.o, v8g));
                            }
                        }
                        long j4 = z3 ? -1 : g6g.c.c;
                        if (y5g2.e != 3) {
                            z2 = true;
                        }
                        y5g2.e = 3;
                        y5g2.l.getClass();
                        y5g2.g = v0g.S(SystemClock.elapsedRealtime());
                        fd3 fd33 = (fd3) e4Var.b;
                        if (z2 && fd33.Z != null) {
                            Iterator it2 = fd33.x.iterator();
                            while (it2.hasNext()) {
                                ed3 ed32 = (ed3) it2.next();
                                ed32.p.execute(new dd3(ed32, ed32.o, 2));
                            }
                        }
                        if (fd33.z != null) {
                            if (fd33.y == null) {
                                new ba6().a();
                            }
                            pc5 pc5 = fd33.z;
                            fd33.w.getClass();
                            pc5.d(h, System.nanoTime());
                        }
                        mub mub = fd33.Y;
                        n79.o(mub);
                        gk4 gk4 = (gk4) mub.a(mub.x0);
                        n79.m("Calling this method is not allowed when renderFramesAutomatically is enabled", !gk4.h);
                        gk4.e.w(new vj4(gk4, j4, 1));
                    } else if (a2 == 2 || a2 == 3 || a2 == 4) {
                        g6g.j = j3;
                        zyVar2.h();
                        fd3 fd34 = (fd3) e4Var.b;
                        Iterator it3 = fd34.x.iterator();
                        while (it3.hasNext()) {
                            ed3 ed33 = (ed3) it3.next();
                            ed33.p.execute(new dd3(ed33, ed33.o, 1));
                        }
                        mub mub2 = fd34.Y;
                        n79.o(mub2);
                        gk4 gk42 = (gk4) mub2.a(mub2.x0);
                        n79.m("Calling this method is not allowed when renderFramesAutomatically is enabled", !gk42.h);
                        gk42.e.w(new vj4(gk42, -2, 1));
                    } else if (a2 != 5) {
                        throw new IllegalStateException(String.valueOf(a2));
                    } else {
                        return;
                    }
                    fd3 = this;
                } else {
                    return;
                }
            }
        }
    }

    public final void e(long j) {
        throw new UnsupportedOperationException();
    }

    public final void g(int i, int i2) {
        g6g g6g = this.o;
        g6g.getClass();
        v8g v8g = new v8g(i, i2);
        if (!v0g.a(g6g.g, v8g)) {
            g6g.g = v8g;
        }
    }
}
