package defpackage;

/* renamed from: yx  reason: default package */
public final class yx extends Thread {
    public final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yx(Runnable runnable, String str, int i) {
        super(runnable, str);
        this.a = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x002e, code lost:
        if (r0 == null) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0030, code lost:
        r0.l();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0015 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 0: goto L_0x0019;
                case 3: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.run()
            return
        L_0x0009:
            r0 = 19
            android.os.Process.setThreadPriority(r0)
            monitor-enter(r2)
        L_0x000f:
            r2.wait()     // Catch:{ InterruptedException -> 0x0015 }
            goto L_0x000f
        L_0x0013:
            r0 = move-exception
            goto L_0x0017
        L_0x0015:
            monitor-exit(r2)     // Catch:{ all -> 0x0013 }
            return
        L_0x0017:
            monitor-exit(r2)     // Catch:{ all -> 0x0013 }
            throw r0
        L_0x0019:
            java.lang.Class<cy> r2 = defpackage.cy.class
            monitor-enter(r2)     // Catch:{ InterruptedException -> 0x0019 }
            cy r0 = defpackage.cy.j     // Catch:{ all -> 0x0034 }
            cy r0 = defpackage.tf6.d()     // Catch:{ all -> 0x0034 }
            cy r1 = defpackage.cy.j     // Catch:{ all -> 0x0034 }
            if (r0 != r1) goto L_0x002b
            r0 = 0
            defpackage.cy.j = r0     // Catch:{ all -> 0x0034 }
            monitor-exit(r2)     // Catch:{ InterruptedException -> 0x0019 }
            return
        L_0x002b:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0034 }
            monitor-exit(r2)     // Catch:{ InterruptedException -> 0x0019 }
            if (r0 == 0) goto L_0x0019
            r0.l()     // Catch:{ InterruptedException -> 0x0019 }
            goto L_0x0019
        L_0x0034:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ InterruptedException -> 0x0019 }
            throw r0     // Catch:{ InterruptedException -> 0x0019 }
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yx.run():void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yx(String str) {
        super(str);
        this.a = 0;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yx(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
        this.a = 3;
    }
}
