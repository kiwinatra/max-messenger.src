package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.JobCancellationException;

/* renamed from: zvb  reason: default package */
public final class zvb extends g0 implements cwb, x02 {
    public final x02 o;

    public zvb(CoroutineContext coroutineContext, ru0 ru0) {
        super(coroutineContext, true, true);
        this.o = ru0;
    }

    public final void A(CancellationException cancellationException) {
        this.o.b(cancellationException);
        z(cancellationException);
    }

    public final void b(CancellationException cancellationException) {
        if (!isCancelled()) {
            if (cancellationException == null) {
                cancellationException = new JobCancellationException(C(), (Throwable) null, this);
            }
            A(cancellationException);
        }
    }

    public final m7f c() {
        return this.o.c();
    }

    public final Object e() {
        return this.o.e();
    }

    public final Object h(Continuation continuation) {
        Object h = this.o.h(continuation);
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return h;
    }

    public final void h0(Throwable th, boolean z) {
        if (!this.o.p(th) && !z) {
            u04.a(th, this.c);
        }
    }

    public final void i0(Object obj) {
        Unit unit = (Unit) obj;
        this.o.p((Throwable) null);
    }

    public final lu0 iterator() {
        return this.o.iterator();
    }

    public final boolean p(Throwable th) {
        return this.o.p(th);
    }

    public final void r(hw2 hw2) {
        this.o.r(hw2);
    }

    public final Object s(Object obj) {
        return this.o.s(obj);
    }

    public final Object t(Object obj, Continuation continuation) {
        return this.o.t(obj, continuation);
    }

    public final boolean u() {
        return this.o.u();
    }
}
