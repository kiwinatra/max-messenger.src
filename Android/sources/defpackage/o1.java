package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: o1  reason: default package */
public abstract class o1 implements zz7 {
    public static final boolean o = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger v;
    public static final kr7 w;
    public static final Object x = new Object();
    public volatile Object a;
    public volatile z0 b;
    public volatile m1 c;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: b1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: kr7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: b1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: b1} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.String r0 = "b"
            java.lang.String r1 = "a"
            java.lang.Class<m1> r2 = defpackage.m1.class
            java.lang.String r3 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r4 = "false"
            java.lang.String r3 = java.lang.System.getProperty(r3, r4)
            boolean r3 = java.lang.Boolean.parseBoolean(r3)
            o = r3
            java.lang.Class<o1> r3 = defpackage.o1.class
            java.lang.String r4 = r3.getName()
            java.util.logging.Logger r4 = java.util.logging.Logger.getLogger(r4)
            v = r4
            b1 r4 = new b1     // Catch:{ all -> 0x0044 }
            java.lang.Class<java.lang.Thread> r5 = java.lang.Thread.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r5, r1)     // Catch:{ all -> 0x0044 }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r2, r0)     // Catch:{ all -> 0x0044 }
            java.lang.String r5 = "c"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r2, r5)     // Catch:{ all -> 0x0044 }
            java.lang.Class<z0> r2 = defpackage.z0.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r2, r0)     // Catch:{ all -> 0x0044 }
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r10 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r0, r1)     // Catch:{ all -> 0x0044 }
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0044 }
            r0 = 0
            goto L_0x004b
        L_0x0044:
            r0 = move-exception
            f1 r4 = new f1
            r1 = 4
            r4.<init>(r1)
        L_0x004b:
            w = r4
            if (r0 == 0) goto L_0x0058
            java.util.logging.Logger r1 = v
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0058:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            x = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o1.<clinit>():void");
    }

    public static void b(o1 o1Var) {
        z0 z0Var;
        z0 z0Var2;
        z0 z0Var3 = null;
        while (true) {
            m1 m1Var = o1Var.c;
            if (w.l(o1Var, m1Var, m1.c)) {
                while (m1Var != null) {
                    Thread thread = m1Var.a;
                    if (thread != null) {
                        m1Var.a = null;
                        LockSupport.unpark(thread);
                    }
                    m1Var = m1Var.b;
                }
                do {
                    z0Var = o1Var.b;
                } while (!w.j(o1Var, z0Var, z0.d));
                while (true) {
                    z0Var2 = z0Var3;
                    z0Var3 = z0Var;
                    if (z0Var3 == null) {
                        break;
                    }
                    z0Var = z0Var3.c;
                    z0Var3.c = z0Var2;
                }
                while (z0Var2 != null) {
                    z0Var3 = z0Var2.c;
                    Runnable runnable = z0Var2.a;
                    if (runnable instanceof d1) {
                        d1 d1Var = (d1) runnable;
                        o1Var = d1Var.a;
                        if (o1Var.a == d1Var) {
                            if (w.k(o1Var, d1Var, f(d1Var.b))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        c(runnable, z0Var2.b);
                    }
                    z0Var2 = z0Var3;
                }
                return;
            }
        }
    }

    public static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Level level = Level.SEVERE;
            v.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
        }
    }

    public static Object e(Object obj) {
        if (obj instanceof u0) {
            Throwable th = ((u0) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof x0) {
            throw new ExecutionException(((x0) obj).a);
        } else if (obj == x) {
            return null;
        } else {
            return obj;
        }
    }

    public static Object f(zz7 zz7) {
        if (zz7 instanceof o1) {
            Object obj = ((o1) zz7).a;
            if (!(obj instanceof u0)) {
                return obj;
            }
            u0 u0Var = (u0) obj;
            return u0Var.a ? u0Var.b != null ? new u0(false, (CancellationException) u0Var.b) : u0.d : obj;
        }
        boolean isCancelled = zz7.isCancelled();
        if ((!o) && isCancelled) {
            return u0.d;
        }
        try {
            Object g = g(zz7);
            return g == null ? x : g;
        } catch (ExecutionException e) {
            return new x0(e.getCause());
        } catch (CancellationException e2) {
            if (isCancelled) {
                return new u0(false, e2);
            }
            return new x0(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + zz7, e2));
        } catch (Throwable th) {
            return new x0(th);
        }
    }

    public static Object g(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object g = g(this);
            sb.append("SUCCESS, result=[");
            sb.append(g == this ? "this future" : String.valueOf(g));
            sb.append("]");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    public final boolean cancel(boolean z) {
        Object obj = this.a;
        if (!(obj == null) && !(obj instanceof d1)) {
            return false;
        }
        u0 u0Var = o ? new u0(z, new CancellationException("Future.cancel() was called.")) : z ? u0.c : u0.d;
        boolean z2 = false;
        while (true) {
            if (w.k(this, obj, u0Var)) {
                b(this);
                if (!(obj instanceof d1)) {
                    return true;
                }
                zz7 zz7 = ((d1) obj).b;
                if (zz7 instanceof o1) {
                    this = (o1) zz7;
                    obj = this.a;
                    if (!(obj == null) && !(obj instanceof d1)) {
                        return true;
                    }
                    z2 = true;
                } else {
                    zz7.cancel(z);
                    return true;
                }
            } else {
                obj = this.a;
                if (!(obj instanceof d1)) {
                    return z2;
                }
            }
        }
    }

    public final void d(Runnable runnable, Executor executor) {
        executor.getClass();
        z0 z0Var = this.b;
        z0 z0Var2 = z0.d;
        if (z0Var != z0Var2) {
            z0 z0Var3 = new z0(runnable, executor);
            do {
                z0Var3.c = z0Var;
                if (!w.j(this, z0Var, z0Var3)) {
                    z0Var = this.b;
                } else {
                    return;
                }
            } while (z0Var != z0Var2);
        }
        c(runnable, executor);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0153  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(long r20, java.util.concurrent.TimeUnit r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r3 = r22
            long r4 = r3.toNanos(r1)
            boolean r6 = java.lang.Thread.interrupted()
            if (r6 != 0) goto L_0x015f
            java.lang.Object r6 = r0.a
            r8 = 1
            if (r6 == 0) goto L_0x0017
            r9 = r8
            goto L_0x0018
        L_0x0017:
            r9 = 0
        L_0x0018:
            boolean r10 = r6 instanceof defpackage.d1
            r10 = r10 ^ r8
            r9 = r9 & r10
            if (r9 == 0) goto L_0x0023
            java.lang.Object r0 = e(r6)
            return r0
        L_0x0023:
            r9 = 0
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x002f
            long r11 = java.lang.System.nanoTime()
            long r11 = r11 + r4
            goto L_0x0030
        L_0x002f:
            r11 = r9
        L_0x0030:
            r13 = 1000(0x3e8, double:4.94E-321)
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 < 0) goto L_0x008b
            m1 r6 = r0.c
            m1 r15 = defpackage.m1.c
            if (r6 == r15) goto L_0x0084
            m1 r7 = new m1
            r7.<init>()
        L_0x0041:
            kr7 r9 = w
            r9.I(r7, r6)
            boolean r6 = r9.l(r0, r6, r7)
            if (r6 == 0) goto L_0x0080
        L_0x004c:
            java.util.concurrent.locks.LockSupport.parkNanos(r0, r4)
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto L_0x0077
            java.lang.Object r4 = r0.a
            if (r4 == 0) goto L_0x005b
            r5 = r8
            goto L_0x005c
        L_0x005b:
            r5 = 0
        L_0x005c:
            boolean r6 = r4 instanceof defpackage.d1
            r6 = r6 ^ r8
            r5 = r5 & r6
            if (r5 == 0) goto L_0x0067
            java.lang.Object r0 = e(r4)
            return r0
        L_0x0067:
            long r4 = java.lang.System.nanoTime()
            long r4 = r11 - r4
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 >= 0) goto L_0x004c
            r0.i(r7)
        L_0x0074:
            r6 = 0
            goto L_0x008c
        L_0x0077:
            r0.i(r7)
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L_0x0080:
            m1 r6 = r0.c
            if (r6 != r15) goto L_0x0041
        L_0x0084:
            java.lang.Object r0 = r0.a
            java.lang.Object r0 = e(r0)
            return r0
        L_0x008b:
            r6 = r9
        L_0x008c:
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 <= 0) goto L_0x00b5
            java.lang.Object r4 = r0.a
            if (r4 == 0) goto L_0x0096
            r5 = r8
            goto L_0x0097
        L_0x0096:
            r5 = 0
        L_0x0097:
            boolean r6 = r4 instanceof defpackage.d1
            r6 = r6 ^ r8
            r5 = r5 & r6
            if (r5 == 0) goto L_0x00a2
            java.lang.Object r0 = e(r4)
            return r0
        L_0x00a2:
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto L_0x00af
            long r4 = java.lang.System.nanoTime()
            long r4 = r11 - r4
            goto L_0x0074
        L_0x00af:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L_0x00b5:
            java.lang.String r6 = r19.toString()
            java.lang.String r7 = r22.toString()
            java.util.Locale r9 = java.util.Locale.ROOT
            java.lang.String r7 = r7.toLowerCase(r9)
            java.lang.String r10 = "Waited "
            java.lang.String r11 = " "
            java.lang.StringBuilder r1 = defpackage.tr1.n(r1, r10, r11)
            java.lang.String r2 = r22.toString()
            java.lang.String r2 = r2.toLowerCase(r9)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            long r9 = r4 + r13
            r17 = 0
            int r2 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r2 >= 0) goto L_0x0141
            java.lang.String r2 = " (plus "
            java.lang.String r1 = defpackage.tr1.j(r1, r2)
            long r4 = -r4
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r9 = r3.convert(r4, r2)
            long r2 = r3.toNanos(r9)
            long r4 = r4 - r2
            int r2 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r2 == 0) goto L_0x0100
            int r3 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r3 <= 0) goto L_0x00fd
            goto L_0x0100
        L_0x00fd:
            r16 = 0
            goto L_0x0102
        L_0x0100:
            r16 = r8
        L_0x0102:
            if (r2 <= 0) goto L_0x0125
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r9)
            r2.append(r11)
            r2.append(r7)
            java.lang.String r1 = r2.toString()
            if (r16 == 0) goto L_0x0121
            java.lang.String r2 = ","
            java.lang.String r1 = defpackage.tr1.j(r1, r2)
        L_0x0121:
            java.lang.String r1 = defpackage.tr1.j(r1, r11)
        L_0x0125:
            if (r16 == 0) goto L_0x013b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r4)
            java.lang.String r1 = " nanoseconds "
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L_0x013b:
            java.lang.String r2 = "delay)"
            java.lang.String r1 = defpackage.tr1.j(r1, r2)
        L_0x0141:
            boolean r0 = r19.isDone()
            if (r0 == 0) goto L_0x0153
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            java.lang.String r2 = " but future completed as timeout expired"
            java.lang.String r1 = defpackage.tr1.j(r1, r2)
            r0.<init>(r1)
            throw r0
        L_0x0153:
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            java.lang.String r2 = " for "
            java.lang.String r1 = defpackage.g63.i(r1, r2, r6)
            r0.<init>(r1)
            throw r0
        L_0x015f:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o1.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public final String h() {
        Object obj = this.a;
        if (obj instanceof d1) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            zz7 zz7 = ((d1) obj).b;
            return wj6.n(sb, zz7 == this ? "this future" : String.valueOf(zz7), "]");
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    public final void i(m1 m1Var) {
        m1Var.a = null;
        while (true) {
            m1 m1Var2 = this.c;
            if (m1Var2 != m1.c) {
                m1 m1Var3 = null;
                while (m1Var2 != null) {
                    m1 m1Var4 = m1Var2.b;
                    if (m1Var2.a != null) {
                        m1Var3 = m1Var2;
                    } else if (m1Var3 != null) {
                        m1Var3.b = m1Var4;
                        if (m1Var3.a == null) {
                        }
                    } else if (!w.l(this, m1Var2, m1Var4)) {
                    }
                    m1Var2 = m1Var4;
                }
                return;
            }
            return;
        }
    }

    public final boolean isCancelled() {
        return this.a instanceof u0;
    }

    public final boolean isDone() {
        Object obj = this.a;
        return (!(obj instanceof d1)) & (obj != null);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.a instanceof u0) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                str = h();
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) && (!(obj2 instanceof d1))) {
                return e(obj2);
            }
            m1 m1Var = this.c;
            m1 m1Var2 = m1.c;
            if (m1Var != m1Var2) {
                m1 m1Var3 = new m1();
                do {
                    kr7 kr7 = w;
                    kr7.I(m1Var3, m1Var);
                    if (kr7.l(this, m1Var, m1Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                i(m1Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof d1))));
                        return e(obj);
                    }
                    m1Var = this.c;
                } while (m1Var != m1Var2);
            }
            return e(this.a);
        }
        throw new InterruptedException();
    }
}
