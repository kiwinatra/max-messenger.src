package defpackage;

/* renamed from: ne4  reason: default package */
public final /* synthetic */ class ne4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ne4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:75|74|93|94|202|84) */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0196, code lost:
        r0 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x01d0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r22 = this;
            r0 = r22
            r1 = 0
            r3 = 2
            r4 = 1
            int r5 = r0.a
            switch(r5) {
                case 0: goto L_0x042c;
                case 1: goto L_0x0423;
                case 2: goto L_0x039c;
                case 3: goto L_0x0394;
                case 4: goto L_0x0389;
                case 5: goto L_0x0381;
                case 6: goto L_0x0378;
                case 7: goto L_0x0302;
                case 8: goto L_0x02fa;
                case 9: goto L_0x02ea;
                case 10: goto L_0x02df;
                case 11: goto L_0x02bc;
                case 12: goto L_0x02b4;
                case 13: goto L_0x02ac;
                case 14: goto L_0x02a4;
                case 15: goto L_0x029c;
                case 16: goto L_0x0241;
                case 17: goto L_0x0209;
                case 18: goto L_0x0201;
                case 19: goto L_0x01f9;
                case 20: goto L_0x00bd;
                case 21: goto L_0x00b3;
                case 22: goto L_0x009f;
                case 23: goto L_0x0078;
                case 24: goto L_0x006e;
                case 25: goto L_0x005b;
                case 26: goto L_0x0047;
                case 27: goto L_0x003f;
                case 28: goto L_0x0026;
                default: goto L_0x000a;
            }
        L_0x000a:
            kotlin.reflect.KProperty[] r1 = one.me.folders.pickerfolders.FoldersPickerScreen.z
            java.lang.Object r0 = r0.b
            one.me.folders.pickerfolders.FoldersPickerScreen r0 = (one.me.folders.pickerfolders.FoldersPickerScreen) r0
            android.view.View r1 = r0.getView()
            if (r1 == 0) goto L_0x0025
            kotlin.reflect.KProperty[] r1 = one.me.folders.pickerfolders.FoldersPickerScreen.z
            r1 = r1[r4]
            kotlin.properties.ReadOnlyProperty r2 = r0.v
            java.lang.Object r0 = r2.getValue(r0, r1)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r0.a0()
        L_0x0025:
            return
        L_0x0026:
            kotlin.reflect.KProperty[] r2 = one.me.folders.list.FoldersListScreen.x
            java.lang.Object r0 = r0.b
            one.me.folders.list.FoldersListScreen r0 = (one.me.folders.list.FoldersListScreen) r0
            r0.getClass()
            kotlin.reflect.KProperty[] r2 = one.me.folders.list.FoldersListScreen.x
            r1 = r2[r1]
            kotlin.properties.ReadOnlyProperty r2 = r0.w
            java.lang.Object r0 = r2.getValue(r0, r1)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r0.a0()
            return
        L_0x003f:
            java.lang.Object r0 = r0.b
            ru.ok.messages.settings.folders.edit.presentation.FolderEditFragment r0 = (ru.ok.messages.settings.folders.edit.presentation.FolderEditFragment) r0
            r0.m3()
            return
        L_0x0047:
            int r1 = ru.ok.messages.video.widgets.FloatingVideoView.C0
            java.lang.Object r0 = r0.b
            ru.ok.messages.video.widgets.FloatingVideoView r0 = (ru.ok.messages.video.widgets.FloatingVideoView) r0
            android.os.IBinder r1 = r0.getWindowToken()
            if (r1 == 0) goto L_0x005a
            android.view.WindowManager$LayoutParams r1 = r0.z0
            android.view.WindowManager r2 = r0.x
            r2.updateViewLayout(r0, r1)
        L_0x005a:
            return
        L_0x005b:
            java.lang.Object r0 = r0.b
            ur5 r0 = (defpackage.ur5) r0
            androidx.recyclerview.widget.RecyclerView r1 = r0.z
            if (r1 == 0) goto L_0x0066
            r1.a0()
        L_0x0066:
            androidx.recyclerview.widget.RecyclerView r0 = r0.z
            if (r0 == 0) goto L_0x006d
            r0.postInvalidate()
        L_0x006d:
            return
        L_0x006e:
            kotlin.reflect.KProperty[] r1 = one.me.inappreview.ui.FakeInAppReviewBottomSheet.F0
            java.lang.Object r0 = r0.b
            one.me.inappreview.ui.FakeInAppReviewBottomSheet r0 = (one.me.inappreview.ui.FakeInAppReviewBottomSheet) r0
            r0.i0(r4)
            return
        L_0x0078:
            java.lang.Object r0 = r0.b
            ag5 r0 = (defpackage.ag5) r0
            o9e r1 = r0.f
            n9e r0 = r0.e     // Catch:{ all -> 0x0094 }
            r1.getClass()     // Catch:{ all -> 0x0094 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0094 }
            r2.<init>()     // Catch:{ all -> 0x0094 }
            java.lang.String r3 = "error"
            java.lang.String r4 = "command-discarded"
            org.json.JSONObject r2 = r2.put((java.lang.String) r3, (java.lang.Object) r4)     // Catch:{ all -> 0x0094 }
            r0.k(r2)     // Catch:{ all -> 0x0094 }
            goto L_0x009e
        L_0x0094:
            r0 = move-exception
            voc r1 = r1.b
            java.lang.String r2 = "OKSignaling"
            java.lang.String r3 = "Error discarding postponed command"
            r1.logException(r2, r3, r0)
        L_0x009e:
            return
        L_0x009f:
            java.lang.Object r0 = r0.b
            kf5 r0 = (defpackage.kf5) r0
            r0.getClass()
            hf5 r1 = new hf5
            r1.<init>(r0, r3)
            java.lang.Object r0 = r0.a
            gy0 r0 = (defpackage.gy0) r0
            r0.v(r1)
            return
        L_0x00b3:
            java.lang.Object r0 = r0.b
            ia5 r0 = (defpackage.ia5) r0
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.b
            r0.set(r4)
            return
        L_0x00bd:
            java.lang.Object r0 = r0.b
            la5 r0 = (defpackage.la5) r0
            zta r1 = r0.b
            long r5 = r1.a()
            zta r1 = r0.b
            long r7 = r1.b()
            ia5 r1 = new ia5
            r1.<init>(r0, r7)
        L_0x00d2:
            java.util.concurrent.ExecutorService r3 = r0.a
            boolean r3 = r3.isTerminated()
            if (r3 != 0) goto L_0x01f8
            boolean r3 = r0.v
            if (r3 != 0) goto L_0x01f8
            r1.a()
            java.util.concurrent.locks.ReentrantLock r3 = r0.y
            r3.lock()
            kotlin.time.Duration r9 = kotlin.time.Duration.m1351boximpl(r5)     // Catch:{ all -> 0x01c9 }
            kotlin.time.Duration r10 = kotlin.time.Duration.m1351boximpl(r7)     // Catch:{ all -> 0x01c9 }
            java.lang.Comparable r9 = kotlin.comparisons.ComparisonsKt.minOf(r9, r10)     // Catch:{ all -> 0x01c9 }
            kotlin.time.Duration r9 = (kotlin.time.Duration) r9     // Catch:{ all -> 0x01c9 }
            long r9 = r9.m1408unboximpl()     // Catch:{ all -> 0x01c9 }
            long r11 = r0.f()     // Catch:{ all -> 0x01c9 }
            long r11 = defpackage.la5.c(r11, r5)     // Catch:{ all -> 0x01c9 }
            java.util.concurrent.ConcurrentHashMap r13 = r0.x     // Catch:{ all -> 0x01c9 }
            boolean r13 = r13.isEmpty()     // Catch:{ all -> 0x01c9 }
            r13 = r13 ^ r4
        L_0x0107:
            if (r13 == 0) goto L_0x01e4
            long r14 = r0.f()     // Catch:{ all -> 0x01c9 }
            int r14 = kotlin.time.Duration.m1352compareToLRDsOJo(r14, r11)     // Catch:{ all -> 0x01c9 }
            if (r14 >= 0) goto L_0x01e4
            java.util.concurrent.locks.Condition r14 = r0.z     // Catch:{ InterruptedException -> 0x01cd }
            r22 = r3
            long r2 = kotlin.time.Duration.m1373getInWholeNanosecondsimpl(r9)     // Catch:{ InterruptedException -> 0x01c5 }
            long r2 = r14.awaitNanos(r2)     // Catch:{ InterruptedException -> 0x01c5 }
            kotlin.time.DurationUnit r14 = kotlin.time.DurationUnit.NANOSECONDS     // Catch:{ InterruptedException -> 0x01c5 }
            long r2 = kotlin.time.DurationKt.toDuration((long) r2, (kotlin.time.DurationUnit) r14)     // Catch:{ InterruptedException -> 0x01c5 }
            kotlin.time.Duration$Companion r14 = kotlin.time.Duration.Companion     // Catch:{ InterruptedException -> 0x01c5 }
            r16 = r5
            long r4 = r14.m1456getZEROUwyO8pc()     // Catch:{ InterruptedException -> 0x01c2 }
            int r2 = kotlin.time.Duration.m1352compareToLRDsOJo(r2, r4)     // Catch:{ InterruptedException -> 0x01c2 }
            if (r2 <= 0) goto L_0x0139
            r18 = r7
            r2 = r16
            goto L_0x01ba
        L_0x0139:
            long r2 = r0.f()     // Catch:{ InterruptedException -> 0x01c2 }
            long r4 = kotlin.time.Duration.m1388minusLRDsOJo(r2, r11)     // Catch:{ InterruptedException -> 0x01c2 }
            java.util.concurrent.ConcurrentHashMap r6 = r0.x     // Catch:{ InterruptedException -> 0x01c2 }
            java.util.List r6 = defpackage.la5.g(r6)     // Catch:{ InterruptedException -> 0x01c2 }
            r18 = r7
            long r7 = r14.m1456getZEROUwyO8pc()     // Catch:{ InterruptedException -> 0x019e }
            int r4 = kotlin.time.Duration.m1352compareToLRDsOJo(r4, r7)     // Catch:{ InterruptedException -> 0x019e }
            if (r4 <= 0) goto L_0x01b5
            java.util.Collection r6 = (java.util.Collection) r6     // Catch:{ InterruptedException -> 0x019e }
            boolean r4 = r6.isEmpty()     // Catch:{ InterruptedException -> 0x019e }
            r5 = 1
            r4 = r4 ^ r5
            if (r4 == 0) goto L_0x01b5
            boolean r4 = r0.v     // Catch:{ InterruptedException -> 0x019e }
            if (r4 != 0) goto L_0x01b5
            java.util.concurrent.ConcurrentHashMap r4 = r0.x     // Catch:{ InterruptedException -> 0x019e }
            java.util.List r4 = defpackage.la5.g(r4)     // Catch:{ InterruptedException -> 0x019e }
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch:{ InterruptedException -> 0x019e }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ InterruptedException -> 0x019e }
            r5.<init>()     // Catch:{ InterruptedException -> 0x019e }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ InterruptedException -> 0x019e }
        L_0x0172:
            boolean r6 = r4.hasNext()     // Catch:{ InterruptedException -> 0x019e }
            if (r6 == 0) goto L_0x01a1
            java.lang.Object r6 = r4.next()     // Catch:{ InterruptedException -> 0x019e }
            yeg r6 = (defpackage.yeg) r6     // Catch:{ InterruptedException -> 0x019e }
            long r7 = r6.c     // Catch:{ InterruptedException -> 0x019e }
            long r7 = kotlin.time.Duration.m1388minusLRDsOJo(r2, r7)     // Catch:{ InterruptedException -> 0x019e }
            r20 = r2
            r2 = r16
            int r7 = kotlin.time.Duration.m1352compareToLRDsOJo(r7, r2)     // Catch:{ InterruptedException -> 0x01d0 }
            if (r7 <= 0) goto L_0x018f
            goto L_0x0190
        L_0x018f:
            r6 = 0
        L_0x0190:
            if (r6 == 0) goto L_0x0199
            r5.add(r6)     // Catch:{ InterruptedException -> 0x01d0 }
            goto L_0x0199
        L_0x0196:
            r0 = move-exception
            goto L_0x01f4
        L_0x0199:
            r16 = r2
            r2 = r20
            goto L_0x0172
        L_0x019e:
            r2 = r16
            goto L_0x01d0
        L_0x01a1:
            r2 = r16
            boolean r4 = r5.isEmpty()     // Catch:{ InterruptedException -> 0x01d0 }
            r6 = 1
            r4 = r4 ^ r6
            if (r4 == 0) goto L_0x01ac
            goto L_0x01ad
        L_0x01ac:
            r5 = 0
        L_0x01ad:
            if (r5 == 0) goto L_0x01b7
            zta r4 = r0.b     // Catch:{ InterruptedException -> 0x01d0 }
            r4.c(r5)     // Catch:{ InterruptedException -> 0x01d0 }
            goto L_0x01b7
        L_0x01b5:
            r2 = r16
        L_0x01b7:
            r1.a()     // Catch:{ InterruptedException -> 0x01d0 }
        L_0x01ba:
            r4 = 1
            r5 = r2
            r7 = r18
            r3 = r22
            goto L_0x0107
        L_0x01c2:
            r18 = r7
            goto L_0x019e
        L_0x01c5:
            r2 = r5
            r18 = r7
            goto L_0x01d0
        L_0x01c9:
            r0 = move-exception
            r22 = r3
            goto L_0x01f4
        L_0x01cd:
            r22 = r3
            goto L_0x01c5
        L_0x01d0:
            long r4 = r0.f()     // Catch:{ all -> 0x0196 }
            long r4 = kotlin.time.Duration.m1388minusLRDsOJo(r11, r4)     // Catch:{ all -> 0x0196 }
            kotlin.time.DurationUnit r6 = kotlin.time.DurationUnit.NANOSECONDS     // Catch:{ all -> 0x0196 }
            r7 = 1
            long r8 = kotlin.time.DurationKt.toDuration((int) r7, (kotlin.time.DurationUnit) r6)     // Catch:{ all -> 0x0196 }
            long r9 = kotlin.time.Duration.m1388minusLRDsOJo(r4, r8)     // Catch:{ all -> 0x0196 }
            goto L_0x01ba
        L_0x01e4:
            r22 = r3
            r2 = r5
            r18 = r7
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0196 }
            r22.unlock()
            r5 = r2
            r7 = r18
            r4 = 1
            goto L_0x00d2
        L_0x01f4:
            r22.unlock()
            throw r0
        L_0x01f8:
            return
        L_0x01f9:
            java.lang.Object r0 = r0.b
            one.me.sdk.lists.widgets.EndlessRecyclerView r0 = (one.me.sdk.lists.widgets.EndlessRecyclerView) r0
            one.me.sdk.lists.widgets.EndlessRecyclerView.setRefreshingNext$lambda$3(r0)
            return
        L_0x0201:
            java.lang.Object r0 = r0.b
            e65 r0 = (defpackage.e65) r0
            r0.a()
            return
        L_0x0209:
            java.lang.Object r0 = r0.b
            w25 r0 = (defpackage.w25) r0
            java.lang.String r1 = "w25"
            kotlin.Lazy r2 = r0.a     // Catch:{ all -> 0x021d }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x021d }
            esb r2 = (defpackage.esb) r2     // Catch:{ all -> 0x021d }
            if (r2 == 0) goto L_0x021f
            r2.d()     // Catch:{ all -> 0x021d }
            goto L_0x021f
        L_0x021d:
            r0 = move-exception
            goto L_0x023b
        L_0x021f:
            kotlin.Lazy r2 = r0.b     // Catch:{ all -> 0x021d }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x021d }
            r62 r2 = (defpackage.r62) r2     // Catch:{ all -> 0x021d }
            r2.V()     // Catch:{ all -> 0x021d }
            kotlin.Lazy r0 = r0.c     // Catch:{ all -> 0x021d }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x021d }
            km3 r0 = (defpackage.km3) r0     // Catch:{ all -> 0x021d }
            r0.t()     // Catch:{ all -> 0x021d }
            java.lang.String r0 = "Success invalidate cache"
            defpackage.z68.c(r1, r0, new java.lang.Object[0])     // Catch:{ all -> 0x021d }
            goto L_0x0240
        L_0x023b:
            java.lang.String r2 = "Can't invalidate cache"
            defpackage.z68.f(r1, r2, r0)
        L_0x0240:
            return
        L_0x0241:
            java.lang.Object r0 = r0.b
            r25 r0 = (defpackage.r25) r0
            com.google.android.material.tabs.TabLayout r2 = r0.I0
            int r2 = r2.getTabCount()
            r3 = 1
            int r2 = r2 - r3
            if (r2 > 0) goto L_0x0250
            goto L_0x029b
        L_0x0250:
            com.google.android.material.tabs.TabLayout r3 = r0.I0
            int r3 = r3.getWidth()
            if (r3 != 0) goto L_0x0259
            goto L_0x029b
        L_0x0259:
            android.widget.ImageButton r4 = r0.L0
            int r4 = r4.getWidth()
            if (r4 != 0) goto L_0x0262
            goto L_0x029b
        L_0x0262:
            com.google.android.material.tabs.TabLayout r5 = r0.I0
            int r5 = r5.getChildCount()
            if (r5 != 0) goto L_0x026b
            goto L_0x029b
        L_0x026b:
            com.google.android.material.tabs.TabLayout r5 = r0.I0
            android.view.View r5 = r5.getChildAt(r1)
            if (r5 != 0) goto L_0x0274
            goto L_0x029b
        L_0x0274:
            int r3 = r3 - r4
            r4 = r1
            r5 = r4
        L_0x0277:
            if (r4 >= r2) goto L_0x0294
            com.google.android.material.tabs.TabLayout r6 = r0.I0
            o8f r6 = r6.h(r4)
            if (r6 != 0) goto L_0x0283
        L_0x0281:
            r6 = 1
            goto L_0x0292
        L_0x0283:
            q8f r6 = r6.h
            int r6 = r6.getMeasuredWidth()
            int r5 = r5 + r6
            if (r5 <= r3) goto L_0x0281
            android.view.View r0 = r0.K0
            r0.setVisibility(r1)
            goto L_0x029b
        L_0x0292:
            int r4 = r4 + r6
            goto L_0x0277
        L_0x0294:
            android.view.View r0 = r0.K0
            r1 = 8
            r0.setVisibility(r1)
        L_0x029b:
            return
        L_0x029c:
            java.lang.Object r0 = r0.b
            org.webrtc.EglBase$EglConnection r0 = (org.webrtc.EglBase.EglConnection) r0
            r0.release()
            return
        L_0x02a4:
            java.lang.Object r0 = r0.b
            org.webrtc.EglRenderer r0 = (org.webrtc.EglRenderer) r0
            r0.renderFrameOnRenderThread()
            return
        L_0x02ac:
            java.lang.Object r0 = r0.b
            org.webrtc.EglBase14Impl$EglConnection r0 = (org.webrtc.EglBase14Impl.EglConnection) r0
            r0.lambda$new$0()
            return
        L_0x02b4:
            java.lang.Object r0 = r0.b
            org.webrtc.EglBase10Impl$EglConnection r0 = (org.webrtc.EglBase10Impl.EglConnection) r0
            r0.lambda$new$0()
            return
        L_0x02bc:
            java.lang.Object r0 = r0.b
            pk4 r0 = (defpackage.pk4) r0
            java.lang.Object r0 = r0.d
            rx4 r0 = (defpackage.rx4) r0
            if (r0 == 0) goto L_0x02de
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x02ce:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x02de
            java.lang.Object r1 = r0.next()
            q3f r1 = (defpackage.q3f) r1
            r1.c()
            goto L_0x02ce
        L_0x02de:
            return
        L_0x02df:
            java.lang.Object r0 = r0.b
            px4 r0 = (defpackage.px4) r0
            r1 = 1
            r0.w = r1
            r0.d()
            return
        L_0x02ea:
            java.lang.Object r0 = r0.b
            kx4 r0 = (defpackage.kx4) r0
            android.widget.AutoCompleteTextView r1 = r0.h
            boolean r1 = r1.isPopupShowing()
            r0.t(r1)
            r0.m = r1
            return
        L_0x02fa:
            java.lang.Object r0 = r0.b
            android.graphics.drawable.AnimationDrawable r0 = (android.graphics.drawable.AnimationDrawable) r0
            r0.start()
            return
        L_0x0302:
            java.lang.Object r0 = r0.b
            bu4 r0 = (defpackage.bu4) r0
            r0.getClass()
            kotlin.reflect.KProperty[] r2 = defpackage.bu4.f
            r1 = r2[r1]
            hs7 r1 = r0.b
            java.lang.Object r1 = r1.get()
            doa r1 = (defpackage.doa) r1
            boolean r1 = r1.e()
            java.lang.String r4 = defpackage.bu4.g
            if (r1 != 0) goto L_0x0324
            java.lang.String r0 = "restoreUploads: not authorized"
            r1 = 0
            defpackage.z68.f(r4, r0, r1)
            goto L_0x0377
        L_0x0324:
            java.lang.String r1 = "restoreUploadsFromStorage: "
            defpackage.z68.c(r4, r1, new java.lang.Object[0])
            r1 = r2[r3]
            hs7 r1 = r0.d
            java.lang.Object r1 = r1.get()
            ju4 r1 = (defpackage.ju4) r1
            wbe r1 = r1.a()
            u9a r2 = defpackage.u9a.o
            wh8 r4 = new wh8
            r4.<init>(r3, r1, r2)
            v9a r1 = defpackage.v9a.o
            oa3 r2 = new oa3
            r5 = 1
            r2.<init>(r5, r4, r1)
            gga r1 = defpackage.gga.y
            yia r4 = new yia
            r5 = 3
            r4.<init>(r2, r1, r5)
            oha r1 = r4.B()
            nfd r2 = defpackage.nfd.y
            wh8 r4 = new wh8
            r4.<init>(r3, r1, r2)
            boolean r1 = r4 instanceof defpackage.kj6
            if (r1 == 0) goto L_0x0364
            kj6 r4 = (defpackage.kj6) r4
            jha r1 = r4.d()
            goto L_0x0369
        L_0x0364:
            gb3 r1 = new gb3
            r1.<init>(r3, r4)
        L_0x0369:
            grg r2 = new grg
            r3 = 17
            r2.<init>(r3, r0)
            p9a r0 = defpackage.p9a.o
            dj6 r3 = defpackage.m58.e
            defpackage.ryg.k0(r1, r2, r0, r3)
        L_0x0377:
            return
        L_0x0378:
            java.lang.Object r0 = r0.b
            zz7 r0 = (defpackage.zz7) r0
            r1 = 1
            r0.cancel(r1)
            return
        L_0x0381:
            java.lang.Object r0 = r0.b
            w5g r0 = (defpackage.w5g) r0
            r0.L()
            return
        L_0x0389:
            r1 = r4
            java.lang.Object r0 = r0.b
            ti4 r0 = (defpackage.ti4) r0
            r0.X = r1
            r0.d()
            return
        L_0x0394:
            java.lang.Object r0 = r0.b
            s3f r0 = (defpackage.s3f) r0
            r0.close()
            return
        L_0x039c:
            java.lang.Object r0 = r0.b
            xh4 r0 = (defpackage.xh4) r0
            java.util.concurrent.ConcurrentHashMap r1 = r0.w
            monitor-enter(r1)
            java.lang.Object r2 = r0.b     // Catch:{ all -> 0x0413 }
            voc r2 = (defpackage.voc) r2     // Catch:{ all -> 0x0413 }
            java.lang.String r3 = "DefaultRemoteVideoTracks"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0413 }
            r4.<init>()     // Catch:{ all -> 0x0413 }
            r4.append(r0)     // Catch:{ all -> 0x0413 }
            java.lang.String r5 = ": remove remote video renderers"
            r4.append(r5)     // Catch:{ all -> 0x0413 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0413 }
            r2.log(r3, r4)     // Catch:{ all -> 0x0413 }
            java.util.concurrent.ConcurrentHashMap r2 = r0.w     // Catch:{ all -> 0x0413 }
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x0413 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0413 }
        L_0x03c7:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0413 }
            if (r3 == 0) goto L_0x0415
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0413 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0413 }
            java.lang.Object r4 = r3.getKey()     // Catch:{ all -> 0x0413 }
            ln1 r4 = (defpackage.ln1) r4     // Catch:{ all -> 0x0413 }
            a9g r4 = r4.a     // Catch:{ all -> 0x0413 }
            a9g r5 = defpackage.a9g.a     // Catch:{ all -> 0x0413 }
            if (r4 == r5) goto L_0x03e0
            goto L_0x03c7
        L_0x03e0:
            java.util.concurrent.ConcurrentHashMap r4 = r0.z     // Catch:{ all -> 0x0413 }
            java.lang.Object r5 = r3.getKey()     // Catch:{ all -> 0x0413 }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x0413 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0413 }
            java.util.HashMap r5 = r0.x     // Catch:{ all -> 0x0413 }
            java.lang.Object r4 = r5.get(r4)     // Catch:{ all -> 0x0413 }
            org.webrtc.VideoTrack r4 = (org.webrtc.VideoTrack) r4     // Catch:{ all -> 0x0413 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0413 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x0413 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0413 }
        L_0x03fe:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x0413 }
            if (r5 == 0) goto L_0x03c7
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x0413 }
            n8g r5 = (defpackage.n8g) r5     // Catch:{ all -> 0x0413 }
            r6 = 0
            r5.a = r6     // Catch:{ all -> 0x0413 }
            if (r4 == 0) goto L_0x03fe
            r4.removeSink(r5)     // Catch:{ Exception -> 0x03fe }
            goto L_0x03fe
        L_0x0413:
            r0 = move-exception
            goto L_0x0421
        L_0x0415:
            java.util.concurrent.ConcurrentHashMap r2 = r0.w     // Catch:{ all -> 0x0413 }
            r2.clear()     // Catch:{ all -> 0x0413 }
            java.util.HashMap r0 = r0.x     // Catch:{ all -> 0x0413 }
            r0.clear()     // Catch:{ all -> 0x0413 }
            monitor-exit(r1)     // Catch:{ all -> 0x0413 }
            return
        L_0x0421:
            monitor-exit(r1)     // Catch:{ all -> 0x0413 }
            throw r0
        L_0x0423:
            java.lang.Object r0 = r0.b
            ke4 r0 = (defpackage.ke4) r0
            r1 = 0
            r0.f(r1)
            return
        L_0x042c:
            r1 = 0
            java.lang.Object r0 = r0.b
            je4 r0 = (defpackage.je4) r0
            r0.f(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ne4.run():void");
    }
}
