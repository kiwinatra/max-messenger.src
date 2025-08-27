package defpackage;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;

/* renamed from: amf  reason: default package */
public final class amf extends qi0 {
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e4 A[LOOP:6: B:35:0x00e4->B:36:0x00e6, LOOP_START, PHI: r0 
      PHI: (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:14:0x003e, B:36:0x00e6] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(java.nio.ByteBuffer r12) {
        /*
            r11 = this;
            int r0 = r12.position()
            int r1 = r12.limit()
            int r2 = r1 - r0
            j60 r3 = r11.b
            int r3 = r3.c
            r4 = 4
            r5 = 3
            r6 = 1610612736(0x60000000, float:3.6893488E19)
            r7 = 1342177280(0x50000000, float:8.5899346E9)
            r8 = 268435456(0x10000000, float:2.5243549E-29)
            r9 = 22
            r10 = 21
            if (r3 == r5) goto L_0x0031
            if (r3 == r4) goto L_0x0034
            if (r3 == r10) goto L_0x002f
            if (r3 == r9) goto L_0x0034
            if (r3 == r8) goto L_0x0036
            if (r3 == r7) goto L_0x002f
            if (r3 != r6) goto L_0x0029
            goto L_0x0034
        L_0x0029:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>()
            throw r11
        L_0x002f:
            int r2 = r2 / 3
        L_0x0031:
            int r2 = r2 * 2
            goto L_0x0036
        L_0x0034:
            int r2 = r2 / 2
        L_0x0036:
            java.nio.ByteBuffer r2 = r11.k(r2)
            j60 r11 = r11.b
            int r11 = r11.c
            if (r11 == r5) goto L_0x00e4
            if (r11 == r4) goto L_0x00bf
            if (r11 == r10) goto L_0x00a8
            if (r11 == r9) goto L_0x0091
            if (r11 == r8) goto L_0x007c
            if (r11 == r7) goto L_0x0067
            if (r11 != r6) goto L_0x0061
        L_0x004c:
            if (r0 >= r1) goto L_0x00f9
            int r11 = r0 + 1
            byte r11 = r12.get(r11)
            r2.put(r11)
            byte r11 = r12.get(r0)
            r2.put(r11)
            int r0 = r0 + 4
            goto L_0x004c
        L_0x0061:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>()
            throw r11
        L_0x0067:
            if (r0 >= r1) goto L_0x00f9
            int r11 = r0 + 1
            byte r11 = r12.get(r11)
            r2.put(r11)
            byte r11 = r12.get(r0)
            r2.put(r11)
            int r0 = r0 + 3
            goto L_0x0067
        L_0x007c:
            if (r0 >= r1) goto L_0x00f9
            int r11 = r0 + 1
            byte r11 = r12.get(r11)
            r2.put(r11)
            byte r11 = r12.get(r0)
            r2.put(r11)
            int r0 = r0 + 2
            goto L_0x007c
        L_0x0091:
            if (r0 >= r1) goto L_0x00f9
            int r11 = r0 + 2
            byte r11 = r12.get(r11)
            r2.put(r11)
            int r11 = r0 + 3
            byte r11 = r12.get(r11)
            r2.put(r11)
            int r0 = r0 + 4
            goto L_0x0091
        L_0x00a8:
            if (r0 >= r1) goto L_0x00f9
            int r11 = r0 + 1
            byte r11 = r12.get(r11)
            r2.put(r11)
            int r11 = r0 + 2
            byte r11 = r12.get(r11)
            r2.put(r11)
            int r0 = r0 + 3
            goto L_0x00a8
        L_0x00bf:
            if (r0 >= r1) goto L_0x00f9
            float r11 = r12.getFloat(r0)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = 1065353216(0x3f800000, float:1.0)
            float r11 = defpackage.v0g.i(r11, r3, r4)
            r3 = 1191181824(0x46fffe00, float:32767.0)
            float r11 = r11 * r3
            int r11 = (int) r11
            short r11 = (short) r11
            r3 = r11 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r2.put(r3)
            int r11 = r11 >> 8
            r11 = r11 & 255(0xff, float:3.57E-43)
            byte r11 = (byte) r11
            r2.put(r11)
            int r0 = r0 + 4
            goto L_0x00bf
        L_0x00e4:
            if (r0 >= r1) goto L_0x00f9
            r11 = 0
            r2.put(r11)
            byte r11 = r12.get(r0)
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 + -128
            byte r11 = (byte) r11
            r2.put(r11)
            int r0 = r0 + 1
            goto L_0x00e4
        L_0x00f9:
            int r11 = r12.limit()
            r12.position(r11)
            r2.flip()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amf.b(java.nio.ByteBuffer):void");
    }

    public final j60 g(j60 j60) {
        int i = j60.c;
        if (i == 3 || i == 2 || i == 268435456 || i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4) {
            return i != 2 ? new j60(j60.a, j60.b, 2) : j60.e;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(j60);
    }
}
