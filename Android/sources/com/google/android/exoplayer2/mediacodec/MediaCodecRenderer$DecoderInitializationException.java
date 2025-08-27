package com.google.android.exoplayer2.mediacodec;

public class MediaCodecRenderer$DecoderInitializationException extends Exception {
    public final String a;
    public final boolean b;
    public final nn8 c;
    public final String o;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MediaCodecRenderer$DecoderInitializationException(defpackage.ca6 r11, com.google.android.exoplayer2.mediacodec.MediaCodecUtil$DecoderQueryException r12, boolean r13, int r14) {
        /*
            r10 = this;
            java.lang.String r0 = java.lang.String.valueOf(r11)
            int r1 = r0.length()
            int r1 = r1 + 36
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Decoder init failed: ["
            r2.append(r1)
            r2.append(r14)
            java.lang.String r1 = "], "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r4 = r2.toString()
            java.lang.String r6 = r11.Z
            if (r14 >= 0) goto L_0x002a
            java.lang.String r11 = "neg_"
            goto L_0x002c
        L_0x002a:
            java.lang.String r11 = ""
        L_0x002c:
            int r14 = java.lang.Math.abs(r14)
            int r0 = r11.length()
            int r0 = r0 + 71
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_"
            r1.append(r0)
            r1.append(r11)
            r1.append(r14)
            java.lang.String r9 = r1.toString()
            r8 = 0
            r3 = r10
            r5 = r12
            r7 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException.<init>(ca6, com.google.android.exoplayer2.mediacodec.MediaCodecUtil$DecoderQueryException, boolean, int):void");
    }

    public MediaCodecRenderer$DecoderInitializationException(String str, Throwable th, String str2, boolean z, nn8 nn8, String str3) {
        super(str, th);
        this.a = str2;
        this.b = z;
        this.c = nn8;
        this.o = str3;
    }
}
