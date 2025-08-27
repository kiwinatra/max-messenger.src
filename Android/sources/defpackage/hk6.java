package defpackage;

import android.hardware.Camera;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.LinkedList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: hk6  reason: default package */
public final class hk6 implements GLSurfaceView.Renderer, Camera.PreviewCallback {
    public static final float[] z0 = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
    public int X;
    public final LinkedList Y;
    public final LinkedList Z;
    public fk6 a;
    public final Object b = new Object();
    public int c = -1;
    public final FloatBuffer o;
    public final FloatBuffer v;
    public int v0;
    public IntBuffer w;
    public boolean w0;
    public int x;
    public boolean x0;
    public int y;
    public int y0 = 2;
    public int z;

    public hk6(fk6 fk6) {
        this.a = fk6;
        this.Y = new LinkedList();
        this.Z = new LinkedList();
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.o = asFloatBuffer;
        asFloatBuffer.put(z0).position(0);
        this.v = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.w0 = false;
        this.x0 = false;
        this.v0 = 1;
        b();
    }

    public static float a(float f, float f2) {
        return f == c44.DEFAULT_ASPECT_RATIO ? f2 : 1.0f - f2;
    }

    public static void c(LinkedList linkedList) {
        synchronized (linkedList) {
            while (!linkedList.isEmpty()) {
                try {
                    ((Runnable) linkedList.poll()).run();
                } finally {
                }
            }
        }
    }

    public final void b() {
        float f = (float) this.x;
        float f2 = (float) this.y;
        int i = this.v0;
        if (i == 4 || i == 2) {
            float f3 = f2;
            f2 = f;
            f = f3;
        }
        float max = Math.max(f / ((float) this.z), f2 / ((float) this.X));
        float round = ((float) Math.round(((float) this.z) * max)) / f;
        float round2 = ((float) Math.round(((float) this.X) * max)) / f2;
        float[] fArr = z0;
        int i2 = this.v0;
        boolean z2 = this.w0;
        boolean z3 = this.x0;
        int y2 = tr1.y(i2);
        float[] fArr2 = y2 != 1 ? y2 != 2 ? y2 != 3 ? cjf.c : cjf.f : cjf.e : cjf.d;
        if (z2) {
            fArr2 = new float[]{cjf.t(fArr2[0]), fArr2[1], cjf.t(fArr2[2]), fArr2[3], cjf.t(fArr2[4]), fArr2[5], cjf.t(fArr2[6]), fArr2[7]};
        }
        if (z3) {
            fArr2 = new float[]{fArr2[0], cjf.t(fArr2[1]), fArr2[2], cjf.t(fArr2[3]), fArr2[4], cjf.t(fArr2[5]), fArr2[6], cjf.t(fArr2[7])};
        }
        if (this.y0 == 2) {
            float f4 = (1.0f - (1.0f / round)) / 2.0f;
            float f5 = (1.0f - (1.0f / round2)) / 2.0f;
            fArr2 = new float[]{a(fArr2[0], f4), a(fArr2[1], f5), a(fArr2[2], f4), a(fArr2[3], f5), a(fArr2[4], f4), a(fArr2[5], f5), a(fArr2[6], f4), a(fArr2[7], f5)};
        } else {
            fArr = new float[]{fArr[0] / round2, fArr[1] / round, fArr[2] / round2, fArr[3] / round, fArr[4] / round2, fArr[5] / round, fArr[6] / round2, fArr[7] / round};
        }
        FloatBuffer floatBuffer = this.o;
        floatBuffer.clear();
        floatBuffer.put(fArr).position(0);
        FloatBuffer floatBuffer2 = this.v;
        floatBuffer2.clear();
        floatBuffer2.put(fArr2).position(0);
    }

    public final void d(Runnable runnable) {
        synchronized (this.Y) {
            this.Y.add(runnable);
        }
    }

    public final void onDrawFrame(GL10 gl10) {
        GLES20.glClear(16640);
        c(this.Y);
        fk6 fk6 = this.a;
        int i = this.c;
        FloatBuffer floatBuffer = this.o;
        FloatBuffer floatBuffer2 = this.v;
        GLES20.glUseProgram(fk6.d);
        synchronized (fk6.a) {
            while (!fk6.a.isEmpty()) {
                try {
                    ((Runnable) fk6.a.removeFirst()).run();
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
        if (fk6.h) {
            floatBuffer.position(0);
            GLES20.glVertexAttribPointer(fk6.e, 2, 5126, false, 0, floatBuffer);
            GLES20.glEnableVertexAttribArray(fk6.e);
            floatBuffer2.position(0);
            GLES20.glVertexAttribPointer(fk6.g, 2, 5126, false, 0, floatBuffer2);
            GLES20.glEnableVertexAttribArray(fk6.g);
            if (i != -1) {
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, i);
                GLES20.glUniform1i(fk6.f, 0);
            }
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(fk6.e);
            GLES20.glDisableVertexAttribArray(fk6.g);
            GLES20.glBindTexture(3553, 0);
        }
        c(this.Z);
    }

    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        Camera.Size previewSize = camera.getParameters().getPreviewSize();
        int i = previewSize.width;
        int i2 = previewSize.height;
        if (this.w == null) {
            this.w = IntBuffer.allocate(i * i2);
        }
        if (this.Y.isEmpty()) {
            d(new gk6(this, bArr, i, i2));
        }
    }

    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.x = i;
        this.y = i2;
        GLES20.glViewport(0, 0, i, i2);
        GLES20.glUseProgram(this.a.d);
        this.a.b(i, i2);
        b();
        synchronized (this.b) {
            this.b.notifyAll();
        }
    }

    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, 1.0f);
        GLES20.glDisable(2929);
        fk6 fk6 = this.a;
        if (!fk6.h) {
            fk6.a();
        }
    }
}
