package defpackage;

/* renamed from: c70  reason: default package */
public final /* synthetic */ class c70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c70(int i, Object obj) {
        this.a = i;
        this.c = obj;
        this.b = false;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void run() {
        /*
            r12 = this;
            r0 = 23
            r1 = 2
            r2 = 3
            r3 = 4
            r4 = 1
            r5 = 0
            r6 = 0
            int r7 = r12.a
            switch(r7) {
                case 0: goto L_0x0387;
                case 1: goto L_0x0364;
                case 2: goto L_0x0350;
                case 3: goto L_0x033c;
                case 4: goto L_0x0332;
                case 5: goto L_0x0284;
                case 6: goto L_0x0237;
                case 7: goto L_0x0225;
                case 8: goto L_0x0217;
                case 9: goto L_0x013d;
                case 10: goto L_0x0133;
                case 11: goto L_0x00ed;
                case 12: goto L_0x00dc;
                case 13: goto L_0x00ad;
                case 14: goto L_0x008c;
                default: goto L_0x000d;
            }
        L_0x000d:
            java.lang.Object r0 = r12.c
            p1e r0 = (defpackage.p1e) r0
            java.lang.Object r0 = r0.a
            hz0 r0 = (defpackage.hz0) r0
            boolean r1 = r0.i()     // Catch:{ all -> 0x003c }
            mz9 r2 = r0.w1
            if (r1 != 0) goto L_0x001f
            goto L_0x008b
        L_0x001f:
            mc1 r1 = r0.J1     // Catch:{ all -> 0x003c }
            r1.getClass()     // Catch:{ all -> 0x003c }
            boolean r1 = r2.b     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x0030
            r2.b = r6     // Catch:{ all -> 0x003c }
            r2.c = r6     // Catch:{ all -> 0x003c }
            r2.a()     // Catch:{ all -> 0x003c }
            goto L_0x0031
        L_0x0030:
            r4 = r6
        L_0x0031:
            if (r4 == 0) goto L_0x003e
            r0.x()     // Catch:{ all -> 0x003c }
            b51 r1 = defpackage.b51.v     // Catch:{ all -> 0x003c }
            r0.k(r1, r5)     // Catch:{ all -> 0x003c }
            goto L_0x003e
        L_0x003c:
            r1 = move-exception
            goto L_0x0075
        L_0x003e:
            gm1 r1 = r0.r1     // Catch:{ all -> 0x003c }
            if (r1 != 0) goto L_0x0043
            goto L_0x008b
        L_0x0043:
            boolean r2 = r2.b     // Catch:{ all -> 0x003c }
            if (r2 == 0) goto L_0x004e
            boolean r2 = r0.b2     // Catch:{ all -> 0x003c }
            if (r2 != 0) goto L_0x004e
            kbb r2 = r0.j2     // Catch:{ all -> 0x003c }
            goto L_0x0050
        L_0x004e:
            kbb r2 = r0.k2     // Catch:{ all -> 0x003c }
        L_0x0050:
            if (r2 != 0) goto L_0x0053
            goto L_0x008b
        L_0x0053:
            boolean r1 = r1.I()     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x0065
            gm1 r1 = r0.r1     // Catch:{ all -> 0x003c }
            r1.z0 = r2     // Catch:{ all -> 0x003c }
            jj8 r1 = r1.v0     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x008b
            r1.e(r2)     // Catch:{ all -> 0x003c }
            goto L_0x008b
        L_0x0065:
            gm1 r1 = r0.r1     // Catch:{ all -> 0x003c }
            r1.z0 = r2     // Catch:{ all -> 0x003c }
            jj8 r3 = r1.v0     // Catch:{ all -> 0x003c }
            if (r3 == 0) goto L_0x0071
            r3.e(r2)     // Catch:{ all -> 0x003c }
            goto L_0x008b
        L_0x0071:
            r1.T(r2)     // Catch:{ all -> 0x003c }
            goto L_0x008b
        L_0x0075:
            voc r0 = r0.T0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Error apply screen capture stopped state (fast="
            r2.<init>(r3)
            boolean r12 = r12.b
            java.lang.String r3 = ")"
            java.lang.String r12 = defpackage.tr1.m(r2, r12, r3)
            java.lang.String r2 = "OKRTCCall"
            r0.logException(r2, r12, r1)
        L_0x008b:
            return
        L_0x008c:
            java.lang.Object r0 = r12.c
            n09 r0 = (defpackage.n09) r0
            java.lang.Object r1 = r0.y
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1
            java.lang.Object r1 = r1.get()
            u64 r1 = (defpackage.u64) r1
            if (r1 == 0) goto L_0x00ac
            java.lang.Object r0 = r0.z
            msg r0 = (defpackage.msg) r0
            r1.c(r0)
            boolean r12 = r12.b
            if (r12 == 0) goto L_0x00ac
            org.webrtc.DataChannel r12 = r1.a
            r12.close()
        L_0x00ac:
            return
        L_0x00ad:
            java.lang.Object r0 = r12.c
            q9d r0 = (defpackage.q9d) r0
            java.util.concurrent.atomic.AtomicReference r1 = r0.b
            java.lang.Object r1 = r1.get()
            u64 r1 = (defpackage.u64) r1
            if (r1 == 0) goto L_0x00db
            gtg r2 = r0.c
            if (r2 == 0) goto L_0x00d3
            java.util.concurrent.CopyOnWriteArrayList r3 = r1.c
            r3.remove(r2)
            msg r0 = r0.d
            r1.c(r0)
            boolean r12 = r12.b
            if (r12 == 0) goto L_0x00db
            org.webrtc.DataChannel r12 = r1.a
            r12.close()
            goto L_0x00db
        L_0x00d3:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Illegal 'listener' value: null"
            r12.<init>(r0)
            throw r12
        L_0x00db:
            return
        L_0x00dc:
            java.lang.Object r0 = r12.c
            mlb r0 = (defpackage.mlb) r0
            android.widget.TextView r0 = r0.I0
            boolean r12 = r12.b
            if (r12 == 0) goto L_0x00e7
            goto L_0x00e9
        L_0x00e7:
            r6 = 8
        L_0x00e9:
            r0.setVisibility(r6)
            return
        L_0x00ed:
            java.lang.Object r0 = r12.c
            gya r0 = (defpackage.gya) r0
            boolean r12 = r12.b
            java.util.concurrent.ScheduledFuture r1 = r0.y     // Catch:{ Exception -> 0x0114 }
            if (r1 != 0) goto L_0x00f8
            goto L_0x00f9
        L_0x00f8:
            r5 = r1
        L_0x00f9:
            boolean r1 = r5.isCancelled()     // Catch:{ Exception -> 0x0114 }
            if (r1 != 0) goto L_0x0116
            java.util.concurrent.Callable r1 = r0.a     // Catch:{ Exception -> 0x0114 }
            java.lang.Object r1 = r1.call()     // Catch:{ Exception -> 0x0114 }
            r0.w = r1     // Catch:{ Exception -> 0x0114 }
            if (r12 != 0) goto L_0x0132
            java.util.concurrent.atomic.AtomicBoolean r12 = r0.o     // Catch:{ Exception -> 0x0114 }
            r12.set(r4)     // Catch:{ Exception -> 0x0114 }
            java.util.concurrent.CountDownLatch r12 = r0.v     // Catch:{ Exception -> 0x0114 }
            r12.countDown()     // Catch:{ Exception -> 0x0114 }
            goto L_0x0132
        L_0x0114:
            r12 = move-exception
            goto L_0x011e
        L_0x0116:
            java.lang.InterruptedException r12 = new java.lang.InterruptedException     // Catch:{ Exception -> 0x0114 }
            java.lang.String r1 = "ScheduledFuture is cancelled"
            r12.<init>(r1)     // Catch:{ Exception -> 0x0114 }
            throw r12     // Catch:{ Exception -> 0x0114 }
        L_0x011e:
            java.util.concurrent.atomic.AtomicReference r1 = r0.x
            r1.set(r12)
            java.util.concurrent.atomic.AtomicBoolean r12 = r0.o
            r12.set(r4)
            java.util.concurrent.atomic.AtomicBoolean r12 = r0.c
            r12.set(r4)
            java.util.concurrent.CountDownLatch r12 = r0.v
            r12.countDown()
        L_0x0132:
            return
        L_0x0133:
            java.lang.Object r0 = r12.c
            ru.ok.messages.contacts.picker.MultiPickerSelectionViewController r0 = (ru.ok.messages.contacts.picker.MultiPickerSelectionViewController) r0
            boolean r12 = r12.b
            r0.a(r12)
            return
        L_0x013d:
            java.lang.Object r0 = r12.c
            lp5 r0 = (defpackage.lp5) r0
            boolean r12 = r12.b
            r0.getClass()
            java.lang.Object r7 = defpackage.lp5.m
            monitor-enter(r7)
            hp5 r8 = r0.a     // Catch:{ all -> 0x0160 }
            r8.a()     // Catch:{ all -> 0x0160 }
            android.content.Context r8 = r8.a     // Catch:{ all -> 0x0160 }
            ox0 r8 = defpackage.ox0.r(r8)     // Catch:{ all -> 0x0160 }
            ox0 r9 = r0.c     // Catch:{ all -> 0x020e }
            tb0 r9 = r9.E()     // Catch:{ all -> 0x020e }
            if (r8 == 0) goto L_0x0163
            r8.F()     // Catch:{ all -> 0x0160 }
            goto L_0x0163
        L_0x0160:
            r12 = move-exception
            goto L_0x0215
        L_0x0163:
            monitor-exit(r7)     // Catch:{ all -> 0x0160 }
            int r8 = r9.b     // Catch:{ FirebaseInstallationsException -> 0x017f }
            r10 = 5
            if (r8 != r10) goto L_0x016b
            r11 = r4
            goto L_0x016c
        L_0x016b:
            r11 = r6
        L_0x016c:
            if (r11 != 0) goto L_0x0187
            if (r8 != r2) goto L_0x0171
            r6 = r4
        L_0x0171:
            if (r6 == 0) goto L_0x0174
            goto L_0x0187
        L_0x0174:
            if (r12 != 0) goto L_0x0182
            x0g r12 = r0.d     // Catch:{ FirebaseInstallationsException -> 0x017f }
            boolean r12 = r12.a(r9)     // Catch:{ FirebaseInstallationsException -> 0x017f }
            if (r12 == 0) goto L_0x020d
            goto L_0x0182
        L_0x017f:
            r12 = move-exception
            goto L_0x020a
        L_0x0182:
            tb0 r12 = r0.b(r9)     // Catch:{ FirebaseInstallationsException -> 0x017f }
            goto L_0x018b
        L_0x0187:
            tb0 r12 = r0.g(r9)     // Catch:{ FirebaseInstallationsException -> 0x017f }
        L_0x018b:
            monitor-enter(r7)
            hp5 r2 = r0.a     // Catch:{ all -> 0x01a2 }
            r2.a()     // Catch:{ all -> 0x01a2 }
            android.content.Context r2 = r2.a     // Catch:{ all -> 0x01a2 }
            ox0 r2 = defpackage.ox0.r(r2)     // Catch:{ all -> 0x01a2 }
            ox0 r6 = r0.c     // Catch:{ all -> 0x0201 }
            r6.A(r12)     // Catch:{ all -> 0x0201 }
            if (r2 == 0) goto L_0x01a4
            r2.F()     // Catch:{ all -> 0x01a2 }
            goto L_0x01a4
        L_0x01a2:
            r12 = move-exception
            goto L_0x0208
        L_0x01a4:
            monitor-exit(r7)     // Catch:{ all -> 0x01a2 }
            monitor-enter(r0)
            java.util.HashSet r2 = r0.k     // Catch:{ all -> 0x01cd }
            int r2 = r2.size()     // Catch:{ all -> 0x01cd }
            if (r2 == 0) goto L_0x01cf
            java.lang.String r2 = r9.a     // Catch:{ all -> 0x01cd }
            java.lang.String r6 = r12.a     // Catch:{ all -> 0x01cd }
            boolean r2 = android.text.TextUtils.equals(r2, r6)     // Catch:{ all -> 0x01cd }
            if (r2 != 0) goto L_0x01cf
            java.util.HashSet r2 = r0.k     // Catch:{ all -> 0x01cd }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x01cd }
            boolean r6 = r2.hasNext()     // Catch:{ all -> 0x01cd }
            if (r6 != 0) goto L_0x01c5
            goto L_0x01cf
        L_0x01c5:
            java.lang.Object r12 = r2.next()     // Catch:{ all -> 0x01cd }
            defpackage.rae.w(r12)     // Catch:{ all -> 0x01cd }
            throw r5     // Catch:{ all -> 0x01cd }
        L_0x01cd:
            r12 = move-exception
            goto L_0x01ff
        L_0x01cf:
            monitor-exit(r0)
            int r2 = r12.b
            if (r2 != r3) goto L_0x01de
            java.lang.String r2 = r12.a
            monitor-enter(r0)
            r0.j = r2     // Catch:{ all -> 0x01db }
            monitor-exit(r0)
            goto L_0x01de
        L_0x01db:
            r12 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01db }
            throw r12
        L_0x01de:
            int r2 = r12.b
            if (r2 != r10) goto L_0x01eb
            com.google.firebase.installations.FirebaseInstallationsException r12 = new com.google.firebase.installations.FirebaseInstallationsException
            r12.<init>()
            r0.h(r12)
            goto L_0x020d
        L_0x01eb:
            if (r2 == r1) goto L_0x01f4
            if (r2 != r4) goto L_0x01f0
            goto L_0x01f4
        L_0x01f0:
            r0.i(r12)
            goto L_0x020d
        L_0x01f4:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r1 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r12.<init>(r1)
            r0.h(r12)
            goto L_0x020d
        L_0x01ff:
            monitor-exit(r0)     // Catch:{ all -> 0x01cd }
            throw r12
        L_0x0201:
            r12 = move-exception
            if (r2 == 0) goto L_0x0207
            r2.F()     // Catch:{ all -> 0x01a2 }
        L_0x0207:
            throw r12     // Catch:{ all -> 0x01a2 }
        L_0x0208:
            monitor-exit(r7)     // Catch:{ all -> 0x01a2 }
            throw r12
        L_0x020a:
            r0.h(r12)
        L_0x020d:
            return
        L_0x020e:
            r12 = move-exception
            if (r8 == 0) goto L_0x0214
            r8.F()     // Catch:{ all -> 0x0160 }
        L_0x0214:
            throw r12     // Catch:{ all -> 0x0160 }
        L_0x0215:
            monitor-exit(r7)     // Catch:{ all -> 0x0160 }
            throw r12
        L_0x0217:
            kotlin.reflect.KProperty[] r0 = one.me.chats.search.ChatsListSearchScreen.F0
            boolean r0 = r12.b
            if (r0 == 0) goto L_0x0224
            java.lang.Object r12 = r12.c
            one.me.chats.search.ChatsListSearchScreen r12 = (one.me.chats.search.ChatsListSearchScreen) r12
            r12.g0()
        L_0x0224:
            return
        L_0x0225:
            java.lang.Object r0 = r12.c
            xr1 r0 = (defpackage.xr1) r0
            boolean r12 = r12.b
            r0.L0 = r12
            if (r12 == 0) goto L_0x0236
            int r12 = r0.Q0
            if (r12 != r3) goto L_0x0236
            r0.H(r6)
        L_0x0236:
            return
        L_0x0237:
            java.lang.Object r0 = r12.c
            gy0 r0 = (defpackage.gy0) r0
            boolean r1 = r0.b
            boolean r12 = r12.b
            if (r1 != r12) goto L_0x0242
            goto L_0x0283
        L_0x0242:
            r0.b = r12
            if (r12 == 0) goto L_0x0271
            boolean r12 = r0.w
            if (r12 == 0) goto L_0x0283
            java.lang.Object r12 = r0.c
            lr1 r12 = (defpackage.lr1) r12
            r12.getClass()
            d9d r1 = new d9d
            r2 = 25
            r1.<init>(r2, r12)
            go1 r12 = defpackage.m5a.F(r1)
            zz7 r12 = defpackage.hd8.J(r12)
            b r1 = new b
            r2 = 28
            r1.<init>((int) r2, (java.lang.Object) r0)
            java.lang.Object r2 = r0.o
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            r12.d(r1, r2)
            r0.w = r6
            goto L_0x0283
        L_0x0271:
            androidx.camera.core.CameraControl$OperationCanceledException r12 = new androidx.camera.core.CameraControl$OperationCanceledException
            java.lang.String r1 = "The camera control has became inactive."
            r12.<init>(r1)
            java.lang.Object r1 = r0.y
            do1 r1 = (defpackage.do1) r1
            if (r1 == 0) goto L_0x0283
            r1.d(r12)
            r0.y = r5
        L_0x0283:
            return
        L_0x0284:
            java.lang.Object r0 = r12.c
            zp1 r0 = (defpackage.zp1) r0
            boolean r12 = r12.b
            r0.g()
            long r1 = r0.y
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0297
            goto L_0x0331
        L_0x0297:
            yp1 r1 = r0.c
            f72 r1 = r1.a
            long r1 = r1.a
            java.util.concurrent.CopyOnWriteArrayList r3 = r0.o
            java.util.Iterator r3 = r3.iterator()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x02a8:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x02be
            java.lang.Object r6 = r3.next()
            a89 r6 = (defpackage.a89) r6
            ha9 r6 = r6.a
            long r6 = r6.o
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 >= 0) goto L_0x02a8
            r4 = r6
            goto L_0x02a8
        L_0x02be:
            r6 = 1
            long r4 = r4 - r6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "loadNext: from db from: "
            r3.<init>(r6)
            java.lang.Long r6 = java.lang.Long.valueOf(r1)
            java.lang.String r6 = defpackage.iq.U(r6)
            r3.append(r6)
            java.lang.String r6 = " to: "
            r3.append(r6)
            java.lang.Long r6 = java.lang.Long.valueOf(r4)
            java.lang.String r6 = defpackage.iq.U(r6)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            java.lang.String r6 = "zp1"
            defpackage.z68.c(r6, r3, new java.lang.Object[0])
            fa9 r3 = r0.v0
            java.util.ArrayList r1 = r3.n(r1, r4)
            java.util.concurrent.CopyOnWriteArrayList r2 = r0.o
            int r2 = r2.size()
            r0.b(r2, r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "loadNext: loaded from db: "
            r2.<init>(r3)
            int r3 = r1.size()
            r2.append(r3)
            java.lang.String r3 = " messages"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            defpackage.z68.c(r6, r2, new java.lang.Object[0])
            boolean r2 = r1.isEmpty()
            r0.b = r2
            r0.h()
            if (r12 == 0) goto L_0x0331
            int r12 = r1.size()
            r1 = 100
            if (r12 >= r1) goto L_0x0331
            yp1 r12 = r0.c
            boolean r12 = r12.o
            if (r12 == 0) goto L_0x0331
            r0.d()
        L_0x0331:
            return
        L_0x0332:
            boolean r0 = r12.b
            java.lang.Object r12 = r12.c
            ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl r12 = (ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl) r12
            ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl.b(r0, r12)
            return
        L_0x033c:
            java.lang.Object r0 = r12.c
            b8d r0 = (defpackage.b8d) r0
            java.lang.Object r0 = r0.a
            m70 r0 = (defpackage.m70) r0
            boolean r12 = r12.b
            r0.q = r12
            int r12 = r0.g
            if (r12 != r1) goto L_0x034f
            r0.a()
        L_0x034f:
            return
        L_0x0350:
            java.lang.Object r0 = r12.c
            wsb r0 = (defpackage.wsb) r0
            java.lang.Object r0 = r0.b
            lyc r0 = (defpackage.lyc) r0
            boolean r1 = r0.X
            boolean r12 = r12.b
            if (r1 == r12) goto L_0x0363
            r0.X = r12
            r0.H()
        L_0x0363:
            return
        L_0x0364:
            java.lang.Object r1 = r12.c
            p7d r1 = (defpackage.p7d) r1
            r1.getClass()
            int r3 = defpackage.v0g.a
            java.lang.Object r1 = r1.c
            nc5 r1 = (defpackage.nc5) r1
            tc5 r1 = r1.a
            boolean r3 = r1.f1
            boolean r12 = r12.b
            if (r3 != r12) goto L_0x037a
            goto L_0x0386
        L_0x037a:
            r1.f1 = r12
            vz0 r3 = new vz0
            r3.<init>(r12, r2)
            m56 r12 = r1.Z
            r12.m(r0, r3)
        L_0x0386:
            return
        L_0x0387:
            java.lang.Object r1 = r12.c
            wsb r1 = (defpackage.wsb) r1
            r1.getClass()
            int r2 = defpackage.t0g.a
            java.lang.Object r1 = r1.b
            mc5 r1 = (defpackage.mc5) r1
            sc5 r1 = r1.a
            boolean r2 = r1.c1
            boolean r12 = r12.b
            if (r2 != r12) goto L_0x039d
            goto L_0x03a9
        L_0x039d:
            r1.c1 = r12
            vz0 r2 = new vz0
            r2.<init>(r12, r3)
            d23 r12 = r1.Z
            r12.r(r0, r2)
        L_0x03a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c70.run():void");
    }

    public /* synthetic */ c70(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    public /* synthetic */ c70(boolean z, Object obj, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
    }
}
