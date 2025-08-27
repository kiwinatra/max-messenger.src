package defpackage;

import com.google.android.exoplayer2.audio.AudioProcessor$UnhandledAudioFormatException;

/* renamed from: o3d  reason: default package */
public final class o3d extends pi0 {
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ae A[LOOP:4: B:27:0x00ae->B:28:0x00b0, LOOP_START, PHI: r0 
      PHI: (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:12:0x0036, B:28:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(java.nio.ByteBuffer r10) {
        /*
            r9 = this;
            int r0 = r10.position()
            int r1 = r10.limit()
            int r2 = r1 - r0
            i60 r3 = r9.b
            int r3 = r3.c
            r4 = 4
            r5 = 3
            r6 = 805306368(0x30000000, float:4.656613E-10)
            r7 = 536870912(0x20000000, float:1.0842022E-19)
            r8 = 268435456(0x10000000, float:2.5243549E-29)
            if (r3 == r5) goto L_0x0029
            if (r3 == r4) goto L_0x002c
            if (r3 == r8) goto L_0x002e
            if (r3 == r7) goto L_0x0027
            if (r3 != r6) goto L_0x0021
            goto L_0x002c
        L_0x0021:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>()
            throw r9
        L_0x0027:
            int r2 = r2 / 3
        L_0x0029:
            int r2 = r2 * 2
            goto L_0x002e
        L_0x002c:
            int r2 = r2 / 2
        L_0x002e:
            java.nio.ByteBuffer r2 = r9.j(r2)
            i60 r9 = r9.b
            int r9 = r9.c
            if (r9 == r5) goto L_0x00ae
            if (r9 == r4) goto L_0x0089
            if (r9 == r8) goto L_0x0074
            if (r9 == r7) goto L_0x005d
            if (r9 != r6) goto L_0x0057
        L_0x0040:
            if (r0 >= r1) goto L_0x00c3
            int r9 = r0 + 2
            byte r9 = r10.get(r9)
            r2.put(r9)
            int r9 = r0 + 3
            byte r9 = r10.get(r9)
            r2.put(r9)
            int r0 = r0 + 4
            goto L_0x0040
        L_0x0057:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>()
            throw r9
        L_0x005d:
            if (r0 >= r1) goto L_0x00c3
            int r9 = r0 + 1
            byte r9 = r10.get(r9)
            r2.put(r9)
            int r9 = r0 + 2
            byte r9 = r10.get(r9)
            r2.put(r9)
            int r0 = r0 + 3
            goto L_0x005d
        L_0x0074:
            if (r0 >= r1) goto L_0x00c3
            int r9 = r0 + 1
            byte r9 = r10.get(r9)
            r2.put(r9)
            byte r9 = r10.get(r0)
            r2.put(r9)
            int r0 = r0 + 2
            goto L_0x0074
        L_0x0089:
            if (r0 >= r1) goto L_0x00c3
            float r9 = r10.getFloat(r0)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = 1065353216(0x3f800000, float:1.0)
            float r9 = defpackage.t0g.i(r9, r3, r4)
            r3 = 1191181824(0x46fffe00, float:32767.0)
            float r9 = r9 * r3
            int r9 = (int) r9
            short r9 = (short) r9
            r3 = r9 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r2.put(r3)
            int r9 = r9 >> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            r2.put(r9)
            int r0 = r0 + 4
            goto L_0x0089
        L_0x00ae:
            if (r0 >= r1) goto L_0x00c3
            r9 = 0
            r2.put(r9)
            byte r9 = r10.get(r0)
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 + -128
            byte r9 = (byte) r9
            r2.put(r9)
            int r0 = r0 + 1
            goto L_0x00ae
        L_0x00c3:
            int r9 = r10.limit()
            r10.position(r9)
            r2.flip()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o3d.b(java.nio.ByteBuffer):void");
    }

    public final i60 f(i60 i60) {
        int i = i60.c;
        if (i == 3 || i == 2 || i == 268435456 || i == 536870912 || i == 805306368 || i == 4) {
            return i != 2 ? new i60(i60.a, i60.b, 2) : i60.e;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(i60);
    }
}
