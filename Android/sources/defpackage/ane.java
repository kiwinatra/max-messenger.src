package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ane  reason: default package */
public final class ane implements Runnable {
    public static final Object y = new Object();
    public final Executor a;
    public final iha b;
    public final AtomicBoolean c = new AtomicBoolean(true);
    public final AtomicReference o;
    public Object v = y;
    public int w = -1;
    public boolean x = false;

    public ane(AtomicReference atomicReference, Executor executor, iha iha) {
        this.o = atomicReference;
        this.a = executor;
        this.b = iha;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.c     // Catch:{ all -> 0x000b }
            boolean r0 = r0.get()     // Catch:{ all -> 0x000b }
            if (r0 != 0) goto L_0x000d
            monitor-exit(r1)     // Catch:{ all -> 0x000b }
            return
        L_0x000b:
            r2 = move-exception
            goto L_0x002e
        L_0x000d:
            int r0 = r1.w     // Catch:{ all -> 0x000b }
            if (r2 > r0) goto L_0x0013
            monitor-exit(r1)     // Catch:{ all -> 0x000b }
            return
        L_0x0013:
            r1.w = r2     // Catch:{ all -> 0x000b }
            boolean r2 = r1.x     // Catch:{ all -> 0x000b }
            if (r2 == 0) goto L_0x001b
            monitor-exit(r1)     // Catch:{ all -> 0x000b }
            return
        L_0x001b:
            r2 = 1
            r1.x = r2     // Catch:{ all -> 0x000b }
            monitor-exit(r1)     // Catch:{ all -> 0x000b }
            java.util.concurrent.Executor r2 = r1.a     // Catch:{ all -> 0x0025 }
            r2.execute(r1)     // Catch:{ all -> 0x0025 }
            goto L_0x002a
        L_0x0025:
            monitor-enter(r1)
            r2 = 0
            r1.x = r2     // Catch:{ all -> 0x002b }
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
        L_0x002a:
            return
        L_0x002b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            throw r2
        L_0x002e:
            monitor-exit(r1)     // Catch:{ all -> 0x000b }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ane.a(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        if (java.util.Objects.equals(r4.v, r0) != false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        r4.v = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        if ((r0 instanceof defpackage.fc0) == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        r4.b.onError(((defpackage.fc0) r0).a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        r4.b.a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0039, code lost:
        if (r2 == r4.w) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0041, code lost:
        if (r4.c.get() != false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0044, code lost:
        r0 = r4.o.get();
        r2 = r4.w;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004c, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0050, code lost:
        r4.x = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0052, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0053, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0055, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.c     // Catch:{ all -> 0x000e }
            boolean r0 = r0.get()     // Catch:{ all -> 0x000e }
            r1 = 0
            if (r0 != 0) goto L_0x0010
            r4.x = r1     // Catch:{ all -> 0x000e }
            monitor-exit(r4)     // Catch:{ all -> 0x000e }
            return
        L_0x000e:
            r0 = move-exception
            goto L_0x0056
        L_0x0010:
            java.util.concurrent.atomic.AtomicReference r0 = r4.o     // Catch:{ all -> 0x000e }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x000e }
            int r2 = r4.w     // Catch:{ all -> 0x000e }
            monitor-exit(r4)     // Catch:{ all -> 0x000e }
        L_0x0019:
            java.lang.Object r3 = r4.v
            boolean r3 = java.util.Objects.equals(r3, r0)
            if (r3 != 0) goto L_0x0036
            r4.v = r0
            boolean r3 = r0 instanceof defpackage.fc0
            if (r3 == 0) goto L_0x0031
            iha r3 = r4.b
            fc0 r0 = (defpackage.fc0) r0
            java.lang.Throwable r0 = r0.a
            r3.onError(r0)
            goto L_0x0036
        L_0x0031:
            iha r3 = r4.b
            r3.a(r0)
        L_0x0036:
            monitor-enter(r4)
            int r0 = r4.w     // Catch:{ all -> 0x004e }
            if (r2 == r0) goto L_0x0050
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.c     // Catch:{ all -> 0x004e }
            boolean r0 = r0.get()     // Catch:{ all -> 0x004e }
            if (r0 != 0) goto L_0x0044
            goto L_0x0050
        L_0x0044:
            java.util.concurrent.atomic.AtomicReference r0 = r4.o     // Catch:{ all -> 0x004e }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x004e }
            int r2 = r4.w     // Catch:{ all -> 0x004e }
            monitor-exit(r4)     // Catch:{ all -> 0x004e }
            goto L_0x0019
        L_0x004e:
            r0 = move-exception
            goto L_0x0054
        L_0x0050:
            r4.x = r1     // Catch:{ all -> 0x004e }
            monitor-exit(r4)     // Catch:{ all -> 0x004e }
            return
        L_0x0054:
            monitor-exit(r4)     // Catch:{ all -> 0x004e }
            throw r0
        L_0x0056:
            monitor-exit(r4)     // Catch:{ all -> 0x000e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ane.run():void");
    }
}
