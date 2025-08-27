package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import java.nio.IntBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: fed  reason: default package */
public final class fed implements q5g, yu1 {
    public SurfaceTexture X;
    public volatile int Y = 0;
    public int Z = -1;
    public final AtomicBoolean a = new AtomicBoolean();
    public final AtomicBoolean b = new AtomicBoolean(true);
    public final l8c c = new Object();
    public final lf6 o = new lf6(4);
    public final akf v = new akf(0);
    public byte[] v0;
    public final akf w = new akf(0);
    public final float[] x = new float[16];
    public final float[] y = new float[16];
    public int z;

    public final SurfaceTexture a() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        cjf.f();
        l8c l8c = this.c;
        l8c.getClass();
        mqf mqf = new mqf();
        l8c.h = mqf;
        l8c.b = GLES20.glGetUniformLocation(mqf.b, "uMvpMatrix");
        l8c.c = GLES20.glGetUniformLocation(((mqf) l8c.h).b, "uTexMatrix");
        int glGetAttribLocation = GLES20.glGetAttribLocation(((mqf) l8c.h).b, "aPosition");
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        cjf.f();
        l8c.d = glGetAttribLocation;
        int glGetAttribLocation2 = GLES20.glGetAttribLocation(((mqf) l8c.h).b, "aTexCoords");
        GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
        cjf.f();
        l8c.e = glGetAttribLocation2;
        l8c.f = GLES20.glGetUniformLocation(((mqf) l8c.h).b, "uTexture");
        cjf.f();
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, IntBuffer.wrap(iArr));
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        cjf.f();
        this.z = iArr[0];
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.z);
        this.X = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new eed(0, this));
        return this.X;
    }

    public final void b(long j, float[] fArr) {
        ((akf) this.o.v).a(j, fArr);
    }

    public final void c() {
        this.v.b();
        lf6 lf6 = this.o;
        ((akf) lf6.v).b();
        lf6.b = false;
        this.b.set(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0074, code lost:
        r9.G(r11);
        r3 = defpackage.m58.H(r9);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(long r33, long r35, defpackage.ca6 r37, android.media.MediaFormat r38) {
        /*
            r32 = this;
            r0 = r32
            r1 = r35
            r3 = r37
            akf r4 = r0.v
            java.lang.Long r5 = java.lang.Long.valueOf(r33)
            r4.a(r1, r5)
            byte[] r4 = r3.E0
            int r3 = r3.F0
            byte[] r5 = r0.v0
            int r6 = r0.Z
            r0.v0 = r4
            r4 = -1
            if (r3 != r4) goto L_0x001e
            int r3 = r0.Y
        L_0x001e:
            r0.Z = r3
            if (r6 != r3) goto L_0x002c
            byte[] r3 = r0.v0
            boolean r3 = java.util.Arrays.equals(r5, r3)
            if (r3 == 0) goto L_0x002c
            goto L_0x01f3
        L_0x002c:
            byte[] r3 = r0.v0
            r4 = 2
            r5 = 1
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x00ab
            int r8 = r0.Z
            g1g r9 = new g1g
            r9.<init>((byte[]) r3)
            r3 = 4
            r9.I(r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0081 }
            int r3 = r9.h()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0081 }
            r9.H(r6)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0081 }
            r10 = 1886547818(0x70726f6a, float:3.0012025E29)
            if (r3 != r10) goto L_0x007c
            r3 = 8
            r9.I(r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0081 }
            int r3 = r9.b     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0081 }
            int r10 = r9.c     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0081 }
        L_0x0054:
            if (r3 >= r10) goto L_0x0081
            int r11 = r9.h()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0081 }
            int r11 = r11 + r3
            if (r11 <= r3) goto L_0x0081
            if (r11 <= r10) goto L_0x0060
            goto L_0x0081
        L_0x0060:
            int r3 = r9.h()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0081 }
            r12 = 2037673328(0x79746d70, float:7.9321256E34)
            if (r3 == r12) goto L_0x0074
            r12 = 1836279920(0x6d736870, float:4.7081947E27)
            if (r3 != r12) goto L_0x006f
            goto L_0x0074
        L_0x006f:
            r9.H(r11)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0081 }
            r3 = r11
            goto L_0x0054
        L_0x0074:
            r9.G(r11)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0081 }
            java.util.ArrayList r3 = defpackage.m58.H(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0081 }
            goto L_0x0082
        L_0x007c:
            java.util.ArrayList r3 = defpackage.m58.H(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0081 }
            goto L_0x0082
        L_0x0081:
            r3 = r7
        L_0x0082:
            if (r3 != 0) goto L_0x0085
            goto L_0x00ab
        L_0x0085:
            int r9 = r3.size()
            if (r9 == r5) goto L_0x00a0
            if (r9 == r4) goto L_0x008e
            goto L_0x00ab
        L_0x008e:
            k8c r7 = new k8c
            java.lang.Object r9 = r3.get(r6)
            j8c r9 = (defpackage.j8c) r9
            java.lang.Object r3 = r3.get(r5)
            j8c r3 = (defpackage.j8c) r3
            r7.<init>(r9, r3, r8)
            goto L_0x00ab
        L_0x00a0:
            k8c r7 = new k8c
            java.lang.Object r3 = r3.get(r6)
            j8c r3 = (defpackage.j8c) r3
            r7.<init>(r3, r3, r8)
        L_0x00ab:
            if (r7 == 0) goto L_0x00b5
            boolean r3 = defpackage.l8c.b(r7)
            if (r3 == 0) goto L_0x00b5
            goto L_0x01ec
        L_0x00b5:
            int r3 = r0.Z
            r7 = 1127481344(0x43340000, float:180.0)
            double r7 = (double) r7
            double r7 = java.lang.Math.toRadians(r7)
            float r7 = (float) r7
            r8 = 1135869952(0x43b40000, float:360.0)
            double r8 = (double) r8
            double r8 = java.lang.Math.toRadians(r8)
            float r8 = (float) r8
            r9 = 36
            float r10 = (float) r9
            float r10 = r7 / r10
            r11 = 72
            float r12 = (float) r11
            float r12 = r8 / r12
            r13 = 15984(0x3e70, float:2.2398E-41)
            float[] r13 = new float[r13]
            r14 = 10656(0x29a0, float:1.4932E-41)
            float[] r14 = new float[r14]
            r15 = r6
            r16 = r15
            r17 = r16
        L_0x00de:
            if (r15 >= r9) goto L_0x01d2
            float r9 = (float) r15
            float r9 = r9 * r10
            r18 = 1073741824(0x40000000, float:2.0)
            float r19 = r7 / r18
            float r9 = r9 - r19
            int r6 = r15 + 1
            float r5 = (float) r6
            float r5 = r5 * r10
            float r5 = r5 - r19
            r11 = 0
        L_0x00ef:
            r4 = 73
            if (r11 >= r4) goto L_0x01c3
            r20 = r5
            r21 = r6
            r22 = r9
            r4 = r16
            r5 = r17
            r6 = 2
            r9 = 0
        L_0x00ff:
            if (r9 >= r6) goto L_0x01a3
            if (r9 != 0) goto L_0x0106
            r6 = r22
            goto L_0x0108
        L_0x0106:
            r6 = r20
        L_0x0108:
            float r1 = (float) r11
            float r1 = r1 * r12
            r2 = 1078530011(0x40490fdb, float:3.1415927)
            float r2 = r2 + r1
            float r16 = r8 / r18
            float r2 = r2 - r16
            int r16 = r4 + 1
            r23 = r12
            r12 = 1112014848(0x42480000, float:50.0)
            r24 = r11
            double r11 = (double) r12
            r25 = r3
            double r2 = (double) r2
            double r26 = java.lang.Math.sin(r2)
            double r26 = r26 * r11
            r28 = r7
            double r6 = (double) r6
            double r29 = java.lang.Math.cos(r6)
            r17 = r9
            r31 = r10
            double r9 = r29 * r26
            float r9 = (float) r9
            float r9 = -r9
            r13[r4] = r9
            int r9 = r4 + 2
            double r26 = java.lang.Math.sin(r6)
            r10 = r14
            r29 = r15
            double r14 = r26 * r11
            float r14 = (float) r14
            r13[r16] = r14
            int r14 = r4 + 3
            double r2 = java.lang.Math.cos(r2)
            double r2 = r2 * r11
            double r6 = java.lang.Math.cos(r6)
            double r6 = r6 * r2
            float r2 = (float) r6
            r13[r9] = r2
            int r2 = r5 + 1
            float r1 = r1 / r8
            r10[r5] = r1
            int r1 = r5 + 2
            int r15 = r29 + r17
            float r3 = (float) r15
            float r3 = r3 * r31
            float r3 = r3 / r28
            r10[r2] = r3
            if (r24 != 0) goto L_0x0166
            if (r17 == 0) goto L_0x016b
        L_0x0166:
            r3 = r24
            r2 = 72
            goto L_0x0172
        L_0x016b:
            r7 = r17
            r3 = r24
            r2 = 72
            goto L_0x0179
        L_0x0172:
            if (r3 != r2) goto L_0x018a
            r7 = r17
            r6 = 1
            if (r7 != r6) goto L_0x0187
        L_0x0179:
            r6 = 3
            java.lang.System.arraycopy(r13, r4, r13, r14, r6)
            int r4 = r4 + 6
            r9 = r10
            r6 = 2
            java.lang.System.arraycopy(r9, r5, r9, r1, r6)
            int r5 = r5 + 4
            goto L_0x0190
        L_0x0187:
            r9 = r10
        L_0x0188:
            r6 = 2
            goto L_0x018e
        L_0x018a:
            r9 = r10
            r7 = r17
            goto L_0x0188
        L_0x018e:
            r5 = r1
            r4 = r14
        L_0x0190:
            int r1 = r7 + 1
            r11 = r3
            r14 = r9
            r12 = r23
            r3 = r25
            r7 = r28
            r15 = r29
            r10 = r31
            r9 = r1
            r1 = r35
            goto L_0x00ff
        L_0x01a3:
            r25 = r3
            r28 = r7
            r31 = r10
            r3 = r11
            r23 = r12
            r9 = r14
            r29 = r15
            r2 = 72
            int r11 = r3 + 1
            r1 = r35
            r16 = r4
            r17 = r5
            r5 = r20
            r6 = r21
            r9 = r22
            r3 = r25
            goto L_0x00ef
        L_0x01c3:
            r21 = r6
            r1 = r35
            r15 = r21
            r4 = 2
            r5 = 1
            r6 = 0
            r9 = 36
            r11 = 72
            goto L_0x00de
        L_0x01d2:
            r25 = r3
            r9 = r14
            yy r1 = new yy
            r2 = 1
            r3 = 0
            r1.<init>(r3, r13, r9, r2)
            k8c r7 = new k8c
            j8c r2 = new j8c
            yy[] r1 = new defpackage.yy[]{r1}
            r2.<init>(r1)
            r1 = r25
            r7.<init>(r2, r2, r1)
        L_0x01ec:
            akf r0 = r0.w
            r1 = r35
            r0.a(r1, r7)
        L_0x01f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fed.d(long, long, ca6, android.media.MediaFormat):void");
    }
}
