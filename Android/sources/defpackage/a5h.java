package defpackage;

/* renamed from: a5h  reason: default package */
public final /* synthetic */ class a5h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m6h b;

    public /* synthetic */ a5h(m6h m6h, int i) {
        this.a = i;
        this.b = m6h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0066, code lost:
        if (android.util.Log.isLoggable("MessengerIpcClient", 3) == false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0068, code lost:
        "Sending ".concat(java.lang.String.valueOf(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0071, code lost:
        r3 = r0.w;
        r4 = r0.b;
        r5 = r1.c;
        r6 = android.os.Message.obtain();
        r6.what = r5;
        r6.arg1 = r1.a;
        r6.replyTo = r4;
        r4 = new android.os.Bundle();
        r4.putBoolean("oneWay", r1.b());
        r4.putString("pkg", ((android.content.Context) r3.b).getPackageName());
        r4.putBundle("data", r1.d);
        r6.setData(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r1 = r0.c;
        r3 = (android.os.Messenger) r1.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ae, code lost:
        if (r3 == null) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b0, code lost:
        r3.send(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b5, code lost:
        r1 = (defpackage.k0h) r1.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b9, code lost:
        if (r1 == null) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bb, code lost:
        r1 = r1.a;
        r1.getClass();
        r1.send(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00cc, code lost:
        throw new java.lang.IllegalStateException("Both messengers are null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00cd, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ce, code lost:
        r0.a(2, r1.getMessage());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            int r0 = r8.a
            switch(r0) {
                case 0: goto L_0x0022;
                case 1: goto L_0x000e;
                default: goto L_0x0005;
            }
        L_0x0005:
            m6h r8 = r8.b
            r0 = 2
            java.lang.String r1 = "Service disconnected"
            r8.a(r0, r1)
            return
        L_0x000e:
            m6h r0 = r8.b
            monitor-enter(r0)
            int r8 = r0.a     // Catch:{ all -> 0x001d }
            r1 = 1
            if (r8 != r1) goto L_0x001b
            java.lang.String r8 = "Timed out while binding"
            r0.a(r1, r8)     // Catch:{ all -> 0x001d }
        L_0x001b:
            monitor-exit(r0)
            goto L_0x001f
        L_0x001d:
            r8 = move-exception
            goto L_0x0020
        L_0x001f:
            return
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            throw r8
        L_0x0022:
            m6h r0 = r8.b
            monitor-enter(r0)
            int r1 = r0.a     // Catch:{ all -> 0x002c }
            r2 = 2
            if (r1 == r2) goto L_0x002f
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            goto L_0x003b
        L_0x002c:
            r8 = move-exception
            goto L_0x00d7
        L_0x002f:
            java.util.ArrayDeque r1 = r0.o     // Catch:{ all -> 0x002c }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x003c
            r0.c()     // Catch:{ all -> 0x002c }
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
        L_0x003b:
            return
        L_0x003c:
            java.util.ArrayDeque r1 = r0.o     // Catch:{ all -> 0x002c }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x002c }
            w6h r1 = (defpackage.w6h) r1     // Catch:{ all -> 0x002c }
            android.util.SparseArray r3 = r0.v     // Catch:{ all -> 0x002c }
            int r4 = r1.a     // Catch:{ all -> 0x002c }
            r3.put(r4, r1)     // Catch:{ all -> 0x002c }
            m7h r3 = r0.w     // Catch:{ all -> 0x002c }
            java.lang.Object r3 = r3.o     // Catch:{ all -> 0x002c }
            java.util.concurrent.ScheduledExecutorService r3 = (java.util.concurrent.ScheduledExecutorService) r3     // Catch:{ all -> 0x002c }
            r1h r4 = new r1h     // Catch:{ all -> 0x002c }
            r5 = 3
            r4.<init>((int) r5, (java.lang.Object) r0, (java.lang.Object) r1)     // Catch:{ all -> 0x002c }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x002c }
            r6 = 30
            r3.schedule(r4, r6, r5)     // Catch:{ all -> 0x002c }
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            java.lang.String r3 = "MessengerIpcClient"
            r4 = 3
            boolean r3 = android.util.Log.isLoggable(r3, r4)
            if (r3 == 0) goto L_0x0071
            java.lang.String r3 = java.lang.String.valueOf(r1)
            java.lang.String r4 = "Sending "
            r4.concat(r3)
        L_0x0071:
            m7h r3 = r0.w
            android.os.Messenger r4 = r0.b
            int r5 = r1.c
            java.lang.Object r3 = r3.b
            android.content.Context r3 = (android.content.Context) r3
            android.os.Message r6 = android.os.Message.obtain()
            r6.what = r5
            int r5 = r1.a
            r6.arg1 = r5
            r6.replyTo = r4
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            boolean r5 = r1.b()
            java.lang.String r7 = "oneWay"
            r4.putBoolean(r7, r5)
            java.lang.String r3 = r3.getPackageName()
            java.lang.String r5 = "pkg"
            r4.putString(r5, r3)
            android.os.Bundle r1 = r1.d
            java.lang.String r3 = "data"
            r4.putBundle(r3, r1)
            r6.setData(r4)
            n6h r1 = r0.c     // Catch:{ RemoteException -> 0x00cd }
            java.lang.Object r3 = r1.a     // Catch:{ RemoteException -> 0x00cd }
            android.os.Messenger r3 = (android.os.Messenger) r3     // Catch:{ RemoteException -> 0x00cd }
            if (r3 == 0) goto L_0x00b5
            r3.send(r6)     // Catch:{ RemoteException -> 0x00cd }
            goto L_0x0022
        L_0x00b5:
            java.lang.Object r1 = r1.b     // Catch:{ RemoteException -> 0x00cd }
            k0h r1 = (defpackage.k0h) r1     // Catch:{ RemoteException -> 0x00cd }
            if (r1 == 0) goto L_0x00c5
            android.os.Messenger r1 = r1.a     // Catch:{ RemoteException -> 0x00cd }
            r1.getClass()     // Catch:{ RemoteException -> 0x00cd }
            r1.send(r6)     // Catch:{ RemoteException -> 0x00cd }
            goto L_0x0022
        L_0x00c5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ RemoteException -> 0x00cd }
            java.lang.String r3 = "Both messengers are null"
            r1.<init>(r3)     // Catch:{ RemoteException -> 0x00cd }
            throw r1     // Catch:{ RemoteException -> 0x00cd }
        L_0x00cd:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            r0.a(r2, r1)
            goto L_0x0022
        L_0x00d7:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a5h.run():void");
    }
}
