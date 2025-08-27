package defpackage;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ca5  reason: default package */
public final class ca5 extends jfd implements Runnable {
    public final boolean a;
    public final boolean b;
    public final Executor c;
    public final ata o;
    public volatile boolean v;
    public final AtomicInteger w = new AtomicInteger();
    public final kc3 x = new Object();

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, kc3] */
    public ca5(Executor executor, boolean z, boolean z2) {
        this.c = executor;
        this.o = new ata(18);
        this.a = z;
        this.b = z2;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [ev9, java.lang.Object, java.util.concurrent.atomic.AtomicReference] */
    public final mq4 a(Runnable runnable) {
        mq4 mq4;
        boolean z = this.v;
        p45 p45 = p45.a;
        if (z) {
            return p45;
        }
        Objects.requireNonNull(runnable, "run is null");
        if (this.a) {
            mq4 = new ba5(runnable, this.x);
            this.x.a(mq4);
        } else {
            mq4 = new aa5(runnable);
        }
        ata ata = this.o;
        ata.getClass();
        ? atomicReference = new AtomicReference();
        atomicReference.a = mq4;
        ((ev9) ((AtomicReference) ata.b).getAndSet(atomicReference)).lazySet(atomicReference);
        if (this.w.getAndIncrement() == 0) {
            try {
                this.c.execute(this);
            } catch (RejectedExecutionException e) {
                this.v = true;
                this.o.clear();
                n54.D(e);
                return p45;
            }
        }
        return mq4;
    }

    public final mq4 b(Runnable runnable, long j, TimeUnit timeUnit) {
        if (j <= 0) {
            return a(runnable);
        }
        boolean z = this.v;
        p45 p45 = p45.a;
        if (z) {
            return p45;
        }
        mw1 mw1 = new mw1(2);
        mw1 mw12 = new mw1(mw1);
        Objects.requireNonNull(runnable, "run is null");
        oed oed = new oed(new ij3(1, this, mw12, runnable, false), this.x);
        this.x.a(oed);
        Executor executor = this.c;
        if (executor instanceof ScheduledExecutorService) {
            try {
                oed.a(((ScheduledExecutorService) executor).schedule(oed, j, timeUnit));
            } catch (RejectedExecutionException e) {
                this.v = true;
                n54.D(e);
                return p45;
            }
        } else {
            oed.a(new sq4(da5.a.d(oed, j, timeUnit)));
        }
        qq4.c(mw1, oed);
        return mw12;
    }

    public final void dispose() {
        if (!this.v) {
            this.v = true;
            this.x.dispose();
            if (this.w.getAndIncrement() == 0) {
                this.o.clear();
            }
        }
    }

    public final boolean f() {
        return this.v;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
        if (r3.v == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0044, code lost:
        r0.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        r1 = r3.w.addAndGet(-r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004f, code lost:
        if (r1 != 0) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r3 = this;
            boolean r0 = r3.b
            if (r0 == 0) goto L_0x002d
            ata r0 = r3.o
            boolean r1 = r3.v
            if (r1 == 0) goto L_0x000e
            r0.clear()
            goto L_0x005c
        L_0x000e:
            java.lang.Object r1 = r0.poll()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r1.run()
            boolean r1 = r3.v
            if (r1 == 0) goto L_0x001f
            r0.clear()
            goto L_0x005c
        L_0x001f:
            java.util.concurrent.atomic.AtomicInteger r0 = r3.w
            int r0 = r0.decrementAndGet()
            if (r0 == 0) goto L_0x005c
            java.util.concurrent.Executor r0 = r3.c
            r0.execute(r3)
            goto L_0x005c
        L_0x002d:
            ata r0 = r3.o
            r1 = 1
        L_0x0030:
            boolean r2 = r3.v
            if (r2 == 0) goto L_0x0038
            r0.clear()
            goto L_0x005c
        L_0x0038:
            java.lang.Object r2 = r0.poll()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 != 0) goto L_0x0052
            boolean r2 = r3.v
            if (r2 == 0) goto L_0x0048
            r0.clear()
            goto L_0x005c
        L_0x0048:
            java.util.concurrent.atomic.AtomicInteger r2 = r3.w
            int r1 = -r1
            int r1 = r2.addAndGet(r1)
            if (r1 != 0) goto L_0x0030
            goto L_0x005c
        L_0x0052:
            r2.run()
            boolean r2 = r3.v
            if (r2 == 0) goto L_0x0038
            r0.clear()
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ca5.run():void");
    }
}
