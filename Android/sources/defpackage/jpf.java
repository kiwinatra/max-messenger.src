package defpackage;

import java.lang.Thread;

/* renamed from: jpf  reason: default package */
public final class jpf implements Thread.UncaughtExceptionHandler {
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
        if (defpackage.vzg.a(r12, "system." + "CRASH_REPORT" + ".shutdown.until.ts") != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void uncaughtException(java.lang.Thread r12, java.lang.Throwable r13) {
        /*
            r11 = this;
            boolean r11 = defpackage.kof.b
            if (r11 == 0) goto L_0x0006
            goto L_0x00bf
        L_0x0006:
            c24 r11 = defpackage.pof.b     // Catch:{ IllegalStateException -> 0x00bf }
            if (r11 == 0) goto L_0x00b3
            boolean r12 = defpackage.kof.b
            if (r12 == 0) goto L_0x0010
            goto L_0x00bf
        L_0x0010:
            kxd r12 = r11.b
            r12.getClass()
            r0 = 0
            r1 = 6
            r2 = 2
            r3 = 0
            defpackage.kxd.d(r12, r2, r3, r0, r1)
            abe r12 = defpackage.pf6.o
            if (r12 == 0) goto L_0x00ab
            java.lang.String r0 = "system.shutdown.until.ts"
            boolean r0 = defpackage.vzg.a(r12, r0)
            r1 = 1
            if (r0 == 0) goto L_0x002b
        L_0x0029:
            r3 = r1
            goto L_0x0047
        L_0x002b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "system."
            r0.<init>(r2)
            java.lang.String r2 = "CRASH_REPORT"
            r0.append(r2)
            java.lang.String r2 = ".shutdown.until.ts"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            boolean r12 = defpackage.vzg.a(r12, r0)
            if (r12 == 0) goto L_0x0047
            goto L_0x0029
        L_0x0047:
            if (r3 == 0) goto L_0x004b
            goto L_0x00bf
        L_0x004b:
            f24 r4 = r11.a
            kxd r12 = r11.b
            g8f r7 = r12.c()
            c9f r12 = r11.c
            java.util.ArrayList r0 = r12.e
            monitor-enter(r0)
            java.util.ArrayList r12 = r12.e     // Catch:{ all -> 0x00a8 }
            java.util.List r8 = kotlin.collections.CollectionsKt.toList(r12)     // Catch:{ all -> 0x00a8 }
            monitor-exit(r0)
            java.util.Map r9 = java.lang.Thread.getAllStackTraces()
            b88 r12 = r11.d
            java.util.concurrent.ConcurrentLinkedQueue r12 = r12.h
            java.util.List r10 = kotlin.collections.CollectionsKt.toList(r12)
            r5 = 1
            r6 = r13
            a24 r12 = r4.b(r5, r6, r7, r8, r9, r10)
            if (r12 == 0) goto L_0x00bf
            java.util.concurrent.CountDownLatch r13 = new java.util.concurrent.CountDownLatch
            r13.<init>(r1)
            ktg r0 = new ktg
            r1 = 19
            r0.<init>(r11, r12, r13, r1)
            defpackage.ipf.b(r0)
            android.os.Looper r12 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r12, (java.lang.Object) r0)
            if (r12 == 0) goto L_0x0093
            r0 = 5000(0x1388, double:2.4703E-320)
            goto L_0x0096
        L_0x0093:
            r0 = 100000000(0x5f5e100, double:4.94065646E-316)
        L_0x0096:
            lxd r11 = r11.e
            r11.getClass()
            android.os.ConditionVariable r11 = r11.a     // Catch:{ Exception -> 0x00a2 }
            if (r11 == 0) goto L_0x00a2
            r11.block(r0)     // Catch:{ Exception -> 0x00a2 }
        L_0x00a2:
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS
            r13.await(r0, r11)
            goto L_0x00bf
        L_0x00a8:
            r11 = move-exception
            monitor-exit(r0)
            throw r11
        L_0x00ab:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Tracer settings are not initialized."
            r11.<init>(r12)
            throw r11
        L_0x00b3:
            java.lang.String r11 = "Required value was null."
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x00bf }
            java.lang.String r11 = r11.toString()     // Catch:{ IllegalStateException -> 0x00bf }
            r12.<init>(r11)     // Catch:{ IllegalStateException -> 0x00bf }
            throw r12     // Catch:{ IllegalStateException -> 0x00bf }
        L_0x00bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jpf.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
