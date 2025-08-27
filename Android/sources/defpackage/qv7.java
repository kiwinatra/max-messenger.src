package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;

/* renamed from: qv7  reason: default package */
public final class qv7 extends q04 implements vk4 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater y = AtomicIntegerFieldUpdater.newUpdater(qv7.class, "runningWorkers$volatile");
    public final /* synthetic */ vk4 b;
    public final q04 c;
    public final int o;
    private volatile /* synthetic */ int runningWorkers$volatile;
    public final String v;
    public final v68 w;
    public final Object x;

    public qv7(q04 q04, int i, String str) {
        vk4 vk4 = q04 instanceof vk4 ? (vk4) q04 : null;
        this.b = vk4 == null ? ff4.a : vk4;
        this.c = q04;
        this.o = i;
        this.v = str;
        this.w = new v68();
        this.x = new Object();
    }

    public final pq4 U(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return this.b.U(j, runnable, coroutineContext);
    }

    public final void o(long j, lw1 lw1) {
        this.b.o(j, lw1);
    }

    public final void p0(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable t0;
        this.w.a(runnable);
        if (y.get(this) < this.o && u0() && (t0 = t0()) != null) {
            this.c.p0(this, new vj6((Object) this, (Object) t0, false, 8));
        }
    }

    public final void q0(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable t0;
        this.w.a(runnable);
        if (y.get(this) < this.o && u0() && (t0 = t0()) != null) {
            this.c.q0(this, new vj6((Object) this, (Object) t0, false, 8));
        }
    }

    public final q04 s0(int i, String str) {
        y7e.f(i);
        return i >= this.o ? str != null ? new i5a(this, str) : this : super.s0(i, str);
    }

    public final Runnable t0() {
        while (true) {
            Runnable runnable = (Runnable) this.w.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.x) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = y;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.w.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final String toString() {
        String str = this.v;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        sb.append(".limitedParallelism(");
        return tr1.k(sb, this.o, ')');
    }

    public final boolean u0() {
        synchronized (this.x) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = y;
            if (atomicIntegerFieldUpdater.get(this) >= this.o) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }
}
