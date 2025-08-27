package defpackage;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.util.Pair;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* renamed from: vo5  reason: default package */
public final class vo5 implements fs6, is6 {
    public fm3 A;
    public boolean B;
    public boolean C;
    public r3f D;
    public EGLSurface E;
    public final Context a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final EGLDisplay d;
    public final EGLContext e;
    public final EGLSurface f;
    public final rx0 g;
    public final m53 h;
    public final gy0 i;
    public final Executor j;
    public final w5g k;
    public final ConcurrentLinkedQueue l;
    public final ur0 m;
    public final zy n;
    public final zy o;
    public final hs6 p;
    public final int q;
    public final boolean r;
    public int s;
    public int t;
    public int u;
    public int v;
    public gi4 w;
    public boolean x;
    public ds6 y;
    public ode z;

    public vo5(Context context, EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, rx0 rx0, m53 m53, gy0 gy0, Executor executor, w5g w5g, hs6 hs6, int i2, int i3, boolean z2) {
        this.a = context;
        this.d = eGLDisplay;
        this.e = eGLContext;
        this.f = eGLSurface;
        this.g = rx0;
        this.h = m53;
        this.i = gy0;
        this.j = executor;
        this.k = w5g;
        this.p = hs6;
        this.q = i3;
        this.r = z2;
        this.y = new sq6(12);
        this.l = new ConcurrentLinkedQueue();
        this.m = new ur0(m53.g(m53), i2);
        this.n = new zy(i2);
        this.o = new zy(i2);
    }

    public final void a(yr6 yr6, gs6 gs6, long j2) {
        this.j.execute(new z60(this, j2, 5));
        if (this.p == null) {
            if (this.r) {
                k(yr6, gs6, j2, j2 * 1000);
            } else {
                this.l.add(Pair.create(gs6, Long.valueOf(j2)));
            }
            this.y.r();
            return;
        }
        n79.n(this.m.f() > 0);
        k(yr6, gs6, j2, j2 * 1000);
    }

    public final void b(gs6 gs6) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        if (this.l.isEmpty()) {
            fm3 fm3 = this.A;
            fm3.getClass();
            fm3.a();
            this.x = false;
            return;
        }
        n79.n(!this.r);
        this.x = true;
    }

    public final void d(long j2) {
        this.i.v(new vj4(this, j2, 2));
    }

    public final void e(Executor executor, ak4 ak4) {
        throw new UnsupportedOperationException();
    }

    public final void f(l15 l15) {
        throw new UnsupportedOperationException();
    }

    public final void flush() {
        ur0 ur0 = this.m;
        int i2 = 0;
        hs6 hs6 = this.p;
        if (hs6 != null) {
            ArrayDeque arrayDeque = (ArrayDeque) ur0.e;
            ((ArrayDeque) ur0.d).addAll(arrayDeque);
            arrayDeque.clear();
            zy zyVar = this.n;
            zyVar.b = 0;
            zyVar.c = -1;
            zyVar.o = 0;
            zy zyVar2 = this.o;
            zyVar2.b = 0;
            zyVar2.c = -1;
            zyVar2.o = 0;
        }
        this.l.clear();
        this.x = false;
        gi4 gi4 = this.w;
        if (gi4 != null) {
            gi4.flush();
        }
        this.y.w();
        while (true) {
            if (i2 < (hs6 == null ? 1 : ur0.f())) {
                this.y.r();
                i2++;
            } else {
                return;
            }
        }
    }

    public final void g(ds6 ds6) {
        this.y = ds6;
        int i2 = 0;
        while (true) {
            if (i2 < (this.p == null ? 1 : this.m.f())) {
                ds6.r();
                i2++;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [qb7, jb7] */
    /* JADX WARNING: type inference failed for: r1v4, types: [tdd, java.lang.Object] */
    public final synchronized gi4 h(int i2, int i3, int i4) {
        gi4 i5;
        try {
            ? jb7 = new jb7(4);
            jb7.e(this.b);
            if (i2 != 0) {
                ? obj = new Object();
                float f2 = ((float) i2) % 360.0f;
                obj.a = f2;
                if (f2 < c44.DEFAULT_ASPECT_RATIO) {
                    obj.a = f2 + 360.0f;
                }
                jb7.a(new udd(obj.a));
            }
            jb7.a(vtb.e(i3, i4));
            i5 = gi4.i(this.a, jb7.j(), this.c, this.h, this.q);
            ode k2 = f6e.k(i5.i, this.s, this.t);
            r3f r3f = this.D;
            if (r3f != null) {
                boolean z2 = false;
                n79.n(k2.a == r3f.b);
                if (k2.b == r3f.c) {
                    z2 = true;
                }
                n79.n(z2);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return i5;
    }

    public final synchronized void i() {
        if (this.E != null) {
            try {
                EGLDisplay eGLDisplay = this.d;
                EGLContext eGLContext = this.e;
                EGLSurface eGLSurface = this.f;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
                ld8.g("Error making context current");
                ld8.y(0, 1, 1);
                EGLDisplay eGLDisplay2 = this.d;
                EGLSurface eGLSurface2 = this.E;
                if (eGLDisplay2 != null) {
                    if (eGLSurface2 != null) {
                        EGL14.eglDestroySurface(eGLDisplay2, eGLSurface2);
                        ld8.g("Error destroying surface");
                    }
                }
            } catch (GlUtil$GlException e2) {
                try {
                    this.j.execute(new uo5(1, (Object) this, (Object) e2));
                } catch (Throwable th) {
                    this.E = null;
                    throw th;
                }
            }
            this.E = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00cc, code lost:
        return true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0018 A[Catch:{ all -> 0x0012 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0045 A[Catch:{ all -> 0x0012 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean j(defpackage.yr6 r7, int r8, int r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            int r0 = r6.s     // Catch:{ all -> 0x0012 }
            r1 = 1
            r2 = 0
            if (r0 != r8) goto L_0x0015
            int r0 = r6.t     // Catch:{ all -> 0x0012 }
            if (r0 != r9) goto L_0x0015
            ode r0 = r6.z     // Catch:{ all -> 0x0012 }
            if (r0 != 0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            r0 = r2
            goto L_0x0016
        L_0x0012:
            r7 = move-exception
            goto L_0x00cd
        L_0x0015:
            r0 = r1
        L_0x0016:
            if (r0 == 0) goto L_0x0037
            r6.s = r8     // Catch:{ all -> 0x0012 }
            r6.t = r9     // Catch:{ all -> 0x0012 }
            java.util.ArrayList r3 = r6.b     // Catch:{ all -> 0x0012 }
            ode r8 = defpackage.f6e.k(r3, r8, r9)     // Catch:{ all -> 0x0012 }
            ode r9 = r6.z     // Catch:{ all -> 0x0012 }
            boolean r9 = defpackage.v0g.a(r9, r8)     // Catch:{ all -> 0x0012 }
            if (r9 != 0) goto L_0x0037
            r6.z = r8     // Catch:{ all -> 0x0012 }
            java.util.concurrent.Executor r9 = r6.j     // Catch:{ all -> 0x0012 }
            uo5 r3 = new uo5     // Catch:{ all -> 0x0012 }
            r4 = 2
            r3.<init>((int) r4, (java.lang.Object) r6, (java.lang.Object) r8)     // Catch:{ all -> 0x0012 }
            r9.execute(r3)     // Catch:{ all -> 0x0012 }
        L_0x0037:
            ode r8 = r6.z     // Catch:{ all -> 0x0012 }
            r8.getClass()     // Catch:{ all -> 0x0012 }
            r3f r8 = r6.D     // Catch:{ all -> 0x0012 }
            r9 = 0
            if (r8 != 0) goto L_0x005e
            hs6 r3 = r6.p     // Catch:{ all -> 0x0012 }
            if (r3 != 0) goto L_0x005e
            android.opengl.EGLSurface r7 = r6.E     // Catch:{ all -> 0x0012 }
            if (r7 != 0) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            r1 = r2
        L_0x004b:
            defpackage.n79.n(r1)     // Catch:{ all -> 0x0012 }
            gi4 r7 = r6.w     // Catch:{ all -> 0x0012 }
            if (r7 == 0) goto L_0x0057
            r7.release()     // Catch:{ all -> 0x0012 }
            r6.w = r9     // Catch:{ all -> 0x0012 }
        L_0x0057:
            java.lang.String r7 = "Output surface and size not set, dropping frame."
            defpackage.i8b.V(r7)     // Catch:{ all -> 0x0012 }
            monitor-exit(r6)
            return r2
        L_0x005e:
            if (r8 != 0) goto L_0x0065
            ode r3 = r6.z     // Catch:{ all -> 0x0012 }
            int r3 = r3.a     // Catch:{ all -> 0x0012 }
            goto L_0x0067
        L_0x0065:
            int r3 = r8.b     // Catch:{ all -> 0x0012 }
        L_0x0067:
            r6.u = r3     // Catch:{ all -> 0x0012 }
            if (r8 != 0) goto L_0x0070
            ode r3 = r6.z     // Catch:{ all -> 0x0012 }
            int r3 = r3.b     // Catch:{ all -> 0x0012 }
            goto L_0x0072
        L_0x0070:
            int r3 = r8.c     // Catch:{ all -> 0x0012 }
        L_0x0072:
            r6.v = r3     // Catch:{ all -> 0x0012 }
            if (r8 == 0) goto L_0x008a
            android.opengl.EGLSurface r3 = r6.E     // Catch:{ all -> 0x0012 }
            if (r3 != 0) goto L_0x008a
            android.opengl.EGLDisplay r3 = r6.d     // Catch:{ all -> 0x0012 }
            android.view.Surface r8 = r8.a     // Catch:{ all -> 0x0012 }
            m53 r4 = r6.h     // Catch:{ all -> 0x0012 }
            int r4 = r4.c     // Catch:{ all -> 0x0012 }
            boolean r5 = r6.r     // Catch:{ all -> 0x0012 }
            android.opengl.EGLSurface r8 = r7.m(r3, r8, r4, r5)     // Catch:{ all -> 0x0012 }
            r6.E = r8     // Catch:{ all -> 0x0012 }
        L_0x008a:
            hs6 r8 = r6.p     // Catch:{ all -> 0x0012 }
            if (r8 == 0) goto L_0x0097
            ur0 r8 = r6.m     // Catch:{ all -> 0x0012 }
            int r3 = r6.u     // Catch:{ all -> 0x0012 }
            int r4 = r6.v     // Catch:{ all -> 0x0012 }
            r8.e(r7, r3, r4)     // Catch:{ all -> 0x0012 }
        L_0x0097:
            rx0 r7 = r6.g     // Catch:{ all -> 0x0012 }
            r7.getClass()     // Catch:{ all -> 0x0012 }
            gi4 r7 = r6.w     // Catch:{ all -> 0x0012 }
            if (r7 == 0) goto L_0x00b3
            boolean r8 = r6.C     // Catch:{ all -> 0x0012 }
            if (r8 != 0) goto L_0x00aa
            if (r0 != 0) goto L_0x00aa
            boolean r8 = r6.B     // Catch:{ all -> 0x0012 }
            if (r8 == 0) goto L_0x00b3
        L_0x00aa:
            r7.release()     // Catch:{ all -> 0x0012 }
            r6.w = r9     // Catch:{ all -> 0x0012 }
            r6.C = r2     // Catch:{ all -> 0x0012 }
            r6.B = r2     // Catch:{ all -> 0x0012 }
        L_0x00b3:
            gi4 r7 = r6.w     // Catch:{ all -> 0x0012 }
            if (r7 != 0) goto L_0x00cb
            r3f r7 = r6.D     // Catch:{ all -> 0x0012 }
            if (r7 != 0) goto L_0x00bd
            r7 = r2
            goto L_0x00bf
        L_0x00bd:
            int r7 = r7.d     // Catch:{ all -> 0x0012 }
        L_0x00bf:
            int r8 = r6.u     // Catch:{ all -> 0x0012 }
            int r9 = r6.v     // Catch:{ all -> 0x0012 }
            gi4 r7 = r6.h(r7, r8, r9)     // Catch:{ all -> 0x0012 }
            r6.w = r7     // Catch:{ all -> 0x0012 }
            r6.C = r2     // Catch:{ all -> 0x0012 }
        L_0x00cb:
            monitor-exit(r6)
            return r1
        L_0x00cd:
            monitor-exit(r6)     // Catch:{ all -> 0x0012 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vo5.j(yr6, int, int):boolean");
    }

    public final synchronized void k(yr6 yr6, gs6 gs6, long j2, long j3) {
        if (j3 != -2) {
            try {
                if (j(yr6, gs6.c, gs6.d)) {
                    if (this.D != null) {
                        l(gs6, j2, j3);
                    } else if (this.p != null) {
                        m(gs6, j2);
                    }
                    this.y.v(gs6);
                    return;
                }
            } catch (VideoFrameProcessingException | GlUtil$GlException e2) {
                this.j.execute(new uo5(this, e2, j2));
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.y.v(gs6);
    }

    public final synchronized void l(gs6 gs6, long j2, long j3) {
        try {
            EGLSurface eGLSurface = this.E;
            eGLSurface.getClass();
            r3f r3f = this.D;
            r3f.getClass();
            gi4 gi4 = this.w;
            gi4.getClass();
            EGLDisplay eGLDisplay = this.d;
            EGLContext eGLContext = this.e;
            int i2 = r3f.b;
            int i3 = r3f.c;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
            ld8.g("Error making context current");
            ld8.y(0, i2, i3);
            ld8.k();
            gi4.d(gs6.a, j2);
            EGLDisplay eGLDisplay2 = this.d;
            if (j3 == -1) {
                j3 = System.nanoTime();
            }
            EGLExt.eglPresentationTimeANDROID(eGLDisplay2, eGLSurface, j3);
            EGL14.eglSwapBuffers(this.d, eGLSurface);
            p94.a();
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final void m(gs6 gs6, long j2) {
        gs6 h2 = this.m.h();
        this.n.e(j2);
        ld8.y(h2.b, h2.c, h2.d);
        ld8.k();
        gi4 gi4 = this.w;
        gi4.getClass();
        gi4.d(gs6.a, j2);
        this.o.e(ld8.t());
        hs6 hs6 = this.p;
        hs6.getClass();
        hs6.a(this, h2, j2);
    }

    public final synchronized void release() {
        gi4 gi4 = this.w;
        if (gi4 != null) {
            gi4.release();
        }
        try {
            this.m.d();
            EGLDisplay eGLDisplay = this.d;
            EGLSurface eGLSurface = this.E;
            if (eGLDisplay != null) {
                if (eGLSurface != null) {
                    EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                    ld8.g("Error destroying surface");
                }
            }
            ld8.h();
        } catch (GlUtil$GlException e2) {
            throw new Exception(e2);
        }
    }
}
