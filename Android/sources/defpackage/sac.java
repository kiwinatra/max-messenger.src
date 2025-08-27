package defpackage;

/* renamed from: sac  reason: default package */
public abstract class sac {
    static {
        qac qac = qac.P_2160;
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x020e A[SYNTHETIC, Splitter:B:125:0x020e] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01eb A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b3 A[SYNTHETIC, Splitter:B:49:0x00b3] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c7 A[SYNTHETIC, Splitter:B:58:0x00c7] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00d2 A[SYNTHETIC, Splitter:B:63:0x00d2] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList a(android.net.Uri r30, android.content.Context r31, defpackage.wj0 r32) {
        /*
            java.lang.String r2 = "sac"
            java.lang.String r3 = "fail to release"
            r4 = 0
            r5 = 0
            android.media.MediaMetadataRetriever r6 = new android.media.MediaMetadataRetriever     // Catch:{ IllegalArgumentException -> 0x00a8, RuntimeException -> 0x00a3, all -> 0x00a0 }
            r6.<init>()     // Catch:{ IllegalArgumentException -> 0x00a8, RuntimeException -> 0x00a3, all -> 0x00a0 }
            r7 = r30
            r0 = r31
            r6.setDataSource(r0, r7)     // Catch:{ IllegalArgumentException -> 0x00ba, RuntimeException -> 0x003d }
            r0 = 12
            java.lang.String r0 = r6.extractMetadata(r0)     // Catch:{ IllegalArgumentException -> 0x00ba, RuntimeException -> 0x003d }
            r8 = 18
            java.lang.String r8 = r6.extractMetadata(r8)     // Catch:{ IllegalArgumentException -> 0x00ba, RuntimeException -> 0x003d }
            r9 = 19
            java.lang.String r9 = r6.extractMetadata(r9)     // Catch:{ IllegalArgumentException -> 0x00ba, RuntimeException -> 0x003d }
            r10 = 20
            java.lang.String r10 = r6.extractMetadata(r10)     // Catch:{ IllegalArgumentException -> 0x00ba, RuntimeException -> 0x003d }
            r11 = 24
            java.lang.String r11 = r6.extractMetadata(r11)     // Catch:{ IllegalArgumentException -> 0x00ba, RuntimeException -> 0x003d }
            if (r11 == 0) goto L_0x0040
            int r11 = java.lang.Integer.parseInt(r11)     // Catch:{ IllegalArgumentException -> 0x00ba, RuntimeException -> 0x003d }
            goto L_0x0041
        L_0x0037:
            r0 = move-exception
            r1 = r2
            r4 = r6
        L_0x003a:
            r2 = r0
            goto L_0x020c
        L_0x003d:
            r0 = move-exception
            goto L_0x00aa
        L_0x0040:
            r11 = r5
        L_0x0041:
            if (r8 == 0) goto L_0x0095
            if (r9 != 0) goto L_0x0046
            goto L_0x0095
        L_0x0046:
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ IllegalArgumentException -> 0x00ba, RuntimeException -> 0x003d }
            int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ IllegalArgumentException -> 0x00ba, RuntimeException -> 0x003d }
            int r11 = r11 % 180
            r12 = 90
            if (r11 != r12) goto L_0x0057
            r15 = r8
            r14 = r9
            goto L_0x0059
        L_0x0057:
            r14 = r8
            r15 = r9
        L_0x0059:
            if (r10 == 0) goto L_0x0066
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)     // Catch:{ IllegalArgumentException -> 0x00ba, RuntimeException -> 0x003d }
            int r8 = r8.intValue()     // Catch:{ IllegalArgumentException -> 0x00ba, RuntimeException -> 0x003d }
            r16 = r8
            goto L_0x0068
        L_0x0066:
            r16 = r5
        L_0x0068:
            java.lang.String r8 = r30.toString()     // Catch:{ IllegalArgumentException -> 0x00ba, RuntimeException -> 0x003d }
            r9 = r32
            sv3 r8 = r9.c(r8)     // Catch:{ IllegalArgumentException -> 0x00ba, RuntimeException -> 0x003d }
            if (r8 == 0) goto L_0x0079
            long r8 = r8.b     // Catch:{ IllegalArgumentException -> 0x00ba, RuntimeException -> 0x003d }
        L_0x0076:
            r17 = r8
            goto L_0x007c
        L_0x0079:
            r8 = 0
            goto L_0x0076
        L_0x007c:
            o9a r8 = defpackage.sq9.b     // Catch:{ IllegalArgumentException -> 0x00ba, RuntimeException -> 0x003d }
            r8.getClass()     // Catch:{ IllegalArgumentException -> 0x00ba, RuntimeException -> 0x003d }
            sq9 r19 = defpackage.o9a.k(r0)     // Catch:{ IllegalArgumentException -> 0x00ba, RuntimeException -> 0x003d }
            yn0 r8 = new yn0     // Catch:{ IllegalArgumentException -> 0x00ba, RuntimeException -> 0x003d }
            r13 = r8
            r13.<init>(r14, r15, r16, r17, r19)     // Catch:{ IllegalArgumentException -> 0x00ba, RuntimeException -> 0x003d }
            r6.release()     // Catch:{ all -> 0x008f }
            goto L_0x00ce
        L_0x008f:
            r0 = move-exception
            r6 = r0
            defpackage.z68.f(r2, r3, r6)
            goto L_0x00ce
        L_0x0095:
            r6.release()     // Catch:{ all -> 0x0099 }
            goto L_0x009e
        L_0x0099:
            r0 = move-exception
            r6 = r0
        L_0x009b:
            defpackage.z68.f(r2, r3, r6)
        L_0x009e:
            r8 = r4
            goto L_0x00ce
        L_0x00a0:
            r0 = move-exception
            r1 = r2
            goto L_0x003a
        L_0x00a3:
            r0 = move-exception
            r7 = r30
            r6 = r4
            goto L_0x00aa
        L_0x00a8:
            r6 = r4
            goto L_0x00ba
        L_0x00aa:
            java.lang.String r7 = r30.toString()     // Catch:{ all -> 0x0037 }
            defpackage.z68.f(r2, r7, r0)     // Catch:{ all -> 0x0037 }
            if (r6 == 0) goto L_0x009e
            r6.release()     // Catch:{ all -> 0x00b7 }
            goto L_0x009e
        L_0x00b7:
            r0 = move-exception
            r6 = r0
            goto L_0x009b
        L_0x00ba:
            java.lang.String r0 = "Could not get duration from video uri"
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ all -> 0x0209 }
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r5)     // Catch:{ all -> 0x0209 }
            defpackage.z68.n(r2, r4, r0, r7)     // Catch:{ all -> 0x0209 }
            if (r6 == 0) goto L_0x009e
            r6.release()     // Catch:{ all -> 0x00cb }
            goto L_0x009e
        L_0x00cb:
            r0 = move-exception
            r6 = r0
            goto L_0x009b
        L_0x00ce:
            if (r8 != 0) goto L_0x00d2
            goto L_0x0205
        L_0x00d2:
            java.lang.Object r0 = r8.e     // Catch:{ IOException -> 0x00e1, IllegalArgumentException -> 0x00df, all -> 0x00dd }
            sq9 r0 = (defpackage.sq9) r0     // Catch:{ IOException -> 0x00e1, IllegalArgumentException -> 0x00df, all -> 0x00dd }
            sq9 r3 = defpackage.sq9.VIDEO_MP4     // Catch:{ IOException -> 0x00e1, IllegalArgumentException -> 0x00df, all -> 0x00dd }
            if (r0 != r3) goto L_0x00e3
            java.lang.String r0 = "video/mp4v-es"
            goto L_0x00e5
        L_0x00dd:
            r0 = move-exception
            goto L_0x00ef
        L_0x00df:
            r0 = move-exception
            goto L_0x00f0
        L_0x00e1:
            r0 = move-exception
            goto L_0x00fe
        L_0x00e3:
            java.lang.String r0 = r0.a     // Catch:{ IOException -> 0x00e1, IllegalArgumentException -> 0x00df, all -> 0x00dd }
        L_0x00e5:
            android.media.MediaCodec r0 = android.media.MediaCodec.createDecoderByType(r0)     // Catch:{ IOException -> 0x00e1, IllegalArgumentException -> 0x00df, all -> 0x00dd }
            if (r0 == 0) goto L_0x0105
            r0.release()
            goto L_0x0105
        L_0x00ef:
            throw r0
        L_0x00f0:
            java.lang.String r1 = r0.getMessage()
            defpackage.z68.f(r2, r1, r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            goto L_0x0205
        L_0x00fe:
            java.lang.String r3 = r0.getMessage()
            defpackage.z68.b(r2, r3, r0)
        L_0x0105:
            int r0 = r8.a
            int r3 = r8.b
            qac r0 = b(r0, r3)
            int r3 = r8.c
            int r6 = r0.v
            if (r3 == 0) goto L_0x0114
            goto L_0x0115
        L_0x0114:
            r3 = r6
        L_0x0115:
            float r7 = (float) r3
            float r6 = (float) r6
            float r6 = r7 / r6
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            int r9 = r8.a
            float r10 = (float) r9
            int r11 = r8.b
            float r12 = (float) r11
            float r10 = r10 / r12
            r12 = 1065353216(0x3f800000, float:1.0)
            int r13 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r13 >= 0) goto L_0x0134
            float r10 = r12 / r10
            r8.a = r11
            r8.b = r9
            r17 = 1
            goto L_0x0136
        L_0x0134:
            r17 = r5
        L_0x0136:
            r18 = 1120403456(0x42c80000, float:100.0)
            float r10 = r10 * r18
            int r9 = java.lang.Math.round(r10)
            float r9 = (float) r9
            float r19 = r9 / r18
            qac[] r15 = defpackage.qac.values()
            int r13 = r15.length
        L_0x0146:
            if (r5 >= r13) goto L_0x01f8
            r10 = r15[r5]
            int r9 = r10.c
            int r11 = r10.v
            float r11 = (float) r11
            float r11 = r11 * r6
            int r11 = (int) r11
            float r12 = (float) r9
            int r4 = r10.o
            float r1 = (float) r4
            float r16 = r12 / r1
            float r16 = r16 * r18
            r30 = r6
            int r6 = java.lang.Math.round(r16)
            float r6 = (float) r6
            float r6 = r6 / r18
            r31 = r14
            r32 = r15
            long r14 = r8.d
            r16 = r13
            float r13 = (float) r14
            r28 = r2
            float r2 = (float) r11
            float r2 = r7 / r2
            float r13 = r13 / r2
            r20 = r14
            long r13 = (long) r13
            int r2 = r8.a
            if (r9 > r2) goto L_0x017c
            int r2 = r8.b
            if (r4 <= r2) goto L_0x0184
        L_0x017c:
            if (r10 == r0) goto L_0x0184
            int r2 = r10.b
            int r15 = r0.b
            if (r2 <= r15) goto L_0x01b0
        L_0x0184:
            int r2 = (r19 > r6 ? 1 : (r19 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x0189
            goto L_0x0192
        L_0x0189:
            if (r2 <= 0) goto L_0x018f
            float r12 = r12 / r19
            int r4 = (int) r12
            goto L_0x0192
        L_0x018f:
            float r1 = r1 * r19
            int r9 = (int) r1
        L_0x0192:
            if (r17 == 0) goto L_0x0199
            r22 = r4
            r23 = r9
            goto L_0x019d
        L_0x0199:
            r23 = r4
            r22 = r9
        L_0x019d:
            qac r1 = defpackage.qac.P_1080
            if (r10 == r1) goto L_0x01b8
            qac r1 = defpackage.qac.P_720
            if (r10 == r1) goto L_0x01b8
            qac r1 = defpackage.qac.P_480
            if (r10 == r1) goto L_0x01b8
            qac r1 = defpackage.qac.P_360
            if (r10 == r1) goto L_0x01b8
            if (r10 != r0) goto L_0x01b0
            goto L_0x01b8
        L_0x01b0:
            r6 = r31
            r29 = r32
            r4 = r16
            r1 = 0
            goto L_0x01e6
        L_0x01b8:
            if (r10 != r0) goto L_0x01d1
            rac r1 = new rac
            r2 = 1
            r9 = r1
            r11 = r22
            r12 = r23
            r4 = r16
            r13 = r3
            r6 = r31
            r29 = r32
            r14 = r20
            r16 = r2
            r9.<init>(r10, r11, r12, r13, r14, r16)
            goto L_0x01e6
        L_0x01d1:
            r6 = r31
            r29 = r32
            r4 = r16
            rac r1 = new rac
            r27 = 0
            r20 = r1
            r21 = r10
            r24 = r11
            r25 = r13
            r20.<init>(r21, r22, r23, r24, r25, r27)
        L_0x01e6:
            if (r1 == 0) goto L_0x01eb
            r6.add(r1)
        L_0x01eb:
            r1 = 1
            int r5 = r5 + r1
            r13 = r4
            r14 = r6
            r2 = r28
            r15 = r29
            r4 = 0
            r6 = r30
            goto L_0x0146
        L_0x01f8:
            r28 = r2
            r6 = r14
            java.lang.String r0 = r6.toString()
            r1 = r28
            defpackage.z68.c(r1, r0, new java.lang.Object[0])
            r4 = r6
        L_0x0205:
            return r4
        L_0x0206:
            r2 = r0
            r4 = r6
            goto L_0x020c
        L_0x0209:
            r0 = move-exception
            r1 = r2
            goto L_0x0206
        L_0x020c:
            if (r4 == 0) goto L_0x0217
            r4.release()     // Catch:{ all -> 0x0212 }
            goto L_0x0217
        L_0x0212:
            r0 = move-exception
            r4 = r0
            defpackage.z68.f(r1, r3, r4)
        L_0x0217:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sac.a(android.net.Uri, android.content.Context, wj0):java.util.ArrayList");
    }

    public static qac b(int i, int i2) {
        if (i2 > i) {
            int i3 = i2;
            i2 = i;
            i = i3;
        }
        for (qac qac : qac.values()) {
            if (qac.c == i && qac.o == i2) {
                return qac;
            }
        }
        for (qac qac2 : qac.values()) {
            if (qac2.o == i2) {
                return qac2;
            }
        }
        for (qac qac3 : qac.values()) {
            if (qac3.o == i) {
                return qac3;
            }
        }
        float f = (float) i;
        float f2 = f / ((float) i2);
        if (f2 > 1.7777778f) {
            for (qac qac4 : qac.values()) {
                if (qac4.c == i) {
                    return qac4;
                }
            }
            int i4 = (int) (f / 1.7777778f);
            qac qac5 = null;
            try {
                qac qac6 = null;
                int i5 = -1;
                for (qac qac7 : qac.values()) {
                    int abs = Math.abs(qac7.o - i4);
                    if (i5 == -1 || abs < i5) {
                        qac6 = qac7;
                        i5 = abs;
                    }
                }
                qac5 = qac6;
            } catch (NumberFormatException e) {
                z68.f("sac", "Can't parse quality", e);
            }
            if (qac5 != null) {
                return qac5;
            }
        } else {
            for (qac qac8 : qac.values()) {
                if (qac8.o == i2) {
                    return qac8;
                }
            }
        }
        if (f2 < 1.0f) {
            int i6 = i2;
            i2 = i;
            i = i6;
        }
        qac qac9 = qac.P_144;
        for (qac qac10 : qac.values()) {
            if (qac10.c <= i && qac10.o <= i2) {
                return qac10;
            }
        }
        return qac9;
    }
}
