package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* renamed from: dz4  reason: default package */
public final class dz4 implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static final int[] y = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    public static final int[] z = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    public final /* synthetic */ int a;
    public final Handler b;
    public final int[] c;
    public EGLDisplay o;
    public EGLContext v;
    public EGLSurface w;
    public SurfaceTexture x;

    public dz4(Handler handler, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = handler;
                this.c = new int[1];
                return;
            default:
                this.b = handler;
                this.c = new int[1];
                return;
        }
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                this.b.post(this);
                return;
            default:
                this.b.post(this);
                return;
        }
    }

    public final void run() {
        switch (this.a) {
            case 0:
                SurfaceTexture surfaceTexture = this.x;
                if (surfaceTexture != null) {
                    try {
                        surfaceTexture.updateTexImage();
                        return;
                    } catch (RuntimeException unused) {
                        return;
                    }
                } else {
                    return;
                }
            default:
                SurfaceTexture surfaceTexture2 = this.x;
                if (surfaceTexture2 != null) {
                    try {
                        surfaceTexture2.updateTexImage();
                        return;
                    } catch (RuntimeException unused2) {
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}
