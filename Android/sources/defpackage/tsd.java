package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: tsd  reason: default package */
public final class tsd implements Executor {
    public final ArrayDeque a = new ArrayDeque();
    public final Executor b;
    public final tj7 c = new tj7(26, this);
    public int o = 1;
    public long v = 0;

    public tsd(Executor executor) {
        executor.getClass();
        this.b = executor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r7.b.execute(r7.c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r7.o == 2) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        r0 = r7.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0033, code lost:
        if (r7.v != r3) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
        if (r7.o != 2) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
        r7.o = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0041, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0042, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0045, code lost:
        monitor-enter(r7.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r3 = r7.o;
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0049, code lost:
        if (r3 == 1) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0056, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0059, code lost:
        if ((r0 instanceof java.util.concurrent.RejectedExecutionException) == false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x005e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x005f, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0061, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0063, code lost:
        throw r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void execute(java.lang.Runnable r8) {
        /*
            r7 = this;
            r8.getClass()
            java.util.ArrayDeque r0 = r7.a
            monitor-enter(r0)
            int r1 = r7.o     // Catch:{ all -> 0x0064 }
            r2 = 4
            if (r1 == r2) goto L_0x0066
            r2 = 3
            if (r1 != r2) goto L_0x000f
            goto L_0x0066
        L_0x000f:
            long r3 = r7.v     // Catch:{ all -> 0x0064 }
            zbd r1 = new zbd     // Catch:{ all -> 0x0064 }
            r5 = 2
            r1.<init>(r8, r5)     // Catch:{ all -> 0x0064 }
            java.util.ArrayDeque r8 = r7.a     // Catch:{ all -> 0x0064 }
            r8.add(r1)     // Catch:{ all -> 0x0064 }
            r8 = 2
            r7.o = r8     // Catch:{ all -> 0x0064 }
            monitor-exit(r0)     // Catch:{ all -> 0x0064 }
            java.util.concurrent.Executor r0 = r7.b     // Catch:{ Error | RuntimeException -> 0x0042 }
            tj7 r5 = r7.c     // Catch:{ Error | RuntimeException -> 0x0042 }
            r0.execute(r5)     // Catch:{ Error | RuntimeException -> 0x0042 }
            int r0 = r7.o
            if (r0 == r8) goto L_0x002c
            return
        L_0x002c:
            java.util.ArrayDeque r0 = r7.a
            monitor-enter(r0)
            long r5 = r7.v     // Catch:{ all -> 0x003c }
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x003e
            int r1 = r7.o     // Catch:{ all -> 0x003c }
            if (r1 != r8) goto L_0x003e
            r7.o = r2     // Catch:{ all -> 0x003c }
            goto L_0x003e
        L_0x003c:
            r7 = move-exception
            goto L_0x0040
        L_0x003e:
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            return
        L_0x0040:
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            throw r7
        L_0x0042:
            r0 = move-exception
            java.util.ArrayDeque r2 = r7.a
            monitor-enter(r2)
            int r3 = r7.o     // Catch:{ all -> 0x005f }
            r4 = 1
            if (r3 == r4) goto L_0x004d
            if (r3 != r8) goto L_0x0056
        L_0x004d:
            java.util.ArrayDeque r7 = r7.a     // Catch:{ all -> 0x005f }
            boolean r7 = r7.removeLastOccurrence(r1)     // Catch:{ all -> 0x005f }
            if (r7 == 0) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r4 = 0
        L_0x0057:
            boolean r7 = r0 instanceof java.util.concurrent.RejectedExecutionException     // Catch:{ all -> 0x005f }
            if (r7 == 0) goto L_0x0061
            if (r4 != 0) goto L_0x0061
            monitor-exit(r2)     // Catch:{ all -> 0x005f }
            return
        L_0x005f:
            r7 = move-exception
            goto L_0x0062
        L_0x0061:
            throw r0     // Catch:{ all -> 0x005f }
        L_0x0062:
            monitor-exit(r2)     // Catch:{ all -> 0x005f }
            throw r7
        L_0x0064:
            r7 = move-exception
            goto L_0x006d
        L_0x0066:
            java.util.ArrayDeque r7 = r7.a     // Catch:{ all -> 0x0064 }
            r7.add(r8)     // Catch:{ all -> 0x0064 }
            monitor-exit(r0)     // Catch:{ all -> 0x0064 }
            return
        L_0x006d:
            monitor-exit(r0)     // Catch:{ all -> 0x0064 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tsd.execute(java.lang.Runnable):void");
    }
}
