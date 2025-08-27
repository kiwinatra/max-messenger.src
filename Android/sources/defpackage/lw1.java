package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* renamed from: lw1  reason: default package */
public class lw1 extends bq4 implements kw1, CoroutineStackFrame, neg {
    public static final /* synthetic */ AtomicIntegerFieldUpdater w;
    public static final /* synthetic */ AtomicReferenceFieldUpdater x;
    public static final /* synthetic */ AtomicReferenceFieldUpdater y;
    private volatile /* synthetic */ int _decisionAndIndex$volatile = 536870911;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile = f8.a;
    public final Continuation o;
    public final CoroutineContext v;

    static {
        Class<lw1> cls = lw1.class;
        w = AtomicIntegerFieldUpdater.newUpdater(cls, "_decisionAndIndex$volatile");
        Class<Object> cls2 = Object.class;
        x = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_state$volatile");
        y = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_parentHandle$volatile");
    }

    public lw1(int i, Continuation continuation) {
        super(i);
        this.o = continuation;
        this.v = continuation.getContext();
    }

    public static Object D(naa naa, Object obj, int i, Function3 function3) {
        if ((obj instanceof jb3) || !cq4.a(i)) {
            return obj;
        }
        if (function3 == null && !(naa instanceof bw1)) {
            return obj;
        }
        return new ib3(obj, naa instanceof bw1 ? (bw1) naa : null, function3, (CancellationException) null, 16);
    }

    public static void z(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public String A() {
        return "CancellableContinuation";
    }

    public final void B() {
        Continuation continuation = this.o;
        Throwable th = null;
        zp4 zp4 = continuation instanceof zp4 ? (zp4) continuation : null;
        if (zp4 != null) {
            loop0:
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = zp4.y;
                Object obj = atomicReferenceFieldUpdater.get(zp4);
                bpa bpa = y7e.d;
                if (obj == bpa) {
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(zp4, bpa, this)) {
                            break loop0;
                        } else if (atomicReferenceFieldUpdater.get(zp4) != bpa) {
                        }
                    }
                } else if (obj instanceof Throwable) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(zp4, obj, (Object) null)) {
                        if (atomicReferenceFieldUpdater.get(zp4) != obj) {
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                    }
                    th = obj;
                } else {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                }
            }
            if (th != null) {
                p();
                q(th);
            }
        }
    }

    public final void C(Object obj, int i, Function3 function3) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = x;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof naa) {
                Object D = D((naa) obj2, obj, i, function3);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, D)) {
                        if (!y()) {
                            p();
                        }
                        r(i);
                        return;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
            } else {
                if (obj2 instanceof tw1) {
                    tw1 tw1 = (tw1) obj2;
                    tw1.getClass();
                    if (tw1.c.compareAndSet(tw1, 0, 1)) {
                        if (function3 != null) {
                            m(function3, tw1.a, obj);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
        }
    }

    public final bpa E(Object obj, Function3 function3) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = x;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z = obj2 instanceof naa;
            bpa bpa = kr7.c;
            if (z) {
                Object D = D((naa) obj2, obj, this.c, function3);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, D)) {
                        if (!y()) {
                            p();
                        }
                        return bpa;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
            } else {
                boolean z2 = obj2 instanceof ib3;
                return null;
            }
        }
    }

    public final void a(iod iod, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = w;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        x(iod);
    }

    public final void b(Object obj, CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = x;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof naa) {
                throw new IllegalStateException("Not completed".toString());
            } else if (!(obj2 instanceof jb3)) {
                if (obj2 instanceof ib3) {
                    ib3 ib3 = (ib3) obj2;
                    if (!(ib3.e != null)) {
                        ib3 a = ib3.a(ib3, (bw1) null, cancellationException, 15);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            }
                        }
                        bw1 bw1 = ib3.b;
                        if (bw1 != null) {
                            j(bw1, cancellationException);
                        }
                        Function3 function3 = ib3.c;
                        if (function3 != null) {
                            m(function3, cancellationException, ib3.a);
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                ib3 ib32 = new ib3(obj2, (bw1) null, (Function3) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, ib32)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
                return;
            } else {
                return;
            }
        }
    }

    public final Continuation c() {
        return this.o;
    }

    public final Throwable d(Object obj) {
        Throwable d = super.d(obj);
        if (d != null) {
            return d;
        }
        return null;
    }

    public final Object e(Object obj) {
        return obj instanceof ib3 ? ((ib3) obj).a : obj;
    }

    public final bpa f(Object obj, Function3 function3) {
        return E(obj, function3);
    }

    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.o;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    public final CoroutineContext getContext() {
        return this.v;
    }

    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    public final Object h() {
        return x.get(this);
    }

    public final void i(q04 q04, Object obj) {
        Continuation continuation = this.o;
        zp4 zp4 = continuation instanceof zp4 ? (zp4) continuation : null;
        C(obj, (zp4 != null ? zp4.o : null) == q04 ? 4 : this.c, (Function3) null);
    }

    public final boolean isActive() {
        return x.get(this) instanceof naa;
    }

    public final boolean isCancelled() {
        return x.get(this) instanceof tw1;
    }

    public final void j(bw1 bw1, Throwable th) {
        try {
            bw1.b(th);
        } catch (Throwable th2) {
            u04.a(new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2), this.v);
        }
    }

    public final void k(Function1 function1) {
        cvg.z(this, new aw1(1, function1));
    }

    public final void l(Object obj, Function3 function3) {
        C(obj, this.c, function3);
    }

    public final void m(Function3 function3, Throwable th, Object obj) {
        CoroutineContext coroutineContext = this.v;
        try {
            function3.invoke(th, obj, coroutineContext);
        } catch (Throwable th2) {
            u04.a(new RuntimeException("Exception in resume onCancellation handler for " + this, th2), coroutineContext);
        }
    }

    public final void n(iod iod, Throwable th) {
        CoroutineContext coroutineContext = this.v;
        int i = w.get(this) & 536870911;
        if (i != 536870911) {
            try {
                iod.h(i, coroutineContext);
            } catch (Throwable th2) {
                u04.a(new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2), coroutineContext);
            }
        } else {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
        }
    }

    public final bpa o(Throwable th) {
        return E(new jb3(th, false), (Function3) null);
    }

    public final void p() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = y;
        pq4 pq4 = (pq4) atomicReferenceFieldUpdater.get(this);
        if (pq4 != null) {
            pq4.dispose();
            atomicReferenceFieldUpdater.set(this, jaa.a);
        }
    }

    public final boolean q(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = x;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z = false;
            if (!(obj instanceof naa)) {
                return false;
            }
            if ((obj instanceof bw1) || (obj instanceof iod)) {
                z = true;
            }
            tw1 tw1 = new tw1(this, th, z);
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, tw1)) {
                    naa naa = (naa) obj;
                    if (naa instanceof bw1) {
                        j((bw1) obj, th);
                    } else if (naa instanceof iod) {
                        n((iod) obj, th);
                    }
                    if (!y()) {
                        p();
                    }
                    r(this.c);
                    return true;
                } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                }
            }
        }
    }

    public final void r(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = w;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 == 1) {
                    boolean z = i == 4;
                    Continuation continuation = this.o;
                    if (z || !(continuation instanceof zp4) || cq4.a(i) != cq4.a(this.c)) {
                        cq4.b(this, continuation, z);
                        return;
                    }
                    zp4 zp4 = (zp4) continuation;
                    q04 q04 = zp4.o;
                    CoroutineContext context = zp4.v.getContext();
                    if (q04.r0(context)) {
                        q04.p0(context, this);
                        return;
                    }
                    a95 a = lif.a();
                    if (a.x0()) {
                        a.u0(this);
                        return;
                    }
                    a.w0(true);
                    try {
                        cq4.b(this, continuation, true);
                        do {
                        } while (a.z0());
                    } catch (Throwable th) {
                        a.t0(true);
                        throw th;
                    }
                    a.t0(true);
                    return;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    public final void resumeWith(Object obj) {
        Throwable r0 = Result.m26exceptionOrNullimpl(obj);
        if (r0 != null) {
            obj = new jb3(r0, false);
        }
        C(obj, this.c, (Function3) null);
    }

    public Throwable s(qn7 qn7) {
        return qn7.n();
    }

    public final Object t() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        boolean y2 = y();
        do {
            atomicIntegerFieldUpdater = w;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 2) {
                    if (y2) {
                        B();
                    }
                    Object obj = x.get(this);
                    if (!(obj instanceof jb3)) {
                        if (cq4.a(this.c)) {
                            pm7 pm7 = (pm7) this.v.get(om7.a);
                            if (pm7 != null && !pm7.isActive()) {
                                CancellationException n = pm7.n();
                                b(obj, n);
                                throw n;
                            }
                        }
                        return e(obj);
                    }
                    throw ((jb3) obj).a;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((pq4) y.get(this)) == null) {
            w();
        }
        if (y2) {
            B();
        }
        return IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(A());
        sb.append('(');
        sb.append(n79.U(this.o));
        sb.append("){");
        Object obj = x.get(this);
        sb.append(obj instanceof naa ? "Active" : obj instanceof tw1 ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(n79.A(this));
        return sb.toString();
    }

    public final void u() {
        pq4 w2 = w();
        if (w2 != null && (!(x.get(this) instanceof naa))) {
            w2.dispose();
            y.set(this, jaa.a);
        }
    }

    public final void v(Object obj) {
        r(this.c);
    }

    public final pq4 w() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        pm7 pm7 = (pm7) this.v.get(om7.a);
        if (pm7 == null) {
            return null;
        }
        pq4 H = kv0.H(pm7, new gz2(this, 0));
        do {
            atomicReferenceFieldUpdater = y;
            if (atomicReferenceFieldUpdater.compareAndSet(this, (Object) null, H) || atomicReferenceFieldUpdater.get(this) != null) {
                return H;
            }
            atomicReferenceFieldUpdater = y;
            break;
        } while (atomicReferenceFieldUpdater.get(this) != null);
        return H;
    }

    public final void x(Object obj) {
        Object obj2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = x;
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof f8) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
                return;
            }
            Throwable th = null;
            if ((obj2 instanceof bw1) || (obj2 instanceof iod)) {
                z(obj, obj2);
            } else if (obj2 instanceof jb3) {
                jb3 jb3 = (jb3) obj2;
                jb3.getClass();
                if (!jb3.b.compareAndSet(jb3, 0, 1)) {
                    z(obj, obj2);
                    throw null;
                } else if (obj2 instanceof tw1) {
                    if (!(obj2 instanceof jb3)) {
                        jb3 = null;
                    }
                    if (jb3 != null) {
                        th = jb3.a;
                    }
                    if (obj instanceof bw1) {
                        j((bw1) obj, th);
                        return;
                    } else {
                        n((iod) obj, th);
                        return;
                    }
                } else {
                    return;
                }
            } else if (obj2 instanceof ib3) {
                ib3 ib3 = (ib3) obj2;
                if (ib3.b != null) {
                    z(obj, obj2);
                    throw null;
                } else if (!(obj instanceof iod)) {
                    bw1 bw1 = (bw1) obj;
                    Throwable th2 = ib3.e;
                    if (th2 != null) {
                        j(bw1, th2);
                        return;
                    }
                    ib3 a = ib3.a(ib3, bw1, (CancellationException) null, 29);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        }
                    }
                    return;
                } else {
                    return;
                }
            } else if (!(obj instanceof iod)) {
                ib3 ib32 = new ib3(obj2, (bw1) obj, (Function3) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, ib32)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
                return;
            } else {
                return;
            }
        }
        z(obj, obj2);
        throw null;
    }

    public final boolean y() {
        if (this.c == 2) {
            zp4 zp4 = (zp4) this.o;
            zp4.getClass();
            if (zp4.y.get(zp4) != null) {
                return true;
            }
        }
        return false;
    }
}
