package defpackage;

/* renamed from: pn8  reason: default package */
public abstract class pn8 {
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b3, code lost:
        if (r7 == 1) goto L_0x00b9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c1 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(android.media.MediaCodecInfo.VideoCapabilities r4, int r5, int r6, double r7) {
        /*
            java.util.List r4 = r4.getSupportedPerformancePoints()
            r0 = 0
            if (r4 == 0) goto L_0x00c3
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L_0x000f
            goto L_0x00c3
        L_0x000f:
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r1 = new android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint
            int r7 = (int) r7
            r1.<init>(r5, r6, r7)
            r5 = r0
        L_0x0016:
            int r6 = r4.size()
            r7 = 2
            r8 = 1
            if (r5 >= r6) goto L_0x002f
            java.lang.Object r6 = r4.get(r5)
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r6 = (android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint) r6
            boolean r6 = r6.covers(r1)
            if (r6 == 0) goto L_0x002c
            r4 = r7
            goto L_0x0030
        L_0x002c:
            int r5 = r5 + 1
            goto L_0x0016
        L_0x002f:
            r4 = r8
        L_0x0030:
            if (r4 != r8) goto L_0x00c2
            java.lang.Boolean r5 = defpackage.kne.n
            if (r5 != 0) goto L_0x00c2
            int r5 = defpackage.v0g.a
            r6 = 35
            if (r5 < r6) goto L_0x003f
        L_0x003c:
            r8 = r0
            goto L_0x00b9
        L_0x003f:
            ba6 r5 = new ba6     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x00b9 }
            r5.<init>()     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x00b9 }
            java.lang.String r6 = "video/avc"
            java.lang.String r6 = defpackage.vq9.l(r6)     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x00b9 }
            r5.m = r6     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x00b9 }
            ea6 r6 = new ea6     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x00b9 }
            r6.<init>(r5)     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x00b9 }
            java.lang.String r5 = r6.n     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x00b9 }
            if (r5 == 0) goto L_0x00b9
            rx0 r5 = defpackage.rx0.x     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x00b9 }
            k0d r5 = defpackage.fo8.g(r5, r6, r0, r0)     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x00b9 }
            r6 = r0
        L_0x005c:
            int r1 = r5.o     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x00b9 }
            if (r6 >= r1) goto L_0x00b9
            java.lang.Object r1 = r5.get(r6)     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x00b9 }
            on8 r1 = (defpackage.on8) r1     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x00b9 }
            android.media.MediaCodecInfo$CodecCapabilities r1 = r1.d     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x00b9 }
            if (r1 == 0) goto L_0x00b6
            java.lang.Object r1 = r5.get(r6)     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x00b9 }
            on8 r1 = (defpackage.on8) r1     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x00b9 }
            android.media.MediaCodecInfo$CodecCapabilities r1 = r1.d     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x00b9 }
            android.media.MediaCodecInfo$VideoCapabilities r1 = r1.getVideoCapabilities()     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x00b9 }
            if (r1 == 0) goto L_0x00b6
            java.lang.Object r1 = r5.get(r6)     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x00b9 }
            on8 r1 = (defpackage.on8) r1     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x00b9 }
            android.media.MediaCodecInfo$CodecCapabilities r1 = r1.d     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x00b9 }
            android.media.MediaCodecInfo$VideoCapabilities r1 = r1.getVideoCapabilities()     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x00b9 }
            java.util.List r1 = r1.getSupportedPerformancePoints()     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x00b9 }
            if (r1 == 0) goto L_0x00b6
            boolean r2 = r1.isEmpty()     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x00b9 }
            if (r2 != 0) goto L_0x00b6
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r5 = new android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x00b9 }
            r6 = 1280(0x500, float:1.794E-42)
            r2 = 720(0x2d0, float:1.009E-42)
            r3 = 60
            r5.<init>(r6, r2, r3)     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x00b9 }
            r6 = r0
        L_0x009c:
            int r2 = r1.size()     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x00b9 }
            if (r6 >= r2) goto L_0x00b2
            java.lang.Object r2 = r1.get(r6)     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x00b9 }
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r2 = (android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint) r2     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x00b9 }
            boolean r2 = r2.covers(r5)     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x00b9 }
            if (r2 == 0) goto L_0x00af
            goto L_0x00b3
        L_0x00af:
            int r6 = r6 + 1
            goto L_0x009c
        L_0x00b2:
            r7 = r8
        L_0x00b3:
            if (r7 != r8) goto L_0x003c
            goto L_0x00b9
        L_0x00b6:
            int r6 = r6 + 1
            goto L_0x005c
        L_0x00b9:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r8)
            defpackage.kne.n = r5
            if (r8 == 0) goto L_0x00c2
            return r0
        L_0x00c2:
            return r4
        L_0x00c3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pn8.a(android.media.MediaCodecInfo$VideoCapabilities, int, int, double):int");
    }
}
