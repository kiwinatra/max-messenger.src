package one.me.rlottie;

public final class i implements Runnable {
    public final /* synthetic */ RLottieDrawable a;

    public i(RLottieDrawable rLottieDrawable) {
        this.a = rLottieDrawable;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e3 A[Catch:{ Exception -> 0x00fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x012e A[Catch:{ Exception -> 0x0107 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x013c A[Catch:{ Exception -> 0x0107 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01a4 A[Catch:{ Exception -> 0x0107 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01c0 A[Catch:{ Exception -> 0x0107 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r20 = this;
            r1 = r20
            one.me.rlottie.RLottieDrawable r0 = r1.a
            boolean r0 = r0.a1
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            one.me.rlottie.RLottieDrawable r0 = r1.a
            boolean r0 = r0.canLoadFrames()
            if (r0 != 0) goto L_0x002d
            one.me.rlottie.RLottie$Logger r0 = one.me.rlottie.RLottie.getLogger()
            java.lang.String r2 = "RLottieDrawable. Load frame !canLoadFrames()"
            r0.d(r2)
            one.me.rlottie.RLottieDrawable r0 = r1.a
            java.util.concurrent.CountDownLatch r0 = r0.K0
            if (r0 == 0) goto L_0x0023
            r0.countDown()
        L_0x0023:
            android.os.Handler r0 = one.me.rlottie.RLottieDrawable.F1
            one.me.rlottie.RLottieDrawable r1 = r1.a
            qoc r1 = r1.l1
            r0.post(r1)
            return
        L_0x002d:
            one.me.rlottie.RLottieDrawable r0 = r1.a
            android.graphics.Bitmap r0 = r0.I0
            if (r0 != 0) goto L_0x004a
            one.me.rlottie.RLottieDrawable r0 = r1.a     // Catch:{ all -> 0x0042 }
            int r2 = r0.a     // Catch:{ all -> 0x0042 }
            int r3 = r0.b     // Catch:{ all -> 0x0042 }
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x0042 }
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r3, r4)     // Catch:{ all -> 0x0042 }
            r0.I0 = r2     // Catch:{ all -> 0x0042 }
            goto L_0x004a
        L_0x0042:
            r0 = move-exception
            one.me.rlottie.RLottie$Logger r2 = one.me.rlottie.RLottie.getLogger()
            r2.e(r0)
        L_0x004a:
            one.me.rlottie.RLottieDrawable r0 = r1.a
            android.graphics.Bitmap r0 = r0.I0
            if (r0 == 0) goto L_0x0285
            one.me.rlottie.RLottieDrawable r0 = r1.a     // Catch:{ Exception -> 0x0091 }
            java.util.HashMap r0 = r0.X     // Catch:{ Exception -> 0x0091 }
            boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x0091 }
            if (r0 != 0) goto L_0x0091
            one.me.rlottie.RLottieDrawable r0 = r1.a     // Catch:{ Exception -> 0x0091 }
            java.util.HashMap r0 = r0.X     // Catch:{ Exception -> 0x0091 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ Exception -> 0x0091 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0091 }
        L_0x0066:
            boolean r2 = r0.hasNext()     // Catch:{ Exception -> 0x0091 }
            if (r2 == 0) goto L_0x008a
            java.lang.Object r2 = r0.next()     // Catch:{ Exception -> 0x0091 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ Exception -> 0x0091 }
            one.me.rlottie.RLottieDrawable r3 = r1.a     // Catch:{ Exception -> 0x0091 }
            long r3 = r3.b1     // Catch:{ Exception -> 0x0091 }
            java.lang.Object r5 = r2.getKey()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0091 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ Exception -> 0x0091 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Exception -> 0x0091 }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x0091 }
            one.me.rlottie.RLottieDrawable.setLayerColor(r3, r5, r2)     // Catch:{ Exception -> 0x0091 }
            goto L_0x0066
        L_0x008a:
            one.me.rlottie.RLottieDrawable r0 = r1.a     // Catch:{ Exception -> 0x0091 }
            java.util.HashMap r0 = r0.X     // Catch:{ Exception -> 0x0091 }
            r0.clear()     // Catch:{ Exception -> 0x0091 }
        L_0x0091:
            one.me.rlottie.RLottieDrawable r0 = r1.a
            int[] r2 = r0.y
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x00af
            long r6 = r0.b1
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00af
            one.me.rlottie.RLottieDrawable r0 = r1.a
            long r6 = r0.b1
            one.me.rlottie.RLottieDrawable r0 = r1.a
            int[] r0 = r0.y
            one.me.rlottie.RLottieDrawable.replaceColors(r6, r0)
            one.me.rlottie.RLottieDrawable r0 = r1.a
            r0.y = r3
        L_0x00af:
            one.me.rlottie.RLottieDrawable r0 = r1.a     // Catch:{ Exception -> 0x0107 }
            boolean r0 = r0.R0     // Catch:{ Exception -> 0x0107 }
            r2 = 1
            r6 = 2
            if (r0 == 0) goto L_0x00b9
            r7 = r6
            goto L_0x00ba
        L_0x00b9:
            r7 = r2
        L_0x00ba:
            java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0107 }
            one.me.rlottie.RLottieDrawable r0 = r1.a     // Catch:{ Exception -> 0x0107 }
            boolean r8 = r0.g1     // Catch:{ Exception -> 0x0107 }
            r9 = 0
            if (r8 == 0) goto L_0x010a
            one.me.rlottie.c r8 = r0.q1     // Catch:{ Exception -> 0x0107 }
            if (r8 == 0) goto L_0x010a
            int r10 = r0.Q0     // Catch:{ Exception -> 0x00fd }
            int r10 = r10 / r7
            android.graphics.Bitmap r0 = r0.I0     // Catch:{ Exception -> 0x00fd }
            int r8 = r8.f(r0, r10)     // Catch:{ Exception -> 0x00fd }
            one.me.rlottie.RLottieDrawable r0 = r1.a     // Catch:{ Exception -> 0x00fb }
            one.me.rlottie.c r0 = r0.q1     // Catch:{ Exception -> 0x00fb }
            boolean r10 = r0.q     // Catch:{ Exception -> 0x00fb }
            if (r10 == 0) goto L_0x00e0
            boolean r0 = r0.j     // Catch:{ Exception -> 0x00fb }
            if (r0 != 0) goto L_0x00de
            goto L_0x00e0
        L_0x00de:
            r0 = r9
            goto L_0x00e1
        L_0x00e0:
            r0 = r2
        L_0x00e1:
            if (r0 != 0) goto L_0x0126
            one.me.rlottie.RLottieDrawable r0 = r1.a     // Catch:{ Exception -> 0x00fb }
            boolean r10 = r0.t1     // Catch:{ Exception -> 0x00fb }
            if (r10 == 0) goto L_0x0126
            long r10 = r0.b1     // Catch:{ Exception -> 0x00fb }
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0126
            one.me.rlottie.RLottieDrawable r0 = r1.a     // Catch:{ Exception -> 0x00fb }
            long r10 = r0.b1     // Catch:{ Exception -> 0x00fb }
            one.me.rlottie.RLottieDrawable.destroy(r10)     // Catch:{ Exception -> 0x00fb }
            one.me.rlottie.RLottieDrawable r0 = r1.a     // Catch:{ Exception -> 0x00fb }
            r0.b1 = r4     // Catch:{ Exception -> 0x00fb }
            goto L_0x0126
        L_0x00fb:
            r0 = move-exception
            goto L_0x00ff
        L_0x00fd:
            r0 = move-exception
            r8 = r9
        L_0x00ff:
            one.me.rlottie.RLottie$Logger r10 = one.me.rlottie.RLottie.getLogger()     // Catch:{ Exception -> 0x0107 }
            r10.e(r0)     // Catch:{ Exception -> 0x0107 }
            goto L_0x0126
        L_0x0107:
            r0 = move-exception
            goto L_0x027d
        L_0x010a:
            long r11 = r0.b1     // Catch:{ Exception -> 0x0107 }
            one.me.rlottie.RLottieDrawable r0 = r1.a     // Catch:{ Exception -> 0x0107 }
            int r13 = r0.Q0     // Catch:{ Exception -> 0x0107 }
            android.graphics.Bitmap r14 = r0.I0     // Catch:{ Exception -> 0x0107 }
            one.me.rlottie.RLottieDrawable r0 = r1.a     // Catch:{ Exception -> 0x0107 }
            int r15 = r0.a     // Catch:{ Exception -> 0x0107 }
            int r8 = r0.b     // Catch:{ Exception -> 0x0107 }
            android.graphics.Bitmap r0 = r0.I0     // Catch:{ Exception -> 0x0107 }
            int r17 = r0.getRowBytes()     // Catch:{ Exception -> 0x0107 }
            r18 = 1
            r16 = r8
            int r8 = one.me.rlottie.RLottieDrawable.getFrame(r11, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x0107 }
        L_0x0126:
            one.me.rlottie.RLottieDrawable r0 = r1.a     // Catch:{ Exception -> 0x0107 }
            one.me.rlottie.c r0 = r0.q1     // Catch:{ Exception -> 0x0107 }
            r10 = -1
            r11 = 3
            if (r0 == 0) goto L_0x01a2
            boolean r12 = r0.q     // Catch:{ Exception -> 0x0107 }
            if (r12 == 0) goto L_0x0139
            boolean r0 = r0.j     // Catch:{ Exception -> 0x0107 }
            if (r0 != 0) goto L_0x0137
            goto L_0x0139
        L_0x0137:
            r0 = r9
            goto L_0x013a
        L_0x0139:
            r0 = r2
        L_0x013a:
            if (r0 == 0) goto L_0x01a2
            one.me.rlottie.RLottieDrawable r0 = r1.a     // Catch:{ Exception -> 0x0107 }
            boolean r8 = r0.s1     // Catch:{ Exception -> 0x0107 }
            if (r8 != 0) goto L_0x014b
            r0.s1 = r2     // Catch:{ Exception -> 0x0107 }
            android.os.Handler r8 = one.me.rlottie.RLottieDrawable.F1     // Catch:{ Exception -> 0x0107 }
            qoc r0 = r0.o1     // Catch:{ Exception -> 0x0107 }
            r8.post(r0)     // Catch:{ Exception -> 0x0107 }
        L_0x014b:
            one.me.rlottie.RLottieDrawable r0 = r1.a     // Catch:{ Exception -> 0x0107 }
            boolean r8 = r0.t1     // Catch:{ Exception -> 0x0107 }
            if (r8 == 0) goto L_0x01a1
            long r12 = r0.b1     // Catch:{ Exception -> 0x0107 }
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0180
            one.me.rlottie.RLottieDrawable r0 = r1.a     // Catch:{ Exception -> 0x0107 }
            g7a r4 = r0.k1     // Catch:{ Exception -> 0x0107 }
            java.lang.Object r4 = r4.c     // Catch:{ Exception -> 0x0107 }
            java.io.File r4 = (java.io.File) r4     // Catch:{ Exception -> 0x0107 }
            java.lang.String r12 = r4.toString()     // Catch:{ Exception -> 0x0107 }
            one.me.rlottie.RLottieDrawable r4 = r1.a     // Catch:{ Exception -> 0x0107 }
            g7a r5 = r4.k1     // Catch:{ Exception -> 0x0107 }
            r5.getClass()     // Catch:{ Exception -> 0x0107 }
            int r13 = r4.a     // Catch:{ Exception -> 0x0107 }
            int r14 = r4.b     // Catch:{ Exception -> 0x0107 }
            int[] r15 = new int[r11]     // Catch:{ Exception -> 0x0107 }
            java.lang.Object r4 = r5.b     // Catch:{ Exception -> 0x0107 }
            r16 = r4
            int[] r16 = (int[]) r16     // Catch:{ Exception -> 0x0107 }
            int r4 = r5.a     // Catch:{ Exception -> 0x0107 }
            r17 = r4
            long r4 = one.me.rlottie.RLottieDrawable.create(r12, (java.lang.String) null, r13, r14, r15, false, r16, false, r17)     // Catch:{ Exception -> 0x0107 }
            r0.b1 = r4     // Catch:{ Exception -> 0x0107 }
        L_0x0180:
            one.me.rlottie.RLottieDrawable r0 = r1.a     // Catch:{ Exception -> 0x0107 }
            long r12 = r0.b1     // Catch:{ Exception -> 0x0107 }
            one.me.rlottie.RLottieDrawable r0 = r1.a     // Catch:{ Exception -> 0x0107 }
            int r14 = r0.Q0     // Catch:{ Exception -> 0x0107 }
            android.graphics.Bitmap r15 = r0.I0     // Catch:{ Exception -> 0x0107 }
            one.me.rlottie.RLottieDrawable r0 = r1.a     // Catch:{ Exception -> 0x0107 }
            int r4 = r0.a     // Catch:{ Exception -> 0x0107 }
            int r5 = r0.b     // Catch:{ Exception -> 0x0107 }
            android.graphics.Bitmap r0 = r0.I0     // Catch:{ Exception -> 0x0107 }
            int r18 = r0.getRowBytes()     // Catch:{ Exception -> 0x0107 }
            r19 = 1
            r16 = r4
            r17 = r5
            int r8 = one.me.rlottie.RLottieDrawable.getFrame(r12, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x0107 }
            goto L_0x01a2
        L_0x01a1:
            r8 = r10
        L_0x01a2:
            if (r8 != r10) goto L_0x01c0
            one.me.rlottie.RLottie$Logger r0 = one.me.rlottie.RLottie.getLogger()     // Catch:{ Exception -> 0x0107 }
            java.lang.String r2 = "RLottieDrawable. Load frame result == -1"
            r0.d(r2)     // Catch:{ Exception -> 0x0107 }
            android.os.Handler r0 = one.me.rlottie.RLottieDrawable.F1     // Catch:{ Exception -> 0x0107 }
            one.me.rlottie.RLottieDrawable r2 = r1.a     // Catch:{ Exception -> 0x0107 }
            qoc r2 = r2.l1     // Catch:{ Exception -> 0x0107 }
            r0.post(r2)     // Catch:{ Exception -> 0x0107 }
            one.me.rlottie.RLottieDrawable r0 = r1.a     // Catch:{ Exception -> 0x0107 }
            java.util.concurrent.CountDownLatch r0 = r0.K0     // Catch:{ Exception -> 0x0107 }
            if (r0 == 0) goto L_0x01bf
            r0.countDown()     // Catch:{ Exception -> 0x0107 }
        L_0x01bf:
            return
        L_0x01c0:
            one.me.rlottie.RLottieDrawable r0 = r1.a     // Catch:{ Exception -> 0x0107 }
            android.graphics.Bitmap r4 = r0.I0     // Catch:{ Exception -> 0x0107 }
            r0.H0 = r4     // Catch:{ Exception -> 0x0107 }
            one.me.rlottie.RLottieDrawable r0 = r1.a     // Catch:{ Exception -> 0x0107 }
            int r4 = r0.v     // Catch:{ Exception -> 0x0107 }
            if (r4 < 0) goto L_0x01f8
            boolean r5 = r0.w     // Catch:{ Exception -> 0x0107 }
            if (r5 == 0) goto L_0x01f8
            int r3 = r0.Q0     // Catch:{ Exception -> 0x0107 }
            if (r3 <= r4) goto L_0x01e6
            int r3 = r3 - r7
            if (r3 < r4) goto L_0x01dd
            r0.Q0 = r3     // Catch:{ Exception -> 0x0107 }
            r0.D0 = r9     // Catch:{ Exception -> 0x0107 }
            goto L_0x028e
        L_0x01dd:
            r0.D0 = r2     // Catch:{ Exception -> 0x0107 }
            one.me.rlottie.RLottieDrawable r0 = r1.a     // Catch:{ Exception -> 0x0107 }
            one.me.rlottie.RLottieDrawable.c(r0)     // Catch:{ Exception -> 0x0107 }
            goto L_0x028e
        L_0x01e6:
            int r3 = r3 + r7
            if (r3 >= r4) goto L_0x01ef
            r0.Q0 = r3     // Catch:{ Exception -> 0x0107 }
            r0.D0 = r9     // Catch:{ Exception -> 0x0107 }
            goto L_0x028e
        L_0x01ef:
            r0.D0 = r2     // Catch:{ Exception -> 0x0107 }
            one.me.rlottie.RLottieDrawable r0 = r1.a     // Catch:{ Exception -> 0x0107 }
            one.me.rlottie.RLottieDrawable.c(r0)     // Catch:{ Exception -> 0x0107 }
            goto L_0x028e
        L_0x01f8:
            if (r4 < 0) goto L_0x0226
            boolean r5 = r0.w     // Catch:{ Exception -> 0x0107 }
            if (r5 == 0) goto L_0x0226
            int r3 = r0.Q0     // Catch:{ Exception -> 0x0107 }
            if (r3 <= r4) goto L_0x0214
            int r3 = r3 - r7
            if (r3 < r4) goto L_0x020b
            r0.Q0 = r3     // Catch:{ Exception -> 0x0107 }
            r0.D0 = r9     // Catch:{ Exception -> 0x0107 }
            goto L_0x028e
        L_0x020b:
            r0.D0 = r2     // Catch:{ Exception -> 0x0107 }
            one.me.rlottie.RLottieDrawable r0 = r1.a     // Catch:{ Exception -> 0x0107 }
            one.me.rlottie.RLottieDrawable.c(r0)     // Catch:{ Exception -> 0x0107 }
            goto L_0x028e
        L_0x0214:
            int r3 = r3 + r7
            if (r3 >= r4) goto L_0x021d
            r0.Q0 = r3     // Catch:{ Exception -> 0x0107 }
            r0.D0 = r9     // Catch:{ Exception -> 0x0107 }
            goto L_0x028e
        L_0x021d:
            r0.D0 = r2     // Catch:{ Exception -> 0x0107 }
            one.me.rlottie.RLottieDrawable r0 = r1.a     // Catch:{ Exception -> 0x0107 }
            one.me.rlottie.RLottieDrawable.c(r0)     // Catch:{ Exception -> 0x0107 }
            goto L_0x028e
        L_0x0226:
            int r5 = r0.Q0     // Catch:{ Exception -> 0x0107 }
            int r5 = r5 + r7
            if (r4 < 0) goto L_0x022c
            goto L_0x0230
        L_0x022c:
            int[] r4 = r0.c     // Catch:{ Exception -> 0x0107 }
            r4 = r4[r9]     // Catch:{ Exception -> 0x0107 }
        L_0x0230:
            if (r5 >= r4) goto L_0x0245
            int r3 = r0.z0     // Catch:{ Exception -> 0x0107 }
            if (r3 != r11) goto L_0x0240
            r0.D0 = r2     // Catch:{ Exception -> 0x0107 }
            one.me.rlottie.RLottieDrawable r0 = r1.a     // Catch:{ Exception -> 0x0107 }
            int r3 = r0.B0     // Catch:{ Exception -> 0x0107 }
            int r3 = r3 + r2
            r0.B0 = r3     // Catch:{ Exception -> 0x0107 }
            goto L_0x028e
        L_0x0240:
            r0.Q0 = r5     // Catch:{ Exception -> 0x0107 }
            r0.D0 = r9     // Catch:{ Exception -> 0x0107 }
            goto L_0x028e
        L_0x0245:
            int r4 = r0.z0     // Catch:{ Exception -> 0x0107 }
            if (r4 != r2) goto L_0x025f
            r0.Q0 = r9     // Catch:{ Exception -> 0x0107 }
            r0.D0 = r9     // Catch:{ Exception -> 0x0107 }
            one.me.rlottie.RLottieDrawable r0 = r1.a     // Catch:{ Exception -> 0x0107 }
            boolean r4 = r0.Z     // Catch:{ Exception -> 0x0107 }
            if (r4 == 0) goto L_0x0257
            r0.Y = r3     // Catch:{ Exception -> 0x0107 }
            r0.Z = r9     // Catch:{ Exception -> 0x0107 }
        L_0x0257:
            int r3 = r0.A0     // Catch:{ Exception -> 0x0107 }
            if (r3 <= 0) goto L_0x028e
            int r3 = r3 - r2
            r0.A0 = r3     // Catch:{ Exception -> 0x0107 }
            goto L_0x028e
        L_0x025f:
            if (r4 != r6) goto L_0x0275
            r0.Q0 = r9     // Catch:{ Exception -> 0x0107 }
            r0.D0 = r2     // Catch:{ Exception -> 0x0107 }
            one.me.rlottie.RLottieDrawable r0 = r1.a     // Catch:{ Exception -> 0x0107 }
            int r4 = r0.B0     // Catch:{ Exception -> 0x0107 }
            int r4 = r4 + r2
            r0.B0 = r4     // Catch:{ Exception -> 0x0107 }
            boolean r2 = r0.Z     // Catch:{ Exception -> 0x0107 }
            if (r2 == 0) goto L_0x028e
            r0.Y = r3     // Catch:{ Exception -> 0x0107 }
            r0.Z = r9     // Catch:{ Exception -> 0x0107 }
            goto L_0x028e
        L_0x0275:
            r0.D0 = r2     // Catch:{ Exception -> 0x0107 }
            one.me.rlottie.RLottieDrawable r0 = r1.a     // Catch:{ Exception -> 0x0107 }
            one.me.rlottie.RLottieDrawable.c(r0)     // Catch:{ Exception -> 0x0107 }
            goto L_0x028e
        L_0x027d:
            one.me.rlottie.RLottie$Logger r2 = one.me.rlottie.RLottie.getLogger()
            r2.e(r0)
            goto L_0x028e
        L_0x0285:
            one.me.rlottie.RLottie$Logger r0 = one.me.rlottie.RLottie.getLogger()
            java.lang.String r2 = "RLottieDrawable. Load frame background bitmap is null"
            r0.d(r2)
        L_0x028e:
            android.os.Handler r0 = one.me.rlottie.RLottieDrawable.F1
            one.me.rlottie.RLottieDrawable r2 = r1.a
            qoc r2 = r2.m1
            r0.post(r2)
            one.me.rlottie.RLottieDrawable r0 = r1.a
            java.util.concurrent.CountDownLatch r0 = r0.K0
            if (r0 == 0) goto L_0x02a0
            r0.countDown()
        L_0x02a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.rlottie.i.run():void");
    }
}
