package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: nx4  reason: default package */
public final class nx4 extends nr4 {
    public int o = -1;
    public int p = -1;
    public final es7 q;
    public final es7 r;

    public nx4(es7 es7, es7 es72) {
        this.q = es7;
        this.r = es72;
    }

    public final ya0 m(vy4 vy4, Map map) {
        ya0 m = super.m(vy4, map);
        this.o = ck6.g();
        this.p = ck6.g();
        return m;
    }

    public final void u() {
        if (((AtomicBoolean) this.c).getAndSet(false)) {
            ck6.c((Thread) this.e);
            p();
        }
        this.o = -1;
        this.p = -1;
    }

    public final void v(long j, Surface surface, s3f s3f, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
        ck6.d((AtomicBoolean) this.c, true);
        ck6.c((Thread) this.e);
        HashMap hashMap = (HashMap) this.d;
        bs0.r("The surface is not registered.", hashMap.containsKey(surface));
        pb0 pb0 = (pb0) hashMap.get(surface);
        Objects.requireNonNull(pb0);
        if (pb0 == ck6.j) {
            pb0 = h(surface);
            if (pb0 != null) {
                hashMap.put(surface, pb0);
            } else {
                return;
            }
        }
        Surface surface2 = (Surface) this.k;
        EGLSurface eGLSurface = pb0.a;
        if (surface != surface2) {
            n(eGLSurface);
            this.k = surface;
        }
        GLES20.glClearColor(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, 1.0f);
        GLES20.glClear(16384);
        pb0 pb02 = pb0;
        s3f s3f2 = s3f;
        SurfaceTexture surfaceTexture3 = surfaceTexture;
        w(pb02, s3f2, surfaceTexture3, this.q, this.o);
        SurfaceTexture surfaceTexture4 = surfaceTexture2;
        w(pb02, s3f2, surfaceTexture4, this.r, this.p);
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.f, eGLSurface, j);
        if (!EGL14.eglSwapBuffers((EGLDisplay) this.f, eGLSurface)) {
            Integer.toHexString(EGL14.eglGetError());
            q(surface, false);
        }
    }

    public final void w(pb0 pb0, s3f s3f, SurfaceTexture surfaceTexture, es7 es7, int i) {
        pb0 pb02 = pb0;
        es7 es72 = es7;
        t(i);
        int i2 = pb02.b;
        int i3 = pb02.c;
        GLES20.glViewport(0, 0, i2, i3);
        GLES20.glScissor(0, 0, i2, i3);
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        Matrix.multiplyMM(fArr2, 0, fArr, 0, s3f.v, 0);
        ak6 ak6 = (ak6) this.m;
        ak6.getClass();
        if (ak6 instanceof bk6) {
            GLES20.glUniformMatrix4fv(((bk6) ak6).f, 1, false, fArr2, 0);
            ck6.b("glUniformMatrix4fv");
        }
        float f = es72.e;
        Size size = new Size((int) (((float) i2) * es72.d), (int) (((float) i3) * f));
        Size size2 = new Size(i2, i3);
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        float[] fArr5 = new float[16];
        Matrix.setIdentityM(fArr5, 0);
        Matrix.scaleM(fArr3, 0, ((float) size.getWidth()) / ((float) size2.getWidth()), ((float) size.getHeight()) / ((float) size2.getHeight()), 1.0f);
        Matrix.translateM(fArr4, 0, es72.b / es72.d, es72.c / f, c44.DEFAULT_ASPECT_RATIO);
        Matrix.multiplyMM(fArr5, 0, fArr3, 0, fArr4, 0);
        GLES20.glUniformMatrix4fv(ak6.b, 1, false, fArr5, 0);
        ck6.b("glUniformMatrix4fv");
        GLES20.glUniform1f(ak6.c, es72.a);
        ck6.b("glUniform1f");
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        ck6.b("glDrawArrays");
        GLES20.glDisable(3042);
    }
}
