package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.CancellationSignal;
import android.view.Surface;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.ok.android.webrtc.opengl.CallOpenGLContext$CallOpenGLContextGLException;

/* renamed from: o14  reason: default package */
public final class o14 extends Lambda implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o14(int i, Object obj, Object obj2) {
        super(1);
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke(Object obj) {
        EGLDisplay eGLDisplay;
        EGLConfig eGLConfig;
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) obj;
                CancellationSignal cancellationSignal = (CancellationSignal) this.b;
                if (cancellationSignal != null) {
                    cancellationSignal.cancel();
                }
                ((pm7) this.c).b((CancellationException) null);
                return Unit.INSTANCE;
            case 1:
                cae cae = (cae) obj;
                yj1 yj1 = (yj1) this.b;
                boolean a2 = yj1.b.a.a();
                zwd zwd = (zwd) this.c;
                ef1 ef1 = yj1.b;
                if (a2 || Intrinsics.areEqual((Object) ef1.k, (Object) zwd)) {
                    ef1.g(zwd, cae.a.a);
                    for (we1 we1 : cae.a.b) {
                        yj1.e.n.onStateChanged(we1.b, we1);
                    }
                }
                return Unit.INSTANCE;
            default:
                ld1 ld1 = (ld1) obj;
                md1 md1 = (md1) this.b;
                ld1.e(md1.a);
                Surface surface = (Surface) this.c;
                EGLSurface eGLSurface = null;
                if (!(!surface.isValid() || (eGLDisplay = ld1.e) == null || (eGLConfig = ld1.f) == null)) {
                    eGLSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, new int[]{12344}, 0);
                    if (eGLSurface != EGL14.EGL_NO_SURFACE) {
                        ld1.b(eGLSurface);
                        GLES20.glPixelStorei(3317, 1);
                        ld1.a.log(ld1.j, wj6.h(ld1.l.incrementAndGet(), "Surface created, total count is "));
                    } else {
                        throw new CallOpenGLContext$CallOpenGLContextGLException(EGL14.eglGetError(), "createSurface()");
                    }
                }
                md1.a = eGLSurface;
                return Unit.INSTANCE;
        }
    }
}
