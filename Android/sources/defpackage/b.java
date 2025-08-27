package defpackage;

/* renamed from: b  reason: default package */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: type inference failed for: r1v90, types: [sb0, java.lang.Object] */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r30 = this;
            r0 = r30
            r1 = 0
            r3 = -1
            r4 = 4
            r5 = 0
            r6 = 0
            r7 = 1
            int r8 = r0.a
            switch(r8) {
                case 0: goto L_0x0513;
                case 1: goto L_0x0509;
                case 2: goto L_0x04f1;
                case 3: goto L_0x0486;
                case 4: goto L_0x0478;
                case 5: goto L_0x0469;
                case 6: goto L_0x0458;
                case 7: goto L_0x043e;
                case 8: goto L_0x029d;
                case 9: goto L_0x026d;
                case 10: goto L_0x0238;
                case 11: goto L_0x0230;
                case 12: goto L_0x021d;
                case 13: goto L_0x0215;
                case 14: goto L_0x0209;
                case 15: goto L_0x01fb;
                case 16: goto L_0x01f3;
                case 17: goto L_0x019e;
                case 18: goto L_0x015d;
                case 19: goto L_0x0155;
                case 20: goto L_0x014d;
                case 21: goto L_0x0145;
                case 22: goto L_0x00bd;
                case 23: goto L_0x00af;
                case 24: goto L_0x00a1;
                case 25: goto L_0x008f;
                case 26: goto L_0x0084;
                case 27: goto L_0x0061;
                case 28: goto L_0x0051;
                default: goto L_0x000e;
            }
        L_0x000e:
            java.lang.Object r0 = r0.b
            xr1 r0 = (defpackage.xr1) r0
            r0.D0 = r5
            r0.C0 = r5
            r0.toString()
            int r1 = r0.Q0
            int r1 = defpackage.tr1.y(r1)
            if (r1 == r7) goto L_0x0044
            if (r1 == r4) goto L_0x0044
            r2 = 6
            if (r1 == r2) goto L_0x002a
            r0.toString()
            goto L_0x0050
        L_0x002a:
            int r1 = r0.Y
            if (r1 == 0) goto L_0x0040
            java.lang.String r1 = defpackage.xr1.u(r1)
            java.lang.String r2 = "OpenCameraConfigAndClose in error: "
            r2.concat(r1)
            r0.toString()
            wr1 r0 = r0.y
            r0.b()
            goto L_0x0050
        L_0x0040:
            r0.I(r5)
            goto L_0x0050
        L_0x0044:
            java.util.LinkedHashMap r1 = r0.v0
            boolean r1 = r1.isEmpty()
            defpackage.bs0.r(r6, r1)
            r0.t()
        L_0x0050:
            return
        L_0x0051:
            java.lang.Object r0 = r0.b
            gy0 r0 = (defpackage.gy0) r0
            java.lang.Object r1 = r0.y
            do1 r1 = (defpackage.do1) r1
            if (r1 == 0) goto L_0x0060
            r1.b(r6)
            r0.y = r6
        L_0x0060:
            return
        L_0x0061:
            java.lang.Object r0 = r0.b
            ap1 r0 = (defpackage.ap1) r0
            m01 r1 = r0.b
            o01 r1 = (defpackage.o01) r1
            boolean r1 = r1.d()
            r1 = r1 ^ r7
            if (r1 == 0) goto L_0x0076
            f94 r0 = r0.q
            r0.a()
            goto L_0x0083
        L_0x0076:
            kotlin.Lazy r0 = r0.p
            java.lang.Object r0 = r0.getValue()
            sz9 r0 = (defpackage.sz9) r0
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.d(r1)
        L_0x0083:
            return
        L_0x0084:
            java.lang.Object r0 = r0.b
            to1 r0 = (defpackage.to1) r0
            r0.getClass()
            org.webrtc.ThreadUtils.checkIsOnMainThread()
            return
        L_0x008f:
            java.lang.Object r0 = r0.b
            on1 r0 = (defpackage.on1) r0
            boolean r1 = r0.w0
            if (r1 != 0) goto L_0x00a0
            mn1 r1 = r0.o
            if (r1 == 0) goto L_0x009e
            r1.b(r7)
        L_0x009e:
            r0.w0 = r7
        L_0x00a0:
            return
        L_0x00a1:
            gga r1 = one.me.calls.ui.ui.call.CallScreen.J0
            java.lang.Object r0 = r0.b
            one.me.calls.ui.ui.call.CallScreen r0 = (one.me.calls.ui.ui.call.CallScreen) r0
            e9d r1 = r0.getRouter()
            r1.B(r0)
            return
        L_0x00af:
            u9a r1 = one.me.calls.ui.ui.incoming.CallIncomingScreen.x
            java.lang.Object r0 = r0.b
            one.me.calls.ui.ui.incoming.CallIncomingScreen r0 = (one.me.calls.ui.ui.incoming.CallIncomingScreen) r0
            e9d r1 = r0.getRouter()
            r1.B(r0)
            return
        L_0x00bd:
            int r1 = ru.ok.messages.calls.views.CallGridView.w0
            java.lang.Object r0 = r0.b
            ru.ok.messages.calls.views.CallGridView r0 = (ru.ok.messages.calls.views.CallGridView) r0
            int r1 = r0.getParticipantsCount()
            if (r1 <= r4) goto L_0x0135
            ru.ok.messages.calls.views.indicator.ScrollingPagerIndicator r1 = r0.x
            if (r1 != 0) goto L_0x0116
            ru.ok.messages.calls.views.indicator.ScrollingPagerIndicator r1 = new ru.ok.messages.calls.views.indicator.ScrollingPagerIndicator
            android.content.Context r2 = r0.getContext()
            r1.<init>(r2, r6)
            r0.x = r1
            sb0 r1 = new sb0
            int r2 = r0.o
            r1.<init>()
            r1.a = r2
            r0.z = r1
            ru.ok.messages.calls.views.indicator.ScrollingPagerIndicator r2 = r0.x
            i61 r4 = r0.b
            r2.b(r4, r1)
            ru.ok.messages.calls.views.indicator.ScrollingPagerIndicator r1 = r0.x
            android.content.Context r2 = r0.getContext()
            int r4 = defpackage.lad.w
            int r2 = defpackage.fw3.a(r2, r4)
            r1.setDotColor(r2)
            ru.ok.messages.calls.views.indicator.ScrollingPagerIndicator r1 = r0.x
            r1.setSelectedDotColor(r3)
            ru.ok.messages.calls.views.indicator.ScrollingPagerIndicator r1 = r0.x
            r2 = 5
            r1.setDotCount(r2)
            ru.ok.messages.calls.views.indicator.ScrollingPagerIndicator r1 = r0.x
            ro4 r2 = r0.a
            int r2 = r2.f
            r1.setDotNormalSize(r2)
            ru.ok.messages.calls.views.indicator.ScrollingPagerIndicator r1 = r0.x
            ro4 r2 = r0.a
            int r2 = r2.h
            r1.setDotSelectedSize(r2)
        L_0x0116:
            ru.ok.messages.calls.views.indicator.ScrollingPagerIndicator r1 = r0.x
            int r1 = r0.indexOfChild(r1)
            if (r1 != r3) goto L_0x0144
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r2 = -2
            r1.<init>(r2, r2)
            r2 = 49
            r1.gravity = r2
            ru.ok.messages.calls.views.indicator.ScrollingPagerIndicator r2 = r0.x
            r0.addView(r2, r1)
            ru.ok.messages.calls.views.indicator.ScrollingPagerIndicator r1 = r0.x
            int r0 = r0.y
            defpackage.iq.O(r1, r0)
            goto L_0x0144
        L_0x0135:
            ru.ok.messages.calls.views.indicator.ScrollingPagerIndicator r1 = r0.x
            if (r1 == 0) goto L_0x0144
            int r1 = r0.indexOfChild(r1)
            if (r1 == r3) goto L_0x0144
            ru.ok.messages.calls.views.indicator.ScrollingPagerIndicator r1 = r0.x
            r0.removeView(r1)
        L_0x0144:
            return
        L_0x0145:
            java.lang.Object r0 = r0.b
            w21 r0 = (defpackage.w21) r0
            r0.getClass()
            return
        L_0x014d:
            java.lang.Object r0 = r0.b
            ru.ok.messages.bots.ButtonsView r0 = (ru.ok.messages.bots.ButtonsView) r0
            r0.invalidate()
            return
        L_0x0155:
            java.lang.Object r0 = r0.b
            lw0 r0 = (defpackage.lw0) r0
            r0.invalidate()
            return
        L_0x015d:
            java.lang.Object r0 = r0.b
            ru.ok.tamtam.photoeditor.view.BrushWidthViewImpl r0 = (ru.ok.tamtam.photoeditor.view.BrushWidthViewImpl) r0
            float r1 = r0.z
            float r2 = r0.w0
            float r3 = r0.v0
            float r4 = r0.y0
            float r5 = r0.z0
            float r1 = r2 - r1
            float r2 = r2 - r3
            float r1 = r1 / r2
            float r5 = r5 - r4
            float r5 = r5 * r1
            float r5 = r5 + r4
            r1 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r1
            java.util.HashSet r0 = r0.B0
            java.util.Iterator r0 = r0.iterator()
        L_0x017b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x019d
            java.lang.Object r2 = r0.next()
            hfb r2 = (defpackage.hfb) r2
            float r3 = r5 * r1
            r2.getClass()
            gfb r4 = new gfb
            r4.<init>(r3)
            r2.b(r4)
            int r3 = (int) r3
            java.lang.String r4 = "app.editor.width"
            hq r2 = r2.c
            r2.j(r3, r4)
            goto L_0x017b
        L_0x019d:
            return
        L_0x019e:
            int r1 = ru.ok.tamtam.android.services.BootCompletedReceiver.a
            java.lang.Object r0 = r0.b
            z9f r0 = (defpackage.z9f) r0
            sjd r0 = (defpackage.sjd) r0
            q4 r1 = r0.getAccessor()
            java.lang.Class<pbf> r2 = defpackage.pbf.class
            java.lang.Object r1 = r1.g(r2)
            pbf r1 = (defpackage.pbf) r1
            wbf r1 = (defpackage.wbf) r1
            r1.getClass()
            java.lang.String r2 = defpackage.wbf.q
            java.lang.String r3 = "onBootCompleted"
            defpackage.z68.a(r2, r3)
            kotlin.Lazy r2 = r1.f
            java.lang.Object r2 = r2.getValue()
            jtb r2 = (defpackage.jtb) r2
            ltb r2 = (defpackage.ltb) r2
            a33 r2 = r2.a
            r2.w(r7)
            kotlin.Lazy r2 = r1.m
            java.lang.Object r2 = r2.getValue()
            zbf r2 = (defpackage.zbf) r2
            r2.e()
            kotlin.Lazy r1 = r1.l
            java.lang.Object r1 = r1.getValue()
            bef r1 = (defpackage.bef) r1
            r1.a()
            q4 r0 = r0.getAccessor()
            java.lang.Class<qwa> r1 = defpackage.qwa.class
            java.lang.Object r0 = r0.g(r1)
            qwa r0 = (defpackage.qwa) r0
            r0.c()
            return
        L_0x01f3:
            java.lang.Object r0 = r0.b
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r0.recycle()     // Catch:{ Exception -> 0x01fa }
        L_0x01fa:
            return
        L_0x01fb:
            java.lang.Object r0 = r0.b
            cn0 r0 = (defpackage.cn0) r0
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            r0.performClick()
            return
        L_0x0209:
            java.lang.Object r0 = r0.b
            hi0 r0 = (defpackage.hi0) r0
            android.view.View r0 = r0.a
            androidx.viewpager2.widget.ViewPager2 r0 = (androidx.viewpager2.widget.ViewPager2) r0
            r0.c()
            return
        L_0x0215:
            java.lang.Object r0 = r0.b
            wsb r0 = (defpackage.wsb) r0
            r0.getClass()
            return
        L_0x021d:
            java.lang.Object r0 = r0.b
            m70 r0 = (defpackage.m70) r0
            int r1 = r0.g
            int r1 = defpackage.tr1.y(r1)
            if (r1 == r7) goto L_0x022a
            goto L_0x022f
        L_0x022a:
            r0.g = r7
            r0.d()
        L_0x022f:
            return
        L_0x0230:
            java.lang.Object r0 = r0.b
            r20 r0 = (defpackage.r20) r0
            defpackage.b.super.invalidateSelf()
            return
        L_0x0238:
            java.lang.Object r0 = r0.b
            ny r0 = (defpackage.ny) r0
            java.lang.Object r3 = r0.a
            monitor-enter(r3)
            boolean r4 = r0.m     // Catch:{ all -> 0x0245 }
            if (r4 == 0) goto L_0x0247
            monitor-exit(r3)     // Catch:{ all -> 0x0245 }
            goto L_0x026a
        L_0x0245:
            r0 = move-exception
            goto L_0x026b
        L_0x0247:
            long r4 = r0.l     // Catch:{ all -> 0x0245 }
            r6 = 1
            long r4 = r4 - r6
            r0.l = r4     // Catch:{ all -> 0x0245 }
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0254
            monitor-exit(r3)     // Catch:{ all -> 0x0245 }
            goto L_0x026a
        L_0x0254:
            if (r1 >= 0) goto L_0x0266
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0245 }
            r1.<init>()     // Catch:{ all -> 0x0245 }
            java.lang.Object r2 = r0.a     // Catch:{ all -> 0x0245 }
            monitor-enter(r2)     // Catch:{ all -> 0x0245 }
            r0.n = r1     // Catch:{ all -> 0x0263 }
            monitor-exit(r2)     // Catch:{ all -> 0x0263 }
            monitor-exit(r3)     // Catch:{ all -> 0x0245 }
            goto L_0x026a
        L_0x0263:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0263 }
            throw r0     // Catch:{ all -> 0x0245 }
        L_0x0266:
            r0.a()     // Catch:{ all -> 0x0245 }
            monitor-exit(r3)     // Catch:{ all -> 0x0245 }
        L_0x026a:
            return
        L_0x026b:
            monitor-exit(r3)     // Catch:{ all -> 0x0245 }
            throw r0
        L_0x026d:
            java.lang.Object r0 = r0.b
            nj r0 = (defpackage.nj) r0
            java.util.LinkedHashSet r1 = r0.g
            r1.clear()
            java.util.HashMap r1 = r0.e
            java.util.Set r2 = r1.entrySet()
            java.util.Iterator r2 = r2.iterator()
            boolean r3 = r2.hasNext()
            if (r3 != 0) goto L_0x028f
            r1.clear()
            java.util.concurrent.ConcurrentHashMap r0 = r0.f
            r0.clear()
            return
        L_0x028f:
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            defpackage.rae.w(r0)
            throw r6
        L_0x029d:
            java.lang.Object r0 = r0.b
            ng r0 = (defpackage.ng) r0
            y35 r0 = r0.c
            r0.getClass()
            long r8 = android.os.SystemClock.uptimeMillis()
            java.lang.Object r0 = r0.b
            ng r0 = (defpackage.ng) r0
            r0.getClass()
            long r10 = android.os.SystemClock.uptimeMillis()
            r4 = r5
        L_0x02b6:
            java.util.ArrayList r12 = r0.b
            int r13 = r12.size()
            if (r4 >= r13) goto L_0x03f2
            java.lang.Object r12 = r12.get(r4)
            ohe r12 = (defpackage.ohe) r12
            if (r12 != 0) goto L_0x02cb
        L_0x02c6:
            r30 = r4
            r1 = r7
            goto L_0x03e9
        L_0x02cb:
            qae r13 = r0.a
            java.lang.Object r14 = r13.get(r12)
            java.lang.Long r14 = (java.lang.Long) r14
            if (r14 != 0) goto L_0x02d6
            goto L_0x02e1
        L_0x02d6:
            long r14 = r14.longValue()
            int r14 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r14 >= 0) goto L_0x02c6
            r13.remove(r12)
        L_0x02e1:
            long r13 = r12.i
            int r15 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r15 != 0) goto L_0x02f2
            r12.i = r8
            float r13 = r12.b
            r12.e(r13)
            r30 = r4
            goto L_0x03e8
        L_0x02f2:
            long r13 = r8 - r13
            r12.i = r8
            ng r15 = defpackage.ohe.d()
            float r15 = r15.g
            r1 = 0
            int r2 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r2 != 0) goto L_0x0307
            r13 = 2147483647(0x7fffffff, double:1.060997895E-314)
        L_0x0304:
            r21 = r13
            goto L_0x030b
        L_0x0307:
            float r2 = (float) r13
            float r2 = r2 / r15
            long r13 = (long) r2
            goto L_0x0304
        L_0x030b:
            boolean r2 = r12.o
            r13 = 2139095039(0x7f7fffff, float:3.4028235E38)
            if (r2 == 0) goto L_0x0331
            float r2 = r12.n
            int r14 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r14 == 0) goto L_0x0322
            phe r14 = r12.m
            r30 = r4
            double r3 = (double) r2
            r14.i = r3
            r12.n = r13
            goto L_0x0324
        L_0x0322:
            r30 = r4
        L_0x0324:
            phe r2 = r12.m
            double r2 = r2.i
            float r2 = (float) r2
            r12.b = r2
            r12.a = r1
            r12.o = r5
            goto L_0x03ce
        L_0x0331:
            r30 = r4
            float r2 = r12.n
            int r2 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r2 == 0) goto L_0x0375
            phe r2 = r12.m
            float r3 = r12.b
            double r3 = (double) r3
            float r14 = r12.a
            double r6 = (double) r14
            r16 = 2
            long r16 = r21 / r16
            r23 = r2
            r24 = r3
            r26 = r6
            r28 = r16
            sy4 r2 = r23.c(r24, r26, r28)
            phe r3 = r12.m
            float r4 = r12.n
            double r6 = (double) r4
            r3.i = r6
            r12.n = r13
            float r4 = r2.a
            double r6 = (double) r4
            float r2 = r2.b
            double r13 = (double) r2
            r23 = r3
            r24 = r6
            r26 = r13
            r28 = r16
            sy4 r2 = r23.c(r24, r26, r28)
            float r3 = r2.a
            r12.b = r3
            float r2 = r2.b
            r12.a = r2
            goto L_0x038f
        L_0x0375:
            phe r2 = r12.m
            float r3 = r12.b
            double r3 = (double) r3
            float r6 = r12.a
            double r6 = (double) r6
            r16 = r2
            r17 = r3
            r19 = r6
            sy4 r2 = r16.c(r17, r19, r21)
            float r3 = r2.a
            r12.b = r3
            float r2 = r2.b
            r12.a = r2
        L_0x038f:
            float r2 = r12.b
            float r3 = r12.h
            float r2 = java.lang.Math.max(r2, r3)
            r12.b = r2
            float r3 = r12.g
            float r2 = java.lang.Math.min(r2, r3)
            r12.b = r2
            float r3 = r12.a
            phe r4 = r12.m
            r4.getClass()
            float r3 = java.lang.Math.abs(r3)
            double r6 = (double) r3
            double r13 = r4.e
            int r3 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r3 >= 0) goto L_0x03cd
            double r6 = r4.i
            float r3 = (float) r6
            float r2 = r2 - r3
            float r2 = java.lang.Math.abs(r2)
            double r2 = (double) r2
            double r6 = r4.d
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x03cd
            phe r2 = r12.m
            double r2 = r2.i
            float r2 = (float) r2
            r12.b = r2
            r12.a = r1
            r7 = 1
            goto L_0x03ce
        L_0x03cd:
            r7 = r5
        L_0x03ce:
            float r1 = r12.b
            float r2 = r12.g
            float r1 = java.lang.Math.min(r1, r2)
            r12.b = r1
            float r2 = r12.h
            float r1 = java.lang.Math.max(r1, r2)
            r12.b = r1
            r12.e(r1)
            if (r7 == 0) goto L_0x03e8
            r12.c(r5)
        L_0x03e8:
            r1 = 1
        L_0x03e9:
            int r4 = r30 + 1
            r7 = r1
            r1 = 0
            r3 = -1
            r6 = 0
            goto L_0x02b6
        L_0x03f2:
            r1 = r7
            boolean r2 = r0.f
            if (r2 == 0) goto L_0x0424
            int r2 = r12.size()
            int r2 = r2 - r1
        L_0x03fc:
            if (r2 < 0) goto L_0x040a
            java.lang.Object r1 = r12.get(r2)
            if (r1 != 0) goto L_0x0407
            r12.remove(r2)
        L_0x0407:
            r1 = -1
            int r2 = r2 + r1
            goto L_0x03fc
        L_0x040a:
            int r1 = r12.size()
            if (r1 != 0) goto L_0x0422
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L_0x0422
            fj r1 = r0.h
            java.lang.Object r2 = r1.b
            lg r2 = (defpackage.lg) r2
            boolean unused = android.animation.ValueAnimator.unregisterDurationScaleChangeListener(r2)
            r2 = 0
            r1.b = r2
        L_0x0422:
            r0.f = r5
        L_0x0424:
            int r1 = r12.size()
            if (r1 <= 0) goto L_0x043d
            xe8 r1 = r0.e
            r1.getClass()
            mg r2 = new mg
            b r0 = r0.d
            r2.<init>(r5, r0)
            java.lang.Object r0 = r1.b
            android.view.Choreographer r0 = (android.view.Choreographer) r0
            r0.postFrameCallback(r2)
        L_0x043d:
            return
        L_0x043e:
            java.lang.Object r0 = r0.b
            ru.ok.messages.media.trim.ActTrimVideo r0 = (ru.ok.messages.media.trim.ActTrimVideo) r0
            ju8 r1 = r0.A0
            if (r1 == 0) goto L_0x0457
            dm4 r1 = r0.x
            java.lang.Object r1 = r1.b
            id3 r1 = (defpackage.id3) r1
            qra r1 = (defpackage.qra) r1
            mu8 r1 = r1.t()
            ju8 r0 = r0.A0
            r1.o(r0)
        L_0x0457:
            return
        L_0x0458:
            java.lang.Object r0 = r0.b
            m6 r0 = (defpackage.m6) r0
            r0.getClass()
            int r1 = ru.ok.messages.media.mediabar.ActLocalMedias.W0
            java.lang.Object r0 = r0.b
            ru.ok.messages.media.mediabar.ActLocalMedias r0 = (ru.ok.messages.media.mediabar.ActLocalMedias) r0
            r0.Y()
            return
        L_0x0469:
            java.lang.Object r0 = r0.b
            l6 r0 = (defpackage.l6) r0
            r0.getClass()
            int r1 = ru.ok.messages.media.mediabar.ActLocalMedias.W0
            ru.ok.messages.media.mediabar.ActLocalMedias r0 = r0.b
            r0.Y()
            return
        L_0x0478:
            java.lang.Object r0 = r0.b
            ru.ok.messages.contacts.profile.ActContactAvatars r0 = (ru.ok.messages.contacts.profile.ActContactAvatars) r0
            androidx.viewpager.widget.ViewPager r1 = r0.z0
            int r1 = r1.getCurrentItem()
            r0.Y(r1)
            return
        L_0x0486:
            java.lang.Object r0 = r0.b
            ru.ok.messages.media.attaches.ActAttachesView r0 = (ru.ok.messages.media.attaches.ActAttachesView) r0
            ju8 r1 = r0.a1
            if (r1 == 0) goto L_0x049f
            dm4 r1 = r0.x
            java.lang.Object r1 = r1.b
            id3 r1 = (defpackage.id3) r1
            qra r1 = (defpackage.qra) r1
            mu8 r1 = r1.t()
            ju8 r2 = r0.a1
            r1.o(r2)
        L_0x049f:
            ju8 r1 = r0.b1
            if (r1 == 0) goto L_0x04b4
            dm4 r1 = r0.x
            java.lang.Object r1 = r1.b
            id3 r1 = (defpackage.id3) r1
            qra r1 = (defpackage.qra) r1
            mu8 r1 = r1.t()
            ju8 r2 = r0.b1
            r1.o(r2)
        L_0x04b4:
            s20 r1 = r0.A0
            if (r1 == 0) goto L_0x04f0
            java.lang.String r1 = r0.L0
            boolean r1 = defpackage.cvg.A(r1)
            if (r1 != 0) goto L_0x04f0
            s20 r1 = r0.A0
            java.lang.String r0 = r0.L0
            ru.ok.messages.media.attaches.fragments.FrgAttachView r0 = r1.q(r0)
            boolean r1 = r0 instanceof ru.ok.messages.media.attaches.fragments.FrgAttachVideo
            if (r1 == 0) goto L_0x04f0
            ru.ok.messages.media.attaches.fragments.FrgAttachVideo r0 = (ru.ok.messages.media.attaches.fragments.FrgAttachVideo) r0
            j0a r1 = r0.N1
            if (r1 != 0) goto L_0x04d3
            goto L_0x04f0
        L_0x04d3:
            ju8 r0 = r0.L1
            m48 r0 = (defpackage.m48) r0
            r0.g = r1
            f4g r1 = r0.f
            if (r1 == 0) goto L_0x04f0
            int r1 = r0.j()
            int r2 = r0.h()
            int r3 = r0.i()
            iu8 r0 = r0.e
            if (r0 == 0) goto L_0x04f0
            r0.k(r1, r2, r3)
        L_0x04f0:
            return
        L_0x04f1:
            java.lang.Object r0 = r0.b
            ru.ok.messages.contacts.picker.ActAdminPicker r0 = (ru.ok.messages.contacts.picker.ActAdminPicker) r0
            tx9 r1 = r0.z0
            java.util.List r1 = r1.h
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x0508
            androidx.viewpager.widget.ViewPager r1 = r0.D0
            int r1 = r1.getCurrentItem()
            r0.X(r1)
        L_0x0508:
            return
        L_0x0509:
            r1 = 130(0x82, float:1.82E-43)
            java.lang.Object r0 = r0.b
            android.widget.ScrollView r0 = (android.widget.ScrollView) r0
            r0.fullScroll(r1)
            return
        L_0x0513:
            java.lang.Object r0 = r0.b
            d r0 = (defpackage.d) r0
            voc r1 = r0.Y
            java.lang.String r2 = "releaseInternal"
            java.lang.String r3 = "SlmsSource"
            r1.log(r3, r2)
            v48 r1 = r0.x0
            if (r1 == 0) goto L_0x0610
            v48 r1 = r0.x0
            voc r2 = r1.n
            java.lang.String r4 = "OKRTCLmsAdapter"
            java.lang.String r6 = "release"
            r2.log(r4, r6)
            qpg r2 = r1.D
            if (r2 == 0) goto L_0x054c
            r7 = 0
            r2.a = r7
            java.lang.Object r7 = r2.b
            android.os.Handler r7 = (android.os.Handler) r7
            java.lang.Object r8 = r2.c
            haf r8 = (defpackage.haf) r8
            r7.removeCallbacks(r8)
            java.lang.Object r2 = r2.o
            v48 r2 = (defpackage.v48) r2
            voc r2 = r2.n
            java.lang.String r7 = "Periodical screen dimensions check cancelled"
            r2.log(r4, r7)
        L_0x054c:
            java.util.concurrent.CopyOnWriteArraySet r2 = r1.c
            r2.clear()
            r2 = 0
            r1.q = r2
            r1.a()
            mt1 r2 = r1.r
            if (r2 == 0) goto L_0x0579
            mt1 r2 = r1.r
            voc r7 = r2.e
            java.lang.String r8 = "CameraCapturerAdapter"
            r7.log(r8, r6)
            java.util.concurrent.CopyOnWriteArraySet r6 = r2.f
            r6.clear()
            r2.b()
            xga r2 = r2.c
            java.lang.Object r2 = r2.b
            org.webrtc.CameraVideoCapturer r2 = (org.webrtc.CameraVideoCapturer) r2
            r2.dispose()
            r2 = 0
            r1.r = r2
            goto L_0x057a
        L_0x0579:
            r2 = 0
        L_0x057a:
            ngd r6 = r1.t
            if (r6 == 0) goto L_0x0585
            ngd r6 = r1.t
            r6.b()
            r1.t = r2
        L_0x0585:
            lhd r2 = r1.u
            if (r2 == 0) goto L_0x05b4
            lhd r2 = r1.u
            boolean r6 = r2.c
            if (r6 == 0) goto L_0x0591
        L_0x058f:
            r2 = 0
            goto L_0x05b2
        L_0x0591:
            pe6 r6 = r2.w
            if (r6 == 0) goto L_0x059b
            pe6 r6 = r2.w
            r7 = 0
            r6.d(r7)
        L_0x059b:
            rx3 r6 = r2.b
            khd r7 = new khd
            r7.<init>(r2, r5)
            r6.a(r7)
            rx3 r2 = r2.b
            r2.getClass()
            java.lang.Object r2 = r2.d     // Catch:{ InterruptedException -> 0x058f }
            java.util.concurrent.CountDownLatch r2 = (java.util.concurrent.CountDownLatch) r2     // Catch:{ InterruptedException -> 0x058f }
            r2.await()     // Catch:{ InterruptedException -> 0x058f }
            goto L_0x058f
        L_0x05b2:
            r1.u = r2
        L_0x05b4:
            java.lang.String r2 = "releaseScreenCastVideoTrack"
            voc r5 = r1.n
            r5.log(r4, r2)
            fhd r2 = r1.z
            r2.m()
            r1.g()
            n60 r2 = r1.i
            r2.m()
            org.webrtc.MediaStream r2 = r1.h
            r2.dispose()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r5 = ": "
            r2.append(r5)
            org.webrtc.MediaStream r5 = r1.h
            java.lang.String r5 = defpackage.ur9.c(r5)
            r2.append(r5)
            java.lang.String r5 = " was disposed"
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            voc r1 = r1.n
            r1.log(r4, r2)
            voc r1 = r0.Y
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            v48 r4 = r0.x0
            java.lang.String r4 = defpackage.ur9.c(r4)
            r2.append(r4)
            java.lang.String r4 = " was released"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.log(r3, r2)
            r1 = 0
            r0.x0 = r1
        L_0x0610:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b.run():void");
    }

    public /* synthetic */ b(wsb wsb, boolean z) {
        this.a = 13;
        this.b = wsb;
    }
}
