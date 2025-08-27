package defpackage;

import kotlin.coroutines.CoroutineContext;

/* renamed from: fvf  reason: default package */
public final class fvf extends q04 {
    public static final fvf b = new q04();

    public final void p0(CoroutineContext coroutineContext, Runnable runnable) {
        mrg mrg = (mrg) coroutineContext.get(mrg.b);
        if (mrg != null) {
            mrg.a = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    public final q04 s0(int i, String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
