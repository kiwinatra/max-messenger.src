package defpackage;

import kotlin.coroutines.CoroutineContext;

/* renamed from: qef  reason: default package */
public final class qef extends gc8 implements vk4 {
    public final pef b;

    public qef(gc8 gc8) {
        this.b = new pef(gc8);
    }

    public final pq4 U(long j, Runnable runnable, CoroutineContext coroutineContext) {
        Object a = this.b.a();
        vk4 vk4 = a instanceof vk4 ? (vk4) a : null;
        if (vk4 == null) {
            vk4 = ff4.a;
        }
        return vk4.U(j, runnable, coroutineContext);
    }

    public final void o(long j, lw1 lw1) {
        Object a = this.b.a();
        vk4 vk4 = a instanceof vk4 ? (vk4) a : null;
        if (vk4 == null) {
            vk4 = ff4.a;
        }
        vk4.o(j, lw1);
    }

    public final void p0(CoroutineContext coroutineContext, Runnable runnable) {
        ((q04) this.b.a()).p0(coroutineContext, runnable);
    }

    public final void q0(CoroutineContext coroutineContext, Runnable runnable) {
        ((q04) this.b.a()).q0(coroutineContext, runnable);
    }

    public final boolean r0(CoroutineContext coroutineContext) {
        return ((q04) this.b.a()).r0(coroutineContext);
    }

    public final gc8 t0() {
        gc8 t0;
        Object a = this.b.a();
        gc8 gc8 = a instanceof gc8 ? (gc8) a : null;
        return (gc8 == null || (t0 = gc8.t0()) == null) ? this : t0;
    }
}
