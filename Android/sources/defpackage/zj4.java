package defpackage;

import android.content.Context;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: zj4  reason: default package */
public final class zj4 implements is6 {
    public final rt6 a;
    public final hs6 b;
    public final yr6 c;
    public final t9a d;
    public final d19 e;
    public final gy0 f;
    public final SparseArray g = new SparseArray();
    public boolean h;
    public final ur0 i;
    public final zy j;
    public final zy k;
    public m53 l;
    public EGLDisplay m;
    public EGLSurface n;
    public int o = -1;

    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Object, d19] */
    public zj4(Context context, yr6 yr6, t9a t9a, ScheduledExecutorService scheduledExecutorService, rt6 rt6, qx9 qx9) {
        ExecutorService executorService;
        this.a = rt6;
        this.b = qx9;
        this.c = yr6;
        this.d = t9a;
        ? obj = new Object();
        obj.a = context;
        obj.b = new fu4();
        this.e = obj;
        boolean z = true;
        this.i = new ur0(false, 1);
        this.j = new zy(1);
        this.k = new zy(1);
        z = scheduledExecutorService != null ? false : z;
        if (z) {
            int i2 = v0g.a;
            executorService = Executors.newSingleThreadExecutor(new td3(2, "Effect:DefaultVideoCompositor:GlThread"));
        } else {
            scheduledExecutorService.getClass();
            executorService = scheduledExecutorService;
        }
        gy0 gy0 = new gy0(executorService, z, (s5g) new rt3(16, (Object) rt6));
        this.f = gy0;
        gy0.v(new uj4(this, 0));
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [qb7, jb7] */
    public final synchronized k0d a() {
        if (this.i.f() == 0) {
            lx5 lx5 = tb7.b;
            return k0d.v;
        }
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            if (((yj4) this.g.valueAt(i2)).a.isEmpty()) {
                lx5 lx52 = tb7.b;
                return k0d.v;
            }
        }
        ? jb7 = new jb7(4);
        xj4 xj4 = (xj4) ((yj4) this.g.get(this.o)).a.element();
        jb7.a(xj4);
        for (int i3 = 0; i3 < this.g.size(); i3++) {
            if (this.g.keyAt(i3) != this.o) {
                yj4 yj4 = (yj4) this.g.valueAt(i3);
                if (yj4.a.size() != 1 || yj4.b) {
                    Iterator it = yj4.a.iterator();
                    long j2 = LongCompanionObject.MAX_VALUE;
                    xj4 xj42 = null;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        xj4 xj43 = (xj4) it.next();
                        long j3 = xj43.c;
                        long abs = Math.abs(j3 - xj4.c);
                        if (abs < j2) {
                            xj42 = xj43;
                            j2 = abs;
                        }
                        if (j3 > xj4.c || (!it.hasNext() && yj4.b)) {
                            xj42.getClass();
                            jb7.a(xj42);
                        }
                    }
                    xj42.getClass();
                    jb7.a(xj42);
                } else {
                    lx5 lx53 = tb7.b;
                    return k0d.v;
                }
            }
        }
        k0d j4 = jb7.j();
        if (j4.o == this.g.size()) {
            return j4;
        }
        return k0d.v;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0096, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b() {
        /*
            r7 = this;
            monitor-enter(r7)
            k0d r0 = r7.a()     // Catch:{ all -> 0x0038 }
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x0038 }
            if (r1 == 0) goto L_0x000d
            monitor-exit(r7)
            return
        L_0x000d:
            int r1 = r7.o     // Catch:{ all -> 0x0038 }
            java.lang.Object r1 = r0.get(r1)     // Catch:{ all -> 0x0038 }
            xj4 r1 = (defpackage.xj4) r1     // Catch:{ all -> 0x0038 }
            qb7 r2 = new qb7     // Catch:{ all -> 0x0038 }
            r2.<init>()     // Catch:{ all -> 0x0038 }
            r3 = 0
        L_0x001b:
            int r4 = r0.size()     // Catch:{ all -> 0x0038 }
            if (r3 >= r4) goto L_0x003a
            java.lang.Object r4 = r0.get(r3)     // Catch:{ all -> 0x0038 }
            xj4 r4 = (defpackage.xj4) r4     // Catch:{ all -> 0x0038 }
            gs6 r4 = r4.b     // Catch:{ all -> 0x0038 }
            ode r5 = new ode     // Catch:{ all -> 0x0038 }
            int r6 = r4.c     // Catch:{ all -> 0x0038 }
            int r4 = r4.d     // Catch:{ all -> 0x0038 }
            r5.<init>(r6, r4)     // Catch:{ all -> 0x0038 }
            r2.d(r5)     // Catch:{ all -> 0x0038 }
            int r3 = r3 + 1
            goto L_0x001b
        L_0x0038:
            r0 = move-exception
            goto L_0x0097
        L_0x003a:
            t9a r3 = r7.d     // Catch:{ all -> 0x0038 }
            k0d r2 = r2.j()     // Catch:{ all -> 0x0038 }
            ode r2 = r3.j(r2)     // Catch:{ all -> 0x0038 }
            ur0 r3 = r7.i     // Catch:{ all -> 0x0038 }
            yr6 r4 = r7.c     // Catch:{ all -> 0x0038 }
            int r5 = r2.b()     // Catch:{ all -> 0x0038 }
            int r2 = r2.a()     // Catch:{ all -> 0x0038 }
            r3.e(r4, r5, r2)     // Catch:{ all -> 0x0038 }
            ur0 r2 = r7.i     // Catch:{ all -> 0x0038 }
            gs6 r2 = r2.h()     // Catch:{ all -> 0x0038 }
            long r3 = r1.c     // Catch:{ all -> 0x0038 }
            zy r1 = r7.j     // Catch:{ all -> 0x0038 }
            r1.e(r3)     // Catch:{ all -> 0x0038 }
            d19 r1 = r7.e     // Catch:{ all -> 0x0038 }
            r1.r(r0, r2)     // Catch:{ all -> 0x0038 }
            long r0 = defpackage.ld8.t()     // Catch:{ all -> 0x0038 }
            zy r5 = r7.k     // Catch:{ all -> 0x0038 }
            r5.e(r0)     // Catch:{ all -> 0x0038 }
            hs6 r0 = r7.b     // Catch:{ all -> 0x0038 }
            r0.a(r7, r2, r3)     // Catch:{ all -> 0x0038 }
            android.util.SparseArray r0 = r7.g     // Catch:{ all -> 0x0038 }
            int r1 = r7.o     // Catch:{ all -> 0x0038 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0038 }
            yj4 r0 = (defpackage.yj4) r0     // Catch:{ all -> 0x0038 }
            r1 = 1
            r7.f(r0, r1)     // Catch:{ all -> 0x0038 }
            r7.c()     // Catch:{ all -> 0x0038 }
            boolean r1 = r7.h     // Catch:{ all -> 0x0038 }
            if (r1 == 0) goto L_0x0095
            java.util.ArrayDeque r0 = r0.a     // Catch:{ all -> 0x0038 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0095
            rt6 r0 = r7.a     // Catch:{ all -> 0x0038 }
            r0.r()     // Catch:{ all -> 0x0038 }
        L_0x0095:
            monitor-exit(r7)
            return
        L_0x0097:
            monitor-exit(r7)     // Catch:{ all -> 0x0038 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zj4.b():void");
    }

    public final synchronized void c() {
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            if (this.g.keyAt(i2) != this.o) {
                e((yj4) this.g.valueAt(i2));
            }
        }
    }

    public final void d(long j2) {
        this.f.v(new vj4(this, j2, 0));
    }

    public final synchronized void e(yj4 yj4) {
        int i2;
        yj4 yj42 = (yj4) this.g.get(this.o);
        if (!yj42.a.isEmpty() || !yj42.b) {
            xj4 xj4 = (xj4) yj42.a.peek();
            long j2 = xj4 != null ? xj4.c : -9223372036854775807L;
            ArrayDeque arrayDeque = yj4.a;
            wj4 wj4 = new wj4(j2);
            arrayDeque.getClass();
            dm7 dm7 = new dm7(arrayDeque, wj4);
            if (dm7 instanceof Collection) {
                i2 = ((Collection) dm7).size();
            } else {
                Iterator it = dm7.iterator();
                long j3 = 0;
                while (true) {
                    s1 s1Var = (s1) it;
                    if (!s1Var.hasNext()) {
                        break;
                    }
                    s1Var.next();
                    j3++;
                }
                i2 = cvg.K(j3);
            }
            f(yj4, Math.max(i2 - 1, 0));
            return;
        }
        f(yj4, yj4.a.size());
    }

    public final synchronized void f(yj4 yj4, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            xj4 xj4 = (xj4) yj4.a.remove();
            xj4.a.d(xj4.c);
        }
    }
}
