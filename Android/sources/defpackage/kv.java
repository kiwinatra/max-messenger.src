package defpackage;

import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: kv  reason: default package */
public final class kv extends Thread {
    public static final kv c;
    public ArrayBlockingQueue a;
    public xqb b;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Thread, kv] */
    static {
        ? thread = new Thread();
        thread.a = new ArrayBlockingQueue(10);
        thread.b = new xqb(10);
        c = thread;
        thread.start();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|9|7) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:0:0x0000 */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:7:0x0000, LOOP_START, MTH_ENTER_BLOCK, SYNTHETIC, Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
        L_0x0000:
            java.util.concurrent.ArrayBlockingQueue r0 = r5.a     // Catch:{ InterruptedException -> 0x0000 }
            java.lang.Object r0 = r0.take()     // Catch:{ InterruptedException -> 0x0000 }
            jv r0 = (defpackage.jv) r0     // Catch:{ InterruptedException -> 0x0000 }
            r1 = 0
            o5h r2 = r0.a     // Catch:{ RuntimeException -> 0x0019 }
            java.lang.Object r2 = r2.a     // Catch:{ RuntimeException -> 0x0019 }
            iv r2 = (defpackage.iv) r2     // Catch:{ RuntimeException -> 0x0019 }
            int r3 = r0.c     // Catch:{ RuntimeException -> 0x0019 }
            android.view.ViewGroup r4 = r0.b     // Catch:{ RuntimeException -> 0x0019 }
            android.view.View r2 = r2.inflate(r3, r4, r1)     // Catch:{ RuntimeException -> 0x0019 }
            r0.d = r2     // Catch:{ RuntimeException -> 0x0019 }
        L_0x0019:
            o5h r2 = r0.a
            java.lang.Object r2 = r2.b
            android.os.Handler r2 = (android.os.Handler) r2
            android.os.Message r0 = android.os.Message.obtain(r2, r1, r0)
            r0.sendToTarget()
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kv.run():void");
    }
}
