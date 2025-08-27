package defpackage;

import android.view.ViewGroup;

/* renamed from: vj6  reason: default package */
public final class vj6 implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    public /* synthetic */ vj6(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v58, resolved type: xpg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v84, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v33, resolved type: mqg} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v7, types: [buf] */
    /* JADX WARNING: type inference failed for: r1v13, types: [buf] */
    /* JADX WARNING: type inference failed for: r1v42, types: [android.view.ViewGroup$MarginLayoutParams] */
    /* JADX WARNING: type inference failed for: r0v104, types: [zz7, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v83, types: [u57, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v88 */
    /* JADX WARNING: type inference failed for: r1v89 */
    /* JADX WARNING: type inference failed for: r1v90 */
    /* JADX WARNING: type inference failed for: r1v91 */
    /* JADX WARNING: type inference failed for: r1v92 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            r0 = 4
            r1 = 0
            r2 = 1
            r3 = 0
            int r4 = r11.a
            switch(r4) {
                case 0: goto L_0x069e;
                case 1: goto L_0x066b;
                case 2: goto L_0x0659;
                case 3: goto L_0x0639;
                case 4: goto L_0x062d;
                case 5: goto L_0x04fd;
                case 6: goto L_0x04ce;
                case 7: goto L_0x0483;
                case 8: goto L_0x0455;
                case 9: goto L_0x0449;
                case 10: goto L_0x041a;
                case 11: goto L_0x0400;
                case 12: goto L_0x03f2;
                case 13: goto L_0x03e6;
                case 14: goto L_0x03da;
                case 15: goto L_0x03ac;
                case 16: goto L_0x035c;
                case 17: goto L_0x034e;
                case 18: goto L_0x031a;
                case 19: goto L_0x02ec;
                case 20: goto L_0x02c4;
                case 21: goto L_0x02a2;
                case 22: goto L_0x026e;
                case 23: goto L_0x0205;
                case 24: goto L_0x01ec;
                case 25: goto L_0x01d8;
                case 26: goto L_0x0145;
                case 27: goto L_0x00f7;
                case 28: goto L_0x009b;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r4 = r11.b
            rwg r4 = (defpackage.rwg) r4
            bi3 r5 = r4.b
            int r6 = r5.b
            if (r6 != 0) goto L_0x0014
            r3 = r2
        L_0x0014:
            java.lang.Object r11 = r11.c
            yvg r11 = (defpackage.yvg) r11
            if (r3 == 0) goto L_0x0090
            xwg r3 = r4.c
            defpackage.vzg.m(r3)
            bi3 r4 = r3.c
            int r5 = r4.b
            if (r5 != 0) goto L_0x0071
            ce r4 = r11.j
            android.os.IBinder r3 = r3.b
            if (r3 != 0) goto L_0x002c
            goto L_0x0042
        L_0x002c:
            int r1 = defpackage.r4.d
            java.lang.String r1 = "com.google.android.gms.common.internal.IAccountAccessor"
            android.os.IInterface r5 = r3.queryLocalInterface(r1)
            boolean r6 = r5 instanceof defpackage.u57
            if (r6 == 0) goto L_0x003c
            u57 r5 = (defpackage.u57) r5
        L_0x003a:
            r1 = r5
            goto L_0x0042
        L_0x003c:
            o7h r5 = new o7h
            r5.<init>(r3, r1, r2)
            goto L_0x003a
        L_0x0042:
            r4.getClass()
            if (r1 == 0) goto L_0x005c
            java.util.Set r2 = r11.g
            if (r2 != 0) goto L_0x004c
            goto L_0x005c
        L_0x004c:
            r4.o = r1
            r4.v = r2
            boolean r0 = r4.a
            if (r0 == 0) goto L_0x0095
            java.lang.Object r0 = r4.b
            ql r0 = (defpackage.ql) r0
            r0.k(r1, r2)
            goto L_0x0095
        L_0x005c:
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>()
            java.lang.String r2 = "GoogleApiManager"
            java.lang.String r3 = "Received null response from onSignInSuccess"
            android.util.Log.wtf(r2, r3, r1)
            bi3 r1 = new bi3
            r1.<init>(r0)
            r4.t(r1)
            goto L_0x0095
        L_0x0071:
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>()
            java.lang.String r2 = "Sign-in succeeded with resolve account failure: "
            java.lang.String r0 = r2.concat(r0)
            java.lang.String r2 = "SignInCoordinator"
            android.util.Log.wtf(r2, r0, r1)
            ce r0 = r11.j
            r0.t(r4)
            f9e r11 = r11.i
            r11.disconnect()
            goto L_0x009a
        L_0x0090:
            ce r0 = r11.j
            r0.t(r5)
        L_0x0095:
            f9e r11 = r11.i
            r11.disconnect()
        L_0x009a:
            return
        L_0x009b:
            java.lang.Object r0 = r11.c
            ce r0 = (defpackage.ce) r0
            java.lang.Object r4 = r0.w
            ht6 r4 = (defpackage.ht6) r4
            java.util.concurrent.ConcurrentHashMap r4 = r4.X
            java.lang.Object r5 = r0.c
            bm r5 = (defpackage.bm) r5
            java.lang.Object r4 = r4.get(r5)
            kvg r4 = (defpackage.kvg) r4
            if (r4 != 0) goto L_0x00b2
            goto L_0x00f6
        L_0x00b2:
            java.lang.Object r11 = r11.b
            bi3 r11 = (defpackage.bi3) r11
            int r5 = r11.b
            if (r5 != 0) goto L_0x00bb
            r3 = r2
        L_0x00bb:
            if (r3 == 0) goto L_0x00f3
            r0.a = r2
            java.lang.Object r11 = r0.b
            ql r11 = (defpackage.ql) r11
            boolean r2 = r11.j()
            if (r2 == 0) goto L_0x00db
            boolean r1 = r0.a
            if (r1 == 0) goto L_0x00f6
            java.lang.Object r1 = r0.o
            u57 r1 = (defpackage.u57) r1
            if (r1 == 0) goto L_0x00f6
            java.lang.Object r0 = r0.v
            java.util.Set r0 = (java.util.Set) r0
            r11.k(r1, r0)
            goto L_0x00f6
        L_0x00db:
            java.util.Set r0 = r11.a()     // Catch:{ SecurityException -> 0x00e3 }
            r11.k(r1, r0)     // Catch:{ SecurityException -> 0x00e3 }
            goto L_0x00f6
        L_0x00e3:
            java.lang.String r0 = "Failed to get service from broker."
            r11.b(r0)
            bi3 r11 = new bi3
            r0 = 10
            r11.<init>(r0)
            r4.m(r11, r1)
            goto L_0x00f6
        L_0x00f3:
            r4.m(r11, r1)
        L_0x00f6:
            return
        L_0x00f7:
            java.lang.String r0 = "Starting work for "
            java.lang.Object r1 = r11.c
            mqg r1 = (defpackage.mqg) r1
            cyd r1 = r1.z0
            java.lang.Object r1 = r1.a
            boolean r1 = r1 instanceof defpackage.u0
            if (r1 == 0) goto L_0x0106
            goto L_0x0144
        L_0x0106:
            java.lang.Object r1 = r11.b     // Catch:{ all -> 0x013a }
            zz7 r1 = (defpackage.zz7) r1     // Catch:{ all -> 0x013a }
            r1.get()     // Catch:{ all -> 0x013a }
            h88 r1 = defpackage.h88.x()     // Catch:{ all -> 0x013a }
            java.lang.String r2 = defpackage.mqg.B0     // Catch:{ all -> 0x013a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x013a }
            r3.<init>(r0)     // Catch:{ all -> 0x013a }
            java.lang.Object r0 = r11.c     // Catch:{ all -> 0x013a }
            mqg r0 = (defpackage.mqg) r0     // Catch:{ all -> 0x013a }
            xpg r0 = r0.v     // Catch:{ all -> 0x013a }
            java.lang.String r0 = r0.c     // Catch:{ all -> 0x013a }
            r3.append(r0)     // Catch:{ all -> 0x013a }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x013a }
            r1.p(r2, r0)     // Catch:{ all -> 0x013a }
            java.lang.Object r0 = r11.c     // Catch:{ all -> 0x013a }
            mqg r0 = (defpackage.mqg) r0     // Catch:{ all -> 0x013a }
            cyd r1 = r0.z0     // Catch:{ all -> 0x013a }
            e08 r0 = r0.w     // Catch:{ all -> 0x013a }
            zz7 r0 = r0.startWork()     // Catch:{ all -> 0x013a }
            r1.l(r0)     // Catch:{ all -> 0x013a }
            goto L_0x0144
        L_0x013a:
            r0 = move-exception
            java.lang.Object r11 = r11.c
            mqg r11 = (defpackage.mqg) r11
            cyd r11 = r11.z0
            r11.k(r0)
        L_0x0144:
            return
        L_0x0145:
            java.lang.String r0 = "Updating notification for "
            java.lang.String r1 = "Worker was marked important ("
            java.lang.Object r2 = r11.c
            uog r2 = (defpackage.uog) r2
            cyd r2 = r2.a
            java.lang.Object r2 = r2.a
            boolean r2 = r2 instanceof defpackage.u0
            if (r2 == 0) goto L_0x0157
            goto L_0x01d7
        L_0x0157:
            java.lang.Object r2 = r11.b     // Catch:{ all -> 0x01ad }
            cyd r2 = (defpackage.cyd) r2     // Catch:{ all -> 0x01ad }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x01ad }
            r7 = r2
            o96 r7 = (defpackage.o96) r7     // Catch:{ all -> 0x01ad }
            if (r7 == 0) goto L_0x01af
            h88 r1 = defpackage.h88.x()     // Catch:{ all -> 0x01ad }
            java.lang.String r2 = defpackage.uog.x     // Catch:{ all -> 0x01ad }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ad }
            r3.<init>(r0)     // Catch:{ all -> 0x01ad }
            java.lang.Object r0 = r11.c     // Catch:{ all -> 0x01ad }
            uog r0 = (defpackage.uog) r0     // Catch:{ all -> 0x01ad }
            xpg r0 = r0.c     // Catch:{ all -> 0x01ad }
            java.lang.String r0 = r0.c     // Catch:{ all -> 0x01ad }
            r3.append(r0)     // Catch:{ all -> 0x01ad }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x01ad }
            r1.p(r2, r0)     // Catch:{ all -> 0x01ad }
            java.lang.Object r0 = r11.c     // Catch:{ all -> 0x01ad }
            uog r0 = (defpackage.uog) r0     // Catch:{ all -> 0x01ad }
            cyd r1 = r0.a     // Catch:{ all -> 0x01ad }
            r96 r2 = r0.v     // Catch:{ all -> 0x01ad }
            android.content.Context r8 = r0.b     // Catch:{ all -> 0x01ad }
            e08 r0 = r0.o     // Catch:{ all -> 0x01ad }
            java.util.UUID r6 = r0.getId()     // Catch:{ all -> 0x01ad }
            vog r2 = (defpackage.vog) r2     // Catch:{ all -> 0x01ad }
            r2.getClass()     // Catch:{ all -> 0x01ad }
            cyd r0 = new cyd     // Catch:{ all -> 0x01ad }
            r0.<init>()     // Catch:{ all -> 0x01ad }
            sm8 r10 = new sm8     // Catch:{ all -> 0x01ad }
            r9 = 2
            r3 = r10
            r4 = r2
            r5 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x01ad }
            wdf r2 = r2.a     // Catch:{ all -> 0x01ad }
            r2.h(r10)     // Catch:{ all -> 0x01ad }
            r1.l(r0)     // Catch:{ all -> 0x01ad }
            goto L_0x01d7
        L_0x01ad:
            r0 = move-exception
            goto L_0x01ce
        L_0x01af:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ad }
            r0.<init>(r1)     // Catch:{ all -> 0x01ad }
            java.lang.Object r1 = r11.c     // Catch:{ all -> 0x01ad }
            uog r1 = (defpackage.uog) r1     // Catch:{ all -> 0x01ad }
            xpg r1 = r1.c     // Catch:{ all -> 0x01ad }
            java.lang.String r1 = r1.c     // Catch:{ all -> 0x01ad }
            r0.append(r1)     // Catch:{ all -> 0x01ad }
            java.lang.String r1 = ") but did not provide ForegroundInfo"
            r0.append(r1)     // Catch:{ all -> 0x01ad }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01ad }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01ad }
            r1.<init>(r0)     // Catch:{ all -> 0x01ad }
            throw r1     // Catch:{ all -> 0x01ad }
        L_0x01ce:
            java.lang.Object r11 = r11.c
            uog r11 = (defpackage.uog) r11
            cyd r11 = r11.a
            r11.k(r0)
        L_0x01d7:
            return
        L_0x01d8:
            java.lang.Object r0 = r11.b
            tqf r0 = (defpackage.tqf) r0
            r0.o = r2
            java.lang.Object r0 = r11.c
            uqf r0 = (defpackage.uqf) r0
            java.util.concurrent.PriorityBlockingQueue r0 = r0.a
            java.lang.Object r11 = r11.b
            tqf r11 = (defpackage.tqf) r11
            r0.remove(r11)
            return
        L_0x01ec:
            java.lang.Object r0 = r11.b
            rdf r0 = (defpackage.rdf) r0
            java.lang.Object r11 = r11.c     // Catch:{ CancellationException -> 0x0201, Exception -> 0x01fc }
            java.util.concurrent.Callable r11 = (java.util.concurrent.Callable) r11     // Catch:{ CancellationException -> 0x0201, Exception -> 0x01fc }
            java.lang.Object r11 = r11.call()     // Catch:{ CancellationException -> 0x0201, Exception -> 0x01fc }
            r0.c(r11)     // Catch:{ CancellationException -> 0x0201, Exception -> 0x01fc }
            goto L_0x0204
        L_0x01fc:
            r11 = move-exception
            r0.b(r11)
            goto L_0x0204
        L_0x0201:
            r0.a()
        L_0x0204:
            return
        L_0x0205:
            java.lang.Object r0 = r11.c
            e7f r0 = (defpackage.e7f) r0
            dpg r0 = r0.a
            rvb r0 = r0.f
            java.lang.Object r2 = r11.b
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r0.Z
            monitor-enter(r3)
            java.util.HashMap r4 = r0.w     // Catch:{ all -> 0x0228 }
            java.lang.Object r4 = r4.get(r2)     // Catch:{ all -> 0x0228 }
            mqg r4 = (defpackage.mqg) r4     // Catch:{ all -> 0x0228 }
            if (r4 != 0) goto L_0x022a
            java.util.HashMap r0 = r0.x     // Catch:{ all -> 0x0228 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0228 }
            r4 = r0
            mqg r4 = (defpackage.mqg) r4     // Catch:{ all -> 0x0228 }
            goto L_0x022a
        L_0x0228:
            r11 = move-exception
            goto L_0x026c
        L_0x022a:
            if (r4 == 0) goto L_0x0230
            xpg r1 = r4.v     // Catch:{ all -> 0x0228 }
            monitor-exit(r3)     // Catch:{ all -> 0x0228 }
            goto L_0x0231
        L_0x0230:
            monitor-exit(r3)     // Catch:{ all -> 0x0228 }
        L_0x0231:
            if (r1 == 0) goto L_0x026b
            boolean r0 = r1.c()
            if (r0 == 0) goto L_0x026b
            java.lang.Object r0 = r11.c
            e7f r0 = (defpackage.e7f) r0
            java.lang.Object r0 = r0.c
            monitor-enter(r0)
            java.lang.Object r2 = r11.c     // Catch:{ all -> 0x0268 }
            e7f r2 = (defpackage.e7f) r2     // Catch:{ all -> 0x0268 }
            java.util.HashMap r2 = r2.w     // Catch:{ all -> 0x0268 }
            wog r3 = new wog     // Catch:{ all -> 0x0268 }
            java.lang.String r4 = r1.a     // Catch:{ all -> 0x0268 }
            int r5 = r1.t     // Catch:{ all -> 0x0268 }
            r3.<init>(r4, r5)     // Catch:{ all -> 0x0268 }
            r2.put(r3, r1)     // Catch:{ all -> 0x0268 }
            java.lang.Object r2 = r11.c     // Catch:{ all -> 0x0268 }
            e7f r2 = (defpackage.e7f) r2     // Catch:{ all -> 0x0268 }
            java.util.HashSet r2 = r2.x     // Catch:{ all -> 0x0268 }
            r2.add(r1)     // Catch:{ all -> 0x0268 }
            java.lang.Object r11 = r11.c     // Catch:{ all -> 0x0268 }
            e7f r11 = (defpackage.e7f) r11     // Catch:{ all -> 0x0268 }
            d19 r1 = r11.y     // Catch:{ all -> 0x0268 }
            java.util.HashSet r11 = r11.x     // Catch:{ all -> 0x0268 }
            r1.D(r11)     // Catch:{ all -> 0x0268 }
            monitor-exit(r0)     // Catch:{ all -> 0x0268 }
            goto L_0x026b
        L_0x0268:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0268 }
            throw r11
        L_0x026b:
            return
        L_0x026c:
            monitor-exit(r3)     // Catch:{ all -> 0x0228 }
            throw r11
        L_0x026e:
            java.lang.Object r0 = r11.b
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r0 = (one.me.sdk.lists.widgets.EndlessRecyclerView2) r0
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            if (r1 == 0) goto L_0x029a
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            kotlin.reflect.KProperty[] r2 = one.me.stickerssearch.StickersSearchScreen.X
            java.lang.Object r11 = r11.c
            one.me.stickerssearch.StickersSearchScreen r11 = (one.me.stickerssearch.StickersSearchScreen) r11
            r11.getClass()
            kotlin.reflect.KProperty[] r2 = one.me.stickerssearch.StickersSearchScreen.X
            r3 = 2
            r2 = r2[r3]
            kotlin.properties.ReadOnlyProperty r3 = r11.w
            java.lang.Object r11 = r3.getValue(r11, r2)
            pza r11 = (defpackage.pza) r11
            int r11 = r11.getMeasuredHeight()
            r1.topMargin = r11
            r0.setLayoutParams(r1)
            return
        L_0x029a:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            r11.<init>(r0)
            throw r11
        L_0x02a2:
            kotlin.reflect.KProperty[] r0 = one.me.stickerssettings.stickersscreen.StickersScreen.Y
            java.lang.Object r0 = r11.c
            one.me.stickerssettings.stickersscreen.StickersScreen r0 = (one.me.stickerssettings.stickersscreen.StickersScreen) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.c0()
            java.lang.Object r11 = r11.b
            android.view.View r11 = (android.view.View) r11
            int r11 = r11.getMeasuredHeight()
            int r1 = r0.getPaddingLeft()
            int r2 = r0.getPaddingRight()
            int r3 = r0.getPaddingBottom()
            r0.setPadding(r1, r11, r2, r3)
            return
        L_0x02c4:
            java.lang.Object r0 = r11.b
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
        L_0x02cc:
            if (r3 >= r1) goto L_0x02eb
            java.lang.Object r4 = r0.get(r3)
            android.view.View r4 = (android.view.View) r4
            java.util.WeakHashMap r5 = defpackage.gag.a
            java.lang.String r5 = defpackage.v9g.k(r4)
            java.lang.Object r6 = r11.c
            j6e r6 = (defpackage.j6e) r6
            ts r6 = r6.x
            java.lang.Object r5 = r6.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            defpackage.v9g.v(r4, r5)
            int r3 = r3 + r2
            goto L_0x02cc
        L_0x02eb:
            return
        L_0x02ec:
            java.lang.Object r0 = r11.c     // Catch:{ all -> 0x0306 }
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch:{ all -> 0x0306 }
            r0.run()     // Catch:{ all -> 0x0306 }
            java.lang.Object r0 = r11.b
            qn r0 = (defpackage.qn) r0
            java.lang.Object r0 = r0.v
            monitor-enter(r0)
            java.lang.Object r11 = r11.b     // Catch:{ all -> 0x0303 }
            qn r11 = (defpackage.qn) r11     // Catch:{ all -> 0x0303 }
            r11.a()     // Catch:{ all -> 0x0303 }
            monitor-exit(r0)     // Catch:{ all -> 0x0303 }
            return
        L_0x0303:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0303 }
            throw r11
        L_0x0306:
            r0 = move-exception
            java.lang.Object r1 = r11.b
            qn r1 = (defpackage.qn) r1
            java.lang.Object r1 = r1.v
            monitor-enter(r1)
            java.lang.Object r11 = r11.b     // Catch:{ all -> 0x0317 }
            qn r11 = (defpackage.qn) r11     // Catch:{ all -> 0x0317 }
            r11.a()     // Catch:{ all -> 0x0317 }
            monitor-exit(r1)     // Catch:{ all -> 0x0317 }
            throw r0
        L_0x0317:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0317 }
            throw r11
        L_0x031a:
            java.lang.Object r0 = r11.b
            kw1 r0 = (defpackage.kw1) r0
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch:{ all -> 0x0330 }
            java.lang.Object r11 = r11.c     // Catch:{ all -> 0x0330 }
            zz7 r11 = (defpackage.zz7) r11     // Catch:{ all -> 0x0330 }
            java.lang.Object r11 = r11.get()     // Catch:{ all -> 0x0330 }
            java.lang.Object r11 = kotlin.Result.m23constructorimpl(r11)     // Catch:{ all -> 0x0330 }
            r0.resumeWith(r11)     // Catch:{ all -> 0x0330 }
            goto L_0x034d
        L_0x0330:
            r11 = move-exception
            java.lang.Throwable r1 = r11.getCause()
            if (r1 != 0) goto L_0x0338
            r1 = r11
        L_0x0338:
            boolean r11 = r11 instanceof java.util.concurrent.CancellationException
            if (r11 == 0) goto L_0x0340
            r0.q(r1)
            goto L_0x034d
        L_0x0340:
            kotlin.Result$Companion r11 = kotlin.Result.Companion
            java.lang.Object r11 = kotlin.ResultKt.createFailure(r1)
            java.lang.Object r11 = kotlin.Result.m23constructorimpl(r11)
            r0.resumeWith(r11)
        L_0x034d:
            return
        L_0x034e:
            java.lang.Object r0 = r11.b
            q04 r0 = (defpackage.q04) r0
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            java.lang.Object r11 = r11.c
            kw1 r11 = (defpackage.kw1) r11
            r11.i(r0, r1)
            return
        L_0x035c:
            kotlin.reflect.KProperty[] r2 = one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget.v0
            java.lang.Object r2 = r11.b
            one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget r2 = (one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget) r2
            r2.getClass()
            kotlin.reflect.KProperty[] r4 = one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget.v0
            r0 = r4[r0]
            kotlin.properties.ReadOnlyProperty r4 = r2.z
            java.lang.Object r0 = r4.getValue(r2, r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            java.lang.Object r11 = r11.c
            one.me.sdk.uikit.common.button.OneMeButton r11 = (one.me.sdk.uikit.common.button.OneMeButton) r11
            int r2 = r11.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r4 = r11.getLayoutParams()
            boolean r5 = r4 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r5 == 0) goto L_0x0384
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            goto L_0x0385
        L_0x0384:
            r4 = r1
        L_0x0385:
            if (r4 == 0) goto L_0x038a
            int r4 = r4.bottomMargin
            goto L_0x038b
        L_0x038a:
            r4 = r3
        L_0x038b:
            int r2 = r2 + r4
            android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
            boolean r4 = r11 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r4 == 0) goto L_0x0397
            r1 = r11
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
        L_0x0397:
            if (r1 == 0) goto L_0x039b
            int r3 = r1.topMargin
        L_0x039b:
            int r2 = r2 + r3
            int r11 = r0.getPaddingLeft()
            int r1 = r0.getPaddingTop()
            int r3 = r0.getPaddingRight()
            r0.setPadding(r11, r1, r3, r2)
            return
        L_0x03ac:
            kotlin.reflect.KProperty[] r0 = one.me.profileedit.screens.changelink.ProfileChangeLinkScreen.Y
            java.lang.Object r0 = r11.c
            one.me.profileedit.screens.changelink.ProfileChangeLinkScreen r0 = (one.me.profileedit.screens.changelink.ProfileChangeLinkScreen) r0
            r0.getClass()
            kotlin.reflect.KProperty[] r1 = one.me.profileedit.screens.changelink.ProfileChangeLinkScreen.Y
            r2 = 5
            r1 = r1[r2]
            kotlin.properties.ReadOnlyProperty r2 = r0.X
            java.lang.Object r0 = r2.getValue(r0, r1)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            java.lang.Object r11 = r11.b
            android.view.View r11 = (android.view.View) r11
            int r11 = r11.getMeasuredHeight()
            int r1 = r0.getPaddingLeft()
            int r2 = r0.getPaddingRight()
            int r3 = r0.getPaddingBottom()
            r0.setPadding(r1, r11, r2, r3)
            return
        L_0x03da:
            java.lang.Object r0 = r11.b
            e1b r0 = (defpackage.e1b) r0
            java.lang.Object r11 = r11.c
            java.lang.Runnable r11 = (java.lang.Runnable) r11
            r0.removeCallbacks(r11)
            return
        L_0x03e6:
            java.lang.Object r0 = r11.b
            one.me.sdk.uikit.common.views.OneMeDraweeView r0 = (one.me.sdk.uikit.common.views.OneMeDraweeView) r0
            java.lang.Object r11 = r11.c
            android.graphics.drawable.Drawable r11 = (android.graphics.drawable.Drawable) r11
            defpackage.vj6.super.invalidateDrawable(r11)
            return
        L_0x03f2:
            java.lang.Object r0 = r11.c
            pka r0 = (defpackage.pka) r0
            oka r0 = r0.a
            java.lang.Object r11 = r11.b
            ao1 r11 = (defpackage.ao1) r11
            r0.a(r11)
            return
        L_0x0400:
            java.lang.Object r0 = r11.c
            dia r0 = (defpackage.dia) r0
            cla r1 = r0.a     // Catch:{ all -> 0x0413 }
            java.lang.Object r11 = r11.b     // Catch:{ all -> 0x0413 }
            java.lang.Throwable r11 = (java.lang.Throwable) r11     // Catch:{ all -> 0x0413 }
            r1.onError(r11)     // Catch:{ all -> 0x0413 }
            jfd r11 = r0.o
            r11.dispose()
            return
        L_0x0413:
            r11 = move-exception
            jfd r0 = r0.o
            r0.dispose()
            throw r11
        L_0x041a:
            java.lang.Object r0 = r11.b
            um8 r0 = (defpackage.um8) r0
            vm8 r0 = (defpackage.vm8) r0
            android.os.Messenger r0 = r0.a
            android.os.IBinder r0 = r0.getBinder()
            java.lang.Object r11 = r11.c
            er7 r11 = (defpackage.er7) r11
            java.lang.Object r11 = r11.b
            sy8 r11 = (defpackage.sy8) r11
            ts r11 = r11.v
            java.lang.Object r11 = r11.remove(r0)
            mm8 r11 = (defpackage.mm8) r11
            if (r11 == 0) goto L_0x0448
            um8 r0 = r11.e
            r0.getClass()
            vm8 r0 = (defpackage.vm8) r0
            android.os.Messenger r0 = r0.a
            android.os.IBinder r0 = r0.getBinder()
            r0.unlinkToDeath(r11, r3)
        L_0x0448:
            return
        L_0x0449:
            java.lang.Object r0 = r11.c
            ti8 r0 = (defpackage.ti8) r0
            java.lang.Object r11 = r11.b
            pi8 r11 = (defpackage.pi8) r11
            r0.a(r11)
            return
        L_0x0455:
            java.lang.Object r0 = r11.b     // Catch:{ all -> 0x045d }
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch:{ all -> 0x045d }
            r0.run()     // Catch:{ all -> 0x045d }
            goto L_0x0463
        L_0x045d:
            r0 = move-exception
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            defpackage.u04.a(r0, r1)
        L_0x0463:
            java.lang.Object r0 = r11.c
            qv7 r0 = (defpackage.qv7) r0
            java.lang.Runnable r1 = r0.t0()
            if (r1 != 0) goto L_0x046e
            goto L_0x0482
        L_0x046e:
            r11.b = r1
            int r3 = r3 + r2
            r1 = 16
            if (r3 < r1) goto L_0x0455
            q04 r1 = r0.c
            boolean r1 = r1.r0(r0)
            if (r1 == 0) goto L_0x0455
            q04 r1 = r0.c
            r1.p0(r0, r11)
        L_0x0482:
            return
        L_0x0483:
            java.lang.Object r0 = r11.c
            yl7 r0 = (defpackage.yl7) r0
            androidx.recyclerview.widget.RecyclerView r1 = r0.A0
            if (r1 == 0) goto L_0x04cd
            boolean r1 = r1.E0
            if (r1 == 0) goto L_0x04cd
            java.lang.Object r1 = r11.b
            ul7 r1 = (defpackage.ul7) r1
            boolean r4 = r1.Y
            if (r4 != 0) goto L_0x04cd
            pzc r1 = r1.v
            int r1 = r1.p()
            r4 = -1
            if (r1 == r4) goto L_0x04cd
            androidx.recyclerview.widget.RecyclerView r1 = r0.A0
            yyc r1 = r1.getItemAnimator()
            if (r1 == 0) goto L_0x04ae
            boolean r1 = r1.n()
            if (r1 != 0) goto L_0x04c0
        L_0x04ae:
            java.util.ArrayList r1 = r0.y0
            int r4 = r1.size()
        L_0x04b4:
            if (r3 >= r4) goto L_0x04c8
            java.lang.Object r5 = r1.get(r3)
            ul7 r5 = (defpackage.ul7) r5
            boolean r5 = r5.Z
            if (r5 != 0) goto L_0x04c6
        L_0x04c0:
            androidx.recyclerview.widget.RecyclerView r0 = r0.A0
            r0.post(r11)
            goto L_0x04cd
        L_0x04c6:
            int r3 = r3 + r2
            goto L_0x04b4
        L_0x04c8:
            xl7 r11 = r0.v0
            r11.getClass()
        L_0x04cd:
            return
        L_0x04ce:
            java.lang.Object r0 = r11.c
            hk6 r0 = (defpackage.hk6) r0
            fk6 r1 = r0.a
            java.lang.Object r11 = r11.b
            fk6 r11 = (defpackage.fk6) r11
            r0.a = r11
            if (r1 == 0) goto L_0x04e3
            r1.h = r3
            int r11 = r1.d
            android.opengl.GLES20.glDeleteProgram(r11)
        L_0x04e3:
            fk6 r11 = r0.a
            boolean r1 = r11.h
            if (r1 != 0) goto L_0x04ec
            r11.a()
        L_0x04ec:
            fk6 r11 = r0.a
            int r11 = r11.d
            android.opengl.GLES20.glUseProgram(r11)
            fk6 r11 = r0.a
            int r1 = r0.x
            int r0 = r0.y
            r11.b(r1, r0)
            return
        L_0x04fd:
            java.lang.Object r0 = r11.b
            m56 r0 = (defpackage.m56) r0
            r0.getClass()
            java.lang.Object r11 = r11.c
            tf6 r11 = (defpackage.tf6) r11
            boolean r4 = r11 instanceof defpackage.k56
            java.lang.Object r5 = r0.c
            ru.ok.messages.settings.folders.tutor.FolderTutorLayout r5 = (ru.ok.messages.settings.folders.tutor.FolderTutorLayout) r5
            java.lang.Object r6 = r0.d
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            if (r4 == 0) goto L_0x0552
            pzc r11 = r6.M(r3)
            boolean r3 = r11 instanceof defpackage.buf
            if (r3 == 0) goto L_0x051f
            r1 = r11
            buf r1 = (defpackage.buf) r1
        L_0x051f:
            if (r1 == 0) goto L_0x052b
            android.view.View r11 = r1.o()
            android.graphics.Rect r11 = defpackage.rcg.c(r11, r5)
            if (r11 != 0) goto L_0x0530
        L_0x052b:
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
        L_0x0530:
            if (r1 == 0) goto L_0x0538
            android.graphics.Rect r1 = r1.g(r5)
            if (r1 != 0) goto L_0x053d
        L_0x0538:
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
        L_0x053d:
            java.lang.Object r3 = r0.g
            kotlin.Lazy r3 = (kotlin.Lazy) r3
            java.lang.Object r3 = r3.getValue()
            android.text.StaticLayout r3 = (android.text.StaticLayout) r3
            g56 r4 = defpackage.g56.a
            h56 r11 = r0.n(r11, r1, r3)
            java.util.List r11 = kotlin.collections.CollectionsKt.listOf(r11)
            goto L_0x0593
        L_0x0552:
            boolean r11 = r11 instanceof defpackage.j56
            if (r11 == 0) goto L_0x0627
            pzc r11 = r6.M(r2)
            boolean r3 = r11 instanceof defpackage.buf
            if (r3 == 0) goto L_0x0561
            r1 = r11
            buf r1 = (defpackage.buf) r1
        L_0x0561:
            if (r1 == 0) goto L_0x056d
            android.view.View r11 = r1.o()
            android.graphics.Rect r11 = defpackage.rcg.c(r11, r5)
            if (r11 != 0) goto L_0x0572
        L_0x056d:
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
        L_0x0572:
            if (r1 == 0) goto L_0x057a
            android.graphics.Rect r1 = r1.g(r5)
            if (r1 != 0) goto L_0x057f
        L_0x057a:
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
        L_0x057f:
            java.lang.Object r3 = r0.h
            kotlin.Lazy r3 = (kotlin.Lazy) r3
            java.lang.Object r3 = r3.getValue()
            android.text.StaticLayout r3 = (android.text.StaticLayout) r3
            g56 r4 = defpackage.g56.a
            h56 r11 = r0.n(r11, r1, r3)
            java.util.List r11 = kotlin.collections.CollectionsKt.listOf(r11)
        L_0x0593:
            r5.v = r11
            r5.w = r2
            android.graphics.Path r0 = r5.c
            r0.reset()
            android.graphics.Path r1 = r5.o
            r1.reset()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
        L_0x05a7:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto L_0x0623
            java.lang.Object r3 = r11.next()
            h56 r3 = (defpackage.h56) r3
            g56 r4 = r3.c
            int r4 = r4.ordinal()
            r6 = 1073741824(0x40000000, float:2.0)
            android.graphics.Rect r7 = r3.b
            if (r4 == 0) goto L_0x05db
            if (r4 != r2) goto L_0x05d5
            float r4 = r7.exactCenterX()
            float r8 = r7.exactCenterY()
            int r7 = r7.width()
            float r7 = (float) r7
            float r7 = r7 / r6
            android.graphics.Path$Direction r9 = android.graphics.Path.Direction.CW
            r0.addCircle(r4, r8, r7, r9)
            goto L_0x05e5
        L_0x05d5:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        L_0x05db:
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>(r7)
            android.graphics.Path$Direction r7 = android.graphics.Path.Direction.CCW
            r0.addRect(r4, r7)
        L_0x05e5:
            a20 r3 = r3.d
            float r4 = r3.b
            float r7 = r3.c
            r1.moveTo(r4, r7)
            android.graphics.PointF r4 = new android.graphics.PointF
            float r8 = r3.d
            r4.<init>(r8, r7)
            float r9 = r4.x
            float r4 = r4.y
            float r3 = r3.e
            r1.quadTo(r9, r4, r8, r3)
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            r4 = 0
            r7 = 1103626240(0x41c80000, float:25.0)
            r8 = -1043857408(0xffffffffc1c80000, float:-25.0)
            if (r3 <= 0) goto L_0x0614
            r1.rMoveTo(r4, r6)
            r1.rLineTo(r8, r7)
            r1.rMoveTo(r7, r8)
            r1.rLineTo(r7, r7)
            goto L_0x05a7
        L_0x0614:
            r3 = -1073741824(0xffffffffc0000000, float:-2.0)
            r1.rMoveTo(r4, r3)
            r1.rLineTo(r7, r8)
            r1.rMoveTo(r8, r7)
            r1.rLineTo(r8, r8)
            goto L_0x05a7
        L_0x0623:
            r5.invalidate()
            return
        L_0x0627:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        L_0x062d:
            java.lang.Object r0 = r11.b
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.Object r11 = r11.c
            bq5 r11 = (defpackage.bq5) r11
            defpackage.wgf.c(r0, r11)
            return
        L_0x0639:
            java.lang.Object r0 = r11.b
            z65 r0 = (defpackage.z65) r0
            java.lang.Object r1 = r0.b
            java.util.concurrent.atomic.AtomicBoolean r1 = (java.util.concurrent.atomic.AtomicBoolean) r1
            boolean r1 = r1.compareAndSet(r2, r3)
            if (r1 == 0) goto L_0x0658
            java.lang.Object r11 = r11.c
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r11 = (one.me.sdk.lists.widgets.EndlessRecyclerView2) r11
            r11.a0()
            cf r1 = new cf
            r2 = 20
            r1.<init>(r2, r0)
            r11.post(r1)
        L_0x0658:
            return
        L_0x0659:
            java.lang.Object r0 = r11.b
            syc r0 = (defpackage.syc) r0
            java.lang.Object r0 = r0.b
            vzg r0 = (defpackage.vzg) r0
            if (r0 == 0) goto L_0x066a
            java.lang.Object r11 = r11.c
            android.graphics.Typeface r11 = (android.graphics.Typeface) r11
            r0.A(r11)
        L_0x066a:
            return
        L_0x066b:
            java.lang.Object r0 = r11.c
            w7 r0 = (defpackage.w7) r0
            m69 r2 = r0.c
            if (r2 == 0) goto L_0x067a
            k69 r4 = r2.v
            if (r4 == 0) goto L_0x067a
            r4.o(r2)
        L_0x067a:
            l79 r2 = r0.y
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L_0x069b
            android.os.IBinder r2 = r2.getWindowToken()
            if (r2 == 0) goto L_0x069b
            java.lang.Object r11 = r11.b
            t7 r11 = (defpackage.t7) r11
            boolean r2 = r11.b()
            if (r2 == 0) goto L_0x0691
            goto L_0x0699
        L_0x0691:
            android.view.View r2 = r11.f
            if (r2 != 0) goto L_0x0696
            goto L_0x069b
        L_0x0696:
            r11.d(r3, r3, r3, r3)
        L_0x0699:
            r0.B0 = r11
        L_0x069b:
            r0.D0 = r1
            return
        L_0x069e:
            java.lang.Object r0 = r11.c
            nj6 r0 = (defpackage.nj6) r0
            java.lang.Object r11 = r11.b     // Catch:{ ExecutionException -> 0x06b0, Error | RuntimeException -> 0x06ae }
            java.util.concurrent.Future r11 = (java.util.concurrent.Future) r11     // Catch:{ ExecutionException -> 0x06b0, Error | RuntimeException -> 0x06ae }
            java.lang.Object r11 = defpackage.hd8.y(r11)     // Catch:{ ExecutionException -> 0x06b0, Error | RuntimeException -> 0x06ae }
            r0.a(r11)
            goto L_0x06c3
        L_0x06ae:
            r11 = move-exception
            goto L_0x06b2
        L_0x06b0:
            r11 = move-exception
            goto L_0x06b6
        L_0x06b2:
            r0.g(r11)
            goto L_0x06c3
        L_0x06b6:
            java.lang.Throwable r1 = r11.getCause()
            if (r1 != 0) goto L_0x06c0
            r0.g(r11)
            goto L_0x06c3
        L_0x06c0:
            r0.g(r1)
        L_0x06c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vj6.run():void");
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return vj6.class.getSimpleName() + "," + ((nj6) this.c);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ vj6(ViewGroup viewGroup, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ vj6(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public vj6(yl7 yl7, ul7 ul7, int i) {
        this.a = 7;
        this.c = yl7;
        this.b = ul7;
    }
}
