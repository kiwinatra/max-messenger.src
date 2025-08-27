package defpackage;

/* renamed from: x09  reason: default package */
public final class x09 extends y09 {
    public final long e;
    public final long f;
    public final int g;
    public final String h;
    public final int i;
    public final int j;
    public final int k;
    public final String l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final boolean s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x09(long j2, long j3, s09 s09, Object obj, long j4, long j5, int i2, String str, int i3, int i4, int i5, String str2, int i6, int i7, int i8, int i9, int i10, int i11, boolean z) {
        super(j2, j3, s09, obj);
        this.e = j4;
        this.f = j5;
        this.g = i2;
        this.h = str;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.l = str2;
        this.m = i6;
        this.n = i7;
        this.o = i8;
        this.p = i9;
        this.q = i10;
        this.r = i11;
        this.s = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r40 = this;
            r0 = r40
            long r1 = r0.a
            long r3 = r0.b
            long r5 = r3 - r1
            float r5 = (float) r5
            r6 = 1148846080(0x447a0000, float:1000.0)
            float r5 = r5 / r6
            java.lang.String r7 = "yyyy-MM-dd kk:mm:ss"
            java.lang.CharSequence r1 = android.text.format.DateFormat.format(r7, r1)
            java.lang.CharSequence r2 = android.text.format.DateFormat.format(r7, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "["
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = ", "
            r3.append(r1)
            r3.append(r2)
            java.lang.String r2 = "]"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r1)
            r3.append(r5)
            java.lang.String r2 = " s"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.Object r3 = r0.d
            z09 r3 = (defpackage.z09) r3
            java.util.concurrent.atomic.AtomicReference r4 = r3.b
            java.lang.Object r4 = r4.get()
            hq8 r4 = (defpackage.hq8) r4
            long r7 = r0.a
            long r9 = r3.a
            long r9 = r9 - r7
            float r3 = (float) r9
            float r3 = r3 / r6
            java.lang.String r7 = "?"
            if (r4 == 0) goto L_0x006b
            boolean r8 = r4.b
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            java.lang.String r8 = r8.toString()
            if (r8 != 0) goto L_0x006c
        L_0x006b:
            r8 = r7
        L_0x006c:
            r9 = 1232348160(0x49742400, float:1000000.0)
            r10 = 0
            if (r4 == 0) goto L_0x008b
            long r11 = r4.a
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L_0x007f
            r11 = r4
            goto L_0x0080
        L_0x007f:
            r11 = r10
        L_0x0080:
            if (r11 == 0) goto L_0x008b
            long r11 = r11.a
            float r11 = (float) r11
            float r11 = r11 / r9
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            goto L_0x008c
        L_0x008b:
            r11 = r10
        L_0x008c:
            if (r4 == 0) goto L_0x0098
            ea6[] r12 = r4.c
            if (r12 == 0) goto L_0x0098
            int r12 = r12.length
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0099
        L_0x0098:
            r12 = r7
        L_0x0099:
            if (r4 == 0) goto L_0x00a5
            ea6[] r13 = r4.d
            if (r13 == 0) goto L_0x00a5
            int r13 = r13.length
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            goto L_0x00a6
        L_0x00a5:
            r13 = r7
        L_0x00a6:
            if (r4 == 0) goto L_0x00b2
            ea6[] r4 = r4.e
            if (r4 == 0) goto L_0x00b2
            int r4 = r4.length
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x00b3
        L_0x00b2:
            r4 = r7
        L_0x00b3:
            long r14 = r0.e
            float r14 = (float) r14
            float r14 = r14 / r6
            r15 = 0
            int r16 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r16 != 0) goto L_0x00c0
            r17 = r7
            r6 = r15
            goto L_0x00c9
        L_0x00c0:
            r17 = r7
            long r6 = r0.f
            float r6 = (float) r6
            r7 = 1149239296(0x44800000, float:1024.0)
            float r7 = r7 * r5
            float r6 = r6 / r7
        L_0x00c9:
            r7 = 1
            if (r11 == 0) goto L_0x00e7
            if (r16 != 0) goto L_0x00d1
            r16 = r7
            goto L_0x00d3
        L_0x00d1:
            r16 = 0
        L_0x00d3:
            r16 = r16 ^ 1
            if (r16 == 0) goto L_0x00da
            r16 = r11
            goto L_0x00dc
        L_0x00da:
            r16 = r10
        L_0x00dc:
            if (r16 == 0) goto L_0x00e7
            float r10 = r16.floatValue()
            float r10 = r10 / r5
            java.lang.Float r10 = java.lang.Float.valueOf(r10)
        L_0x00e7:
            s09 r5 = r0.c
            android.net.Uri r15 = r5.b
            if (r11 != 0) goto L_0x00ef
            r11 = r17
        L_0x00ef:
            java.lang.String r7 = r5.c
            boolean r9 = r5.j
            r19 = r6
            boolean r6 = r5.k
            r20 = r14
            boolean r14 = r5.i
            r21 = r2
            int r2 = r5.d
            r22 = r1
            int r1 = r5.e
            r23 = r1
            int r1 = r5.f
            float r1 = (float) r1
            r18 = 1232348160(0x49742400, float:1000000.0)
            float r1 = r1 / r18
            r24 = r1
            float r1 = r5.g
            float r5 = r5.h
            r26 = r1
            r25 = r2
            long r1 = r0.f
            r27 = r1
            int r1 = r0.g
            java.lang.String r2 = r0.h
            if (r2 != 0) goto L_0x0124
            r29 = r17
            goto L_0x0126
        L_0x0124:
            r29 = r2
        L_0x0126:
            int r2 = r0.i
            r30 = r2
            int r2 = r0.j
            r31 = r2
            int r2 = r0.k
            float r2 = (float) r2
            r16 = 1148846080(0x447a0000, float:1000.0)
            float r2 = r2 / r16
            r16 = r2
            java.lang.String r2 = r0.l
            if (r2 != 0) goto L_0x013e
            r32 = r17
            goto L_0x0140
        L_0x013e:
            r32 = r2
        L_0x0140:
            int r2 = r0.q
            r33 = r2
            int r2 = r0.m
            r34 = r2
            int r2 = r0.n
            r35 = r2
            int r2 = r0.o
            float r2 = (float) r2
            r18 = 1232348160(0x49742400, float:1000000.0)
            float r2 = r2 / r18
            r18 = r2
            int r2 = r0.r
            r36 = r1
            java.lang.String r1 = "?("
            r37 = r5
            java.lang.String r5 = ")"
            if (r2 == 0) goto L_0x0187
            r38 = r14
            r14 = 1
            if (r2 == r14) goto L_0x0180
            r14 = 2
            if (r2 == r14) goto L_0x0179
            r14 = 3
            if (r2 == r14) goto L_0x0172
            java.lang.String r2 = defpackage.a81.j(r2, r1, r5)
            goto L_0x018f
        L_0x0172:
            java.lang.String r14 = "exp_HDR-as-SDR("
            java.lang.String r2 = defpackage.a81.j(r2, r14, r5)
            goto L_0x018f
        L_0x0179:
            java.lang.String r14 = "HDR-to-SDR_gl("
            java.lang.String r2 = defpackage.a81.j(r2, r14, r5)
            goto L_0x018f
        L_0x0180:
            java.lang.String r14 = "HDR-to-SDR_mc("
            java.lang.String r2 = defpackage.a81.j(r2, r14, r5)
            goto L_0x018f
        L_0x0187:
            r38 = r14
            java.lang.String r14 = "Keep-HDR("
            java.lang.String r2 = defpackage.a81.j(r2, r14, r5)
        L_0x018f:
            int r14 = r0.p
            if (r14 == 0) goto L_0x01b8
            r39 = r2
            r2 = 1
            if (r14 == r2) goto L_0x01b1
            r2 = 2
            if (r14 == r2) goto L_0x01aa
            r2 = 3
            if (r14 == r2) goto L_0x01a3
            java.lang.String r1 = defpackage.a81.j(r14, r1, r5)
            goto L_0x01c0
        L_0x01a3:
            java.lang.String r1 = "CBR-FD("
            java.lang.String r1 = defpackage.a81.j(r14, r1, r5)
            goto L_0x01c0
        L_0x01aa:
            java.lang.String r1 = "CBR("
            java.lang.String r1 = defpackage.a81.j(r14, r1, r5)
            goto L_0x01c0
        L_0x01b1:
            java.lang.String r1 = "VBR("
            java.lang.String r1 = defpackage.a81.j(r14, r1, r5)
            goto L_0x01c0
        L_0x01b8:
            r39 = r2
            java.lang.String r1 = "CQ("
            java.lang.String r1 = defpackage.a81.j(r14, r1, r5)
        L_0x01c0:
            boolean r0 = r0.s
            if (r10 != 0) goto L_0x01c6
            r10 = r17
        L_0x01c6:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "\n            MediaTransformResult.Success(\n              in={\n                  uri="
            r2.<init>(r5)
            r2.append(r15)
            java.lang.String r5 = "\n                  MediaInfo(\n                      took="
            r2.append(r5)
            r2.append(r3)
            java.lang.String r3 = " s\n                      duration="
            r2.append(r3)
            r2.append(r11)
            java.lang.String r3 = " s\n                      hdr="
            r2.append(r3)
            r2.append(r8)
            java.lang.String r3 = "\n                      video_tracks="
            r2.append(r3)
            r2.append(r12)
            java.lang.String r3 = "\n                      audio_tracks="
            r2.append(r3)
            r2.append(r13)
            java.lang.String r3 = "\n                      other_tracks="
            r2.append(r3)
            r2.append(r4)
            java.lang.String r3 = "\n                  )\n              }\n              out="
            r2.append(r3)
            r2.append(r7)
            java.lang.String r3 = "\n              request={\n                  settings={\n                      hdr_allowed="
            r2.append(r3)
            r2.append(r9)
            java.lang.String r3 = "\n                      hevc_allowed="
            r2.append(r3)
            r2.append(r6)
            java.lang.String r3 = "\n                      ping_delay=500 ms\n                      stuck_delay=300000 ms\n                  }\n                  mute="
            r2.append(r3)
            r3 = r38
            r2.append(r3)
            java.lang.String r3 = "\n                  video_size="
            r2.append(r3)
            r3 = r25
            r2.append(r3)
            java.lang.String r3 = "x"
            r2.append(r3)
            r4 = r23
            r2.append(r4)
            java.lang.String r4 = "\n                  video_bitrate="
            r2.append(r4)
            r4 = r24
            r2.append(r4)
            java.lang.String r4 = " Mbps\n                  position_range=["
            r2.append(r4)
            r4 = r26
            r2.append(r4)
            r4 = r22
            r2.append(r4)
            r4 = r37
            r2.append(r4)
            java.lang.String r4 = "]\n              }\n              took="
            r2.append(r4)
            r4 = r21
            r2.append(r4)
            java.lang.String r4 = "\n              out={\n                  duration="
            r2.append(r4)
            r14 = r20
            r2.append(r14)
            java.lang.String r4 = " s\n                  file_size="
            r2.append(r4)
            r4 = r27
            r2.append(r4)
            java.lang.String r4 = " bytes\n                  optimization="
            r2.append(r4)
            r4 = r36
            r2.append(r4)
            java.lang.String r4 = "\n                  audio={\n                      encoder="
            r2.append(r4)
            r4 = r29
            r2.append(r4)
            java.lang.String r4 = "\n                      channels="
            r2.append(r4)
            r4 = r30
            r2.append(r4)
            java.lang.String r4 = "\n                      sample_rate="
            r2.append(r4)
            r4 = r31
            r2.append(r4)
            java.lang.String r4 = "\n                      bitrate="
            r2.append(r4)
            r5 = r16
            r2.append(r5)
            java.lang.String r5 = " Kbps\n                  }\n                  video={\n                      encoder="
            r2.append(r5)
            r5 = r32
            r2.append(r5)
            java.lang.String r5 = "\n                      frames="
            r2.append(r5)
            r5 = r33
            r2.append(r5)
            java.lang.String r5 = "\n                      size="
            r2.append(r5)
            r5 = r34
            r2.append(r5)
            r2.append(r3)
            r3 = r35
            r2.append(r3)
            r2.append(r4)
            r3 = r18
            r2.append(r3)
            java.lang.String r3 = " Mbps\n                      hdr_mode="
            r2.append(r3)
            r3 = r39
            r2.append(r3)
            java.lang.String r3 = "\n                      bitrate_mode="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "\n                      hdr="
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = "\n                  }\n              }\n              transform_speed="
            r2.append(r0)
            r15 = r19
            r2.append(r15)
            java.lang.String r0 = " Mbytes/s\n              transform_speed="
            r2.append(r0)
            r2.append(r10)
            java.lang.String r0 = " s/s\n            )\n        "
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = kotlin.text.StringsKt.trimIndent(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x09.toString():java.lang.String");
    }
}
