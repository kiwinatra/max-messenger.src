package defpackage;

import android.opengl.GLES30;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: vj4  reason: default package */
public final /* synthetic */ class vj4 implements t5g {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vj4(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                zj4 zj4 = (zj4) this.c;
                long j = this.b;
                synchronized (zj4) {
                    while (zj4.i.f() < zj4.i.b && zj4.j.f() <= j) {
                        try {
                            ur0 ur0 = zj4.i;
                            ArrayDeque arrayDeque = (ArrayDeque) ur0.e;
                            n79.n(!arrayDeque.isEmpty());
                            ((ArrayDeque) ur0.d).add((gs6) arrayDeque.remove());
                            zj4.j.h();
                            GLES30.glDeleteSync(zj4.k.h());
                            ld8.h();
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                                break;
                            }
                        }
                    }
                    zj4.b();
                }
                return;
            case 1:
                gk4 gk4 = (gk4) this.c;
                vo5 vo5 = gk4.i;
                if (vo5.p == null) {
                    n79.n(!vo5.r);
                    ConcurrentLinkedQueue concurrentLinkedQueue = vo5.l;
                    Pair pair = (Pair) concurrentLinkedQueue.remove();
                    long longValue = ((Long) pair.second).longValue();
                    vo5.k(gk4.b, (gs6) pair.first, longValue, this.b);
                    if (concurrentLinkedQueue.isEmpty() && vo5.x) {
                        fm3 fm3 = vo5.A;
                        fm3.getClass();
                        fm3.a();
                        vo5.x = false;
                        return;
                    }
                    return;
                }
                return;
            default:
                vo5 vo52 = (vo5) this.c;
                n79.n(vo52.p != null);
                while (true) {
                    ur0 ur02 = vo52.m;
                    if (ur02.f() < ur02.b) {
                        zy zyVar = vo52.n;
                        if (zyVar.f() <= this.b) {
                            ArrayDeque arrayDeque2 = (ArrayDeque) ur02.e;
                            n79.n(!arrayDeque2.isEmpty());
                            ((ArrayDeque) ur02.d).add((gs6) arrayDeque2.remove());
                            zyVar.h();
                            GLES30.glDeleteSync(vo52.o.h());
                            ld8.h();
                            vo52.y.r();
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
        }
    }
}
