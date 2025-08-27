package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: khf  reason: default package */
public final class khf {
    public final FloatBuffer a;
    public final float[] b = new float[16];
    public final float[] c;
    public final float[] d;
    public final float[] e;
    public final float[] f;
    public final float[] g;
    public float[] h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public final int o;
    public final int p;
    public final int q;
    public final float r;
    public final float s;
    public final float t;
    public final float u;
    public final boolean v;
    public final boolean w;

    public khf(float f2, boolean z) {
        float[] fArr = new float[16];
        this.c = fArr;
        this.d = new float[16];
        this.e = new float[16];
        this.f = new float[16];
        this.g = new float[16];
        this.h = new float[16];
        this.j = -12345;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 1.0f;
        this.s = f2;
        this.t = c44.DEFAULT_ASPECT_RATIO;
        this.u = c44.DEFAULT_ASPECT_RATIO;
        this.v = false;
        this.w = z;
        float[] fArr2 = {-1.0f, -1.0f, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, 1.0f, -1.0f, c44.DEFAULT_ASPECT_RATIO, 1.0f, c44.DEFAULT_ASPECT_RATIO, -1.0f, 1.0f, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, 1.0f, 1.0f, 1.0f, c44.DEFAULT_ASPECT_RATIO, 1.0f, 1.0f};
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(80).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.a = asFloatBuffer;
        asFloatBuffer.put(fArr2).position(0);
        Matrix.setIdentityM(fArr, 0);
    }

    public static void a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            throw new RuntimeException(str + ": glError " + glGetError);
        }
    }

    public static int c(int i2, String str) {
        int glCreateShader = GLES20.glCreateShader(i2);
        a("glCreateShader type=" + i2);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        GLES20.glGetShaderInfoLog(glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public final void b(SurfaceTexture surfaceTexture, int i2) {
        SurfaceTexture surfaceTexture2 = surfaceTexture;
        a("onDrawFrame start");
        int i3 = this.p;
        int i4 = this.o;
        boolean z = this.v;
        if (z) {
            GLES20.glViewport(0, 0, i4, i3);
        }
        float[] fArr = this.c;
        if (surfaceTexture2 != null) {
            surfaceTexture2.getTransformMatrix(fArr);
        }
        if (this.w) {
            GLES20.glClearColor(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, 1.0f);
            GLES20.glClear(16640);
        }
        GLES20.glUseProgram(this.i);
        a("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(i2, this.j);
        FloatBuffer floatBuffer = this.a;
        floatBuffer.position(0);
        GLES20.glVertexAttribPointer(this.m, 3, 5126, false, 20, this.a);
        a("glVertexAttribPointer maPosition");
        GLES20.glEnableVertexAttribArray(this.m);
        a("glEnableVertexAttribArray maPositionHandle");
        floatBuffer.position(3);
        GLES20.glVertexAttribPointer(this.n, 2, 5126, false, 20, this.a);
        a("glVertexAttribPointer maTextureHandle");
        GLES20.glEnableVertexAttribArray(this.n);
        a("glEnableVertexAttribArray maTextureHandle");
        float[] fArr2 = this.b;
        Matrix.setIdentityM(fArr2, 0);
        float f2 = this.r;
        int i5 = this.q;
        float f3 = this.s;
        if (z) {
            float[] fArr3 = this.d;
            Matrix.setIdentityM(fArr3, 0);
            float[] fArr4 = this.f;
            Matrix.setIdentityM(fArr4, 0);
            Matrix.setIdentityM(this.e, 0);
            float[] fArr5 = this.g;
            Matrix.setIdentityM(fArr5, 0);
            Matrix.setIdentityM(this.h, 0);
            float f4 = ((float) i4) / ((float) i3);
            Matrix.orthoM(this.b, 0, -f4, f4, -1.0f, 1.0f, -1.0f, 1.0f);
            Matrix.translateM(fArr5, 0, this.t, this.u, c44.DEFAULT_ASPECT_RATIO);
            float[] fArr6 = (float[]) fArr3.clone();
            this.h = fArr6;
            Matrix.multiplyMM(this.d, 0, fArr6, 0, this.g, 0);
            Matrix.setRotateM(this.e, 0, (float) i5, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, -1.0f);
            float[] fArr7 = (float[]) fArr3.clone();
            this.h = fArr7;
            Matrix.multiplyMM(this.d, 0, fArr7, 0, this.e, 0);
            Matrix.scaleM(fArr4, 0, f2, f3, 1.0f);
            float[] fArr8 = (float[]) fArr3.clone();
            this.h = fArr8;
            Matrix.multiplyMM(this.d, 0, fArr8, 0, this.f, 0);
            float[] fArr9 = (float[]) fArr2.clone();
            this.h = fArr9;
            Matrix.multiplyMM(this.b, 0, fArr9, 0, this.d, 0);
        } else {
            if (i5 != 0) {
                Matrix.setRotateM(this.b, 0, (float) i5, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, -1.0f);
            }
            if (!(f2 == 1.0f && f3 == 1.0f)) {
                Matrix.scaleM(fArr2, 0, f2, f3, 1.0f);
            }
        }
        GLES20.glUniformMatrix4fv(this.k, 1, false, fArr2, 0);
        GLES20.glUniformMatrix4fv(this.l, 1, false, fArr, 0);
        GLES20.glDrawArrays(5, 0, 4);
        a("glDrawArrays");
        GLES20.glFinish();
    }
}
