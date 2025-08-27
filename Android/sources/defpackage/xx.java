package defpackage;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.uuid.Uuid;

/* renamed from: xx  reason: default package */
public final class xx implements Runnable {
    public static final ThreadPoolExecutor y;
    public static ws9 z;
    public final ni a;
    public final us9 b;
    public volatile int c = 1;
    public final AtomicBoolean o = new AtomicBoolean();
    public final AtomicBoolean v = new AtomicBoolean();
    public final CountDownLatch w;
    public final /* synthetic */ j0h x;

    static {
        j40 j40 = new j40(4);
        y = new ThreadPoolExecutor(5, Uuid.SIZE_BITS, 1, TimeUnit.SECONDS, new LinkedBlockingQueue(10), j40);
    }

    public xx(j0h j0h) {
        this.x = j0h;
        ni niVar = new ni(this);
        this.a = niVar;
        this.b = new us9(this, niVar);
        this.w = new CountDownLatch(1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r5 = this;
            j0h r0 = r5.x     // Catch:{ OperationCanceledException -> 0x0030 }
            java.util.Set r1 = r0.k     // Catch:{ OperationCanceledException -> 0x0030 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ OperationCanceledException -> 0x0030 }
            boolean r2 = r1.hasNext()     // Catch:{ OperationCanceledException -> 0x0030 }
            if (r2 != 0) goto L_0x0021
            java.util.concurrent.Semaphore r0 = r0.j     // Catch:{ InterruptedException -> 0x0019 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0019 }
            r2 = 0
            r3 = 5
            r0.tryAcquire(r2, r3, r1)     // Catch:{ InterruptedException -> 0x0019 }
            goto L_0x0039
        L_0x0019:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ OperationCanceledException -> 0x0030 }
            r0.interrupt()     // Catch:{ OperationCanceledException -> 0x0030 }
            goto L_0x0039
        L_0x0021:
            java.lang.Object r0 = r1.next()     // Catch:{ OperationCanceledException -> 0x0030 }
            mvg r0 = (defpackage.mvg) r0     // Catch:{ OperationCanceledException -> 0x0030 }
            r0.getClass()     // Catch:{ OperationCanceledException -> 0x0030 }
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ OperationCanceledException -> 0x0030 }
            r0.<init>()     // Catch:{ OperationCanceledException -> 0x0030 }
            throw r0     // Catch:{ OperationCanceledException -> 0x0030 }
        L_0x0030:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r5 = r5.o
            boolean r5 = r5.get()
            if (r5 == 0) goto L_0x003a
        L_0x0039:
            return
        L_0x003a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xx.a():void");
    }

    public final void b(Object obj) {
        ws9 ws9;
        synchronized (xx.class) {
            try {
                if (z == null) {
                    z = new ws9(Looper.getMainLooper(), 0, false);
                }
                ws9 = z;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        ws9.obtainMessage(1, new vs9(this, obj)).sendToTarget();
    }

    public final void run() {
        this.x.b();
    }
}
