package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;

/* renamed from: zp4  reason: default package */
public final class zp4 extends bq4 implements CoroutineStackFrame, Continuation {
    public static final /* synthetic */ AtomicReferenceFieldUpdater y = AtomicReferenceFieldUpdater.newUpdater(zp4.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final q04 o;
    public final Continuation v;
    public Object w = y7e.c;
    public final Object x;

    public zp4(q04 q04, Continuation continuation) {
        super(-1);
        this.o = q04;
        this.v = continuation;
        this.x = continuation.getContext().fold(0, eif.b);
    }

    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof kb3) {
            ((kb3) obj).b.invoke(cancellationException);
        }
    }

    public final Continuation c() {
        return this;
    }

    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.v;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    public final CoroutineContext getContext() {
        return this.v.getContext();
    }

    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    public final Object h() {
        Object obj = this.w;
        this.w = y7e.c;
        return obj;
    }

    public final void resumeWith(Object obj) {
        CoroutineContext context;
        Object b;
        Continuation continuation = this.v;
        CoroutineContext context2 = continuation.getContext();
        Throwable r2 = Result.m26exceptionOrNullimpl(obj);
        Object jb3 = r2 == null ? obj : new jb3(r2, false);
        q04 q04 = this.o;
        if (q04.r0(context2)) {
            this.w = jb3;
            this.c = 0;
            q04.p0(context2, this);
            return;
        }
        a95 a = lif.a();
        if (a.x0()) {
            this.w = jb3;
            this.c = 0;
            a.u0(this);
            return;
        }
        a.w0(true);
        try {
            context = continuation.getContext();
            b = eif.b(context, this.x);
            continuation.resumeWith(obj);
            Unit unit = Unit.INSTANCE;
            eif.a(context, b);
            do {
            } while (a.z0());
        } catch (Throwable th) {
            a.t0(true);
            throw th;
        }
        a.t0(true);
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.o + ", " + n79.U(this.v) + ']';
    }
}
