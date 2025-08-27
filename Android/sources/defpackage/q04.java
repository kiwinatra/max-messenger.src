package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.AbstractCoroutineContextKey;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;

/* renamed from: q04  reason: default package */
public abstract class q04 extends AbstractCoroutineContextElement implements ContinuationInterceptor {
    public static final p04 a = new AbstractCoroutineContextKey(ContinuationInterceptor.Key, new of3(7));

    public q04() {
        super(ContinuationInterceptor.Key);
    }

    public final CoroutineContext.Element get(CoroutineContext.Key key) {
        return ContinuationInterceptor.DefaultImpls.get(this, key);
    }

    public final Continuation interceptContinuation(Continuation continuation) {
        return new zp4(this, continuation);
    }

    public final CoroutineContext minusKey(CoroutineContext.Key key) {
        return ContinuationInterceptor.DefaultImpls.minusKey(this, key);
    }

    public abstract void p0(CoroutineContext coroutineContext, Runnable runnable);

    public void q0(CoroutineContext coroutineContext, Runnable runnable) {
        p0(coroutineContext, runnable);
    }

    public boolean r0(CoroutineContext coroutineContext) {
        return !(this instanceof fvf);
    }

    public final void releaseInterceptedContinuation(Continuation continuation) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        zp4 zp4 = (zp4) continuation;
        zp4.getClass();
        do {
            atomicReferenceFieldUpdater = zp4.y;
        } while (atomicReferenceFieldUpdater.get(zp4) == y7e.d);
        Object obj = atomicReferenceFieldUpdater.get(zp4);
        lw1 lw1 = obj instanceof lw1 ? (lw1) obj : null;
        if (lw1 != null) {
            lw1.p();
        }
    }

    public q04 s0(int i, String str) {
        y7e.f(i);
        return new qv7(this, i, str);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + n79.A(this);
    }
}
