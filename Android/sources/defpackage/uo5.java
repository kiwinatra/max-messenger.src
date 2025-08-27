package defpackage;

/* renamed from: uo5  reason: default package */
public final /* synthetic */ class uo5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uo5(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0308, code lost:
        if (r2.equals("errors.process.attachment.video.not.processed") == false) goto L_0x032c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0311, code lost:
        if (r2.equals("attachment.not.ready") == false) goto L_0x032c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0190, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        kotlin.io.CloseableKt.closeFinally(r12, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0194, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            r0 = 4
            r1 = 2
            r2 = 0
            r3 = 0
            r4 = 1
            int r5 = r12.a
            switch(r5) {
                case 0: goto L_0x051f;
                case 1: goto L_0x050a;
                case 2: goto L_0x04f5;
                case 3: goto L_0x04e5;
                case 4: goto L_0x04d9;
                case 5: goto L_0x04bc;
                case 6: goto L_0x04ac;
                case 7: goto L_0x048e;
                case 8: goto L_0x0460;
                case 9: goto L_0x044f;
                case 10: goto L_0x0437;
                case 11: goto L_0x042b;
                case 12: goto L_0x0397;
                case 13: goto L_0x0357;
                case 14: goto L_0x02e9;
                case 15: goto L_0x0251;
                case 16: goto L_0x0243;
                case 17: goto L_0x022b;
                case 18: goto L_0x0217;
                case 19: goto L_0x0207;
                case 20: goto L_0x01e2;
                case 21: goto L_0x01c6;
                case 22: goto L_0x01b7;
                case 23: goto L_0x0196;
                case 24: goto L_0x00bb;
                case 25: goto L_0x00af;
                case 26: goto L_0x003e;
                case 27: goto L_0x002d;
                case 28: goto L_0x0019;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.Object r0 = r12.b
            yx8 r0 = (defpackage.yx8) r0
            r0.getClass()
            java.lang.Object r12 = r12.c
            java.lang.Runnable r12 = (java.lang.Runnable) r12
            r12.run()
            return
        L_0x0019:
            java.lang.Object r0 = r12.b
            yx8 r0 = (defpackage.yx8) r0
            boolean r0 = r0.o()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object r12 = r12.c
            byd r12 = (defpackage.byd) r12
            r12.l(r0)
            return
        L_0x002d:
            java.lang.Object r0 = r12.b
            np8 r0 = (defpackage.np8) r0
            boolean r1 = r0.m
            if (r1 == 0) goto L_0x0036
            goto L_0x003d
        L_0x0036:
            java.lang.Object r12 = r12.c
            vp8 r12 = (defpackage.vp8) r12
            r12.c(r0)
        L_0x003d:
            return
        L_0x003e:
            java.lang.Object r0 = r12.b
            tp8 r0 = (defpackage.tp8) r0
            java.lang.Object r12 = r12.c
            ox8 r12 = (defpackage.ox8) r12
            xe8 r1 = new xe8
            android.content.Context r2 = r0.a
            r1.<init>((android.content.Context) r2, (defpackage.ox8) r12)
            r0.g = r1
            rp8 r12 = r0.e
            qo8 r0 = r0.b
            android.os.Handler r0 = r0.v
            if (r12 == 0) goto L_0x00a7
            java.lang.Object r2 = r1.c
            java.util.Set r2 = (java.util.Set) r2
            boolean r2 = r2.add(r12)
            if (r2 != 0) goto L_0x0062
            goto L_0x00a4
        L_0x0062:
            if (r0 != 0) goto L_0x0069
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
        L_0x0069:
            r12.j(r0)
            java.lang.Object r1 = r1.b
            uo8 r1 = (defpackage.uo8) r1
            android.media.session.MediaController r2 = r1.a
            ro8 r4 = r12.a
            r4.getClass()
            r2.registerCallback(r4, r0)
            java.lang.Object r0 = r1.b
            monitor-enter(r0)
            ox8 r2 = r1.e     // Catch:{ all -> 0x009a }
            h67 r2 = r2.a()     // Catch:{ all -> 0x009a }
            if (r2 == 0) goto L_0x009c
            to8 r4 = new to8     // Catch:{ all -> 0x009a }
            r4.<init>(r12)     // Catch:{ all -> 0x009a }
            java.util.HashMap r1 = r1.d     // Catch:{ all -> 0x009a }
            r1.put(r12, r4)     // Catch:{ all -> 0x009a }
            r12.c = r4     // Catch:{ all -> 0x009a }
            r2.f0(r4)     // Catch:{ RemoteException -> 0x00a3 }
            r1 = 13
            r12.i(r1, r3, r3)     // Catch:{ RemoteException -> 0x00a3 }
            goto L_0x00a3
        L_0x009a:
            r12 = move-exception
            goto L_0x00a5
        L_0x009c:
            r12.c = r3     // Catch:{ all -> 0x009a }
            java.util.ArrayList r1 = r1.c     // Catch:{ all -> 0x009a }
            r1.add(r12)     // Catch:{ all -> 0x009a }
        L_0x00a3:
            monitor-exit(r0)     // Catch:{ all -> 0x009a }
        L_0x00a4:
            return
        L_0x00a5:
            monitor-exit(r0)     // Catch:{ all -> 0x009a }
            throw r12
        L_0x00a7:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "callback must not be null"
            r12.<init>(r0)
            throw r12
        L_0x00af:
            java.lang.Object r0 = r12.b
            one.me.rlottie.network.LottieDownload r0 = (one.me.rlottie.network.LottieDownload) r0
            java.lang.Object r12 = r12.c
            one.me.rlottie.network.LottieDownloadListener r12 = (one.me.rlottie.network.LottieDownloadListener) r12
            one.me.rlottie.network.LottieDownload.withListener$lambda$6(r0, r12)
            return
        L_0x00bb:
            java.lang.Object r0 = r12.c
            o78 r0 = (defpackage.o78) r0
            java.lang.Object r12 = r12.b
            b88 r12 = (defpackage.b88) r12
            r12.a(r1)
            java.lang.String r2 = defpackage.o54.r()
            android.content.Context r5 = r12.a
            java.lang.String r6 = r5.getPackageName()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r6)
            if (r6 == 0) goto L_0x00d9
            java.lang.String r2 = "tracer"
            goto L_0x00f3
        L_0x00d9:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "tracer-"
            r6.<init>(r7)
            r7 = 58
            r8 = 45
            java.lang.String r2 = kotlin.text.StringsKt__StringsJVMKt.replace$default((java.lang.String) r2, (char) r7, (char) r8, false, 4, (java.lang.Object) null)
            java.lang.String r2 = android.net.Uri.encode(r2)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
        L_0x00f3:
            java.io.File r6 = new java.io.File
            java.io.File r5 = r5.getCacheDir()
            r6.<init>(r5, r2)
            java.lang.String r2 = "logs"
            java.io.File r2 = kotlin.io.FilesKt.resolve((java.io.File) r6, (java.lang.String) r2)
            defpackage.f6e.y(r2)     // Catch:{ IOException -> 0x0106 }
            goto L_0x0109
        L_0x0106:
            java.util.Objects.toString(r2)
        L_0x0109:
            int r5 = r12.e
            int r5 = defpackage.tr1.y(r5)
            java.lang.String r6 = "b.log"
            java.lang.String r7 = "a.log"
            if (r5 == 0) goto L_0x0158
            r8 = 65536(0x10000, double:3.2379E-319)
            if (r5 == r4) goto L_0x013a
            if (r5 == r1) goto L_0x011d
            goto L_0x016b
        L_0x011d:
            java.io.File r5 = r12.f
            if (r5 != 0) goto L_0x0122
            r5 = r3
        L_0x0122:
            long r5 = r5.length()
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 <= 0) goto L_0x016b
            java.io.File r2 = kotlin.io.FilesKt.resolve((java.io.File) r2, (java.lang.String) r7)
            java.io.File[] r5 = new java.io.File[]{r2}
            defpackage.wc8.a(r5)
            r12.f = r2
            r12.e = r1
            goto L_0x016b
        L_0x013a:
            java.io.File r1 = r12.f
            if (r1 != 0) goto L_0x013f
            r1 = r3
        L_0x013f:
            long r10 = r1.length()
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 <= 0) goto L_0x016b
            java.io.File r1 = kotlin.io.FilesKt.resolve((java.io.File) r2, (java.lang.String) r6)
            java.io.File[] r2 = new java.io.File[]{r1}
            defpackage.wc8.a(r2)
            r12.f = r1
            r1 = 3
            r12.e = r1
            goto L_0x016b
        L_0x0158:
            java.io.File r5 = kotlin.io.FilesKt.resolve((java.io.File) r2, (java.lang.String) r7)
            java.io.File r2 = kotlin.io.FilesKt.resolve((java.io.File) r2, (java.lang.String) r6)
            java.io.File[] r2 = new java.io.File[]{r5, r2}
            defpackage.wc8.a(r2)
            r12.f = r5
            r12.e = r1
        L_0x016b:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0195 }
            java.io.File r12 = r12.f     // Catch:{ IOException -> 0x0195 }
            if (r12 != 0) goto L_0x0172
            r12 = r3
        L_0x0172:
            r1.<init>(r12, r4)     // Catch:{ IOException -> 0x0195 }
            java.io.DataOutputStream r12 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x0195 }
            r12.<init>(r1)     // Catch:{ IOException -> 0x0195 }
            long r1 = r0.a     // Catch:{ all -> 0x018e }
            r12.writeLong(r1)     // Catch:{ all -> 0x018e }
            byte[] r0 = r0.b     // Catch:{ all -> 0x018e }
            int r1 = r0.length     // Catch:{ all -> 0x018e }
            r12.writeInt(r1)     // Catch:{ all -> 0x018e }
            r12.write(r0)     // Catch:{ all -> 0x018e }
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x018e }
            kotlin.io.CloseableKt.closeFinally(r12, r3)     // Catch:{ IOException -> 0x0195 }
            goto L_0x0195
        L_0x018e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0190 }
        L_0x0190:
            r1 = move-exception
            kotlin.io.CloseableKt.closeFinally(r12, r0)     // Catch:{ IOException -> 0x0195 }
            throw r1     // Catch:{ IOException -> 0x0195 }
        L_0x0195:
            return
        L_0x0196:
            java.lang.Object r0 = r12.b
            v48 r0 = (defpackage.v48) r0
            java.lang.Object r12 = r12.c
            mt1 r12 = (defpackage.mt1) r12
            mt1 r1 = r0.r
            if (r12 == r1) goto L_0x01b3
            voc r12 = r0.n
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Wrong camera capturer"
            r0.<init>(r1)
            java.lang.String r1 = "OKRTCLmsAdapter"
            java.lang.String r2 = "camera.switch.check"
            r12.reportException(r1, r2, r0)
            goto L_0x01b6
        L_0x01b3:
            r12.a()
        L_0x01b6:
            return
        L_0x01b7:
            java.lang.Object r0 = r12.b
            j18 r0 = (defpackage.j18) r0
            r0.getClass()
            java.lang.Object r12 = r12.c
            sv0 r12 = (defpackage.sv0) r12
            r12.d(r0)
            return
        L_0x01c6:
            java.lang.Object r0 = r12.b
            w08 r0 = (defpackage.w08) r0
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.a
            boolean r1 = r1.get()
            if (r1 != 0) goto L_0x01d3
            goto L_0x01e1
        L_0x01d3:
            java.lang.Object r12 = r12.c
            x08 r12 = (defpackage.x08) r12
            r12.getClass()
            iha r0 = r0.b
            java.lang.Object r12 = r12.a
            r0.a(r12)
        L_0x01e1:
            return
        L_0x01e2:
            java.lang.Object r0 = r12.b
            fj r0 = (defpackage.fj) r0
            java.lang.Object r0 = r0.b
            fz9 r0 = (defpackage.fz9) r0
            java.lang.Object r0 = r0.d()
            x08 r0 = (defpackage.x08) r0
            java.lang.Object r12 = r12.c
            do1 r12 = (defpackage.do1) r12
            if (r0 != 0) goto L_0x0201
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Observable has not yet been initialized with a value."
            r0.<init>(r1)
            r12.d(r0)
            goto L_0x0206
        L_0x0201:
            java.lang.Object r0 = r0.a
            r12.b(r0)
        L_0x0206:
            return
        L_0x0207:
            java.lang.Object r0 = r12.b
            fj r0 = (defpackage.fj) r0
            java.lang.Object r0 = r0.b
            fz9 r0 = (defpackage.fz9) r0
            java.lang.Object r12 = r12.c
            w08 r12 = (defpackage.w08) r12
            r0.j(r12)
            return
        L_0x0217:
            java.lang.String r0 = "input_method"
            java.lang.Object r1 = r12.b
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r0 = r1.getSystemService(r0)
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            java.lang.Object r12 = r12.c
            android.view.View r12 = (android.view.View) r12
            r0.showSoftInput(r12, r4)
            return
        L_0x022b:
            java.lang.Object r0 = r12.b
            android.view.View r0 = (android.view.View) r0
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            java.lang.Object r12 = r12.c
            android.view.View r12 = (android.view.View) r12
            r0.showSoftInput(r12, r4)
            return
        L_0x0243:
            int r0 = com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService.a
            java.lang.Object r0 = r12.b
            com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService r0 = (com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService) r0
            java.lang.Object r12 = r12.c
            android.app.job.JobParameters r12 = (android.app.job.JobParameters) r12
            r0.jobFinished(r12, r2)
            return
        L_0x0251:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.Object r2 = r12.b
            l7g r2 = (defpackage.l7g) r2
            java.util.Map r4 = r2.b
            java.lang.String r5 = "DASH"
            java.lang.Object r4 = r4.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = ""
            if (r4 != 0) goto L_0x026a
            r11 = r5
            goto L_0x026b
        L_0x026a:
            r11 = r4
        L_0x026b:
            int r4 = r11.length()
            if (r4 <= 0) goto L_0x027e
            hk5 r4 = new hk5
            r9 = 0
            r10 = 0
            r7 = 2
            r8 = 0
            r6 = r4
            r6.<init>(r7, r8, r9, r10, r11)
            r1.add(r4)
        L_0x027e:
            java.util.Map r2 = r2.b
            java.lang.String r4 = "HLS"
            java.lang.Object r4 = r2.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L_0x028c
            r11 = r5
            goto L_0x028d
        L_0x028c:
            r11 = r4
        L_0x028d:
            int r4 = r11.length()
            if (r4 <= 0) goto L_0x02a0
            hk5 r4 = new hk5
            r9 = 0
            r10 = 0
            r7 = 1
            r8 = 0
            r6 = r4
            r6.<init>(r7, r8, r9, r10, r11)
            r1.add(r4)
        L_0x02a0:
            java.lang.Object r12 = r12.c
            gj7 r12 = (defpackage.gj7) r12
            r12.getClass()
            kotlin.sequences.Sequence r2 = kotlin.collections.MapsKt.asSequence(r2)
            wg7 r4 = new wg7
            r4.<init>(r0)
            kotlin.sequences.Sequence r2 = kotlin.sequences.SequencesKt.filter(r2, r4)
            wg7 r4 = new wg7
            r5 = 5
            r4.<init>(r5)
            kotlin.sequences.Sequence r2 = kotlin.sequences.SequencesKt.map(r2, r4)
            java.util.List r2 = kotlin.sequences.SequencesKt.toList(r2)
            java.util.Collection r2 = (java.util.Collection) r2
            r1.addAll(r2)
            boolean r2 = r1.isEmpty()
            wx r12 = r12.k
            if (r2 == 0) goto L_0x02dd
            ru.ok.messages.video.fetcher.FetcherException r1 = new ru.ok.messages.video.fetcher.FetcherException
            java.lang.String r2 = "failed to get internal link from video play cmd"
            r1.<init>(r0, r2)
            r12.onError(r1)
            r12.b()
            goto L_0x02e8
        L_0x02dd:
            jk5 r0 = new jk5
            r0.<init>(r3, r1)
            r12.d(r0)
            r12.b()
        L_0x02e8:
            return
        L_0x02e9:
            java.lang.Object r0 = r12.b
            hj0 r0 = (defpackage.hj0) r0
            qaf r1 = r0.b
            java.lang.String r2 = r1.b
            boolean r1 = r1 instanceof defpackage.aaf
            if (r1 == 0) goto L_0x02f6
            goto L_0x032e
        L_0x02f6:
            if (r2 == 0) goto L_0x032c
            int r1 = r2.hashCode()
            r4 = 9
            switch(r1) {
                case 212698279: goto L_0x0320;
                case 979732336: goto L_0x0314;
                case 1378132925: goto L_0x030b;
                case 1739785143: goto L_0x0302;
                default: goto L_0x0301;
            }
        L_0x0301:
            goto L_0x032c
        L_0x0302:
            java.lang.String r1 = "errors.process.attachment.video.not.processed"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x032e
            goto L_0x032c
        L_0x030b:
            java.lang.String r1 = "attachment.not.ready"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x032e
            goto L_0x032c
        L_0x0314:
            java.lang.String r1 = "video.offline"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x031d
            goto L_0x032c
        L_0x031d:
            r4 = 8
            goto L_0x032e
        L_0x0320:
            java.lang.String r1 = "not.found"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0329
            goto L_0x032c
        L_0x0329:
            r4 = 10
            goto L_0x032e
        L_0x032c:
            r4 = 11
        L_0x032e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "videoplay cmd failed "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "gj7"
            defpackage.z68.f(r1, r0, r3)
            java.lang.Object r12 = r12.c
            gj7 r12 = (defpackage.gj7) r12
            wx r0 = r12.k
            ru.ok.messages.video.fetcher.FetcherException r1 = new ru.ok.messages.video.fetcher.FetcherException
            java.lang.String r2 = "videoplay cmd failed"
            r1.<init>(r4, r2)
            r0.onError(r1)
            wx r12 = r12.k
            r12.b()
            return
        L_0x0357:
            java.lang.Object r0 = r12.b
            wh r0 = (defpackage.wh) r0
            java.lang.Object r0 = r0.c
            ru.ok.messages.calls.views.IncomingCallControlsView r0 = (ru.ok.messages.calls.views.IncomingCallControlsView) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r1)
            java.lang.Object r12 = r12.c
            android.view.View r12 = (android.view.View) r12
            android.view.ViewPropertyAnimator r4 = r12.animate()
            r4.setListener(r3)
            r12.setAlpha(r1)
            int r3 = r12.getTop()
            int r3 = -r3
            r12.offsetTopAndBottom(r3)
            r12.setScaleX(r1)
            r12.setScaleY(r1)
            int r12 = r0.A0
            r0.setSwipeHintColor(r12)
            r0.z0 = r2
            android.widget.ImageButton r12 = r0.b
            r12.setAlpha(r1)
            android.widget.ImageButton r12 = r0.c
            r12.setAlpha(r1)
            android.widget.ImageButton r12 = r0.o
            r12.setAlpha(r1)
            return
        L_0x0397:
            java.lang.Object r0 = r12.b
            ru.ok.messages.calls.views.IncomingCallControlsView r0 = (ru.ok.messages.calls.views.IncomingCallControlsView) r0
            android.widget.TextView r2 = r0.w0
            int r2 = r2.getLeft()
            android.widget.TextView r3 = r0.w0
            int r3 = r3.getMeasuredWidth()
            int r3 = r3 / r1
            int r3 = r3 + r2
            android.widget.ImageView r2 = r0.v
            java.lang.Object r12 = r12.c
            android.view.View r12 = (android.view.View) r12
            if (r12 != r2) goto L_0x03d4
            android.widget.ImageButton r12 = r0.b
            int r12 = r12.getRight()
            android.widget.ImageButton r2 = r0.b
            int r2 = r2.getWidth()
            int r2 = r2 / r1
            int r12 = r12 - r2
            int r12 = r12 - r3
            float r12 = (float) r12
            android.widget.TextView r1 = r0.w0
            int r1 = r1.getLeft()
            float r1 = (float) r1
            float r1 = r1 + r12
            ro4 r2 = r0.C0
            int r2 = r2.h
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0425
            r12 = r2
            goto L_0x0425
        L_0x03d4:
            android.widget.ImageView r2 = r0.w
            if (r12 != r2) goto L_0x03e9
            android.widget.ImageButton r12 = r0.o
            int r12 = r12.getRight()
            android.widget.ImageButton r2 = r0.o
            int r2 = r2.getWidth()
            int r2 = r2 / r1
            int r12 = r12 - r2
            int r12 = r12 - r3
        L_0x03e7:
            float r12 = (float) r12
            goto L_0x0425
        L_0x03e9:
            android.widget.ImageView r2 = r0.x
            if (r12 != r2) goto L_0x0424
            android.widget.ImageButton r12 = r0.c
            int r12 = r12.getRight()
            android.widget.ImageButton r2 = r0.c
            int r2 = r2.getWidth()
            int r2 = r2 / r1
            int r12 = r12 - r2
            int r12 = r12 - r3
            float r12 = (float) r12
            android.widget.TextView r1 = r0.w0
            int r1 = r1.getRight()
            float r1 = (float) r1
            float r1 = r1 + r12
            int r2 = r0.getMeasuredWidth()
            ro4 r3 = r0.C0
            int r3 = r3.h
            int r2 = r2 - r3
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0425
            int r12 = r0.getMeasuredWidth()
            android.widget.TextView r1 = r0.w0
            int r1 = r1.getMeasuredWidth()
            int r12 = r12 - r1
            ro4 r1 = r0.C0
            int r1 = r1.h
            int r12 = r12 - r1
            goto L_0x03e7
        L_0x0424:
            r12 = 0
        L_0x0425:
            android.widget.TextView r0 = r0.w0
            r0.setTranslationX(r12)
            return
        L_0x042b:
            java.lang.Object r0 = r12.b
            r97 r0 = (defpackage.r97) r0
            java.lang.Object r12 = r12.c
            java.lang.String r12 = (java.lang.String) r12
            r0.c(r12)
            return
        L_0x0437:
            java.lang.Object r0 = r12.c
            qdf r0 = (defpackage.qdf) r0
            java.lang.Object r12 = r12.b
            f97 r12 = (defpackage.f97) r12
            r12.getClass()
            android.graphics.Bitmap r12 = r12.m()     // Catch:{ Exception -> 0x044a }
            r0.b(r12)     // Catch:{ Exception -> 0x044a }
            goto L_0x044e
        L_0x044a:
            r12 = move-exception
            r0.a(r12)
        L_0x044e:
            return
        L_0x044f:
            java.lang.Object r0 = r12.b
            obd r0 = (defpackage.obd) r0
            r0.a()
            java.lang.Object r12 = r12.c
            obd r12 = (defpackage.obd) r12
            if (r12 == 0) goto L_0x045f
            r12.a()
        L_0x045f:
            return
        L_0x0460:
            java.lang.Object r0 = r12.b
            s47 r0 = (defpackage.s47) r0
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.w
            boolean r1 = r1.get()
            if (r1 == 0) goto L_0x046d
            goto L_0x048d
        L_0x046d:
            java.lang.String r1 = "t47"
            java.lang.String r3 = "onFileUploadCompleted: completed download"
            defpackage.z68.c(r1, r3, new java.lang.Object[0])
            java.lang.Object r12 = r12.c
            java.io.File r12 = (java.io.File) r12
            r12.length()
            p47 r12 = new p47
            r1 = 1120403456(0x42c80000, float:100.0)
            r12.<init>(r1, r4)
            cla r1 = r0.v
            r1.d(r12)
            r1.b()
            r0.b(r2)
        L_0x048d:
            return
        L_0x048e:
            java.lang.Object r0 = r12.b
            e27 r0 = (defpackage.e27) r0
            b8d r0 = r0.c
            java.lang.Object r12 = r12.c
            p07 r12 = (defpackage.p07) r12
            android.net.Uri r12 = r12.v0
            java.lang.Object r0 = r0.a
            r07 r0 = (defpackage.r07) r0
            vf4 r0 = r0.b
            java.util.HashMap r0 = r0.b
            java.lang.Object r12 = r0.get(r12)
            uf4 r12 = (defpackage.uf4) r12
            r12.c(r4)
            return
        L_0x04ac:
            java.lang.Object r0 = r12.b
            android.content.Context r0 = (android.content.Context) r0
            dpg r0 = defpackage.dpg.d(r0)
            java.lang.Object r12 = r12.c
            w3b r12 = (defpackage.w3b) r12
            r0.a(r12)
            return
        L_0x04bc:
            java.lang.Object r0 = r12.b
            lqd r0 = (defpackage.lqd) r0
            int r1 = r0.j()
            if (r1 <= 0) goto L_0x04d8
            java.lang.Object r12 = r12.c
            ru.ok.messages.settings.folders.picker.FoldersPickerFragment r12 = (ru.ok.messages.settings.folders.picker.FoldersPickerFragment) r12
            b76 r12 = r12.H1
            androidx.recyclerview.widget.RecyclerView r12 = r12.f()
            int r0 = r0.j()
            int r0 = r0 - r4
            r12.D0(r0)
        L_0x04d8:
            return
        L_0x04d9:
            java.lang.Object r0 = r12.b
            wx5 r0 = (defpackage.wx5) r0
            java.lang.Object r12 = r12.c
            do1 r12 = (defpackage.do1) r12
            r0.d(r12)
            return
        L_0x04e5:
            java.lang.Object r0 = r12.b
            ur5 r0 = (defpackage.ur5) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.z
            java.lang.Object r12 = r12.c
            tr5 r12 = (defpackage.tr5) r12
            ne4 r12 = r12.a
            defpackage.kne.K(r0, r12)
            return
        L_0x04f5:
            java.lang.Object r0 = r12.b
            vo5 r0 = (defpackage.vo5) r0
            r0.getClass()
            java.lang.Object r12 = r12.c
            ode r12 = (defpackage.ode) r12
            int r1 = r12.a
            w5g r0 = r0.k
            int r12 = r12.b
            r0.g(r1, r12)
            return
        L_0x050a:
            java.lang.Object r0 = r12.b
            vo5 r0 = (defpackage.vo5) r0
            r0.getClass()
            java.lang.Object r12 = r12.c
            androidx.media3.common.util.GlUtil$GlException r12 = (androidx.media3.common.util.GlUtil$GlException) r12
            androidx.media3.common.VideoFrameProcessingException r12 = androidx.media3.common.VideoFrameProcessingException.a(r12)
            w5g r0 = r0.k
            r0.a(r12)
            return
        L_0x051f:
            java.lang.Object r0 = r12.b
            vo5 r0 = (defpackage.vo5) r0
            w5g r0 = r0.k
            java.lang.Object r12 = r12.c
            java.lang.Exception r12 = (java.lang.Exception) r12
            androidx.media3.common.VideoFrameProcessingException r12 = androidx.media3.common.VideoFrameProcessingException.a(r12)
            r0.a(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uo5.run():void");
    }

    public /* synthetic */ uo5(vo5 vo5, Exception exc, long j) {
        this.a = 0;
        this.b = vo5;
        this.c = exc;
    }

    public /* synthetic */ uo5(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj3;
    }
}
