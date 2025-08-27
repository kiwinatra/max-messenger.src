package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import androidx.media3.common.util.GlUtil$GlException;

/* renamed from: uj4  reason: default package */
public final /* synthetic */ class uj4 implements t5g {
    public final /* synthetic */ int a;
    public final /* synthetic */ zj4 b;

    public /* synthetic */ uj4(zj4 zj4, int i) {
        this.a = i;
        this.b = zj4;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                zj4 zj4 = this.b;
                zj4.getClass();
                EGLDisplay H = ld8.H();
                zj4.m = H;
                int[] iArr = ld8.c;
                yr6 yr6 = zj4.c;
                zj4.n = yr6.r(yr6.h(H, 2, iArr), zj4.m);
                return;
            case 1:
                zj4 zj42 = this.b;
                yr6 yr62 = zj42.c;
                try {
                    d19 d19 = zj42.e;
                    d19.getClass();
                    try {
                        bs6 bs6 = (bs6) d19.c;
                        if (bs6 != null) {
                            GLES20.glDeleteProgram(bs6.a);
                            ld8.h();
                        }
                    } catch (GlUtil$GlException e) {
                        i8b.p("Error releasing GL Program", e);
                    }
                    zj42.i.d();
                    EGLDisplay eGLDisplay = zj42.m;
                    EGLSurface eGLSurface = zj42.n;
                    if (eGLDisplay != null) {
                        if (eGLSurface != null) {
                            EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                            ld8.g("Error destroying surface");
                        }
                    }
                    try {
                        EGLDisplay eGLDisplay2 = zj42.m;
                        eGLDisplay2.getClass();
                        yr62.z(eGLDisplay2);
                        return;
                    } catch (GlUtil$GlException e2) {
                        i8b.p("Error releasing GL objects", e2);
                        return;
                    }
                } catch (GlUtil$GlException e3) {
                    i8b.p("Error releasing GL resources", e3);
                    EGLDisplay eGLDisplay3 = zj42.m;
                    eGLDisplay3.getClass();
                    yr62.z(eGLDisplay3);
                    return;
                } catch (Throwable th) {
                    try {
                        EGLDisplay eGLDisplay4 = zj42.m;
                        eGLDisplay4.getClass();
                        yr62.z(eGLDisplay4);
                    } catch (GlUtil$GlException e4) {
                        i8b.p("Error releasing GL objects", e4);
                    }
                    throw th;
                }
            default:
                this.b.b();
                return;
        }
    }
}
