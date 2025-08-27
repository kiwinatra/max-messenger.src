package defpackage;

import kotlin.coroutines.CoroutineContext;

/* renamed from: pfd  reason: default package */
public abstract class pfd extends x95 {
    public final c14 b;

    public pfd(long j, String str, int i, int i2) {
        this.b = new c14(j, str, i, i2);
    }

    public final void p0(CoroutineContext coroutineContext, Runnable runnable) {
        c14.o(this.b, runnable, false, 6);
    }

    public final void q0(CoroutineContext coroutineContext, Runnable runnable) {
        c14.o(this.b, runnable, true, 2);
    }
}
