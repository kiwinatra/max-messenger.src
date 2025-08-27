package defpackage;

/* renamed from: r7d  reason: default package */
public final /* synthetic */ class r7d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s7d b;

    public /* synthetic */ r7d(s7d s7d, int i) {
        this.a = i;
        this.b = s7d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            int r0 = r7.a
            switch(r0) {
                case 0: goto L_0x0032;
                default: goto L_0x0005;
            }
        L_0x0005:
            s7d r7 = r7.b
            int r0 = r7.c
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x000f
            r0 = r2
            goto L_0x0010
        L_0x000f:
            r0 = r1
        L_0x0010:
            java.util.concurrent.atomic.AtomicBoolean r3 = r7.q
            boolean r1 = r3.compareAndSet(r1, r2)
            if (r1 == 0) goto L_0x0031
            if (r0 == 0) goto L_0x0031
            r0 = 0
            boolean r1 = r7.n
            i6d r2 = r7.l
            if (r1 == 0) goto L_0x0028
            qn r1 = r2.c
            if (r1 != 0) goto L_0x0026
            goto L_0x002c
        L_0x0026:
            r0 = r1
            goto L_0x002c
        L_0x0028:
            java.util.concurrent.Executor r1 = r2.b
            if (r1 != 0) goto L_0x0026
        L_0x002c:
            r7d r7 = r7.t
            r0.execute(r7)
        L_0x0031:
            return
        L_0x0032:
            s7d r7 = r7.b
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.s
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L_0x004f
            i6d r0 = r7.l
            uj7 r0 = r0.e
            r0.getClass()
            sj7 r3 = new sj7
            k14 r4 = r7.p
            r3.<init>(r0, r4)
            r0.a(r3)
        L_0x004f:
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.r
            boolean r3 = r0.compareAndSet(r1, r2)
            java.util.concurrent.atomic.AtomicBoolean r4 = r7.q
            if (r3 == 0) goto L_0x0081
            r3 = 0
            r5 = r1
        L_0x005b:
            boolean r6 = r4.compareAndSet(r2, r1)     // Catch:{ all -> 0x0069 }
            if (r6 == 0) goto L_0x0074
            java.util.concurrent.Callable r3 = r7.o     // Catch:{ Exception -> 0x006b }
            java.lang.Object r3 = r3.call()     // Catch:{ Exception -> 0x006b }
            r5 = r2
            goto L_0x005b
        L_0x0069:
            r7 = move-exception
            goto L_0x007d
        L_0x006b:
            r7 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x0069 }
            java.lang.String r3 = "Exception while computing database live data."
            r2.<init>(r3, r7)     // Catch:{ all -> 0x0069 }
            throw r2     // Catch:{ all -> 0x0069 }
        L_0x0074:
            if (r5 == 0) goto L_0x0079
            r7.i(r3)     // Catch:{ all -> 0x0069 }
        L_0x0079:
            r0.set(r1)
            goto L_0x0082
        L_0x007d:
            r0.set(r1)
            throw r7
        L_0x0081:
            r5 = r1
        L_0x0082:
            if (r5 == 0) goto L_0x008a
            boolean r0 = r4.get()
            if (r0 != 0) goto L_0x004f
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r7d.run():void");
    }
}
