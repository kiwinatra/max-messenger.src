package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: oed  reason: default package */
public final class oed extends AtomicReferenceArray implements Runnable, Callable, mq4 {
    public static final Object b = new Object();
    public static final Object c = new Object();
    public static final Object o = new Object();
    public static final Object v = new Object();
    public final Runnable a;

    public oed(Runnable runnable, nq4 nq4) {
        super(3);
        this.a = runnable;
        lazySet(0, nq4);
    }

    public final void a(Future future) {
        Object obj;
        do {
            obj = get(1);
            if (obj != v) {
                if (obj == c) {
                    future.cancel(false);
                    return;
                } else if (obj == o) {
                    future.cancel(true);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    public final Object call() {
        run();
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dispose() {
        /*
            r8 = this;
        L_0x0000:
            r0 = 1
            java.lang.Object r1 = r8.get(r0)
            java.lang.Object r2 = v
            r3 = 0
            if (r1 == r2) goto L_0x0031
            java.lang.Object r4 = c
            if (r1 == r4) goto L_0x0031
            java.lang.Object r5 = o
            if (r1 != r5) goto L_0x0013
            goto L_0x0031
        L_0x0013:
            r6 = 2
            java.lang.Object r6 = r8.get(r6)
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            if (r6 == r7) goto L_0x0020
            r6 = r0
            goto L_0x0021
        L_0x0020:
            r6 = r3
        L_0x0021:
            if (r6 == 0) goto L_0x0024
            r4 = r5
        L_0x0024:
            boolean r0 = r8.compareAndSet(r0, r1, r4)
            if (r0 == 0) goto L_0x0000
            if (r1 == 0) goto L_0x0031
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1
            r1.cancel(r6)
        L_0x0031:
            java.lang.Object r0 = r8.get(r3)
            if (r0 == r2) goto L_0x0049
            java.lang.Object r1 = b
            if (r0 == r1) goto L_0x0049
            if (r0 != 0) goto L_0x003e
            goto L_0x0049
        L_0x003e:
            boolean r1 = r8.compareAndSet(r3, r0, r1)
            if (r1 == 0) goto L_0x0031
            nq4 r0 = (defpackage.nq4) r0
            r0.c(r8)
        L_0x0049:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oed.dispose():void");
    }

    public final boolean f() {
        Object obj = get(0);
        return obj == b || obj == v;
    }

    public final void run() {
        Object obj;
        Object obj2;
        Object obj3 = o;
        Object obj4 = c;
        Object obj5 = b;
        Object obj6 = v;
        lazySet(2, Thread.currentThread());
        try {
            this.a.run();
            Object obj7 = get(0);
            if (!(obj7 == obj5 || !compareAndSet(0, obj7, obj6) || obj7 == null)) {
                ((nq4) obj7).c(this);
            }
            do {
                obj2 = get(1);
                if (obj2 == obj4 || obj2 == obj3 || compareAndSet(1, obj2, obj6)) {
                    lazySet(2, (Object) null);
                }
                obj2 = get(1);
                break;
            } while (compareAndSet(1, obj2, obj6));
            lazySet(2, (Object) null);
        } catch (Throwable th) {
            Object obj8 = get(0);
            if (!(obj8 == obj5 || !compareAndSet(0, obj8, obj6) || obj8 == null)) {
                ((nq4) obj8).c(this);
            }
            do {
                obj = get(1);
                if (obj == obj4 || obj == obj3 || compareAndSet(1, obj, obj6)) {
                    lazySet(2, (Object) null);
                }
                obj = get(1);
                break;
            } while (compareAndSet(1, obj, obj6));
            lazySet(2, (Object) null);
            throw th;
        }
    }

    public final String toString() {
        String str;
        Object obj = get(1);
        if (obj == v) {
            str = "Finished";
        } else if (obj == c) {
            str = "Disposed(Sync)";
        } else if (obj == o) {
            str = "Disposed(Async)";
        } else {
            Object obj2 = get(2);
            if (obj2 == null) {
                str = "Waiting";
            } else {
                str = "Running on " + obj2;
            }
        }
        return oed.class.getSimpleName() + "[" + str + "]";
    }
}
