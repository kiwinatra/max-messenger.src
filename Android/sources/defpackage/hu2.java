package defpackage;

import one.me.chats.search.ChatsListSearchScreen;

/* renamed from: hu2  reason: default package */
public final /* synthetic */ class hu2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ hu2(rvb rvb, wog wog) {
        this.a = 2;
        this.c = rvb;
        this.o = wog;
        this.b = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r1 = r0.x;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r2 = (defpackage.t5g) ((java.util.ArrayDeque) r0.y).poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0057, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0058, code lost:
        if (r2 != null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r6.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0060, code lost:
        r2.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            r0 = 1
            int r1 = r6.a
            switch(r1) {
                case 0: goto L_0x011e;
                case 1: goto L_0x00e1;
                case 2: goto L_0x00d3;
                case 3: goto L_0x007b;
                case 4: goto L_0x006d;
                case 5: goto L_0x002f;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r0 = r6.c
            gtg r0 = (defpackage.gtg) r0
            q9d r0 = r0.a
            java.util.concurrent.atomic.AtomicReference r1 = r0.b
            java.lang.Object r1 = r1.get()
            u64 r1 = (defpackage.u64) r1
            java.util.concurrent.atomic.AtomicBoolean r2 = r0.j
            boolean r2 = r2.get()
            if (r2 != 0) goto L_0x002e
            java.lang.Object r2 = r6.o
            u64 r2 = (defpackage.u64) r2
            if (r1 == r2) goto L_0x0023
            goto L_0x002e
        L_0x0023:
            boolean r6 = r6.b
            if (r6 == 0) goto L_0x002b
            r0.b()
            goto L_0x002e
        L_0x002b:
            r0.a()
        L_0x002e:
            return
        L_0x002f:
            java.lang.Object r0 = r6.c
            gy0 r0 = (defpackage.gy0) r0
            boolean r1 = r6.b
            java.lang.Object r6 = r6.o
            t5g r6 = (defpackage.t5g) r6
            r0.getClass()
            java.lang.Object r2 = r0.x     // Catch:{ Exception -> 0x005e }
            monitor-enter(r2)     // Catch:{ Exception -> 0x005e }
            boolean r3 = r0.w     // Catch:{ all -> 0x0047 }
            if (r3 == 0) goto L_0x0049
            if (r1 != 0) goto L_0x0049
            monitor-exit(r2)     // Catch:{ all -> 0x0047 }
            goto L_0x006c
        L_0x0047:
            r6 = move-exception
            goto L_0x0067
        L_0x0049:
            monitor-exit(r2)     // Catch:{ all -> 0x0047 }
        L_0x004a:
            java.lang.Object r1 = r0.x     // Catch:{ Exception -> 0x005e }
            monitor-enter(r1)     // Catch:{ Exception -> 0x005e }
            java.lang.Object r2 = r0.y     // Catch:{ all -> 0x0064 }
            java.util.ArrayDeque r2 = (java.util.ArrayDeque) r2     // Catch:{ all -> 0x0064 }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x0064 }
            t5g r2 = (defpackage.t5g) r2     // Catch:{ all -> 0x0064 }
            monitor-exit(r1)     // Catch:{ all -> 0x0064 }
            if (r2 != 0) goto L_0x0060
            r6.run()     // Catch:{ Exception -> 0x005e }
            goto L_0x006c
        L_0x005e:
            r6 = move-exception
            goto L_0x0069
        L_0x0060:
            r2.run()     // Catch:{ Exception -> 0x005e }
            goto L_0x004a
        L_0x0064:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0064 }
            throw r6     // Catch:{ Exception -> 0x005e }
        L_0x0067:
            monitor-exit(r2)     // Catch:{ all -> 0x0047 }
            throw r6     // Catch:{ Exception -> 0x005e }
        L_0x0069:
            r0.f(r6)
        L_0x006c:
            return
        L_0x006d:
            java.lang.Object r0 = r6.c
            bof r0 = (defpackage.bof) r0
            java.lang.Object r1 = r6.o
            do1 r1 = (defpackage.do1) r1
            boolean r6 = r6.b
            r0.a(r1, r6)
            return
        L_0x007b:
            java.lang.Object r1 = r6.c
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r2 = r6.o
            qdf r2 = (defpackage.qdf) r2
            r3 = 0
            int r4 = android.os.Binder.getCallingUid()     // Catch:{ all -> 0x009c }
            android.content.pm.ApplicationInfo r5 = r1.getApplicationInfo()     // Catch:{ all -> 0x009c }
            int r5 = r5.uid     // Catch:{ all -> 0x009c }
            if (r4 != r5) goto L_0x0092
            r4 = r0
            goto L_0x0093
        L_0x0092:
            r4 = 0
        L_0x0093:
            if (r4 != 0) goto L_0x009e
            r1.getPackageName()     // Catch:{ all -> 0x009c }
        L_0x0098:
            r2.d(r3)
            goto L_0x00ce
        L_0x009c:
            r6 = move-exception
            goto L_0x00cf
        L_0x009e:
            android.content.SharedPreferences r4 = defpackage.te8.l(r1)     // Catch:{ all -> 0x009c }
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch:{ all -> 0x009c }
            java.lang.String r5 = "proxy_notification_initialized"
            r4.putBoolean(r5, r0)     // Catch:{ all -> 0x009c }
            r4.apply()     // Catch:{ all -> 0x009c }
            java.lang.Class<android.app.NotificationManager> r0 = android.app.NotificationManager.class
            java.lang.Object r0 = r1.getSystemService(r0)     // Catch:{ all -> 0x009c }
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0     // Catch:{ all -> 0x009c }
            boolean r6 = r6.b
            java.lang.String r1 = "com.google.android.gms"
            if (r6 == 0) goto L_0x00c0
            r0.setNotificationDelegate(r1)     // Catch:{ all -> 0x009c }
            goto L_0x0098
        L_0x00c0:
            java.lang.String r6 = r0.getNotificationDelegate()     // Catch:{ all -> 0x009c }
            boolean r6 = r1.equals(r6)     // Catch:{ all -> 0x009c }
            if (r6 == 0) goto L_0x0098
            r0.setNotificationDelegate(r3)     // Catch:{ all -> 0x009c }
            goto L_0x0098
        L_0x00ce:
            return
        L_0x00cf:
            r2.d(r3)
            throw r6
        L_0x00d3:
            java.lang.Object r0 = r6.c
            rvb r0 = (defpackage.rvb) r0
            java.lang.Object r1 = r6.o
            wog r1 = (defpackage.wog) r1
            boolean r6 = r6.b
            r0.b(r1, r6)
            return
        L_0x00e1:
            java.lang.Object r0 = r6.c
            wx5 r0 = (defpackage.wx5) r0
            boolean r1 = r6.b
            java.lang.Object r6 = r6.o
            do1 r6 = (defpackage.do1) r6
            lr1 r2 = r0.a
            vx5 r3 = r0.w
            jr1 r2 = r2.b
            java.lang.Object r2 = r2.b
            java.util.HashSet r2 = (java.util.HashSet) r2
            r2.remove(r3)
            r0.v = r1
            boolean r1 = r0.d
            if (r1 != 0) goto L_0x010b
            if (r6 == 0) goto L_0x011d
            androidx.camera.core.CameraControl$OperationCanceledException r0 = new androidx.camera.core.CameraControl$OperationCanceledException
            java.lang.String r1 = "Camera is not active."
            r0.<init>(r1)
            r6.d(r0)
            goto L_0x011d
        L_0x010b:
            lr1 r1 = r0.a
            long r1 = r1.A()
            vx5 r3 = new vx5
            r3.<init>(r0, r1, r6)
            r0.w = r3
            lr1 r6 = r0.a
            r6.p(r3)
        L_0x011d:
            return
        L_0x011e:
            boolean r1 = r6.b
            java.lang.Object r2 = r6.c
            one.me.chats.search.ChatsListSearchScreen r2 = (one.me.chats.search.ChatsListSearchScreen) r2
            if (r1 == 0) goto L_0x012b
            kotlin.reflect.KProperty[] r1 = one.me.chats.search.ChatsListSearchScreen.F0
            r2.g0()
        L_0x012b:
            t56 r1 = r2.z0
            kotlin.Lazy r3 = r2.w
            java.lang.Object r3 = r3.getValue()
            wh0 r3 = (defpackage.wh0) r3
            etc r3 = r3.y
            ome r3 = r3.a
            java.lang.Object r3 = r3.getValue()
            java.util.List r3 = (java.util.List) r3
            r1.G(r3)
            java.lang.Object r6 = r6.o
            z77 r6 = (defpackage.z77) r6
            java.util.List r1 = r6.b
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x0158
            yuc r0 = defpackage.yuc.a
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            goto L_0x015c
        L_0x0158:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
        L_0x015c:
            t56 r1 = r2.X
            r1.G(r0)
            c73 r0 = r2.Y
            java.util.List r1 = r6.b
            r0.G(r1)
            t56 r0 = r2.Z
            java.util.List r6 = r6.c
            r0.G(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hu2.run():void");
    }

    public /* synthetic */ hu2(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.o = obj2;
        this.b = z;
    }

    public /* synthetic */ hu2(Object obj, boolean z, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
        this.o = obj2;
    }

    public /* synthetic */ hu2(boolean z, ChatsListSearchScreen chatsListSearchScreen, z77 z77) {
        this.a = 0;
        this.b = z;
        this.c = chatsListSearchScreen;
        this.o = z77;
    }
}
