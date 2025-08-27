package defpackage;

/* renamed from: pr1  reason: default package */
public final /* synthetic */ class pr1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pr1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
            r2 = 1
            int r3 = r6.a
            switch(r3) {
                case 0: goto L_0x0372;
                case 1: goto L_0x0332;
                case 2: goto L_0x0328;
                case 3: goto L_0x0320;
                case 4: goto L_0x0309;
                case 5: goto L_0x02f6;
                case 6: goto L_0x02e0;
                case 7: goto L_0x02d8;
                case 8: goto L_0x02b2;
                case 9: goto L_0x028a;
                case 10: goto L_0x026e;
                case 11: goto L_0x0266;
                case 12: goto L_0x0258;
                case 13: goto L_0x0250;
                case 14: goto L_0x0244;
                case 15: goto L_0x023a;
                case 16: goto L_0x0232;
                case 17: goto L_0x0224;
                case 18: goto L_0x021c;
                case 19: goto L_0x01fc;
                case 20: goto L_0x01e1;
                case 21: goto L_0x00c8;
                case 22: goto L_0x00af;
                case 23: goto L_0x009d;
                case 24: goto L_0x007a;
                case 25: goto L_0x0072;
                case 26: goto L_0x005a;
                case 27: goto L_0x0040;
                case 28: goto L_0x0024;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.Object r6 = r6.b
            me4 r6 = (defpackage.me4) r6
            boolean r0 = r6.c
            if (r0 == 0) goto L_0x0011
            goto L_0x0023
        L_0x0011:
            aw4 r0 = r6.b
            if (r0 == 0) goto L_0x001a
            gw4 r1 = r6.a
            r0.f(r1)
        L_0x001a:
            pe4 r0 = r6.o
            java.util.Set r0 = r0.n
            r0.remove(r6)
            r6.c = r2
        L_0x0023:
            return
        L_0x0024:
            java.lang.Object r6 = r6.b
            le4 r6 = (defpackage.le4) r6
            boolean r0 = r6.c
            if (r0 == 0) goto L_0x002d
            goto L_0x003f
        L_0x002d:
            zv4 r0 = r6.b
            if (r0 == 0) goto L_0x0036
            fw4 r1 = r6.a
            r0.f(r1)
        L_0x0036:
            oe4 r0 = r6.o
            java.util.Set r0 = r0.n
            r0.remove(r6)
            r6.c = r2
        L_0x003f:
            return
        L_0x0040:
            java.lang.Object r6 = r6.b
            sc4 r6 = (defpackage.sc4) r6
            long r0 = r6.k0
            r3 = 300000(0x493e0, double:1.482197E-318)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0059
            e4 r0 = r6.s
            java.lang.Object r0 = r0.b
            ln8 r0 = (defpackage.ln8) r0
            r0.Z1 = r2
            r0 = 0
            r6.k0 = r0
        L_0x0059:
            return
        L_0x005a:
            java.lang.Object r6 = r6.b
            wb4 r6 = (defpackage.wb4) r6
            td r0 = r6.a()
            nb4 r1 = new nb4
            r1.<init>((defpackage.td) r0)
            r2 = 1028(0x404, float:1.44E-42)
            r6.K(r0, r2, r1)
            m56 r6 = r6.w
            r6.k()
            return
        L_0x0072:
            java.lang.Object r6 = r6.b
            org.webrtc.VpxDecoderWrapper r6 = (org.webrtc.VpxDecoderWrapper) r6
            r6.close()
            return
        L_0x007a:
            java.lang.Object r6 = r6.b
            c24 r6 = (defpackage.c24) r6
            r6.getClass()
            kof r6 = defpackage.kof.a
            gx4 r6 = defpackage.kof.b()
            r6.getClass()
            ix4 r0 = new ix4
            java.lang.String r1 = "max_non_fatals_per_session_reached"
            java.lang.String r3 = "non_fatal"
            r0.<init>(r3, r1, r2)
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            r6.a(r0)
            return
        L_0x009d:
            java.lang.Object r6 = r6.b
            androidx.work.CoroutineWorker r6 = (androidx.work.CoroutineWorker) r6
            cyd r0 = r6.b
            java.lang.Object r0 = r0.a
            boolean r0 = r0 instanceof defpackage.u0
            if (r0 == 0) goto L_0x00ae
            qm7 r6 = r6.a
            r6.b(r1)
        L_0x00ae:
            return
        L_0x00af:
            java.lang.Object r6 = r6.b
            st3 r6 = (defpackage.st3) r6
            java.util.HashSet r6 = r6.j
            java.util.Iterator r6 = r6.iterator()
            boolean r0 = r6.hasNext()
            if (r0 != 0) goto L_0x00c0
            return
        L_0x00c0:
            java.lang.Object r6 = r6.next()
            defpackage.rae.w(r6)
            throw r1
        L_0x00c8:
            java.lang.Object r6 = r6.b
            androidx.work.impl.workers.ConstraintTrackingWorker r6 = (androidx.work.impl.workers.ConstraintTrackingWorker) r6
            cyd r0 = r6.o
            java.lang.Object r0 = r0.a
            boolean r0 = r0 instanceof defpackage.u0
            if (r0 == 0) goto L_0x00d6
            goto L_0x01e0
        L_0x00d6:
            t64 r0 = r6.getInputData()
            java.lang.String r1 = "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME"
            java.lang.String r0 = r0.e(r1)
            h88 r1 = defpackage.h88.x()
            if (r0 == 0) goto L_0x01d0
            int r2 = r0.length()
            if (r2 != 0) goto L_0x00ee
            goto L_0x01d0
        L_0x00ee:
            gqg r2 = r6.getWorkerFactory()
            android.content.Context r3 = r6.getApplicationContext()
            androidx.work.WorkerParameters r4 = r6.a
            e08 r2 = r2.b(r3, r0, r4)
            r6.v = r2
            if (r2 != 0) goto L_0x0112
            java.lang.String r0 = defpackage.sj3.a
            java.lang.String r2 = "No worker to delegate to."
            r1.p(r0, r2)
            cyd r6 = r6.o
            a08 r0 = defpackage.d08.a()
            r6.j(r0)
            goto L_0x01e0
        L_0x0112:
            android.content.Context r2 = r6.getApplicationContext()
            dpg r2 = defpackage.dpg.d(r2)
            androidx.work.impl.WorkDatabase r3 = r2.c
            ypg r3 = r3.y()
            java.util.UUID r4 = r6.getId()
            java.lang.String r4 = r4.toString()
            xpg r3 = r3.m(r4)
            if (r3 != 0) goto L_0x013b
            cyd r6 = r6.o
            java.lang.String r0 = defpackage.sj3.a
            a08 r0 = defpackage.d08.a()
            r6.j(r0)
            goto L_0x01e0
        L_0x013b:
            d19 r4 = new d19
            m7f r2 = r2.j
            r4.<init>((defpackage.m7f) r2, (defpackage.pog) r6)
            java.util.List r2 = kotlin.collections.CollectionsKt.listOf(r3)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r4.D(r2)
            java.util.UUID r2 = r6.getId()
            java.lang.String r2 = r2.toString()
            boolean r2 = r4.e(r2)
            if (r2 == 0) goto L_0x01ad
            java.lang.String r2 = defpackage.sj3.a
            java.lang.String r3 = "Constraints met for delegate "
            java.lang.String r3 = r3.concat(r0)
            r1.p(r2, r3)
            e08 r2 = r6.v     // Catch:{ all -> 0x0179 }
            zz7 r2 = r2.startWork()     // Catch:{ all -> 0x0179 }
            ir1 r3 = new ir1     // Catch:{ all -> 0x0179 }
            r4 = 15
            r3.<init>(r4, r6, r2)     // Catch:{ all -> 0x0179 }
            java.util.concurrent.Executor r4 = r6.getBackgroundExecutor()     // Catch:{ all -> 0x0179 }
            r2.d(r3, r4)     // Catch:{ all -> 0x0179 }
            goto L_0x01e0
        L_0x0179:
            r2 = move-exception
            java.lang.String r3 = defpackage.sj3.a
            java.lang.String r4 = "Delegated worker "
            java.lang.String r5 = " threw exception in startWork."
            java.lang.String r0 = defpackage.wj6.k(r4, r0, r5)
            r1.q(r3, r0, r2)
            java.lang.Object r0 = r6.b
            monitor-enter(r0)
            boolean r2 = r6.c     // Catch:{ all -> 0x019e }
            if (r2 == 0) goto L_0x01a0
            java.lang.String r2 = "Constraints were unmet, Retrying."
            r1.p(r3, r2)     // Catch:{ all -> 0x019e }
            cyd r6 = r6.o     // Catch:{ all -> 0x019e }
            b08 r1 = new b08     // Catch:{ all -> 0x019e }
            r1.<init>()     // Catch:{ all -> 0x019e }
            r6.j(r1)     // Catch:{ all -> 0x019e }
            goto L_0x01a9
        L_0x019e:
            r6 = move-exception
            goto L_0x01ab
        L_0x01a0:
            cyd r6 = r6.o     // Catch:{ all -> 0x019e }
            a08 r1 = defpackage.d08.a()     // Catch:{ all -> 0x019e }
            r6.j(r1)     // Catch:{ all -> 0x019e }
        L_0x01a9:
            monitor-exit(r0)
            goto L_0x01e0
        L_0x01ab:
            monitor-exit(r0)
            throw r6
        L_0x01ad:
            java.lang.String r2 = defpackage.sj3.a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Constraints not met for delegate "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = ". Requesting retry."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.p(r2, r0)
            cyd r6 = r6.o
            b08 r0 = new b08
            r0.<init>()
            r6.j(r0)
            goto L_0x01e0
        L_0x01d0:
            java.lang.String r0 = defpackage.sj3.a
            java.lang.String r2 = "No worker to delegate to."
            r1.t(r0, r2)
            cyd r6 = r6.o
            a08 r0 = defpackage.d08.a()
            r6.j(r0)
        L_0x01e0:
            return
        L_0x01e1:
            java.lang.Object r6 = r6.b
            xh3 r6 = (defpackage.xh3) r6
            java.util.concurrent.CopyOnWriteArraySet r6 = r6.i
            java.util.Iterator r6 = r6.iterator()
        L_0x01eb:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x01fb
            java.lang.Object r0 = r6.next()
            qh3 r0 = (defpackage.qh3) r0
            r0.b()
            goto L_0x01eb
        L_0x01fb:
            return
        L_0x01fc:
            java.lang.Object r6 = r6.b
            fd3 r6 = (defpackage.fd3) r6
            int r0 = r6.v0
            int r0 = r0 - r2
            r6.v0 = r0
            if (r0 <= 0) goto L_0x0208
            goto L_0x020f
        L_0x0208:
            if (r0 < 0) goto L_0x0210
            g6g r6 = r6.o
            r6.a()
        L_0x020f:
            return
        L_0x0210:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            int r6 = r6.v0
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r0.<init>(r6)
            throw r0
        L_0x021c:
            java.lang.Object r6 = r6.b
            dc3 r6 = (defpackage.dc3) r6
            defpackage.dc3.a(r6)
            return
        L_0x0224:
            java.lang.Object r6 = r6.b
            xb3 r6 = (defpackage.xb3) r6
            java.lang.Runnable r0 = r6.b
            if (r0 == 0) goto L_0x0231
            r0.run()
            r6.b = r1
        L_0x0231:
            return
        L_0x0232:
            java.lang.Object r6 = r6.b
            l23 r6 = (defpackage.l23) r6
            r6.t(r2)
            return
        L_0x023a:
            kotlin.reflect.KProperty[] r0 = one.me.chats.search.ChatsListSearchScreen.F0
            java.lang.Object r6 = r6.b
            one.me.chats.search.ChatsListSearchScreen r6 = (one.me.chats.search.ChatsListSearchScreen) r6
            r6.g0()
            return
        L_0x0244:
            java.lang.Object r6 = r6.b
            mqf r6 = (defpackage.mqf) r6
            java.lang.Object r6 = r6.w
            android.animation.AnimatorSet r6 = (android.animation.AnimatorSet) r6
            r6.start()
            return
        L_0x0250:
            java.lang.Object r6 = r6.b
            hr2 r6 = (defpackage.hr2) r6
            r6.c()
            return
        L_0x0258:
            kotlin.reflect.KProperty[] r0 = one.me.chatscreen.ChatScreen.d1
            java.lang.Object r6 = r6.b
            one.me.chatscreen.ChatScreen r6 = (one.me.chatscreen.ChatScreen) r6
            h3b r6 = r6.z0()
            r6.g(r2)
            return
        L_0x0266:
            java.lang.Object r6 = r6.b
            com.google.android.material.carousel.CarouselLayoutManager r6 = (com.google.android.material.carousel.CarouselLayoutManager) r6
            r6.p0()
            return
        L_0x026e:
            java.lang.Object r6 = r6.b
            java.util.LinkedHashSet r6 = (java.util.LinkedHashSet) r6
            java.util.Iterator r6 = r6.iterator()
        L_0x0276:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0289
            java.lang.Object r0 = r6.next()
            t6f r0 = (defpackage.t6f) r0
            r0.getClass()
            r0.c(r0)
            goto L_0x0276
        L_0x0289:
            return
        L_0x028a:
            java.lang.Object r6 = r6.b
            jx1 r6 = (defpackage.jx1) r6
            java.lang.Object r0 = r6.a
            monitor-enter(r0)
            java.util.ArrayList r1 = r6.b     // Catch:{ all -> 0x029b }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x029b }
            if (r1 == 0) goto L_0x029d
            monitor-exit(r0)     // Catch:{ all -> 0x029b }
            goto L_0x02a8
        L_0x029b:
            r6 = move-exception
            goto L_0x02b0
        L_0x029d:
            java.util.ArrayList r1 = r6.b     // Catch:{ all -> 0x02a9 }
            r6.i(r1)     // Catch:{ all -> 0x02a9 }
            java.util.ArrayList r6 = r6.b     // Catch:{ all -> 0x029b }
            r6.clear()     // Catch:{ all -> 0x029b }
            monitor-exit(r0)     // Catch:{ all -> 0x029b }
        L_0x02a8:
            return
        L_0x02a9:
            r1 = move-exception
            java.util.ArrayList r6 = r6.b     // Catch:{ all -> 0x029b }
            r6.clear()     // Catch:{ all -> 0x029b }
            throw r1     // Catch:{ all -> 0x029b }
        L_0x02b0:
            monitor-exit(r0)     // Catch:{ all -> 0x029b }
            throw r6
        L_0x02b2:
            java.lang.Object r6 = r6.b
            fx1 r6 = (defpackage.fx1) r6
            java.lang.Object r6 = r6.b
            pk4 r6 = (defpackage.pk4) r6
            java.lang.Object r6 = r6.a
            qvb r6 = (defpackage.qvb) r6
            if (r6 == 0) goto L_0x02d7
            k3d r6 = r6.f
            r6.getClass()
            defpackage.ev0.g()
            boolean r0 = r6.g
            if (r0 != 0) goto L_0x02d7
            boolean r0 = r6.h
            if (r0 == 0) goto L_0x02d1
            goto L_0x02d7
        L_0x02d1:
            r6.h = r2
            rc0 r6 = r6.a
            xv1 r6 = r6.c
        L_0x02d7:
            return
        L_0x02d8:
            java.lang.Object r6 = r6.b
            com.my.tracker.campaign.CampaignService r6 = (com.my.tracker.campaign.CampaignService) r6
            r6.stopSelf()
            return
        L_0x02e0:
            java.lang.Object r6 = r6.b
            b8d r6 = (defpackage.b8d) r6
            java.lang.Object r0 = r6.a
            xr1 r0 = (defpackage.xr1) r0
            int r0 = r0.Q0
            r1 = 9
            if (r0 != r1) goto L_0x02f5
            java.lang.Object r6 = r6.a
            xr1 r6 = (defpackage.xr1) r6
            r6.A()
        L_0x02f5:
            return
        L_0x02f6:
            java.lang.Object r6 = r6.b
            nv1 r6 = (defpackage.nv1) r6
            rr1 r6 = (defpackage.rr1) r6
            xr1 r1 = r6.c
            int r1 = r1.Q0
            r2 = 4
            if (r1 != r2) goto L_0x0308
            xr1 r6 = r6.c
            r6.I(r0)
        L_0x0308:
            return
        L_0x0309:
            java.lang.Object r6 = r6.b
            du1 r6 = (defpackage.du1) r6
            eu1 r0 = r6.c
            java.util.HashMap r2 = r0.h
            java.lang.Object r6 = r2.remove(r6)
            nyc r6 = (defpackage.nyc) r6
            if (r6 == 0) goto L_0x031f
            nyc r2 = r0.g
            if (r2 != r6) goto L_0x031f
            r0.g = r1
        L_0x031f:
            return
        L_0x0320:
            java.lang.Object r6 = r6.b
            x87 r6 = (defpackage.x87) r6
            r6.clear()
            return
        L_0x0328:
            java.lang.Object r6 = r6.b
            ks1 r6 = (defpackage.ks1) r6
            is1 r6 = r6.i
            r6.c()
            return
        L_0x0332:
            java.lang.Object r6 = r6.b
            vr1 r6 = (defpackage.vr1) r6
            boolean r3 = r6.b
            if (r3 != 0) goto L_0x0371
            java.lang.Object r3 = r6.o
            wr1 r3 = (defpackage.wr1) r3
            xr1 r3 = r3.f
            int r3 = r3.Q0
            r4 = 7
            if (r3 == r4) goto L_0x0350
            java.lang.Object r3 = r6.o
            wr1 r3 = (defpackage.wr1) r3
            xr1 r3 = r3.f
            int r3 = r3.Q0
            r4 = 6
            if (r3 != r4) goto L_0x0351
        L_0x0350:
            r0 = r2
        L_0x0351:
            defpackage.bs0.r(r1, r0)
            java.lang.Object r0 = r6.o
            wr1 r0 = (defpackage.wr1) r0
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x0368
            java.lang.Object r6 = r6.o
            wr1 r6 = (defpackage.wr1) r6
            xr1 r6 = r6.f
            r6.H(r2)
            goto L_0x0371
        L_0x0368:
            java.lang.Object r6 = r6.o
            wr1 r6 = (defpackage.wr1) r6
            xr1 r6 = r6.f
            r6.I(r2)
        L_0x0371:
            return
        L_0x0372:
            java.lang.Object r6 = r6.b
            android.hardware.camera2.CameraDevice r6 = (android.hardware.camera2.CameraDevice) r6
            r6.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pr1.run():void");
    }
}
