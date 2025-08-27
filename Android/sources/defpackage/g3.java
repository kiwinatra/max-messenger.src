package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: g3  reason: default package */
public abstract class g3 implements zz7 {
    public static final boolean o = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger v;
    public static final hd8 w;
    public static final Object x = new Object();
    public volatile Object a;
    public volatile c3 b;
    public volatile f3 c;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: d3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: d3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: d3} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.String r0 = "b"
            java.lang.String r1 = "a"
            java.lang.Class<f3> r2 = defpackage.f3.class
            java.lang.String r3 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r4 = "false"
            java.lang.String r3 = java.lang.System.getProperty(r3, r4)
            boolean r3 = java.lang.Boolean.parseBoolean(r3)
            o = r3
            java.lang.Class<g3> r3 = defpackage.g3.class
            java.lang.String r4 = r3.getName()
            java.util.logging.Logger r4 = java.util.logging.Logger.getLogger(r4)
            v = r4
            d3 r4 = new d3     // Catch:{ all -> 0x0044 }
            java.lang.Class<java.lang.Thread> r5 = java.lang.Thread.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r5, r1)     // Catch:{ all -> 0x0044 }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r2, r0)     // Catch:{ all -> 0x0044 }
            java.lang.String r5 = "c"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r2, r5)     // Catch:{ all -> 0x0044 }
            java.lang.Class<c3> r2 = defpackage.c3.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r2, r0)     // Catch:{ all -> 0x0044 }
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r10 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r0, r1)     // Catch:{ all -> 0x0044 }
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0044 }
            r0 = 0
            goto L_0x004a
        L_0x0044:
            r0 = move-exception
            e3 r4 = new e3
            r4.<init>()
        L_0x004a:
            w = r4
            if (r0 == 0) goto L_0x0057
            java.util.logging.Logger r1 = v
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0057:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            x = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g3.<clinit>():void");
    }

    public static void c(g3 g3Var) {
        f3 f3Var;
        c3 c3Var;
        c3 c3Var2;
        c3 c3Var3;
        do {
            f3Var = g3Var.c;
        } while (!w.i(g3Var, f3Var, f3.c));
        while (true) {
            c3Var = null;
            if (f3Var == null) {
                break;
            }
            Thread thread = f3Var.a;
            if (thread != null) {
                f3Var.a = null;
                LockSupport.unpark(thread);
            }
            f3Var = f3Var.b;
        }
        g3Var.b();
        do {
            c3Var2 = g3Var.b;
        } while (!w.g(g3Var, c3Var2, c3.d));
        while (true) {
            c3Var3 = c3Var;
            c3Var = c3Var2;
            if (c3Var == null) {
                break;
            }
            c3Var2 = c3Var.c;
            c3Var.c = c3Var3;
        }
        while (c3Var3 != null) {
            c3 c3Var4 = c3Var3.c;
            e(c3Var3.a, c3Var3.b);
            c3Var3 = c3Var4;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Level level = Level.SEVERE;
            v.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
        }
    }

    public static Object f(Object obj) {
        if (obj instanceof a3) {
            Throwable th = ((a3) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof b3) {
            throw new ExecutionException(((b3) obj).a);
        } else if (obj == x) {
            return null;
        } else {
            return obj;
        }
    }

    public final void a(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[");
                sb.append(e.getCause());
                sb.append("]");
                return;
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
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
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    public void b() {
    }

    public final boolean cancel(boolean z) {
        Object obj = this.a;
        if (obj != null) {
            return false;
        }
        if (!w.h(this, obj, o ? new a3(z, new CancellationException("Future.cancel() was called.")) : z ? a3.c : a3.d)) {
            return false;
        }
        c(this);
        return true;
    }

    public final void d(Runnable runnable, Executor executor) {
        executor.getClass();
        c3 c3Var = this.b;
        c3 c3Var2 = c3.d;
        if (c3Var != c3Var2) {
            c3 c3Var3 = new c3(runnable, executor);
            do {
                c3Var3.c = c3Var;
                if (!w.g(this, c3Var, c3Var3)) {
                    c3Var = this.b;
                } else {
                    return;
                }
            } while (c3Var != c3Var2);
        }
        e(runnable, executor);
    }

    public String g() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.a;
            if (obj != null) {
                return f(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                f3 f3Var = this.c;
                f3 f3Var2 = f3.c;
                if (f3Var != f3Var2) {
                    f3 f3Var3 = new f3();
                    do {
                        hd8 hd8 = w;
                        hd8.P(f3Var3, f3Var);
                        if (hd8.i(this, f3Var, f3Var3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.a;
                                    if (obj2 != null) {
                                        return f(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    h(f3Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            h(f3Var3);
                        } else {
                            f3Var = this.c;
                        }
                    } while (f3Var != f3Var2);
                }
                return f(this.a);
            }
            while (nanos > 0) {
                Object obj3 = this.a;
                if (obj3 != null) {
                    return f(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String g3Var = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            StringBuilder n = tr1.n(j, "Waited ", " ");
            n.append(timeUnit.toString().toLowerCase(locale));
            String sb = n.toString();
            if (nanos + 1000 < 0) {
                String j2 = tr1.j(sb, " (plus ");
                long j3 = -nanos;
                long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit.toNanos(convert);
                int i = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                boolean z = i == 0 || nanos2 > 1000;
                if (i > 0) {
                    String str = j2 + convert + " " + lowerCase;
                    if (z) {
                        str = tr1.j(str, ",");
                    }
                    j2 = tr1.j(str, " ");
                }
                if (z) {
                    j2 = j2 + nanos2 + " nanoseconds ";
                }
                sb = tr1.j(j2, "delay)");
            }
            if (isDone()) {
                throw new TimeoutException(tr1.j(sb, " but future completed as timeout expired"));
            }
            throw new TimeoutException(g63.i(sb, " for ", g3Var));
        }
        throw new InterruptedException();
    }

    public final void h(f3 f3Var) {
        f3Var.a = null;
        while (true) {
            f3 f3Var2 = this.c;
            if (f3Var2 != f3.c) {
                f3 f3Var3 = null;
                while (f3Var2 != null) {
                    f3 f3Var4 = f3Var2.b;
                    if (f3Var2.a != null) {
                        f3Var3 = f3Var2;
                    } else if (f3Var3 != null) {
                        f3Var3.b = f3Var4;
                        if (f3Var3.a == null) {
                        }
                    } else if (!w.i(this, f3Var2, f3Var4)) {
                    }
                    f3Var2 = f3Var4;
                }
                return;
            }
            return;
        }
    }

    public boolean i(Object obj) {
        if (obj == null) {
            obj = x;
        }
        if (!w.h(this, (Object) null, obj)) {
            return false;
        }
        c(this);
        return true;
    }

    public final boolean isCancelled() {
        return this.a instanceof a3;
    }

    public final boolean isDone() {
        return this.a != null;
    }

    public boolean j(Throwable th) {
        th.getClass();
        if (!w.h(this, (Object) null, new b3(th))) {
            return false;
        }
        c(this);
        return true;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.a instanceof a3) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                str = g();
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
            if (obj2 != null) {
                return f(obj2);
            }
            f3 f3Var = this.c;
            f3 f3Var2 = f3.c;
            if (f3Var != f3Var2) {
                f3 f3Var3 = new f3();
                do {
                    hd8 hd8 = w;
                    hd8.P(f3Var3, f3Var);
                    if (hd8.i(this, f3Var, f3Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                h(f3Var3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return f(obj);
                    }
                    f3Var = this.c;
                } while (f3Var != f3Var2);
            }
            return f(this.a);
        }
        throw new InterruptedException();
    }
}
