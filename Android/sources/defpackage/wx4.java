package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;

/* renamed from: wx4  reason: default package */
public final class wx4 extends Surface {
    public static int o;
    public static boolean v;
    public final boolean a;
    public final vx4 b;
    public boolean c;

    public wx4(vx4 vx4, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.b = vx4;
        this.a = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        r5 = android.opengl.EGL14.eglQueryString(android.opengl.EGL14.eglGetDisplay(0), 12373);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(android.content.Context r5) {
        /*
            int r0 = defpackage.t0g.a
            r1 = 24
            r2 = 0
            if (r0 >= r1) goto L_0x0008
            goto L_0x005f
        L_0x0008:
            r1 = 26
            if (r0 >= r1) goto L_0x0021
            java.lang.String r3 = "samsung"
            java.lang.String r4 = defpackage.t0g.c
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x005f
            java.lang.String r3 = "XT1650"
            java.lang.String r4 = defpackage.t0g.d
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0021
            goto L_0x005f
        L_0x0021:
            if (r0 >= r1) goto L_0x0030
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            java.lang.String r1 = "android.hardware.vr.high_performance"
            boolean r5 = r5.hasSystemFeature(r1)
            if (r5 != 0) goto L_0x0030
            goto L_0x005f
        L_0x0030:
            android.opengl.EGLDisplay r5 = android.opengl.EGL14.eglGetDisplay(r2)
            r1 = 12373(0x3055, float:1.7338E-41)
            java.lang.String r5 = android.opengl.EGL14.eglQueryString(r5, r1)
            if (r5 == 0) goto L_0x005f
            java.lang.String r3 = "EGL_EXT_protected_content"
            boolean r5 = r5.contains(r3)
            if (r5 == 0) goto L_0x005f
            r5 = 17
            if (r0 >= r5) goto L_0x0049
            goto L_0x005d
        L_0x0049:
            android.opengl.EGLDisplay r5 = android.opengl.EGL14.eglGetDisplay(r2)
            java.lang.String r5 = android.opengl.EGL14.eglQueryString(r5, r1)
            if (r5 == 0) goto L_0x005d
            java.lang.String r0 = "EGL_KHR_surfaceless_context"
            boolean r5 = r5.contains(r0)
            if (r5 == 0) goto L_0x005d
            r5 = 1
            return r5
        L_0x005d:
            r5 = 2
            return r5
        L_0x005f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wx4.a(android.content.Context):int");
    }

    public static synchronized boolean b(Context context) {
        boolean z;
        synchronized (wx4.class) {
            try {
                z = true;
                if (!v) {
                    o = a(context);
                    v = true;
                }
                if (o == 0) {
                    z = false;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return z;
    }

    public static wx4 c(Context context, boolean z) {
        boolean z2 = false;
        y64.j(!z || b(context));
        vx4 vx4 = new vx4("ExoPlayer:DummySurface", 0);
        int i = z ? o : 0;
        vx4.start();
        Handler handler = new Handler(vx4.getLooper(), vx4);
        vx4.b = handler;
        vx4.v = new dz4(handler, 0);
        synchronized (vx4) {
            vx4.b.obtainMessage(1, i, 0).sendToTarget();
            while (((wx4) vx4.w) == null && vx4.o == null && vx4.c == null) {
                try {
                    vx4.wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = vx4.o;
        if (runtimeException == null) {
            Error error = vx4.c;
            if (error == null) {
                wx4 wx4 = (wx4) vx4.w;
                wx4.getClass();
                return wx4;
            }
            throw error;
        }
        throw runtimeException;
    }

    public final void release() {
        super.release();
        synchronized (this.b) {
            try {
                if (!this.c) {
                    vx4 vx4 = this.b;
                    vx4.b.getClass();
                    vx4.b.sendEmptyMessage(2);
                    this.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
