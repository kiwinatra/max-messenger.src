package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: fq0  reason: default package */
public final class fq0 {
    public static final fq0 d = new fq0();
    public final ExecutorService a;
    public final ScheduledExecutorService b;
    public final ky6 c;

    /* JADX WARNING: type inference failed for: r1v8, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public fq0() {
        /*
            r9 = this;
            r0 = 1
            r9.<init>()
            java.lang.String r1 = "java.runtime.name"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            if (r1 != 0) goto L_0x000e
            r1 = 0
            goto L_0x001a
        L_0x000e:
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r2)
            java.lang.String r2 = "android"
            boolean r1 = r1.contains(r2)
        L_0x001a:
            if (r1 != 0) goto L_0x0021
            java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.newCachedThreadPool()
            goto L_0x0039
        L_0x0021:
            zd r1 = defpackage.zd.b
            java.util.concurrent.ThreadPoolExecutor r1 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r8 = new java.util.concurrent.LinkedBlockingQueue
            r8.<init>()
            int r3 = defpackage.zd.c
            int r4 = defpackage.zd.d
            r5 = 1
            r2 = r1
            r2.<init>(r3, r4, r5, r7, r8)
            r1.allowCoreThreadTimeOut(r0)
        L_0x0039:
            r9.a = r1
            java.util.concurrent.ScheduledExecutorService r1 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor()
            r9.b = r1
            ky6 r1 = new ky6
            r1.<init>((int) r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r1.b = r0
            r9.c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fq0.<init>():void");
    }
}
