package defpackage;

import kotlin.coroutines.CoroutineContext;

/* renamed from: ks9  reason: default package */
public final class ks9 extends gc8 implements vk4 {
    public final Throwable b = null;
    public final String c;

    public ks9(String str) {
        this.c = str;
    }

    public final pq4 U(long j, Runnable runnable, CoroutineContext coroutineContext) {
        u0();
        throw null;
    }

    public final void o(long j, lw1 lw1) {
        u0();
        throw null;
    }

    public final void p0(CoroutineContext coroutineContext, Runnable runnable) {
        u0();
        throw null;
    }

    public final boolean r0(CoroutineContext coroutineContext) {
        u0();
        throw null;
    }

    public final q04 s0(int i, String str) {
        u0();
        throw null;
    }

    public final gc8 t0() {
        return this;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dispatchers.Main[missing");
        Throwable th = this.b;
        if (th != null) {
            str = ", cause=" + th;
        } else {
            str = "";
        }
        return g63.l(sb, str, ']');
    }

    public final void u0() {
        String str;
        Throwable th = this.b;
        if (th != null) {
            String str2 = this.c;
            if (str2 == null || (str = ". ".concat(str2)) == null) {
                str = "";
            }
            throw new IllegalStateException("Module with the Main dispatcher had failed to initialize".concat(str), th);
        }
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}
