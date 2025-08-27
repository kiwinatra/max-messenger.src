package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;

/* renamed from: ak6  reason: default package */
public abstract class ak6 {
    public final int a;
    public int b = -1;
    public int c = -1;
    public int d = -1;

    /* JADX WARNING: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ak6(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.String r0 = "glAttachShader"
            java.lang.String r1 = "Could not link program: "
            r7.<init>()
            r2 = -1
            r7.b = r2
            r7.c = r2
            r7.d = r2
            r3 = 35633(0x8b31, float:4.9932E-41)
            int r8 = defpackage.ck6.j(r3, r8)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0067 }
            r3 = 35632(0x8b30, float:4.9931E-41)
            int r9 = defpackage.ck6.j(r3, r9)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0063 }
            int r3 = android.opengl.GLES20.glCreateProgram()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0060 }
            java.lang.String r4 = "glCreateProgram"
            defpackage.ck6.b(r4)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0048 }
            android.opengl.GLES20.glAttachShader(r3, r8)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0048 }
            defpackage.ck6.b(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0048 }
            android.opengl.GLES20.glAttachShader(r3, r9)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0048 }
            defpackage.ck6.b(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0048 }
            android.opengl.GLES20.glLinkProgram(r3)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0048 }
            r0 = 1
            int[] r4 = new int[r0]     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0048 }
            r5 = 35714(0x8b82, float:5.0046E-41)
            r6 = 0
            android.opengl.GLES20.glGetProgramiv(r3, r5, r4, r6)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0048 }
            r4 = r4[r6]     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0048 }
            if (r4 != r0) goto L_0x004a
            r7.a = r3     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0048 }
            r7.a()
            return
        L_0x0048:
            r7 = move-exception
            goto L_0x006b
        L_0x004a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0048 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0048 }
            r0.<init>(r1)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0048 }
            java.lang.String r1 = android.opengl.GLES20.glGetProgramInfoLog(r3)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0048 }
            r0.append(r1)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0048 }
            java.lang.String r0 = r0.toString()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0048 }
            r7.<init>(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0048 }
            throw r7     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0048 }
        L_0x0060:
            r7 = move-exception
            r3 = r2
            goto L_0x006b
        L_0x0063:
            r7 = move-exception
            r9 = r2
        L_0x0065:
            r3 = r9
            goto L_0x006b
        L_0x0067:
            r7 = move-exception
            r8 = r2
            r9 = r8
            goto L_0x0065
        L_0x006b:
            if (r8 == r2) goto L_0x0070
            android.opengl.GLES20.glDeleteShader(r8)
        L_0x0070:
            if (r9 == r2) goto L_0x0075
            android.opengl.GLES20.glDeleteShader(r9)
        L_0x0075:
            if (r3 == r2) goto L_0x007a
            android.opengl.GLES20.glDeleteProgram(r3)
        L_0x007a:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ak6.<init>(java.lang.String, java.lang.String):void");
    }

    public final void a() {
        int i = this.a;
        int glGetAttribLocation = GLES20.glGetAttribLocation(i, "aPosition");
        this.d = glGetAttribLocation;
        ck6.e(glGetAttribLocation, "aPosition");
        int glGetUniformLocation = GLES20.glGetUniformLocation(i, "uTransMatrix");
        this.b = glGetUniformLocation;
        ck6.e(glGetUniformLocation, "uTransMatrix");
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(i, "uAlphaScale");
        this.c = glGetUniformLocation2;
        ck6.e(glGetUniformLocation2, "uAlphaScale");
    }

    public void b() {
        GLES20.glUseProgram(this.a);
        ck6.b("glUseProgram");
        GLES20.glEnableVertexAttribArray(this.d);
        ck6.b("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.d, 2, 5126, false, 0, ck6.h);
        ck6.b("glVertexAttribPointer");
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        GLES20.glUniformMatrix4fv(this.b, 1, false, fArr, 0);
        ck6.b("glUniformMatrix4fv");
        GLES20.glUniform1f(this.c, 1.0f);
        ck6.b("glUniform1f");
    }
}
