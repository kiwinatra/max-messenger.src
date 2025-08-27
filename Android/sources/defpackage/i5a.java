package defpackage;

import kotlin.coroutines.CoroutineContext;

/* renamed from: i5a  reason: default package */
public final class i5a extends q04 implements vk4 {
    public final /* synthetic */ vk4 b;
    public final q04 c;
    public final String o;

    public i5a(q04 q04, String str) {
        vk4 vk4 = q04 instanceof vk4 ? (vk4) q04 : null;
        this.b = vk4 == null ? ff4.a : vk4;
        this.c = q04;
        this.o = str;
    }

    public final pq4 U(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return this.b.U(j, runnable, coroutineContext);
    }

    public final void o(long j, lw1 lw1) {
        this.b.o(j, lw1);
    }

    public final void p0(CoroutineContext coroutineContext, Runnable runnable) {
        this.c.p0(coroutineContext, runnable);
    }

    public final void q0(CoroutineContext coroutineContext, Runnable runnable) {
        this.c.q0(coroutineContext, runnable);
    }

    public final boolean r0(CoroutineContext coroutineContext) {
        return this.c.r0(coroutineContext);
    }

    public final String toString() {
        return this.o;
    }
}
