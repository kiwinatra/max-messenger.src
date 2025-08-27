package defpackage;

import java.util.concurrent.Executor;

/* renamed from: x55  reason: default package */
public final /* synthetic */ class x55 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ x55(r55 r55, int i, String str, Throwable th) {
        this.a = 0;
        this.b = r55;
        this.c = str;
        this.o = th;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [androidx.camera.video.internal.encoder.EncodeException, java.lang.Exception] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007b, code lost:
        if (r5.o() == false) goto L_0x0100;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r18 = this;
            r0 = r18
            r1 = 8
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 7
            r6 = 2
            r7 = 0
            r8 = 0
            r9 = 1
            int r10 = r0.a
            switch(r10) {
                case 0: goto L_0x0831;
                case 1: goto L_0x07d7;
                case 2: goto L_0x07b3;
                case 3: goto L_0x0794;
                case 4: goto L_0x0778;
                case 5: goto L_0x0766;
                case 6: goto L_0x071a;
                case 7: goto L_0x06ea;
                case 8: goto L_0x06ae;
                case 9: goto L_0x0680;
                case 10: goto L_0x066c;
                case 11: goto L_0x065c;
                case 12: goto L_0x0643;
                case 13: goto L_0x05eb;
                case 14: goto L_0x0593;
                case 15: goto L_0x0579;
                case 16: goto L_0x054a;
                case 17: goto L_0x04af;
                case 18: goto L_0x0497;
                case 19: goto L_0x0483;
                case 20: goto L_0x046d;
                case 21: goto L_0x0449;
                case 22: goto L_0x03ef;
                case 23: goto L_0x03d8;
                case 24: goto L_0x0182;
                case 25: goto L_0x0170;
                case 26: goto L_0x012c;
                case 27: goto L_0x0109;
                case 28: goto L_0x0029;
                default: goto L_0x0011;
            }
        L_0x0011:
            java.lang.Object r1 = r0.b
            jw8 r1 = (defpackage.jw8) r1
            r1.getClass()
            java.lang.Object r2 = r0.c
            jr1 r2 = (defpackage.jr1) r2
            java.util.Objects.toString(r2)
            java.util.List r1 = r1.c
            java.lang.Object r0 = r0.o
            zz7 r0 = (defpackage.zz7) r0
            r1.remove(r0)
            return
        L_0x0029:
            java.lang.Object r1 = r0.b
            mo4 r1 = (defpackage.mo4) r1
            r1.getClass()
            java.lang.Object r2 = r0.c
            r12 = r2
            z3f r12 = (defpackage.z3f) r12
            boolean r2 = r12.a()
            java.lang.Object r5 = r1.g
            lyc r5 = (defpackage.lyc) r5
            if (r2 != 0) goto L_0x0100
            nr4 r2 = r5.a0
            int r7 = r2.b
            int r7 = defpackage.tr1.y(r7)
            if (r7 == 0) goto L_0x007f
            if (r7 == r9) goto L_0x0071
            if (r7 == r6) goto L_0x007f
            if (r7 == r4) goto L_0x0071
            if (r7 != r3) goto L_0x0052
            goto L_0x007f
        L_0x0052:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "State "
            r1.<init>(r3)
            int r2 = r2.b
            java.lang.String r2 = defpackage.wzf.r(r2)
            r1.append(r2)
            java.lang.String r2 = " is not handled"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0071:
            java.lang.Object r2 = r2.h
            z3f r2 = (defpackage.z3f) r2
            if (r2 != r12) goto L_0x007f
            boolean r2 = r5.o()
            if (r2 != 0) goto L_0x007f
            goto L_0x0100
        L_0x007f:
            nr4 r2 = new nr4
            ts1 r3 = r5.f
            java.util.concurrent.Executor r4 = r5.d
            tsd r7 = r5.e
            r2.<init>(r3, r7, r4)
            bs6 r3 = r5.D
            java.lang.Object r3 = defpackage.lyc.l(r3)
            r15 = r3
            lb0 r15 = (defpackage.lb0) r15
            zc0 r14 = r5.u
            int r3 = r2.b
            int r3 = defpackage.tr1.y(r3)
            if (r3 == 0) goto L_0x00b4
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            int r3 = r2.b
            java.lang.String r3 = defpackage.wzf.r(r3)
            java.lang.String r4 = "configure() shouldn't be called in "
            java.lang.String r3 = r4.concat(r3)
            r0.<init>(r3)
            xa7 r3 = new xa7
            r3.<init>(r9, r0)
            goto L_0x00f3
        L_0x00b4:
            r2.b = r6
            r2.h = r12
            r2.toString()
            d5g r3 = new d5g
            r3.<init>(r2, r8)
            go1 r3 = defpackage.m5a.F(r3)
            r2.k = r3
            d5g r3 = new d5g
            r3.<init>(r2, r9)
            go1 r3 = defpackage.m5a.F(r3)
            r2.m = r3
            y4d r3 = new y4d
            java.lang.Object r0 = r0.o
            r13 = r0
            xjf r13 = (defpackage.xjf) r13
            r10 = r3
            r11 = r2
            r10.<init>((defpackage.nr4) r11, (defpackage.z3f) r12, (defpackage.xjf) r13, (defpackage.zc0) r14, (defpackage.lb0) r15)
            go1 r0 = defpackage.m5a.F(r3)
            yu9 r3 = new yu9
            r4 = 13
            r3.<init>((int) r4, (java.lang.Object) r2)
            java.lang.Object r4 = r2.d
            java.util.concurrent.Executor r4 = (java.util.concurrent.Executor) r4
            defpackage.hd8.a(r0, r3, r4)
            zz7 r3 = defpackage.hd8.J(r0)
        L_0x00f3:
            r5.a0 = r2
            p7d r0 = new p7d
            r4 = 21
            r0.<init>(r1, r2, r8, r4)
            defpackage.hd8.a(r3, r0, r7)
            goto L_0x0108
        L_0x0100:
            r12.a()
            nr4 r0 = r5.a0
            java.util.Objects.toString(r0)
        L_0x0108:
            return
        L_0x0109:
            java.lang.Object r1 = r0.b
            lyc r1 = (defpackage.lyc) r1
            z3f r2 = r1.y
            if (r2 == 0) goto L_0x011c
            boolean r2 = r2.a()
            if (r2 != 0) goto L_0x011c
            z3f r2 = r1.y
            r2.d()
        L_0x011c:
            java.lang.Object r2 = r0.c
            z3f r2 = (defpackage.z3f) r2
            r1.y = r2
            java.lang.Object r0 = r0.o
            xjf r0 = (defpackage.xjf) r0
            r1.z = r0
            r1.h(r2, r0, r9)
            return
        L_0x012c:
            java.lang.Object r1 = r0.b
            wuc r1 = (defpackage.wuc) r1
            r1.getClass()
            java.lang.Object r2 = r0.c
            ru.ok.tamtam.android.db.room.OneMeRoomDatabase r2 = (ru.ok.tamtam.android.db.room.OneMeRoomDatabase) r2
            kuc r2 = r2.N()
            java.lang.Object r0 = r0.o
            java.util.List r0 = (java.util.List) r0
            gb3 r0 = defpackage.jha.n(r0)
            pbb r3 = new pbb
            r4 = 10
            r3.<init>(r4, r1, r2)
            yia r1 = new yia
            r1.<init>(r0, r3, r8)
            oha r0 = r1.B()
            java.lang.Object r0 = r0.f()
            java.util.List r0 = (java.util.List) r0
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x016f
            r2.getClass()
            juc r1 = new juc
            r1.<init>(r2, r0, r9)
            qa3 r0 = new qa3
            r0.<init>(r6, r1)
            r0.a()
        L_0x016f:
            return
        L_0x0170:
            java.lang.Object r1 = r0.b
            uqc r1 = (defpackage.uqc) r1
            r1.a = r9
            java.lang.Object r1 = r0.c
            vqc r1 = (defpackage.vqc) r1
            java.lang.Object r0 = r0.o
            one.me.rlottie.RLottieImageView r0 = (one.me.rlottie.RLottieImageView) r0
            r1.removeView(r0)
            return
        L_0x0182:
            java.lang.Object r1 = r0.b
            fbb r1 = (defpackage.fbb) r1
            java.lang.Object r2 = r0.c
            mz9 r2 = (defpackage.mz9) r2
            java.lang.Object r0 = r0.o
            r3 = r0
            lgd r3 = (defpackage.lgd) r3
            d r0 = r1.D0
            qr0 r0 = r0.a()
            java.lang.Object r0 = r0.b
            r1 = r0
            v48 r1 = (defpackage.v48) r1
            if (r1 == 0) goto L_0x03d7
            boolean r0 = r2.b
            boolean r4 = r2.c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r10 = "startScreenVideoCapture, start="
            r5.<init>(r10)
            r5.append(r0)
            java.lang.String r10 = ", isFast="
            r5.append(r10)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            voc r10 = r1.n
            java.lang.String r11 = "OKRTCLmsAdapter"
            r10.log(r11, r5)
            j50 r5 = r1.e
            java.lang.String r10 = "Periodical screen dimensions check cancelled"
            if (r5 != 0) goto L_0x01db
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r4 = ": has no video capturer factory"
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            voc r4 = r1.n
            r4.log(r11, r0)
            goto L_0x0341
        L_0x01db:
            if (r0 == 0) goto L_0x0301
            py0 r0 = r1.b
            if (r0 == 0) goto L_0x0301
            if (r4 != 0) goto L_0x01eb
            hz0 r0 = r0.a
            te1 r0 = r0.X
            boolean r0 = r0.i
            r0 = r0 ^ r9
            goto L_0x01ec
        L_0x01eb:
            r0 = r9
        L_0x01ec:
            if (r0 == 0) goto L_0x0301
            ngd r0 = r1.t
            if (r0 == 0) goto L_0x01f4
            goto L_0x0341
        L_0x01f4:
            r1.a()
            r0 = r3
            i51 r0 = (defpackage.i51) r0
            kotlin.Lazy r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            nq1 r0 = (defpackage.nq1) r0
            android.content.Intent r4 = r0.a
            r0.a = r7
            if (r4 != 0) goto L_0x020a
            goto L_0x0341
        L_0x020a:
            j50 r0 = r1.e
            java.util.concurrent.Executor r5 = r1.g
            java.lang.Object r0 = r0.o
            r12 = r0
            voc r12 = (defpackage.voc) r12
            ngd r0 = new ngd     // Catch:{ Exception -> 0x0219 }
            r0.<init>(r4, r5, r12)     // Catch:{ Exception -> 0x0219 }
            goto L_0x0229
        L_0x0219:
            r0 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r5 = "Cant create screen capturer"
            r4.<init>(r5, r0)
            java.lang.String r0 = "OKRTCSvcFactory"
            java.lang.String r5 = "screen.capture.adapter"
            r12.reportException(r0, r5, r4)
            r0 = r7
        L_0x0229:
            r1.t = r0
            ngd r0 = r1.t
            if (r0 != 0) goto L_0x0247
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r4 = ": cant get screen capturer from factory"
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            voc r4 = r1.n
            r4.log(r11, r0)
            goto L_0x02eb
        L_0x0247:
            ngd r0 = r1.t     // Catch:{ RuntimeException -> 0x0250 }
            org.webrtc.ScreenCapturerAndroid r0 = r0.a     // Catch:{ RuntimeException -> 0x0250 }
            r1.f(r0)     // Catch:{ RuntimeException -> 0x0250 }
            r0 = r9
            goto L_0x0259
        L_0x0250:
            r0 = move-exception
            voc r4 = r1.n
            java.lang.String r5 = "screen.video.track.create"
            r4.reportException(r11, r5, r0)
            r0 = r8
        L_0x0259:
            if (r0 == 0) goto L_0x02c5
            r1.e()
            org.webrtc.Size r0 = r1.B
            android.util.DisplayMetrics r4 = r1.A
            int r5 = r4.widthPixels
            r0.width = r5
            int r4 = r4.heightPixels
            r0.height = r4
            android.graphics.Point r0 = defpackage.ur9.a(r5, r4)
            ngd r4 = r1.t
            int r5 = r0.x
            int r0 = r0.y
            r4.a(r5, r0)
            ngd r4 = r1.t
            voc r0 = r4.b
            java.lang.String r5 = "ScreenCapturerAdapter"
            java.lang.String r12 = "start"
            r0.log(r5, r12)
            boolean r0 = r4.d
            if (r0 == 0) goto L_0x028e
            voc r0 = r4.b
            java.lang.String r4 = "Screen capturer is already started"
            r0.log(r5, r4)
            goto L_0x02b7
        L_0x028e:
            boolean r0 = r4.c
            if (r0 == 0) goto L_0x029a
            voc r0 = r4.b
            java.lang.String r4 = "Screen capture session stopped"
            r0.log(r5, r4)
            goto L_0x02b7
        L_0x029a:
            org.webrtc.ScreenCapturerAndroid r0 = r4.a     // Catch:{ Exception -> 0x02a8 }
            int r12 = r4.g     // Catch:{ Exception -> 0x02a8 }
            int r13 = r4.f     // Catch:{ Exception -> 0x02a8 }
            int r14 = r4.e     // Catch:{ Exception -> 0x02a8 }
            r0.startCapture(r12, r13, r14)     // Catch:{ Exception -> 0x02a8 }
            r4.d = r9     // Catch:{ Exception -> 0x02a8 }
            goto L_0x02b7
        L_0x02a8:
            r0 = move-exception
            voc r4 = r4.b
            java.lang.RuntimeException r12 = new java.lang.RuntimeException
            java.lang.String r13 = "Start screen capture failed"
            r12.<init>(r13, r0)
            java.lang.String r0 = "screen.capture.start"
            r4.reportException(r5, r0, r12)
        L_0x02b7:
            fhd r0 = r1.z
            r0.o(r9)
            t48 r0 = new t48
            r0.<init>(r1)
            r1.b(r0)
            goto L_0x02eb
        L_0x02c5:
            qpg r0 = r1.D
            if (r0 == 0) goto L_0x02df
            r0.a = r7
            java.lang.Object r4 = r0.b
            android.os.Handler r4 = (android.os.Handler) r4
            java.lang.Object r5 = r0.c
            haf r5 = (defpackage.haf) r5
            r4.removeCallbacks(r5)
            java.lang.Object r0 = r0.o
            v48 r0 = (defpackage.v48) r0
            voc r0 = r0.n
            r0.log(r11, r10)
        L_0x02df:
            ngd r0 = r1.t
            r0.b()
            r1.t = r7
            fhd r0 = r1.z
            r0.o(r8)
        L_0x02eb:
            java.util.concurrent.CopyOnWriteArraySet r0 = r1.c
            java.util.Iterator r0 = r0.iterator()
        L_0x02f1:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0341
            java.lang.Object r4 = r0.next()
            x48 r4 = (defpackage.x48) r4
            r4.b(r1)
            goto L_0x02f1
        L_0x0301:
            ngd r0 = r1.t
            if (r0 == 0) goto L_0x0341
            qpg r0 = r1.D
            if (r0 == 0) goto L_0x031f
            r0.a = r7
            java.lang.Object r4 = r0.b
            android.os.Handler r4 = (android.os.Handler) r4
            java.lang.Object r5 = r0.c
            haf r5 = (defpackage.haf) r5
            r4.removeCallbacks(r5)
            java.lang.Object r0 = r0.o
            v48 r0 = (defpackage.v48) r0
            voc r0 = r0.n
            r0.log(r11, r10)
        L_0x031f:
            ngd r0 = r1.t
            r0.b()
            r1.t = r7
            fhd r0 = r1.z
            r0.o(r8)
            java.util.concurrent.CopyOnWriteArraySet r0 = r1.c
            java.util.Iterator r0 = r0.iterator()
        L_0x0331:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0341
            java.lang.Object r4 = r0.next()
            x48 r4 = (defpackage.x48) r4
            r4.b(r1)
            goto L_0x0331
        L_0x0341:
            boolean r0 = r2.b
            boolean r2 = r2.c
            lhd r4 = r1.u
            if (r4 != 0) goto L_0x0352
            voc r0 = r1.n
            java.lang.String r1 = "Data channel screen share sender doesn't exist"
            r0.log(r11, r1)
            goto L_0x03d7
        L_0x0352:
            if (r0 == 0) goto L_0x039f
            if (r2 != 0) goto L_0x039f
            r1.e()
            org.webrtc.Size r0 = r1.B
            android.util.DisplayMetrics r2 = r1.A
            int r5 = r2.widthPixels
            r0.width = r5
            int r2 = r2.heightPixels
            r0.height = r2
            org.webrtc.Size r0 = new org.webrtc.Size
            r0.<init>(r5, r2)
            boolean r2 = r4.x
            if (r2 != 0) goto L_0x039b
            if (r3 != 0) goto L_0x0371
            goto L_0x039b
        L_0x0371:
            i51 r3 = (defpackage.i51) r3
            kotlin.Lazy r2 = r3.a
            java.lang.Object r2 = r2.getValue()
            nq1 r2 = (defpackage.nq1) r2
            android.content.Intent r3 = r2.a
            r2.a = r7
            if (r3 != 0) goto L_0x0382
            goto L_0x039b
        L_0x0382:
            r4.x = r9
            rx3 r2 = r4.b
            o6d r5 = new o6d
            r5.<init>((java.lang.Object) r4, (java.lang.Object) r0, (java.lang.Object) r3, (int) r6)
            r2.c(r5)
            rx3 r0 = r4.b
            khd r2 = r4.y
            java.lang.Object r0 = r0.b
            android.os.Handler r0 = (android.os.Handler) r0
            r5 = 1000(0x3e8, double:4.94E-321)
            r0.postDelayed(r2, r5)
        L_0x039b:
            r1.b(r4)
            goto L_0x03d7
        L_0x039f:
            if (r0 != 0) goto L_0x03bb
            qpg r0 = r1.D
            if (r0 == 0) goto L_0x03bb
            r0.a = r7
            java.lang.Object r1 = r0.b
            android.os.Handler r1 = (android.os.Handler) r1
            java.lang.Object r2 = r0.c
            haf r2 = (defpackage.haf) r2
            r1.removeCallbacks(r2)
            java.lang.Object r0 = r0.o
            v48 r0 = (defpackage.v48) r0
            voc r0 = r0.n
            r0.log(r11, r10)
        L_0x03bb:
            boolean r0 = r4.x
            if (r0 != 0) goto L_0x03c0
            goto L_0x03d7
        L_0x03c0:
            r4.x = r8
            rx3 r0 = r4.b
            khd r1 = new khd
            r1.<init>(r4, r9)
            r0.c(r1)
            rx3 r0 = r4.b
            khd r1 = r4.y
            java.lang.Object r0 = r0.b
            android.os.Handler r0 = (android.os.Handler) r0
            r0.removeCallbacks(r1)
        L_0x03d7:
            return
        L_0x03d8:
            java.lang.Object r1 = r0.c
            android.os.Bundle r1 = (android.os.Bundle) r1
            java.lang.Object r2 = r0.b
            i3a r2 = (defpackage.i3a) r2
            r2.Z(r1)
            java.lang.Object r0 = r0.o
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r0 == 0) goto L_0x03ec
            r0.run()
        L_0x03ec:
            r2.y0 = r7
            return
        L_0x03ef:
            java.lang.Object r1 = r0.b
            xy9 r1 = (defpackage.xy9) r1
            java.lang.Object r3 = r0.c
            zz7 r3 = (defpackage.zz7) r3
            kotlin.Result$Companion r4 = kotlin.Result.Companion     // Catch:{ all -> 0x0418 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x0418 }
            qo8 r3 = (defpackage.qo8) r3     // Catch:{ all -> 0x0418 }
            r1.o = r3     // Catch:{ all -> 0x0418 }
            if (r3 == 0) goto L_0x041a
            po8 r3 = r3.c     // Catch:{ all -> 0x0418 }
            boolean r3 = r3.isConnected()     // Catch:{ all -> 0x0418 }
            if (r3 != r9) goto L_0x041a
            defpackage.xy9.i(r1)     // Catch:{ all -> 0x0418 }
            java.lang.Object r0 = r0.o
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r0 == 0) goto L_0x041a
            r0.run()     // Catch:{ all -> 0x0418 }
            goto L_0x041a
        L_0x0418:
            r0 = move-exception
            goto L_0x0421
        L_0x041a:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0418 }
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)     // Catch:{ all -> 0x0418 }
            goto L_0x042b
        L_0x0421:
            kotlin.Result$Companion r3 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)
        L_0x042b:
            java.lang.Throwable r0 = kotlin.Result.m26exceptionOrNullimpl(r0)
            if (r0 == 0) goto L_0x0448
            r1.getClass()
            r1.k(r9)
            java.lang.String r0 = "retry connect"
            java.lang.String r3 = "xy9"
            defpackage.z68.c(r3, r0, new java.lang.Object[0])
            int r0 = r1.n
            if (r0 >= r2) goto L_0x0448
            int r0 = r0 + r9
            r1.n = r0
            r1.h()
        L_0x0448:
            return
        L_0x0449:
            java.lang.Object r1 = r0.b
            wsb r1 = (defpackage.wsb) r1
            java.lang.Object r1 = r1.b
            j09 r1 = (defpackage.j09) r1
            java.lang.Object r1 = r1.j
            wb4 r1 = (defpackage.wb4) r1
            java.lang.Object r2 = r0.c
            android.util.Pair r2 = (android.util.Pair) r2
            java.lang.Object r3 = r2.first
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r2 = r2.second
            nz8 r2 = (defpackage.nz8) r2
            java.lang.Object r0 = r0.o
            java.lang.Exception r0 = (java.lang.Exception) r0
            r1.u(r3, r2, r0)
            return
        L_0x046d:
            java.lang.Object r1 = r0.b
            cs r1 = (defpackage.cs) r1
            int r2 = r1.b
            java.lang.Object r1 = r1.c
            nz8 r1 = (defpackage.nz8) r1
            java.lang.Object r3 = r0.c
            wz8 r3 = (defpackage.wz8) r3
            java.lang.Object r0 = r0.o
            es8 r0 = (defpackage.es8) r0
            r3.G(r2, r1, r0)
            return
        L_0x0483:
            java.lang.Object r1 = r0.b
            uz8 r1 = (defpackage.uz8) r1
            int r2 = r1.a
            mz8 r1 = r1.b
            java.lang.Object r3 = r0.c
            vz8 r3 = (defpackage.vz8) r3
            java.lang.Object r0 = r0.o
            es8 r0 = (defpackage.es8) r0
            r3.C(r2, r1, r0)
            return
        L_0x0497:
            java.lang.Object r1 = r0.b
            yx8 r1 = (defpackage.yx8) r1
            boolean r2 = r1.i()
            if (r2 != 0) goto L_0x04ae
            ypb r1 = r1.s
            java.lang.Object r2 = r0.c
            vx8 r2 = (defpackage.vx8) r2
            java.lang.Object r0 = r0.o
            dx8 r0 = (defpackage.dx8) r0
            r2.c(r1, r0)
        L_0x04ae:
            return
        L_0x04af:
            java.lang.Object r1 = r0.b
            ry8 r1 = (defpackage.ry8) r1
            r1.getClass()
            java.lang.Object r2 = r0.c
            ef r2 = (defpackage.ef) r2
            java.lang.Object r3 = r2.i
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.Object r0 = r0.o
            ex8 r0 = (defpackage.ex8) r0
            boolean r5 = r3.containsKey(r0)
            if (r5 == 0) goto L_0x04ca
            goto L_0x053e
        L_0x04ca:
            dt8 r5 = new dt8
            java.lang.Object r6 = r2.c
            r11 = r6
            ry8 r11 = (defpackage.ry8) r11
            r5.<init>(r11, r0)
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r10 = "androidx.media3.session.MediaNotificationManager"
            r6.putBoolean(r10, r9)
            yx8 r9 = r0.a
            oxd r12 = r9.j
            r11.getClass()
            r12.getClass()
            android.os.Bundle r9 = android.os.Bundle.EMPTY
            defpackage.v0g.w()
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>(r6)
            android.os.Looper r6 = android.os.Looper.getMainLooper()
            r6.getClass()
            yo8 r9 = new yo8
            r9.<init>(r6)
            nxd r10 = r12.a
            boolean r10 = r10.e()
            if (r10 == 0) goto L_0x0510
            ox0 r7 = new ox0
            k74 r10 = new k74
            r10.<init>(r11)
            r7.<init>((int) r4, (java.lang.Object) r10)
        L_0x0510:
            r17 = r7
            qo8 r4 = new qo8
            r10 = r4
            r14 = r5
            r15 = r6
            r16 = r9
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            android.os.Handler r7 = new android.os.Handler
            r7.<init>(r6)
            mo8 r6 = new mo8
            r6.<init>(r9, r4, r8)
            defpackage.v0g.W(r7, r6)
            r3.put(r0, r9)
            jh3 r3 = new jh3
            r11 = 7
            r10 = r3
            r12 = r2
            r13 = r9
            r14 = r5
            r15 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            java.lang.Object r2 = r2.g
            oc4 r2 = (defpackage.oc4) r2
            r9.d(r3, r2)
        L_0x053e:
            u6h r2 = new u6h
            r3 = 23
            r2.<init>(r3, r1)
            yx8 r0 = r0.a
            r0.v = r2
            return
        L_0x054a:
            java.lang.Object r1 = r0.b
            hm8 r1 = (defpackage.hm8) r1
            java.lang.Object r2 = r1.c
            yx8 r2 = (defpackage.yx8) r2
            java.lang.Object r3 = r0.c
            cx8 r3 = (defpackage.cx8) r3
            boolean r4 = r2.h(r3)
            if (r4 == 0) goto L_0x0564
            java.lang.Object r0 = r0.o
            android.view.KeyEvent r0 = (android.view.KeyEvent) r0
            r2.a(r0, r8)
            goto L_0x0576
        L_0x0564:
            ly8 r0 = r3.a
            r0.getClass()
            iy8 r2 = r2.h
            r2.getClass()
            zx8 r3 = new zx8
            r3.<init>((defpackage.iy8) r2, (int) r5)
            r2.T(r9, r3, r0, r9)
        L_0x0576:
            r1.b = r7
            return
        L_0x0579:
            java.lang.Object r1 = r0.b
            yx8 r1 = (defpackage.yx8) r1
            r1.getClass()
            java.lang.Object r2 = r0.c
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            hz8 r1 = r1.g
            m7f r1 = r1.e
            java.lang.Object r0 = r0.o
            cx8 r0 = (defpackage.cx8) r0
            r1.h(r0)
            return
        L_0x0593:
            java.lang.Object r1 = r0.b
            tt8 r1 = (defpackage.tt8) r1
            r1.getClass()
            java.lang.Object r2 = r0.c
            qb7 r2 = (defpackage.qb7) r2
            k0d r2 = r2.j()
            wb4 r1 = r1.c
            vob r3 = r1.x
            r3.getClass()
            q40 r1 = r1.o
            r1.getClass()
            tb7 r4 = defpackage.tb7.p(r2)
            r1.b = r4
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L_0x05cb
            java.lang.Object r2 = r2.get(r8)
            nz8 r2 = (defpackage.nz8) r2
            r1.v = r2
            java.lang.Object r0 = r0.o
            nz8 r0 = (defpackage.nz8) r0
            r0.getClass()
            r1.w = r0
        L_0x05cb:
            java.lang.Object r0 = r1.o
            nz8 r0 = (defpackage.nz8) r0
            if (r0 != 0) goto L_0x05e3
            java.lang.Object r0 = r1.b
            tb7 r0 = (defpackage.tb7) r0
            java.lang.Object r2 = r1.v
            nz8 r2 = (defpackage.nz8) r2
            java.lang.Object r4 = r1.a
            ekf r4 = (defpackage.ekf) r4
            nz8 r0 = defpackage.q40.l(r3, r0, r2, r4)
            r1.o = r0
        L_0x05e3:
            jkf r0 = r3.l0()
            r1.z(r0)
            return
        L_0x05eb:
            java.lang.Object r1 = r0.b
            st8 r1 = (defpackage.st8) r1
            r1.getClass()
            java.lang.Object r2 = r0.c
            qb7 r2 = (defpackage.qb7) r2
            k0d r2 = r2.j()
            vb4 r1 = r1.c
            j3h r3 = r1.x
            r3.getClass()
            kwd r1 = r1.o
            r1.getClass()
            tb7 r4 = defpackage.tb7.p(r2)
            r1.b = r4
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L_0x0623
            java.lang.Object r2 = r2.get(r8)
            mz8 r2 = (defpackage.mz8) r2
            r1.e = r2
            java.lang.Object r0 = r0.o
            mz8 r0 = (defpackage.mz8) r0
            r0.getClass()
            r1.f = r0
        L_0x0623:
            java.lang.Object r0 = r1.d
            mz8 r0 = (defpackage.mz8) r0
            if (r0 != 0) goto L_0x063b
            java.lang.Object r0 = r1.b
            tb7 r0 = (defpackage.tb7) r0
            java.lang.Object r2 = r1.e
            mz8 r2 = (defpackage.mz8) r2
            java.lang.Object r4 = r1.a
            dkf r4 = (defpackage.dkf) r4
            mz8 r0 = defpackage.kwd.e(r3, r0, r2, r4)
            r1.d = r0
        L_0x063b:
            ikf r0 = r3.V0()
            r1.i(r0)
            return
        L_0x0643:
            java.lang.Object r1 = r0.b
            fj r1 = (defpackage.fj) r1
            java.lang.Object r1 = r1.b
            fz9 r1 = (defpackage.fz9) r1
            java.lang.Object r2 = r0.c
            w08 r2 = (defpackage.w08) r2
            if (r2 == 0) goto L_0x0654
            r1.j(r2)
        L_0x0654:
            java.lang.Object r0 = r0.o
            w08 r0 = (defpackage.w08) r0
            r1.f(r0)
            return
        L_0x065c:
            java.lang.Object r1 = r0.b
            y87 r1 = (defpackage.y87) r1
            java.lang.Object r2 = r0.c
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            java.lang.Object r0 = r0.o
            xv1 r0 = (defpackage.xv1) r0
            r1.H(r2, r0)
            return
        L_0x066c:
            java.lang.Object r1 = r0.b
            grg r1 = (defpackage.grg) r1
            java.lang.Object r1 = r1.b
            o87 r1 = (defpackage.o87) r1
            java.lang.Object r2 = r0.c
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            java.lang.Object r0 = r0.o
            ea6 r0 = (defpackage.ea6) r0
            r1.b(r2, r0)
            return
        L_0x0680:
            java.lang.Object r1 = r0.b
            k57 r1 = (defpackage.k57) r1
            java.util.concurrent.atomic.AtomicBoolean r2 = r1.y
            boolean r2 = r2.get()
            if (r2 == 0) goto L_0x068d
            goto L_0x06ad
        L_0x068d:
            java.lang.Object r2 = r0.c
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r0.o
            u47 r0 = (defpackage.u47) r0
            java.lang.Object[] r3 = new java.lang.Object[]{r2, r0}
            java.lang.String r4 = "l57"
            java.lang.String r5 = "onFileUploadFailed: message =%s, httpError=%s"
            defpackage.z68.g(r4, r5, r3)
            one.me.sdk.transfer.exceptions.TamHttpErrorException r3 = new one.me.sdk.transfer.exceptions.TamHttpErrorException
            r3.<init>(r2, r0)
            cla r0 = r1.x
            r0.onError(r3)
            r1.a(r8)
        L_0x06ad:
            return
        L_0x06ae:
            java.lang.Object r1 = r0.b
            be6 r1 = (defpackage.be6) r1
            java.lang.Object r2 = r0.c
            pe6 r2 = (defpackage.pe6) r2
            java.lang.Object r0 = r0.o
            org.webrtc.VideoFrame r0 = (org.webrtc.VideoFrame) r0
            boolean r3 = r1.v0
            if (r3 == 0) goto L_0x06e1
            long r3 = android.os.SystemClock.elapsedRealtime()
            if (r2 == 0) goto L_0x06cb
            boolean r5 = r2.h
            r2.h = r8
            if (r5 == 0) goto L_0x06cb
            r8 = r9
        L_0x06cb:
            long r5 = r1.z
            long r10 = r1.a
            long r5 = r5 + r10
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x06d5
            goto L_0x06d6
        L_0x06d5:
            r9 = r8
        L_0x06d6:
            if (r9 == 0) goto L_0x06da
            r1.z = r3
        L_0x06da:
            org.webrtc.VpxEncoderWrapper r2 = r1.w
            if (r2 == 0) goto L_0x06e1
            r2.encode(r0, r9)
        L_0x06e1:
            java.util.concurrent.atomic.AtomicInteger r1 = r1.Z
            r1.decrementAndGet()
            r0.release()
            return
        L_0x06ea:
            java.lang.Object r1 = r0.b
            xd6 r1 = (defpackage.xd6) r1
            java.lang.Object r2 = r0.c
            android.content.Intent r2 = (android.content.Intent) r2
            java.lang.Object r0 = r0.o
            org.webrtc.Size r0 = (org.webrtc.Size) r0
            org.webrtc.SurfaceTextureHelper r3 = r1.v
            if (r3 != 0) goto L_0x0704
            org.webrtc.EglBase$Context r3 = r1.a
            java.lang.String r4 = "SSFCTextureHelper"
            org.webrtc.SurfaceTextureHelper r3 = org.webrtc.SurfaceTextureHelper.create(r4, r3)
            r1.v = r3
        L_0x0704:
            org.webrtc.ScreenCapturerAndroid r3 = new org.webrtc.ScreenCapturerAndroid
            r3.<init>(r2, r1)
            r1.w = r3
            org.webrtc.ScreenCapturerAndroid r2 = r1.w
            org.webrtc.SurfaceTextureHelper r3 = r1.v
            android.content.Context r4 = r1.b
            r2.initialize(r3, r4, r1)
            r1.z = r9
            r1.b(r0, r9)
            return
        L_0x071a:
            java.lang.Object r1 = r0.b
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r1.run()
            java.lang.Object r1 = r0.c
            zp5 r1 = (defpackage.zp5) r1
            java.util.WeakHashMap r1 = r1.a
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x072f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0765
            java.lang.Object r2 = r1.next()
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            boolean r4 = r4.isCurrentThread()
            java.lang.Object r6 = r0.o
            bq5 r6 = (defpackage.bq5) r6
            if (r4 == 0) goto L_0x074d
            defpackage.wgf.c(r2, r6)
            goto L_0x072f
        L_0x074d:
            android.os.Handler r4 = r2.getHandler()
            if (r4 == 0) goto L_0x075c
            vj6 r7 = new vj6
            r7.<init>((int) r3, (java.lang.Object) r2, (java.lang.Object) r6)
            r4.postAtFrontOfQueue(r7)
            goto L_0x072f
        L_0x075c:
            uj6 r4 = new uj6
            r4.<init>(r5, r2, r6)
            r2.post(r4)
            goto L_0x072f
        L_0x0765:
            return
        L_0x0766:
            java.lang.Object r1 = r0.b
            ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManagerImpl r1 = (ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManagerImpl) r1
            java.lang.Object r2 = r0.o
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r0 = r0.c
            java.util.List r0 = (java.util.List) r0
            ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManagerImpl.onFeedback$lambda$1(r1, r0, r2)
            return
        L_0x0778:
            java.lang.Object r1 = r0.c
            android.content.Intent r1 = (android.content.Intent) r1
            java.lang.Object r2 = r0.o
            qdf r2 = (defpackage.qdf) r2
            java.lang.Object r0 = r0.b
            f75 r0 = (defpackage.f75) r0
            r0.getClass()
            r0.b(r1)     // Catch:{ all -> 0x078e }
            r2.b(r7)
            return
        L_0x078e:
            r0 = move-exception
            r1 = r0
            r2.b(r7)
            throw r1
        L_0x0794:
            java.lang.Object r2 = r0.o
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            java.lang.Object r3 = r0.b
            r55 r3 = (defpackage.r55) r3
            java.lang.Object r0 = r0.c
            e65 r0 = (defpackage.e65) r0
            g65 r0 = r0.k
            int r0 = r0.D
            if (r0 != r1) goto L_0x07a7
            goto L_0x07b2
        L_0x07a7:
            java.util.Objects.requireNonNull(r3)     // Catch:{ RejectedExecutionException -> 0x07b2 }
            d65 r0 = new d65     // Catch:{ RejectedExecutionException -> 0x07b2 }
            r0.<init>(r3, r9)     // Catch:{ RejectedExecutionException -> 0x07b2 }
            r2.execute(r0)     // Catch:{ RejectedExecutionException -> 0x07b2 }
        L_0x07b2:
            return
        L_0x07b3:
            java.lang.Object r1 = r0.b
            c65 r1 = (defpackage.c65) r1
            java.util.LinkedHashMap r2 = r1.a
            java.lang.Object r3 = r0.c
            iha r3 = (defpackage.iha) r3
            r3.getClass()
            java.lang.Object r0 = r0.o
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            r0.getClass()
            r2.put(r3, r0)
            du0 r1 = r1.b
            bk4 r2 = new bk4
            r4 = 15
            r2.<init>(r4, r3, r1)
            r0.execute(r2)
            return
        L_0x07d7:
            java.lang.Object r3 = r0.b
            g65 r3 = (defpackage.g65) r3
            java.lang.Object r4 = r0.c
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r0 = r0.o
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            int r6 = r3.D
            if (r6 == r1) goto L_0x080c
            r4.isEmpty()
            n55 r1 = r3.f
            boolean r1 = r1 instanceof defpackage.f65
            if (r1 == 0) goto L_0x0807
            boolean r1 = r3.A
            if (r1 != 0) goto L_0x0807
            ykb r1 = defpackage.on4.a
            java.lang.Class<androidx.camera.video.internal.compat.quirk.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk> r4 = androidx.camera.video.internal.compat.quirk.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.class
            icc r1 = r1.g(r4)
            if (r1 == 0) goto L_0x07ff
            goto L_0x0807
        L_0x07ff:
            android.media.MediaCodec r1 = r3.e
            r1.flush()
            r3.z = r9
            goto L_0x080c
        L_0x0807:
            android.media.MediaCodec r1 = r3.e
            r1.stop()
        L_0x080c:
            if (r0 == 0) goto L_0x0811
            r0.run()
        L_0x0811:
            int r0 = r3.D
            if (r0 != r5) goto L_0x0819
            r3.f()
            goto L_0x0830
        L_0x0819:
            boolean r1 = r3.z
            if (r1 != 0) goto L_0x0820
            r3.h()
        L_0x0820:
            r3.i(r9)
            r1 = 6
            if (r0 == r2) goto L_0x0828
            if (r0 != r1) goto L_0x0830
        L_0x0828:
            r3.k()
            if (r0 != r1) goto L_0x0830
            r3.e()
        L_0x0830:
            return
        L_0x0831:
            androidx.camera.video.internal.encoder.EncodeException r1 = new androidx.camera.video.internal.encoder.EncodeException
            java.lang.Object r2 = r0.c
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r0.o
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r1.<init>(r2, r3)
            java.lang.Object r0 = r0.b
            r55 r0 = (defpackage.r55) r0
            r0.d(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x55.run():void");
    }

    public /* synthetic */ x55(e65 e65, Executor executor, r55 r55) {
        this.a = 3;
        this.c = e65;
        this.o = executor;
        this.b = r55;
    }

    public /* synthetic */ x55(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }
}
