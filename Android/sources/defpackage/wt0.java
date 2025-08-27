package defpackage;

/* renamed from: wt0  reason: default package */
public final /* synthetic */ class wt0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object o;

    public /* synthetic */ wt0(Object obj, int i, int i2, int i3) {
        this.a = i3;
        this.o = obj;
        this.b = i;
        this.c = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0172, code lost:
        r12 = r9.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01b8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01b9, code lost:
        kotlin.io.CloseableKt.closeFinally(r12, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01bc, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            r0 = 1
            r1 = 0
            int r2 = r14.a
            switch(r2) {
                case 0: goto L_0x00a8;
                case 1: goto L_0x007c;
                case 2: goto L_0x006a;
                case 3: goto L_0x005a;
                case 4: goto L_0x0048;
                case 5: goto L_0x002b;
                case 6: goto L_0x001f;
                case 7: goto L_0x0013;
                default: goto L_0x0007;
            }
        L_0x0007:
            int r0 = r14.b
            int r1 = r14.c
            java.lang.Object r14 = r14.o
            ru.ok.android.externcalls.sdk.ui.TextureViewRenderer r14 = (ru.ok.android.externcalls.sdk.ui.TextureViewRenderer) r14
            ru.ok.android.externcalls.sdk.ui.TextureViewRenderer.updateFrameDimensionsAndReportEvents$lambda$8(r14, r0, r1)
            return
        L_0x0013:
            int r0 = r14.b
            int r1 = r14.c
            java.lang.Object r14 = r14.o
            org.webrtc.SurfaceViewRenderer r14 = (org.webrtc.SurfaceViewRenderer) r14
            r14.lambda$onFrameResolutionChanged$0(r0, r1)
            return
        L_0x001f:
            int r0 = r14.b
            int r1 = r14.c
            java.lang.Object r14 = r14.o
            org.webrtc.SurfaceTextureHelper r14 = (org.webrtc.SurfaceTextureHelper) r14
            r14.lambda$setTextureSize$2(r0, r1)
            return
        L_0x002b:
            java.lang.Object r2 = r14.o
            q3f r2 = (defpackage.q3f) r2
            int r3 = r2.i
            int r4 = r14.b
            if (r3 == r4) goto L_0x0038
            r2.i = r4
            r1 = r0
        L_0x0038:
            int r3 = r2.h
            int r14 = r14.c
            if (r3 == r14) goto L_0x0041
            r2.h = r14
            goto L_0x0042
        L_0x0041:
            r0 = r1
        L_0x0042:
            if (r0 == 0) goto L_0x0047
            r2.f()
        L_0x0047:
            return
        L_0x0048:
            java.lang.Object r0 = r14.o
            jz2 r0 = (defpackage.jz2) r0
            java.lang.Object r0 = r0.c
            cce r0 = (defpackage.cce) r0
            k6g r0 = r0.o
            int r1 = r14.b
            int r14 = r14.c
            r0.g(r1, r14)
            return
        L_0x005a:
            java.lang.Object r0 = r14.o
            lhd r0 = (defpackage.lhd) r0
            xd6 r0 = r0.o
            if (r0 == 0) goto L_0x0069
            int r1 = r14.b
            int r14 = r14.c
            r0.a(r1, r14)
        L_0x0069:
            return
        L_0x006a:
            java.lang.Object r0 = r14.o
            vs6 r0 = (defpackage.vs6) r0
            java.lang.Object r0 = r0.b
            qrf r0 = (defpackage.qrf) r0
            k6g r0 = r0.v
            int r1 = r14.b
            int r14 = r14.c
            r0.g(r1, r14)
            return
        L_0x007c:
            java.lang.Object r0 = r14.o
            xd6 r0 = (defpackage.xd6) r0
            int r2 = r14.b
            int r14 = r14.c
            boolean r3 = r0.z
            if (r3 == 0) goto L_0x00a7
            boolean r3 = r0.X
            if (r3 == 0) goto L_0x00a7
            org.webrtc.ScreenCapturerAndroid r3 = r0.w
            if (r3 == 0) goto L_0x00a7
            org.webrtc.ScreenCapturerAndroid r3 = r0.w     // Catch:{ all -> 0x0096 }
            r3.changeCaptureFormat(r2, r14, r1)     // Catch:{ all -> 0x0096 }
            goto L_0x00a7
        L_0x0096:
            r14 = move-exception
            voc r0 = r0.c
            ru.ok.android.webrtc.protocol.screenshare.send.impl.ScreenShareException r1 = new ru.ok.android.webrtc.protocol.screenshare.send.impl.ScreenShareException
            java.lang.String r2 = "Error change capture format"
            r1.<init>(r2, r14)
            java.lang.String r14 = "FrameCapturerImpl"
            java.lang.String r2 = ""
            r0.reportException(r14, r2, r1)
        L_0x00a7:
            return
        L_0x00a8:
            java.lang.Object r2 = r14.o
            yt0 r2 = (defpackage.yt0) r2
            int r3 = r14.b
            int r14 = r14.c
        L_0x00b0:
            int r4 = r2.j
            int r4 = kotlin.ranges.RangesKt.coerceAtLeast((int) r4, (int) r1)
            jq5 r5 = r2.i
            int r6 = r2.e
            r5.getClass()
            kotlin.ranges.IntRange r6 = kotlin.ranges.RangesKt.until((int) r1, (int) r6)
            java.util.ArrayList r7 = new java.util.ArrayList
            int r8 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r6, 10)
            r7.<init>(r8)
            java.util.Iterator r6 = r6.iterator()
        L_0x00ce:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x00e8
            r8 = r6
            kotlin.collections.IntIterator r8 = (kotlin.collections.IntIterator) r8
            int r8 = r8.nextInt()
            int r8 = r8 + r4
            int r8 = r5.a(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7.add(r8)
            goto L_0x00ce
        L_0x00e8:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r7.iterator()
        L_0x00f1:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0112
            java.lang.Object r6 = r5.next()
            r7 = r6
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            java.util.Set r8 = r2.l
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r7 = r8.contains(r7)
            if (r7 == 0) goto L_0x00f1
            r4.add(r6)
            goto L_0x00f1
        L_0x0112:
            java.util.Set r5 = kotlin.collections.CollectionsKt.toSet(r4)
            java.util.ArrayDeque r6 = new java.util.ArrayDeque
            java.util.concurrent.ConcurrentHashMap r7 = r2.f
            java.util.Set r7 = r7.keySet()
            java.util.Set r7 = kotlin.collections.SetsKt.minus(r7, r5)
            r6.<init>(r7)
            java.util.Iterator r7 = r4.iterator()
        L_0x0129:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x01bd
            java.lang.Object r8 = r7.next()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            java.util.concurrent.ConcurrentHashMap r9 = r2.f
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            java.lang.Object r9 = r9.get(r10)
            if (r9 == 0) goto L_0x0146
            goto L_0x0129
        L_0x0146:
            int r9 = r2.j
            r10 = -1
            if (r9 == r10) goto L_0x0157
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            boolean r9 = r5.contains(r9)
            if (r9 != 0) goto L_0x0157
            goto L_0x00b0
        L_0x0157:
            java.lang.Object r9 = r6.pollFirst()
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r9 == 0) goto L_0x0163
            int r10 = r9.intValue()
        L_0x0163:
            java.util.concurrent.ConcurrentHashMap r9 = r2.f
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            java.lang.Object r9 = r9.get(r11)
            xt0 r9 = (defpackage.xt0) r9
            r11 = 0
            if (r9 == 0) goto L_0x017b
            y33 r12 = r9.a
            if (r12 == 0) goto L_0x017b
            y33 r12 = r12.n()
            goto L_0x017c
        L_0x017b:
            r12 = r11
        L_0x017c:
            if (r12 == 0) goto L_0x017f
            goto L_0x0196
        L_0x017f:
            xt0 r9 = new xt0
            ynb r12 = r2.a
            r12.getClass()
            android.graphics.Bitmap$Config r13 = android.graphics.Bitmap.Config.ARGB_8888
            y33 r12 = r12.c(r3, r14, r13)
            r13 = r12
            jd4 r13 = (defpackage.jd4) r13
            r9.<init>(r13)
            y33 r12 = r12.m()
        L_0x0196:
            r9.b = r0
            r2.f(r8, r12)     // Catch:{ all -> 0x01b6 }
            kotlin.Unit r13 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x01b6 }
            kotlin.io.CloseableKt.closeFinally(r12, r11)
            java.util.concurrent.ConcurrentHashMap r11 = r2.f
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r11.remove(r10)
            r9.b = r1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.util.concurrent.ConcurrentHashMap r10 = r2.f
            r10.put(r8, r9)
            goto L_0x0129
        L_0x01b6:
            r14 = move-exception
            throw r14     // Catch:{ all -> 0x01b8 }
        L_0x01b8:
            r0 = move-exception
            kotlin.io.CloseableKt.closeFinally(r12, r14)
            throw r0
        L_0x01bd:
            boolean r14 = r4.isEmpty()
            r3 = 1056964608(0x3f000000, float:0.5)
            if (r14 == 0) goto L_0x01cb
            int r14 = r2.e
            float r14 = (float) r14
            float r14 = r14 * r3
            int r14 = (int) r14
            goto L_0x01e1
        L_0x01cb:
            int r14 = r4.size()
            float r5 = (float) r14
            float r5 = r5 * r3
            int r3 = (int) r5
            int r14 = r14 - r0
            int r14 = kotlin.ranges.RangesKt.coerceIn((int) r3, (int) r1, (int) r14)
            java.lang.Object r14 = r4.get(r14)
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
        L_0x01e1:
            r2.g = r14
            r2.h = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wt0.run():void");
    }
}
