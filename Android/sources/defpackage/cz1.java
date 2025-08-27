package defpackage;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: cz1  reason: default package */
public final class cz1 extends oj6 implements Runnable {
    public vu c;
    public final LinkedBlockingQueue o = new LinkedBlockingQueue(1);
    public final CountDownLatch v = new CountDownLatch(1);
    public zz7 w;
    public volatile zz7 x;

    public cz1(vu vuVar, zz7 zz7) {
        this.c = vuVar;
        zz7.getClass();
        this.w = zz7;
    }

    public static Object b(LinkedBlockingQueue linkedBlockingQueue) {
        Object take;
        boolean z = false;
        while (true) {
            try {
                take = linkedBlockingQueue.take();
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
        return take;
    }

    public final boolean cancel(boolean z) {
        boolean z2 = false;
        if (!this.a.cancel(z)) {
            return false;
        }
        while (true) {
            try {
                this.o.put(Boolean.valueOf(z));
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        zz7 zz7 = this.w;
        if (zz7 != null) {
            zz7.cancel(z);
        }
        zz7 zz72 = this.x;
        if (zz72 != null) {
            zz72.cancel(z);
        }
        return true;
    }

    public final Object get() {
        if (!this.a.isDone()) {
            zz7 zz7 = this.w;
            if (zz7 != null) {
                zz7.get();
            }
            this.v.await();
            zz7 zz72 = this.x;
            if (zz72 != null) {
                zz72.get();
            }
        }
        return this.a.get();
    }

    public final void run() {
        try {
            try {
                zz7 apply = this.c.apply(hd8.A(this.w));
                this.x = apply;
                if (this.a.isCancelled()) {
                    apply.cancel(((Boolean) b(this.o)).booleanValue());
                    this.x = null;
                    this.c = null;
                    this.w = null;
                    this.v.countDown();
                    return;
                }
                apply.d(new uj6((Object) this, (Object) apply, false, 3), ryg.j());
                this.c = null;
                this.w = null;
                this.v.countDown();
            } catch (UndeclaredThrowableException e) {
                Throwable cause = e.getCause();
                do1 do1 = this.b;
                if (do1 != null) {
                    do1.d(cause);
                }
            } catch (Exception e2) {
                do1 do12 = this.b;
                if (do12 != null) {
                    do12.d(e2);
                }
            } catch (Error e3) {
                do1 do13 = this.b;
                if (do13 != null) {
                    do13.d(e3);
                }
            } catch (Throwable th) {
                this.c = null;
                this.w = null;
                this.v.countDown();
                throw th;
            }
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e4) {
            Throwable cause2 = e4.getCause();
            do1 do14 = this.b;
            if (do14 != null) {
                do14.d(cause2);
            }
        }
    }

    public final Object get(long j, TimeUnit timeUnit) {
        if (!this.a.isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j = timeUnit2.convert(j, timeUnit);
                timeUnit = timeUnit2;
            }
            zz7 zz7 = this.w;
            if (zz7 != null) {
                long nanoTime = System.nanoTime();
                zz7.get(j, timeUnit);
                j -= Math.max(0, System.nanoTime() - nanoTime);
            }
            long nanoTime2 = System.nanoTime();
            if (this.v.await(j, timeUnit)) {
                j -= Math.max(0, System.nanoTime() - nanoTime2);
                zz7 zz72 = this.x;
                if (zz72 != null) {
                    zz72.get(j, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return this.a.get(j, timeUnit);
    }
}
