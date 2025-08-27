package defpackage;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import ru.ok.android.webrtc.opengl.CallOpenGLContext$CallOpenGLContextNotInitialized;

/* renamed from: bn7  reason: default package */
public final class bn7 extends Lambda implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bn7(int i, Object obj) {
        super(1);
        this.a = i;
        this.b = obj;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) obj;
                cn7 cn7 = (cn7) this.b;
                if (th == null) {
                    if (!cn7.a.isDone()) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                } else if (th instanceof CancellationException) {
                    cn7.a.cancel(true);
                } else {
                    cyd cyd = cn7.a;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    cyd.k(th);
                }
                return Unit.INSTANCE;
            case 1:
                return obj == ((gha) this.b) ? "(this)" : String.valueOf(obj);
            case 2:
                cvb cvb = cvb.f;
                cvb.d = (uv1) obj;
                hd8.w((Context) this.b);
                return cvb;
            case 3:
                Void voidR = (Void) obj;
                return ((uv1) this.b).j;
            case 4:
                return obj == ((ced) this.b) ? "(this)" : String.valueOf(obj);
            default:
                ld1 ld1 = (ld1) obj;
                EGLSurface eGLSurface = ((in1) this.b).a;
                if (eGLSurface != null) {
                    ld1.getClass();
                    if (eGLSurface != EGL14.EGL_NO_SURFACE) {
                        EGLDisplay eGLDisplay = ld1.e;
                        if (eGLDisplay != null) {
                            ld1.b(eGLSurface);
                            GLES20.glClearColor(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO);
                            GLES20.glClear(16384);
                            EGL14.eglSwapBuffers(eGLDisplay, eGLSurface);
                            ld1.a("clearImage()");
                        } else {
                            throw new CallOpenGLContext$CallOpenGLContextNotInitialized();
                        }
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
