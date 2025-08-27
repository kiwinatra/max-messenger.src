package defpackage;

/* renamed from: wi4  reason: default package */
public final /* synthetic */ class wi4 implements msb {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wi4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        if (r7.contains(".sw.") == false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0082, code lost:
        if (r7.startsWith("c2.") != false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c0, code lost:
        if (r4.equals("audio/ac4") == false) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x011a, code lost:
        if (r7.h.a(r7.i, r8) != false) goto L_0x011c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean apply(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 2
            r1 = 0
            r2 = 1
            int r3 = r7.a
            switch(r3) {
                case 0: goto L_0x0088;
                default: goto L_0x0008;
            }
        L_0x0008:
            android.media.MediaCodecInfo r8 = (android.media.MediaCodecInfo) r8
            ms r0 = defpackage.k65.a
            int r0 = defpackage.v0g.a
            r3 = 29
            if (r0 < r3) goto L_0x0018
            boolean r7 = defpackage.j65.a(r8)
            goto L_0x0087
        L_0x0018:
            if (r0 < r3) goto L_0x001f
            boolean r1 = defpackage.j65.b(r8)
            goto L_0x0085
        L_0x001f:
            java.lang.Object r7 = r7.b
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = defpackage.vq9.h(r7)
            if (r7 == 0) goto L_0x002b
        L_0x0029:
            r1 = r2
            goto L_0x0085
        L_0x002b:
            java.lang.String r7 = r8.getName()
            java.lang.String r7 = defpackage.o54.P(r7)
            java.lang.String r8 = "arc."
            boolean r8 = r7.startsWith(r8)
            if (r8 == 0) goto L_0x003c
            goto L_0x0085
        L_0x003c:
            java.lang.String r8 = "omx.google."
            boolean r8 = r7.startsWith(r8)
            if (r8 != 0) goto L_0x0029
            java.lang.String r8 = "omx.ffmpeg."
            boolean r8 = r7.startsWith(r8)
            if (r8 != 0) goto L_0x0029
            java.lang.String r8 = "omx.sec."
            boolean r8 = r7.startsWith(r8)
            if (r8 == 0) goto L_0x005c
            java.lang.String r8 = ".sw."
            boolean r8 = r7.contains(r8)
            if (r8 != 0) goto L_0x0029
        L_0x005c:
            java.lang.String r8 = "omx.qcom.video.decoder.hevcswvdec"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L_0x0029
            java.lang.String r8 = "c2.android."
            boolean r8 = r7.startsWith(r8)
            if (r8 != 0) goto L_0x0029
            java.lang.String r8 = "c2.google."
            boolean r8 = r7.startsWith(r8)
            if (r8 != 0) goto L_0x0029
            java.lang.String r8 = "omx."
            boolean r8 = r7.startsWith(r8)
            if (r8 != 0) goto L_0x0085
            java.lang.String r8 = "c2."
            boolean r7 = r7.startsWith(r8)
            if (r7 != 0) goto L_0x0085
            goto L_0x0029
        L_0x0085:
            r7 = r1 ^ 1
        L_0x0087:
            return r7
        L_0x0088:
            java.lang.Object r7 = r7.b
            sj4 r7 = (defpackage.sj4) r7
            ea6 r8 = (defpackage.ea6) r8
            java.lang.Object r3 = r7.c
            monitor-enter(r3)
            ej4 r4 = r7.g     // Catch:{ all -> 0x00ee }
            boolean r4 = r4.s0     // Catch:{ all -> 0x00ee }
            if (r4 == 0) goto L_0x011c
            boolean r4 = r7.f     // Catch:{ all -> 0x00ee }
            if (r4 != 0) goto L_0x011c
            int r4 = r8.B     // Catch:{ all -> 0x00ee }
            if (r4 <= r0) goto L_0x011c
            java.lang.String r4 = r8.n     // Catch:{ all -> 0x00ee }
            if (r4 != 0) goto L_0x00a5
        L_0x00a3:
            r0 = r1
            goto L_0x00dd
        L_0x00a5:
            r5 = -1
            int r6 = r4.hashCode()
            switch(r6) {
                case -2123537834: goto L_0x00ce;
                case 187078296: goto L_0x00c3;
                case 187078297: goto L_0x00ba;
                case 1504578661: goto L_0x00af;
                default: goto L_0x00ad;
            }
        L_0x00ad:
            r0 = r5
            goto L_0x00d8
        L_0x00af:
            java.lang.String r0 = "audio/eac3"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00b8
            goto L_0x00ad
        L_0x00b8:
            r0 = 3
            goto L_0x00d8
        L_0x00ba:
            java.lang.String r6 = "audio/ac4"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x00d8
            goto L_0x00ad
        L_0x00c3:
            java.lang.String r0 = "audio/ac3"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00cc
            goto L_0x00ad
        L_0x00cc:
            r0 = r2
            goto L_0x00d8
        L_0x00ce:
            java.lang.String r0 = "audio/eac3-joc"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00d7
            goto L_0x00ad
        L_0x00d7:
            r0 = r1
        L_0x00d8:
            switch(r0) {
                case 0: goto L_0x00dc;
                case 1: goto L_0x00dc;
                case 2: goto L_0x00dc;
                case 3: goto L_0x00dc;
                default: goto L_0x00db;
            }
        L_0x00db:
            goto L_0x00a3
        L_0x00dc:
            r0 = r2
        L_0x00dd:
            r4 = 32
            if (r0 == 0) goto L_0x00f0
            int r0 = defpackage.v0g.a     // Catch:{ all -> 0x00ee }
            if (r0 < r4) goto L_0x011c
            lf6 r0 = r7.h     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x011c
            boolean r0 = r0.b     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x011c
            goto L_0x00f0
        L_0x00ee:
            r7 = move-exception
            goto L_0x011f
        L_0x00f0:
            int r0 = defpackage.v0g.a     // Catch:{ all -> 0x00ee }
            if (r0 < r4) goto L_0x011d
            lf6 r0 = r7.h     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x011d
            boolean r4 = r0.b     // Catch:{ all -> 0x00ee }
            if (r4 == 0) goto L_0x011d
            java.lang.Object r0 = r0.c     // Catch:{ all -> 0x00ee }
            android.media.Spatializer r0 = (android.media.Spatializer) r0     // Catch:{ all -> 0x00ee }
            boolean r0 = r0.isAvailable()     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x011d
            lf6 r0 = r7.h     // Catch:{ all -> 0x00ee }
            java.lang.Object r0 = r0.c     // Catch:{ all -> 0x00ee }
            android.media.Spatializer r0 = (android.media.Spatializer) r0     // Catch:{ all -> 0x00ee }
            boolean r0 = r0.isEnabled()     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x011d
            lf6 r0 = r7.h     // Catch:{ all -> 0x00ee }
            i30 r7 = r7.i     // Catch:{ all -> 0x00ee }
            boolean r7 = r0.a(r7, r8)     // Catch:{ all -> 0x00ee }
            if (r7 == 0) goto L_0x011d
        L_0x011c:
            r1 = r2
        L_0x011d:
            monitor-exit(r3)     // Catch:{ all -> 0x00ee }
            return r1
        L_0x011f:
            monitor-exit(r3)     // Catch:{ all -> 0x00ee }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wi4.apply(java.lang.Object):boolean");
    }
}
