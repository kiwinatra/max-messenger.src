package defpackage;

import kotlin.coroutines.CoroutineContext;

/* renamed from: oab  reason: default package */
public final class oab extends q04 {
    public final yp4 b = new yp4();

    public final void p0(CoroutineContext coroutineContext, Runnable runnable) {
        yp4 yp4 = this.b;
        yp4.getClass();
        bi4 bi4 = dq4.a;
        gc8 t0 = lc8.a.t0();
        if (!t0.r0(coroutineContext)) {
            if (!(yp4.b || !yp4.a)) {
                if (yp4.d.offer(runnable)) {
                    yp4.a();
                    return;
                }
                throw new IllegalStateException("cannot enqueue any more runnables".toString());
            }
        }
        t0.p0(coroutineContext, new bk4(3, yp4, runnable));
    }

    public final boolean r0(CoroutineContext coroutineContext) {
        bi4 bi4 = dq4.a;
        if (lc8.a.t0().r0(coroutineContext)) {
            return true;
        }
        yp4 yp4 = this.b;
        return !(yp4.b || !yp4.a);
    }
}
