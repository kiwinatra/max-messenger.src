package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: htc  reason: default package */
public final class htc implements Runnable {
    public volatile AtomicInteger a = new AtomicInteger(0);
    public final yn1 b;
    public final /* synthetic */ jtc c;

    public htc(jtc jtc, yn1 yn1) {
        this.c = jtc;
        this.b = yn1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x005b A[Catch:{ all -> 0x0077, all -> 0x0047 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007c A[Catch:{ all -> 0x0077, all -> 0x0047 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009a A[Catch:{ all -> 0x0077, all -> 0x0047 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            java.lang.String r0 = "Callback failure for "
            java.lang.String r1 = "canceled due to "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "OkHttp "
            r2.<init>(r3)
            jtc r3 = r8.c
            y2d r3 = r3.z0
            m57 r3 = r3.b
            java.lang.String r3 = r3.g()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r4 = r3.getName()
            r3.setName(r2)
            jtc r2 = r8.c     // Catch:{ all -> 0x0047 }
            g47 r2 = r2.c     // Catch:{ all -> 0x0047 }
            r2.i()     // Catch:{ all -> 0x0047 }
            r2 = 0
            jtc r5 = r8.c     // Catch:{ IOException -> 0x0052, all -> 0x0050 }
            k4d r2 = r5.j()     // Catch:{ IOException -> 0x0052, all -> 0x0050 }
            r5 = 1
            yn1 r6 = r8.b     // Catch:{ IOException -> 0x004d, all -> 0x004a }
            jtc r7 = r8.c     // Catch:{ IOException -> 0x004d, all -> 0x004a }
            r6.h(r7, r2)     // Catch:{ IOException -> 0x004d, all -> 0x004a }
            jtc r0 = r8.c     // Catch:{ all -> 0x0047 }
            rla r0 = r0.y0     // Catch:{ all -> 0x0047 }
            srd r0 = r0.a     // Catch:{ all -> 0x0047 }
        L_0x0043:
            r0.x(r8)     // Catch:{ all -> 0x0047 }
            goto L_0x00a8
        L_0x0047:
            r8 = move-exception
            goto L_0x00b6
        L_0x004a:
            r0 = move-exception
            r2 = r5
            goto L_0x0054
        L_0x004d:
            r1 = move-exception
            r2 = r5
            goto L_0x007a
        L_0x0050:
            r0 = move-exception
            goto L_0x0054
        L_0x0052:
            r1 = move-exception
            goto L_0x007a
        L_0x0054:
            jtc r5 = r8.c     // Catch:{ all -> 0x0077 }
            r5.e()     // Catch:{ all -> 0x0077 }
            if (r2 != 0) goto L_0x0079
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x0077 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0077 }
            r5.<init>(r1)     // Catch:{ all -> 0x0077 }
            r5.append(r0)     // Catch:{ all -> 0x0077 }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x0077 }
            r2.<init>(r1)     // Catch:{ all -> 0x0077 }
            kotlin.ExceptionsKt.addSuppressed(r2, r0)     // Catch:{ all -> 0x0077 }
            yn1 r1 = r8.b     // Catch:{ all -> 0x0077 }
            jtc r5 = r8.c     // Catch:{ all -> 0x0077 }
            r1.o(r5, r2)     // Catch:{ all -> 0x0077 }
            goto L_0x0079
        L_0x0077:
            r0 = move-exception
            goto L_0x00ac
        L_0x0079:
            throw r0     // Catch:{ all -> 0x0077 }
        L_0x007a:
            if (r2 == 0) goto L_0x009a
            wnb r2 = defpackage.wnb.a     // Catch:{ all -> 0x0077 }
            wnb r2 = defpackage.wnb.a     // Catch:{ all -> 0x0077 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0077 }
            r5.<init>(r0)     // Catch:{ all -> 0x0077 }
            jtc r0 = r8.c     // Catch:{ all -> 0x0077 }
            java.lang.String r0 = defpackage.jtc.a(r0)     // Catch:{ all -> 0x0077 }
            r5.append(r0)     // Catch:{ all -> 0x0077 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0077 }
            r2.getClass()     // Catch:{ all -> 0x0077 }
            r2 = 4
            defpackage.wnb.i(r2, r0, r1)     // Catch:{ all -> 0x0077 }
            goto L_0x00a1
        L_0x009a:
            yn1 r0 = r8.b     // Catch:{ all -> 0x0077 }
            jtc r2 = r8.c     // Catch:{ all -> 0x0077 }
            r0.o(r2, r1)     // Catch:{ all -> 0x0077 }
        L_0x00a1:
            jtc r0 = r8.c     // Catch:{ all -> 0x0047 }
            rla r0 = r0.y0     // Catch:{ all -> 0x0047 }
            srd r0 = r0.a     // Catch:{ all -> 0x0047 }
            goto L_0x0043
        L_0x00a8:
            r3.setName(r4)
            return
        L_0x00ac:
            jtc r1 = r8.c     // Catch:{ all -> 0x0047 }
            rla r1 = r1.y0     // Catch:{ all -> 0x0047 }
            srd r1 = r1.a     // Catch:{ all -> 0x0047 }
            r1.x(r8)     // Catch:{ all -> 0x0047 }
            throw r0     // Catch:{ all -> 0x0047 }
        L_0x00b6:
            r3.setName(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.htc.run():void");
    }
}
