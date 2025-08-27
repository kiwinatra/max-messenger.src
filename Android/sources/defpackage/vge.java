package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: vge  reason: default package */
public final class vge implements GLSurfaceView.Renderer, i5b {
    public final float[] X;
    public final /* synthetic */ wge Y;
    public final fed a;
    public final float[] b = new float[16];
    public final float[] c = new float[16];
    public final float[] o;
    public final float[] v;
    public final float[] w;
    public float x;
    public float y;
    public final float[] z;

    public vge(wge wge, fed fed) {
        this.Y = wge;
        float[] fArr = new float[16];
        this.o = fArr;
        float[] fArr2 = new float[16];
        this.v = fArr2;
        float[] fArr3 = new float[16];
        this.w = fArr3;
        this.z = new float[16];
        this.X = new float[16];
        this.a = fed;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.y = 3.1415927f;
    }

    public final synchronized void a(float[] fArr, float f) {
        float[] fArr2 = this.o;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        float f2 = -f;
        this.y = f2;
        Matrix.setRotateM(this.v, 0, -this.x, (float) Math.cos((double) f2), (float) Math.sin((double) this.y), c44.DEFAULT_ASPECT_RATIO);
    }

    /* JADX WARNING: type inference failed for: r4v12, types: [yy, java.lang.Object] */
    public final void onDrawFrame(GL10 gl10) {
        Object d;
        Object d2;
        Object d3;
        synchronized (this) {
            Matrix.multiplyMM(this.X, 0, this.o, 0, this.w, 0);
            Matrix.multiplyMM(this.z, 0, this.v, 0, this.X, 0);
        }
        Matrix.multiplyMM(this.c, 0, this.b, 0, this.z, 0);
        fed fed = this.a;
        float[] fArr = this.c;
        fed.getClass();
        GLES20.glClear(16384);
        cjf.f();
        if (fed.a.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = fed.X;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            cjf.f();
            if (fed.b.compareAndSet(true, false)) {
                Matrix.setIdentityM(fed.x, 0);
            }
            long timestamp = fed.X.getTimestamp();
            akf akf = fed.v;
            synchronized (akf) {
                d = akf.d(timestamp, false);
            }
            Long l = (Long) d;
            if (l != null) {
                lf6 lf6 = fed.o;
                float[] fArr2 = fed.x;
                long longValue = l.longValue();
                akf akf2 = (akf) lf6.v;
                synchronized (akf2) {
                    d3 = akf2.d(longValue, true);
                }
                float[] fArr3 = (float[]) d3;
                if (fArr3 != null) {
                    float f = fArr3[0];
                    float f2 = -fArr3[1];
                    float f3 = -fArr3[2];
                    float length = Matrix.length(f, f2, f3);
                    int i = (length > c44.DEFAULT_ASPECT_RATIO ? 1 : (length == c44.DEFAULT_ASPECT_RATIO ? 0 : -1));
                    float[] fArr4 = (float[]) lf6.o;
                    if (i != 0) {
                        Matrix.setRotateM(fArr4, 0, (float) Math.toDegrees((double) length), f / length, f2 / length, f3 / length);
                    } else {
                        Matrix.setIdentityM(fArr4, 0);
                    }
                    if (!lf6.b) {
                        lf6.e((float[]) lf6.c, (float[]) lf6.o);
                        lf6.b = true;
                    }
                    Matrix.multiplyMM(fArr2, 0, (float[]) lf6.c, 0, (float[]) lf6.o, 0);
                }
            }
            akf akf3 = fed.w;
            synchronized (akf3) {
                d2 = akf3.d(timestamp, true);
            }
            k8c k8c = (k8c) d2;
            if (k8c != null) {
                l8c l8c = fed.c;
                l8c.getClass();
                if (l8c.b(k8c)) {
                    l8c.a = k8c.c;
                    yy yyVar = k8c.a.a[0];
                    ? obj = new Object();
                    float[] fArr5 = (float[]) yyVar.c;
                    obj.a = fArr5.length / 3;
                    obj.c = (FloatBuffer) ByteBuffer.allocateDirect(fArr5.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr5).flip();
                    float[] fArr6 = (float[]) yyVar.o;
                    obj.o = (FloatBuffer) ByteBuffer.allocateDirect(fArr6.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr6).flip();
                    int i2 = yyVar.b;
                    if (i2 == 1) {
                        obj.b = 5;
                    } else if (i2 != 2) {
                        obj.b = 4;
                    } else {
                        obj.b = 6;
                    }
                    l8c.g = obj;
                    if (!k8c.d) {
                        yy yyVar2 = k8c.b.a[0];
                        float[] fArr7 = (float[]) yyVar2.c;
                        int length2 = fArr7.length;
                        FloatBuffer floatBuffer = (FloatBuffer) ByteBuffer.allocateDirect(fArr7.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr7).flip();
                        float[] fArr8 = (float[]) yyVar2.o;
                        FloatBuffer floatBuffer2 = (FloatBuffer) ByteBuffer.allocateDirect(fArr8.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr8).flip();
                    }
                }
            }
        }
        Matrix.multiplyMM(fed.y, 0, fArr, 0, fed.x, 0);
        l8c l8c2 = fed.c;
        int i3 = fed.z;
        float[] fArr9 = fed.y;
        yy yyVar3 = (yy) l8c2.g;
        if (yyVar3 != null) {
            int i4 = l8c2.a;
            GLES20.glUniformMatrix3fv(l8c2.c, 1, false, i4 == 1 ? l8c.j : i4 == 2 ? l8c.k : l8c.i, 0);
            GLES20.glUniformMatrix4fv(l8c2.b, 1, false, fArr9, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i3);
            GLES20.glUniform1i(l8c2.f, 0);
            cjf.f();
            GLES20.glVertexAttribPointer(l8c2.d, 3, 5126, false, 12, (FloatBuffer) yyVar3.c);
            cjf.f();
            GLES20.glVertexAttribPointer(l8c2.e, 2, 5126, false, 8, (FloatBuffer) yyVar3.o);
            cjf.f();
            GLES20.glDrawArrays(yyVar3.b, 0, yyVar3.a);
            cjf.f();
        }
    }

    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
        float f = ((float) i) / ((float) i2);
        Matrix.perspectiveM(this.b, 0, f > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f))) * 2.0d) : 90.0f, f, 0.1f, 100.0f);
    }

    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        wge wge = this.Y;
        wge.v.post(new s6e(4, wge, this.a.a()));
    }
}
