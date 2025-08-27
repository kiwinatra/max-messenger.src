package defpackage;

/* renamed from: w55  reason: default package */
public final /* synthetic */ class w55 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object v;

    public /* synthetic */ w55(zyf zyf, tc0 tc0, int i, Runnable runnable) {
        this.a = 4;
        this.c = zyf;
        this.o = tc0;
        this.b = i;
        this.v = runnable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:190:0x04a2, code lost:
        if (defpackage.on4.a.g(androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk.class) != null) goto L_0x04d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x04b3, code lost:
        if (defpackage.on4.a.g(androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) != null) goto L_0x04d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x018a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r0.d.a(r1, r2 + 1, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01a6, code lost:
        r3.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01a9, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x019c */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x05e7  */
    /* JADX WARNING: Removed duplicated region for block: B:318:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r29 = this;
            r0 = r29
            int r1 = r0.a
            switch(r1) {
                case 0: goto L_0x0621;
                case 1: goto L_0x01fc;
                case 2: goto L_0x01e1;
                case 3: goto L_0x01aa;
                case 4: goto L_0x014f;
                case 5: goto L_0x00f7;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r0.c
            msg r1 = (defpackage.msg) r1
            java.lang.Object r1 = r1.b
            q9d r1 = (defpackage.q9d) r1
            android.os.Handler r2 = r1.h
            android.util.LongSparseArray r3 = r1.l
            java.lang.String r4 = "Unable to cast response to valid type. Response: "
            java.util.concurrent.atomic.AtomicReference r5 = r1.b
            java.lang.Object r5 = r5.get()
            u64 r5 = (defpackage.u64) r5
            java.util.concurrent.atomic.AtomicBoolean r6 = r1.j
            boolean r6 = r6.get()
            if (r6 != 0) goto L_0x00f6
            java.lang.Object r6 = r0.o
            u64 r6 = (defpackage.u64) r6
            if (r5 == r6) goto L_0x002d
            goto L_0x00f6
        L_0x002d:
            o5h r5 = r1.n
            r5.getClass()
            zsg r6 = new zsg
            java.lang.Object r7 = r0.v
            byte[] r7 = (byte[]) r7
            int r0 = r0.b
            r8 = 0
            r6.<init>(r5, r7, r0, r8)
            java.lang.Object r8 = r5.c
            android.os.Handler r8 = (android.os.Handler) r8
            r8.post(r6)
            o9a r6 = r1.a     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            jz2 r0 = r6.i(r0, r7)     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            if (r0 != 0) goto L_0x004f
            goto L_0x00f6
        L_0x004f:
            long r6 = r0.b     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            java.lang.Object r0 = r0.c     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            w9d r0 = (defpackage.w9d) r0     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            java.lang.Object r9 = r3.get(r6)     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            lsg r9 = (defpackage.lsg) r9     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            if (r9 != 0) goto L_0x005f
            goto L_0x00f6
        L_0x005f:
            n9d r10 = r9.c
            if (r0 == 0) goto L_0x0083
            o6d r4 = new o6d     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            r11 = 18
            r4.<init>((java.lang.Object) r5, (java.lang.Object) r10, (java.lang.Object) r0, (int) r11)     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            r8.post(r4)     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            r5.r(r10)     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            l8g r4 = new l8g     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            r10 = 11
            r4.<init>(r10, r9, r0)     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            r2.post(r4)     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            r3.remove(r6)     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            goto L_0x00f6
        L_0x007f:
            r0 = move-exception
            goto L_0x009f
        L_0x0081:
            r0 = move-exception
            goto L_0x00aa
        L_0x0083:
            java.lang.ClassCastException r9 = new java.lang.ClassCastException     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            r10.<init>(r4)     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            r10.append(r0)     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            java.lang.String r0 = r10.toString()     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            r9.<init>(r0)     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            ru.ok.android.webrtc.protocol.exceptions.RtcCommandSerializeException r0 = new ru.ok.android.webrtc.protocol.exceptions.RtcCommandSerializeException     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            java.lang.Long r4 = java.lang.Long.valueOf(r6)     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            r6 = 0
            r0.<init>(r4, r6, r9)     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            throw r0     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
        L_0x009f:
            l8g r1 = new l8g
            r2 = 14
            r1.<init>(r2, r5, r0)
            r8.post(r1)
            goto L_0x00f6
        L_0x00aa:
            java.lang.Long r4 = r0.a
            if (r4 != 0) goto L_0x00b0
            r6 = 0
            goto L_0x00ba
        L_0x00b0:
            long r6 = r4.longValue()
            java.lang.Object r6 = r3.get(r6)
            lsg r6 = (defpackage.lsg) r6
        L_0x00ba:
            if (r4 == 0) goto L_0x00ec
            if (r6 != 0) goto L_0x00bf
            goto L_0x00ec
        L_0x00bf:
            o6d r7 = new o6d
            n9d r9 = r6.c
            r10 = 19
            r7.<init>((java.lang.Object) r5, (java.lang.Object) r9, (java.lang.Object) r0, (int) r10)
            r8.post(r7)
            boolean r7 = r0.b
            if (r7 == 0) goto L_0x00d7
            long r2 = r4.longValue()
            r1.c(r2)
            goto L_0x00f6
        L_0x00d7:
            r5.r(r9)
            l8g r1 = new l8g
            r5 = 12
            r1.<init>(r5, r6, r0)
            r2.post(r1)
            long r0 = r4.longValue()
            r3.remove(r0)
            goto L_0x00f6
        L_0x00ec:
            l8g r1 = new l8g
            r2 = 14
            r1.<init>(r2, r5, r0)
            r8.post(r1)
        L_0x00f6:
            return
        L_0x00f7:
            java.lang.Object r1 = r0.c
            msg r1 = (defpackage.msg) r1
            java.lang.Object r1 = r1.b
            n09 r1 = (defpackage.n09) r1
            java.lang.Object r2 = r1.y
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2
            java.lang.Object r2 = r2.get()
            u64 r2 = (defpackage.u64) r2
            java.lang.Object r3 = r1.x
            java.util.concurrent.atomic.AtomicBoolean r3 = (java.util.concurrent.atomic.AtomicBoolean) r3
            boolean r3 = r3.get()
            if (r3 != 0) goto L_0x014e
            java.lang.Object r3 = r0.o
            u64 r3 = (defpackage.u64) r3
            if (r2 == r3) goto L_0x011a
            goto L_0x014e
        L_0x011a:
            java.lang.Object r2 = r1.w
            android.os.Handler r2 = (android.os.Handler) r2
            kh1 r3 = new kh1
            java.lang.Object r4 = r0.v
            byte[] r4 = (byte[]) r4
            int r0 = r0.b
            r5 = 15
            r3.<init>((java.lang.Object) r1, (java.lang.Object) r4, (int) r0, (int) r5)
            r2.post(r3)
            java.lang.Object r3 = r1.b     // Catch:{ all -> 0x0143 }
            d19 r3 = (defpackage.d19) r3     // Catch:{ all -> 0x0143 }
            t9d r0 = r3.q(r0, r4)     // Catch:{ all -> 0x0143 }
            if (r0 == 0) goto L_0x014e
            ovb r3 = new ovb     // Catch:{ all -> 0x0143 }
            r4 = 21
            r3.<init>(r4, r1, r0)     // Catch:{ all -> 0x0143 }
            r2.post(r3)     // Catch:{ all -> 0x0143 }
            goto L_0x014e
        L_0x0143:
            r0 = move-exception
            ovb r3 = new ovb
            r4 = 20
            r3.<init>(r4, r1, r0)
            r2.post(r3)
        L_0x014e:
            return
        L_0x014f:
            java.lang.Object r1 = r0.o
            tc0 r1 = (defpackage.tc0) r1
            int r2 = r0.b
            java.lang.Object r3 = r0.v
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            java.lang.Object r0 = r0.c
            zyf r0 = (defpackage.zyf) r0
            q6f r4 = r0.f
            g95 r5 = r0.c     // Catch:{ SynchronizationException -> 0x019c }
            java.util.Objects.requireNonNull(r5)     // Catch:{ SynchronizationException -> 0x019c }
            jrf r6 = new jrf     // Catch:{ SynchronizationException -> 0x019c }
            r7 = 3
            r6.<init>((int) r7, (java.lang.Object) r5)     // Catch:{ SynchronizationException -> 0x019c }
            r5 = r4
            nbd r5 = (defpackage.nbd) r5     // Catch:{ SynchronizationException -> 0x019c }
            r5.e0(r6)     // Catch:{ SynchronizationException -> 0x019c }
            android.content.Context r5 = r0.a     // Catch:{ SynchronizationException -> 0x019c }
            java.lang.String r6 = "connectivity"
            java.lang.Object r5 = r5.getSystemService(r6)     // Catch:{ SynchronizationException -> 0x019c }
            android.net.ConnectivityManager r5 = (android.net.ConnectivityManager) r5     // Catch:{ SynchronizationException -> 0x019c }
            android.net.NetworkInfo r5 = r5.getActiveNetworkInfo()     // Catch:{ SynchronizationException -> 0x019c }
            if (r5 == 0) goto L_0x018c
            boolean r5 = r5.isConnected()     // Catch:{ SynchronizationException -> 0x019c }
            if (r5 == 0) goto L_0x018c
            r0.a(r1, r2)     // Catch:{ SynchronizationException -> 0x019c }
            goto L_0x0198
        L_0x018a:
            r0 = move-exception
            goto L_0x01a6
        L_0x018c:
            oj0 r5 = new oj0     // Catch:{ SynchronizationException -> 0x019c }
            r6 = 13
            r5.<init>((java.lang.Object) r0, (java.lang.Object) r1, (int) r2, (int) r6)     // Catch:{ SynchronizationException -> 0x019c }
            nbd r4 = (defpackage.nbd) r4     // Catch:{ SynchronizationException -> 0x019c }
            r4.e0(r5)     // Catch:{ SynchronizationException -> 0x019c }
        L_0x0198:
            r3.run()
            goto L_0x01a5
        L_0x019c:
            rm7 r0 = r0.d     // Catch:{ all -> 0x018a }
            int r2 = r2 + 1
            r4 = 0
            r0.a(r1, r2, r4)     // Catch:{ all -> 0x018a }
            goto L_0x0198
        L_0x01a5:
            return
        L_0x01a6:
            r3.run()
            throw r0
        L_0x01aa:
            java.lang.Object r1 = r0.c
            cs r1 = (defpackage.cs) r1
            java.lang.Object r1 = r1.o
            iy8 r1 = (defpackage.iy8) r1
            r2 = -1
            int r3 = r0.b
            java.lang.Object r4 = r0.o
            java.util.List r4 = (java.util.List) r4
            if (r3 != r2) goto L_0x01c3
            yx8 r2 = r1.w
            ypb r2 = r2.s
            r2.k0(r4)
            goto L_0x01ca
        L_0x01c3:
            yx8 r2 = r1.w
            ypb r2 = r2.s
            r2.S(r3, r4)
        L_0x01ca:
            yx8 r1 = r1.w
            android.util.SparseBooleanArray r2 = new android.util.SparseBooleanArray
            r2.<init>()
            r3 = 1
            r4 = 20
            r2.append(r4, r3)
            pob r2 = new pob
            java.lang.Object r0 = r0.v
            cx8 r0 = (defpackage.cx8) r0
            r1.p(r0)
            return
        L_0x01e1:
            java.lang.Object r1 = r0.c
            ef r1 = (defpackage.ef) r1
            int r2 = r1.a
            int r3 = r0.b
            if (r3 != r2) goto L_0x01fb
            r2 = 0
            java.lang.Object r3 = r0.o
            ex8 r3 = (defpackage.ex8) r3
            boolean r2 = r1.i(r3, r2)
            java.lang.Object r0 = r0.v
            ni0 r0 = (defpackage.ni0) r0
            r1.j(r3, r0, r2)
        L_0x01fb:
            return
        L_0x01fc:
            java.lang.Object r1 = r0.c
            e65 r1 = (defpackage.e65) r1
            java.lang.Object r2 = r0.o
            android.media.MediaCodec$BufferInfo r2 = (android.media.MediaCodec.BufferInfo) r2
            java.lang.Object r3 = r0.v
            android.media.MediaCodec r3 = (android.media.MediaCodec) r3
            int r0 = r0.b
            boolean r4 = r1.j
            if (r4 == 0) goto L_0x0214
            g65 r0 = r1.k
            java.lang.String r0 = r0.a
            goto L_0x0620
        L_0x0214:
            g65 r4 = r1.k
            int r4 = r4.D
            int r4 = defpackage.tr1.y(r4)
            switch(r4) {
                case 0: goto L_0x0620;
                case 1: goto L_0x0233;
                case 2: goto L_0x0233;
                case 3: goto L_0x0233;
                case 4: goto L_0x0233;
                case 5: goto L_0x0233;
                case 6: goto L_0x0233;
                case 7: goto L_0x0620;
                case 8: goto L_0x0620;
                default: goto L_0x021f;
            }
        L_0x021f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            g65 r1 = r1.k
            int r1 = r1.D
            java.lang.String r1 = defpackage.g63.s(r1)
            java.lang.String r2 = "Unknown state: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x0233:
            g65 r4 = r1.k
            java.lang.Object r4 = r4.b
            monitor-enter(r4)
            g65 r5 = r1.k     // Catch:{ all -> 0x061d }
            r55 r6 = r5.r     // Catch:{ all -> 0x061d }
            java.util.concurrent.Executor r5 = r5.s     // Catch:{ all -> 0x061d }
            monitor-exit(r4)     // Catch:{ all -> 0x061d }
            boolean r4 = r1.c
            r7 = 1
            if (r4 != 0) goto L_0x0257
            r1.c = r7
            java.util.Objects.requireNonNull(r6)     // Catch:{ RejectedExecutionException -> 0x0253 }
            d65 r4 = new d65     // Catch:{ RejectedExecutionException -> 0x0253 }
            r8 = 0
            r4.<init>(r6, r8)     // Catch:{ RejectedExecutionException -> 0x0253 }
            r5.execute(r4)     // Catch:{ RejectedExecutionException -> 0x0253 }
            goto L_0x0257
        L_0x0253:
            g65 r4 = r1.k
            java.lang.String r4 = r4.a
        L_0x0257:
            boolean r4 = r1.e
            if (r4 == 0) goto L_0x0262
            g65 r3 = r1.k
            java.lang.String r3 = r3.a
        L_0x025f:
            r5 = 0
            goto L_0x056d
        L_0x0262:
            int r4 = r2.size
            if (r4 > 0) goto L_0x026b
            g65 r3 = r1.k
            java.lang.String r3 = r3.a
            goto L_0x025f
        L_0x026b:
            int r4 = r2.flags
            r4 = r4 & 2
            if (r4 == 0) goto L_0x0276
            g65 r3 = r1.k
            java.lang.String r3 = r3.a
            goto L_0x025f
        L_0x0276:
            gy8 r4 = r1.a
            r9 = 3
            if (r4 == 0) goto L_0x039e
            long r12 = r2.presentationTimeUs
            java.lang.Object r14 = r4.v
            xjf r14 = (defpackage.xjf) r14
            java.lang.Object r15 = r4.a
            ejd r15 = (defpackage.ejd) r15
            if (r14 != 0) goto L_0x031c
            java.lang.Object r14 = r4.c
            androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk r14 = (androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk) r14
            java.lang.Object r8 = r4.b
            xjf r8 = (defpackage.xjf) r8
            if (r14 == 0) goto L_0x0293
            r10 = 0
            goto L_0x02ae
        L_0x0293:
            r15.getClass()
            long r16 = defpackage.ejd.f()
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r10 = android.os.SystemClock.elapsedRealtimeNanos()
            long r10 = r14.toMicros(r10)
            long r10 = r10 - r16
            r16 = 3000000(0x2dc6c0, double:1.482197E-317)
            int r10 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r10 <= 0) goto L_0x031a
            r10 = r7
        L_0x02ae:
            r15.getClass()
            long r16 = defpackage.ejd.f()
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.NANOSECONDS
            r20 = r8
            long r7 = android.os.SystemClock.elapsedRealtimeNanos()
            long r7 = r11.toMicros(r7)
            long r7 = r12 - r7
            long r7 = java.lang.Math.abs(r7)
            long r16 = r12 - r16
            long r16 = java.lang.Math.abs(r16)
            int r7 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r7 >= 0) goto L_0x02d4
            xjf r7 = defpackage.xjf.b
            goto L_0x02d6
        L_0x02d4:
            xjf r7 = defpackage.xjf.a
        L_0x02d6:
            if (r10 == 0) goto L_0x0316
            r8 = r20
            if (r7 == r8) goto L_0x0316
            int r8 = android.os.Build.VERSION.SDK_INT
            r10 = 31
            if (r8 < r10) goto L_0x02f7
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = ", SOC: "
            r10.<init>(r11)
            java.lang.String r11 = android.os.Build.SOC_MODEL
            r10.append(r11)
            java.lang.String r10 = r10.toString()
        L_0x02f4:
            r25 = r10
            goto L_0x02fa
        L_0x02f7:
            java.lang.String r10 = ""
            goto L_0x02f4
        L_0x02fa:
            java.lang.String r21 = android.os.Build.MANUFACTURER
            java.lang.String r22 = android.os.Build.MODEL
            java.lang.String r23 = android.os.Build.HARDWARE
            java.lang.Integer r24 = java.lang.Integer.valueOf(r8)
            java.lang.Object r8 = r4.b
            r26 = r8
            xjf r26 = (defpackage.xjf) r26
            r27 = r7
            java.lang.Object[] r8 = new java.lang.Object[]{r21, r22, r23, r24, r25, r26, r27}
            java.lang.String r10 = "Detected camera timebase inconsistent. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, Hardware: %s, API Level: %d%s].\nCamera timebase is inconsistent. The timebase reported by the camera is %s, but the actual timebase contained in the frame is detected as %s."
            java.lang.String.format(r10, r8)
            goto L_0x0319
        L_0x0316:
            r7.toString()
        L_0x0319:
            r8 = r7
        L_0x031a:
            r4.v = r8
        L_0x031c:
            java.lang.Object r7 = r4.v
            xjf r7 = (defpackage.xjf) r7
            int r7 = r7.ordinal()
            if (r7 == 0) goto L_0x0398
            r8 = 1
            if (r7 != r8) goto L_0x0380
            long r7 = r4.o
            r10 = -1
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 != 0) goto L_0x0379
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r16 = r5
            r10 = r7
            r7 = 0
            r8 = r6
            r5 = 0
        L_0x033d:
            if (r7 >= r9) goto L_0x0370
            r15.getClass()
            long r20 = defpackage.ejd.f()
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.NANOSECONDS
            r23 = r10
            long r9 = android.os.SystemClock.elapsedRealtimeNanos()
            long r9 = r14.toMicros(r9)
            long r25 = defpackage.ejd.f()
            long r27 = r25 - r20
            if (r7 == 0) goto L_0x0362
            int r11 = (r27 > r23 ? 1 : (r27 == r23 ? 0 : -1))
            if (r11 >= 0) goto L_0x035f
            goto L_0x0362
        L_0x035f:
            r10 = r23
            goto L_0x036c
        L_0x0362:
            long r20 = r20 + r25
            r5 = 1
            long r20 = r20 >> r5
            long r9 = r9 - r20
            r5 = r9
            r10 = r27
        L_0x036c:
            int r7 = r7 + 1
            r9 = 3
            goto L_0x033d
        L_0x0370:
            r9 = 0
            long r5 = java.lang.Math.max(r9, r5)
            r4.o = r5
            goto L_0x037c
        L_0x0379:
            r16 = r5
            r8 = r6
        L_0x037c:
            long r4 = r4.o
            long r12 = r12 - r4
            goto L_0x039b
        L_0x0380:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown timebase: "
            r1.<init>(r2)
            java.lang.Object r2 = r4.v
            xjf r2 = (defpackage.xjf) r2
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0398:
            r16 = r5
            r8 = r6
        L_0x039b:
            r2.presentationTimeUs = r12
            goto L_0x03a1
        L_0x039e:
            r16 = r5
            r8 = r6
        L_0x03a1:
            long r4 = r2.presentationTimeUs
            long r6 = r1.f
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 > 0) goto L_0x03af
            g65 r3 = r1.k
            java.lang.String r3 = r3.a
            goto L_0x025f
        L_0x03af:
            r1.f = r4
            g65 r6 = r1.k
            android.util.Range r6 = r6.t
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            boolean r4 = r6.contains(r4)
            if (r4 != 0) goto L_0x03f9
            g65 r3 = r1.k
            java.lang.String r4 = r3.a
            boolean r4 = r3.v
            if (r4 == 0) goto L_0x025f
            long r4 = r2.presentationTimeUs
            android.util.Range r3 = r3.t
            java.lang.Comparable r3 = r3.getUpper()
            java.lang.Long r3 = (java.lang.Long) r3
            long r6 = r3.longValue()
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 < 0) goto L_0x025f
            g65 r3 = r1.k
            java.util.concurrent.ScheduledFuture r3 = r3.x
            if (r3 == 0) goto L_0x03e3
            r4 = 1
            r3.cancel(r4)
        L_0x03e3:
            g65 r3 = r1.k
            long r4 = r2.presentationTimeUs
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3.w = r4
            g65 r3 = r1.k
            r3.j()
            g65 r3 = r1.k
            r4 = 0
            r3.v = r4
            goto L_0x025f
        L_0x03f9:
            g65 r4 = r1.k
            long r5 = r2.presentationTimeUs
        L_0x03fd:
            java.util.ArrayDeque r7 = r4.o
            boolean r9 = r7.isEmpty()
            if (r9 != 0) goto L_0x043b
            java.lang.Object r9 = r7.getFirst()
            android.util.Range r9 = (android.util.Range) r9
            java.lang.Comparable r10 = r9.getUpper()
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            int r10 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r10 <= 0) goto L_0x043b
            r7.removeFirst()
            long r10 = r4.u
            java.lang.Comparable r7 = r9.getUpper()
            java.lang.Long r7 = (java.lang.Long) r7
            long r12 = r7.longValue()
            java.lang.Comparable r7 = r9.getLower()
            java.lang.Long r7 = (java.lang.Long) r7
            long r20 = r7.longValue()
            long r12 = r12 - r20
            long r12 = r12 + r10
            r4.u = r12
            defpackage.n54.M(r12)
            goto L_0x03fd
        L_0x043b:
            g65 r4 = r1.k
            long r5 = r2.presentationTimeUs
            java.util.ArrayDeque r4 = r4.o
            java.util.Iterator r4 = r4.iterator()
        L_0x0445:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x046b
            java.lang.Object r7 = r4.next()
            android.util.Range r7 = (android.util.Range) r7
            java.lang.Long r9 = java.lang.Long.valueOf(r5)
            boolean r9 = r7.contains(r9)
            if (r9 == 0) goto L_0x045d
            r4 = 1
            goto L_0x046c
        L_0x045d:
            java.lang.Comparable r7 = r7.getLower()
            java.lang.Long r7 = (java.lang.Long) r7
            long r9 = r7.longValue()
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x0445
        L_0x046b:
            r4 = 0
        L_0x046c:
            boolean r5 = r1.h
            if (r5 != 0) goto L_0x04ff
            if (r4 == 0) goto L_0x04ff
            g65 r4 = r1.k
            java.lang.String r5 = r4.a
            r5 = 1
            r1.h = r5
            java.lang.Object r6 = r4.b
            monitor-enter(r6)
            g65 r4 = r1.k     // Catch:{ all -> 0x04fc }
            java.util.concurrent.Executor r5 = r4.s     // Catch:{ all -> 0x04fc }
            r55 r4 = r4.r     // Catch:{ all -> 0x04fc }
            monitor-exit(r6)     // Catch:{ all -> 0x04fc }
            java.util.Objects.requireNonNull(r4)
            d65 r6 = new d65
            r7 = 0
            r6.<init>(r4, r7)
            r5.execute(r6)
            g65 r4 = r1.k
            int r5 = r4.D
            r6 = 3
            if (r5 != r6) goto L_0x04d9
            boolean r4 = r4.c
            if (r4 != 0) goto L_0x04a5
            java.lang.Class<androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk> r4 = androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk.class
            ykb r5 = defpackage.on4.a
            icc r4 = r5.g(r4)
            if (r4 == 0) goto L_0x04a5
            goto L_0x04d9
        L_0x04a5:
            g65 r4 = r1.k
            boolean r4 = r4.c
            if (r4 == 0) goto L_0x04b6
            java.lang.Class<androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk> r4 = androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class
            ykb r5 = defpackage.on4.a
            icc r4 = r5.g(r4)
            if (r4 == 0) goto L_0x04b6
            goto L_0x04d9
        L_0x04b6:
            g65 r4 = r1.k
            n55 r4 = r4.f
            boolean r5 = r4 instanceof defpackage.c65
            if (r5 == 0) goto L_0x04c4
            c65 r4 = (defpackage.c65) r4
            r5 = 0
            r4.a(r5)
        L_0x04c4:
            g65 r4 = r1.k
            r4.getClass()
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r6 = "drop-input-frames"
            r7 = 1
            r5.putInt(r6, r7)
            android.media.MediaCodec r4 = r4.e
            r4.setParameters(r5)
        L_0x04d9:
            g65 r4 = r1.k
            long r5 = r2.presentationTimeUs
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r4.w = r5
            g65 r4 = r1.k
            boolean r5 = r4.v
            if (r5 == 0) goto L_0x0517
            java.util.concurrent.ScheduledFuture r4 = r4.x
            if (r4 == 0) goto L_0x04f1
            r5 = 1
            r4.cancel(r5)
        L_0x04f1:
            g65 r4 = r1.k
            r4.j()
            g65 r4 = r1.k
            r5 = 0
            r4.v = r5
            goto L_0x0517
        L_0x04fc:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x04fc }
            throw r0
        L_0x04ff:
            if (r5 == 0) goto L_0x0517
            if (r4 != 0) goto L_0x0517
            g65 r4 = r1.k
            java.lang.String r5 = r4.a
            r5 = 0
            r1.h = r5
            boolean r4 = r4.c
            if (r4 == 0) goto L_0x0517
            int r4 = r2.flags
            r5 = 1
            r4 = r4 & r5
            if (r4 == 0) goto L_0x0515
            goto L_0x0517
        L_0x0515:
            r1.i = r5
        L_0x0517:
            boolean r4 = r1.h
            if (r4 == 0) goto L_0x0521
            g65 r3 = r1.k
            java.lang.String r3 = r3.a
            goto L_0x025f
        L_0x0521:
            g65 r4 = r1.k
            long r5 = r4.u
            r9 = 0
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x052f
            long r9 = r2.presentationTimeUs
            long r9 = r9 - r5
            goto L_0x0531
        L_0x052f:
            long r9 = r2.presentationTimeUs
        L_0x0531:
            long r5 = r1.g
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x054a
            java.lang.String r3 = r4.a
            boolean r3 = r4.c
            if (r3 == 0) goto L_0x0547
            int r3 = r2.flags
            r5 = 1
            r3 = r3 & r5
            if (r3 == 0) goto L_0x025f
            r1.i = r5
            goto L_0x025f
        L_0x0547:
            r5 = 1
            goto L_0x025f
        L_0x054a:
            r5 = 1
            boolean r6 = r1.d
            if (r6 != 0) goto L_0x0559
            boolean r7 = r1.i
            if (r7 != 0) goto L_0x0559
            boolean r7 = r4.c
            if (r7 == 0) goto L_0x0559
            r1.i = r5
        L_0x0559:
            boolean r7 = r1.i
            if (r7 == 0) goto L_0x0586
            int r7 = r2.flags
            r7 = r7 & r5
            if (r7 == 0) goto L_0x0567
            r5 = 0
            r1.i = r5
            r7 = 1
            goto L_0x0588
        L_0x0567:
            r5 = 0
            java.lang.String r3 = r4.a
            r4.g()
        L_0x056d:
            g65 r3 = r1.k     // Catch:{ CodecException -> 0x0576 }
            android.media.MediaCodec r3 = r3.e     // Catch:{ CodecException -> 0x0576 }
            r3.releaseOutputBuffer(r0, r5)     // Catch:{ CodecException -> 0x0576 }
            goto L_0x05e3
        L_0x0576:
            r0 = move-exception
            g65 r1 = r1.k
            r1.getClass()
            java.lang.String r2 = r0.getMessage()
            r7 = 1
            r1.b(r7, r2, r0)
            goto L_0x0620
        L_0x0586:
            r7 = r5
            r5 = 0
        L_0x0588:
            if (r6 != 0) goto L_0x0599
            r1.d = r7
            java.lang.String r6 = r4.a
            xjf r4 = r4.p
            java.util.Objects.toString(r4)
            android.os.SystemClock.uptimeMillis()
            android.os.SystemClock.elapsedRealtime()
        L_0x0599:
            g65 r4 = r1.k
            long r6 = r4.u
            r9 = 0
            int r4 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r4 <= 0) goto L_0x05a9
            long r9 = r2.presentationTimeUs
            long r9 = r9 - r6
        L_0x05a6:
            r20 = r9
            goto L_0x05ac
        L_0x05a9:
            long r9 = r2.presentationTimeUs
            goto L_0x05a6
        L_0x05ac:
            long r6 = r2.presentationTimeUs
            int r4 = (r6 > r20 ? 1 : (r6 == r20 ? 0 : -1))
            if (r4 != 0) goto L_0x05b4
            r4 = r2
            goto L_0x05d5
        L_0x05b4:
            long r6 = r1.g
            int r4 = (r20 > r6 ? 1 : (r20 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x05bb
            r5 = 1
        L_0x05bb:
            r4 = 0
            defpackage.bs0.r(r4, r5)
            android.media.MediaCodec$BufferInfo r4 = new android.media.MediaCodec$BufferInfo
            r4.<init>()
            int r5 = r2.offset
            int r6 = r2.size
            int r7 = r2.flags
            r17 = r4
            r18 = r5
            r19 = r6
            r22 = r7
            r17.set(r18, r19, r20, r22)
        L_0x05d5:
            long r5 = r4.presentationTimeUs
            r1.g = r5
            h55 r5 = new h55     // Catch:{ CodecException -> 0x060e }
            r5.<init>(r3, r0, r4)     // Catch:{ CodecException -> 0x060e }
            r0 = r16
            r1.b(r5, r8, r0)     // Catch:{ CodecException -> 0x060e }
        L_0x05e3:
            boolean r0 = r1.e
            if (r0 != 0) goto L_0x0620
            int r0 = r2.flags
            r0 = r0 & 4
            if (r0 == 0) goto L_0x05ee
            goto L_0x060a
        L_0x05ee:
            boolean r0 = r1.b
            if (r0 == 0) goto L_0x0620
            g65 r0 = r1.k
            boolean r3 = r0.B
            if (r3 == 0) goto L_0x0620
            long r2 = r2.presentationTimeUs
            android.util.Range r0 = r0.t
            java.lang.Comparable r0 = r0.getUpper()
            java.lang.Long r0 = (java.lang.Long) r0
            long r4 = r0.longValue()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0620
        L_0x060a:
            r1.a()
            goto L_0x0620
        L_0x060e:
            r0 = move-exception
            g65 r1 = r1.k
            r1.getClass()
            java.lang.String r2 = r0.getMessage()
            r3 = 1
            r1.b(r3, r2, r0)
            goto L_0x0620
        L_0x061d:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x061d }
            throw r0
        L_0x0620:
            return
        L_0x0621:
            java.lang.Object r1 = r0.c
            g65 r1 = (defpackage.g65) r1
            int r2 = r0.b
            java.lang.Object r3 = r0.o
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r0.v
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1.d(r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w55.run():void");
    }

    public /* synthetic */ w55(Object obj, int i, Object obj2, Object obj3, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.o = obj2;
        this.v = obj3;
    }

    public /* synthetic */ w55(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.o = obj2;
        this.v = obj3;
        this.b = i;
    }
}
