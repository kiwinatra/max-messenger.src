package defpackage;

import kotlin.coroutines.CoroutineContext;

/* renamed from: vvf  reason: default package */
public final class vvf extends q04 {
    public static final vvf b = new q04();

    public final void p0(CoroutineContext coroutineContext, Runnable runnable) {
        bi4 bi4 = bi4.c;
        bi4.b.n(runnable, jef.h, false);
    }

    public final void q0(CoroutineContext coroutineContext, Runnable runnable) {
        bi4 bi4 = bi4.c;
        bi4.b.n(runnable, jef.h, true);
    }

    public final q04 s0(int i, String str) {
        y7e.f(i);
        return i >= jef.d ? str != null ? new i5a(this, str) : this : super.s0(i, str);
    }

    public final String toString() {
        return "Dispatchers.IO";
    }
}
