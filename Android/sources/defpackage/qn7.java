package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;

/* renamed from: qn7  reason: default package */
public class qn7 implements pm7, kz2, k8b {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a;
    public static final /* synthetic */ AtomicReferenceFieldUpdater b;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Class<qn7> cls = qn7.class;
        Class<Object> cls2 = Object.class;
        a = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_state$volatile");
        b = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_parentHandle$volatile");
    }

    public qn7(boolean z) {
        this._state$volatile = z ? ld9.j : ld9.i;
    }

    public static iz2 W(u68 u68) {
        while (u68.g()) {
            u68 d = u68.d();
            if (d == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = u68.b;
                Object obj = atomicReferenceFieldUpdater.get(u68);
                while (true) {
                    u68 = (u68) obj;
                    if (!u68.g()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(u68);
                }
            } else {
                u68 = d;
            }
        }
        while (true) {
            u68 = u68.f();
            if (!u68.g()) {
                if (u68 instanceof iz2) {
                    return (iz2) u68;
                }
                if (u68 instanceof x9a) {
                    return null;
                }
            }
        }
    }

    public static String d0(Object obj) {
        if (!(obj instanceof mn7)) {
            return obj instanceof oe7 ? ((oe7) obj).isActive() ? "Active" : "New" : obj instanceof jb3 ? "Cancelled" : "Completed";
        }
        mn7 mn7 = (mn7) obj;
        return mn7.d() ? "Cancelling" : mn7.b.get(mn7) != 0 ? "Completing" : "Active";
    }

    public void A(CancellationException cancellationException) {
        z(cancellationException);
    }

    public final boolean B(Throwable th) {
        if (Q()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        hz2 hz2 = (hz2) b.get(this);
        return (hz2 == null || hz2 == jaa.a) ? z : hz2.a(th) || z;
    }

    public String C() {
        return "Job was cancelled";
    }

    public boolean D(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return z(th) && J();
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.RuntimeException] */
    /* JADX WARNING: type inference failed for: r0v10, types: [java.lang.RuntimeException, kotlinx.coroutines.CompletionHandlerException] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E(defpackage.oe7 r7, java.lang.Object r8) {
        /*
            r6 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = b
            java.lang.Object r1 = r0.get(r6)
            hz2 r1 = (defpackage.hz2) r1
            if (r1 == 0) goto L_0x0012
            r1.dispose()
            jaa r1 = defpackage.jaa.a
            r0.set(r6, r1)
        L_0x0012:
            boolean r0 = r8 instanceof defpackage.jb3
            r1 = 0
            if (r0 == 0) goto L_0x001a
            jb3 r8 = (defpackage.jb3) r8
            goto L_0x001b
        L_0x001a:
            r8 = r1
        L_0x001b:
            if (r8 == 0) goto L_0x0020
            java.lang.Throwable r8 = r8.a
            goto L_0x0021
        L_0x0020:
            r8 = r1
        L_0x0021:
            boolean r0 = r7 instanceof defpackage.dn7
            java.lang.String r2 = " for "
            java.lang.String r3 = "Exception in completion handler "
            if (r0 == 0) goto L_0x004c
            r0 = r7
            dn7 r0 = (defpackage.dn7) r0     // Catch:{ all -> 0x0030 }
            r0.i(r8)     // Catch:{ all -> 0x0030 }
            goto L_0x009e
        L_0x0030:
            r8 = move-exception
            kotlinx.coroutines.CompletionHandlerException r0 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r7)
            r1.append(r2)
            r1.append(r6)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7, r8)
            r6.N(r0)
            goto L_0x009e
        L_0x004c:
            x9a r7 = r7.b()
            if (r7 == 0) goto L_0x009e
            iz7 r0 = new iz7
            r4 = 1
            r0.<init>(r4)
            r7.c(r0, r4)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.u68.a
            java.lang.Object r0 = r0.get(r7)
            u68 r0 = (defpackage.u68) r0
        L_0x0063:
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r7)
            if (r4 != 0) goto L_0x0099
            boolean r4 = r0 instanceof defpackage.dn7
            if (r4 == 0) goto L_0x0094
            r4 = r0
            dn7 r4 = (defpackage.dn7) r4     // Catch:{ all -> 0x0074 }
            r4.i(r8)     // Catch:{ all -> 0x0074 }
            goto L_0x0094
        L_0x0074:
            r4 = move-exception
            if (r1 == 0) goto L_0x007b
            kotlin.ExceptionsKt.addSuppressed(r1, r4)
            goto L_0x0094
        L_0x007b:
            kotlinx.coroutines.CompletionHandlerException r1 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            r5.append(r0)
            r5.append(r2)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5, r4)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x0094:
            u68 r0 = r0.f()
            goto L_0x0063
        L_0x0099:
            if (r1 == 0) goto L_0x009e
            r6.N(r1)
        L_0x009e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qn7.E(oe7, java.lang.Object):void");
    }

    public final Throwable F(Object obj) {
        Throwable th;
        CancellationException cancellationException = null;
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th2 = (Throwable) obj;
            return th2 == null ? new JobCancellationException(C(), (Throwable) null, this) : th2;
        }
        qn7 qn7 = (qn7) ((k8b) obj);
        qn7.getClass();
        Object obj2 = a.get(qn7);
        if (obj2 instanceof mn7) {
            th = ((mn7) obj2).c();
        } else if (obj2 instanceof jb3) {
            th = ((jb3) obj2).a;
        } else if (!(obj2 instanceof oe7)) {
            th = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException("Parent job is ".concat(d0(obj2)), th, qn7);
        }
        return cancellationException;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x008c A[LOOP:1: B:39:0x008c->B:42:0x0097, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object G(defpackage.mn7 r8, java.lang.Object r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.jb3
            r1 = 0
            if (r0 == 0) goto L_0x0009
            r0 = r9
            jb3 r0 = (defpackage.jb3) r0
            goto L_0x000a
        L_0x0009:
            r0 = r1
        L_0x000a:
            if (r0 == 0) goto L_0x000e
            java.lang.Throwable r1 = r0.a
        L_0x000e:
            monitor-enter(r8)
            r8.d()     // Catch:{ all -> 0x009d }
            java.util.ArrayList r0 = r8.e(r1)     // Catch:{ all -> 0x009d }
            java.lang.Throwable r2 = r7.I(r8, r0)     // Catch:{ all -> 0x009d }
            r3 = 1
            if (r2 == 0) goto L_0x0053
            int r4 = r0.size()     // Catch:{ all -> 0x009d }
            if (r4 > r3) goto L_0x0024
            goto L_0x0053
        L_0x0024:
            int r4 = r0.size()     // Catch:{ all -> 0x009d }
            java.util.IdentityHashMap r5 = new java.util.IdentityHashMap     // Catch:{ all -> 0x009d }
            r5.<init>(r4)     // Catch:{ all -> 0x009d }
            java.util.Set r4 = java.util.Collections.newSetFromMap(r5)     // Catch:{ all -> 0x009d }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x009d }
        L_0x0035:
            boolean r5 = r0.hasNext()     // Catch:{ all -> 0x009d }
            if (r5 == 0) goto L_0x0053
            java.lang.Object r5 = r0.next()     // Catch:{ all -> 0x009d }
            java.lang.Throwable r5 = (java.lang.Throwable) r5     // Catch:{ all -> 0x009d }
            if (r5 == r2) goto L_0x0035
            if (r5 == r2) goto L_0x0035
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException     // Catch:{ all -> 0x009d }
            if (r6 != 0) goto L_0x0035
            boolean r6 = r4.add(r5)     // Catch:{ all -> 0x009d }
            if (r6 == 0) goto L_0x0035
            kotlin.ExceptionsKt.addSuppressed(r2, r5)     // Catch:{ all -> 0x009d }
            goto L_0x0035
        L_0x0053:
            monitor-exit(r8)
            r0 = 0
            if (r2 != 0) goto L_0x0058
            goto L_0x0060
        L_0x0058:
            if (r2 != r1) goto L_0x005b
            goto L_0x0060
        L_0x005b:
            jb3 r9 = new jb3
            r9.<init>(r2, r0)
        L_0x0060:
            if (r2 == 0) goto L_0x0079
            boolean r1 = r7.B(r2)
            if (r1 != 0) goto L_0x006e
            boolean r1 = r7.M(r2)
            if (r1 == 0) goto L_0x0079
        L_0x006e:
            r1 = r9
            jb3 r1 = (defpackage.jb3) r1
            r1.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = defpackage.jb3.b
            r2.compareAndSet(r1, r0, r3)
        L_0x0079:
            r7.Y(r9)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = a
            boolean r1 = r9 instanceof defpackage.oe7
            if (r1 == 0) goto L_0x008b
            pe7 r1 = new pe7
            r2 = r9
            oe7 r2 = (defpackage.oe7) r2
            r1.<init>(r2)
            goto L_0x008c
        L_0x008b:
            r1 = r9
        L_0x008c:
            boolean r2 = r0.compareAndSet(r7, r8, r1)
            if (r2 == 0) goto L_0x0093
            goto L_0x0099
        L_0x0093:
            java.lang.Object r2 = r0.get(r7)
            if (r2 == r8) goto L_0x008c
        L_0x0099:
            r7.E(r8, r9)
            return r9
        L_0x009d:
            r7 = move-exception
            monitor-exit(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qn7.G(mn7, java.lang.Object):java.lang.Object");
    }

    public final Object H() {
        Object obj = a.get(this);
        if (!(!(obj instanceof oe7))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        } else if (!(obj instanceof jb3)) {
            return ld9.U(obj);
        } else {
            throw ((jb3) obj).a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Throwable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Throwable I(defpackage.mn7 r3, java.util.ArrayList r4) {
        /*
            r2 = this;
            boolean r0 = r4.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x0018
            boolean r3 = r3.d()
            if (r3 == 0) goto L_0x0017
            kotlinx.coroutines.JobCancellationException r3 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r4 = r2.C()
            r3.<init>(r4, r1, r2)
            return r3
        L_0x0017:
            return r1
        L_0x0018:
            java.util.Iterator r2 = r4.iterator()
        L_0x001c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0030
            java.lang.Object r3 = r2.next()
            r0 = r3
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            boolean r0 = r0 instanceof java.util.concurrent.CancellationException
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x001c
            goto L_0x0031
        L_0x0030:
            r3 = r1
        L_0x0031:
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            if (r3 == 0) goto L_0x0036
            return r3
        L_0x0036:
            r2 = 0
            java.lang.Object r2 = r4.get(r2)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            boolean r3 = r2 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r3 == 0) goto L_0x005e
            java.util.Iterator r3 = r4.iterator()
        L_0x0045:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0059
            java.lang.Object r4 = r3.next()
            r0 = r4
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 == r2) goto L_0x0045
            boolean r0 = r0 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r0 == 0) goto L_0x0045
            r1 = r4
        L_0x0059:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L_0x005e
            return r1
        L_0x005e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qn7.I(mn7, java.util.ArrayList):java.lang.Throwable");
    }

    public boolean J() {
        return true;
    }

    public boolean K() {
        return this instanceof sa3;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [x9a, u68] */
    public final x9a L(oe7 oe7) {
        x9a b2 = oe7.b();
        if (b2 != null) {
            return b2;
        }
        if (oe7 instanceof m45) {
            return new u68();
        }
        if (oe7 instanceof dn7) {
            b0((dn7) oe7);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + oe7).toString());
    }

    public boolean M(Throwable th) {
        return false;
    }

    public void N(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }

    public final void O(pm7 pm7) {
        jaa jaa = jaa.a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        if (pm7 == null) {
            atomicReferenceFieldUpdater.set(this, jaa);
            return;
        }
        pm7.start();
        hz2 g = pm7.g(this);
        atomicReferenceFieldUpdater.set(this, g);
        if (e0()) {
            g.dispose();
            atomicReferenceFieldUpdater.set(this, jaa);
        }
    }

    public final pq4 P(boolean z, dn7 dn7) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        jaa jaa;
        boolean z2;
        Throwable th;
        boolean z3;
        dn7.o = this;
        loop0:
        while (true) {
            atomicReferenceFieldUpdater = a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z4 = obj instanceof m45;
            jaa = jaa.a;
            z2 = true;
            th = null;
            if (!z4) {
                if (!(obj instanceof oe7)) {
                    z2 = false;
                    break;
                }
                oe7 oe7 = (oe7) obj;
                x9a b2 = oe7.b();
                if (b2 == null) {
                    b0((dn7) obj);
                } else {
                    if (dn7.h()) {
                        mn7 mn7 = oe7 instanceof mn7 ? (mn7) oe7 : null;
                        Throwable c = mn7 != null ? mn7.c() : null;
                        if (c == null) {
                            z3 = b2.c(dn7, 5);
                        } else {
                            if (z) {
                                dn7.i(c);
                            }
                            return jaa;
                        }
                    } else {
                        z3 = b2.c(dn7, 1);
                    }
                    if (z3) {
                        break;
                    }
                }
            } else {
                m45 m45 = (m45) obj;
                if (m45.a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, dn7)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                        }
                    }
                    break loop0;
                }
                a0(m45);
            }
        }
        if (z2) {
            return dn7;
        }
        if (z) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            jb3 jb3 = obj2 instanceof jb3 ? (jb3) obj2 : null;
            if (jb3 != null) {
                th = jb3.a;
            }
            dn7.i(th);
        }
        return jaa;
    }

    public boolean Q() {
        return this instanceof rp0;
    }

    public final boolean R(Object obj) {
        Object f0;
        do {
            f0 = f0(a.get(this), obj);
            if (f0 == ld9.d) {
                return false;
            }
            if (f0 == ld9.e) {
                return true;
            }
        } while (f0 == ld9.f);
        w(f0);
        return true;
    }

    public final Object S(Object obj) {
        Object f0;
        do {
            f0 = f0(a.get(this), obj);
            if (f0 == ld9.d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                jb3 jb3 = obj instanceof jb3 ? (jb3) obj : null;
                if (jb3 != null) {
                    th = jb3.a;
                }
                throw new IllegalStateException(str, th);
            }
        } while (f0 == ld9.f);
        return f0;
    }

    public String T() {
        return getClass().getSimpleName();
    }

    public final pq4 V(Function1 function1) {
        return P(true, new tq4(1, function1));
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.RuntimeException] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void X(defpackage.x9a r6, java.lang.Throwable r7) {
        /*
            r5 = this;
            iz7 r0 = new iz7
            r1 = 4
            r0.<init>(r1)
            r6.c(r0, r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.u68.a
            java.lang.Object r0 = r0.get(r6)
            u68 r0 = (defpackage.u68) r0
            r1 = 0
        L_0x0012:
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r6)
            if (r2 != 0) goto L_0x0055
            boolean r2 = r0 instanceof defpackage.dn7
            if (r2 == 0) goto L_0x0050
            r2 = r0
            dn7 r2 = (defpackage.dn7) r2
            boolean r2 = r2.h()
            if (r2 == 0) goto L_0x0050
            r2 = r0
            dn7 r2 = (defpackage.dn7) r2     // Catch:{ all -> 0x002c }
            r2.i(r7)     // Catch:{ all -> 0x002c }
            goto L_0x0050
        L_0x002c:
            r2 = move-exception
            if (r1 == 0) goto L_0x0033
            kotlin.ExceptionsKt.addSuppressed(r1, r2)
            goto L_0x0050
        L_0x0033:
            kotlinx.coroutines.CompletionHandlerException r1 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Exception in completion handler "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r4 = " for "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r1.<init>(r3, r2)
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
        L_0x0050:
            u68 r0 = r0.f()
            goto L_0x0012
        L_0x0055:
            if (r1 == 0) goto L_0x005a
            r5.N(r1)
        L_0x005a:
            r5.B(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qn7.X(x9a, java.lang.Throwable):void");
    }

    public void Y(Object obj) {
    }

    public void Z() {
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [x9a, u68] */
    public final void a0(m45 m45) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        ? u68 = new u68();
        zd7 zd7 = u68;
        if (!m45.a) {
            zd7 = new zd7(u68);
        }
        do {
            atomicReferenceFieldUpdater = a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, m45, zd7) || atomicReferenceFieldUpdater.get(this) != m45) {
            }
            atomicReferenceFieldUpdater = a;
            return;
        } while (atomicReferenceFieldUpdater.get(this) != m45);
    }

    public void b(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(C(), (Throwable) null, this);
        }
        A(cancellationException);
    }

    public final void b0(dn7 dn7) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        u68 u68 = new u68();
        dn7.getClass();
        u68.b.set(u68, dn7);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = u68.a;
        atomicReferenceFieldUpdater2.set(u68, dn7);
        loop0:
        while (true) {
            if (atomicReferenceFieldUpdater2.get(dn7) != dn7) {
                break;
            }
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(dn7, dn7, u68)) {
                    u68.e(dn7);
                    break loop0;
                } else if (atomicReferenceFieldUpdater2.get(dn7) != dn7) {
                }
            }
        }
        u68 f = dn7.f();
        do {
            atomicReferenceFieldUpdater = a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, dn7, f) || atomicReferenceFieldUpdater.get(this) != dn7) {
            }
            atomicReferenceFieldUpdater = a;
            return;
        } while (atomicReferenceFieldUpdater.get(this) != dn7);
    }

    public final int c0(Object obj) {
        boolean z = obj instanceof m45;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        if (z) {
            if (((m45) obj).a) {
                return 0;
            }
            m45 m45 = ld9.j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, m45)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            Z();
            return 1;
        } else if (!(obj instanceof zd7)) {
            return 0;
        } else {
            x9a x9a = ((zd7) obj).a;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, x9a)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            Z();
            return 1;
        }
    }

    public final Object d(Continuation continuation) {
        Object obj;
        do {
            obj = a.get(this);
            if (!(obj instanceof oe7)) {
                kv0.q(continuation.getContext());
                return Unit.INSTANCE;
            }
        } while (c0(obj) < 0);
        lw1 lw1 = new lw1(1, IntrinsicsKt.intercepted(continuation));
        lw1.u();
        cvg.z(lw1, new aw1(2, kv0.H(this, new tq4(2, lw1))));
        Object t = lw1.t();
        if (t == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        if (t != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            t = Unit.INSTANCE;
        }
        return t == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? t : Unit.INSTANCE;
    }

    public final boolean e0() {
        return !(a.get(this) instanceof oe7);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00b2, code lost:
        if (r2 == null) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00b4, code lost:
        X(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00b7, code lost:
        r8 = W(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00bb, code lost:
        if (r8 == null) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00c1, code lost:
        if (g0(r1, r8, r9) == false) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00c6, code lost:
        r0.c(new defpackage.iz7(2), 2);
        r8 = W(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00d3, code lost:
        if (r8 == null) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00d9, code lost:
        if (g0(r1, r8, r9) == false) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        return G(r1, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        return defpackage.ld9.e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
        return defpackage.ld9.e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f0(java.lang.Object r8, java.lang.Object r9) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.oe7
            if (r0 != 0) goto L_0x0007
            bpa r7 = defpackage.ld9.d
            return r7
        L_0x0007:
            boolean r0 = r8 instanceof defpackage.m45
            if (r0 != 0) goto L_0x000f
            boolean r0 = r8 instanceof defpackage.dn7
            if (r0 == 0) goto L_0x0041
        L_0x000f:
            boolean r0 = r8 instanceof defpackage.iz2
            if (r0 != 0) goto L_0x0041
            boolean r0 = r9 instanceof defpackage.jb3
            if (r0 != 0) goto L_0x0041
            r0 = r8
            oe7 r0 = (defpackage.oe7) r0
            boolean r8 = r9 instanceof defpackage.oe7
            if (r8 == 0) goto L_0x0028
            pe7 r8 = new pe7
            r1 = r9
            oe7 r1 = (defpackage.oe7) r1
            r8.<init>(r1)
            r1 = r8
            goto L_0x0029
        L_0x0028:
            r1 = r9
        L_0x0029:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = a
            boolean r2 = r8.compareAndSet(r7, r0, r1)
            if (r2 == 0) goto L_0x0038
            r7.Y(r9)
            r7.E(r0, r9)
            return r9
        L_0x0038:
            java.lang.Object r8 = r8.get(r7)
            if (r8 == r0) goto L_0x0029
            bpa r7 = defpackage.ld9.f
            return r7
        L_0x0041:
            oe7 r8 = (defpackage.oe7) r8
            x9a r0 = r7.L(r8)
            if (r0 != 0) goto L_0x004d
            bpa r7 = defpackage.ld9.f
            goto L_0x00e2
        L_0x004d:
            boolean r1 = r8 instanceof defpackage.mn7
            r2 = 0
            if (r1 == 0) goto L_0x0056
            r1 = r8
            mn7 r1 = (defpackage.mn7) r1
            goto L_0x0057
        L_0x0056:
            r1 = r2
        L_0x0057:
            if (r1 != 0) goto L_0x005e
            mn7 r1 = new mn7
            r1.<init>(r0, r2)
        L_0x005e:
            kotlin.jvm.internal.Ref$ObjectRef r3 = new kotlin.jvm.internal.Ref$ObjectRef
            r3.<init>()
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = defpackage.mn7.b     // Catch:{ all -> 0x009b }
            int r5 = r4.get(r1)     // Catch:{ all -> 0x009b }
            r6 = 1
            if (r5 == 0) goto L_0x006f
            r5 = r6
            goto L_0x0070
        L_0x006f:
            r5 = 0
        L_0x0070:
            if (r5 == 0) goto L_0x0077
            bpa r7 = defpackage.ld9.d     // Catch:{ all -> 0x009b }
            monitor-exit(r1)
            goto L_0x00e2
        L_0x0077:
            r4.set(r1, r6)     // Catch:{ all -> 0x009b }
            if (r1 == r8) goto L_0x008f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = a     // Catch:{ all -> 0x009b }
        L_0x007e:
            boolean r5 = r4.compareAndSet(r7, r8, r1)     // Catch:{ all -> 0x009b }
            if (r5 == 0) goto L_0x0085
            goto L_0x008f
        L_0x0085:
            java.lang.Object r5 = r4.get(r7)     // Catch:{ all -> 0x009b }
            if (r5 == r8) goto L_0x007e
            bpa r7 = defpackage.ld9.f     // Catch:{ all -> 0x009b }
            monitor-exit(r1)
            goto L_0x00e2
        L_0x008f:
            boolean r8 = r1.d()     // Catch:{ all -> 0x009b }
            boolean r4 = r9 instanceof defpackage.jb3     // Catch:{ all -> 0x009b }
            if (r4 == 0) goto L_0x009d
            r4 = r9
            jb3 r4 = (defpackage.jb3) r4     // Catch:{ all -> 0x009b }
            goto L_0x009e
        L_0x009b:
            r7 = move-exception
            goto L_0x00e3
        L_0x009d:
            r4 = r2
        L_0x009e:
            if (r4 == 0) goto L_0x00a5
            java.lang.Throwable r4 = r4.a     // Catch:{ all -> 0x009b }
            r1.a(r4)     // Catch:{ all -> 0x009b }
        L_0x00a5:
            java.lang.Throwable r4 = r1.c()     // Catch:{ all -> 0x009b }
            r8 = r8 ^ r6
            if (r8 == 0) goto L_0x00ad
            r2 = r4
        L_0x00ad:
            r3.element = r2     // Catch:{ all -> 0x009b }
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x009b }
            monitor-exit(r1)
            if (r2 == 0) goto L_0x00b7
            r7.X(r0, r2)
        L_0x00b7:
            iz2 r8 = W(r0)
            if (r8 == 0) goto L_0x00c6
            boolean r8 = r7.g0(r1, r8, r9)
            if (r8 == 0) goto L_0x00c6
            bpa r7 = defpackage.ld9.e
            goto L_0x00e2
        L_0x00c6:
            iz7 r8 = new iz7
            r2 = 2
            r8.<init>(r2)
            r0.c(r8, r2)
            iz2 r8 = W(r0)
            if (r8 == 0) goto L_0x00de
            boolean r8 = r7.g0(r1, r8, r9)
            if (r8 == 0) goto L_0x00de
            bpa r7 = defpackage.ld9.e
            goto L_0x00e2
        L_0x00de:
            java.lang.Object r7 = r7.G(r1, r9)
        L_0x00e2:
            return r7
        L_0x00e3:
            monitor-exit(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qn7.f0(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final Object fold(Object obj, Function2 function2) {
        return CoroutineContext.Element.DefaultImpls.fold(this, obj, function2);
    }

    public final hz2 g(qn7 qn7) {
        iz2 iz2 = new iz2(qn7);
        iz2.o = this;
        loop0:
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof m45) {
                m45 m45 = (m45) obj;
                if (m45.a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, iz2)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                        }
                    }
                    break loop0;
                }
                a0(m45);
            } else {
                boolean z = obj instanceof oe7;
                jaa jaa = jaa.a;
                Throwable th = null;
                if (z) {
                    x9a b2 = ((oe7) obj).b();
                    if (b2 == null) {
                        b0((dn7) obj);
                    } else if (!b2.c(iz2, 7)) {
                        boolean c = b2.c(iz2, 3);
                        Object obj2 = atomicReferenceFieldUpdater.get(this);
                        if (obj2 instanceof mn7) {
                            th = ((mn7) obj2).c();
                        } else {
                            jb3 jb3 = obj2 instanceof jb3 ? (jb3) obj2 : null;
                            if (jb3 != null) {
                                th = jb3.a;
                            }
                        }
                        iz2.i(th);
                        return c ? iz2 : jaa;
                    }
                } else {
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    jb3 jb32 = obj3 instanceof jb3 ? (jb3) obj3 : null;
                    if (jb32 != null) {
                        th = jb32.a;
                    }
                    iz2.i(th);
                    return jaa;
                }
            }
        }
    }

    public final boolean g0(mn7 mn7, iz2 iz2, Object obj) {
        pq4 pq4;
        do {
            ln7 ln7 = new ln7(this, mn7, iz2, obj);
            kz2 kz2 = iz2.v;
            if (kz2 instanceof qn7) {
                pq4 = ((qn7) kz2).P(false, ln7);
            } else {
                pq4 = ((qn7) kz2).j(false, false, new f(29, (Object) ln7));
            }
            if (pq4 != jaa.a) {
                return true;
            }
            iz2 = W(iz2);
        } while (iz2 != null);
        return false;
    }

    public final CoroutineContext.Element get(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.get(this, key);
    }

    public final CoroutineContext.Key getKey() {
        return om7.a;
    }

    public boolean isActive() {
        Object obj = a.get(this);
        return (obj instanceof oe7) && ((oe7) obj).isActive();
    }

    public final boolean isCancelled() {
        Object obj = a.get(this);
        return (obj instanceof jb3) || ((obj instanceof mn7) && ((mn7) obj).d());
    }

    public final pq4 j(boolean z, boolean z2, f fVar) {
        return P(z2, z ? new el7(fVar) : new tq4(1, fVar));
    }

    public Object m() {
        return H();
    }

    public final CoroutineContext minusKey(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.minusKey(this, key);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.util.concurrent.CancellationException} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.concurrent.CancellationException n() {
        /*
            r4 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = a
            java.lang.Object r0 = r0.get(r4)
            boolean r1 = r0 instanceof defpackage.mn7
            r2 = 0
            java.lang.String r3 = "Job is still new or active: "
            if (r1 == 0) goto L_0x004e
            mn7 r0 = (defpackage.mn7) r0
            java.lang.Throwable r0 = r0.c()
            if (r0 == 0) goto L_0x0038
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r3 = " is cancelling"
            java.lang.String r1 = r1.concat(r3)
            boolean r3 = r0 instanceof java.util.concurrent.CancellationException
            if (r3 == 0) goto L_0x002a
            r2 = r0
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L_0x002a:
            if (r2 != 0) goto L_0x0082
            kotlinx.coroutines.JobCancellationException r2 = new kotlinx.coroutines.JobCancellationException
            if (r1 != 0) goto L_0x0034
            java.lang.String r1 = r4.C()
        L_0x0034:
            r2.<init>(r1, r0, r4)
            goto L_0x0082
        L_0x0038:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L_0x004e:
            boolean r1 = r0 instanceof defpackage.oe7
            if (r1 != 0) goto L_0x0083
            boolean r1 = r0 instanceof defpackage.jb3
            if (r1 == 0) goto L_0x006e
            jb3 r0 = (defpackage.jb3) r0
            java.lang.Throwable r0 = r0.a
            boolean r1 = r0 instanceof java.util.concurrent.CancellationException
            if (r1 == 0) goto L_0x0061
            r2 = r0
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L_0x0061:
            if (r2 != 0) goto L_0x0082
            kotlinx.coroutines.JobCancellationException r1 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r2 = r4.C()
            r1.<init>(r2, r0, r4)
            r2 = r1
            goto L_0x0082
        L_0x006e:
            kotlinx.coroutines.JobCancellationException r0 = new kotlinx.coroutines.JobCancellationException
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r3 = " has completed normally"
            java.lang.String r1 = r1.concat(r3)
            r0.<init>(r1, r2, r4)
            r2 = r0
        L_0x0082:
            return r2
        L_0x0083:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qn7.n():java.util.concurrent.CancellationException");
    }

    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.plus(this, coroutineContext);
    }

    public final boolean start() {
        int c0;
        do {
            c0 = c0(a.get(this));
            if (c0 == 0) {
                return false;
            }
        } while (c0 != 1);
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(T() + '{' + d0(a.get(this)) + '}');
        sb.append('@');
        sb.append(n79.A(this));
        return sb.toString();
    }

    public void w(Object obj) {
    }

    public void x(Object obj) {
        w(obj);
    }

    public final Object y(Continuation continuation) {
        Object obj;
        do {
            obj = a.get(this);
            if (!(obj instanceof oe7)) {
                if (!(obj instanceof jb3)) {
                    return ld9.U(obj);
                }
                throw ((jb3) obj).a;
            }
        } while (c0(obj) < 0);
        kn7 kn7 = new kn7(IntrinsicsKt.intercepted(continuation), this);
        kn7.u();
        cvg.z(kn7, new aw1(2, kv0.H(this, new gz2(kn7, 1))));
        Object t = kn7.t();
        if (t == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return t;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        r0 = defpackage.ld9.d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean z(java.lang.Object r10) {
        /*
            r9 = this;
            bpa r0 = defpackage.ld9.d
            boolean r1 = r9.K()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0040
        L_0x000a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = a
            java.lang.Object r0 = r0.get(r9)
            boolean r1 = r0 instanceof defpackage.oe7
            if (r1 == 0) goto L_0x0039
            boolean r1 = r0 instanceof defpackage.mn7
            if (r1 == 0) goto L_0x0027
            r1 = r0
            mn7 r1 = (defpackage.mn7) r1
            r1.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = defpackage.mn7.b
            int r1 = r4.get(r1)
            if (r1 == 0) goto L_0x0027
            goto L_0x0039
        L_0x0027:
            jb3 r1 = new jb3
            java.lang.Throwable r4 = r9.F(r10)
            r1.<init>(r4, r2)
            java.lang.Object r0 = r9.f0(r0, r1)
            bpa r1 = defpackage.ld9.f
            if (r0 == r1) goto L_0x000a
            goto L_0x003b
        L_0x0039:
            bpa r0 = defpackage.ld9.d
        L_0x003b:
            bpa r1 = defpackage.ld9.e
            if (r0 != r1) goto L_0x0040
            return r3
        L_0x0040:
            bpa r1 = defpackage.ld9.d
            if (r0 != r1) goto L_0x0105
            r0 = 0
            r1 = r0
        L_0x0046:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = a
            java.lang.Object r4 = r4.get(r9)
            boolean r5 = r4 instanceof defpackage.mn7
            if (r5 == 0) goto L_0x00a1
            monitor-enter(r4)
            r5 = r4
            mn7 r5 = (defpackage.mn7) r5     // Catch:{ all -> 0x007e }
            r5.getClass()     // Catch:{ all -> 0x007e }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = defpackage.mn7.o     // Catch:{ all -> 0x007e }
            java.lang.Object r5 = r6.get(r5)     // Catch:{ all -> 0x007e }
            bpa r6 = defpackage.ld9.h     // Catch:{ all -> 0x007e }
            if (r5 != r6) goto L_0x0063
            r5 = r3
            goto L_0x0064
        L_0x0063:
            r5 = r2
        L_0x0064:
            if (r5 == 0) goto L_0x006c
            bpa r10 = defpackage.ld9.g     // Catch:{ all -> 0x007e }
            monitor-exit(r4)
        L_0x0069:
            r0 = r10
            goto L_0x0105
        L_0x006c:
            r5 = r4
            mn7 r5 = (defpackage.mn7) r5     // Catch:{ all -> 0x007e }
            boolean r5 = r5.d()     // Catch:{ all -> 0x007e }
            if (r10 != 0) goto L_0x0077
            if (r5 != 0) goto L_0x0086
        L_0x0077:
            if (r1 != 0) goto L_0x0080
            java.lang.Throwable r1 = r9.F(r10)     // Catch:{ all -> 0x007e }
            goto L_0x0080
        L_0x007e:
            r9 = move-exception
            goto L_0x009f
        L_0x0080:
            r10 = r4
            mn7 r10 = (defpackage.mn7) r10     // Catch:{ all -> 0x007e }
            r10.a(r1)     // Catch:{ all -> 0x007e }
        L_0x0086:
            r10 = r4
            mn7 r10 = (defpackage.mn7) r10     // Catch:{ all -> 0x007e }
            java.lang.Throwable r10 = r10.c()     // Catch:{ all -> 0x007e }
            r1 = r5 ^ 1
            if (r1 == 0) goto L_0x0092
            r0 = r10
        L_0x0092:
            monitor-exit(r4)
            if (r0 == 0) goto L_0x009c
            mn7 r4 = (defpackage.mn7) r4
            x9a r10 = r4.a
            r9.X(r10, r0)
        L_0x009c:
            bpa r10 = defpackage.ld9.d
            goto L_0x0069
        L_0x009f:
            monitor-exit(r4)
            throw r9
        L_0x00a1:
            boolean r5 = r4 instanceof defpackage.oe7
            if (r5 == 0) goto L_0x0101
            if (r1 != 0) goto L_0x00ab
            java.lang.Throwable r1 = r9.F(r10)
        L_0x00ab:
            r5 = r4
            oe7 r5 = (defpackage.oe7) r5
            boolean r6 = r5.isActive()
            if (r6 == 0) goto L_0x00d6
            x9a r6 = r9.L(r5)
            if (r6 != 0) goto L_0x00bb
            goto L_0x0046
        L_0x00bb:
            mn7 r7 = new mn7
            r7.<init>(r6, r1)
        L_0x00c0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = a
            boolean r8 = r4.compareAndSet(r9, r5, r7)
            if (r8 == 0) goto L_0x00ce
            r9.X(r6, r1)
            bpa r10 = defpackage.ld9.d
            goto L_0x0069
        L_0x00ce:
            java.lang.Object r4 = r4.get(r9)
            if (r4 == r5) goto L_0x00c0
            goto L_0x0046
        L_0x00d6:
            jb3 r5 = new jb3
            r5.<init>(r1, r2)
            java.lang.Object r5 = r9.f0(r4, r5)
            bpa r6 = defpackage.ld9.d
            if (r5 == r6) goto L_0x00e9
            bpa r4 = defpackage.ld9.f
            if (r5 == r4) goto L_0x0046
            r0 = r5
            goto L_0x0105
        L_0x00e9:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Cannot happen in "
            r10.<init>(r0)
            r10.append(r4)
            java.lang.String r10 = r10.toString()
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0101:
            bpa r10 = defpackage.ld9.g
            goto L_0x0069
        L_0x0105:
            bpa r10 = defpackage.ld9.d
            if (r0 != r10) goto L_0x010b
        L_0x0109:
            r2 = r3
            goto L_0x0119
        L_0x010b:
            bpa r10 = defpackage.ld9.e
            if (r0 != r10) goto L_0x0110
            goto L_0x0109
        L_0x0110:
            bpa r10 = defpackage.ld9.g
            if (r0 != r10) goto L_0x0115
            goto L_0x0119
        L_0x0115:
            r9.w(r0)
            goto L_0x0109
        L_0x0119:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qn7.z(java.lang.Object):boolean");
    }
}
