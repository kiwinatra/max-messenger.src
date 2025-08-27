package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* renamed from: l6d  reason: default package */
public final class l6d implements Runnable {
    public final /* synthetic */ CoroutineContext a;
    public final /* synthetic */ kw1 b;
    public final /* synthetic */ i6d c;
    public final /* synthetic */ Function2 o;

    public l6d(CoroutineContext coroutineContext, lw1 lw1, i6d i6d, m6d m6d) {
        this.a = coroutineContext;
        this.b = lw1;
        this.c = i6d;
        this.o = m6d;
    }

    public final void run() {
        kw1 kw1 = this.b;
        try {
            ev0.C(this.a.minusKey(ContinuationInterceptor.Key), new k6d(this.c, (lw1) kw1, (m6d) this.o, (Continuation) null));
        } catch (Throwable th) {
            kw1.q(th);
        }
    }
}
